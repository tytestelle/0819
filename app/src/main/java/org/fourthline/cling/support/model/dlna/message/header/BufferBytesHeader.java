package org.fourthline.cling.support.model.dlna.message.header;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;

/* JADX INFO: loaded from: classes2.dex */
public class BufferBytesHeader extends DLNAHeader<UnsignedIntegerFourBytes> {
    public BufferBytesHeader() {
        setValue(new UnsignedIntegerFourBytes(0L));
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        try {
            setValue(new UnsignedIntegerFourBytes(str));
        } catch (NumberFormatException unused) {
            throw new InvalidHeaderException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Invalid header value: ", str));
        }
    }
}
