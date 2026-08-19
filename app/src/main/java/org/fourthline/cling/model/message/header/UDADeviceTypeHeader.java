package org.fourthline.cling.model.message.header;

import java.net.URI;
import org.fourthline.cling.model.types.DeviceType;
import org.fourthline.cling.model.types.UDADeviceType;

/* JADX INFO: loaded from: classes2.dex */
public class UDADeviceTypeHeader extends DeviceTypeHeader {
    public UDADeviceTypeHeader() {
    }

    @Override // org.fourthline.cling.model.message.header.DeviceTypeHeader, org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        try {
            setValue(UDADeviceType.valueOf(str));
        } catch (Exception e) {
            throw new InvalidHeaderException("Invalid UDA device type header value, " + e.getMessage());
        }
    }

    public UDADeviceTypeHeader(URI uri) {
        super(uri);
    }

    public UDADeviceTypeHeader(DeviceType deviceType) {
        super(deviceType);
    }
}
