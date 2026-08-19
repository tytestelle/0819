package org.fourthline.cling.model.message.header;

import java.net.URI;
import org.fourthline.cling.model.types.UDAServiceType;

/* JADX INFO: loaded from: classes2.dex */
public class UDAServiceTypeHeader extends ServiceTypeHeader {
    public UDAServiceTypeHeader() {
    }

    @Override // org.fourthline.cling.model.message.header.ServiceTypeHeader, org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        try {
            setValue(UDAServiceType.valueOf(str));
        } catch (Exception e) {
            throw new InvalidHeaderException("Invalid UDA service type header value, " + e.getMessage());
        }
    }

    public UDAServiceTypeHeader(URI uri) {
        super(uri);
    }

    public UDAServiceTypeHeader(UDAServiceType uDAServiceType) {
        super(uDAServiceType);
    }
}
