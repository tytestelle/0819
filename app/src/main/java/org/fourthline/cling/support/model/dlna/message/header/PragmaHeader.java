package org.fourthline.cling.support.model.dlna.message.header;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.model.message.header.InvalidHeaderException;
import org.fourthline.cling.model.types.PragmaType;

/* JADX INFO: loaded from: classes2.dex */
public class PragmaHeader extends DLNAHeader<List<PragmaType>> {
    public PragmaHeader() {
        setValue(new ArrayList());
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        String string = "";
        for (PragmaType pragmaType : getValue()) {
            StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(string);
            sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(string.length() == 0 ? "" : ",");
            sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(pragmaType.getString());
            string = sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString();
        }
        return string;
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        if (str.length() == 0) {
            throw new InvalidHeaderException("Invalid Pragma header value: ".concat(str));
        }
        if (str.endsWith(";")) {
            str = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(1, 0, str);
        }
        String[] strArrSplit = str.split("\\s*;\\s*");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            arrayList.add(PragmaType.valueOf(str2));
        }
    }
}
