package org.fourthline.cling.support.model.dlna.message.header;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import org.fourthline.cling.model.message.header.InvalidHeaderException;

/* JADX INFO: loaded from: classes2.dex */
public class SupportedHeader extends DLNAHeader<String[]> {
    public SupportedHeader() {
        setValue(new String[0]);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        String[] value = getValue();
        String string = value.length > 0 ? value[0] : "";
        for (int i = 1; i < value.length; i++) {
            StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(string, ",");
            sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(value[i]);
            string = sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.toString();
        }
        return string;
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        if (str.length() == 0) {
            throw new InvalidHeaderException("Invalid Supported header value: ".concat(str));
        }
        if (str.endsWith(";")) {
            str = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(1, 0, str);
        }
        setValue(str.split("\\s*,\\s*"));
    }
}
