package androidx.media3.exoplayer.mediacodec;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class MediaCodecPerformancePointCoverageProvider {
    static final int COVERAGE_RESULT_NO = 1;
    static final int COVERAGE_RESULT_NO_PERFORMANCE_POINTS_UNSUPPORTED = 0;
    static final int COVERAGE_RESULT_YES = 2;
    private static Boolean shouldIgnorePerformancePoints;

    @RequiresApi(29)
    public static final class Api29 {
        private Api29() {
        }

        public static int areResolutionAndFrameRateCovered(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            androidx.media3.exoplayer.audio.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
            int iEvaluatePerformancePointCoverage = evaluatePerformancePointCoverage(supportedPerformancePoints, androidx.media3.exoplayer.audio.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, i2, (int) d));
            if (iEvaluatePerformancePointCoverage == 1 && MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints == null) {
                Boolean unused = MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints = Boolean.valueOf(shouldIgnorePerformancePoints());
                if (MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints.booleanValue()) {
                    return 0;
                }
            }
            return iEvaluatePerformancePointCoverage;
        }

        private static int evaluateH264RequiredSupport(boolean z) {
            android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
            List supportedPerformancePoints;
            try {
                Format formatBuild = new Format.Builder().setSampleMimeType(MimeTypes.VIDEO_H264).build();
                if (formatBuild.sampleMimeType != null) {
                    List<MediaCodecInfo> decoderInfosSoftMatch = MediaCodecUtil.getDecoderInfosSoftMatch(MediaCodecSelector.DEFAULT, formatBuild, z, false);
                    for (int i = 0; i < decoderInfosSoftMatch.size(); i++) {
                        if (decoderInfosSoftMatch.get(i).capabilities != null && (videoCapabilities = decoderInfosSoftMatch.get(i).capabilities.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            androidx.media3.exoplayer.audio.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                            return evaluatePerformancePointCoverage(supportedPerformancePoints, androidx.media3.exoplayer.audio.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0());
                        }
                    }
                }
            } catch (MediaCodecUtil.DecoderQueryException unused) {
            }
            return 0;
        }

        private static int evaluatePerformancePointCoverage(List<android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint> list, android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i = 0; i < list.size(); i++) {
                if (androidx.media3.exoplayer.audio.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(list.get(i)).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        private static boolean shouldIgnorePerformancePoints() {
            if (Build.VERSION.SDK_INT >= 35) {
                return false;
            }
            int iEvaluateH264RequiredSupport = evaluateH264RequiredSupport(false);
            int iEvaluateH264RequiredSupport2 = evaluateH264RequiredSupport(true);
            if (iEvaluateH264RequiredSupport == 0) {
                return true;
            }
            if (iEvaluateH264RequiredSupport2 == 0) {
                return iEvaluateH264RequiredSupport != 2;
            }
            return (iEvaluateH264RequiredSupport == 2 && iEvaluateH264RequiredSupport2 == 2) ? false : true;
        }
    }

    private MediaCodecPerformancePointCoverageProvider() {
    }

    public static int areResolutionAndFrameRateCovered(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = shouldIgnorePerformancePoints;
        if (bool == null || !bool.booleanValue()) {
            return Api29.areResolutionAndFrameRateCovered(videoCapabilities, i, i2, d);
        }
        return 0;
    }
}
