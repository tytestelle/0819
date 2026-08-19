package androidx.media3.exoplayer.dash.manifest;

import O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.UriUtil;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.XmlPullParserUtil;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.extractor.mp4.PsshAtomUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.common.base.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import com.google.common.base.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O;
import com.google.common.collect.O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class DashManifestParser extends DefaultHandler implements ParsingLoadable.Parser<DashManifest> {
    private static final String TAG = "MpdParser";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern FRAME_RATE_PATTERN = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final Pattern CEA_608_ACCESSIBILITY_PATTERN = Pattern.compile("CC([1-4])=.*");
    private static final Pattern CEA_708_ACCESSIBILITY_PATTERN = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private static final int[] DOLBY_AC4_CHANNEL_CONFIGURATION_MAPPING = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    private static final int[] MPEG_CHANNEL_CONFIGURATION_MAPPING = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    public static final class RepresentationInfo {
        public final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O baseUrls;
        public final ArrayList<DrmInitData.SchemeData> drmSchemeDatas;

        @Nullable
        public final String drmSchemeType;
        public final List<Descriptor> essentialProperties;
        public final Format format;
        public final ArrayList<Descriptor> inbandEventStreams;
        public final long revisionId;
        public final SegmentBase segmentBase;
        public final List<Descriptor> supplementalProperties;

        public RepresentationInfo(Format format, List<BaseUrl> list, SegmentBase segmentBase, @Nullable String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<Descriptor> arrayList2, List<Descriptor> list2, List<Descriptor> list3, long j) {
            this.format = format;
            this.baseUrls = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.copyOf((Collection) list);
            this.segmentBase = segmentBase;
            this.drmSchemeType = str;
            this.drmSchemeDatas = arrayList;
            this.inbandEventStreams = arrayList2;
            this.essentialProperties = list2;
            this.supplementalProperties = list3;
            this.revisionId = j;
        }
    }

    public DashManifestParser() {
        try {
            this.xmlParserFactory = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private long addSegmentTimelineElementsToList(List<SegmentBase.SegmentTimelineElement> list, long j, long j2, int i, long j3) {
        int iCeilDivide = i >= 0 ? i + 1 : (int) Util.ceilDivide(j3 - j, j2);
        for (int i2 = 0; i2 < iCeilDivide; i2++) {
            list.add(buildSegmentTimelineElement(j, j2));
            j += j2;
        }
        return j;
    }

    private static int checkContentTypeConsistency(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        Assertions.checkState(i == i2);
        return i;
    }

    @Nullable
    private static String checkLanguageConsistency(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        Assertions.checkState(str.equals(str2));
        return str;
    }

    private static void fillInClearKeyInformation(ArrayList<DrmInitData.SchemeData> arrayList) {
        String str;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                str = null;
                break;
            }
            DrmInitData.SchemeData schemeData = arrayList.get(i);
            if (C.CLEARKEY_UUID.equals(schemeData.uuid) && (str = schemeData.licenseServerUrl) != null) {
                arrayList.remove(i);
                break;
            }
            i++;
        }
        if (str == null) {
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            DrmInitData.SchemeData schemeData2 = arrayList.get(i2);
            if (C.COMMON_PSSH_UUID.equals(schemeData2.uuid) && schemeData2.licenseServerUrl == null) {
                arrayList.set(i2, new DrmInitData.SchemeData(C.CLEARKEY_UUID, str, schemeData2.mimeType, schemeData2.data));
            }
        }
    }

    private static void filterRedundantIncompleteSchemeDatas(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.hasData()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).canReplace(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                }
            }
        }
    }

    private static long getFinalAvailabilityTimeOffset(long j, long j2) {
        if (j2 != C.TIME_UNSET) {
            j = j2;
        }
        return j == Long.MAX_VALUE ? C.TIME_UNSET : j;
    }

    @Nullable
    private static String getSampleMimeType(@Nullable String str, @Nullable String str2) {
        if (MimeTypes.isAudio(str)) {
            return MimeTypes.getAudioMediaMimeType(str2);
        }
        if (MimeTypes.isVideo(str)) {
            return MimeTypes.getVideoMediaMimeType(str2);
        }
        if (MimeTypes.isText(str) || MimeTypes.isImage(str)) {
            return str;
        }
        if (!MimeTypes.APPLICATION_MP4.equals(str)) {
            return null;
        }
        String mediaMimeType = MimeTypes.getMediaMimeType(str2);
        return MimeTypes.TEXT_VTT.equals(mediaMimeType) ? MimeTypes.APPLICATION_MP4VTT : mediaMimeType;
    }

    private boolean isDvbProfileDeclared(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public static void maybeSkipTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
                    i++;
                } else if (XmlPullParserUtil.isEndTag(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    public static int parseCea608AccessibilityChannel(List<Descriptor> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri) && (str = descriptor.value) != null) {
                Matcher matcher = CEA_608_ACCESSIBILITY_PATTERN.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                Log.w(TAG, "Unable to parse CEA-608 channel number from: " + descriptor.value);
            }
        }
        return -1;
    }

    public static int parseCea708AccessibilityChannel(List<Descriptor> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri) && (str = descriptor.value) != null) {
                Matcher matcher = CEA_708_ACCESSIBILITY_PATTERN.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                Log.w(TAG, "Unable to parse CEA-708 service block number from: " + descriptor.value);
            }
        }
        return -1;
    }

    public static long parseDateTime(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Util.parseXsDateTime(attributeValue);
    }

    public static Descriptor parseDescriptor(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String string = parseString(xmlPullParser, "schemeIdUri", "");
        String string2 = parseString(xmlPullParser, "value", null);
        String string3 = parseString(xmlPullParser, TtmlNode.ATTR_ID, null);
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return new Descriptor(string, string2, string3);
    }

    public static int parseDolbyAC4ChannelConfiguration(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || attributeValue.length() != 6) {
            return -1;
        }
        int i = Integer.parseInt(attributeValue, 16);
        return (8388608 & i) != 0 ? parseDolbyAc4ObjectBasedChannelConfiguration(str) : parseDolbyAc4ChannelBasedChannelConfiguration(i);
    }

    private static int parseDolbyAc4ChannelBasedChannelConfiguration(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = DOLBY_AC4_CHANNEL_CONFIGURATION_MAPPING;
            if (i2 >= iArr.length) {
                break;
            }
            i3 += ((i >> i2) & 1) * iArr[i2];
            i2++;
        }
        if (i3 == 0) {
            return -1;
        }
        return i3;
    }

    private static int parseDolbyAc4ObjectBasedChannelConfiguration(String str) {
        String[] strArrSplitCodecs = Util.splitCodecs(str);
        if (strArrSplitCodecs.length == 0) {
            return -1;
        }
        List listO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0('.'), 10)).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(strArrSplitCodecs[0].trim()));
        if (listO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size() != 4 || !((String) listO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(0)).equals("ac-4")) {
            return -1;
        }
        String str2 = (String) listO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(3);
        str2.getClass();
        if (str2.equals("03")) {
            return 18;
        }
        return !str2.equals("04") ? -1 : 21;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public static int parseDolbyChannelConfiguration(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(attributeValue);
        strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.getClass();
        switch (strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o) {
            case "4000":
                return 1;
            case "a000":
                return 2;
            case "f800":
                return 5;
            case "f801":
                return 6;
            case "fa01":
                return 8;
            default:
                return -1;
        }
    }

    public static int parseDtsChannelConfiguration(XmlPullParser xmlPullParser) {
        int i = parseInt(xmlPullParser, "value", -1);
        if (i <= 0 || i >= 33) {
            return -1;
        }
        return i;
    }

    public static int parseDtsxChannelConfiguration(XmlPullParser xmlPullParser) {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return iBitCount;
    }

    public static long parseDuration(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Util.parseXsDuration(attributeValue);
    }

    public static String parseEac3SupplementalProperties(List<Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            String str = descriptor.schemeIdUri;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(descriptor.value)) {
                return MimeTypes.AUDIO_E_AC3_JOC;
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && MimeTypes.CODEC_E_AC3_JOC.equals(descriptor.value)) {
                return MimeTypes.AUDIO_E_AC3_JOC;
            }
        }
        return MimeTypes.AUDIO_E_AC3;
    }

    public static float parseFloat(XmlPullParser xmlPullParser, String str, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f : Float.parseFloat(attributeValue);
    }

    public static float parseFrameRate(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = FRAME_RATE_PATTERN.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int i = Integer.parseInt(matcher.group(1));
        String strGroup = matcher.group(2);
        return !TextUtils.isEmpty(strGroup) ? i / Integer.parseInt(strGroup) : i;
    }

    public static int parseInt(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    public static long parseLastSegmentNumberSupplementalProperty(List<Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("http://dashif.org/guidelines/last-segment-number", descriptor.schemeIdUri)) {
                return Long.parseLong(descriptor.value);
            }
        }
        return -1L;
    }

    public static long parseLong(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    public static int parseMpegChannelConfiguration(XmlPullParser xmlPullParser) {
        int i = parseInt(xmlPullParser, "value", -1);
        if (i < 0) {
            return -1;
        }
        int[] iArr = MPEG_CHANNEL_CONFIGURATION_MAPPING;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    public static String parseString(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    public static String parseText(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return text;
    }

    public AdaptationSet buildAdaptationSet(long j, int i, List<Representation> list, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4) {
        return new AdaptationSet(j, i, list, list2, list3, list4);
    }

    public EventMessage buildEvent(String str, String str2, long j, long j2, byte[] bArr) {
        return new EventMessage(str, str2, j2, j, bArr);
    }

    public EventStream buildEventStream(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new EventStream(str, str2, j, jArr, eventMessageArr);
    }

    public Format buildFormat(@Nullable String str, @Nullable String str2, int i, int i2, float f, int i3, int i4, int i5, @Nullable String str3, List<Descriptor> list, List<Descriptor> list2, @Nullable String str4, @Nullable String str5, @Nullable String str6, List<Descriptor> list3, List<Descriptor> list4) {
        String str7 = str5;
        String str8 = str4;
        String sampleMimeType = getSampleMimeType(str2, str8);
        if (MimeTypes.AUDIO_E_AC3.equals(sampleMimeType)) {
            sampleMimeType = parseEac3SupplementalProperties(list4);
            if (MimeTypes.AUDIO_E_AC3_JOC.equals(sampleMimeType)) {
                str8 = MimeTypes.CODEC_E_AC3_JOC;
            }
        }
        if (MimeTypes.isDolbyVisionCodec(str8, str7)) {
            if (str7 == null) {
                str7 = str8;
            }
            sampleMimeType = MimeTypes.VIDEO_DOLBY_VISION;
            str8 = str7;
        }
        int selectionFlagsFromRoleDescriptors = parseSelectionFlagsFromRoleDescriptors(list);
        int roleFlagsFromRoleDescriptors = parseRoleFlagsFromRoleDescriptors(list) | parseRoleFlagsFromAccessibilityDescriptors(list2) | parseRoleFlagsFromProperties(list3) | parseRoleFlagsFromProperties(list4);
        Pair<Integer, Integer> tileCountFromProperties = parseTileCountFromProperties(list3);
        Format.Builder language = new Format.Builder().setId(str).setContainerMimeType(str2).setSampleMimeType(sampleMimeType).setCodecs(str8).setPeakBitrate(i5).setSelectionFlags(selectionFlagsFromRoleDescriptors).setRoleFlags(roleFlagsFromRoleDescriptors).setLanguage(str3);
        int cea708AccessibilityChannel = -1;
        Format.Builder tileCountVertical = language.setTileCountHorizontal(tileCountFromProperties != null ? ((Integer) tileCountFromProperties.first).intValue() : -1).setTileCountVertical(tileCountFromProperties != null ? ((Integer) tileCountFromProperties.second).intValue() : -1);
        if (MimeTypes.isVideo(sampleMimeType)) {
            tileCountVertical.setWidth(i).setHeight(i2).setFrameRate(f);
        } else if (MimeTypes.isAudio(sampleMimeType)) {
            tileCountVertical.setChannelCount(i3).setSampleRate(i4);
        } else if (MimeTypes.isText(sampleMimeType)) {
            if (MimeTypes.APPLICATION_CEA608.equals(sampleMimeType)) {
                cea708AccessibilityChannel = parseCea608AccessibilityChannel(list2);
            } else if (MimeTypes.APPLICATION_CEA708.equals(sampleMimeType)) {
                cea708AccessibilityChannel = parseCea708AccessibilityChannel(list2);
            }
            tileCountVertical.setAccessibilityChannel(cea708AccessibilityChannel);
        } else if (MimeTypes.isImage(sampleMimeType)) {
            tileCountVertical.setWidth(i).setHeight(i2);
        }
        return tileCountVertical.build();
    }

    public DashManifest buildMediaPresentationDescription(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, @Nullable ProgramInformation programInformation, @Nullable UtcTimingElement utcTimingElement, @Nullable ServiceDescriptionElement serviceDescriptionElement, @Nullable Uri uri, List<Period> list) {
        return new DashManifest(j, j2, j3, z, j4, j5, j6, j7, programInformation, utcTimingElement, serviceDescriptionElement, uri, list);
    }

    public Period buildPeriod(@Nullable String str, long j, List<AdaptationSet> list, List<EventStream> list2, @Nullable Descriptor descriptor) {
        return new Period(str, j, list, list2, descriptor);
    }

    public RangedUri buildRangedUri(String str, long j, long j2) {
        return new RangedUri(str, j, j2);
    }

    public Representation buildRepresentation(RepresentationInfo representationInfo, @Nullable String str, List<Label> list, @Nullable String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<Descriptor> arrayList2) {
        Format.Builder builderBuildUpon = representationInfo.format.buildUpon();
        if (str == null || !list.isEmpty()) {
            builderBuildUpon.setLabels(list);
        } else {
            builderBuildUpon.setLabel(str);
        }
        String str3 = representationInfo.drmSchemeType;
        if (str3 == null) {
            str3 = str2;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = representationInfo.drmSchemeDatas;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            fillInClearKeyInformation(arrayList3);
            filterRedundantIncompleteSchemeDatas(arrayList3);
            builderBuildUpon.setDrmInitData(new DrmInitData(str3, arrayList3));
        }
        ArrayList<Descriptor> arrayList4 = representationInfo.inbandEventStreams;
        arrayList4.addAll(arrayList2);
        return Representation.newInstance(representationInfo.revisionId, builderBuildUpon.build(), representationInfo.baseUrls, representationInfo.segmentBase, arrayList4, representationInfo.essentialProperties, representationInfo.supplementalProperties, null);
    }

    public SegmentBase.SegmentList buildSegmentList(RangedUri rangedUri, long j, long j2, long j3, long j4, @Nullable List<SegmentBase.SegmentTimelineElement> list, long j5, @Nullable List<RangedUri> list2, long j6, long j7) {
        return new SegmentBase.SegmentList(rangedUri, j, j2, j3, j4, list, j5, list2, Util.msToUs(j6), Util.msToUs(j7));
    }

    public SegmentBase.SegmentTemplate buildSegmentTemplate(RangedUri rangedUri, long j, long j2, long j3, long j4, long j5, List<SegmentBase.SegmentTimelineElement> list, long j6, @Nullable UrlTemplate urlTemplate, @Nullable UrlTemplate urlTemplate2, long j7, long j8) {
        return new SegmentBase.SegmentTemplate(rangedUri, j, j2, j3, j4, j5, list, j6, urlTemplate, urlTemplate2, Util.msToUs(j7), Util.msToUs(j8));
    }

    public SegmentBase.SegmentTimelineElement buildSegmentTimelineElement(long j, long j2) {
        return new SegmentBase.SegmentTimelineElement(j, j2);
    }

    public SegmentBase.SingleSegmentBase buildSingleSegmentBase(RangedUri rangedUri, long j, long j2, long j3, long j4) {
        return new SegmentBase.SingleSegmentBase(rangedUri, j, j2, j3, j4);
    }

    public UtcTimingElement buildUtcTimingElement(String str, String str2) {
        return new UtcTimingElement(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0361 A[LOOP:0: B:3:0x008d->B:76:0x0361, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0320 A[EDGE_INSN: B:77:0x0320->B:70:0x0320 BREAK  A[LOOP:0: B:3:0x008d->B:76:0x0361], SYNTHETIC] */
    public AdaptationSet parseAdaptationSet(XmlPullParser xmlPullParser, List<BaseUrl> list, @Nullable SegmentBase segmentBase, long j, long j2, long j3, long j4, long j5, boolean z) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        Object obj;
        String str;
        ArrayList arrayList2;
        ArrayList<Descriptor> arrayList3;
        long j6;
        long j7;
        int i;
        ArrayList<Descriptor> arrayList4;
        long availabilityTimeOffsetUs;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long j8 = parseLong(xmlPullParser2, TtmlNode.ATTR_ID, -1L);
        int contentType = parseContentType(xmlPullParser);
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "scte214:supplementalCodecs");
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, "scte214:supplementalProfiles");
        int i2 = parseInt(xmlPullParser2, "width", -1);
        int i3 = parseInt(xmlPullParser2, "height", -1);
        float frameRate = parseFrameRate(xmlPullParser2, -1.0f);
        int i4 = parseInt(xmlPullParser2, "audioSamplingRate", -1);
        String str2 = "lang";
        String attributeValue5 = xmlPullParser2.getAttributeValue(null, "lang");
        String attributeValue6 = xmlPullParser2.getAttributeValue(null, "label");
        ArrayList arrayList5 = new ArrayList();
        ArrayList<DrmInitData.SchemeData> arrayList6 = new ArrayList<>();
        ArrayList<Descriptor> arrayList7 = new ArrayList<>();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        SegmentBase segmentTemplate = segmentBase;
        ArrayList arrayList14 = arrayList5;
        int audioChannelConfiguration = -1;
        boolean z2 = false;
        String str3 = null;
        String str4 = attributeValue5;
        long availabilityTimeOffsetUs2 = j2;
        long j9 = j3;
        while (true) {
            xmlPullParser.next();
            arrayList = arrayList12;
            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "BaseURL")) {
                if (!z2) {
                    availabilityTimeOffsetUs2 = parseAvailabilityTimeOffsetUs(xmlPullParser2, availabilityTimeOffsetUs2);
                    z2 = true;
                }
                arrayList13.addAll(parseBaseUrl(xmlPullParser2, list, z));
                availabilityTimeOffsetUs2 = availabilityTimeOffsetUs2;
                arrayList4 = arrayList7;
            } else {
                long j10 = availabilityTimeOffsetUs2;
                ArrayList<Descriptor> arrayList15 = arrayList7;
                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "ContentProtection")) {
                    Pair<String, DrmInitData.SchemeData> contentProtection = parseContentProtection(xmlPullParser);
                    Object obj2 = contentProtection.first;
                    if (obj2 != null) {
                        str3 = (String) obj2;
                    }
                    Object obj3 = contentProtection.second;
                    if (obj3 != null) {
                        arrayList6.add((DrmInitData.SchemeData) obj3);
                    }
                    arrayList4 = arrayList15;
                    availabilityTimeOffsetUs2 = j10;
                } else {
                    if (XmlPullParserUtil.isStartTag(xmlPullParser2, "ContentComponent")) {
                        obj = null;
                        String strCheckLanguageConsistency = checkLanguageConsistency(str4, xmlPullParser2.getAttributeValue(null, str2));
                        contentType = checkContentTypeConsistency(contentType, parseContentType(xmlPullParser));
                        str4 = strCheckLanguageConsistency;
                    } else {
                        obj = null;
                        if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Role")) {
                            arrayList9.add(parseDescriptor(xmlPullParser2, "Role"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "AudioChannelConfiguration")) {
                            audioChannelConfiguration = parseAudioChannelConfiguration(xmlPullParser2, attributeValue2);
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Accessibility")) {
                            arrayList8.add(parseDescriptor(xmlPullParser2, "Accessibility"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "EssentialProperty")) {
                            arrayList10.add(parseDescriptor(xmlPullParser2, "EssentialProperty"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SupplementalProperty")) {
                            arrayList11.add(parseDescriptor(xmlPullParser2, "SupplementalProperty"));
                        } else {
                            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Representation")) {
                                int i5 = contentType;
                                arrayList11 = arrayList11;
                                arrayList10 = arrayList10;
                                arrayList9 = arrayList9;
                                arrayList8 = arrayList8;
                                arrayList3 = arrayList15;
                                arrayList6 = arrayList6;
                                str = str4;
                                arrayList2 = arrayList14;
                                str2 = str2;
                                attributeValue2 = attributeValue2;
                                arrayList13 = arrayList13;
                                RepresentationInfo representation = parseRepresentation(xmlPullParser, !arrayList13.isEmpty() ? arrayList13 : list, attributeValue, attributeValue2, attributeValue3, attributeValue4, i2, i3, frameRate, audioChannelConfiguration, i4, str, arrayList9, arrayList8, arrayList10, arrayList11, segmentTemplate, j4, j, j10, j9, j5, z);
                                int iCheckContentTypeConsistency = checkContentTypeConsistency(i5, MimeTypes.getTrackType(representation.format.sampleMimeType));
                                arrayList = arrayList;
                                arrayList.add(representation);
                                xmlPullParser2 = xmlPullParser;
                                availabilityTimeOffsetUs = j9;
                                contentType = iCheckContentTypeConsistency;
                                availabilityTimeOffsetUs2 = j10;
                            } else {
                                int i6 = contentType;
                                arrayList11 = arrayList11;
                                arrayList10 = arrayList10;
                                arrayList9 = arrayList9;
                                arrayList8 = arrayList8;
                                arrayList6 = arrayList6;
                                str = str4;
                                str2 = str2;
                                attributeValue2 = attributeValue2;
                                arrayList13 = arrayList13;
                                arrayList2 = arrayList14;
                                arrayList = arrayList;
                                arrayList3 = arrayList15;
                                j6 = j10;
                                xmlPullParser2 = xmlPullParser;
                                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentBase")) {
                                    availabilityTimeOffsetUs = j9;
                                    segmentTemplate = parseSegmentBase(xmlPullParser2, (SegmentBase.SingleSegmentBase) segmentTemplate);
                                    contentType = i6;
                                    availabilityTimeOffsetUs2 = j6;
                                    arrayList4 = arrayList3;
                                    arrayList14 = arrayList2;
                                    str4 = str;
                                    xmlPullParser2 = xmlPullParser2;
                                } else {
                                    if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentList")) {
                                        availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser2, j9);
                                        i = i6;
                                        segmentTemplate = parseSegmentList(xmlPullParser, (SegmentBase.SegmentList) segmentTemplate, j4, j, j6, availabilityTimeOffsetUs, j5);
                                    } else {
                                        j7 = j9;
                                        i = i6;
                                        if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentTemplate")) {
                                            availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser2, j7);
                                            segmentTemplate = parseSegmentTemplate(xmlPullParser, (SegmentBase.SegmentTemplate) segmentTemplate, arrayList11, j4, j, j6, availabilityTimeOffsetUs, j5);
                                        } else {
                                            xmlPullParser2 = xmlPullParser2;
                                            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "InbandEventStream")) {
                                                arrayList4 = arrayList3;
                                                arrayList4.add(parseDescriptor(xmlPullParser2, "InbandEventStream"));
                                                arrayList14 = arrayList2;
                                            } else {
                                                arrayList4 = arrayList3;
                                                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Label")) {
                                                    arrayList14 = arrayList2;
                                                    arrayList14.add(parseLabel(xmlPullParser));
                                                } else {
                                                    arrayList14 = arrayList2;
                                                    if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
                                                        parseAdaptationSetChild(xmlPullParser);
                                                    }
                                                }
                                            }
                                            availabilityTimeOffsetUs = j7;
                                            availabilityTimeOffsetUs2 = j6;
                                            contentType = i;
                                            str4 = str;
                                        }
                                    }
                                    availabilityTimeOffsetUs2 = j6;
                                    contentType = i;
                                }
                            }
                            arrayList4 = arrayList3;
                            arrayList14 = arrayList2;
                            str4 = str;
                        }
                        i = contentType;
                        arrayList11 = arrayList11;
                        arrayList10 = arrayList10;
                        arrayList9 = arrayList9;
                        arrayList8 = arrayList8;
                        arrayList6 = arrayList6;
                        str = str4;
                        str2 = str2;
                        attributeValue2 = attributeValue2;
                        arrayList13 = arrayList13;
                        arrayList14 = arrayList14;
                        arrayList = arrayList;
                        arrayList4 = arrayList15;
                        j6 = j10;
                        j7 = j9;
                        availabilityTimeOffsetUs = j7;
                        availabilityTimeOffsetUs2 = j6;
                        contentType = i;
                        str4 = str;
                    }
                    arrayList11 = arrayList11;
                    arrayList10 = arrayList10;
                    arrayList9 = arrayList9;
                    arrayList8 = arrayList8;
                    arrayList6 = arrayList6;
                    str2 = str2;
                    attributeValue2 = attributeValue2;
                    arrayList13 = arrayList13;
                    arrayList14 = arrayList14;
                    arrayList = arrayList;
                    arrayList4 = arrayList15;
                    availabilityTimeOffsetUs2 = j10;
                    availabilityTimeOffsetUs = j9;
                }
                if (XmlPullParserUtil.isEndTag(xmlPullParser2, "AdaptationSet")) {
                    break;
                }
                arrayList7 = arrayList4;
                arrayList12 = arrayList;
                j9 = availabilityTimeOffsetUs;
                arrayList10 = arrayList10;
                arrayList9 = arrayList9;
                arrayList8 = arrayList8;
                arrayList6 = arrayList6;
                str2 = str2;
                attributeValue2 = attributeValue2;
                arrayList13 = arrayList13;
                arrayList14 = arrayList14;
                arrayList11 = arrayList11;
            }
            availabilityTimeOffsetUs = j9;
            if (XmlPullParserUtil.isEndTag(xmlPullParser2, "AdaptationSet")) {
                break;
                break;
            }
            arrayList7 = arrayList4;
            arrayList12 = arrayList;
            j9 = availabilityTimeOffsetUs;
            arrayList10 = arrayList10;
            arrayList9 = arrayList9;
            arrayList8 = arrayList8;
            arrayList6 = arrayList6;
            str2 = str2;
            attributeValue2 = attributeValue2;
            arrayList13 = arrayList13;
            arrayList14 = arrayList14;
            arrayList11 = arrayList11;
        }
        ArrayList arrayList16 = new ArrayList(arrayList.size());
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            arrayList16.add(buildRepresentation((RepresentationInfo) arrayList.get(i7), attributeValue6, arrayList14, str3, arrayList6, arrayList4));
        }
        return buildAdaptationSet(j8, contentType, arrayList16, arrayList8, arrayList10, arrayList11);
    }

    public void parseAdaptationSetChild(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        maybeSkipTag(xmlPullParser);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0012  */
    public int parseAudioChannelConfiguration(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String string = parseString(xmlPullParser, "schemeIdUri", null);
        string.getClass();
        int dtsChannelConfiguration = -1;
        switch (string) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                dtsChannelConfiguration = parseDtsChannelConfiguration(xmlPullParser);
                break;
            case "tag:dolby.com,2015:dash:audio_channel_configuration:2015":
                dtsChannelConfiguration = parseDolbyAC4ChannelConfiguration(xmlPullParser, str);
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                dtsChannelConfiguration = parseInt(xmlPullParser, "value", -1);
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                dtsChannelConfiguration = parseDolbyChannelConfiguration(xmlPullParser);
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                dtsChannelConfiguration = parseMpegChannelConfiguration(xmlPullParser);
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                dtsChannelConfiguration = parseDtsxChannelConfiguration(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "AudioChannelConfiguration"));
        return dtsChannelConfiguration;
    }

    public long parseAvailabilityTimeOffsetUs(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public List<BaseUrl> parseBaseUrl(XmlPullParser xmlPullParser, List<BaseUrl> list, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = parseText(xmlPullParser, "BaseURL");
        if (UriUtil.isAbsolute(text)) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(new BaseUrl(text, attributeValue3, i, i2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            BaseUrl baseUrl = list.get(i3);
            String strResolve = UriUtil.resolve(baseUrl.url, text);
            String str = attributeValue3 == null ? strResolve : attributeValue3;
            if (z) {
                i = baseUrl.priority;
                i2 = baseUrl.weight;
                str = baseUrl.serviceLocation;
            }
            arrayList.add(new BaseUrl(strResolve, str, i, i2));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:69:0x011e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public Pair<String, DrmInitData.SchemeData> parseContentProtection(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        UUID uuid;
        String attributeValue;
        String str;
        String text;
        byte[] BuildPsshAtom;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue2 != null) {
            String strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(attributeValue2);
            strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.getClass();
            switch (strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = C.CLEARKEY_UUID;
                    attributeValue = null;
                    str = attributeValue;
                    text = str;
                    BuildPsshAtom = str;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = C.PLAYREADY_UUID;
                    attributeValue = null;
                    str = attributeValue;
                    text = str;
                    BuildPsshAtom = str;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = C.WIDEVINE_UUID;
                    attributeValue = null;
                    str = attributeValue;
                    text = str;
                    BuildPsshAtom = str;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    String attributeValueIgnorePrefix = XmlPullParserUtil.getAttributeValueIgnorePrefix(xmlPullParser, "default_KID");
                    if (!TextUtils.isEmpty(attributeValueIgnorePrefix) && !"00000000-0000-0000-0000-000000000000".equals(attributeValueIgnorePrefix)) {
                        String[] strArrSplit = attributeValueIgnorePrefix.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i = 0; i < strArrSplit.length; i++) {
                            uuidArr[i] = UUID.fromString(strArrSplit[i]);
                        }
                        uuid = C.COMMON_PSSH_UUID;
                        byte[] bArrBuildPsshAtom = PsshAtomUtil.buildPsshAtom(uuid, uuidArr, null);
                        text = null;
                        BuildPsshAtom = bArrBuildPsshAtom;
                        break;
                    } else {
                        Log.w(TAG, "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        uuid = null;
                        str = null;
                        text = str;
                        BuildPsshAtom = str;
                        break;
                    }
                    break;
                default:
                    uuid = null;
                    attributeValue = null;
                    str = attributeValue;
                    text = str;
                    BuildPsshAtom = str;
                    break;
            }
        } else {
            uuid = null;
            attributeValue = null;
            str = attributeValue;
            text = str;
            BuildPsshAtom = str;
        }
        do {
            xmlPullParser.next();
            if ((XmlPullParserUtil.isStartTag(xmlPullParser, "clearkey:Laurl") || XmlPullParserUtil.isStartTag(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                BuildPsshAtom = BuildPsshAtom;
                text = xmlPullParser.getText();
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "ms:laurl")) {
                BuildPsshAtom = BuildPsshAtom;
                text = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (BuildPsshAtom == 0 && XmlPullParserUtil.isStartTagIgnorePrefix(xmlPullParser, "pssh") && xmlPullParser.next() == 4) {
                byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                UUID uuid2 = PsshAtomUtil.parseUuid(bArrDecode);
                if (uuid2 == null) {
                    Log.w(TAG, "Skipping malformed cenc:pssh data");
                    uuid = uuid2;
                    BuildPsshAtom = 0;
                    text = text;
                } else {
                    BuildPsshAtom = bArrDecode;
                    uuid = uuid2;
                    text = text;
                }
            } else if (BuildPsshAtom == 0) {
                UUID uuid3 = C.PLAYREADY_UUID;
                if (uuid3.equals(uuid) && XmlPullParserUtil.isStartTag(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    BuildPsshAtom = PsshAtomUtil.buildPsshAtom(uuid3, Base64.decode(xmlPullParser.getText(), 0));
                    text = text;
                } else {
                    maybeSkipTag(xmlPullParser);
                    BuildPsshAtom = BuildPsshAtom;
                    text = text;
                }
            } else {
                maybeSkipTag(xmlPullParser);
                BuildPsshAtom = BuildPsshAtom;
                text = text;
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new DrmInitData.SchemeData(uuid, text, "video/mp4", BuildPsshAtom) : null);
    }

    public int parseContentType(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public Pair<Long, EventMessage> parseEvent(XmlPullParser xmlPullParser, String str, String str2, long j, long j2, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        long j3 = parseLong(xmlPullParser, TtmlNode.ATTR_ID, 0L);
        long j4 = parseLong(xmlPullParser, TypedValues.TransitionType.S_DURATION, C.TIME_UNSET);
        long j5 = parseLong(xmlPullParser, "presentationTime", 0L);
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(j4, 1000L, j);
        long jScaleLargeTimestamp2 = Util.scaleLargeTimestamp(j5 - j2, 1000000L, j);
        String string = parseString(xmlPullParser, "messageData", null);
        byte[] eventObject = parseEventObject(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jScaleLargeTimestamp2);
        if (string != null) {
            eventObject = Util.getUtf8Bytes(string);
        }
        return Pair.create(lValueOf, buildEvent(str, str2, j3, jScaleLargeTimestamp, eventObject));
    }

    public byte[] parseEventObject(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, StandardCharsets.UTF_8.name());
        xmlPullParser.nextToken();
        while (!XmlPullParserUtil.isEndTag(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public EventStream parseEventStream(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ArrayList arrayList;
        String string = parseString(xmlPullParser, "schemeIdUri", "");
        String string2 = parseString(xmlPullParser, "value", "");
        long j = parseLong(xmlPullParser, "timescale", 1L);
        long j2 = parseLong(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList2 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                long j3 = j2;
                arrayList = arrayList2;
                arrayList.add(parseEvent(xmlPullParser, string, string2, j, j3, byteArrayOutputStream));
            } else {
                byteArrayOutputStream = byteArrayOutputStream2;
                arrayList = arrayList2;
                maybeSkipTag(xmlPullParser);
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "EventStream")) {
                break;
            }
            arrayList2 = arrayList;
            byteArrayOutputStream2 = byteArrayOutputStream;
            j2 = j2;
        }
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            eventMessageArr[i] = (EventMessage) pair.second;
        }
        return buildEventStream(string, string2, j, jArr, eventMessageArr);
    }

    public RangedUri parseInitialization(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "sourceURL", SessionDescription.ATTR_RANGE);
    }

    public Label parseLabel(XmlPullParser xmlPullParser) {
        return new Label(xmlPullParser.getAttributeValue(null, "lang"), parseText(xmlPullParser, "Label"));
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0198  */
    /* JADX WARN: Code duplicated, block: B:68:0x019c  */
    /* JADX WARN: Code duplicated, block: B:69:0x019f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d9 A[LOOP:0: B:24:0x00a0->B:80:0x01d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x0194 A[SYNTHETIC] */
    public DashManifest parseMediaPresentationDescription(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        long j;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j2;
        Throwable th;
        ArrayList arrayList3;
        long j3;
        DashManifestParser dashManifestParser = this;
        boolean zIsDvbProfileDeclared = dashManifestParser.isDvbProfileDeclared(dashManifestParser.parseProfiles(xmlPullParser, "profiles", new String[0]));
        long j4 = C.TIME_UNSET;
        long dateTime = parseDateTime(xmlPullParser, "availabilityStartTime", C.TIME_UNSET);
        long duration = parseDuration(xmlPullParser, "mediaPresentationDuration", C.TIME_UNSET);
        long duration2 = parseDuration(xmlPullParser, "minBufferTime", C.TIME_UNSET);
        Throwable th2 = null;
        boolean zEquals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long duration3 = zEquals ? parseDuration(xmlPullParser, "minimumUpdatePeriod", C.TIME_UNSET) : -9223372036854775807L;
        long duration4 = zEquals ? parseDuration(xmlPullParser, "timeShiftBufferDepth", C.TIME_UNSET) : -9223372036854775807L;
        long duration5 = zEquals ? parseDuration(xmlPullParser, "suggestedPresentationDelay", C.TIME_UNSET) : -9223372036854775807L;
        long dateTime2 = parseDateTime(xmlPullParser, "publishTime", C.TIME_UNSET);
        long availabilityTimeOffsetUs = zEquals ? 0L : -9223372036854775807L;
        ArrayList arrayListO00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(new BaseUrl(uri.toString(), uri.toString(), zIsDvbProfileDeclared ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        long j5 = zEquals ? -9223372036854775807L : 0L;
        ProgramInformation programInformation = null;
        UtcTimingElement utcTiming = null;
        Uri uriResolveToUri = null;
        ServiceDescriptionElement serviceDescription = null;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "BaseURL")) {
                if (!z) {
                    availabilityTimeOffsetUs = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser, availabilityTimeOffsetUs);
                    z = true;
                }
                arrayList5.addAll(dashManifestParser.parseBaseUrl(xmlPullParser, arrayListO00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, zIsDvbProfileDeclared));
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "ProgramInformation")) {
                programInformation = parseProgramInformation(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "UTCTiming")) {
                utcTiming = parseUtcTiming(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Location")) {
                uriResolveToUri = UriUtil.resolveToUri(uri.toString(), xmlPullParser.nextText());
            } else {
                if (XmlPullParserUtil.isStartTag(xmlPullParser, "ServiceDescription")) {
                    serviceDescription = parseServiceDescription(xmlPullParser);
                } else {
                    if (!XmlPullParserUtil.isStartTag(xmlPullParser, "Period") || z2) {
                        j = availabilityTimeOffsetUs;
                        arrayList = arrayList5;
                        arrayList2 = arrayListO00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
                        j2 = j4;
                        th = th2;
                        arrayList3 = arrayList4;
                        maybeSkipTag(xmlPullParser);
                    } else {
                        j = availabilityTimeOffsetUs;
                        arrayList = arrayList5;
                        arrayList2 = arrayListO00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
                        arrayList3 = arrayList4;
                        j2 = j4;
                        th = th2;
                        Pair<Period, Long> period = parsePeriod(xmlPullParser, !arrayList5.isEmpty() ? arrayList5 : arrayListO00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, j5, j, dateTime, duration4, zIsDvbProfileDeclared);
                        Period period2 = (Period) period.first;
                        if (period2.startMs != j2) {
                            long jLongValue = ((Long) period.second).longValue();
                            long j6 = jLongValue == j2 ? j2 : period2.startMs + jLongValue;
                            arrayList3.add(period2);
                            j5 = j6;
                        } else {
                            if (!zEquals) {
                                throw ParserException.createForMalformedManifest("Unable to determine start of period " + arrayList3.size(), th);
                            }
                            arrayList3 = arrayList3;
                            z2 = true;
                        }
                    }
                    availabilityTimeOffsetUs = j;
                }
                if (XmlPullParserUtil.isEndTag(xmlPullParser, "MPD")) {
                    if (duration != j2) {
                        j3 = duration;
                    } else if (j5 != j2) {
                        j3 = j5;
                    } else {
                        if (!zEquals) {
                            throw ParserException.createForMalformedManifest("Unable to determine duration of static manifest.", th);
                        }
                        j3 = duration;
                    }
                    if (arrayList3.isEmpty()) {
                        throw ParserException.createForMalformedManifest("No periods found.", th);
                    }
                    return buildMediaPresentationDescription(dateTime, j3, duration2, zEquals, duration3, duration4, duration5, dateTime2, programInformation, utcTiming, serviceDescription, uriResolveToUri, arrayList3);
                }
                dashManifestParser = this;
                arrayList4 = arrayList3;
                th2 = th;
                arrayList5 = arrayList;
                arrayListO00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = arrayList2;
                j4 = j2;
            }
            arrayList = arrayList5;
            arrayList2 = arrayListO00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
            j2 = j4;
            th = th2;
            arrayList3 = arrayList4;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "MPD")) {
                if (duration != j2) {
                    j3 = duration;
                } else if (j5 != j2) {
                    j3 = j5;
                } else {
                    if (!zEquals) {
                        throw ParserException.createForMalformedManifest("Unable to determine duration of static manifest.", th);
                    }
                    j3 = duration;
                }
                if (arrayList3.isEmpty()) {
                    return buildMediaPresentationDescription(dateTime, j3, duration2, zEquals, duration3, duration4, duration5, dateTime2, programInformation, utcTiming, serviceDescription, uriResolveToUri, arrayList3);
                }
                throw ParserException.createForMalformedManifest("No periods found.", th);
            }
            dashManifestParser = this;
            arrayList4 = arrayList3;
            th2 = th;
            arrayList5 = arrayList;
            arrayListO00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = arrayList2;
            j4 = j2;
        }
    }

    public Pair<Period, Long> parsePeriod(XmlPullParser xmlPullParser, List<BaseUrl> list, long j, long j2, long j3, long j4, boolean z) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        long j5;
        SegmentBase segmentTemplate;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, TtmlNode.ATTR_ID);
        long duration = parseDuration(xmlPullParser2, TtmlNode.START, j);
        long j6 = C.TIME_UNSET;
        long j7 = j3 != C.TIME_UNSET ? j3 + duration : -9223372036854775807L;
        long duration2 = parseDuration(xmlPullParser2, TypedValues.TransitionType.S_DURATION, C.TIME_UNSET);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long availabilityTimeOffsetUs = j2;
        long j8 = -9223372036854775807L;
        SegmentBase segmentBase = null;
        Descriptor descriptor = null;
        boolean z2 = false;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "BaseURL")) {
                if (!z2) {
                    availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser2, availabilityTimeOffsetUs);
                    z2 = true;
                }
                arrayList6.addAll(parseBaseUrl(xmlPullParser2, list, z));
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                j5 = j6;
                obj = obj2;
                arrayList2 = arrayList4;
            } else {
                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "AdaptationSet")) {
                    availabilityTimeOffsetUs = availabilityTimeOffsetUs;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    arrayList2.add(parseAdaptationSet(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list, segmentBase, duration2, availabilityTimeOffsetUs, j8, j7, j4, z));
                    xmlPullParser2 = xmlPullParser;
                    arrayList3 = arrayList5;
                } else {
                    availabilityTimeOffsetUs = availabilityTimeOffsetUs;
                    ArrayList arrayList7 = arrayList5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    xmlPullParser2 = xmlPullParser;
                    if (XmlPullParserUtil.isStartTag(xmlPullParser2, "EventStream")) {
                        arrayList7.add(parseEventStream(xmlPullParser));
                        arrayList3 = arrayList7;
                    } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentBase")) {
                        arrayList3 = arrayList7;
                        segmentBase = parseSegmentBase(xmlPullParser2, null);
                        obj = null;
                        availabilityTimeOffsetUs = availabilityTimeOffsetUs;
                        j5 = C.TIME_UNSET;
                    } else {
                        arrayList3 = arrayList7;
                        if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentList")) {
                            long availabilityTimeOffsetUs2 = parseAvailabilityTimeOffsetUs(xmlPullParser2, C.TIME_UNSET);
                            obj = null;
                            segmentTemplate = parseSegmentList(xmlPullParser, null, j7, duration2, availabilityTimeOffsetUs, availabilityTimeOffsetUs2, j4);
                            j8 = availabilityTimeOffsetUs2;
                            j5 = C.TIME_UNSET;
                        } else {
                            obj = null;
                            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentTemplate")) {
                                long availabilityTimeOffsetUs3 = parseAvailabilityTimeOffsetUs(xmlPullParser2, C.TIME_UNSET);
                                j5 = -9223372036854775807L;
                                segmentTemplate = parseSegmentTemplate(xmlPullParser, null, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(), j7, duration2, availabilityTimeOffsetUs, availabilityTimeOffsetUs3, j4);
                                j8 = availabilityTimeOffsetUs3;
                            } else {
                                j5 = C.TIME_UNSET;
                                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "AssetIdentifier")) {
                                    descriptor = parseDescriptor(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    maybeSkipTag(xmlPullParser);
                                }
                                availabilityTimeOffsetUs = availabilityTimeOffsetUs;
                            }
                        }
                        segmentBase = segmentTemplate;
                    }
                }
                obj = null;
                j5 = C.TIME_UNSET;
                availabilityTimeOffsetUs = availabilityTimeOffsetUs;
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser2, "Period")) {
                return Pair.create(buildPeriod(attributeValue, duration, arrayList2, arrayList3, descriptor), Long.valueOf(duration2));
            }
            arrayList4 = arrayList2;
            arrayList6 = arrayList;
            obj2 = obj;
            arrayList5 = arrayList3;
            j6 = j5;
        }
    }

    public String[] parseProfiles(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    public ProgramInformation parseProgramInformation(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String string = parseString(xmlPullParser, "moreInformationURL", null);
        String string2 = parseString(xmlPullParser, "lang", null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, ExifInterface.TAG_COPYRIGHT)) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
            String str = strNextText3;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "ProgramInformation")) {
                return new ProgramInformation(strNextText, strNextText2, str, string, string2);
            }
            strNextText3 = str;
        }
    }

    public RangedUri parseRangedUrl(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
            return buildRangedUri(attributeValue, j, j2);
        }
        j = 0;
        j2 = -1;
        return buildRangedUri(attributeValue, j, j2);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x021d A[LOOP:0: B:3:0x007b->B:59:0x021d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x01c1 A[EDGE_INSN: B:60:0x01c1->B:49:0x01c1 BREAK  A[LOOP:0: B:3:0x007b->B:59:0x021d], SYNTHETIC] */
    public RepresentationInfo parseRepresentation(XmlPullParser xmlPullParser, List<BaseUrl> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, float f, int i3, int i4, @Nullable String str5, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4, List<Descriptor> list5, @Nullable SegmentBase segmentBase, long j, long j2, long j3, long j4, long j5, boolean z) throws XmlPullParserException, IOException {
        long j6;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        long availabilityTimeOffsetUs;
        ArrayList arrayList7;
        SegmentBase singleSegmentBase;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        String attributeValue = xmlPullParser.getAttributeValue(null, TtmlNode.ATTR_ID);
        int i5 = parseInt(xmlPullParser, "bandwidth", -1);
        String string = parseString(xmlPullParser, "mimeType", str);
        String string2 = parseString(xmlPullParser, "codecs", str2);
        String string3 = parseString(xmlPullParser, "scte214:supplementalCodecs", str3);
        String string4 = parseString(xmlPullParser, "scte214:supplementalProfiles", str4);
        int i6 = parseInt(xmlPullParser, "width", i);
        int i7 = parseInt(xmlPullParser, "height", i2);
        float frameRate = parseFrameRate(xmlPullParser, f);
        int i8 = parseInt(xmlPullParser, "audioSamplingRate", i4);
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList(list4);
        ArrayList arrayList14 = new ArrayList(list5);
        int audioChannelConfiguration = i3;
        SegmentBase segmentTemplate = segmentBase;
        long availabilityTimeOffsetUs2 = j3;
        String str6 = null;
        boolean z2 = false;
        long j7 = j4;
        ArrayList arrayList15 = new ArrayList();
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "BaseURL")) {
                if (!z2) {
                    availabilityTimeOffsetUs2 = parseAvailabilityTimeOffsetUs(xmlPullParser, availabilityTimeOffsetUs2);
                    z2 = true;
                }
                arrayList15.addAll(parseBaseUrl(xmlPullParser, list, z));
                availabilityTimeOffsetUs2 = availabilityTimeOffsetUs2;
            } else {
                if (XmlPullParserUtil.isStartTag(xmlPullParser, "AudioChannelConfiguration")) {
                    singleSegmentBase = segmentTemplate;
                    audioChannelConfiguration = parseAudioChannelConfiguration(xmlPullParser, string2);
                    arrayList5 = arrayList11;
                    arrayList6 = arrayList13;
                    arrayList10 = arrayList15;
                } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentBase")) {
                    segmentTemplate = parseSegmentBase(xmlPullParser, (SegmentBase.SingleSegmentBase) segmentTemplate);
                } else {
                    if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentList")) {
                        availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser, j7);
                        j6 = availabilityTimeOffsetUs2;
                        arrayList9 = arrayList15;
                        arrayList = arrayList13;
                        arrayList2 = arrayList14;
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList12;
                        segmentTemplate = parseSegmentList(xmlPullParser, (SegmentBase.SegmentList) segmentTemplate, j, j2, j6, availabilityTimeOffsetUs, j5);
                    } else {
                        j6 = availabilityTimeOffsetUs2;
                        ArrayList arrayList16 = arrayList15;
                        arrayList = arrayList13;
                        arrayList2 = arrayList14;
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList12;
                        if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTemplate")) {
                            availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser, j7);
                            segmentTemplate = parseSegmentTemplate(xmlPullParser, (SegmentBase.SegmentTemplate) segmentTemplate, list5, j, j2, j6, availabilityTimeOffsetUs, j5);
                            arrayList9 = arrayList16;
                        } else {
                            string2 = string2;
                            if (XmlPullParserUtil.isStartTag(xmlPullParser, "ContentProtection")) {
                                Pair<String, DrmInitData.SchemeData> contentProtection = parseContentProtection(xmlPullParser);
                                Object obj = contentProtection.first;
                                if (obj != null) {
                                    str6 = (String) obj;
                                }
                                Object obj2 = contentProtection.second;
                                if (obj2 != null) {
                                    arrayList5 = arrayList3;
                                    arrayList5.add((DrmInitData.SchemeData) obj2);
                                } else {
                                    arrayList5 = arrayList3;
                                }
                                availabilityTimeOffsetUs2 = j6;
                                arrayList6 = arrayList;
                                arrayList14 = arrayList2;
                                arrayList8 = arrayList16;
                                arrayList12 = arrayList4;
                                arrayList7 = arrayList8;
                            } else {
                                arrayList5 = arrayList3;
                                if (XmlPullParserUtil.isStartTag(xmlPullParser, "InbandEventStream")) {
                                    arrayList12 = arrayList4;
                                    arrayList12.add(parseDescriptor(xmlPullParser, "InbandEventStream"));
                                    arrayList6 = arrayList;
                                } else {
                                    arrayList12 = arrayList4;
                                    if (XmlPullParserUtil.isStartTag(xmlPullParser, "EssentialProperty")) {
                                        arrayList6 = arrayList;
                                        arrayList6.add(parseDescriptor(xmlPullParser, "EssentialProperty"));
                                    } else {
                                        arrayList6 = arrayList;
                                        if (XmlPullParserUtil.isStartTag(xmlPullParser, "SupplementalProperty")) {
                                            arrayList14 = arrayList2;
                                            arrayList14.add(parseDescriptor(xmlPullParser, "SupplementalProperty"));
                                        } else {
                                            arrayList14 = arrayList2;
                                            maybeSkipTag(xmlPullParser);
                                        }
                                    }
                                    audioChannelConfiguration = audioChannelConfiguration;
                                    availabilityTimeOffsetUs2 = j6;
                                    arrayList7 = arrayList16;
                                }
                                arrayList14 = arrayList2;
                                audioChannelConfiguration = audioChannelConfiguration;
                                availabilityTimeOffsetUs2 = j6;
                                arrayList7 = arrayList16;
                            }
                        }
                        singleSegmentBase = segmentTemplate;
                        arrayList10 = arrayList7;
                    }
                    j7 = availabilityTimeOffsetUs;
                    availabilityTimeOffsetUs2 = j6;
                    arrayList6 = arrayList;
                    arrayList14 = arrayList2;
                    arrayList5 = arrayList3;
                    arrayList8 = arrayList9;
                    arrayList12 = arrayList4;
                    arrayList7 = arrayList8;
                    singleSegmentBase = segmentTemplate;
                    arrayList10 = arrayList7;
                }
                if (XmlPullParserUtil.isEndTag(xmlPullParser, "Representation")) {
                    break;
                }
                arrayList13 = arrayList6;
                arrayList11 = arrayList5;
                segmentTemplate = singleSegmentBase;
                arrayList15 = arrayList10;
                string2 = string2;
                audioChannelConfiguration = audioChannelConfiguration;
            }
            audioChannelConfiguration = audioChannelConfiguration;
            singleSegmentBase = segmentTemplate;
            arrayList5 = arrayList11;
            arrayList6 = arrayList13;
            arrayList10 = arrayList15;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "Representation")) {
                break;
                break;
            }
            arrayList13 = arrayList6;
            arrayList11 = arrayList5;
            segmentTemplate = singleSegmentBase;
            arrayList15 = arrayList10;
            string2 = string2;
            audioChannelConfiguration = audioChannelConfiguration;
        }
        List<Descriptor> list6 = arrayList14;
        List<Descriptor> list7 = arrayList6;
        ArrayList arrayList17 = arrayList12;
        ArrayList arrayList18 = arrayList5;
        Format formatBuildFormat = buildFormat(attributeValue, string, i6, i7, frameRate, audioChannelConfiguration, i8, i5, str5, list2, list3, string2, string3, string4, list7, list6);
        if (singleSegmentBase == null) {
            singleSegmentBase = new SegmentBase.SingleSegmentBase();
        }
        boolean zIsEmpty = arrayList10.isEmpty();
        List list8 = arrayList10;
        if (zIsEmpty) {
            list8 = list;
        }
        return new RepresentationInfo(formatBuildFormat, list8, singleSegmentBase, str6, arrayList18, arrayList17, list7, list6, -1L);
    }

    public int parseRoleFlagsFromAccessibilityDescriptors(List<Descriptor> list) {
        int tvaAudioPurposeCsValue;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Descriptor descriptor = list.get(i2);
            if (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                tvaAudioPurposeCsValue = parseRoleFlagsFromDashRoleScheme(descriptor.value);
            } else {
                if (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("urn:tva:metadata:cs:AudioPurposeCS:2007", descriptor.schemeIdUri)) {
                    tvaAudioPurposeCsValue = parseTvaAudioPurposeCsValue(descriptor.value);
                }
            }
            i |= tvaAudioPurposeCsValue;
        }
        return i;
    }

    public int parseRoleFlagsFromDashRoleScheme(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "subtitle":
            case "forced_subtitle":
            case "forced-subtitle":
                return 128;
            case "description":
                return 512;
            case "enhanced-audio-intelligibility":
                return 2048;
            case "alternate":
                return 2;
            case "dub":
                return 16;
            case "main":
                return 1;
            case "sign":
                return 256;
            case "caption":
                return 64;
            case "commentary":
                return 8;
            case "emergency":
                return 32;
            case "supplementary":
                return 4;
            default:
                return 0;
        }
    }

    public int parseRoleFlagsFromProperties(List<Descriptor> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("http://dashif.org/guidelines/trickmode", list.get(i2).schemeIdUri)) {
                i = 16384;
            }
        }
        return i;
    }

    public int parseRoleFlagsFromRoleDescriptors(List<Descriptor> list) {
        int roleFlagsFromDashRoleScheme = 0;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                roleFlagsFromDashRoleScheme |= parseRoleFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return roleFlagsFromDashRoleScheme;
    }

    public SegmentBase.SingleSegmentBase parseSegmentBase(XmlPullParser xmlPullParser, @Nullable SegmentBase.SingleSegmentBase singleSegmentBase) throws XmlPullParserException, IOException {
        long j;
        long j2;
        long j3 = parseLong(xmlPullParser, "timescale", singleSegmentBase != null ? singleSegmentBase.timescale : 1L);
        long j4 = parseLong(xmlPullParser, "presentationTimeOffset", singleSegmentBase != null ? singleSegmentBase.presentationTimeOffset : 0L);
        long j5 = singleSegmentBase != null ? singleSegmentBase.indexStart : 0L;
        long j6 = singleSegmentBase != null ? singleSegmentBase.indexLength : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j2 = Long.parseLong(strArrSplit[0]);
            j = (Long.parseLong(strArrSplit[1]) - j2) + 1;
        } else {
            j = j6;
            j2 = j5;
        }
        RangedUri initialization = singleSegmentBase != null ? singleSegmentBase.initialization : null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentBase"));
        return buildSingleSegmentBase(initialization, j3, j4, j2, j);
    }

    public SegmentBase.SegmentList parseSegmentList(XmlPullParser xmlPullParser, @Nullable SegmentBase.SegmentList segmentList, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6 = parseLong(xmlPullParser, "timescale", segmentList != null ? segmentList.timescale : 1L);
        long j7 = parseLong(xmlPullParser, "presentationTimeOffset", segmentList != null ? segmentList.presentationTimeOffset : 0L);
        long j8 = parseLong(xmlPullParser, TypedValues.TransitionType.S_DURATION, segmentList != null ? segmentList.duration : C.TIME_UNSET);
        long j9 = parseLong(xmlPullParser, "startNumber", segmentList != null ? segmentList.startNumber : 1L);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j3, j4);
        List<SegmentBase.SegmentTimelineElement> segmentTimeline = null;
        List<RangedUri> arrayList = null;
        RangedUri initialization = null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTimeline")) {
                segmentTimeline = parseSegmentTimeline(xmlPullParser, j6, j2);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(parseSegmentUrl(xmlPullParser));
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentList"));
        if (segmentList != null) {
            if (initialization == null) {
                initialization = segmentList.initialization;
            }
            if (segmentTimeline == null) {
                segmentTimeline = segmentList.segmentTimeline;
            }
            if (arrayList == null) {
                arrayList = segmentList.mediaSegments;
            }
        }
        return buildSegmentList(initialization, j6, j7, j9, j8, segmentTimeline, finalAvailabilityTimeOffset, arrayList, j5, j);
    }

    public SegmentBase.SegmentTemplate parseSegmentTemplate(XmlPullParser xmlPullParser, @Nullable SegmentBase.SegmentTemplate segmentTemplate, List<Descriptor> list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6 = parseLong(xmlPullParser, "timescale", segmentTemplate != null ? segmentTemplate.timescale : 1L);
        long j7 = parseLong(xmlPullParser, "presentationTimeOffset", segmentTemplate != null ? segmentTemplate.presentationTimeOffset : 0L);
        long j8 = parseLong(xmlPullParser, TypedValues.TransitionType.S_DURATION, segmentTemplate != null ? segmentTemplate.duration : C.TIME_UNSET);
        long j9 = parseLong(xmlPullParser, "startNumber", segmentTemplate != null ? segmentTemplate.startNumber : 1L);
        long lastSegmentNumberSupplementalProperty = parseLastSegmentNumberSupplementalProperty(list);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j3, j4);
        List<SegmentBase.SegmentTimelineElement> segmentTimeline = null;
        UrlTemplate urlTemplate = parseUrlTemplate(xmlPullParser, "media", segmentTemplate != null ? segmentTemplate.mediaTemplate : null);
        UrlTemplate urlTemplate2 = parseUrlTemplate(xmlPullParser, "initialization", segmentTemplate != null ? segmentTemplate.initializationTemplate : null);
        RangedUri initialization = null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTimeline")) {
                segmentTimeline = parseSegmentTimeline(xmlPullParser, j6, j2);
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTemplate"));
        if (segmentTemplate != null) {
            if (initialization == null) {
                initialization = segmentTemplate.initialization;
            }
            if (segmentTimeline == null) {
                segmentTimeline = segmentTemplate.segmentTimeline;
            }
        }
        return buildSegmentTemplate(initialization, j6, j7, j9, lastSegmentNumberSupplementalProperty, j8, segmentTimeline, finalAvailabilityTimeOffset, urlTemplate2, urlTemplate, j5, j);
    }

    public List<SegmentBase.SegmentTimelineElement> parseSegmentTimeline(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jAddSegmentTimelineElementsToList = 0;
        long j3 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, ExifInterface.LATITUDE_SOUTH)) {
                long j4 = parseLong(xmlPullParser, "t", C.TIME_UNSET);
                if (z) {
                    jAddSegmentTimelineElementsToList = addSegmentTimelineElementsToList(arrayList, jAddSegmentTimelineElementsToList, j3, i, j4);
                }
                if (j4 == C.TIME_UNSET) {
                    j4 = jAddSegmentTimelineElementsToList;
                }
                j3 = parseLong(xmlPullParser, "d", C.TIME_UNSET);
                i = parseInt(xmlPullParser, "r", 0);
                jAddSegmentTimelineElementsToList = j4;
                z = true;
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTimeline"));
        if (z) {
            addSegmentTimelineElementsToList(arrayList, jAddSegmentTimelineElementsToList, j3, i, Util.scaleLargeTimestamp(j2, j, 1000L));
        }
        return arrayList;
    }

    public RangedUri parseSegmentUrl(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "media", "mediaRange");
    }

    public int parseSelectionFlagsFromDashRoleScheme(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    public int parseSelectionFlagsFromRoleDescriptors(List<Descriptor> list) {
        int selectionFlagsFromDashRoleScheme = 0;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                selectionFlagsFromDashRoleScheme |= parseSelectionFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return selectionFlagsFromDashRoleScheme;
    }

    public ServiceDescriptionElement parseServiceDescription(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        float f = -3.4028235E38f;
        float f2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Latency")) {
                j = parseLong(xmlPullParser, TypedValues.AttributesType.S_TARGET, C.TIME_UNSET);
                j2 = parseLong(xmlPullParser, "min", C.TIME_UNSET);
                j3 = parseLong(xmlPullParser, "max", C.TIME_UNSET);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "PlaybackRate")) {
                f = parseFloat(xmlPullParser, "min", -3.4028235E38f);
                f2 = parseFloat(xmlPullParser, "max", -3.4028235E38f);
            }
            long j4 = j;
            long j5 = j2;
            long j6 = j3;
            float f3 = f;
            float f4 = f2;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "ServiceDescription")) {
                return new ServiceDescriptionElement(j4, j5, j6, f3, f4);
            }
            j = j4;
            j2 = j5;
            j3 = j6;
            f = f3;
            f2 = f4;
        }
    }

    @Nullable
    public Pair<Integer, Integer> parseTileCountFromProperties(List<Descriptor> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("http://dashif.org/thumbnail_tile", descriptor.schemeIdUri) || O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("http://dashif.org/guidelines/thumbnail_tile", descriptor.schemeIdUri)) && (str = descriptor.value) != null) {
                String[] strArrSplit = Util.split(str, "x");
                if (strArrSplit.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public int parseTvaAudioPurposeCsValue(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        byte b = -1;
        switch (str.hashCode()) {
            case 49:
                if (str.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    b = 0;
                }
                break;
            case 50:
                if (str.equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                    b = 1;
                }
                break;
            case 51:
                if (str.equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                    b = 2;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    b = 3;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    b = 4;
                }
                break;
        }
        switch (b) {
            case 0:
                return 512;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    @Nullable
    public UrlTemplate parseUrlTemplate(XmlPullParser xmlPullParser, String str, @Nullable UrlTemplate urlTemplate) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? UrlTemplate.compile(attributeValue) : urlTemplate;
    }

    public UtcTimingElement parseUtcTiming(XmlPullParser xmlPullParser) {
        return buildUtcTimingElement(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public DashManifest parse(Uri uri, InputStream inputStream) throws ParserException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.xmlParserFactory.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return parseMediaPresentationDescription(xmlPullParserNewPullParser, uri);
            }
            throw ParserException.createForMalformedManifest("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e) {
            throw ParserException.createForMalformedManifest(null, e);
        }
    }
}
