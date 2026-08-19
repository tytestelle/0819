package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.util.UnstableApi;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface MediaCodecSelector {
    public static final MediaCodecSelector DEFAULT;
    public static final MediaCodecSelector PREFER_SOFTWARE;

    static {
        final int i = 0;
        DEFAULT = new MediaCodecSelector() { // from class: androidx.media3.exoplayer.mediacodec.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
            @Override // androidx.media3.exoplayer.mediacodec.MediaCodecSelector
            public final List getDecoderInfos(String str, boolean z, boolean z2) {
                switch (i) {
                    case 0:
                        return MediaCodecUtil.getDecoderInfos(str, z, z2);
                    default:
                        return MediaCodecUtil.getDecoderInfosSortedBySoftwareOnly(MediaCodecSelector.DEFAULT.getDecoderInfos(str, z, z2));
                }
            }
        };
        final int i2 = 1;
        PREFER_SOFTWARE = new MediaCodecSelector() { // from class: androidx.media3.exoplayer.mediacodec.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
            @Override // androidx.media3.exoplayer.mediacodec.MediaCodecSelector
            public final List getDecoderInfos(String str, boolean z, boolean z2) {
                switch (i2) {
                    case 0:
                        return MediaCodecUtil.getDecoderInfos(str, z, z2);
                    default:
                        return MediaCodecUtil.getDecoderInfosSortedBySoftwareOnly(MediaCodecSelector.DEFAULT.getDecoderInfos(str, z, z2));
                }
            }
        };
    }

    List<MediaCodecInfo> getDecoderInfos(String str, boolean z, boolean z2);
}
