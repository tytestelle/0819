package org.fourthline.cling.model.types;

import O000O0O0O00ooOoOo00oO0ooo0oOooOo0OOO0Oo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

/* JADX INFO: loaded from: classes2.dex */
public class BinHexDatatype extends AbstractDatatype<byte[]> {
    @Override // org.fourthline.cling.model.types.AbstractDatatype
    public Class<byte[]> getValueType() {
        return byte[].class;
    }

    @Override // org.fourthline.cling.model.types.AbstractDatatype, org.fourthline.cling.model.types.Datatype
    public String getString(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            return new String(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(bArr));
        } catch (Exception e) {
            throw new InvalidValueException(e.getMessage(), e);
        }
    }

    @Override // org.fourthline.cling.model.types.AbstractDatatype, org.fourthline.cling.model.types.Datatype
    public byte[] valueOf(String str) {
        if (str.equals("")) {
            return null;
        }
        try {
            byte[] bArr = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2121O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str.getBytes());
        } catch (Exception e) {
            throw new InvalidValueException(e.getMessage(), e);
        }
    }
}
