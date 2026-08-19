package org.fourthline.cling.model.message.header;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class RootDeviceHeader extends UpnpHeader<String> {
    public RootDeviceHeader() {
        setValue("upnp:rootdevice");
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        if (!str.toLowerCase(Locale.ROOT).equals(getValue())) {
            throw new InvalidHeaderException("Invalid root device NT header value: ".concat(str));
        }
    }
}
