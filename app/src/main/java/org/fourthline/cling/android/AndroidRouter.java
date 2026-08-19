package org.fourthline.cling.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.UpnpServiceConfiguration;
import org.fourthline.cling.model.ModelUtil;
import org.fourthline.cling.protocol.ProtocolFactory;
import org.fourthline.cling.transport.Router;
import org.fourthline.cling.transport.RouterException;
import org.fourthline.cling.transport.RouterImpl;

/* JADX INFO: loaded from: classes2.dex */
public class AndroidRouter extends RouterImpl {
    private static final Logger log = Logger.getLogger(Router.class.getName());
    protected BroadcastReceiver broadcastReceiver;
    private final Context context;
    protected WifiManager.MulticastLock multicastLock;
    protected NetworkInfo networkInfo;
    protected WifiManager.WifiLock wifiLock;
    private final WifiManager wifiManager;

    public class ConnectivityBroadcastReceiver extends BroadcastReceiver {
        public ConnectivityBroadcastReceiver() {
        }

        public void displayIntentInfo(Intent intent) {
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            String stringExtra = intent.getStringExtra("reason");
            boolean booleanExtra2 = intent.getBooleanExtra("isFailover", false);
            Object obj = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            Object obj2 = (NetworkInfo) intent.getParcelableExtra("otherNetwork");
            AndroidRouter.log.info("Connectivity change detected...");
            AndroidRouter.log.info("EXTRA_NO_CONNECTIVITY: " + booleanExtra);
            AndroidRouter.log.info("EXTRA_REASON: " + stringExtra);
            AndroidRouter.log.info("EXTRA_IS_FAILOVER: " + booleanExtra2);
            Logger logger = AndroidRouter.log;
            StringBuilder sb = new StringBuilder("EXTRA_NETWORK_INFO: ");
            if (obj == null) {
                obj = "none";
            }
            sb.append(obj);
            logger.info(sb.toString());
            Logger logger2 = AndroidRouter.log;
            StringBuilder sb2 = new StringBuilder("EXTRA_OTHER_NETWORK_INFO: ");
            if (obj2 == null) {
                obj2 = "none";
            }
            sb2.append(obj2);
            logger2.info(sb2.toString());
            AndroidRouter.log.info("EXTRA_EXTRA_INFO: " + intent.getStringExtra("extraInfo"));
        }

        public boolean isSameNetworkType(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
            if (networkInfo == null && networkInfo2 == null) {
                return true;
            }
            return (networkInfo == null || networkInfo2 == null || networkInfo.getType() != networkInfo2.getType()) ? false : true;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                displayIntentInfo(intent);
                NetworkInfo connectedNetworkInfo = NetworkUtils.getConnectedNetworkInfo(context);
                if (AndroidRouter.this.networkInfo != null && connectedNetworkInfo == null) {
                    for (int i = 1; i <= 3; i++) {
                        try {
                            Thread.sleep(1000L);
                            AndroidRouter.log.warning(String.format("%s => NONE network transition, waiting for new network... retry #%d", AndroidRouter.this.networkInfo.getTypeName(), Integer.valueOf(i)));
                            connectedNetworkInfo = NetworkUtils.getConnectedNetworkInfo(context);
                            if (connectedNetworkInfo != null) {
                                break;
                            }
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                if (isSameNetworkType(AndroidRouter.this.networkInfo, connectedNetworkInfo)) {
                    AndroidRouter.log.info("No actual network change... ignoring event!");
                    return;
                }
                try {
                    AndroidRouter androidRouter = AndroidRouter.this;
                    androidRouter.onNetworkTypeChange(androidRouter.networkInfo, connectedNetworkInfo);
                } catch (RouterException e) {
                    AndroidRouter.this.handleRouterExceptionOnNetworkTypeChange(e);
                }
            }
        }
    }

    public AndroidRouter(UpnpServiceConfiguration upnpServiceConfiguration, ProtocolFactory protocolFactory, Context context) {
        super(upnpServiceConfiguration, protocolFactory);
        this.context = context;
        this.wifiManager = (WifiManager) context.getSystemService("wifi");
        this.networkInfo = NetworkUtils.getConnectedNetworkInfo(context);
        if (ModelUtil.ANDROID_EMULATOR) {
            return;
        }
        BroadcastReceiver broadcastReceiverCreateConnectivityBroadcastReceiver = createConnectivityBroadcastReceiver();
        this.broadcastReceiver = broadcastReceiverCreateConnectivityBroadcastReceiver;
        context.registerReceiver(broadcastReceiverCreateConnectivityBroadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public BroadcastReceiver createConnectivityBroadcastReceiver() {
        return new ConnectivityBroadcastReceiver();
    }

    @Override // org.fourthline.cling.transport.RouterImpl, org.fourthline.cling.transport.Router
    public boolean disable() {
        lock(this.writeLock);
        try {
            if (isWifi()) {
                setWiFiMulticastLock(false);
                setWifiLock(false);
            }
            return super.disable();
        } finally {
            unlock(this.writeLock);
        }
    }

    @Override // org.fourthline.cling.transport.RouterImpl, org.fourthline.cling.transport.Router
    public boolean enable() {
        lock(this.writeLock);
        try {
            boolean zEnable = super.enable();
            if (zEnable && isWifi()) {
                setWiFiMulticastLock(true);
                setWifiLock(true);
            }
            return zEnable;
        } finally {
            unlock(this.writeLock);
        }
    }

    public boolean enableWiFi() {
        log.info("Enabling WiFi...");
        try {
            return this.wifiManager.setWifiEnabled(true);
        } catch (Throwable th) {
            log.log(Level.WARNING, "SetWifiEnabled failed", th);
            return false;
        }
    }

    @Override // org.fourthline.cling.transport.RouterImpl
    public int getLockTimeoutMillis() {
        return 15000;
    }

    public NetworkInfo getNetworkInfo() {
        return this.networkInfo;
    }

    public void handleRouterExceptionOnNetworkTypeChange(RouterException routerException) {
        Throwable thO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(routerException);
        if (thO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o instanceof InterruptedException) {
            log.log(Level.INFO, "Router was interrupted: " + routerException, thO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o);
            return;
        }
        log.log(Level.WARNING, "Router error on network change: " + routerException, (Throwable) routerException);
    }

    public boolean isEthernet() {
        return NetworkUtils.isEthernet(this.networkInfo);
    }

    public boolean isMobile() {
        return NetworkUtils.isMobile(this.networkInfo);
    }

    public boolean isWifi() {
        return NetworkUtils.isWifi(this.networkInfo);
    }

    public void onNetworkTypeChange(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        Logger logger = log;
        logger.info("Network type changed " + (networkInfo == null ? "" : networkInfo.getTypeName()) + " => " + (networkInfo2 == null ? "NONE" : networkInfo2.getTypeName()));
        if (disable()) {
            logger.info("Disabled router on network type change (old network: " + (networkInfo == null ? "NONE" : networkInfo.getTypeName()) + ")");
        }
        this.networkInfo = networkInfo2;
        if (enable()) {
            logger.info("Enabled router on network type change (new network: " + (networkInfo2 != null ? networkInfo2.getTypeName() : "NONE") + ")");
        }
    }

    public void setWiFiMulticastLock(boolean z) {
        if (this.multicastLock == null) {
            this.multicastLock = this.wifiManager.createMulticastLock(getClass().getSimpleName());
        }
        if (z) {
            if (this.multicastLock.isHeld()) {
                log.warning("WiFi multicast lock already acquired");
                return;
            } else {
                log.info("WiFi multicast lock acquired");
                this.multicastLock.acquire();
                return;
            }
        }
        if (!this.multicastLock.isHeld()) {
            log.warning("WiFi multicast lock already released");
        } else {
            log.info("WiFi multicast lock released");
            this.multicastLock.release();
        }
    }

    public void setWifiLock(boolean z) {
        if (this.wifiLock == null) {
            this.wifiLock = this.wifiManager.createWifiLock(3, getClass().getSimpleName());
        }
        if (z) {
            if (this.wifiLock.isHeld()) {
                log.warning("WiFi lock already acquired");
                return;
            } else {
                log.info("WiFi lock acquired");
                this.wifiLock.acquire();
                return;
            }
        }
        if (!this.wifiLock.isHeld()) {
            log.warning("WiFi lock already released");
        } else {
            log.info("WiFi lock released");
            this.wifiLock.release();
        }
    }

    @Override // org.fourthline.cling.transport.RouterImpl, org.fourthline.cling.transport.Router
    public void shutdown() {
        super.shutdown();
        unregisterBroadcastReceiver();
    }

    public void unregisterBroadcastReceiver() {
        BroadcastReceiver broadcastReceiver = this.broadcastReceiver;
        if (broadcastReceiver != null) {
            this.context.unregisterReceiver(broadcastReceiver);
            this.broadcastReceiver = null;
        }
    }
}
