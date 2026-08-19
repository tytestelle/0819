package org.fourthline.cling.model.message.header;

import O000O0O0O00ooOoOo00oO0ooo0oOooOo0OOO0Oo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

/* JADX INFO: loaded from: classes2.dex */
public class InterfaceMacHeader extends UpnpHeader<byte[]> {
    public InterfaceMacHeader() {
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        byte[] value = getValue();
        if (value == null) {
            byte[] bArr = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2121O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            return null;
        }
        String str = new String(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(value));
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (char c : str.toCharArray()) {
            sb.append(c);
            if (i == 2) {
                sb.append(":");
                i = 1;
            } else {
                i++;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        byte[] bArr = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2121O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        byte[] bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str.replaceAll(":", "").getBytes());
        setValue(bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        if (bArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.length != 6) {
            throw new InvalidHeaderException("Invalid MAC address: ".concat(str));
        }
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String toString() {
        return "(" + getClass().getSimpleName() + ") '" + getString() + "'";
    }

    public InterfaceMacHeader(byte[] bArr) {
        setValue(bArr);
    }

    public InterfaceMacHeader(String str) {
        setString(str);
    }
}
