package org.fourthline.cling.support.model.dlna;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

/* JADX INFO: loaded from: classes2.dex */
public class DLNAConversionIndicatorAttribute extends DLNAAttribute<DLNAConversionIndicator> {
    public DLNAConversionIndicatorAttribute() {
        setValue(DLNAConversionIndicator.NONE);
    }

    @Override // org.fourthline.cling.support.model.dlna.DLNAAttribute
    public String getString() {
        return Integer.toString(getValue().getCode());
    }

    @Override // org.fourthline.cling.support.model.dlna.DLNAAttribute
    public void setString(String str, String str2) {
        DLNAConversionIndicator dLNAConversionIndicatorValueOf;
        try {
            dLNAConversionIndicatorValueOf = DLNAConversionIndicator.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            dLNAConversionIndicatorValueOf = null;
        }
        if (dLNAConversionIndicatorValueOf == null) {
            throw new InvalidDLNAProtocolAttributeException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Can't parse DLNA play speed integer from: ", str));
        }
        setValue(dLNAConversionIndicatorValueOf);
    }

    public DLNAConversionIndicatorAttribute(DLNAConversionIndicator dLNAConversionIndicator) {
        setValue(dLNAConversionIndicator);
    }
}
