package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
import com.tencent.smtt.sdk.TbsListener;

/* JADX INFO: loaded from: classes.dex */
final class RtspMediaTrack {
    private static final String AAC_CODECS_PREFIX = "mp4a.40.";
    private static final int DEFAULT_H263_HEIGHT = 288;
    private static final int DEFAULT_H263_WIDTH = 352;
    private static final int DEFAULT_MP4V_HEIGHT = 288;
    private static final int DEFAULT_MP4V_WIDTH = 352;
    private static final int DEFAULT_VP8_HEIGHT = 240;
    private static final int DEFAULT_VP8_WIDTH = 320;
    private static final int DEFAULT_VP9_HEIGHT = 240;
    private static final int DEFAULT_VP9_WIDTH = 320;
    private static final String GENERIC_CONTROL_ATTR = "*";
    private static final String H264_CODECS_PREFIX = "avc1.";
    private static final String MPEG4_CODECS_PREFIX = "mp4v.";
    private static final int OPUS_CLOCK_RATE = 48000;
    private static final String PARAMETER_AMR_INTERLEAVING = "interleaving";
    private static final String PARAMETER_AMR_OCTET_ALIGN = "octet-align";
    private static final String PARAMETER_H265_SPROP_MAX_DON_DIFF = "sprop-max-don-diff";
    private static final String PARAMETER_H265_SPROP_PPS = "sprop-pps";
    private static final String PARAMETER_H265_SPROP_SPS = "sprop-sps";
    private static final String PARAMETER_H265_SPROP_VPS = "sprop-vps";
    private static final String PARAMETER_MP4A_CONFIG = "config";
    private static final String PARAMETER_MP4A_C_PRESENT = "cpresent";
    private static final String PARAMETER_PROFILE_LEVEL_ID = "profile-level-id";
    private static final String PARAMETER_SPROP_PARAMS = "sprop-parameter-sets";
    public final RtpPayloadFormat payloadFormat;
    public final Uri uri;

    public RtspMediaTrack(RtspHeaders rtspHeaders, MediaDescription mediaDescription, Uri uri) {
        Assertions.checkArgument(mediaDescription.attributes.containsKey(SessionDescription.ATTR_CONTROL), "missing attribute control");
        this.payloadFormat = generatePayloadFormat(mediaDescription);
        this.uri = extractTrackUri(rtspHeaders, uri, (String) Util.castNonNull((String) mediaDescription.attributes.get(SessionDescription.ATTR_CONTROL)));
    }

    private static Uri extractTrackUri(RtspHeaders rtspHeaders, Uri uri, String str) {
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        if (!TextUtils.isEmpty(rtspHeaders.get(RtspHeaders.CONTENT_BASE))) {
            uri = Uri.parse(rtspHeaders.get(RtspHeaders.CONTENT_BASE));
        } else if (!TextUtils.isEmpty(rtspHeaders.get(RtspHeaders.CONTENT_LOCATION))) {
            uri = Uri.parse(rtspHeaders.get(RtspHeaders.CONTENT_LOCATION));
        }
        return str.equals("*") ? uri : uri.buildUpon().appendEncodedPath(str).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: switch over string: strings are not added: [[audio/ac3], [audio/g711-alaw], [audio/g711-mlaw]] */
    @VisibleForTesting
    public static RtpPayloadFormat generatePayloadFormat(MediaDescription mediaDescription) {
        int iInferChannelCount;
        Format.Builder builder = new Format.Builder();
        int i = mediaDescription.bitrate;
        if (i > 0) {
            builder.setAverageBitrate(i);
        }
        MediaDescription.RtpMapAttribute rtpMapAttribute = mediaDescription.rtpMapAttribute;
        int i2 = rtpMapAttribute.payloadType;
        String str = rtpMapAttribute.mediaEncoding;
        String mimeTypeFromRtpMediaType = RtpPayloadFormat.getMimeTypeFromRtpMediaType(str);
        builder.setSampleMimeType(mimeTypeFromRtpMediaType);
        int i3 = mediaDescription.rtpMapAttribute.clockRate;
        if ("audio".equals(mediaDescription.mediaType)) {
            iInferChannelCount = inferChannelCount(mediaDescription.rtpMapAttribute.encodingParameters, mimeTypeFromRtpMediaType);
            builder.setSampleRate(i3).setChannelCount(iInferChannelCount);
        } else {
            iInferChannelCount = -1;
        }
        O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o fmtpParametersAsMap = mediaDescription.getFmtpParametersAsMap();
        switch (mimeTypeFromRtpMediaType) {
            case "audio/mp4a-latm":
                Assertions.checkArgument(iInferChannelCount != -1);
                Assertions.checkArgument(!fmtpParametersAsMap.isEmpty(), "missing attribute fmtp");
                if (str.equals(RtpPayloadFormat.RTP_MEDIA_MPEG4_LATM_AUDIO)) {
                    Assertions.checkArgument(fmtpParametersAsMap.containsKey(PARAMETER_MP4A_C_PRESENT) && ((String) fmtpParametersAsMap.get(PARAMETER_MP4A_C_PRESENT)).equals(SessionDescription.SUPPORTED_SDP_VERSION), "Only supports cpresent=0 in AAC audio.");
                    String str2 = (String) fmtpParametersAsMap.get(PARAMETER_MP4A_CONFIG);
                    Assertions.checkNotNull(str2, "AAC audio stream must include config fmtp parameter");
                    Assertions.checkArgument(str2.length() % 2 == 0, "Malformat MPEG4 config: ".concat(str2));
                    AacUtil.Config aacStreamMuxConfig = parseAacStreamMuxConfig(str2);
                    builder.setSampleRate(aacStreamMuxConfig.sampleRateHz).setChannelCount(aacStreamMuxConfig.channelCount).setCodecs(aacStreamMuxConfig.codecs);
                }
                processAacFmtpAttribute(builder, fmtpParametersAsMap, str, iInferChannelCount, i3);
                break;
            case "audio/3gpp":
            case "audio/amr-wb":
                Assertions.checkArgument(iInferChannelCount == 1, "Multi channel AMR is not currently supported.");
                Assertions.checkArgument(!fmtpParametersAsMap.isEmpty(), "fmtp parameters must include octet-align.");
                Assertions.checkArgument(fmtpParametersAsMap.containsKey(PARAMETER_AMR_OCTET_ALIGN), "Only octet aligned mode is currently supported.");
                Assertions.checkArgument(!fmtpParametersAsMap.containsKey(PARAMETER_AMR_INTERLEAVING), "Interleaving mode is not currently supported.");
                break;
            case "audio/opus":
                Assertions.checkArgument(iInferChannelCount != -1);
                Assertions.checkArgument(i3 == 48000, "Invalid OPUS clock rate.");
                break;
            case "video/mp4v-es":
                Assertions.checkArgument(!fmtpParametersAsMap.isEmpty());
                processMPEG4FmtpAttribute(builder, fmtpParametersAsMap);
                break;
            case "video/3gpp":
                builder.setWidth(352).setHeight(288);
                break;
            case "video/avc":
                Assertions.checkArgument(!fmtpParametersAsMap.isEmpty(), "missing attribute fmtp");
                processH264FmtpAttribute(builder, fmtpParametersAsMap);
                break;
            case "video/hevc":
                Assertions.checkArgument(!fmtpParametersAsMap.isEmpty(), "missing attribute fmtp");
                processH265FmtpAttribute(builder, fmtpParametersAsMap);
                break;
            case "video/x-vnd.on2.vp8":
                builder.setWidth(TbsListener.ErrorCode.ERROR_SDKENGINE_INIT_THROWABLE).setHeight(240);
                break;
            case "video/x-vnd.on2.vp9":
                builder.setWidth(TbsListener.ErrorCode.ERROR_SDKENGINE_INIT_THROWABLE).setHeight(240);
                break;
            case "audio/raw":
                builder.setPcmEncoding(RtpPayloadFormat.getRawPcmEncodingType(str));
                break;
        }
        Assertions.checkArgument(i3 > 0);
        return new RtpPayloadFormat(builder.build(), i2, i3, fmtpParametersAsMap, str);
    }

    private static byte[] getInitializationDataFromParameterSet(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        int length = bArrDecode.length;
        byte[] bArr = NalUnitUtil.NAL_START_CODE;
        byte[] bArr2 = new byte[length + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bArrDecode, 0, bArr2, bArr.length, bArrDecode.length);
        return bArr2;
    }

    private static int inferChannelCount(int i, String str) {
        if (i != -1) {
            return i;
        }
        return str.equals(MimeTypes.AUDIO_AC3) ? 6 : 1;
    }

    private static AacUtil.Config parseAacStreamMuxConfig(String str) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(Util.getBytesFromHexString(str));
        Assertions.checkArgument(parsableBitArray.readBits(1) == 0, "Only supports audio mux version 0.");
        Assertions.checkArgument(parsableBitArray.readBits(1) == 1, "Only supports allStreamsSameTimeFraming.");
        parsableBitArray.skipBits(6);
        Assertions.checkArgument(parsableBitArray.readBits(4) == 0, "Only supports one program.");
        Assertions.checkArgument(parsableBitArray.readBits(3) == 0, "Only supports one numLayer.");
        try {
            return AacUtil.parseAudioSpecificConfig(parsableBitArray, false);
        } catch (ParserException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static void processAacFmtpAttribute(Format.Builder builder, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o, String str, int i, int i2) {
        String str2 = (String) o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.get(PARAMETER_PROFILE_LEVEL_ID);
        if (str2 == null && str.equals(RtpPayloadFormat.RTP_MEDIA_MPEG4_LATM_AUDIO)) {
            str2 = "30";
        }
        Assertions.checkArgument((str2 == null || str2.isEmpty()) ? false : true, "missing profile-level-id param");
        builder.setCodecs(AAC_CODECS_PREFIX + str2);
        builder.setInitializationData(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(AacUtil.buildAacLcAudioSpecificConfig(i2, i)));
    }

    private static void processH264FmtpAttribute(Format.Builder builder, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o) {
        Assertions.checkArgument(o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.containsKey(PARAMETER_SPROP_PARAMS), "missing sprop parameter");
        String[] strArrSplit = Util.split((String) Assertions.checkNotNull((String) o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.get(PARAMETER_SPROP_PARAMS)), ",");
        Assertions.checkArgument(strArrSplit.length == 2, "empty sprop value");
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(getInitializationDataFromParameterSet(strArrSplit[0]), getInitializationDataFromParameterSet(strArrSplit[1]));
        builder.setInitializationData(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf);
        byte[] bArr = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf.get(0);
        NalUnitUtil.SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit(bArr, NalUnitUtil.NAL_START_CODE.length, bArr.length);
        builder.setPixelWidthHeightRatio(spsNalUnit.pixelWidthHeightRatio);
        builder.setHeight(spsNalUnit.height);
        builder.setWidth(spsNalUnit.width);
        builder.setColorInfo(new ColorInfo.Builder().setColorSpace(spsNalUnit.colorSpace).setColorRange(spsNalUnit.colorRange).setColorTransfer(spsNalUnit.colorTransfer).setLumaBitdepth(spsNalUnit.bitDepthLumaMinus8 + 8).setChromaBitdepth(spsNalUnit.bitDepthChromaMinus8 + 8).build());
        String str = (String) o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.get(PARAMETER_PROFILE_LEVEL_ID);
        if (str != null) {
            builder.setCodecs(H264_CODECS_PREFIX.concat(str));
        } else {
            builder.setCodecs(CodecSpecificDataUtil.buildAvcCodecString(spsNalUnit.profileIdc, spsNalUnit.constraintsFlagsAndReservedZero2Bits, spsNalUnit.levelIdc));
        }
    }

    private static void processH265FmtpAttribute(Format.Builder builder, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o) {
        if (o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.containsKey(PARAMETER_H265_SPROP_MAX_DON_DIFF)) {
            int i = Integer.parseInt((String) Assertions.checkNotNull((String) o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.get(PARAMETER_H265_SPROP_MAX_DON_DIFF)));
            Assertions.checkArgument(i == 0, "non-zero sprop-max-don-diff " + i + " is not supported");
        }
        Assertions.checkArgument(o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.containsKey(PARAMETER_H265_SPROP_VPS), "missing sprop-vps parameter");
        String str = (String) Assertions.checkNotNull((String) o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.get(PARAMETER_H265_SPROP_VPS));
        Assertions.checkArgument(o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.containsKey(PARAMETER_H265_SPROP_SPS), "missing sprop-sps parameter");
        String str2 = (String) Assertions.checkNotNull((String) o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.get(PARAMETER_H265_SPROP_SPS));
        Assertions.checkArgument(o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.containsKey(PARAMETER_H265_SPROP_PPS), "missing sprop-pps parameter");
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(getInitializationDataFromParameterSet(str), getInitializationDataFromParameterSet(str2), getInitializationDataFromParameterSet((String) Assertions.checkNotNull((String) o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.get(PARAMETER_H265_SPROP_PPS))));
        builder.setInitializationData(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf);
        byte[] bArr = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0OOf.get(1);
        NalUnitUtil.H265SpsData h265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr, NalUnitUtil.NAL_START_CODE.length, bArr.length, null);
        builder.setPixelWidthHeightRatio(h265SpsNalUnit.pixelWidthHeightRatio);
        builder.setHeight(h265SpsNalUnit.height).setWidth(h265SpsNalUnit.width);
        builder.setColorInfo(new ColorInfo.Builder().setColorSpace(h265SpsNalUnit.colorSpace).setColorRange(h265SpsNalUnit.colorRange).setColorTransfer(h265SpsNalUnit.colorTransfer).setLumaBitdepth(h265SpsNalUnit.bitDepthLumaMinus8 + 8).setChromaBitdepth(h265SpsNalUnit.bitDepthChromaMinus8 + 8).build());
        NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel = h265SpsNalUnit.profileTierLevel;
        if (h265ProfileTierLevel != null) {
            builder.setCodecs(CodecSpecificDataUtil.buildHevcCodecString(h265ProfileTierLevel.generalProfileSpace, h265ProfileTierLevel.generalTierFlag, h265ProfileTierLevel.generalProfileIdc, h265ProfileTierLevel.generalProfileCompatibilityFlags, h265ProfileTierLevel.constraintBytes, h265ProfileTierLevel.generalLevelIdc));
        }
    }

    private static void processMPEG4FmtpAttribute(Format.Builder builder, O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o) {
        String str = (String) o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.get(PARAMETER_MP4A_CONFIG);
        if (str != null) {
            byte[] bytesFromHexString = Util.getBytesFromHexString(str);
            builder.setInitializationData(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(bytesFromHexString));
            Pair<Integer, Integer> videoResolutionFromMpeg4VideoConfig = CodecSpecificDataUtil.getVideoResolutionFromMpeg4VideoConfig(bytesFromHexString);
            builder.setWidth(((Integer) videoResolutionFromMpeg4VideoConfig.first).intValue()).setHeight(((Integer) videoResolutionFromMpeg4VideoConfig.second).intValue());
        } else {
            builder.setWidth(352).setHeight(288);
        }
        String str2 = (String) o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.get(PARAMETER_PROFILE_LEVEL_ID);
        if (str2 == null) {
            str2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        }
        builder.setCodecs(MPEG4_CODECS_PREFIX.concat(str2));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RtspMediaTrack.class != obj.getClass()) {
            return false;
        }
        RtspMediaTrack rtspMediaTrack = (RtspMediaTrack) obj;
        return this.payloadFormat.equals(rtspMediaTrack.payloadFormat) && this.uri.equals(rtspMediaTrack.uri);
    }

    public int hashCode() {
        return this.uri.hashCode() + ((this.payloadFormat.hashCode() + TbsListener.ErrorCode.INCR_UPDATE_FAIL) * 31);
    }
}
