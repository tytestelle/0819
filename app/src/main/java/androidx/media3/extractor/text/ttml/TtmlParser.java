package androidx.media3.extractor.text.ttml;

import O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.text.Layout;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ColorParser;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.XmlPullParserUtil;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.LegacySubtitleUtil;
import androidx.media3.extractor.text.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleParser;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class TtmlParser implements SubtitleParser {
    private static final String ATTR_BEGIN = "begin";
    private static final String ATTR_DURATION = "dur";
    private static final String ATTR_END = "end";
    private static final String ATTR_IMAGE = "backgroundImage";
    private static final String ATTR_REGION = "region";
    private static final String ATTR_STYLE = "style";
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final int DEFAULT_CELL_ROWS = 15;
    private static final int DEFAULT_FRAME_RATE = 30;
    private static final String TAG = "TtmlParser";
    private static final String TTP = "http://www.w3.org/ns/ttml#parameter";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern CLOCK_TIME = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern OFFSET_TIME = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern FONT_SIZE = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern SIGNED_PERCENTAGE = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern PERCENTAGE_COORDINATES = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern PIXEL_COORDINATES = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern CELL_RESOLUTION = Pattern.compile("^(\\d+) (\\d+)$");
    private static final FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE = new FrameAndTickRate(30.0f, 1, 1);

    public static final class FrameAndTickRate {
        final float effectiveFrameRate;
        final int subFrameRate;
        final int tickRate;

        public FrameAndTickRate(float f, int i, int i2) {
            this.effectiveFrameRate = f;
            this.subFrameRate = i;
            this.tickRate = i2;
        }
    }

    public static final class TtsExtent {
        final int height;
        final int width;

        public TtsExtent(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }

    public TtmlParser() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.xmlParserFactory = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private static TtmlStyle createIfNull(@Nullable TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    private static boolean isSupportedTag(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals(TtmlNode.TAG_HEAD) || str.equals(TtmlNode.TAG_BODY) || str.equals(TtmlNode.TAG_DIV) || str.equals(TtmlNode.TAG_P) || str.equals(TtmlNode.TAG_SPAN) || str.equals("br") || str.equals("style") || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals("region") || str.equals(TtmlNode.TAG_METADATA) || str.equals("image") || str.equals("data") || str.equals(TtmlNode.TAG_INFORMATION);
    }

    @Nullable
    private static Layout.Alignment parseAlignment(String str) {
        String strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(str);
        strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.getClass();
        switch (strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static int parseCellRows(XmlPullParser xmlPullParser, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "cellResolution");
        if (attributeValue == null) {
            return i;
        }
        Matcher matcher = CELL_RESOLUTION.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring malformed cell resolution: ".concat(attributeValue));
            return i;
        }
        boolean z = true;
        try {
            int i2 = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)));
            int i3 = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2)));
            if (i2 == 0 || i3 == 0) {
                z = false;
            }
            Assertions.checkArgument(z, "Invalid cell resolution " + i2 + " " + i3);
            return i3;
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed cell resolution: ".concat(attributeValue));
            return i;
        }
    }

    private static void parseFontSize(String str, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        Matcher matcher;
        String[] strArrSplit = Util.split(str, "\\s+");
        if (strArrSplit.length == 1) {
            matcher = FONT_SIZE.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(new StringBuilder("Invalid number of entries for fontSize: "), ".", strArrSplit.length));
            }
            matcher = FONT_SIZE.matcher(strArrSplit[1]);
            Log.w(TAG, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("Invalid expression for fontSize: '", str, "'."));
        }
        String str2 = (String) Assertions.checkNotNull(matcher.group(3));
        str2.getClass();
        switch (str2) {
            case "%":
                ttmlStyle.setFontSizeUnit(3);
                break;
            case "em":
                ttmlStyle.setFontSizeUnit(2);
                break;
            case "px":
                ttmlStyle.setFontSizeUnit(1);
                break;
            default:
                throw new SubtitleDecoderException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("Invalid unit for fontSize: '", str2, "'."));
        }
        ttmlStyle.setFontSize(Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))));
    }

    private static FrameAndTickRate parseFrameAndTickRates(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue(TTP, "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrSplit = Util.split(attributeValue2, " ");
            Assertions.checkArgument(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f = 1.0f;
        }
        FrameAndTickRate frameAndTickRate = DEFAULT_FRAME_AND_TICK_RATE;
        int i2 = frameAndTickRate.subFrameRate;
        String attributeValue3 = xmlPullParser.getAttributeValue(TTP, "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = frameAndTickRate.tickRate;
        String attributeValue4 = xmlPullParser.getAttributeValue(TTP, "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new FrameAndTickRate(i * f, i2, i3);
    }

    private static Map<String, TtmlStyle> parseHeader(XmlPullParser xmlPullParser, Map<String, TtmlStyle> map, int i, @Nullable TtsExtent ttsExtent, Map<String, TtmlRegion> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "style")) {
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "style");
                TtmlStyle styleAttributes = parseStyleAttributes(xmlPullParser, new TtmlStyle());
                if (attributeValue != null) {
                    for (String str : parseStyleIds(attributeValue)) {
                        styleAttributes.chain(map.get(str));
                    }
                }
                String id = styleAttributes.getId();
                if (id != null) {
                    map.put(id, styleAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "region")) {
                TtmlRegion regionAttributes = parseRegionAttributes(xmlPullParser, i, ttsExtent, map);
                if (regionAttributes != null) {
                    map2.put(regionAttributes.id, regionAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, TtmlNode.TAG_METADATA)) {
                parseMetadata(xmlPullParser, map3);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, TtmlNode.TAG_HEAD));
        return map;
    }

    private static void parseMetadata(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String attributeValue;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "image") && (attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_ID)) != null) {
                map.put(attributeValue, xmlPullParser.nextText());
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, TtmlNode.TAG_METADATA));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:67:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:6:0x0039  */
    private static TtmlNode parseNode(XmlPullParser xmlPullParser, @Nullable TtmlNode ttmlNode, Map<String, TtmlRegion> map, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
        long j;
        long j2;
        int attributeCount = xmlPullParser.getAttributeCount();
        TtmlStyle styleAttributes = parseStyleAttributes(xmlPullParser, null);
        String strSubstring = null;
        String str = "";
        long timeExpression = C.TIME_UNSET;
        long timeExpression2 = C.TIME_UNSET;
        long timeExpression3 = C.TIME_UNSET;
        String[] strArr = null;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    timeExpression3 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case "end":
                    timeExpression2 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case "begin":
                    timeExpression = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case "style":
                    String[] styleIds = parseStyleIds(attributeValue);
                    if (styleIds.length > 0) {
                        strArr = styleIds;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (ttmlNode != null) {
            long j3 = ttmlNode.startTimeUs;
            j = C.TIME_UNSET;
            if (j3 != C.TIME_UNSET) {
                if (timeExpression != C.TIME_UNSET) {
                    timeExpression += j3;
                }
                if (timeExpression2 != C.TIME_UNSET) {
                    timeExpression2 += j3;
                }
            }
        } else {
            j = C.TIME_UNSET;
        }
        long j4 = timeExpression;
        if (timeExpression2 != j) {
            j2 = timeExpression2;
        } else if (timeExpression3 != j) {
            j2 = j4 + timeExpression3;
        } else if (ttmlNode != null) {
            long j5 = ttmlNode.endTimeUs;
            if (j5 != j) {
                j2 = j5;
            } else {
                j2 = timeExpression2;
            }
        } else {
            j2 = timeExpression2;
        }
        return TtmlNode.buildNode(xmlPullParser.getName(), j4, j2, styleAttributes, strArr, str, strSubstring, ttmlNode);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0185  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d1  */
    @Nullable
    private static TtmlRegion parseRegionAttributes(XmlPullParser xmlPullParser, int i, @Nullable TtsExtent ttsExtent, Map<String, TtmlStyle> map) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i2;
        int i3;
        float f6;
        String attributeValue;
        TtmlStyle ttmlStyle;
        String attributeValue2;
        TtmlStyle ttmlStyle2;
        String attributeValue3 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_ID);
        if (attributeValue3 == null) {
            return null;
        }
        String attributeValue4 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_ORIGIN);
        if (attributeValue4 == null && (attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlPullParser, "style")) != null && (ttmlStyle2 = map.get(attributeValue2)) != null) {
            attributeValue4 = ttmlStyle2.getOrigin();
        }
        if (attributeValue4 != null) {
            Matcher matcher = PERCENTAGE_COORDINATES.matcher(attributeValue4);
            Matcher matcher2 = PIXEL_COORDINATES.matcher(attributeValue4);
            if (matcher.matches()) {
                try {
                    f2 = Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))) / 100.0f;
                    f = Float.parseFloat((String) Assertions.checkNotNull(matcher.group(2))) / 100.0f;
                } catch (NumberFormatException unused) {
                    Log.w(TAG, "Ignoring region with malformed origin: ".concat(attributeValue4));
                    return null;
                }
            } else {
                if (!matcher2.matches()) {
                    Log.w(TAG, "Ignoring region with unsupported origin: ".concat(attributeValue4));
                    return null;
                }
                if (ttsExtent == null) {
                    Log.w(TAG, "Ignoring region with missing tts:extent: ".concat(attributeValue4));
                    return null;
                }
                try {
                    int i4 = Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(1)));
                    int i5 = Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(2)));
                    float f7 = i4 / ttsExtent.width;
                    f = i5 / ttsExtent.height;
                    f2 = f7;
                } catch (NumberFormatException unused2) {
                    Log.w(TAG, "Ignoring region with malformed origin: ".concat(attributeValue4));
                    return null;
                }
            }
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        String attributeValue5 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (attributeValue5 == null && (attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "style")) != null && (ttmlStyle = map.get(attributeValue)) != null) {
            attributeValue5 = ttmlStyle.getExtent();
        }
        if (attributeValue5 != null) {
            Matcher matcher3 = PERCENTAGE_COORDINATES.matcher(attributeValue5);
            Matcher matcher4 = PIXEL_COORDINATES.matcher(attributeValue5);
            if (matcher3.matches()) {
                try {
                    f6 = Float.parseFloat((String) Assertions.checkNotNull(matcher3.group(1))) / 100.0f;
                    f3 = Float.parseFloat((String) Assertions.checkNotNull(matcher3.group(2))) / 100.0f;
                } catch (NumberFormatException unused3) {
                    O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000("Ignoring region with malformed extent: ", attributeValue4, TAG);
                    return null;
                }
            } else {
                if (!matcher4.matches()) {
                    O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000("Ignoring region with unsupported extent: ", attributeValue4, TAG);
                    return null;
                }
                if (ttsExtent == null) {
                    O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000("Ignoring region with missing tts:extent: ", attributeValue4, TAG);
                    return null;
                }
                try {
                    int i6 = Integer.parseInt((String) Assertions.checkNotNull(matcher4.group(1)));
                    int i7 = Integer.parseInt((String) Assertions.checkNotNull(matcher4.group(2)));
                    float f8 = i6 / ttsExtent.width;
                    f3 = i7 / ttsExtent.height;
                    f6 = f8;
                } catch (NumberFormatException unused4) {
                    O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000("Ignoring region with malformed extent: ", attributeValue4, TAG);
                    return null;
                }
            }
            f4 = f6;
        } else {
            f3 = 1.0f;
            f4 = 1.0f;
        }
        String attributeValue6 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
        if (attributeValue6 != null) {
            String strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(attributeValue6);
            strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.getClass();
            if (strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.equals(TtmlNode.CENTER)) {
                f5 = (f3 / 2.0f) + f;
                i2 = 1;
            } else if (strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                f5 = f + f3;
                i2 = 2;
            } else {
                f5 = f;
                i2 = 0;
            }
        } else {
            f5 = f;
            i2 = 0;
        }
        float f9 = 1.0f / i;
        String attributeValue7 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_WRITING_MODE);
        if (attributeValue7 != null) {
            String strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o2 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(attributeValue7);
            strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o2.getClass();
            switch (strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o2) {
                case "tb":
                case "tblr":
                    i3 = 2;
                    break;
                case "tbrl":
                    i3 = 1;
                    break;
                default:
                    i3 = Integer.MIN_VALUE;
                    break;
            }
        } else {
            i3 = Integer.MIN_VALUE;
        }
        return new TtmlRegion(attributeValue3, f2, f5, 0, i2, f4, f3, 1, f9, i3);
    }

    private static float parseShear(String str) {
        Matcher matcher = SIGNED_PERCENTAGE.matcher(str);
        if (!matcher.matches()) {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000("Invalid value for shear: ", str, TAG);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1)))));
        } catch (NumberFormatException e) {
            Log.w(TAG, "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:144:0x026c  */
    /* JADX WARN: Code duplicated, block: B:6:0x0022  */
    private static TtmlStyle parseStyleAttributes(XmlPullParser xmlPullParser, TtmlStyle ttmlStyle) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    ttmlStyle = createIfNull(ttmlStyle).setItalic(TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                    break;
                case "extent":
                    ttmlStyle = createIfNull(ttmlStyle).setExtent(attributeValue);
                    break;
                case "fontFamily":
                    ttmlStyle = createIfNull(ttmlStyle).setFontFamily(attributeValue);
                    break;
                case "textAlign":
                    ttmlStyle = createIfNull(ttmlStyle).setTextAlign(parseAlignment(attributeValue));
                    break;
                case "origin":
                    ttmlStyle = createIfNull(ttmlStyle).setOrigin(attributeValue);
                    break;
                case "textDecoration":
                    String strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(attributeValue);
                    strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.getClass();
                    switch (strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o) {
                        case "nounderline":
                            ttmlStyle = createIfNull(ttmlStyle).setUnderline(false);
                            break;
                        case "underline":
                            ttmlStyle = createIfNull(ttmlStyle).setUnderline(true);
                            break;
                        case "nolinethrough":
                            ttmlStyle = createIfNull(ttmlStyle).setLinethrough(false);
                            break;
                        case "linethrough":
                            ttmlStyle = createIfNull(ttmlStyle).setLinethrough(true);
                            break;
                    }
                    break;
                case "fontWeight":
                    ttmlStyle = createIfNull(ttmlStyle).setBold(TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    break;
                case "id":
                    if (!"style".equals(xmlPullParser.getName())) {
                        break;
                    } else {
                        ttmlStyle = createIfNull(ttmlStyle).setId(attributeValue);
                        break;
                    }
                    break;
                case "ruby":
                    String strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o2 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(attributeValue);
                    strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o2.getClass();
                    switch (strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o2) {
                        case "baseContainer":
                        case "base":
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(2);
                            break;
                        case "container":
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(1);
                            break;
                        case "delimiter":
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(4);
                            break;
                        case "textContainer":
                        case "text":
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(3);
                            break;
                    }
                    break;
                case "color":
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.setFontColor(ColorParser.parseTtmlColor(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused) {
                        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000("Failed parsing color value: ", attributeValue, TAG);
                        break;
                    }
                    break;
                case "shear":
                    ttmlStyle = createIfNull(ttmlStyle).setShearPercentage(parseShear(attributeValue));
                    break;
                case "textCombine":
                    String strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o3 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(attributeValue);
                    strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o3.getClass();
                    if (!strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o3.equals(TtmlNode.COMBINE_ALL)) {
                        if (strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o3.equals("none")) {
                            ttmlStyle = createIfNull(ttmlStyle).setTextCombine(false);
                        }
                        break;
                    } else {
                        ttmlStyle = createIfNull(ttmlStyle).setTextCombine(true);
                        break;
                    }
                    break;
                case "fontSize":
                    try {
                        ttmlStyle = createIfNull(ttmlStyle);
                        parseFontSize(attributeValue, ttmlStyle);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000("Failed parsing fontSize value: ", attributeValue, TAG);
                        break;
                    }
                    break;
                case "textEmphasis":
                    ttmlStyle = createIfNull(ttmlStyle).setTextEmphasis(TextEmphasis.parse(attributeValue));
                    break;
                case "rubyPosition":
                    String strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o4 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(attributeValue);
                    strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o4.getClass();
                    if (!strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o4.equals(TtmlNode.ANNOTATION_POSITION_BEFORE)) {
                        if (strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o4.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                            ttmlStyle = createIfNull(ttmlStyle).setRubyPosition(2);
                        }
                        break;
                    } else {
                        ttmlStyle = createIfNull(ttmlStyle).setRubyPosition(1);
                        break;
                    }
                    break;
                case "backgroundColor":
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.setBackgroundColor(ColorParser.parseTtmlColor(attributeValue));
                        break;
                    } catch (IllegalArgumentException unused3) {
                        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000("Failed parsing background value: ", attributeValue, TAG);
                        break;
                    }
                    break;
                case "multiRowAlign":
                    ttmlStyle = createIfNull(ttmlStyle).setMultiRowAlign(parseAlignment(attributeValue));
                    break;
            }
        }
        return ttmlStyle;
    }

    private static String[] parseStyleIds(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : Util.split(strTrim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x00b6  */
    private static long parseTimeExpression(String str, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
        double d;
        double d2;
        byte b = 4;
        Matcher matcher = CLOCK_TIME.matcher(str);
        if (matcher.matches()) {
            double d3 = (Long.parseLong((String) Assertions.checkNotNull(matcher.group(1))) * 3600) + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))) * 60) + Long.parseLong((String) Assertions.checkNotNull(matcher.group(3)));
            String strGroup = matcher.group(4);
            double d4 = d3 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d5 = d4 + (strGroup2 != null ? Long.parseLong(strGroup2) / frameAndTickRate.effectiveFrameRate : 0.0d);
            String strGroup3 = matcher.group(6);
            return (long) ((d5 + (strGroup3 != null ? (Long.parseLong(strGroup3) / ((double) frameAndTickRate.subFrameRate)) / ((double) frameAndTickRate.effectiveFrameRate) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = OFFSET_TIME.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Malformed time expression: ", str));
        }
        double d6 = Double.parseDouble((String) Assertions.checkNotNull(matcher2.group(1)));
        String str2 = (String) Assertions.checkNotNull(matcher2.group(2));
        str2.getClass();
        switch (str2.hashCode()) {
            case 102:
                if (!str2.equals("f")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 104:
                if (!str2.equals(CmcdData.STREAMING_FORMAT_HLS)) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 109:
                if (!str2.equals("m")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 116:
                if (!str2.equals("t")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 3494:
                if (!str2.equals("ms")) {
                    b = -1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                d = frameAndTickRate.effectiveFrameRate;
                d6 /= d;
                return (long) (d6 * 1000000.0d);
            case 1:
                d2 = 3600.0d;
                break;
            case 2:
                d2 = 60.0d;
                break;
            case 3:
                d = frameAndTickRate.tickRate;
                d6 /= d;
                return (long) (d6 * 1000000.0d);
            case 4:
                d = 1000.0d;
                d6 /= d;
                return (long) (d6 * 1000000.0d);
            default:
                return (long) (d6 * 1000000.0d);
        }
        d6 *= d2;
        return (long) (d6 * 1000000.0d);
    }

    @Nullable
    private static TtsExtent parseTtsExtent(XmlPullParser xmlPullParser) {
        String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (attributeValue == null) {
            return null;
        }
        Matcher matcher = PIXEL_COORDINATES.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring non-pixel tts extent: ".concat(attributeValue));
            return null;
        }
        try {
            return new TtsExtent(Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2))));
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed tts extent: ".concat(attributeValue));
            return null;
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final /* synthetic */ void parse(byte[] bArr, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, bArr, outputOptions, consumer);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public Subtitle parseToLegacySubtitle(byte[] bArr, int i, int i2) {
        FrameAndTickRate frameAndTickRate;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.xmlParserFactory.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new TtmlRegion(""));
            TtsExtent ttsExtent = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            FrameAndTickRate frameAndTickRates = DEFAULT_FRAME_AND_TICK_RATE;
            TtmlSubtitle ttmlSubtitle = null;
            int cellRows = 15;
            int i3 = 0;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                TtmlNode ttmlNode = (TtmlNode) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            frameAndTickRates = parseFrameAndTickRates(xmlPullParserNewPullParser);
                            cellRows = parseCellRows(xmlPullParserNewPullParser, 15);
                            ttsExtent = parseTtsExtent(xmlPullParserNewPullParser);
                        }
                        TtsExtent ttsExtent2 = ttsExtent;
                        FrameAndTickRate frameAndTickRate2 = frameAndTickRates;
                        int i4 = cellRows;
                        if (isSupportedTag(name)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                frameAndTickRate = frameAndTickRate2;
                                parseHeader(xmlPullParserNewPullParser, map, i4, ttsExtent2, map2, map3);
                            } else {
                                frameAndTickRate = frameAndTickRate2;
                                try {
                                    TtmlNode node = parseNode(xmlPullParserNewPullParser, ttmlNode, map2, frameAndTickRate);
                                    arrayDeque.push(node);
                                    if (ttmlNode != null) {
                                        ttmlNode.addChild(node);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    Log.w(TAG, "Suppressing parser error", e);
                                    i3++;
                                }
                            }
                            frameAndTickRates = frameAndTickRate;
                        } else {
                            Log.i(TAG, "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i3++;
                            frameAndTickRates = frameAndTickRate2;
                        }
                        ttsExtent = ttsExtent2;
                        cellRows = i4;
                    } else if (eventType == 4) {
                        ((TtmlNode) Assertions.checkNotNull(ttmlNode)).addChild(TtmlNode.buildTextNode(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT)) {
                            ttmlSubtitle = new TtmlSubtitle((TtmlNode) Assertions.checkNotNull((TtmlNode) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                xmlPullParserNewPullParser.next();
            }
            return (Subtitle) Assertions.checkNotNull(ttmlSubtitle);
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final /* synthetic */ void reset() {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        LegacySubtitleUtil.toCuesWithTiming(parseToLegacySubtitle(bArr, i, i2), outputOptions, consumer);
    }
}
