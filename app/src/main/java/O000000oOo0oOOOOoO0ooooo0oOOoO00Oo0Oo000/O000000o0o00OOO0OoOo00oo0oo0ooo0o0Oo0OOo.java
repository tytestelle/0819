package O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {
    public static String O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Context context) {
        int ipAddress;
        String str;
        if (Build.VERSION.SDK_INT < 29) {
            Object systemService = context.getApplicationContext().getSystemService("wifi");
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            ipAddress = ((WifiManager) systemService).getConnectionInfo().getIpAddress();
        } else {
            Object systemService2 = context.getApplicationContext().getSystemService("connectivity");
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(systemService2, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService2;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                TransportInfo transportInfo = networkCapabilities != null ? networkCapabilities.getTransportInfo() : null;
                WifiInfo wifiInfo = transportInfo instanceof WifiInfo ? (WifiInfo) transportInfo : null;
                ipAddress = wifiInfo != null ? wifiInfo.getIpAddress() : 0;
            } else {
                ipAddress = 0;
            }
        }
        if (ipAddress == 0) {
            str = "";
        } else {
            str = (ipAddress & 255) + "." + ((ipAddress >> 8) & 255) + "." + ((ipAddress >> 16) & 255) + "." + ((ipAddress >> 24) & 255);
        }
        return "http://" + str + ":9091" + ServiceReference.DELIMITER;
    }
}
