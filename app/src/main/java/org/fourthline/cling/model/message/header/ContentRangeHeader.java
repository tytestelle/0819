package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.BytesRange;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: loaded from: classes2.dex */
public class ContentRangeHeader extends UpnpHeader<BytesRange> {
    public static final String PREFIX = "bytes ";

    public ContentRangeHeader() {
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().getString(true, PREFIX);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        try {
            setValue(BytesRange.valueOf(str, PREFIX));
        } catch (InvalidValueException e) {
            throw new InvalidHeaderException("Invalid Range Header: " + e.getMessage());
        }
    }

    public ContentRangeHeader(BytesRange bytesRange) {
        setValue(bytesRange);
    }

    public ContentRangeHeader(String str) {
        setString(str);
    }
}
