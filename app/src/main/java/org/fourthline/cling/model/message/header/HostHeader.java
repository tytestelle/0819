package org.fourthline.cling.model.message.header;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import org.fourthline.cling.model.Constants;
import org.fourthline.cling.model.types.HostPort;

/* JADX INFO: loaded from: classes2.dex */
public class HostHeader extends UpnpHeader<HostPort> {
    int port = Constants.UPNP_MULTICAST_PORT;
    String group = Constants.IPV4_UPNP_MULTICAST_GROUP;

    public HostHeader() {
        setValue(new HostPort(Constants.IPV4_UPNP_MULTICAST_GROUP, Constants.UPNP_MULTICAST_PORT));
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        if (!str.contains(":")) {
            this.group = str;
            setValue(new HostPort(str, this.port));
            return;
        }
        try {
            this.port = Integer.valueOf(str.substring(str.indexOf(":") + 1)).intValue();
            String strSubstring = str.substring(0, str.indexOf(":"));
            this.group = strSubstring;
            setValue(new HostPort(strSubstring, this.port));
        } catch (NumberFormatException e) {
            StringBuilder sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("Invalid HOST header value, can't parse port: ", str, " - ");
            sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.append(e.getMessage());
            throw new InvalidHeaderException(sbO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.toString());
        }
    }

    public HostHeader(int i) {
        setValue(new HostPort(Constants.IPV4_UPNP_MULTICAST_GROUP, i));
    }

    public HostHeader(String str, int i) {
        setValue(new HostPort(str, i));
    }
}
