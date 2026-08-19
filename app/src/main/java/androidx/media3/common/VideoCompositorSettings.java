package androidx.media3.common;

import android.util.Pair;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.UnstableApi;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface VideoCompositorSettings {
    public static final VideoCompositorSettings DEFAULT = new VideoCompositorSettings() { // from class: androidx.media3.common.VideoCompositorSettings.1
        @Override // androidx.media3.common.VideoCompositorSettings
        public Size getOutputSize(List<Size> list) {
            return list.get(0);
        }

        @Override // androidx.media3.common.VideoCompositorSettings
        public OverlaySettings getOverlaySettings(int i, long j) {
            return new OverlaySettings() { // from class: androidx.media3.common.VideoCompositorSettings.1.1
                @Override // androidx.media3.common.OverlaySettings
                public final /* synthetic */ float getAlphaScale() {
                    return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this);
                }

                @Override // androidx.media3.common.OverlaySettings
                public final /* synthetic */ Pair getBackgroundFrameAnchor() {
                    return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this);
                }

                @Override // androidx.media3.common.OverlaySettings
                public final /* synthetic */ float getHdrLuminanceMultiplier() {
                    return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this);
                }

                @Override // androidx.media3.common.OverlaySettings
                public final /* synthetic */ Pair getOverlayFrameAnchor() {
                    return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this);
                }

                @Override // androidx.media3.common.OverlaySettings
                public final /* synthetic */ float getRotationDegrees() {
                    return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this);
                }

                @Override // androidx.media3.common.OverlaySettings
                public final /* synthetic */ Pair getScale() {
                    return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this);
                }
            };
        }
    };

    Size getOutputSize(List<Size> list);

    OverlaySettings getOverlaySettings(int i, long j);
}
