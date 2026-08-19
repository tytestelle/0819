package androidx.media3.common;

import android.view.SurfaceView;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface DebugViewProvider {
    public static final DebugViewProvider NONE = new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(8);

    @Nullable
    SurfaceView getDebugPreviewSurfaceView(int i, int i2);
}
