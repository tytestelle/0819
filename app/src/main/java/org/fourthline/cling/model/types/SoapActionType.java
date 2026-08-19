package org.fourthline.cling.model.types;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.ModelUtil;

/* JADX INFO: loaded from: classes2.dex */
public class SoapActionType {
    public static final String MAGIC_CONTROL_NS = "schemas-upnp-org";
    public static final String MAGIC_CONTROL_TYPE = "control-1-0";
    private String actionName;
    private String namespace;
    private String type;
    private Integer version;
    public static final Pattern PATTERN_MAGIC_CONTROL = Pattern.compile("urn:schemas-upnp-org:control-1-0#([a-zA-Z0-9^-_\\p{L}\\p{N}]{1}[a-zA-Z0-9^-_\\.\\\\p{L}\\\\p{N}\\p{Mc}\\p{Sk}]*)");
    public static final Pattern PATTERN = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):service:([a-zA-Z_0-9\\-]{1,64}):([0-9]+)#([a-zA-Z0-9^-_\\p{L}\\p{N}]{1}[a-zA-Z0-9^-_\\.\\\\p{L}\\\\p{N}\\p{Mc}\\p{Sk}]*)");

    public SoapActionType(ServiceType serviceType, String str) {
        this(serviceType.getNamespace(), serviceType.getType(), Integer.valueOf(serviceType.getVersion()), str);
    }

    public static SoapActionType valueOf(String str) {
        Matcher matcher = PATTERN_MAGIC_CONTROL.matcher(str);
        try {
            if (matcher.matches()) {
                return new SoapActionType("schemas-upnp-org", MAGIC_CONTROL_TYPE, null, matcher.group(1));
            }
            Matcher matcher2 = PATTERN.matcher(str);
            if (matcher2.matches()) {
                return new SoapActionType(matcher2.group(1), matcher2.group(2), Integer.valueOf(matcher2.group(3)), matcher2.group(4));
            }
            throw new InvalidValueException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Can't parse action type string (namespace/type/version#actionName): ", str));
        } catch (RuntimeException e) {
            throw new InvalidValueException("Can't parse action type string (namespace/type/version#actionName) '" + str + "': " + e.toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SoapActionType)) {
            return false;
        }
        SoapActionType soapActionType = (SoapActionType) obj;
        if (!this.actionName.equals(soapActionType.actionName) || !this.namespace.equals(soapActionType.namespace) || !this.type.equals(soapActionType.type)) {
            return false;
        }
        Integer num = this.version;
        Integer num2 = soapActionType.version;
        return num == null ? num2 == null : num.equals(num2);
    }

    public String getActionName() {
        return this.actionName;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public ServiceType getServiceType() {
        if (this.version == null) {
            return null;
        }
        return new ServiceType(this.namespace, this.type, this.version.intValue());
    }

    public String getType() {
        return this.type;
    }

    public String getTypeString() {
        if (this.version == null) {
            return "urn:" + getNamespace() + ":" + getType();
        }
        return "urn:" + getNamespace() + ":service:" + getType() + ":" + getVersion();
    }

    public Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.namespace.hashCode() * 31, 31, this.type), 31, this.actionName);
        Integer num = this.version;
        return iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return getTypeString() + "#" + getActionName();
    }

    public SoapActionType(String str, String str2, Integer num, String str3) {
        this.namespace = str;
        this.type = str2;
        this.version = num;
        this.actionName = str3;
        if (str3 != null && !ModelUtil.isValidUDAName(str3)) {
            throw new IllegalArgumentException("Action name contains illegal characters: ".concat(str3));
        }
    }
}
