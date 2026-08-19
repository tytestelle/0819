package org.fourthline.cling.model.types;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

/* JADX INFO: loaded from: classes2.dex */
public class PragmaType {
    private boolean quote;
    private String token;
    private String value;

    public PragmaType(String str, String str2, boolean z) {
        this.token = str;
        this.value = str2;
        this.quote = z;
    }

    public static PragmaType valueOf(String str) {
        String strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        String str2;
        if (str.length() == 0) {
            throw new InvalidValueException("Can't parse Bytes Range: ".concat(str));
        }
        String[] strArrSplit = str.split("=");
        boolean z = false;
        if (strArrSplit.length > 1) {
            str2 = strArrSplit[0];
            strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = strArrSplit[1];
            if (strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.startsWith("\"") && strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.endsWith("\"")) {
                strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(1, 1, strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                z = true;
            }
        } else {
            strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = str;
            str2 = null;
        }
        return new PragmaType(str2, strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, z);
    }

    public String getString() {
        StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(this.token != null ? O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder(""), this.token, "=") : "");
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(this.quote ? O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder("\""), this.value, "\"") : this.value);
        return sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString();
    }

    public String getToken() {
        return this.token;
    }

    public String getValue() {
        return this.value;
    }

    public PragmaType(String str, String str2) {
        this.token = str;
        this.value = str2;
    }

    public PragmaType(String str) {
        this.token = null;
        this.value = str;
    }
}
