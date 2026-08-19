package org.fourthline.cling.support.model;

import androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import org.fourthline.cling.model.types.InvalidValueException;
import org.seamless.util.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

/* JADX INFO: loaded from: classes2.dex */
public class ProtocolInfo {
    public static final String WILDCARD = "*";
    protected String additionalInfo;
    protected String contentFormat;
    protected String network;
    protected Protocol protocol;

    public ProtocolInfo(String str) {
        this.protocol = Protocol.ALL;
        this.network = "*";
        this.contentFormat = "*";
        this.additionalInfo = "*";
        str.getClass();
        String strTrim = str.trim();
        String[] strArrSplit = strTrim.split(":");
        if (strArrSplit.length != 4) {
            throw new InvalidValueException("Can't parse ProtocolInfo string: ".concat(strTrim));
        }
        this.protocol = Protocol.value(strArrSplit[0]);
        this.network = strArrSplit[1];
        this.contentFormat = strArrSplit[2];
        this.additionalInfo = strArrSplit[3];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtocolInfo protocolInfo = (ProtocolInfo) obj;
        return this.additionalInfo.equals(protocolInfo.additionalInfo) && this.contentFormat.equals(protocolInfo.contentFormat) && this.network.equals(protocolInfo.network) && this.protocol == protocolInfo.protocol;
    }

    public String getAdditionalInfo() {
        return this.additionalInfo;
    }

    public String getContentFormat() {
        return this.contentFormat;
    }

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO getContentFormatMimeType() {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.contentFormat);
    }

    public String getNetwork() {
        return this.network;
    }

    public Protocol getProtocol() {
        return this.protocol;
    }

    public int hashCode() {
        return this.additionalInfo.hashCode() + O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.protocol.hashCode() * 31, 31, this.network), 31, this.contentFormat);
    }

    public String toString() {
        return this.protocol.toString() + ":" + this.network + ":" + this.contentFormat + ":" + this.additionalInfo;
    }

    public ProtocolInfo(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        this.protocol = Protocol.ALL;
        this.network = "*";
        this.contentFormat = "*";
        this.additionalInfo = "*";
        this.protocol = Protocol.HTTP_GET;
        this.contentFormat = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.toString();
    }

    public ProtocolInfo(Protocol protocol, String str, String str2, String str3) {
        Protocol protocol2 = Protocol.ALL;
        this.protocol = protocol;
        this.network = str;
        this.contentFormat = str2;
        this.additionalInfo = str3;
    }
}
