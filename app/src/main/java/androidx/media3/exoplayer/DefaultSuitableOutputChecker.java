package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class DefaultSuitableOutputChecker implements SuitableOutputChecker {

    @Nullable
    private final SuitableOutputChecker impl;

    @RequiresApi(23)
    public static final class ImplApi23 implements SuitableOutputChecker {
        private AudioDeviceCallback audioDeviceCallback;

        @Nullable
        private AudioManager audioManager;
        private BackgroundThreadStateHandler<Boolean> isSuitableForPlaybackState;

        private ImplApi23() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasSupportedAudioOutput() {
            for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) Assertions.checkStateNotNull(this.audioManager)).getDevices(2)) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$disable$2() {
            AudioManager audioManager = this.audioManager;
            if (audioManager != null) {
                audioManager.unregisterAudioDeviceCallback(androidx.media3.common.util.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(Assertions.checkNotNull(this.audioDeviceCallback)));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$enable$0(SuitableOutputChecker.Callback callback, Boolean bool, Boolean bool2) {
            callback.onSelectedOutputSuitabilityChanged(bool2.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$enable$1(Context context) {
            AudioManager audioManager;
            Assertions.checkNotNull(this.isSuitableForPlaybackState);
            if (Util.isWear(context) && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
                this.audioManager = audioManager;
                AudioDeviceCallback audioDeviceCallback = new AudioDeviceCallback() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi23.1
                    @Override // android.media.AudioDeviceCallback
                    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                        ImplApi23.this.isSuitableForPlaybackState.setStateInBackground(Boolean.valueOf(ImplApi23.this.hasSupportedAudioOutput()));
                    }

                    @Override // android.media.AudioDeviceCallback
                    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                        ImplApi23.this.isSuitableForPlaybackState.setStateInBackground(Boolean.valueOf(ImplApi23.this.hasSupportedAudioOutput()));
                    }
                };
                this.audioDeviceCallback = audioDeviceCallback;
                audioManager.registerAudioDeviceCallback(audioDeviceCallback, new Handler((Looper) Assertions.checkNotNull(Looper.myLooper())));
                this.isSuitableForPlaybackState.setStateInBackground(Boolean.valueOf(hasSupportedAudioOutput()));
            }
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public void disable() {
            ((BackgroundThreadStateHandler) Assertions.checkNotNull(this.isSuitableForPlaybackState)).runInBackground(new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, 1));
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public void enable(SuitableOutputChecker.Callback callback, Context context, Looper looper, Looper looper2, Clock clock) {
            BackgroundThreadStateHandler<Boolean> backgroundThreadStateHandler = new BackgroundThreadStateHandler<>(Boolean.TRUE, looper2, looper, clock, new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(callback, 0));
            this.isSuitableForPlaybackState = backgroundThreadStateHandler;
            backgroundThreadStateHandler.runInBackground(new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this, context, 0));
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public boolean isSelectedOutputSuitableForPlayback() {
            BackgroundThreadStateHandler<Boolean> backgroundThreadStateHandler = this.isSuitableForPlaybackState;
            if (backgroundThreadStateHandler == null) {
                return true;
            }
            return backgroundThreadStateHandler.get().booleanValue();
        }
    }

    @RequiresApi(35)
    public static final class ImplApi35 implements SuitableOutputChecker {
        private static final RouteDiscoveryPreference EMPTY_DISCOVERY_PREFERENCE;

        @Nullable
        private MediaRouter2.ControllerCallback controllerCallback;
        private BackgroundThreadStateHandler<Boolean> isSuitableForPlaybackState;
        private MediaRouter2.RouteCallback routeCallback;
        private MediaRouter2 router;

        static {
            androidx.core.view.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();
            EMPTY_DISCOVERY_PREFERENCE = androidx.core.view.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.of()).build();
        }

        private ImplApi35() {
        }

        private static boolean isRouteSuitableForMediaPlayback(MediaRoute2Info mediaRoute2Info, int i, boolean z) {
            int suitabilityStatus = mediaRoute2Info.getSuitabilityStatus();
            if (suitabilityStatus == 1) {
                return (i == 1 || i == 2) && z;
            }
            return suitabilityStatus == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$disable$2() {
            androidx.core.view.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(Assertions.checkNotNull(this.router)).unregisterControllerCallback(androidx.core.view.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Assertions.checkNotNull(this.controllerCallback)));
            this.controllerCallback = null;
            this.router.unregisterRouteCallback(androidx.core.view.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Assertions.checkNotNull(this.routeCallback)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$enable$0(SuitableOutputChecker.Callback callback, Boolean bool, Boolean bool2) {
            callback.onSelectedOutputSuitabilityChanged(bool2.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.media3.exoplayer.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO] */
        public /* synthetic */ void lambda$enable$1(Context context) {
            Assertions.checkNotNull(this.isSuitableForPlaybackState);
            this.router = MediaRouter2.getInstance(context);
            this.routeCallback = new MediaRouter2.RouteCallback() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi35.1
            };
            final BackgroundThreadStateHandler<Boolean> backgroundThreadStateHandler = this.isSuitableForPlaybackState;
            Objects.requireNonNull(backgroundThreadStateHandler);
            Object r0 = new Executor() { // from class: androidx.media3.exoplayer.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    backgroundThreadStateHandler.runInBackground(runnable);
                }
            };
            this.router.registerRouteCallback(r0, this.routeCallback, EMPTY_DISCOVERY_PREFERENCE);
            MediaRouter2.ControllerCallback controllerCallback = new MediaRouter2.ControllerCallback() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi35.2
                @Override // android.media.MediaRouter2.ControllerCallback
                public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                    ImplApi35.this.isSuitableForPlaybackState.setStateInBackground(Boolean.valueOf(ImplApi35.isSelectedOutputSuitableForPlayback(ImplApi35.this.router)));
                }
            };
            this.controllerCallback = controllerCallback;
            this.router.registerControllerCallback(r0, controllerCallback);
            this.isSuitableForPlaybackState.setStateInBackground(Boolean.valueOf(isSelectedOutputSuitableForPlayback(this.router)));
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public void disable() {
            ((BackgroundThreadStateHandler) Assertions.checkStateNotNull(this.isSuitableForPlaybackState)).runInBackground(new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, 2));
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        @SuppressLint({"ThreadSafe"})
        public void enable(SuitableOutputChecker.Callback callback, Context context, Looper looper, Looper looper2, Clock clock) {
            BackgroundThreadStateHandler<Boolean> backgroundThreadStateHandler = new BackgroundThreadStateHandler<>(Boolean.TRUE, looper2, looper, clock, new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(callback, 1));
            this.isSuitableForPlaybackState = backgroundThreadStateHandler;
            backgroundThreadStateHandler.runInBackground(new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this, context, 1));
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public boolean isSelectedOutputSuitableForPlayback() {
            BackgroundThreadStateHandler<Boolean> backgroundThreadStateHandler = this.isSuitableForPlaybackState;
            if (backgroundThreadStateHandler == null) {
                return true;
            }
            return backgroundThreadStateHandler.get().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isSelectedOutputSuitableForPlayback(MediaRouter2 mediaRouter2) {
            int transferReason = androidx.core.view.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(Assertions.checkNotNull(mediaRouter2)).getSystemController().getRoutingSessionInfo().getTransferReason();
            boolean zWasTransferInitiatedBySelf = mediaRouter2.getSystemController().wasTransferInitiatedBySelf();
            Iterator it = mediaRouter2.getSystemController().getSelectedRoutes().iterator();
            while (it.hasNext()) {
                if (isRouteSuitableForMediaPlayback(androidx.core.view.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(it.next()), transferReason, zWasTransferInitiatedBySelf)) {
                    return true;
                }
            }
            return false;
        }
    }

    public DefaultSuitableOutputChecker() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.impl = new ImplApi35();
        } else if (i >= 23) {
            this.impl = new ImplApi23();
        } else {
            this.impl = null;
        }
    }

    @Override // androidx.media3.exoplayer.SuitableOutputChecker
    public void disable() {
        SuitableOutputChecker suitableOutputChecker = this.impl;
        if (suitableOutputChecker != null) {
            suitableOutputChecker.disable();
        }
    }

    @Override // androidx.media3.exoplayer.SuitableOutputChecker
    public void enable(SuitableOutputChecker.Callback callback, Context context, Looper looper, Looper looper2, Clock clock) {
        SuitableOutputChecker suitableOutputChecker = this.impl;
        if (suitableOutputChecker != null) {
            suitableOutputChecker.enable(callback, context, looper, looper2, clock);
        }
    }

    @Override // androidx.media3.exoplayer.SuitableOutputChecker
    public boolean isSelectedOutputSuitableForPlayback() {
        SuitableOutputChecker suitableOutputChecker = this.impl;
        return suitableOutputChecker == null || suitableOutputChecker.isSelectedOutputSuitableForPlayback();
    }
}
