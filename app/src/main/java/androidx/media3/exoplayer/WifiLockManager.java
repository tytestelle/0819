package androidx.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class WifiLockManager {
    private static final String TAG = "WifiLockManager";
    private static final String WIFI_LOCK_TAG = "ExoPlayer:WifiLockManager";
    private boolean enabled;
    private boolean stayAwake;
    private final HandlerWrapper wifiLockHandler;
    private final WifiLockManagerInternal wifiLockManagerInternal;

    public static final class WifiLockManagerInternal {
        private final Context applicationContext;

        @Nullable
        private WifiManager.WifiLock wifiLock;

        public WifiLockManagerInternal(Context context) {
            this.applicationContext = context;
        }

        public void updateWifiLock(boolean z, boolean z2) {
            if (z && this.wifiLock == null) {
                WifiManager wifiManager = (WifiManager) this.applicationContext.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    Log.w(WifiLockManager.TAG, "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, WifiLockManager.WIFI_LOCK_TAG);
                    this.wifiLock = wifiLockCreateWifiLock;
                    wifiLockCreateWifiLock.setReferenceCounted(false);
                }
            }
            WifiManager.WifiLock wifiLock = this.wifiLock;
            if (wifiLock == null) {
                return;
            }
            if (z && z2) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }
    }

    public WifiLockManager(Context context, Looper looper, Clock clock) {
        this.wifiLockManagerInternal = new WifiLockManagerInternal(context.getApplicationContext());
        this.wifiLockHandler = clock.createHandler(looper, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setEnabled$0(boolean z, boolean z2) {
        this.wifiLockManagerInternal.updateWifiLock(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setStayAwake$1(boolean z) {
        this.wifiLockManagerInternal.updateWifiLock(true, z);
    }

    public void setEnabled(boolean z) {
        if (this.enabled == z) {
            return;
        }
        this.enabled = z;
        this.wifiLockHandler.post(new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo(this, z, this.stayAwake, 1));
    }

    public void setStayAwake(boolean z) {
        if (this.stayAwake == z) {
            return;
        }
        this.stayAwake = z;
        if (this.enabled) {
            this.wifiLockHandler.post(new O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00(1, this, z));
        }
    }
}
