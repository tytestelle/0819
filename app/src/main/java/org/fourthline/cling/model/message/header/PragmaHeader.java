package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.InvalidValueException;
import org.fourthline.cling.model.types.PragmaType;

/* JADX INFO: loaded from: classes2.dex */
public class PragmaHeader extends UpnpHeader<PragmaType> {
    public PragmaHeader() {
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().getString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        try {
            setValue(PragmaType.valueOf(str));
        } catch (InvalidValueException e) {
            throw new InvalidHeaderException("Invalid Range Header: " + e.getMessage());
        }
    }

    public PragmaHeader(PragmaType pragmaType) {
        setValue(pragmaType);
    }

    public PragmaHeader(String str) {
        setString(str);
    }
}
