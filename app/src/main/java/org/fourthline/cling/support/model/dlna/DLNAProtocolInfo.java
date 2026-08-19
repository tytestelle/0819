package org.fourthline.cling.support.model.dlna;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.util.EnumMap;
import java.util.Map;
import org.fourthline.cling.support.model.Protocol;
import org.fourthline.cling.support.model.ProtocolInfo;
import org.seamless.util.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

/* JADX INFO: loaded from: classes2.dex */
public class DLNAProtocolInfo extends ProtocolInfo {
    protected final Map<DLNAAttribute.Type, DLNAAttribute> attributes;

    public DLNAProtocolInfo(String str) {
        super(str);
        this.attributes = new EnumMap(DLNAAttribute.Type.class);
        parseAdditionalInfo();
    }

    public boolean contains(DLNAAttribute.Type type) {
        return this.attributes.containsKey(type);
    }

    public DLNAAttribute getAttribute(DLNAAttribute.Type type) {
        return this.attributes.get(type);
    }

    public Map<DLNAAttribute.Type, DLNAAttribute> getAttributes() {
        return this.attributes;
    }

    public String getAttributesString() {
        String string = "";
        for (DLNAAttribute.Type type : DLNAAttribute.Type.values()) {
            String string2 = this.attributes.containsKey(type) ? this.attributes.get(type).getString() : null;
            if (string2 != null && string2.length() != 0) {
                StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(string);
                sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(string.length() == 0 ? "" : ";");
                sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(type.getAttributeName());
                sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append("=");
                sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(string2);
                string = sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString();
            }
        }
        return string;
    }

    public void parseAdditionalInfo() {
        DLNAAttribute.Type typeValueOfAttributeName;
        String str = this.additionalInfo;
        if (str != null) {
            for (String str2 : str.split(";")) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 2 && (typeValueOfAttributeName = DLNAAttribute.Type.valueOfAttributeName(strArrSplit[0])) != null) {
                    this.attributes.put(typeValueOfAttributeName, DLNAAttribute.newInstance(typeValueOfAttributeName, strArrSplit[1], getContentFormat()));
                }
            }
        }
    }

    public DLNAProtocolInfo(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        super(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        this.attributes = new EnumMap(DLNAAttribute.Type.class);
    }

    public DLNAProtocolInfo(DLNAProfiles dLNAProfiles) {
        super(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(dLNAProfiles.getContentFormat()));
        EnumMap enumMap = new EnumMap(DLNAAttribute.Type.class);
        this.attributes = enumMap;
        enumMap.put(DLNAAttribute.Type.DLNA_ORG_PN, new DLNAProfileAttribute(dLNAProfiles));
        this.additionalInfo = getAttributesString();
    }

    public DLNAProtocolInfo(DLNAProfiles dLNAProfiles, EnumMap<DLNAAttribute.Type, DLNAAttribute> enumMap) {
        super(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(dLNAProfiles.getContentFormat()));
        EnumMap enumMap2 = new EnumMap(DLNAAttribute.Type.class);
        this.attributes = enumMap2;
        enumMap2.putAll(enumMap);
        enumMap2.put(DLNAAttribute.Type.DLNA_ORG_PN, new DLNAProfileAttribute(dLNAProfiles));
        this.additionalInfo = getAttributesString();
    }

    public DLNAProtocolInfo(Protocol protocol, String str, String str2, String str3) {
        super(protocol, str, str2, str3);
        this.attributes = new EnumMap(DLNAAttribute.Type.class);
        parseAdditionalInfo();
    }

    public DLNAProtocolInfo(Protocol protocol, String str, String str2, EnumMap<DLNAAttribute.Type, DLNAAttribute> enumMap) {
        super(protocol, str, str2, "");
        EnumMap enumMap2 = new EnumMap(DLNAAttribute.Type.class);
        this.attributes = enumMap2;
        enumMap2.putAll(enumMap);
        this.additionalInfo = getAttributesString();
    }

    public DLNAProtocolInfo(ProtocolInfo protocolInfo) {
        this(protocolInfo.getProtocol(), protocolInfo.getNetwork(), protocolInfo.getContentFormat(), protocolInfo.getAdditionalInfo());
    }
}
