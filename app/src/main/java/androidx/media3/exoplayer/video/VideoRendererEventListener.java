package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface VideoRendererEventListener {

    public static final class EventDispatcher {

        @Nullable
        private final Handler handler;

        @Nullable
        private final VideoRendererEventListener listener;

        public EventDispatcher(@Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener) {
            this.handler = videoRendererEventListener != null ? (Handler) Assertions.checkNotNull(handler) : null;
            this.listener = videoRendererEventListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$decoderInitialized$1(String str, long j, long j2) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoDecoderInitialized(str, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$decoderReleased$7(String str) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoDecoderReleased(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$disabled$8(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoDisabled(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$droppedFrames$3(int i, long j) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onDroppedFrames(i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$enabled$0(DecoderCounters decoderCounters) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoEnabled(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$inputFormatChanged$2(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoInputFormatChanged(format, decoderReuseEvaluation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$renderedFirstFrame$6(Object obj, long j) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onRenderedFirstFrame(obj, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$reportVideoFrameProcessingOffset$4(long j, int i) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoFrameProcessingOffset(j, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$videoCodecError$9(Exception exc) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoCodecError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$videoSizeChanged$5(VideoSize videoSize) {
            ((VideoRendererEventListener) Util.castNonNull(this.listener)).onVideoSizeChanged(videoSize);
        }

        public void decoderInitialized(String str, long j, long j2) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this, str, j, j2, 1));
            }
        }

        public void decoderReleased(String str) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, str, 4));
            }
        }

        public void disabled(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this, decoderCounters, 1));
            }
        }

        public void droppedFrames(int i, long j) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this, i, j));
            }
        }

        public void enabled(DecoderCounters decoderCounters) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this, decoderCounters, 0));
            }
        }

        public void inputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this, 1, format, decoderReuseEvaluation));
            }
        }

        public void renderedFirstFrame(final Object obj) {
            if (this.handler != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2724O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lambda$renderedFirstFrame$6(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void reportVideoFrameProcessingOffset(long j, int i) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this, j, i));
            }
        }

        public void videoCodecError(Exception exc) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, exc, 3));
            }
        }

        public void videoSizeChanged(VideoSize videoSize) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, videoSize, 2));
            }
        }
    }

    void onDroppedFrames(int i, long j);

    void onRenderedFirstFrame(Object obj, long j);

    void onVideoCodecError(Exception exc);

    void onVideoDecoderInitialized(String str, long j, long j2);

    void onVideoDecoderReleased(String str);

    void onVideoDisabled(DecoderCounters decoderCounters);

    void onVideoEnabled(DecoderCounters decoderCounters);

    void onVideoFrameProcessingOffset(long j, int i);

    void onVideoInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    void onVideoSizeChanged(VideoSize videoSize);
}
