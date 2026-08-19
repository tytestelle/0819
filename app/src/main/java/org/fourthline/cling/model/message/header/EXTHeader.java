package org.fourthline.cling.model.message.header;

/* JADX INFO: loaded from: classes2.dex */
public class EXTHeader extends UpnpHeader<String> {
    public static final String DEFAULT_VALUE = "";

    public EXTHeader() {
        setValue("");
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        if (str != null && str.length() > 0) {
            throw new InvalidHeaderException("Invalid EXT header, it has no value: ".concat(str));
        }
    }
}
