package org.fourthline.cling.support.model.dlna.message.header;

import org.fourthline.cling.model.message.header.InvalidHeaderException;

/* JADX INFO: loaded from: classes2.dex */
public class TransferModeHeader extends DLNAHeader<Type> {

    public enum Type {
        Streaming,
        Interactive,
        Background
    }

    public TransferModeHeader() {
        setValue(Type.Interactive);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        if (str.length() != 0) {
            try {
                setValue(Type.valueOf(str));
                return;
            } catch (Exception unused) {
            }
        }
        throw new InvalidHeaderException("Invalid TransferMode header value: ".concat(str));
    }

    public TransferModeHeader(Type type) {
        setValue(type);
    }
}
