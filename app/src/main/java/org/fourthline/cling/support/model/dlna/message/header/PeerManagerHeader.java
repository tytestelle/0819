package org.fourthline.cling.support.model.dlna.message.header;

import org.fourthline.cling.model.ServiceReference;
import org.fourthline.cling.model.message.header.InvalidHeaderException;

/* JADX INFO: loaded from: classes2.dex */
public class PeerManagerHeader extends DLNAHeader<ServiceReference> {
    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        if (str.length() != 0) {
            try {
                ServiceReference serviceReference = new ServiceReference(str);
                if (serviceReference.getUdn() != null && serviceReference.getServiceId() != null) {
                    setValue(serviceReference);
                    return;
                }
            } catch (Exception unused) {
            }
        }
        throw new InvalidHeaderException("Invalid PeerManager header value: ".concat(str));
    }
}
