package org.fourthline.cling.model.message.header;

import java.net.URI;
import org.fourthline.cling.model.types.ServiceType;

/* JADX INFO: loaded from: classes2.dex */
public class ServiceTypeHeader extends UpnpHeader<ServiceType> {
    public ServiceTypeHeader() {
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        try {
            setValue(ServiceType.valueOf(str));
        } catch (RuntimeException e) {
            throw new InvalidHeaderException("Invalid service type header value, " + e.getMessage());
        }
    }

    public ServiceTypeHeader(URI uri) {
        setString(uri.toString());
    }

    public ServiceTypeHeader(ServiceType serviceType) {
        setValue(serviceType);
    }
}
