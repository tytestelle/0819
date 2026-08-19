package org.fourthline.cling.model.message.header;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import org.fourthline.cling.model.types.UDN;

/* JADX INFO: loaded from: classes2.dex */
public class USNRootDeviceHeader extends UpnpHeader<UDN> {
    public static final String ROOT_DEVICE_SUFFIX = "::upnp:rootdevice";

    public USNRootDeviceHeader() {
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString() + ROOT_DEVICE_SUFFIX;
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        if (!str.startsWith("uuid:") || !str.endsWith(ROOT_DEVICE_SUFFIX)) {
            throw new InvalidHeaderException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("Invalid root device USN header value, must start with 'uuid:' and end with '::upnp:rootdevice' but is '", str, "'"));
        }
        setValue(new UDN(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(17, 5, str)));
    }

    public USNRootDeviceHeader(UDN udn) {
        setValue(udn);
    }
}
