package org.fourthline.cling.support.model.dlna;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

/* JADX INFO: loaded from: classes2.dex */
public class DLNAProfileAttribute extends DLNAAttribute<DLNAProfiles> {
    public DLNAProfileAttribute() {
        setValue(DLNAProfiles.NONE);
    }

    @Override // org.fourthline.cling.support.model.dlna.DLNAAttribute
    public String getString() {
        return getValue().getCode();
    }

    @Override // org.fourthline.cling.support.model.dlna.DLNAAttribute
    public void setString(String str, String str2) {
        DLNAProfiles dLNAProfilesValueOf = DLNAProfiles.valueOf(str, str2);
        if (dLNAProfilesValueOf == null) {
            throw new InvalidDLNAProtocolAttributeException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Can't parse DLNA profile from: ", str));
        }
        setValue(dLNAProfilesValueOf);
    }

    public DLNAProfileAttribute(DLNAProfiles dLNAProfiles) {
        setValue(dLNAProfiles);
    }
}
