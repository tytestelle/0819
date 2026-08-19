package org.fourthline.cling.model.message.header;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;

/* JADX INFO: loaded from: classes2.dex */
public class EventSequenceHeader extends UpnpHeader<UnsignedIntegerFourBytes> {
    public EventSequenceHeader() {
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public String getString() {
        return getValue().toString();
    }

    @Override // org.fourthline.cling.model.message.header.UpnpHeader
    public void setString(String str) {
        if (!SessionDescription.SUPPORTED_SDP_VERSION.equals(str)) {
            while (str.startsWith(SessionDescription.SUPPORTED_SDP_VERSION)) {
                str = str.substring(1);
            }
        }
        try {
            setValue(new UnsignedIntegerFourBytes(str));
        } catch (NumberFormatException e) {
            throw new InvalidHeaderException("Invalid event sequence, " + e.getMessage());
        }
    }

    public EventSequenceHeader(long j) {
        setValue(new UnsignedIntegerFourBytes(j));
    }
}
