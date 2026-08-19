package xyz.doikki.videoplayer.exo;

import android.content.Context;
import android.os.Handler;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
class FfmpegRenderersFactory extends DefaultRenderersFactory {
    public FfmpegRenderersFactory(Context context) {
        super(context);
        setExtensionRendererMode(1);
    }

    @Override // androidx.media3.exoplayer.DefaultRenderersFactory
    public void buildAudioRenderers(Context context, int i, MediaCodecSelector mediaCodecSelector, boolean z, AudioSink audioSink, Handler handler, AudioRendererEventListener audioRendererEventListener, ArrayList<Renderer> arrayList) {
        arrayList.add(new FfmpegAudioRenderer());
        super.buildAudioRenderers(context, i, mediaCodecSelector, z, audioSink, handler, audioRendererEventListener, arrayList);
    }
}
