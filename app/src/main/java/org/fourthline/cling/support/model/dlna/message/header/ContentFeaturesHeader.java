package org.fourthline.cling.support.model.dlna.message.header;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.util.EnumMap;
import org.fourthline.cling.support.model.dlna.DLNAAttribute;

/* JADX INFO: loaded from: classes2.dex */
public class ContentFeaturesHeader extends DLNAHeader<EnumMap<DLNAAttribute.Type, DLNAAttribute>> {
    public ContentFeaturesHeader() {
        setValue(new EnumMap(DLNAAttribute.Type.class));
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        String string = "";
        for (DLNAAttribute.Type type : DLNAAttribute.Type.values()) {
            String string2 = getValue().containsKey(type) ? getValue().get(type).getString() : null;
            if (string2 != null && string2.length() != 0) {
                StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(string);
                sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(string.length() == 0 ? "" : ";");
                sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(type.getAttributeName());
                sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append("=");
                sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(string2);
                string = sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString();
            }
        }
        return string;
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        DLNAAttribute.Type typeValueOfAttributeName;
        if (str.length() != 0) {
            for (String str2 : str.split(";")) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 2 && (typeValueOfAttributeName = DLNAAttribute.Type.valueOfAttributeName(strArrSplit[0])) != null) {
                    getValue().put(typeValueOfAttributeName, DLNAAttribute.newInstance(typeValueOfAttributeName, strArrSplit[1], ""));
                }
            }
        }
    }
}
