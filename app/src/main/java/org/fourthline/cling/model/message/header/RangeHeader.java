package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.BytesRange;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: loaded from: classes2.dex */
public class RangeHeader extends UpnpHeader<BytesRange> {
    public RangeHeader() {
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().getString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        try {
            setValue(BytesRange.valueOf(str));
        } catch (InvalidValueException e) {
            throw new InvalidHeaderException("Invalid Range Header: " + e.getMessage());
        }
    }

    public RangeHeader(BytesRange bytesRange) {
        setValue(bytesRange);
    }

    public RangeHeader(String str) {
        setString(str);
    }
}
