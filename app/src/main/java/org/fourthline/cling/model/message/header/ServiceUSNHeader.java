package org.fourthline.cling.model.message.header;

import org.fourthline.cling.model.types.NamedServiceType;
import org.fourthline.cling.model.types.ServiceType;
import org.fourthline.cling.model.types.UDN;

/* JADX INFO: loaded from: classes2.dex */
public class ServiceUSNHeader extends UpnpHeader<NamedServiceType> {
    public ServiceUSNHeader() {
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        try {
            setValue(NamedServiceType.valueOf(str));
        } catch (Exception e) {
            throw new InvalidHeaderException("Invalid service USN header value, " + e.getMessage());
        }
    }

    public ServiceUSNHeader(UDN udn, ServiceType serviceType) {
        setValue(new NamedServiceType(udn, serviceType));
    }

    public ServiceUSNHeader(NamedServiceType namedServiceType) {
        setValue(namedServiceType);
    }
}
