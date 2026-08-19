package androidx.media3.exoplayer.audio;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface AudioRendererEventListener {

    public static final class EventDispatcher {

        @Nullable
        private final Handler handler;

        @Nullable
        private final AudioRendererEventListener listener;

        public EventDispatcher(@Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener) {
            this.handler = audioRendererEventListener != null ? (Handler) Assertions.checkNotNull(handler) : null;
            this.listener = audioRendererEventListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$audioCodecError$9(Exception exc) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioCodecError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$audioSessionIdChanged$12(int i) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioSessionIdChanged(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$audioSinkError$8(Exception exc) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioSinkError(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$audioTrackInitialized$10(AudioSink.AudioTrackConfig audioTrackConfig) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioTrackInitialized(audioTrackConfig);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$audioTrackReleased$11(AudioSink.AudioTrackConfig audioTrackConfig) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioTrackReleased(audioTrackConfig);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$decoderInitialized$1(String str, long j, long j2) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioDecoderInitialized(str, j, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$decoderReleased$5(String str) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioDecoderReleased(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$disabled$6(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioDisabled(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$enabled$0(DecoderCounters decoderCounters) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioEnabled(decoderCounters);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$inputFormatChanged$2(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioInputFormatChanged(format, decoderReuseEvaluation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$positionAdvancing$3(long j) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioPositionAdvancing(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$skipSilenceEnabledChanged$7(boolean z) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onSkipSilenceEnabledChanged(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$underrun$4(int i, long j, long j2) {
            ((AudioRendererEventListener) Util.castNonNull(this.listener)).onAudioUnderrun(i, j, j2);
        }

        public void audioCodecError(Exception exc) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, exc, 0));
            }
        }

        public void audioSessionIdChanged(int i) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this, i, 10));
            }
        }

        public void audioSinkError(Exception exc) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, exc, 1));
            }
        }

        public void audioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, audioTrackConfig, 0));
            }
        }

        public void audioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, audioTrackConfig, 1));
            }
        }

        public void decoderInitialized(String str, long j, long j2) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this, str, j, j2, 0));
            }
        }

        public void decoderReleased(String str) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, str, 17));
            }
        }

        public void disabled(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, decoderCounters, 1));
            }
        }

        public void enabled(DecoderCounters decoderCounters) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, decoderCounters, 0));
            }
        }

        public void inputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, 7, format, decoderReuseEvaluation));
            }
        }

        public void positionAdvancing(long j) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, j, 2));
            }
        }

        public void skipSilenceEnabledChanged(boolean z) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(0, this, z));
            }
        }

        public void underrun(final int i, final long j, final long j2) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.audio.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2505O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lambda$underrun$4(i, j, j2);
                    }
                });
            }
        }
    }

    void onAudioCodecError(Exception exc);

    void onAudioDecoderInitialized(String str, long j, long j2);

    void onAudioDecoderReleased(String str);

    void onAudioDisabled(DecoderCounters decoderCounters);

    void onAudioEnabled(DecoderCounters decoderCounters);

    void onAudioInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    void onAudioPositionAdvancing(long j);

    void onAudioSessionIdChanged(int i);

    void onAudioSinkError(Exception exc);

    void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig);

    void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig);

    void onAudioUnderrun(int i, long j, long j2);

    void onSkipSilenceEnabledChanged(boolean z);
}
