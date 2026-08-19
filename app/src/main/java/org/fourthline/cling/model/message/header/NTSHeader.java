package org.fourthline.cling.model.message.header;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import org.fourthline.cling.model.types.NotificationSubtype;

/* JADX INFO: loaded from: classes2.dex */
public class NTSHeader extends UpnpHeader<NotificationSubtype> {
    public NTSHeader() {
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().getHeaderString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        for (NotificationSubtype notificationSubtype : NotificationSubtype.values()) {
            if (str.equals(notificationSubtype.getHeaderString())) {
                setValue(notificationSubtype);
                break;
            }
        }
        if (getValue() == null) {
            throw new InvalidHeaderException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Invalid NTS header value: ", str));
        }
    }

    public NTSHeader(NotificationSubtype notificationSubtype) {
        setValue(notificationSubtype);
    }
}
