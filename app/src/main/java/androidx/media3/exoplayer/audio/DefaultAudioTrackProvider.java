package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class DefaultAudioTrackProvider implements DefaultAudioSink.AudioTrackProvider {
    private AudioTrack createAudioTrackV21(AudioSink.AudioTrackConfig audioTrackConfig, AudioAttributes audioAttributes, int i) {
        return new AudioTrack(getAudioTrackAttributesV21(audioAttributes, audioTrackConfig.tunneling), Util.getAudioFormat(audioTrackConfig.sampleRate, audioTrackConfig.channelConfig, audioTrackConfig.encoding), audioTrackConfig.bufferSize, 1, i);
    }

    @RequiresApi(23)
    private AudioTrack createAudioTrackV23(AudioSink.AudioTrackConfig audioTrackConfig, AudioAttributes audioAttributes, int i, @Nullable Context context) {
        AudioTrack.Builder sessionId = O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000().setAudioAttributes(getAudioTrackAttributesV21(audioAttributes, audioTrackConfig.tunneling)).setAudioFormat(Util.getAudioFormat(audioTrackConfig.sampleRate, audioTrackConfig.channelConfig, audioTrackConfig.encoding)).setTransferMode(1).setBufferSizeInBytes(audioTrackConfig.bufferSize).setSessionId(i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            setOffloadedPlaybackV29(sessionId, audioTrackConfig.offload);
        }
        if (i2 >= 34 && context != null) {
            sessionId.setContext(context);
        }
        return customizeAudioTrackBuilder(sessionId).build();
    }

    private android.media.AudioAttributes getAudioTrackAttributesV21(AudioAttributes audioAttributes, boolean z) {
        return z ? getAudioTrackTunnelingAttributesV21() : audioAttributes.getAudioAttributesV21().audioAttributes;
    }

    private android.media.AudioAttributes getAudioTrackTunnelingAttributesV21() {
        return new android.media.AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    @RequiresApi(29)
    private void setOffloadedPlaybackV29(AudioTrack.Builder builder, boolean z) {
        builder.setOffloadedPlayback(z);
    }

    @CanIgnoreReturnValue
    @RequiresApi(23)
    public AudioTrack.Builder customizeAudioTrackBuilder(AudioTrack.Builder builder) {
        return builder;
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackProvider
    public final AudioTrack getAudioTrack(AudioSink.AudioTrackConfig audioTrackConfig, AudioAttributes audioAttributes, int i, @Nullable Context context) {
        return Build.VERSION.SDK_INT >= 23 ? createAudioTrackV23(audioTrackConfig, audioAttributes, i, context) : createAudioTrackV21(audioTrackConfig, audioAttributes, i);
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackProvider
    public final /* synthetic */ int getAudioTrackChannelConfig(int i) {
        return O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, i);
    }
}
