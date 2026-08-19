package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class StreamVolumeManager {
    private static final String TAG = "StreamVolumeManager";
    private static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private final Context applicationContext;
    private AudioManager audioManager;
    private final Listener listener;

    @Nullable
    private VolumeChangeReceiver receiver;
    private final BackgroundThreadStateHandler<StreamVolumeState> stateHandler;
    private int volumeBeforeMute;

    public interface Listener {
        void onStreamTypeChanged(int i);

        void onStreamVolumeChanged(int i, boolean z);
    }

    public static final class StreamVolumeState {
        public final int maxVolume;
        public final int minVolume;
        public final boolean muted;
        public final int streamType;
        public final int volume;

        public StreamVolumeState(int i, int i2, boolean z, int i3, int i4) {
            this.streamType = i;
            this.volume = i2;
            this.muted = z;
            this.minVolume = i3;
            this.maxVolume = i4;
        }
    }

    public final class VolumeChangeReceiver extends BroadcastReceiver {
        private VolumeChangeReceiver() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceive$0() {
            if (StreamVolumeManager.this.receiver == null) {
                return;
            }
            StreamVolumeManager.this.stateHandler.setStateInBackground(StreamVolumeManager.this.generateState(((StreamVolumeState) StreamVolumeManager.this.stateHandler.get()).streamType));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            StreamVolumeManager.this.stateHandler.runInBackground(new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, 4));
        }
    }

    public StreamVolumeManager(Context context, Listener listener, final int i, Looper looper, Looper looper2, Clock clock) {
        this.applicationContext = context.getApplicationContext();
        this.listener = listener;
        BackgroundThreadStateHandler<StreamVolumeState> backgroundThreadStateHandler = new BackgroundThreadStateHandler<>(new StreamVolumeState(i, 0, false, 0, 0), looper, looper2, clock, new O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(this, 10));
        this.stateHandler = backgroundThreadStateHandler;
        backgroundThreadStateHandler.runInBackground(new Runnable() { // from class: androidx.media3.exoplayer.O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo
            @Override // java.lang.Runnable
            public final void run() {
                this.f2407O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lambda$new$0(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StreamVolumeState generateState(int i) {
        Assertions.checkNotNull(this.audioManager);
        return new StreamVolumeState(i, AudioManagerCompat.getStreamVolume(this.audioManager, i), AudioManagerCompat.isStreamMute(this.audioManager, i), AudioManagerCompat.getStreamMinVolume(this.audioManager, i), AudioManagerCompat.getStreamMaxVolume(this.audioManager, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ StreamVolumeState lambda$decreaseVolume$7(StreamVolumeState streamVolumeState) {
        int i = streamVolumeState.streamType;
        int i2 = streamVolumeState.volume;
        int i3 = streamVolumeState.minVolume;
        return new StreamVolumeState(i, i2 > i3 ? i2 - 1 : i3, i2 <= 1, i3, streamVolumeState.maxVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StreamVolumeState lambda$decreaseVolume$8(int i, StreamVolumeState streamVolumeState) {
        if (streamVolumeState.volume <= streamVolumeState.minVolume) {
            return streamVolumeState;
        }
        ((AudioManager) Assertions.checkNotNull(this.audioManager)).adjustStreamVolume(streamVolumeState.streamType, -1, i);
        return generateState(streamVolumeState.streamType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ StreamVolumeState lambda$increaseVolume$5(StreamVolumeState streamVolumeState) {
        int i = streamVolumeState.streamType;
        int i2 = streamVolumeState.volume;
        int i3 = streamVolumeState.maxVolume;
        return new StreamVolumeState(i, i2 < i3 ? i2 + 1 : i3, false, streamVolumeState.minVolume, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StreamVolumeState lambda$increaseVolume$6(int i, StreamVolumeState streamVolumeState) {
        if (streamVolumeState.volume >= streamVolumeState.maxVolume) {
            return streamVolumeState;
        }
        ((AudioManager) Assertions.checkNotNull(this.audioManager)).adjustStreamVolume(streamVolumeState.streamType, 1, i);
        return generateState(streamVolumeState.streamType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i) {
        this.audioManager = (AudioManager) Assertions.checkStateNotNull((AudioManager) this.applicationContext.getSystemService("audio"));
        VolumeChangeReceiver volumeChangeReceiver = new VolumeChangeReceiver();
        try {
            this.applicationContext.registerReceiver(volumeChangeReceiver, new IntentFilter(VOLUME_CHANGED_ACTION));
            this.receiver = volumeChangeReceiver;
        } catch (RuntimeException e) {
            Log.w(TAG, "Error registering stream volume receiver", e);
        }
        this.stateHandler.setStateInBackground(generateState(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ StreamVolumeState lambda$release$11(StreamVolumeState streamVolumeState) {
        return streamVolumeState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StreamVolumeState lambda$release$12(StreamVolumeState streamVolumeState) {
        VolumeChangeReceiver volumeChangeReceiver = this.receiver;
        if (volumeChangeReceiver != null) {
            try {
                this.applicationContext.unregisterReceiver(volumeChangeReceiver);
            } catch (RuntimeException e) {
                Log.w(TAG, "Error unregistering stream volume receiver", e);
            }
            this.receiver = null;
        }
        return streamVolumeState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StreamVolumeState lambda$setMuted$10(boolean z, int i, StreamVolumeState streamVolumeState) {
        if (streamVolumeState.muted == z) {
            return streamVolumeState;
        }
        Assertions.checkNotNull(this.audioManager);
        if (Build.VERSION.SDK_INT >= 23) {
            this.audioManager.adjustStreamVolume(streamVolumeState.streamType, z ? -100 : 100, i);
        } else {
            this.audioManager.setStreamMute(streamVolumeState.streamType, z);
        }
        return generateState(streamVolumeState.streamType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StreamVolumeState lambda$setMuted$9(boolean z, StreamVolumeState streamVolumeState) {
        int i;
        int i2;
        int i3 = streamVolumeState.streamType;
        if (streamVolumeState.muted != z) {
            if (z) {
                i2 = 0;
            } else {
                i = this.volumeBeforeMute;
            }
            return new StreamVolumeState(i3, i2, z, streamVolumeState.minVolume, streamVolumeState.maxVolume);
        }
        i = streamVolumeState.volume;
        i2 = i;
        return new StreamVolumeState(i3, i2, z, streamVolumeState.minVolume, streamVolumeState.maxVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ StreamVolumeState lambda$setStreamType$1(int i, StreamVolumeState streamVolumeState) {
        return new StreamVolumeState(i, streamVolumeState.volume, streamVolumeState.muted, streamVolumeState.minVolume, streamVolumeState.maxVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StreamVolumeState lambda$setStreamType$2(int i, StreamVolumeState streamVolumeState) {
        return streamVolumeState.streamType == i ? streamVolumeState : generateState(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ StreamVolumeState lambda$setVolume$3(int i, StreamVolumeState streamVolumeState) {
        int i2 = streamVolumeState.streamType;
        int i3 = streamVolumeState.minVolume;
        return new StreamVolumeState(i2, (i < i3 || i > streamVolumeState.maxVolume) ? streamVolumeState.volume : i, i == 0, i3, streamVolumeState.maxVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StreamVolumeState lambda$setVolume$4(int i, int i2, StreamVolumeState streamVolumeState) {
        if (i == streamVolumeState.volume || i < streamVolumeState.minVolume || i > streamVolumeState.maxVolume) {
            return streamVolumeState;
        }
        ((AudioManager) Assertions.checkNotNull(this.audioManager)).setStreamVolume(streamVolumeState.streamType, i, i2);
        return generateState(streamVolumeState.streamType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStreamVolumeStateChanged(StreamVolumeState streamVolumeState, StreamVolumeState streamVolumeState2) {
        boolean z = streamVolumeState.muted;
        if (!z && streamVolumeState2.muted) {
            this.volumeBeforeMute = streamVolumeState.volume;
        }
        int i = streamVolumeState.volume;
        int i2 = streamVolumeState2.volume;
        if (i != i2 || z != streamVolumeState2.muted) {
            this.listener.onStreamVolumeChanged(i2, streamVolumeState2.muted);
        }
        int i3 = streamVolumeState.streamType;
        int i4 = streamVolumeState2.streamType;
        if (i3 == i4 && streamVolumeState.minVolume == streamVolumeState2.minVolume && streamVolumeState.maxVolume == streamVolumeState2.maxVolume) {
            return;
        }
        this.listener.onStreamTypeChanged(i4);
    }

    @SuppressLint({"WrongConstant"})
    public void decreaseVolume(int i) {
        this.stateHandler.updateStateAsync(new O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00(2), new O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO(this, i, 1));
    }

    public int getMaxVolume() {
        return this.stateHandler.get().maxVolume;
    }

    public int getMinVolume() {
        return this.stateHandler.get().minVolume;
    }

    public int getVolume() {
        return this.stateHandler.get().volume;
    }

    @SuppressLint({"WrongConstant"})
    public void increaseVolume(int i) {
        this.stateHandler.updateStateAsync(new O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00(1), new O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO(this, i, 0));
    }

    public boolean isMuted() {
        return this.stateHandler.get().muted;
    }

    public void release() {
        this.stateHandler.updateStateAsync(new O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00(0), new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this, 2));
    }

    @SuppressLint({"WrongConstant"})
    public void setMuted(final boolean z, final int i) {
        this.stateHandler.updateStateAsync(new com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo() { // from class: androidx.media3.exoplayer.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo
            @Override // com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
            public final Object apply(Object obj) {
                return this.f2412O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lambda$setMuted$9(z, (StreamVolumeManager.StreamVolumeState) obj);
            }
        }, new com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo() { // from class: androidx.media3.exoplayer.O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00
            @Override // com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
            public final Object apply(Object obj) {
                return this.f2414O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lambda$setMuted$10(z, i, (StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }

    public void setStreamType(int i) {
        this.stateHandler.updateStateAsync(new O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(i, 4), new O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO(this, i, 2));
    }

    @SuppressLint({"WrongConstant"})
    public void setVolume(final int i, final int i2) {
        this.stateHandler.updateStateAsync(new O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(i, 3), new com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo() { // from class: androidx.media3.exoplayer.O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo
            @Override // com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
            public final Object apply(Object obj) {
                return this.f2409O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lambda$setVolume$4(i, i2, (StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }
}
