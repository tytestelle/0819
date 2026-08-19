package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;

/* JADX INFO: loaded from: classes.dex */
final class AudioBecomingNoisyManager {
    private final HandlerWrapper backgroundHandler;
    private final Context context;
    private boolean isEnabled;
    private final AudioBecomingNoisyReceiver receiver;

    public final class AudioBecomingNoisyReceiver extends BroadcastReceiver {
        private final HandlerWrapper eventHandler;
        private final EventListener listener;

        public AudioBecomingNoisyReceiver(HandlerWrapper handlerWrapper, EventListener eventListener) {
            this.eventHandler = handlerWrapper;
            this.listener = eventListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void callListenerIfEnabled() {
            if (AudioBecomingNoisyManager.this.isEnabled) {
                this.listener.onAudioBecomingNoisy();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.eventHandler.post(new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, 0));
            }
        }
    }

    public interface EventListener {
        void onAudioBecomingNoisy();
    }

    public AudioBecomingNoisyManager(Context context, Looper looper, Looper looper2, EventListener eventListener, Clock clock) {
        this.context = context.getApplicationContext();
        this.backgroundHandler = clock.createHandler(looper, null);
        this.receiver = new AudioBecomingNoisyReceiver(clock.createHandler(looper2, null), eventListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setEnabled$0() {
        this.context.registerReceiver(this.receiver, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setEnabled$1() {
        this.context.unregisterReceiver(this.receiver);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public void setEnabled(boolean z) {
        if (z == this.isEnabled) {
            return;
        }
        if (z) {
            final int i = 0;
            this.backgroundHandler.post(new Runnable(this) { // from class: androidx.media3.exoplayer.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO

                /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
                public final /* synthetic */ AudioBecomingNoisyManager f2315O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

                {
                    this.f2315O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            this.f2315O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$setEnabled$0();
                            break;
                        default:
                            this.f2315O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$setEnabled$1();
                            break;
                    }
                }
            });
            this.isEnabled = true;
        } else {
            final int i2 = 1;
            this.backgroundHandler.post(new Runnable(this) { // from class: androidx.media3.exoplayer.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO

                /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
                public final /* synthetic */ AudioBecomingNoisyManager f2315O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

                {
                    this.f2315O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            this.f2315O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$setEnabled$0();
                            break;
                        default:
                            this.f2315O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$setEnabled$1();
                            break;
                    }
                }
            });
            this.isEnabled = false;
        }
    }
}
