package org.fourthline.cling.model.message.header;

import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public class LocationHeader extends UpnpHeader<URL> {
    public LocationHeader() {
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        try {
            setValue(new URL(str));
        } catch (MalformedURLException e) {
            throw new InvalidHeaderException("Invalid URI: " + e.getMessage());
        }
    }

    public LocationHeader(URL url) {
        setValue(url);
    }

    public LocationHeader(String str) {
        setString(str);
    }
}
