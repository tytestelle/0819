package org.fourthline.cling.model.message.header;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class NTEventHeader extends UpnpHeader<String> {
    public NTEventHeader() {
        setValue("upnp:event");
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        if (!str.toLowerCase(Locale.ROOT).equals(getValue())) {
            throw new InvalidHeaderException("Invalid event NT header value: ".concat(str));
        }
    }
}
