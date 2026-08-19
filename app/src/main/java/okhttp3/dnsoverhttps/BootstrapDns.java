package okhttp3.dnsoverhttps;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import okhttp3.Dns;

/* JADX INFO: loaded from: classes2.dex */
final class BootstrapDns implements Dns {
    private final String dnsHostname;
    private final List<InetAddress> dnsServers;

    public BootstrapDns(String str, List<InetAddress> list) {
        this.dnsHostname = str;
        this.dnsServers = list;
    }

    @Override // okhttp3.Dns
    public List<InetAddress> lookup(String str) throws UnknownHostException {
        if (this.dnsHostname.equals(str)) {
            return this.dnsServers;
        }
        StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("BootstrapDns called for ", str, " instead of ");
        sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(this.dnsHostname);
        throw new UnknownHostException(sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.toString());
    }
}
