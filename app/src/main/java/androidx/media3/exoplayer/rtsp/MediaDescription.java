package androidx.media3.exoplayer.rtsp;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import com.google.common.collect.O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O;
import com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.tencent.smtt.sdk.TbsListener;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes.dex */
final class MediaDescription {
    public static final String MEDIA_TYPE_AUDIO = "audio";
    public static final String MEDIA_TYPE_VIDEO = "video";
    public static final String RTP_AVP_PROFILE = "RTP/AVP";
    public final O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o attributes;
    public final int bitrate;

    @Nullable
    public final String connection;

    @Nullable
    public final String key;

    @Nullable
    public final String mediaTitle;
    public final String mediaType;
    public final int payloadType;
    public final int port;
    public final RtpMapAttribute rtpMapAttribute;
    public final String transportProtocol;

    public static final class Builder {
        private static final String RTP_MAP_ATTR_AUDIO_FMT = "%d %s/%d/%d";
        private static final int RTP_STATIC_PAYLOAD_TYPE_L16_MONO = 11;
        private static final int RTP_STATIC_PAYLOAD_TYPE_L16_STEREO = 10;
        private static final int RTP_STATIC_PAYLOAD_TYPE_PCMA = 8;
        private static final int RTP_STATIC_PAYLOAD_TYPE_PCMU = 0;
        private final HashMap<String, String> attributes = new HashMap<>();
        private int bitrate = -1;

        @Nullable
        private String connection;

        @Nullable
        private String key;

        @Nullable
        private String mediaTitle;
        private final String mediaType;
        private final int payloadType;
        private final int port;
        private final String transportProtocol;

        public Builder(String str, int i, String str2, int i2) {
            this.mediaType = str;
            this.port = i;
            this.transportProtocol = str2;
            this.payloadType = i2;
        }

        private static String constructAudioRtpMap(int i, String str, int i2, int i3) {
            return Util.formatInvariant(RTP_MAP_ATTR_AUDIO_FMT, Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3));
        }

        private static String getRtpMapStringByPayloadType(int i) {
            Assertions.checkArgument(i < 96);
            if (i == 0) {
                return constructAudioRtpMap(0, RtpPayloadFormat.RTP_MEDIA_PCMU, 8000, 1);
            }
            if (i == 8) {
                return constructAudioRtpMap(8, RtpPayloadFormat.RTP_MEDIA_PCMA, 8000, 1);
            }
            if (i == 10) {
                return constructAudioRtpMap(10, RtpPayloadFormat.RTP_MEDIA_PCM_L16, 44100, 2);
            }
            if (i == 11) {
                return constructAudioRtpMap(11, RtpPayloadFormat.RTP_MEDIA_PCM_L16, 44100, 1);
            }
            throw new IllegalStateException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "Unsupported static paylod type "));
        }

        @CanIgnoreReturnValue
        public Builder addAttribute(String str, String str2) {
            this.attributes.put(str, str2);
            return this;
        }

        public MediaDescription build() {
            try {
                return new MediaDescription(this, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.copyOf((Map) this.attributes), this.attributes.containsKey(SessionDescription.ATTR_RTPMAP) ? RtpMapAttribute.parse((String) Util.castNonNull(this.attributes.get(SessionDescription.ATTR_RTPMAP))) : RtpMapAttribute.parse(getRtpMapStringByPayloadType(this.payloadType)));
            } catch (ParserException e) {
                throw new IllegalStateException(e);
            }
        }

        @CanIgnoreReturnValue
        public Builder setBitrate(int i) {
            this.bitrate = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setConnection(String str) {
            this.connection = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setKey(String str) {
            this.key = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMediaTitle(String str) {
            this.mediaTitle = str;
            return this;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaType {
    }

    public static final class RtpMapAttribute {
        public final int clockRate;
        public final int encodingParameters;
        public final String mediaEncoding;
        public final int payloadType;

        private RtpMapAttribute(int i, String str, int i2, int i3) {
            this.payloadType = i;
            this.mediaEncoding = str;
            this.clockRate = i2;
            this.encodingParameters = i3;
        }

        public static RtpMapAttribute parse(String str) throws ParserException {
            String[] strArrSplitAtFirst = Util.splitAtFirst(str, " ");
            Assertions.checkArgument(strArrSplitAtFirst.length == 2);
            int i = RtspMessageUtil.parseInt(strArrSplitAtFirst[0]);
            String[] strArrSplit = Util.split(strArrSplitAtFirst[1].trim(), ServiceReference.DELIMITER);
            Assertions.checkArgument(strArrSplit.length >= 2);
            return new RtpMapAttribute(i, strArrSplit[0], RtspMessageUtil.parseInt(strArrSplit[1]), strArrSplit.length == 3 ? RtspMessageUtil.parseInt(strArrSplit[2]) : -1);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || RtpMapAttribute.class != obj.getClass()) {
                return false;
            }
            RtpMapAttribute rtpMapAttribute = (RtpMapAttribute) obj;
            return this.payloadType == rtpMapAttribute.payloadType && this.mediaEncoding.equals(rtpMapAttribute.mediaEncoding) && this.clockRate == rtpMapAttribute.clockRate && this.encodingParameters == rtpMapAttribute.encodingParameters;
        }

        public int hashCode() {
            return ((androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((TbsListener.ErrorCode.INCR_UPDATE_FAIL + this.payloadType) * 31, 31, this.mediaEncoding) + this.clockRate) * 31) + this.encodingParameters;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaDescription.class != obj.getClass()) {
            return false;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        return this.mediaType.equals(mediaDescription.mediaType) && this.port == mediaDescription.port && this.transportProtocol.equals(mediaDescription.transportProtocol) && this.payloadType == mediaDescription.payloadType && this.bitrate == mediaDescription.bitrate && this.attributes.equals(mediaDescription.attributes) && this.rtpMapAttribute.equals(mediaDescription.rtpMapAttribute) && Objects.equals(this.mediaTitle, mediaDescription.mediaTitle) && Objects.equals(this.connection, mediaDescription.connection) && Objects.equals(this.key, mediaDescription.key);
    }

    public O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o getFmtpParametersAsMap() {
        String str = (String) this.attributes.get(SessionDescription.ATTR_FMTP);
        if (str == null) {
            return O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.of();
        }
        String[] strArrSplitAtFirst = Util.splitAtFirst(str, " ");
        Assertions.checkArgument(strArrSplitAtFirst.length == 2, str);
        String[] strArrSplit = strArrSplitAtFirst[1].split(";\\s?", 0);
        O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O = new O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O(4);
        for (String str2 : strArrSplit) {
            String[] strArrSplitAtFirst2 = Util.splitAtFirst(str2, "=");
            o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(strArrSplitAtFirst2[0], strArrSplitAtFirst2[1]);
        }
        return o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    public int hashCode() {
        int iHashCode = (this.rtpMapAttribute.hashCode() + ((this.attributes.hashCode() + ((((androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(TbsListener.ErrorCode.INCR_UPDATE_FAIL, 31, this.mediaType) + this.port) * 31, 31, this.transportProtocol) + this.payloadType) * 31) + this.bitrate) * 31)) * 31)) * 31;
        String str = this.mediaTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.connection;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.key;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    private MediaDescription(Builder builder, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o, RtpMapAttribute rtpMapAttribute) {
        this.mediaType = builder.mediaType;
        this.port = builder.port;
        this.transportProtocol = builder.transportProtocol;
        this.payloadType = builder.payloadType;
        this.mediaTitle = builder.mediaTitle;
        this.connection = builder.connection;
        this.bitrate = builder.bitrate;
        this.key = builder.key;
        this.attributes = o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
        this.rtpMapAttribute = rtpMapAttribute;
    }
}
