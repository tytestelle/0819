package org.fourthline.cling.support.model.dlna;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class DLNAOperationsAttribute extends DLNAAttribute<EnumSet<DLNAOperations>> {
    public DLNAOperationsAttribute() {
        setValue(EnumSet.of(DLNAOperations.NONE));
    }

    @Override // org.fourthline.cling.support.model.dlna.DLNAAttribute
    public String getString() {
        int code = DLNAOperations.NONE.getCode();
        Iterator<DLNAOperations> it = getValue().iterator();
        while (it.hasNext()) {
            code |= it.next().getCode();
        }
        return String.format(Locale.ROOT, "%02x", Integer.valueOf(code));
    }

    @Override // org.fourthline.cling.support.model.dlna.DLNAAttribute
    public void setString(String str, String str2) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(DLNAOperations.class);
        try {
            int i = Integer.parseInt(str, 16);
            for (DLNAOperations dLNAOperations : DLNAOperations.values()) {
                int code = dLNAOperations.getCode() & i;
                if (dLNAOperations != DLNAOperations.NONE && dLNAOperations.getCode() == code) {
                    enumSetNoneOf.add(dLNAOperations);
                }
            }
        } catch (NumberFormatException unused) {
        }
        if (enumSetNoneOf.isEmpty()) {
            throw new InvalidDLNAProtocolAttributeException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Can't parse DLNA operations integer from: ", str));
        }
        setValue(enumSetNoneOf);
    }

    public DLNAOperationsAttribute(DLNAOperations... dLNAOperationsArr) {
        if (dLNAOperationsArr == null || dLNAOperationsArr.length <= 0) {
            return;
        }
        DLNAOperations dLNAOperations = dLNAOperationsArr[0];
        if (dLNAOperationsArr.length > 1) {
            System.arraycopy(dLNAOperationsArr, 1, dLNAOperationsArr, 0, dLNAOperationsArr.length - 1);
            setValue(EnumSet.of(dLNAOperations, dLNAOperationsArr));
        } else {
            setValue(EnumSet.of(dLNAOperations));
        }
    }
}
