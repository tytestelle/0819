package androidx.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class MediaCodecInfo {
    public static final int MAX_SUPPORTED_INSTANCES_UNKNOWN = -1;
    public static final String TAG = "MediaCodecInfo";
    public final boolean adaptive;

    @Nullable
    public final android.media.MediaCodecInfo.CodecCapabilities capabilities;
    public final String codecMimeType;
    public final boolean detachedSurfaceSupported;
    public final boolean hardwareAccelerated;
    private final boolean isVideo;
    public final String mimeType;
    public final String name;
    public final boolean secure;
    public final boolean softwareOnly;
    public final boolean tunneling;
    public final boolean vendor;
    private float maxFrameRate = -3.4028235E38f;
    private int maxFrameRateWidth = -1;
    private int maxFrameRateHeight = -1;

    @VisibleForTesting
    public MediaCodecInfo(String str, String str2, String str3, @Nullable android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.name = (String) Assertions.checkNotNull(str);
        this.mimeType = str2;
        this.codecMimeType = str3;
        this.capabilities = codecCapabilities;
        this.hardwareAccelerated = z;
        this.softwareOnly = z2;
        this.vendor = z3;
        this.adaptive = z4;
        this.tunneling = z5;
        this.secure = z6;
        this.detachedSurfaceSupported = z7;
        this.isVideo = MimeTypes.isVideo(str2);
    }

    private static int adjustMaxInputChannelCount(String str, String str2, int i) {
        int i2;
        if (i > 1 || ((Build.VERSION.SDK_INT >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || MimeTypes.AUDIO_AMR_WB.equals(str2) || MimeTypes.AUDIO_AAC.equals(str2) || MimeTypes.AUDIO_VORBIS.equals(str2) || MimeTypes.AUDIO_OPUS.equals(str2) || MimeTypes.AUDIO_RAW.equals(str2) || MimeTypes.AUDIO_FLAC.equals(str2) || MimeTypes.AUDIO_ALAW.equals(str2) || MimeTypes.AUDIO_MLAW.equals(str2) || MimeTypes.AUDIO_MSGSM.equals(str2))) {
            return i;
        }
        if (MimeTypes.AUDIO_AC3.equals(str2)) {
            i2 = 6;
        } else {
            i2 = MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
        }
        Log.w(TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + "]");
        return i2;
    }

    private static Point alignVideoSize(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(Util.ceilDivide(i, widthAlignment) * widthAlignment, Util.ceilDivide(i2, heightAlignment) * heightAlignment);
    }

    private static boolean areSizeAndRateSupported(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Range achievableFrameRatesFor;
        Point pointAlignVideoSize = alignVideoSize(videoCapabilities, i, i2);
        int i3 = pointAlignVideoSize.x;
        int i4 = pointAlignVideoSize.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4)) == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
        }
        return false;
    }

    private float computeMaxSupportedFrameRate(int i, int i2) {
        float f = 1024.0f;
        if (isVideoSizeAndRateSupportedV21(i, i2, 1024.0f)) {
            return 1024.0f;
        }
        float f2 = 0.0f;
        while (true) {
            float f3 = f - f2;
            if (Math.abs(f3) <= 5.0f) {
                return f2;
            }
            float f4 = (f3 / 2.0f) + f2;
            if (isVideoSizeAndRateSupportedV21(i, i2, f4)) {
                f2 = f4;
            } else {
                f = f4;
            }
        }
    }

    private static android.media.MediaCodecInfo.CodecProfileLevel[] estimateLegacyVp9ProfileLevels(@Nullable android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i;
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        if (iIntValue >= 180000000) {
            i = 1024;
        } else if (iIntValue >= 120000000) {
            i = 512;
        } else if (iIntValue >= 60000000) {
            i = 256;
        } else if (iIntValue >= 30000000) {
            i = 128;
        } else if (iIntValue >= 18000000) {
            i = 64;
        } else if (iIntValue >= 12000000) {
            i = 32;
        } else if (iIntValue >= 7200000) {
            i = 16;
        } else if (iIntValue >= 3600000) {
            i = 8;
        } else if (iIntValue >= 1800000) {
            i = 4;
        } else {
            i = iIntValue >= 800000 ? 2 : 1;
        }
        return new android.media.MediaCodecInfo.CodecProfileLevel[]{MediaCodecUtil.createCodecProfileLevel(1, i)};
    }

    @RequiresApi(23)
    private static int getMaxSupportedInstancesV23(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    private static boolean isAdaptive(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0082  */
    private boolean isCodecProfileAndLevelSupported(Format format, boolean z) {
        int i = 2;
        Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format);
        String str = format.sampleMimeType;
        if (str != null && str.equals(MimeTypes.VIDEO_MV_HEVC)) {
            String strNormalizeMimeType = MimeTypes.normalizeMimeType(this.codecMimeType);
            if (strNormalizeMimeType.equals(MimeTypes.VIDEO_MV_HEVC)) {
                return true;
            }
            if (strNormalizeMimeType.equals(MimeTypes.VIDEO_H265)) {
                codecProfileAndLevel = MediaCodecUtil.getHevcBaseLayerCodecProfileAndLevel(format);
            }
        }
        if (codecProfileAndLevel == null) {
            return true;
        }
        int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
        int iIntValue2 = ((Integer) codecProfileAndLevel.second).intValue();
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType)) {
            String str2 = this.mimeType;
            str2.getClass();
            switch (str2) {
                case "video/avc":
                    i = 8;
                case "video/av01":
                case "video/hevc":
                    iIntValue2 = 0;
                    break;
                default:
                    i = iIntValue;
                    break;
            }
        } else {
            i = iIntValue;
        }
        if (!this.isVideo && i != 42) {
            return true;
        }
        android.media.MediaCodecInfo.CodecProfileLevel[] profileLevels = getProfileLevels();
        if (Build.VERSION.SDK_INT <= 23 && MimeTypes.VIDEO_VP9.equals(this.mimeType) && profileLevels.length == 0) {
            profileLevels = estimateLegacyVp9ProfileLevels(this.capabilities);
        }
        for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : profileLevels) {
            if (codecProfileLevel.profile == i && ((codecProfileLevel.level >= iIntValue2 || !z) && !needsProfileExcludedWorkaround(this.mimeType, i))) {
                return true;
            }
        }
        logNoSupport("codec.profileLevel, " + format.codecs + ", " + this.codecMimeType);
        return false;
    }

    private boolean isCompressedAudioBitDepthSupported(Format format) {
        return (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_FLAC) && format.pcmEncoding == 22 && Build.VERSION.SDK_INT < 34 && this.name.equals("c2.android.flac.decoder")) ? false : true;
    }

    private static boolean isDetachedSurfaceSupported(@Nullable android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface") && !needsDetachedSurfaceUnsupportedWorkaround();
    }

    private boolean isSampleMimeTypeSupported(Format format) {
        return this.mimeType.equals(format.sampleMimeType) || this.mimeType.equals(MediaCodecUtil.getAlternativeCodecMimeType(format));
    }

    private static boolean isSecure(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean isTunneling(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void logAssumedSupport(String str) {
        StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("AssumedSupport [", str, "] [");
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(this.name);
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(", ");
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(this.mimeType);
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append("] [");
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(Util.DEVICE_DEBUG_INFO);
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append("]");
        Log.d(TAG, sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.toString());
    }

    private void logNoSupport(String str) {
        StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("NoSupport [", str, "] [");
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(this.name);
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(", ");
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(this.mimeType);
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append("] [");
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(Util.DEVICE_DEBUG_INFO);
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append("]");
        Log.d(TAG, sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.toString());
    }

    private static boolean needsAdaptationFlushWorkaround(String str) {
        return MimeTypes.AUDIO_OPUS.equals(str);
    }

    private static boolean needsAdaptationReconfigureWorkaround(String str) {
        return Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean needsDetachedSurfaceUnsupportedWorkaround() {
        String str = Build.MANUFACTURER;
        return str.equals("Xiaomi") || str.equals("OPPO") || str.equals("realme") || str.equals("motorola") || str.equals("LENOVO");
    }

    private static boolean needsDisableAdaptationWorkaround(String str) {
        if (Build.VERSION.SDK_INT <= 22) {
            String str2 = Build.MODEL;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private static boolean needsProfileExcludedWorkaround(String str, int i) {
        if (MimeTypes.VIDEO_H265.equals(str) && 2 == i) {
            String str2 = Build.DEVICE;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean needsRotatedVerticalResolutionWorkaround(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Build.DEVICE)) ? false : true;
    }

    public static MediaCodecInfo newInstance(String str, String str2, String str3, @Nullable android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new MediaCodecInfo(str, str2, str3, codecCapabilities, z, z2, z3, (z4 || codecCapabilities == null || !isAdaptive(codecCapabilities) || needsDisableAdaptationWorkaround(str)) ? false : true, codecCapabilities != null && isTunneling(codecCapabilities), z5 || (codecCapabilities != null && isSecure(codecCapabilities)), isDetachedSurfaceSupported(codecCapabilities));
    }

    @Nullable
    public Point alignVideoSizeV21(int i, int i2) {
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return alignVideoSize(videoCapabilities, i, i2);
    }

    public DecoderReuseEvaluation canReuseCodec(Format format, Format format2) {
        int i;
        int i2 = !Objects.equals(format.sampleMimeType, format2.sampleMimeType) ? 8 : 0;
        if (this.isVideo) {
            if (format.rotationDegrees != format2.rotationDegrees) {
                i2 |= 1024;
            }
            boolean z = (format.width == format2.width && format.height == format2.height) ? false : true;
            if (!this.adaptive && z) {
                i2 |= 512;
            }
            if ((!ColorInfo.isEquivalentToAssumedSdrDefault(format.colorInfo) || !ColorInfo.isEquivalentToAssumedSdrDefault(format2.colorInfo)) && !Objects.equals(format.colorInfo, format2.colorInfo)) {
                i2 |= 2048;
            }
            if (needsAdaptationReconfigureWorkaround(this.name) && !format.initializationDataEquals(format2)) {
                i2 |= 2;
            }
            int i3 = format.decodedWidth;
            if (i3 != -1 && (i = format.decodedHeight) != -1 && i3 == format2.decodedWidth && i == format2.decodedHeight && z) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new DecoderReuseEvaluation(this.name, format, format2, format.initializationDataEquals(format2) ? 3 : 2, 0);
            }
        } else {
            if (format.channelCount != format2.channelCount) {
                i2 |= 4096;
            }
            if (format.sampleRate != format2.sampleRate) {
                i2 |= 8192;
            }
            if (format.pcmEncoding != format2.pcmEncoding) {
                i2 |= 16384;
            }
            if (i2 == 0 && MimeTypes.AUDIO_AAC.equals(this.mimeType)) {
                Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format);
                Pair<Integer, Integer> codecProfileAndLevel2 = MediaCodecUtil.getCodecProfileAndLevel(format2);
                if (codecProfileAndLevel != null && codecProfileAndLevel2 != null) {
                    int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
                    int iIntValue2 = ((Integer) codecProfileAndLevel2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new DecoderReuseEvaluation(this.name, format, format2, 3, 0);
                    }
                }
            }
            if (!format.initializationDataEquals(format2)) {
                i2 |= 32;
            }
            if (needsAdaptationFlushWorkaround(this.mimeType)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new DecoderReuseEvaluation(this.name, format, format2, 1, 0);
            }
        }
        return new DecoderReuseEvaluation(this.name, format, format2, 0, i2);
    }

    public float getMaxSupportedFrameRate(int i, int i2) {
        if (!this.isVideo) {
            return -3.4028235E38f;
        }
        float f = this.maxFrameRate;
        if (f != -3.4028235E38f && this.maxFrameRateWidth == i && this.maxFrameRateHeight == i2) {
            return f;
        }
        float fComputeMaxSupportedFrameRate = computeMaxSupportedFrameRate(i, i2);
        this.maxFrameRate = fComputeMaxSupportedFrameRate;
        this.maxFrameRateWidth = i;
        this.maxFrameRateHeight = i2;
        return fComputeMaxSupportedFrameRate;
    }

    public int getMaxSupportedInstances() {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (Build.VERSION.SDK_INT < 23 || (codecCapabilities = this.capabilities) == null) {
            return -1;
        }
        return getMaxSupportedInstancesV23(codecCapabilities);
    }

    public android.media.MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new android.media.MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean isAudioChannelCountSupportedV21(int i) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("channelCount.caps");
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("channelCount.aCaps");
            return false;
        }
        if (adjustMaxInputChannelCount(this.name, this.mimeType, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        }
        logNoSupport(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "channelCount.support, "));
        return false;
    }

    public boolean isAudioSampleRateSupportedV21(int i) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sampleRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        logNoSupport(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "sampleRate.support, "));
        return false;
    }

    public boolean isFormatFunctionallySupported(Format format) {
        return isSampleMimeTypeSupported(format) && isCodecProfileAndLevelSupported(format, false) && isCompressedAudioBitDepthSupported(format);
    }

    public boolean isFormatSupported(Format format) {
        int i;
        if (!isSampleMimeTypeSupported(format) || !isCodecProfileAndLevelSupported(format, true) || !isCompressedAudioBitDepthSupported(format)) {
            return false;
        }
        if (this.isVideo) {
            int i2 = format.width;
            if (i2 <= 0 || (i = format.height) <= 0) {
                return true;
            }
            return isVideoSizeAndRateSupportedV21(i2, i, format.frameRate);
        }
        int i3 = format.sampleRate;
        if (i3 != -1 && !isAudioSampleRateSupportedV21(i3)) {
            return false;
        }
        int i4 = format.channelCount;
        return i4 == -1 || isAudioChannelCountSupportedV21(i4);
    }

    public boolean isHdr10PlusOutOfBandMetadataSupported() {
        if (Build.VERSION.SDK_INT >= 29 && MimeTypes.VIDEO_VP9.equals(this.mimeType)) {
            for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : getProfileLevels()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSeamlessAdaptationSupported(Format format) {
        if (this.isVideo) {
            return this.adaptive;
        }
        Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format);
        return codecProfileAndLevel != null && ((Integer) codecProfileAndLevel.first).intValue() == 42;
    }

    public boolean isVideoSizeAndRateSupportedV21(int i, int i2, double d) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sizeAndRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            logNoSupport("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int iAreResolutionAndFrameRateCovered = MediaCodecPerformancePointCoverageProvider.areResolutionAndFrameRateCovered(videoCapabilities, i, i2, d);
            if (iAreResolutionAndFrameRateCovered == 2) {
                return true;
            }
            if (iAreResolutionAndFrameRateCovered == 1) {
                StringBuilder sbO00000OOoOOO00O00o0ooooooooO000ooooO0000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(i, i2, "sizeAndRate.cover, ", "x", "@");
                sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.append(d);
                logNoSupport(sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.toString());
                return false;
            }
        }
        if (!areSizeAndRateSupported(videoCapabilities, i, i2, d)) {
            if (i >= i2 || !needsRotatedVerticalResolutionWorkaround(this.name) || !areSizeAndRateSupported(videoCapabilities, i2, i, d)) {
                StringBuilder sbO00000OOoOOO00O00o0ooooooooO000ooooO0001 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(i, i2, "sizeAndRate.support, ", "x", "@");
                sbO00000OOoOOO00O00o0ooooooooO000ooooO0001.append(d);
                logNoSupport(sbO00000OOoOOO00O00o0ooooooooO000ooooO0001.toString());
                return false;
            }
            StringBuilder sbO00000OOoOOO00O00o0ooooooooO000ooooO0002 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(i, i2, "sizeAndRate.rotated, ", "x", "@");
            sbO00000OOoOOO00O00o0ooooooooO000ooooO0002.append(d);
            logAssumedSupport(sbO00000OOoOOO00O00o0ooooooooO000ooooO0002.toString());
        }
        return true;
    }

    public String toString() {
        return this.name;
    }
}
