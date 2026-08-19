package androidx.media3.exoplayer.rtsp;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Util;
import com.google.common.collect.O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import com.google.common.collect.O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo;
import com.google.common.collect.O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class RtspHeaders {
    public static final String ACCEPT = "Accept";
    public static final String ALLOW = "Allow";
    public static final String AUTHORIZATION = "Authorization";
    public static final String BANDWIDTH = "Bandwidth";
    public static final String BLOCKSIZE = "Blocksize";
    public static final String CACHE_CONTROL = "Cache-Control";
    public static final String CONNECTION = "Connection";
    public static final String CONTENT_BASE = "Content-Base";
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String CONTENT_LANGUAGE = "Content-Language";
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String CONTENT_LOCATION = "Content-Location";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CSEQ = "CSeq";
    public static final String DATE = "Date";
    public static final RtspHeaders EMPTY = new Builder().build();
    public static final String EXPIRES = "Expires";
    public static final String LOCATION = "Location";
    public static final String PROXY_AUTHENTICATE = "Proxy-Authenticate";
    public static final String PROXY_REQUIRE = "Proxy-Require";
    public static final String PUBLIC = "Public";
    public static final String RANGE = "Range";
    public static final String RTCP_INTERVAL = "RTCP-Interval";
    public static final String RTP_INFO = "RTP-Info";
    public static final String SCALE = "Scale";
    public static final String SESSION = "Session";
    public static final String SPEED = "Speed";
    public static final String SUPPORTED = "Supported";
    public static final String TIMESTAMP = "Timestamp";
    public static final String TRANSPORT = "Transport";
    public static final String USER_AGENT = "User-Agent";
    public static final String VIA = "Via";
    public static final String WWW_AUTHENTICATE = "WWW-Authenticate";
    private final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 namesAndValues;

    public static final class Builder {
        private final O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo namesAndValuesBuilder;

        @CanIgnoreReturnValue
        public Builder add(String str, String str2) {
            this.namesAndValuesBuilder.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(RtspHeaders.convertToStandardHeaderName(str.trim()), str2.trim());
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(List<String> list) {
            for (int i = 0; i < list.size(); i++) {
                String[] strArrSplitAtFirst = Util.splitAtFirst(list.get(i), ":\\s?");
                if (strArrSplitAtFirst.length == 2) {
                    add(strArrSplitAtFirst[0], strArrSplitAtFirst[1]);
                }
            }
            return this;
        }

        public RtspHeaders build() {
            return new RtspHeaders(this);
        }

        public Builder() {
            this.namesAndValuesBuilder = new O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo();
        }

        @CanIgnoreReturnValue
        public Builder addAll(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                add(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public Builder(String str, @Nullable String str2, int i) {
            this();
            add("User-Agent", str);
            add(RtspHeaders.CSEQ, String.valueOf(i));
            if (str2 != null) {
                add(RtspHeaders.SESSION, str2);
            }
        }

        private Builder(O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo) {
            this.namesAndValuesBuilder = o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String convertToStandardHeaderName(String str) {
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, "Accept")) {
            return "Accept";
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, ALLOW)) {
            return ALLOW;
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, AUTHORIZATION)) {
            return AUTHORIZATION;
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, BANDWIDTH)) {
            return BANDWIDTH;
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, BLOCKSIZE)) {
            return BLOCKSIZE;
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, "Cache-Control")) {
            return "Cache-Control";
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, "Connection")) {
            return "Connection";
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, CONTENT_BASE)) {
            return CONTENT_BASE;
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, "Content-Encoding")) {
            return "Content-Encoding";
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, CONTENT_LANGUAGE)) {
            return CONTENT_LANGUAGE;
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, "Content-Length")) {
            return "Content-Length";
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, CONTENT_LOCATION)) {
            return CONTENT_LOCATION;
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, "Content-Type")) {
            return "Content-Type";
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, CSEQ)) {
            return CSEQ;
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, "Date")) {
            return "Date";
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, "Expires")) {
            return "Expires";
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, "Location")) {
            return "Location";
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, PROXY_AUTHENTICATE)) {
            return PROXY_AUTHENTICATE;
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, PROXY_REQUIRE)) {
            return PROXY_REQUIRE;
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, PUBLIC)) {
            return PUBLIC;
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, "Range")) {
            return "Range";
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, RTP_INFO)) {
            return RTP_INFO;
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, RTCP_INTERVAL)) {
            return RTCP_INTERVAL;
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, SCALE)) {
            return SCALE;
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, SESSION)) {
            return SESSION;
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, SPEED)) {
            return SPEED;
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, SUPPORTED)) {
            return SUPPORTED;
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, TIMESTAMP)) {
            return TIMESTAMP;
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, TRANSPORT)) {
            return TRANSPORT;
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, "User-Agent")) {
            return "User-Agent";
        }
        if (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, VIA)) {
            return VIA;
        }
        return O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, WWW_AUTHENTICATE) ? WWW_AUTHENTICATE : str;
    }

    public O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0 asMultiMap() {
        return this.namesAndValues;
    }

    public Builder buildUpon() {
        O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo = new O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo();
        for (Map.Entry entry : this.namesAndValues.asMap().entrySet()) {
            o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(entry.getKey(), (Iterable) entry.getValue());
        }
        return new Builder(o000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RtspHeaders) {
            return this.namesAndValues.equals(((RtspHeaders) obj).namesAndValues);
        }
        return false;
    }

    @Nullable
    public String get(String str) {
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OValues = values(str);
        if (o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OValues.isEmpty()) {
            return null;
        }
        return (String) O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OValues);
    }

    public int hashCode() {
        return this.namesAndValues.hashCode();
    }

    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O values(String str) {
        return this.namesAndValues.get((Object) convertToStandardHeaderName(str));
    }

    private RtspHeaders(Builder builder) {
        this.namesAndValues = builder.namesAndValuesBuilder.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
    }
}
