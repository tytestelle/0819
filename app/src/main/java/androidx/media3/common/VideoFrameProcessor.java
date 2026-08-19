package androidx.media3.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.util.TimestampIterator;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface VideoFrameProcessor {
    public static final long DROP_OUTPUT_FRAME = -2;
    public static final int INPUT_TYPE_BITMAP = 2;
    public static final int INPUT_TYPE_SURFACE = 1;
    public static final int INPUT_TYPE_SURFACE_AUTOMATIC_FRAME_REGISTRATION = 4;
    public static final int INPUT_TYPE_TEXTURE_ID = 3;
    public static final O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O REDRAW = O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of(new Effect() { // from class: androidx.media3.common.VideoFrameProcessor.1
        @Override // androidx.media3.common.Effect
        public final /* synthetic */ long getDurationAfterEffectApplied(long j) {
            return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, j);
        }
    });

    @Deprecated
    public static final long RENDER_OUTPUT_FRAME_IMMEDIATELY = -1;
    public static final long RENDER_OUTPUT_FRAME_WITH_PRESENTATION_TIME = -3;

    public interface Factory {
        VideoFrameProcessor create(Context context, DebugViewProvider debugViewProvider, ColorInfo colorInfo, boolean z, Executor executor, Listener listener);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InputType {
    }

    public interface Listener {
        void onEnded();

        void onError(VideoFrameProcessingException videoFrameProcessingException);

        void onInputStreamRegistered(int i, Format format, List<Effect> list);

        void onOutputFrameAvailableForRendering(long j, boolean z);

        void onOutputFrameRateChanged(float f);

        void onOutputSizeChanged(int i, int i2);
    }

    void flush();

    Surface getInputSurface();

    int getPendingInputFrameCount();

    boolean queueInputBitmap(Bitmap bitmap, TimestampIterator timestampIterator);

    boolean queueInputTexture(int i, long j);

    void redraw();

    boolean registerInputFrame();

    void registerInputStream(int i, Format format, List<Effect> list, long j);

    void release();

    void renderOutputFrame(long j);

    void setOnInputFrameProcessedListener(OnInputFrameProcessedListener onInputFrameProcessedListener);

    void setOnInputSurfaceReadyListener(Runnable runnable);

    void setOutputSurfaceInfo(@Nullable SurfaceInfo surfaceInfo);

    void signalEndOfInput();
}
