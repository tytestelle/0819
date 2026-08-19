package org.fourthline.cling.support.model.dlna;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import org.fourthline.cling.model.types.InvalidValueException;
import org.fourthline.cling.support.avtransport.lastchange.AVTransportVariable;

/* JADX INFO: loaded from: classes2.dex */
public class DLNAPlaySpeedAttribute extends DLNAAttribute<AVTransportVariable.TransportPlaySpeed[]> {
    public DLNAPlaySpeedAttribute() {
        setValue(new AVTransportVariable.TransportPlaySpeed[0]);
    }

    @Override // org.fourthline.cling.support.model.dlna.DLNAAttribute
    public String getString() {
        String string = "";
        for (AVTransportVariable.TransportPlaySpeed transportPlaySpeed : getValue()) {
            if (!transportPlaySpeed.getValue().equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(string);
                sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(string.length() == 0 ? "" : ",");
                sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(transportPlaySpeed);
                string = sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString();
            }
        }
        return string;
    }

    @Override // org.fourthline.cling.support.model.dlna.DLNAAttribute
    public void setString(String str, String str2) {
        AVTransportVariable.TransportPlaySpeed[] transportPlaySpeedArr = null;
        if (str != null && str.length() != 0) {
            String[] strArrSplit = str.split(",");
            try {
                AVTransportVariable.TransportPlaySpeed[] transportPlaySpeedArr2 = new AVTransportVariable.TransportPlaySpeed[strArrSplit.length];
                for (int i = 0; i < strArrSplit.length; i++) {
                    transportPlaySpeedArr2[i] = new AVTransportVariable.TransportPlaySpeed(strArrSplit[i]);
                }
                transportPlaySpeedArr = transportPlaySpeedArr2;
            } catch (InvalidValueException unused) {
            }
        }
        if (transportPlaySpeedArr == null) {
            throw new InvalidDLNAProtocolAttributeException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Can't parse DLNA play speeds from: ", str));
        }
        setValue(transportPlaySpeedArr);
    }

    public DLNAPlaySpeedAttribute(AVTransportVariable.TransportPlaySpeed[] transportPlaySpeedArr) {
        setValue(transportPlaySpeedArr);
    }

    public DLNAPlaySpeedAttribute(String[] strArr) {
        AVTransportVariable.TransportPlaySpeed[] transportPlaySpeedArr = new AVTransportVariable.TransportPlaySpeed[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            try {
                transportPlaySpeedArr[i] = new AVTransportVariable.TransportPlaySpeed(strArr[i]);
            } catch (InvalidValueException unused) {
                throw new InvalidDLNAProtocolAttributeException("Can't parse DLNA play speeds.");
            }
        }
        setValue(transportPlaySpeedArr);
    }
}
