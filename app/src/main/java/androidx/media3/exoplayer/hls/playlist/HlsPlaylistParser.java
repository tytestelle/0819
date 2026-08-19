package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.UriUtil;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.hls.HlsTrackMetadataEntry;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.extractor.mp4.PsshAtomUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class HlsPlaylistParser implements ParsingLoadable.Parser<HlsPlaylist> {
    private static final String ATTR_CLOSED_CAPTIONS_NONE = "CLOSED-CAPTIONS=NONE";
    private static final String ATTR_QUOTED_STRING_VALUE_PATTERN = "\"((?:.|\f)+?)\"";
    private static final String BOOLEAN_FALSE = "NO";
    private static final String BOOLEAN_TRUE = "YES";
    private static final String DATERANGE_CLASS_INTERSTITIALS = "com.apple.hls.interstitial";
    private static final String KEYFORMAT_IDENTITY = "identity";
    private static final String KEYFORMAT_PLAYREADY = "com.microsoft.playready";
    private static final String KEYFORMAT_WIDEVINE_PSSH_BINARY = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    private static final String KEYFORMAT_WIDEVINE_PSSH_JSON = "com.widevine";
    private static final String LOG_TAG = "HlsPlaylistParser";
    private static final String METHOD_AES_128 = "AES-128";
    private static final String METHOD_NONE = "NONE";
    private static final String METHOD_SAMPLE_AES = "SAMPLE-AES";
    private static final String METHOD_SAMPLE_AES_CENC = "SAMPLE-AES-CENC";
    private static final String METHOD_SAMPLE_AES_CTR = "SAMPLE-AES-CTR";
    private static final String PLAYLIST_HEADER = "#EXTM3U";
    private static final String TAG_BYTERANGE = "#EXT-X-BYTERANGE";
    private static final String TAG_DATERANGE = "#EXT-X-DATERANGE";
    private static final String TAG_DEFINE = "#EXT-X-DEFINE";
    private static final String TAG_DISCONTINUITY = "#EXT-X-DISCONTINUITY";
    private static final String TAG_DISCONTINUITY_SEQUENCE = "#EXT-X-DISCONTINUITY-SEQUENCE";
    private static final String TAG_ENDLIST = "#EXT-X-ENDLIST";
    private static final String TAG_GAP = "#EXT-X-GAP";
    private static final String TAG_IFRAME = "#EXT-X-I-FRAMES-ONLY";
    private static final String TAG_INDEPENDENT_SEGMENTS = "#EXT-X-INDEPENDENT-SEGMENTS";
    private static final String TAG_INIT_SEGMENT = "#EXT-X-MAP";
    private static final String TAG_I_FRAME_STREAM_INF = "#EXT-X-I-FRAME-STREAM-INF";
    private static final String TAG_KEY = "#EXT-X-KEY";
    private static final String TAG_MEDIA = "#EXT-X-MEDIA";
    private static final String TAG_MEDIA_DURATION = "#EXTINF";
    private static final String TAG_MEDIA_SEQUENCE = "#EXT-X-MEDIA-SEQUENCE";
    private static final String TAG_PART = "#EXT-X-PART";
    private static final String TAG_PART_INF = "#EXT-X-PART-INF";
    private static final String TAG_PLAYLIST_TYPE = "#EXT-X-PLAYLIST-TYPE";
    private static final String TAG_PREFIX = "#EXT";
    private static final String TAG_PRELOAD_HINT = "#EXT-X-PRELOAD-HINT";
    private static final String TAG_PROGRAM_DATE_TIME = "#EXT-X-PROGRAM-DATE-TIME";
    private static final String TAG_RENDITION_REPORT = "#EXT-X-RENDITION-REPORT";
    private static final String TAG_SERVER_CONTROL = "#EXT-X-SERVER-CONTROL";
    private static final String TAG_SESSION_KEY = "#EXT-X-SESSION-KEY";
    private static final String TAG_SKIP = "#EXT-X-SKIP";
    private static final String TAG_START = "#EXT-X-START";
    private static final String TAG_STREAM_INF = "#EXT-X-STREAM-INF";
    private static final String TAG_TARGET_DURATION = "#EXT-X-TARGETDURATION";
    private static final String TAG_VERSION = "#EXT-X-VERSION";
    private static final String TYPE_AUDIO = "AUDIO";
    private static final String TYPE_CLOSED_CAPTIONS = "CLOSED-CAPTIONS";
    private static final String TYPE_MAP = "MAP";
    private static final String TYPE_PART = "PART";
    private static final String TYPE_SUBTITLES = "SUBTITLES";
    private static final String TYPE_VIDEO = "VIDEO";
    private final HlsMultivariantPlaylist multivariantPlaylist;

    @Nullable
    private final HlsMediaPlaylist previousMediaPlaylist;
    private static final Pattern REGEX_AVERAGE_BANDWIDTH = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_VIDEO = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_AUDIO = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_SUBTITLES = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_CLOSED_CAPTIONS = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_BANDWIDTH = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_CHANNELS = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_VIDEO_RANGE = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    private static final Pattern REGEX_CODECS = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_SUPPLEMENTAL_CODECS = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_RESOLUTION = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern REGEX_FRAME_RATE = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern REGEX_TARGET_DURATION = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern REGEX_ATTR_DURATION = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_ATTR_DURATION_PREFIXED = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_TARGET_DURATION = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    private static final Pattern REGEX_VERSION = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern REGEX_PLAYLIST_TYPE = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern REGEX_CAN_SKIP_UNTIL = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_SKIP_DATE_RANGES = compileBooleanAttrPattern("CAN-SKIP-DATERANGES");
    private static final Pattern REGEX_SKIPPED_SEGMENTS = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final Pattern REGEX_HOLD_BACK = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_HOLD_BACK = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_BLOCK_RELOAD = compileBooleanAttrPattern("CAN-BLOCK-RELOAD");
    private static final Pattern REGEX_MEDIA_SEQUENCE = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern REGEX_MEDIA_DURATION = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern REGEX_MEDIA_TITLE = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern REGEX_LAST_MSN = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern REGEX_LAST_PART = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern REGEX_TIME_OFFSET = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern REGEX_BYTERANGE = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern REGEX_ATTR_BYTERANGE = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern REGEX_BYTERANGE_START = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern REGEX_BYTERANGE_LENGTH = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern REGEX_METHOD = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern REGEX_KEYFORMAT = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_KEYFORMATVERSIONS = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_URI = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_IV = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern REGEX_TYPE = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern REGEX_PRELOAD_HINT_TYPE = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern REGEX_LANGUAGE = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_NAME = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_GROUP_ID = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_CHARACTERISTICS = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_INSTREAM_ID = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern REGEX_AUTOSELECT = compileBooleanAttrPattern("AUTOSELECT");
    private static final Pattern REGEX_DEFAULT = compileBooleanAttrPattern("DEFAULT");
    private static final Pattern REGEX_FORCED = compileBooleanAttrPattern("FORCED");
    private static final Pattern REGEX_INDEPENDENT = compileBooleanAttrPattern("INDEPENDENT");
    private static final Pattern REGEX_GAP = compileBooleanAttrPattern("GAP");
    private static final Pattern REGEX_PRECISE = compileBooleanAttrPattern("PRECISE");
    private static final Pattern REGEX_VALUE = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_IMPORT = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_ID = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_CLASS = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_START_DATE = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_CUE = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_END_DATE = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_PLANNED_DURATION = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_END_ON_NEXT = compileBooleanAttrPattern("END-ON-NEXT");
    private static final Pattern REGEX_ASSET_URI = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_ASSET_LIST_URI = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_RESUME_OFFSET = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern REGEX_PLAYOUT_LIMIT = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    private static final Pattern REGEX_SNAP = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_RESTRICT = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_CONTENT_MAY_VARY = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_TIMELINE_OCCUPIES = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_TIMELINE_STYLE = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_VARIABLE_REFERENCE = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    private static final Pattern REGEX_CLIENT_DEFINED_ATTRIBUTE_PREFIX = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public static final class DeltaUpdateException extends IOException {
    }

    public static class LineIterator {
        private final Queue<String> extraLines;

        @Nullable
        private String next;
        private final BufferedReader reader;

        public LineIterator(Queue<String> queue, BufferedReader bufferedReader) {
            this.extraLines = queue;
            this.reader = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        public boolean hasNext() throws IOException {
            String strTrim;
            if (this.next != null) {
                return true;
            }
            if (!this.extraLines.isEmpty()) {
                this.next = (String) Assertions.checkNotNull(this.extraLines.poll());
                return true;
            }
            do {
                String line = this.reader.readLine();
                this.next = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.next = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.next;
            this.next = null;
            return str;
        }
    }

    public HlsPlaylistParser() {
        this(HlsMultivariantPlaylist.EMPTY, null);
    }

    private static boolean checkPlaylistHeader(BufferedReader bufferedReader) throws IOException {
        int i = bufferedReader.read();
        if (i == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i = bufferedReader.read();
        }
        int iSkipIgnorableWhitespace = skipIgnorableWhitespace(bufferedReader, true, i);
        for (int i2 = 0; i2 < 7; i2++) {
            if (iSkipIgnorableWhitespace != PLAYLIST_HEADER.charAt(i2)) {
                return false;
            }
            iSkipIgnorableWhitespace = bufferedReader.read();
        }
        return Util.isLinebreak(skipIgnorableWhitespace(bufferedReader, false, iSkipIgnorableWhitespace));
    }

    private static Pattern compileBooleanAttrPattern(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    private static DrmInitData getPlaylistProtectionSchemes(@Nullable String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i = 0; i < schemeDataArr.length; i++) {
            schemeDataArr2[i] = schemeDataArr[i].copyWithData(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    @Nullable
    private static String getSegmentEncryptionIV(long j, @Nullable String str, @Nullable String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j);
    }

    @Nullable
    private static HlsMultivariantPlaylist.Variant getVariantWithAudioGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.audioGroupId)) {
                return variant;
            }
        }
        return null;
    }

    @Nullable
    private static HlsMultivariantPlaylist.Variant getVariantWithSubtitleGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.subtitleGroupId)) {
                return variant;
            }
        }
        return null;
    }

    @Nullable
    private static HlsMultivariantPlaylist.Variant getVariantWithVideoGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.videoGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static boolean isDolbyVisionFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        if (!MimeTypes.isDolbyVisionCodec(str2, str3)) {
            return false;
        }
        if (str3 == null) {
            return true;
        }
        if (str == null || str4 == null) {
            return false;
        }
        return (!str.equals("PQ") || str4.equals("db1p")) && (!str.equals("SDR") || str4.equals("db2g")) && (!str.equals("HLG") || str4.startsWith("db4"));
    }

    private static HlsMediaPlaylist.ClientDefinedAttribute parseClientDefinedAttribute(String str, String str2, Map<String, String> map) {
        String strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(str2, "=");
        int length = strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.length() + str.indexOf(strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
        String strSubstring = str.substring(length, (str.length() == length + 1 ? 1 : 2) + length);
        if (strSubstring.startsWith("\"")) {
            return new HlsMediaPlaylist.ClientDefinedAttribute(str2, parseStringAttr(str, Pattern.compile(str2 + "=\"((?:.|\f)+?)\""), map), 0);
        }
        if (strSubstring.equals("0x") || strSubstring.equals("0X")) {
            return new HlsMediaPlaylist.ClientDefinedAttribute(str2, parseStringAttr(str, Pattern.compile(str2 + "=(0[xX][A-F0-9]+)"), map), 1);
        }
        return new HlsMediaPlaylist.ClientDefinedAttribute(str2, parseDoubleAttr(str, Pattern.compile(str2 + "=([\\d\\.]+)\\b")));
    }

    private static double parseDoubleAttr(String str, Pattern pattern) {
        return Double.parseDouble(parseStringAttr(str, pattern, Collections.emptyMap()));
    }

    @Nullable
    private static DrmInitData.SchemeData parseDrmSchemeData(String str, String str2, Map<String, String> map) throws ParserException {
        String optionalStringAttr = parseOptionalStringAttr(str, REGEX_KEYFORMATVERSIONS, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, map);
        if (KEYFORMAT_WIDEVINE_PSSH_BINARY.equals(str2)) {
            String stringAttr = parseStringAttr(str, REGEX_URI, map);
            return new DrmInitData.SchemeData(C.WIDEVINE_UUID, "video/mp4", Base64.decode(stringAttr.substring(stringAttr.indexOf(44)), 0));
        }
        if (KEYFORMAT_WIDEVINE_PSSH_JSON.equals(str2)) {
            return new DrmInitData.SchemeData(C.WIDEVINE_UUID, "hls", Util.getUtf8Bytes(str));
        }
        if (!KEYFORMAT_PLAYREADY.equals(str2) || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(optionalStringAttr)) {
            return null;
        }
        String stringAttr2 = parseStringAttr(str, REGEX_URI, map);
        byte[] bArrDecode = Base64.decode(stringAttr2.substring(stringAttr2.indexOf(44)), 0);
        UUID uuid = C.PLAYREADY_UUID;
        return new DrmInitData.SchemeData(uuid, "video/mp4", PsshAtomUtil.buildPsshAtom(uuid, bArrDecode));
    }

    private static String parseEncryptionScheme(String str) {
        return (METHOD_SAMPLE_AES_CENC.equals(str) || METHOD_SAMPLE_AES_CTR.equals(str)) ? C.CENC_TYPE_cenc : C.CENC_TYPE_cbcs;
    }

    private static int parseIntAttr(String str, Pattern pattern) {
        return Integer.parseInt(parseStringAttr(str, pattern, Collections.emptyMap()));
    }

    private static long parseLongAttr(String str, Pattern pattern) {
        return Long.parseLong(parseStringAttr(str, pattern, Collections.emptyMap()));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 28981. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private static androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist parseMediaPlaylist(
            androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist multivariantPlaylist,
            @androidx.annotation.Nullable androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist previousMediaPlaylist,
            androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.LineIterator iterator,
            java.lang.String baseUri) throws java.io.IOException {
        int playlistType = androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.PLAYLIST_TYPE_UNKNOWN;
        long startOffsetUs = androidx.media3.common.C.TIME_UNSET;
        long mediaSequence = 0L;
        int version = 1;
        long targetDurationUs = androidx.media3.common.C.TIME_UNSET;
        long partTargetDurationUs = androidx.media3.common.C.TIME_UNSET;
        boolean independent = multivariantPlaylist.hasIndependentSegments;
        boolean endTag = false;
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment initSegment =
                previousMediaPlaylist != null ? previousMediaPlaylist.segments.isEmpty() ? null : previousMediaPlaylist.segments.get(0).initializationSegment : null;
        java.util.Map<String,String> variables = new java.util.HashMap<>();
        java.util.Map<String,androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment> inferred = new java.util.HashMap<>();
        java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment> segments = new java.util.ArrayList<>();
        java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part> trailingParts = new java.util.ArrayList<>();
        java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.RenditionReport> renditionReports = new java.util.ArrayList<>();
        java.util.List<String> tags = new java.util.ArrayList<>();
        long segmentDurationUs = 0L;
        String segmentTitle = "";
        boolean hasDiscontinuitySequence = false;
        int discontinuitySequence = 0;
        int relativeDiscontinuitySequence = 0;
        long playlistStartTimeUs = 0L;
        long segmentStartTimeUs = 0L;
        boolean preciseStart = false;
        long byteRangeOffset = 0L;
        long byteRangeLength = androidx.media3.common.C.LENGTH_UNSET;
        long partStartTimeUs = 0L;
        long partByteRangeOffset = 0L;
        boolean iframeOnly = false;
        long segmentMediaSequence = 0L;
        boolean gap = false;
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ServerControl serverControl =
                new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ServerControl(
                        androidx.media3.common.C.TIME_UNSET, false,
                        androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, false);
        androidx.media3.common.DrmInitData playlistProtection = null;
        String keyUri = null;
        String keyIv = null;
        java.util.TreeMap<String,androidx.media3.common.DrmInitData.SchemeData> schemeDatas = new java.util.TreeMap<>();
        String encryptionScheme = null;
        androidx.media3.common.DrmInitData cachedDrm = null;
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part preloadPart = null;

        while (iterator.hasNext()) {
            String line = iterator.next();
            if (line.startsWith(TAG_PREFIX)) tags.add(line);
            if (line.startsWith(TAG_PLAYLIST_TYPE)) {
                String t = parseStringAttr(line, REGEX_PLAYLIST_TYPE, variables);
                if ("VOD".equals(t)) playlistType = androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.PLAYLIST_TYPE_VOD;
                else if ("EVENT".equals(t)) playlistType = androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.PLAYLIST_TYPE_EVENT;
            } else if (line.equals(TAG_IFRAME)) {
                iframeOnly = true;
            } else if (line.startsWith(TAG_START)) {
                startOffsetUs = (long)(parseDoubleAttr(line, REGEX_TIME_OFFSET) * androidx.media3.common.C.MICROS_PER_SECOND);
                preciseStart = parseOptionalBooleanAttribute(line, REGEX_PRECISE, false);
            } else if (line.startsWith(TAG_SERVER_CONTROL)) {
                serverControl = parseServerControl(line);
            } else if (line.startsWith(TAG_PART_INF)) {
                partTargetDurationUs = (long)(parseDoubleAttr(line, REGEX_PART_TARGET_DURATION) * androidx.media3.common.C.MICROS_PER_SECOND);
            } else if (line.startsWith(TAG_INIT_SEGMENT)) {
                String uri = parseStringAttr(line, REGEX_URI, variables);
                String br = parseOptionalStringAttr(line, REGEX_ATTR_BYTERANGE, variables);
                if (br != null) {
                    String[] a = androidx.media3.common.util.Util.split(br, "@");
                    byteRangeLength = Long.parseLong(a[0]);
                    if (a.length > 1) byteRangeOffset = Long.parseLong(a[1]);
                } else byteRangeOffset = 0L;
                if (keyUri != null && keyIv == null) {
                    throw androidx.media3.common.ParserException.createForMalformedManifest(
                            "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                }
                initSegment = new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment(uri, byteRangeOffset, byteRangeLength, keyUri, keyIv);
                if (byteRangeLength != androidx.media3.common.C.LENGTH_UNSET) byteRangeOffset += byteRangeLength;
                byteRangeLength = androidx.media3.common.C.LENGTH_UNSET;
            } else if (line.startsWith(TAG_TARGET_DURATION)) {
                targetDurationUs = parseIntAttr(line, REGEX_TARGET_DURATION) * androidx.media3.common.C.MICROS_PER_SECOND;
            } else if (line.startsWith(TAG_MEDIA_SEQUENCE)) {
                mediaSequence = parseLongAttr(line, REGEX_MEDIA_SEQUENCE);
                segmentMediaSequence = mediaSequence;
            } else if (line.startsWith(TAG_VERSION)) {
                version = parseIntAttr(line, REGEX_VERSION);
            } else if (line.startsWith(TAG_DEFINE)) {
                String imported = parseOptionalStringAttr(line, REGEX_IMPORT, variables);
                if (imported != null) {
                    String value = multivariantPlaylist.variableDefinitions.get(imported);
                    if (value != null) variables.put(imported, value);
                } else {
                    variables.put(parseStringAttr(line, REGEX_NAME, variables), parseStringAttr(line, REGEX_VALUE, variables));
                }
            } else if (line.startsWith(TAG_MEDIA_DURATION)) {
                segmentDurationUs = parseTimeSecondsToUs(line, REGEX_MEDIA_DURATION);
                segmentTitle = parseOptionalStringAttr(line, REGEX_MEDIA_TITLE, "", variables);
            } else if (line.startsWith(TAG_SKIP)) {
                int count = parseIntAttr(line, REGEX_SKIPPED_SEGMENTS);
                if (previousMediaPlaylist == null || !segments.isEmpty()) throw new DeltaUpdateException();
                int from = (int)(mediaSequence - previousMediaPlaylist.mediaSequence);
                int to = from + count;
                if (from < 0 || to > previousMediaPlaylist.segments.size()) throw new DeltaUpdateException();
                for (int i=from;i<to;i++) {
                    androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment seg = previousMediaPlaylist.segments.get(i);
                    if (mediaSequence != previousMediaPlaylist.mediaSequence) {
                        int rd = previousMediaPlaylist.discontinuitySequence - discontinuitySequence + seg.relativeDiscontinuitySequence;
                        seg = seg.copyWith(segmentStartTimeUs, rd);
                    }
                    segments.add(seg);
                    segmentStartTimeUs += seg.durationUs;
                    partStartTimeUs = segmentStartTimeUs;
                    if (seg.byteRangeLength != androidx.media3.common.C.LENGTH_UNSET) byteRangeOffset = seg.byteRangeOffset + seg.byteRangeLength;
                    relativeDiscontinuitySequence = seg.relativeDiscontinuitySequence;
                    initSegment = seg.initializationSegment;
                    cachedDrm = seg.drmInitData;
                    keyUri = seg.fullSegmentEncryptionKeyUri;
                    keyIv = seg.encryptionIV;
                    segmentMediaSequence++;
                }
            } else if (line.startsWith(TAG_KEY)) {
                String method = parseStringAttr(line, REGEX_METHOD, variables);
                String format = parseOptionalStringAttr(line, REGEX_KEYFORMAT, KEYFORMAT_IDENTITY, variables);
                keyUri = null; keyIv = null;
                if (METHOD_NONE.equals(method)) {
                    schemeDatas.clear(); cachedDrm = null; encryptionScheme = null;
                } else {
                    keyIv = parseOptionalStringAttr(line, REGEX_IV, variables);
                    if (KEYFORMAT_IDENTITY.equals(format)) {
                        if (METHOD_AES_128.equals(method)) keyUri = parseStringAttr(line, REGEX_URI, variables);
                    } else {
                        if (encryptionScheme == null) encryptionScheme = parseEncryptionScheme(method);
                        androidx.media3.common.DrmInitData.SchemeData sd = parseDrmSchemeData(line, format, variables);
                        if (sd != null) { cachedDrm = null; schemeDatas.put(format, sd); }
                    }
                }
            } else if (line.startsWith(TAG_BYTERANGE)) {
                String br = parseStringAttr(line, REGEX_BYTERANGE, variables);
                String[] a = androidx.media3.common.util.Util.split(br, "@");
                byteRangeLength = Long.parseLong(a[0]);
                if (a.length > 1) byteRangeOffset = Long.parseLong(a[1]);
            } else if (line.startsWith(TAG_DISCONTINUITY_SEQUENCE)) {
                hasDiscontinuitySequence = true;
                discontinuitySequence = Integer.parseInt(line.substring(line.indexOf(':') + 1));
            } else if (line.equals(TAG_DISCONTINUITY)) {
                relativeDiscontinuitySequence++;
            } else if (line.startsWith(TAG_PROGRAM_DATE_TIME)) {
                if (playlistStartTimeUs == 0L) {
                    long dt = androidx.media3.common.util.Util.msToUs(androidx.media3.common.util.Util.parseXsDateTime(line.substring(line.indexOf(':') + 1)));
                    playlistStartTimeUs = dt - segmentStartTimeUs;
                }
            } else if (line.equals(TAG_GAP)) {
                gap = true;
            } else if (line.equals(TAG_INDEPENDENT_SEGMENTS)) {
                independent = true;
            } else if (line.equals(TAG_ENDLIST)) {
                endTag = true;
            } else if (line.startsWith(TAG_RENDITION_REPORT)) {
                long msn = parseOptionalLongAttr(line, REGEX_LAST_MSN, androidx.media3.common.C.INDEX_UNSET);
                int part = parseOptionalIntAttr(line, REGEX_LAST_PART, androidx.media3.common.C.INDEX_UNSET);
                String uri = parseStringAttr(line, REGEX_URI, variables);
                renditionReports.add(new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.RenditionReport(
                        android.net.Uri.parse(androidx.media3.common.util.UriUtil.resolve(baseUri, uri)), msn, part));
            } else if (line.startsWith(TAG_PRELOAD_HINT)) {
                if (preloadPart != null) continue;
                String type = parseStringAttr(line, REGEX_PRELOAD_HINT_TYPE, variables);
                if (!TYPE_PART.equals(type)) continue;
                String url = parseStringAttr(line, REGEX_URI, variables);
                long start = parseOptionalLongAttr(line, REGEX_BYTERANGE_START, androidx.media3.common.C.LENGTH_UNSET);
                long len = parseOptionalLongAttr(line, REGEX_BYTERANGE_LENGTH, androidx.media3.common.C.LENGTH_UNSET);
                String iv = getSegmentEncryptionIV(segmentMediaSequence, keyUri, keyIv);
                if (cachedDrm == null && !schemeDatas.isEmpty()) {
                    androidx.media3.common.DrmInitData.SchemeData[] data = schemeDatas.values().toArray(new androidx.media3.common.DrmInitData.SchemeData[0]);
                    cachedDrm = new androidx.media3.common.DrmInitData(encryptionScheme, data);
                    if (playlistProtection == null) playlistProtection = getPlaylistProtectionSchemes(encryptionScheme, data);
                }
                if (start == androidx.media3.common.C.LENGTH_UNSET || len != androidx.media3.common.C.LENGTH_UNSET) {
                    preloadPart = new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part(
                            url, initSegment, 0L, relativeDiscontinuitySequence, partStartTimeUs, cachedDrm,
                            keyUri, iv, start != androidx.media3.common.C.LENGTH_UNSET ? start : 0L, len, false, false, true);
                }
            } else if (line.startsWith(TAG_PART)) {
                String iv = getSegmentEncryptionIV(segmentMediaSequence, keyUri, keyIv);
                String url = parseStringAttr(line, REGEX_URI, variables);
                long dur = (long)(parseDoubleAttr(line, REGEX_ATTR_DURATION) * androidx.media3.common.C.MICROS_PER_SECOND);
                boolean ind = parseOptionalBooleanAttribute(line, REGEX_INDEPENDENT, false) || (independent && trailingParts.isEmpty());
                boolean isGap = parseOptionalBooleanAttribute(line, REGEX_GAP, false);
                String br = parseOptionalStringAttr(line, REGEX_ATTR_BYTERANGE, variables);
                long len = androidx.media3.common.C.LENGTH_UNSET;
                if (br != null) {
                    String[] a = androidx.media3.common.util.Util.split(br, "@");
                    len = Long.parseLong(a[0]);
                    if (a.length > 1) partByteRangeOffset = Long.parseLong(a[1]);
                } else partByteRangeOffset = 0L;
                if (cachedDrm == null && !schemeDatas.isEmpty()) {
                    androidx.media3.common.DrmInitData.SchemeData[] data = schemeDatas.values().toArray(new androidx.media3.common.DrmInitData.SchemeData[0]);
                    cachedDrm = new androidx.media3.common.DrmInitData(encryptionScheme, data);
                    if (playlistProtection == null) playlistProtection = getPlaylistProtectionSchemes(encryptionScheme, data);
                }
                trailingParts.add(new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part(
                        url, initSegment, dur, relativeDiscontinuitySequence, partStartTimeUs, cachedDrm,
                        keyUri, iv, partByteRangeOffset, len, isGap, ind, false));
                partStartTimeUs += dur;
                if (len != androidx.media3.common.C.LENGTH_UNSET) partByteRangeOffset += len;
            } else if (!line.startsWith("#")) {
                String iv = getSegmentEncryptionIV(segmentMediaSequence, keyUri, keyIv);
                segmentMediaSequence++;
                String uri = replaceVariableReferences(line, variables);
                androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment inferredInit = inferred.get(uri);
                if (byteRangeLength == androidx.media3.common.C.LENGTH_UNSET) byteRangeOffset = 0L;
                else if (iframeOnly && initSegment == null && inferredInit == null) {
                    inferredInit = new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment(uri, 0L, byteRangeOffset, null, null);
                    inferred.put(uri, inferredInit);
                }
                if (cachedDrm == null && !schemeDatas.isEmpty()) {
                    androidx.media3.common.DrmInitData.SchemeData[] data = schemeDatas.values().toArray(new androidx.media3.common.DrmInitData.SchemeData[0]);
                    cachedDrm = new androidx.media3.common.DrmInitData(encryptionScheme, data);
                    if (playlistProtection == null) playlistProtection = getPlaylistProtectionSchemes(encryptionScheme, data);
                }
                segments.add(new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment(
                        uri, initSegment != null ? initSegment : inferredInit, segmentTitle, segmentDurationUs,
                        relativeDiscontinuitySequence, segmentStartTimeUs, cachedDrm, keyUri, iv,
                        byteRangeOffset, byteRangeLength, gap, trailingParts));
                segmentStartTimeUs += segmentDurationUs;
                partStartTimeUs = segmentStartTimeUs;
                segmentDurationUs = 0L; segmentTitle = ""; trailingParts = new java.util.ArrayList<>();
                if (byteRangeLength != androidx.media3.common.C.LENGTH_UNSET) byteRangeOffset += byteRangeLength;
                byteRangeLength = androidx.media3.common.C.LENGTH_UNSET; gap = false;
            }
        }

        java.util.Map<android.net.Uri,androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.RenditionReport> reportMap = new java.util.HashMap<>();
        for (androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.RenditionReport report : renditionReports) {
            long msn = report.lastMediaSequence;
            if (msn == androidx.media3.common.C.INDEX_UNSET) msn = mediaSequence + segments.size() - (trailingParts.isEmpty() ? 1 : 0);
            int part = report.lastPartIndex;
            if (part == androidx.media3.common.C.INDEX_UNSET && partTargetDurationUs != androidx.media3.common.C.TIME_UNSET && (!trailingParts.isEmpty() || !segments.isEmpty())) {
                java.util.List<androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part> lastParts = trailingParts.isEmpty() ? segments.get(segments.size()-1).parts : trailingParts;
                part = lastParts.size() - 1;
            }
            reportMap.put(report.playlistUri, new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.RenditionReport(report.playlistUri, msn, part));
        }
        if (preloadPart != null) trailingParts.add(preloadPart);

        return new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist(
                playlistType, baseUri, tags, startOffsetUs, preciseStart, playlistStartTimeUs,
                hasDiscontinuitySequence, discontinuitySequence, mediaSequence, version,
                targetDurationUs, partTargetDurationUs, independent, endTag, playlistStartTimeUs != 0L,
                playlistProtection, segments, trailingParts, serverControl, reportMap,
                java.util.Collections.emptyList());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:165:0x024f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0158  */
    /* JADX WARN: Code duplicated, block: B:47:0x015f  */
    /* JADX WARN: Code duplicated, block: B:51:0x016c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0185  */
    /* JADX WARN: Code duplicated, block: B:57:0x018f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0194  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x021e  */
    /* JADX WARN: Code duplicated, block: B:93:0x035f  */
    /* JADX WARN: Failed to find 'out' block for switch in B:110:0x038c. Please report as an issue. */
    private static HlsMultivariantPlaylist parseMultivariantPlaylist(LineIterator lineIterator, String str) throws IOException {
        ArrayList arrayList;
        String mediaMimeType;
        int i;
        String str2;
        Format formatBuild;
        int i2;
        String mediaMimeType2;
        int i3;
        ArrayList arrayList2;
        String strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;
        String str3;
        String codecsOfType;
        String optionalStringAttr;
        int i4;
        int i5;
        String optionalStringAttr2;
        float f;
        Uri uriResolveToUri;
        HashMap map;
        ArrayList arrayList3;
        String codecsWithoutType;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        boolean z = false;
        boolean zContains = false;
        while (true) {
            boolean zHasNext = lineIterator.hasNext();
            String str4 = MimeTypes.APPLICATION_M3U8;
            if (!zHasNext) {
                HashMap map4 = map2;
                ArrayList arrayList12 = arrayList5;
                ArrayList arrayList13 = arrayList6;
                ArrayList arrayList14 = arrayList7;
                ArrayList arrayList15 = arrayList8;
                ArrayList arrayList16 = arrayList9;
                ArrayList arrayList17 = arrayList10;
                ArrayList arrayList18 = arrayList11;
                ArrayList arrayList19 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i6 = 0;
                while (i6 < arrayList4.size()) {
                    HlsMultivariantPlaylist.Variant variant = (HlsMultivariantPlaylist.Variant) arrayList4.get(i6);
                    if (hashSet.add(variant.url)) {
                        Assertions.checkState(variant.format.metadata == null);
                        i3 = 1;
                        arrayList19.add(variant.copyWithFormat(variant.format.buildUpon().setMetadata(new Metadata(new HlsTrackMetadataEntry(null, null, (List) Assertions.checkNotNull((ArrayList) map4.get(variant.url))))).build()));
                    } else {
                        i3 = 1;
                    }
                    i6 += i3;
                }
                Uri uri = null;
                ArrayList arrayList20 = null;
                Format format = null;
                int i7 = 0;
                while (i7 < arrayList16.size()) {
                    ArrayList arrayList21 = arrayList16;
                    String str5 = (String) arrayList21.get(i7);
                    String stringAttr = parseStringAttr(str5, REGEX_GROUP_ID, map3);
                    String stringAttr2 = parseStringAttr(str5, REGEX_NAME, map3);
                    Format.Builder language = new Format.Builder().setId(stringAttr + ":" + stringAttr2).setLabel(stringAttr2).setContainerMimeType(str4).setSelectionFlags(parseSelectionFlags(str5)).setRoleFlags(parseRoleFlags(str5, map3)).setLanguage(parseOptionalStringAttr(str5, REGEX_LANGUAGE, map3));
                    String optionalStringAttr3 = parseOptionalStringAttr(str5, REGEX_URI, map3);
                    Uri uriResolveToUri2 = optionalStringAttr3 == null ? uri : UriUtil.resolveToUri(str, optionalStringAttr3);
                    String str6 = str4;
                    arrayList16 = arrayList21;
                    Metadata metadata = new Metadata(new HlsTrackMetadataEntry(stringAttr, stringAttr2, Collections.emptyList()));
                    String stringAttr3 = parseStringAttr(str5, REGEX_TYPE, map3);
                    stringAttr3.getClass();
                    switch (stringAttr3) {
                        case "SUBTITLES":
                            format = format;
                            arrayList13 = arrayList13;
                            arrayList = arrayList12;
                            HlsMultivariantPlaylist.Variant variantWithSubtitleGroup = getVariantWithSubtitleGroup(arrayList4, stringAttr);
                            if (variantWithSubtitleGroup != null) {
                                String codecsOfType2 = Util.getCodecsOfType(variantWithSubtitleGroup.format.codecs, 3);
                                language.setCodecs(codecsOfType2);
                                mediaMimeType = MimeTypes.getMediaMimeType(codecsOfType2);
                            } else {
                                mediaMimeType = null;
                            }
                            if (mediaMimeType == null) {
                                mediaMimeType = MimeTypes.TEXT_VTT;
                            }
                            language.setSampleMimeType(mediaMimeType).setMetadata(metadata);
                            if (uriResolveToUri2 != null) {
                                HlsMultivariantPlaylist.Rendition rendition = new HlsMultivariantPlaylist.Rendition(uriResolveToUri2, language.build(), stringAttr, stringAttr2);
                                arrayList14 = arrayList14;
                                arrayList14.add(rendition);
                            } else {
                                arrayList14 = arrayList14;
                                Log.w(LOG_TAG, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            formatBuild = format;
                            i2 = 1;
                            break;
                        case "CLOSED-CAPTIONS":
                            Format format2 = format;
                            arrayList13 = arrayList13;
                            arrayList = arrayList12;
                            String stringAttr4 = parseStringAttr(str5, REGEX_INSTREAM_ID, map3);
                            if (stringAttr4.startsWith("CC")) {
                                i = Integer.parseInt(stringAttr4.substring(2));
                                str2 = MimeTypes.APPLICATION_CEA608;
                            } else {
                                i = Integer.parseInt(stringAttr4.substring(7));
                                str2 = MimeTypes.APPLICATION_CEA708;
                            }
                            if (arrayList20 == null) {
                                arrayList20 = new ArrayList();
                            }
                            language.setSampleMimeType(str2).setAccessibilityChannel(i);
                            arrayList20.add(language.build());
                            formatBuild = format2;
                            i2 = 1;
                            break;
                        case "AUDIO":
                            arrayList = arrayList12;
                            HlsMultivariantPlaylist.Variant variantWithAudioGroup = getVariantWithAudioGroup(arrayList4, stringAttr);
                            if (variantWithAudioGroup != null) {
                                String codecsOfType3 = Util.getCodecsOfType(variantWithAudioGroup.format.codecs, 1);
                                language.setCodecs(codecsOfType3);
                                mediaMimeType2 = MimeTypes.getMediaMimeType(codecsOfType3);
                            } else {
                                mediaMimeType2 = null;
                            }
                            String optionalStringAttr4 = parseOptionalStringAttr(str5, REGEX_CHANNELS, map3);
                            if (optionalStringAttr4 != null) {
                                language.setChannelCount(Integer.parseInt(Util.splitAtFirst(optionalStringAttr4, ServiceReference.DELIMITER)[0]));
                                if (MimeTypes.AUDIO_E_AC3.equals(mediaMimeType2) && optionalStringAttr4.endsWith("/JOC")) {
                                    language.setCodecs(MimeTypes.CODEC_E_AC3_JOC);
                                    mediaMimeType2 = MimeTypes.AUDIO_E_AC3_JOC;
                                }
                            }
                            language.setSampleMimeType(mediaMimeType2);
                            if (uriResolveToUri2 == null) {
                                arrayList13 = arrayList13;
                                if (variantWithAudioGroup != null) {
                                    formatBuild = language.build();
                                    i2 = 1;
                                }
                                break;
                            } else {
                                language.setMetadata(metadata);
                                arrayList13 = arrayList13;
                                arrayList13.add(new HlsMultivariantPlaylist.Rendition(uriResolveToUri2, language.build(), stringAttr, stringAttr2));
                            }
                            arrayList14 = arrayList14;
                            formatBuild = format;
                            i2 = 1;
                            break;
                        case "VIDEO":
                            HlsMultivariantPlaylist.Variant variantWithVideoGroup = getVariantWithVideoGroup(arrayList4, stringAttr);
                            if (variantWithVideoGroup != null) {
                                Format format3 = variantWithVideoGroup.format;
                                String codecsOfType4 = Util.getCodecsOfType(format3.codecs, 2);
                                language.setCodecs(codecsOfType4).setSampleMimeType(MimeTypes.getMediaMimeType(codecsOfType4)).setWidth(format3.width).setHeight(format3.height).setFrameRate(format3.frameRate);
                            }
                            if (uriResolveToUri2 != null) {
                                language.setMetadata(metadata);
                                arrayList = arrayList12;
                                arrayList.add(new HlsMultivariantPlaylist.Rendition(uriResolveToUri2, language.build(), stringAttr, stringAttr2));
                            }
                            formatBuild = format;
                            i2 = 1;
                        default:
                            arrayList = arrayList12;
                            formatBuild = format;
                            i2 = 1;
                            break;
                    }
                    i7 += i2;
                    arrayList12 = arrayList;
                    arrayList13 = arrayList13;
                    arrayList14 = arrayList14;
                    uri = null;
                    format = formatBuild;
                    str4 = str6;
                }
                return new HlsMultivariantPlaylist(str, arrayList18, arrayList19, arrayList12, arrayList13, arrayList14, arrayList15, format, zContains ? Collections.emptyList() : arrayList20, z, map3, arrayList17);
            }
            String next = lineIterator.next();
            if (next.startsWith(TAG_PREFIX)) {
                arrayList11.add(next);
            }
            boolean zStartsWith = next.startsWith(TAG_I_FRAME_STREAM_INF);
            if (next.startsWith(TAG_DEFINE)) {
                map3.put(parseStringAttr(next, REGEX_NAME, map3), parseStringAttr(next, REGEX_VALUE, map3));
            } else {
                if (next.equals(TAG_INDEPENDENT_SEGMENTS)) {
                    map = map2;
                    arrayList2 = arrayList9;
                    arrayList10 = arrayList10;
                    z = true;
                } else if (next.startsWith(TAG_MEDIA)) {
                    arrayList9.add(next);
                } else if (next.startsWith(TAG_SESSION_KEY)) {
                    DrmInitData.SchemeData drmSchemeData = parseDrmSchemeData(next, parseOptionalStringAttr(next, REGEX_KEYFORMAT, KEYFORMAT_IDENTITY, map3), map3);
                    if (drmSchemeData != null) {
                        arrayList10.add(new DrmInitData(parseEncryptionScheme(parseStringAttr(next, REGEX_METHOD, map3)), drmSchemeData));
                    }
                } else if (next.startsWith(TAG_STREAM_INF) || zStartsWith) {
                    zContains |= next.contains(ATTR_CLOSED_CAPTIONS_NONE);
                    int i8 = zStartsWith ? 16384 : 0;
                    int intAttr = parseIntAttr(next, REGEX_BANDWIDTH);
                    int optionalIntAttr = parseOptionalIntAttr(next, REGEX_AVERAGE_BANDWIDTH, -1);
                    String optionalStringAttr5 = parseOptionalStringAttr(next, REGEX_VIDEO_RANGE, map3);
                    String optionalStringAttr6 = parseOptionalStringAttr(next, REGEX_CODECS, map3);
                    String optionalStringAttr7 = parseOptionalStringAttr(next, REGEX_SUPPLEMENTAL_CODECS, map3);
                    if (optionalStringAttr7 != null) {
                        String[] strArrSplit = Util.split(Util.splitAtFirst(optionalStringAttr7, ",")[0], ServiceReference.DELIMITER);
                        String str7 = strArrSplit[0];
                        arrayList2 = arrayList9;
                        if (strArrSplit.length > 1) {
                            str3 = strArrSplit[1];
                            map2 = map2;
                            strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = str7;
                        } else {
                            strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = str7;
                        }
                        codecsOfType = Util.getCodecsOfType(optionalStringAttr6, 2);
                        if (isDolbyVisionFormat(optionalStringAttr5, codecsOfType, strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o, str3)) {
                            if (strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o == null) {
                                strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = codecsOfType;
                            }
                            codecsWithoutType = Util.getCodecsWithoutType(optionalStringAttr6, 2);
                            if (codecsWithoutType != null) {
                                strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o, ",", codecsWithoutType);
                            }
                            optionalStringAttr6 = strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;
                        }
                        optionalStringAttr = parseOptionalStringAttr(next, REGEX_RESOLUTION, map3);
                        if (optionalStringAttr != null) {
                            String[] strArrSplit2 = Util.split(optionalStringAttr, "x");
                            i5 = Integer.parseInt(strArrSplit2[0]);
                            i4 = Integer.parseInt(strArrSplit2[1]);
                            if (i5 > 0 || i4 <= 0) {
                                i4 = -1;
                                i5 = -1;
                            }
                        } else {
                            i4 = -1;
                            i5 = -1;
                        }
                        optionalStringAttr2 = parseOptionalStringAttr(next, REGEX_FRAME_RATE, map3);
                        if (optionalStringAttr2 != null) {
                            f = Float.parseFloat(optionalStringAttr2);
                        } else {
                            f = -1.0f;
                        }
                        String optionalStringAttr8 = parseOptionalStringAttr(next, REGEX_VIDEO, map3);
                        String optionalStringAttr9 = parseOptionalStringAttr(next, REGEX_AUDIO, map3);
                        String optionalStringAttr10 = parseOptionalStringAttr(next, REGEX_SUBTITLES, map3);
                        String optionalStringAttr11 = parseOptionalStringAttr(next, REGEX_CLOSED_CAPTIONS, map3);
                        if (zStartsWith) {
                            uriResolveToUri = UriUtil.resolveToUri(str, parseStringAttr(next, REGEX_URI, map3));
                        } else {
                            if (lineIterator.hasNext()) {
                                throw ParserException.createForMalformedManifest("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            uriResolveToUri = UriUtil.resolveToUri(str, replaceVariableReferences(lineIterator.next(), map3));
                        }
                        arrayList4.add(new HlsMultivariantPlaylist.Variant(uriResolveToUri, new Format.Builder().setId(arrayList4.size()).setContainerMimeType(MimeTypes.APPLICATION_M3U8).setCodecs(optionalStringAttr6).setAverageBitrate(optionalIntAttr).setPeakBitrate(intAttr).setWidth(i5).setHeight(i4).setFrameRate(f).setRoleFlags(i8).build(), optionalStringAttr8, optionalStringAttr9, optionalStringAttr10, optionalStringAttr11));
                        map = map2;
                        arrayList3 = (ArrayList) map.get(uriResolveToUri);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            map.put(uriResolveToUri, arrayList3);
                        }
                        arrayList3.add(new HlsTrackMetadataEntry.VariantInfo(optionalIntAttr, intAttr, optionalStringAttr8, optionalStringAttr9, optionalStringAttr10, optionalStringAttr11));
                    } else {
                        arrayList2 = arrayList9;
                        strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = null;
                    }
                    str3 = null;
                    codecsOfType = Util.getCodecsOfType(optionalStringAttr6, 2);
                    if (isDolbyVisionFormat(optionalStringAttr5, codecsOfType, strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o, str3)) {
                        if (strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o == null) {
                            strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = codecsOfType;
                        }
                        codecsWithoutType = Util.getCodecsWithoutType(optionalStringAttr6, 2);
                        if (codecsWithoutType != null) {
                            strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o, ",", codecsWithoutType);
                        }
                        optionalStringAttr6 = strO0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;
                    }
                    optionalStringAttr = parseOptionalStringAttr(next, REGEX_RESOLUTION, map3);
                    if (optionalStringAttr != null) {
                        String[] strArrSplit3 = Util.split(optionalStringAttr, "x");
                        i5 = Integer.parseInt(strArrSplit3[0]);
                        i4 = Integer.parseInt(strArrSplit3[1]);
                        if (i5 > 0) {
                            i4 = -1;
                            i5 = -1;
                        } else {
                            i4 = -1;
                            i5 = -1;
                        }
                    } else {
                        i4 = -1;
                        i5 = -1;
                    }
                    optionalStringAttr2 = parseOptionalStringAttr(next, REGEX_FRAME_RATE, map3);
                    if (optionalStringAttr2 != null) {
                        f = Float.parseFloat(optionalStringAttr2);
                    } else {
                        f = -1.0f;
                    }
                    String optionalStringAttr12 = parseOptionalStringAttr(next, REGEX_VIDEO, map3);
                    String optionalStringAttr13 = parseOptionalStringAttr(next, REGEX_AUDIO, map3);
                    String optionalStringAttr14 = parseOptionalStringAttr(next, REGEX_SUBTITLES, map3);
                    String optionalStringAttr15 = parseOptionalStringAttr(next, REGEX_CLOSED_CAPTIONS, map3);
                    if (zStartsWith) {
                        uriResolveToUri = UriUtil.resolveToUri(str, parseStringAttr(next, REGEX_URI, map3));
                    } else {
                        if (lineIterator.hasNext()) {
                            throw ParserException.createForMalformedManifest("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        uriResolveToUri = UriUtil.resolveToUri(str, replaceVariableReferences(lineIterator.next(), map3));
                    }
                    arrayList4.add(new HlsMultivariantPlaylist.Variant(uriResolveToUri, new Format.Builder().setId(arrayList4.size()).setContainerMimeType(MimeTypes.APPLICATION_M3U8).setCodecs(optionalStringAttr6).setAverageBitrate(optionalIntAttr).setPeakBitrate(intAttr).setWidth(i5).setHeight(i4).setFrameRate(f).setRoleFlags(i8).build(), optionalStringAttr12, optionalStringAttr13, optionalStringAttr14, optionalStringAttr15));
                    map = map2;
                    arrayList3 = (ArrayList) map.get(uriResolveToUri);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        map.put(uriResolveToUri, arrayList3);
                    }
                    arrayList3.add(new HlsTrackMetadataEntry.VariantInfo(optionalIntAttr, intAttr, optionalStringAttr12, optionalStringAttr13, optionalStringAttr14, optionalStringAttr15));
                }
                map2 = map;
                arrayList10 = arrayList10;
                arrayList8 = arrayList8;
                arrayList11 = arrayList11;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
                arrayList5 = arrayList5;
                arrayList9 = arrayList2;
            }
            map = map2;
            arrayList2 = arrayList9;
            arrayList10 = arrayList10;
            map2 = map;
            arrayList10 = arrayList10;
            arrayList8 = arrayList8;
            arrayList11 = arrayList11;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
            arrayList5 = arrayList5;
            arrayList9 = arrayList2;
        }
    }

    private static boolean parseOptionalBooleanAttribute(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? BOOLEAN_TRUE.equals(matcher.group(1)) : z;
    }

    private static double parseOptionalDoubleAttr(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) Assertions.checkNotNull(matcher.group(1))) : d;
    }

    private static int parseOptionalIntAttr(String str, Pattern pattern, int i) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))) : i;
    }

    private static long parseOptionalLongAttr(String str, Pattern pattern, long j) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) Assertions.checkNotNull(matcher.group(1))) : j;
    }

    @Nullable
    private static String parseOptionalStringAttr(String str, Pattern pattern, Map<String, String> map) {
        return parseOptionalStringAttr(str, pattern, null, map);
    }

    private static int parseRoleFlags(String str, Map<String, String> map) {
        String optionalStringAttr = parseOptionalStringAttr(str, REGEX_CHARACTERISTICS, map);
        if (TextUtils.isEmpty(optionalStringAttr)) {
            return 0;
        }
        String[] strArrSplit = Util.split(optionalStringAttr, ",");
        int i = Util.contains(strArrSplit, "public.accessibility.describes-video") ? 512 : 0;
        if (Util.contains(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
            i |= 4096;
        }
        if (Util.contains(strArrSplit, "public.accessibility.describes-music-and-sound")) {
            i |= 1024;
        }
        return Util.contains(strArrSplit, "public.easy-to-read") ? i | 8192 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int parseSelectionFlags(String str) {
        int flags = parseOptionalBooleanAttribute(str, REGEX_DEFAULT, false) ? 1 : 0;
        if (parseOptionalBooleanAttribute(str, REGEX_FORCED, false)) flags |= 2;
        if (parseOptionalBooleanAttribute(str, REGEX_AUTOSELECT, false)) flags |= 4;
        return flags;
    }

    private static HlsMediaPlaylist.ServerControl parseServerControl(String str) {
        double optionalDoubleAttr = parseOptionalDoubleAttr(str, REGEX_CAN_SKIP_UNTIL, -9.223372036854776E18d);
        long j = C.TIME_UNSET;
        long j2 = optionalDoubleAttr == -9.223372036854776E18d ? -9223372036854775807L : (long) (optionalDoubleAttr * 1000000.0d);
        boolean optionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_CAN_SKIP_DATE_RANGES, false);
        double optionalDoubleAttr2 = parseOptionalDoubleAttr(str, REGEX_HOLD_BACK, -9.223372036854776E18d);
        long j3 = optionalDoubleAttr2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (optionalDoubleAttr2 * 1000000.0d);
        double optionalDoubleAttr3 = parseOptionalDoubleAttr(str, REGEX_PART_HOLD_BACK, -9.223372036854776E18d);
        if (optionalDoubleAttr3 != -9.223372036854776E18d) {
            j = (long) (optionalDoubleAttr3 * 1000000.0d);
        }
        return new HlsMediaPlaylist.ServerControl(j2, optionalBooleanAttribute, j3, j, parseOptionalBooleanAttribute(str, REGEX_CAN_BLOCK_RELOAD, false));
    }

    private static String parseStringAttr(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String optionalStringAttr = parseOptionalStringAttr(str, pattern, map);
        if (optionalStringAttr != null) {
            return optionalStringAttr;
        }
        throw ParserException.createForMalformedManifest("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    private static long parseTimeSecondsToUs(String str, Pattern pattern) {
        return new BigDecimal(parseStringAttr(str, pattern, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static String replaceVariableReferences(String str, Map<String, String> map) {
        Matcher matcher = REGEX_VARIABLE_REFERENCE.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int skipIgnorableWhitespace(BufferedReader bufferedReader, boolean z, int i) throws IOException {
        while (i != -1 && Character.isWhitespace(i) && (z || !Util.isLinebreak(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    public HlsPlaylistParser(HlsMultivariantPlaylist hlsMultivariantPlaylist, @Nullable HlsMediaPlaylist hlsMediaPlaylist) {
        this.multivariantPlaylist = hlsMultivariantPlaylist;
        this.previousMediaPlaylist = hlsMediaPlaylist;
    }

    private static String parseOptionalStringAttr(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) Assertions.checkNotNull(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : replaceVariableReferences(str2, map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public HlsPlaylist parse(Uri uri, InputStream inputStream) throws ParserException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!checkPlaylistHeader(bufferedReader)) {
                throw ParserException.createForMalformedManifest("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    Util.closeQuietly(bufferedReader);
                    throw ParserException.createForMalformedManifest("Failed to parse the playlist, could not identify any tags.", null);
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith(TAG_STREAM_INF)) {
                        arrayDeque.add(strTrim);
                        HlsMultivariantPlaylist multivariantPlaylist = parseMultivariantPlaylist(new LineIterator(arrayDeque, bufferedReader), uri.toString());
                        Util.closeQuietly(bufferedReader);
                        return multivariantPlaylist;
                    }
                    if (!strTrim.startsWith(TAG_TARGET_DURATION) && !strTrim.startsWith(TAG_MEDIA_SEQUENCE) && !strTrim.startsWith(TAG_MEDIA_DURATION) && !strTrim.startsWith(TAG_KEY) && !strTrim.startsWith(TAG_BYTERANGE) && !strTrim.equals(TAG_DISCONTINUITY) && !strTrim.equals(TAG_DISCONTINUITY_SEQUENCE) && !strTrim.equals(TAG_ENDLIST)) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    HlsMediaPlaylist mediaPlaylist = parseMediaPlaylist(this.multivariantPlaylist, this.previousMediaPlaylist, new LineIterator(arrayDeque, bufferedReader), uri.toString());
                    Util.closeQuietly(bufferedReader);
                    return mediaPlaylist;
                }
            }
        } catch (Throwable th) {
            Util.closeQuietly(bufferedReader);
            throw th;
        }
    }
}
