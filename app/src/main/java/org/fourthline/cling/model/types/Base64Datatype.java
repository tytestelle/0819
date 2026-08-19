package org.fourthline.cling.model.types;

import O000O0O0O00ooOoOo00oO0ooo0oOooOo0OOO0Oo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class Base64Datatype extends AbstractDatatype<byte[]> {
    @Override // org.fourthline.cling.model.types.AbstractDatatype
    public Class<byte[]> getValueType() {
        return byte[].class;
    }

    @Override // org.fourthline.cling.model.types.AbstractDatatype, org.fourthline.cling.model.types.Datatype
    public String getString(byte[] bArr) {
        String strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (bArr == null) {
            return "";
        }
        try {
            try {
                strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(bArr, bArr.length);
            } catch (IOException unused) {
                strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
            }
            return new String(strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getBytes(), "UTF-8");
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
            return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str);
        } catch (Exception e) {
            throw new InvalidValueException(e.getMessage(), e);
        }
    }
}
