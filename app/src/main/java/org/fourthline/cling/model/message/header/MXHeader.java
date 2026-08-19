package org.fourthline.cling.model.message.header;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

/* JADX INFO: loaded from: classes2.dex */
public class MXHeader extends UpnpHeader<Integer> {
    public static final Integer DEFAULT_VALUE = 3;

    public MXHeader() {
        setValue(DEFAULT_VALUE);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        try {
            int i = Integer.parseInt(str);
            Integer numValueOf = Integer.valueOf(i);
            if (i < 0 || i > 120) {
                setValue(DEFAULT_VALUE);
            } else {
                setValue(numValueOf);
            }
        } catch (Exception unused) {
            throw new InvalidHeaderException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Can't parse MX seconds integer from: ", str));
        }
    }

    public MXHeader(Integer num) {
        setValue(num);
    }
}
