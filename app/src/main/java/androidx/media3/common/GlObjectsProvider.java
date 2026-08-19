package androidx.media3.common;

import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import androidx.annotation.IntRange;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface GlObjectsProvider {
    GlTextureInfo createBuffersForTexture(int i, int i2, int i3);

    EGLContext createEglContext(EGLDisplay eGLDisplay, @IntRange(from = 2, to = 3) int i, int[] iArr);

    EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i, boolean z);

    EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay);

    void release(EGLDisplay eGLDisplay);
}
