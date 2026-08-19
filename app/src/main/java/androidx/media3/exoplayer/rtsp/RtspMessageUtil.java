package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import com.google.common.base.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import com.google.common.collect.O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
import com.google.common.collect.O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo;
import com.google.common.collect.O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import com.google.common.collect.O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0;
import com.google.common.collect.O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class RtspMessageUtil {
    public static final long DEFAULT_RTSP_TIMEOUT_MS = 60000;
    private static final String RTSP_VERSION = "RTSP/1.0";
    private static final Pattern REQUEST_LINE_PATTERN = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");
    private static final Pattern STATUS_LINE_PATTERN = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");
    private static final Pattern CONTENT_LENGTH_HEADER_PATTERN = Pattern.compile("Content-Length:\\s?(\\d+)", 2);
    private static final Pattern SESSION_HEADER_PATTERN = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");
    private static final Pattern WWW_AUTHENTICATION_HEADER_DIGEST_PATTERN = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");
    private static final Pattern WWW_AUTHENTICATION_HEADER_BASIC_PATTERN = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");
    private static final String LF = new String(new byte[]{10});
    private static final String CRLF = new String(new byte[]{13, 10});

    public static final class RtspAuthUserInfo {
        public final String password;
        public final String username;

        public RtspAuthUserInfo(String str, String str2) {
            this.username = str;
            this.password = str2;
        }
    }

    public static final class RtspSessionHeader {
        public final String sessionId;
        public final long timeoutMs;

        public RtspSessionHeader(String str, long j) {
            this.sessionId = str;
            this.timeoutMs = j;
        }
    }

    private RtspMessageUtil() {
    }

    public static void checkManifestExpression(boolean z, @Nullable String str) throws ParserException {
        if (!z) {
            throw ParserException.createForMalformedManifest(str, null);
        }
    }

    public static byte[] convertMessageToByteArray(List<String> list) {
        return new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(CRLF).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(list).getBytes(RtspMessageChannel.CHARSET);
    }

    private static String getRtspStatusReasonPhrase(int i) {
        if (i == 200) {
            return "OK";
        }
        if (i == 461) {
            return "Unsupported Transport";
        }
        if (i == 500) {
            return "Internal Server Error";
        }
        if (i == 505) {
            return "RTSP Version Not Supported";
        }
        if (i == 301) {
            return "Move Permanently";
        }
        if (i == 302) {
            return "Move Temporarily";
        }
        if (i == 400) {
            return "Bad Request";
        }
        if (i == 401) {
            return "Unauthorized";
        }
        if (i == 404) {
            return "Not Found";
        }
        if (i == 405) {
            return "Method Not Allowed";
        }
        switch (i) {
            case 454:
                return "Session Not Found";
            case 455:
                return "Method Not Valid In This State";
            case 456:
                return "Header Field Not Valid";
            case 457:
                return "Invalid Range";
            default:
                throw new IllegalArgumentException();
        }
    }

    public static byte[] getStringBytes(String str) {
        return str.getBytes(RtspMessageChannel.CHARSET);
    }

    public static boolean isRtspResponse(List<String> list) {
        return STATUS_LINE_PATTERN.matcher(list.get(0)).matches();
    }

    public static boolean isRtspStartLine(String str) {
        return REQUEST_LINE_PATTERN.matcher(str).matches() || STATUS_LINE_PATTERN.matcher(str).matches();
    }

    public static long parseContentLengthHeader(String str) {
        try {
            Matcher matcher = CONTENT_LENGTH_HEADER_PATTERN.matcher(str);
            if (matcher.find()) {
                return Long.parseLong((String) Assertions.checkNotNull(matcher.group(1)));
            }
            return -1L;
        } catch (NumberFormatException e) {
            throw ParserException.createForMalformedManifest(str, e);
        }
    }

    public static int parseInt(String str) throws ParserException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw ParserException.createForMalformedManifest(str, e);
        }
    }

    private static int parseMethodString(String str) {
        str.getClass();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                return 0;
        }
    }

    public static O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O parsePublicHeader(@Nullable String str) {
        if (str == null) {
            return O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of();
        }
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        for (String str2 : Util.split(str, ",\\s?")) {
            int methodString = parseMethodString(str2);
            if (methodString != 0) {
                Integer numValueOf = Integer.valueOf(methodString);
                int i2 = i + 1;
                int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000oo0OOOooO0OOO00000oO0o00oo000000Ooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(objArrCopyOf.length, i2);
                if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                }
                objArrCopyOf[i] = numValueOf;
                i = i2;
            }
        }
        return O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.asImmutableList(objArrCopyOf, i);
    }

    public static RtspRequest parseRequest(List<String> list) {
        Matcher matcher = REQUEST_LINE_PATTERN.matcher(list.get(0));
        Assertions.checkArgument(matcher.matches());
        int methodString = parseMethodString((String) Assertions.checkNotNull(matcher.group(1)));
        Uri uri = Uri.parse((String) Assertions.checkNotNull(matcher.group(2)));
        int iIndexOf = list.indexOf("");
        Assertions.checkArgument(iIndexOf > 0);
        return new RtspRequest(uri, methodString, new RtspHeaders.Builder().addAll(list.subList(1, iIndexOf)).build(), new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(CRLF).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(list.subList(iIndexOf + 1, list.size())));
    }

    public static RtspResponse parseResponse(List<String> list) {
        Matcher matcher = STATUS_LINE_PATTERN.matcher(list.get(0));
        Assertions.checkArgument(matcher.matches());
        int i = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)));
        int iIndexOf = list.indexOf("");
        Assertions.checkArgument(iIndexOf > 0);
        return new RtspResponse(i, new RtspHeaders.Builder().addAll(list.subList(1, iIndexOf)).build(), new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(CRLF).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(list.subList(iIndexOf + 1, list.size())));
    }

    public static RtspSessionHeader parseSessionHeader(String str) throws ParserException {
        long j;
        Matcher matcher = SESSION_HEADER_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.createForMalformedManifest(str, null);
        }
        String str2 = (String) Assertions.checkNotNull(matcher.group(1));
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            try {
                j = ((long) Integer.parseInt(strGroup)) * 1000;
            } catch (NumberFormatException e) {
                throw ParserException.createForMalformedManifest(str, e);
            }
        } else {
            j = 60000;
        }
        return new RtspSessionHeader(str2, j);
    }

    @Nullable
    public static RtspAuthUserInfo parseUserInfo(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        String[] strArrSplitAtFirst = Util.splitAtFirst(userInfo, ":");
        return new RtspAuthUserInfo(strArrSplitAtFirst[0], strArrSplitAtFirst[1]);
    }

    public static RtspAuthenticationInfo parseWwwAuthenticateHeader(String str) throws ParserException {
        Matcher matcher = WWW_AUTHENTICATION_HEADER_DIGEST_PATTERN.matcher(str);
        if (matcher.find()) {
            String str2 = (String) Assertions.checkNotNull(matcher.group(1));
            String str3 = (String) Assertions.checkNotNull(matcher.group(3));
            String strGroup = matcher.group(4);
            return new RtspAuthenticationInfo(2, str2, str3, strGroup != null ? strGroup : "");
        }
        Matcher matcher2 = WWW_AUTHENTICATION_HEADER_BASIC_PATTERN.matcher(str);
        if (matcher2.matches()) {
            return new RtspAuthenticationInfo(1, (String) Assertions.checkNotNull(matcher2.group(1)), "", "");
        }
        throw ParserException.createForMalformedManifest("Invalid WWW-Authenticate header " + str, null);
    }

    public static Uri removeUserInfo(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) Assertions.checkNotNull(uri.getEncodedAuthority());
        Assertions.checkArgument(str.contains("@"));
        return uri.buildUpon().encodedAuthority(Util.split(str, "@")[1]).build();
    }

    public static O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O serializeRequest(RtspRequest rtspRequest) {
        Assertions.checkArgument(rtspRequest.headers.get(RtspHeaders.CSEQ) != null);
        O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO = new O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO();
        o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Util.formatInvariant("%s %s %s", toMethodString(rtspRequest.method), rtspRequest.uri, RTSP_VERSION));
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 o000O000OOooOO00OoOooooOOo0o00O00ooO0oo0AsMultiMap = rtspRequest.headers.asMultiMap();
        O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo it = o000O000OOooOO00OoOooooOOo0o00O00ooO0oo0AsMultiMap.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O = o000O000OOooOO00OoOooooOOo0o00O00ooO0oo0AsMultiMap.get((Object) str);
            for (int i = 0; i < o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.size(); i++) {
                o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Util.formatInvariant("%s: %s", str, o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.get(i)));
            }
        }
        o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0("");
        o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(rtspRequest.messageBody);
        return o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
    }

    public static O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O serializeResponse(RtspResponse rtspResponse) {
        Assertions.checkArgument(rtspResponse.headers.get(RtspHeaders.CSEQ) != null);
        O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO = new O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO();
        o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Util.formatInvariant("%s %s %s", RTSP_VERSION, Integer.valueOf(rtspResponse.status), getRtspStatusReasonPhrase(rtspResponse.status)));
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 o000O000OOooOO00OoOooooOOo0o00O00ooO0oo0AsMultiMap = rtspResponse.headers.asMultiMap();
        O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo it = o000O000OOooOO00OoOooooOOo0o00O00ooO0oo0AsMultiMap.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O = o000O000OOooOO00OoOooooOOo0o00O00ooO0oo0AsMultiMap.get((Object) str);
            for (int i = 0; i < o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.size(); i++) {
                o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Util.formatInvariant("%s: %s", str, o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.get(i)));
            }
        }
        o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0("");
        o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(rtspResponse.messageBody);
        return o0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
    }

    public static String[] splitRtspMessageBody(String str) {
        String str2 = CRLF;
        if (!str.contains(str2)) {
            str2 = LF;
        }
        return Util.split(str, str2);
    }

    public static String toMethodString(int i) {
        switch (i) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
