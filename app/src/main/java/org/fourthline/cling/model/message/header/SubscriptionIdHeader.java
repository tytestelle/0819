package org.fourthline.cling.model.message.header;

/* JADX INFO: loaded from: classes2.dex */
public class SubscriptionIdHeader extends UpnpHeader<String> {
    public static final String PREFIX = "uuid:";

    public SubscriptionIdHeader() {
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        if (!str.startsWith("uuid:")) {
            throw new InvalidHeaderException("Invalid subscription ID header value, must start with 'uuid:': ".concat(str));
        }
        setValue(str);
    }

    public SubscriptionIdHeader(String str) {
        setValue(str);
    }
}
