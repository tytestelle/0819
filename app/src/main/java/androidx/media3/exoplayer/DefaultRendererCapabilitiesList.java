package androidx.media3.exoplayer;

import android.content.Context;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DefaultRendererCapabilitiesList implements RendererCapabilitiesList {
    private final Renderer[] renderers;

    public static final class Factory implements RendererCapabilitiesList.Factory {
        private final RenderersFactory renderersFactory;

        public Factory(Context context) {
            this.renderersFactory = new DefaultRenderersFactory(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$createRendererCapabilitiesList$0(CueGroup cueGroup) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$createRendererCapabilitiesList$1(Metadata metadata) {
        }

        @Override // androidx.media3.exoplayer.RendererCapabilitiesList.Factory
        public DefaultRendererCapabilitiesList createRendererCapabilitiesList() {
            return new DefaultRendererCapabilitiesList(this.renderersFactory.createRenderers(Util.createHandlerForCurrentOrMainLooper(), new VideoRendererEventListener() { // from class: androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory.1
                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public final /* synthetic */ void onDroppedFrames(int i, long j) {
                    androidx.media3.exoplayer.video.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, i, j);
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public final /* synthetic */ void onRenderedFirstFrame(Object obj, long j) {
                    androidx.media3.exoplayer.video.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, obj, j);
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public final /* synthetic */ void onVideoCodecError(Exception exc) {
                    androidx.media3.exoplayer.video.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, exc);
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public final /* synthetic */ void onVideoDecoderInitialized(String str, long j, long j2) {
                    androidx.media3.exoplayer.video.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, str, j, j2);
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public final /* synthetic */ void onVideoDecoderReleased(String str) {
                    androidx.media3.exoplayer.video.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, str);
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public final /* synthetic */ void onVideoDisabled(DecoderCounters decoderCounters) {
                    androidx.media3.exoplayer.video.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, decoderCounters);
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public final /* synthetic */ void onVideoEnabled(DecoderCounters decoderCounters) {
                    androidx.media3.exoplayer.video.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this, decoderCounters);
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public final /* synthetic */ void onVideoFrameProcessingOffset(long j, int i) {
                    androidx.media3.exoplayer.video.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this, j, i);
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public final /* synthetic */ void onVideoInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
                    androidx.media3.exoplayer.video.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this, format, decoderReuseEvaluation);
                }

                @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
                public final /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
                    androidx.media3.exoplayer.video.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, videoSize);
                }
            }, new AudioRendererEventListener() { // from class: androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory.2
                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final /* synthetic */ void onAudioCodecError(Exception exc) {
                    androidx.media3.exoplayer.audio.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, exc);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final /* synthetic */ void onAudioDecoderInitialized(String str, long j, long j2) {
                    androidx.media3.exoplayer.audio.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, str, j, j2);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final /* synthetic */ void onAudioDecoderReleased(String str) {
                    androidx.media3.exoplayer.audio.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, str);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final /* synthetic */ void onAudioDisabled(DecoderCounters decoderCounters) {
                    androidx.media3.exoplayer.audio.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, decoderCounters);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final /* synthetic */ void onAudioEnabled(DecoderCounters decoderCounters) {
                    androidx.media3.exoplayer.audio.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, decoderCounters);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final /* synthetic */ void onAudioInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
                    androidx.media3.exoplayer.audio.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, format, decoderReuseEvaluation);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final /* synthetic */ void onAudioPositionAdvancing(long j) {
                    androidx.media3.exoplayer.audio.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this, j);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final /* synthetic */ void onAudioSessionIdChanged(int i) {
                    androidx.media3.exoplayer.audio.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this, i);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final /* synthetic */ void onAudioSinkError(Exception exc) {
                    androidx.media3.exoplayer.audio.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this, exc);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final /* synthetic */ void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig) {
                    androidx.media3.exoplayer.audio.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, audioTrackConfig);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final /* synthetic */ void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig) {
                    androidx.media3.exoplayer.audio.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this, audioTrackConfig);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final /* synthetic */ void onAudioUnderrun(int i, long j, long j2) {
                    androidx.media3.exoplayer.audio.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this, i, j, j2);
                }

                @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
                public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
                    androidx.media3.exoplayer.audio.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this, z);
                }
            }, new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(), new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()));
        }

        public Factory(RenderersFactory renderersFactory) {
            this.renderersFactory = renderersFactory;
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilitiesList
    public RendererCapabilities[] getRendererCapabilities() {
        RendererCapabilities[] rendererCapabilitiesArr = new RendererCapabilities[this.renderers.length];
        int i = 0;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                return rendererCapabilitiesArr;
            }
            rendererCapabilitiesArr[i] = rendererArr[i].getCapabilities();
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilitiesList
    public void release() {
        for (Renderer renderer : this.renderers) {
            renderer.release();
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilitiesList
    public int size() {
        return this.renderers.length;
    }

    private DefaultRendererCapabilitiesList(Renderer[] rendererArr) {
        this.renderers = (Renderer[]) Arrays.copyOf(rendererArr, rendererArr.length);
        for (int i = 0; i < rendererArr.length; i++) {
            this.renderers[i].init(i, PlayerId.UNSET, Clock.DEFAULT);
        }
    }
}
