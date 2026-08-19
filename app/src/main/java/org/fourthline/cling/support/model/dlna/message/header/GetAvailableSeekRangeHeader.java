package org.fourthline.cling.support.model.dlna.message.header;

import org.fourthline.cling.model.message.header.InvalidHeaderException;

/* JADX INFO: loaded from: classes2.dex */
public class GetAvailableSeekRangeHeader extends DLNAHeader<Integer> {
    public GetAvailableSeekRangeHeader() {
        setValue(1);
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        if (str.length() != 0) {
            try {
                if (Integer.parseInt(str) == 1) {
                    return;
                }
            } catch (Exception unused) {
            }
        }
        throw new InvalidHeaderException("Invalid GetAvailableSeekRange header value: ".concat(str));
    }
}
