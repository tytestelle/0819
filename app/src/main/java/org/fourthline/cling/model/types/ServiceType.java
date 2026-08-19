package org.fourthline.cling.model.types;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.Constants;

/* JADX INFO: loaded from: classes2.dex */
public class ServiceType {
    private String namespace;
    private String type;
    private int version;
    private static final Logger log = Logger.getLogger(ServiceType.class.getName());
    public static final Pattern PATTERN = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):service:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");
    public static final Pattern BROKEN_PATTERN = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):serviceId:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");

    public ServiceType(String str, String str2) {
        this(str, str2, 1);
    }

    public static ServiceType valueOf(String str) {
        UDAServiceType uDAServiceTypeValueOf;
        if (str == null) {
            throw new InvalidValueException("Can't parse null string");
        }
        String strReplaceAll = str.replaceAll("\\s", "");
        try {
            uDAServiceTypeValueOf = UDAServiceType.valueOf(strReplaceAll);
        } catch (Exception unused) {
            uDAServiceTypeValueOf = null;
        }
        if (uDAServiceTypeValueOf != null) {
            return uDAServiceTypeValueOf;
        }
        try {
            Matcher matcher = PATTERN.matcher(strReplaceAll);
            if (matcher.matches() && matcher.groupCount() >= 3) {
                return new ServiceType(matcher.group(1), matcher.group(2), Integer.valueOf(matcher.group(3)).intValue());
            }
            Matcher matcher2 = BROKEN_PATTERN.matcher(strReplaceAll);
            if (matcher2.matches() && matcher2.groupCount() >= 3) {
                return new ServiceType(matcher2.group(1), matcher2.group(2), Integer.valueOf(matcher2.group(3)).intValue());
            }
            Matcher matcher3 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):service:(.+?):([0-9]+).*").matcher(strReplaceAll);
            if (matcher3.matches() && matcher3.groupCount() >= 3) {
                String strReplaceAll2 = matcher3.group(2).replaceAll("[^a-zA-Z_0-9\\-]", "-");
                log.warning("UPnP specification violation, replacing invalid service type token '" + matcher3.group(2) + "' with: " + strReplaceAll2);
                return new ServiceType(matcher3.group(1), strReplaceAll2, Integer.valueOf(matcher3.group(3)).intValue());
            }
            Matcher matcher4 = Pattern.compile("urn:([a-zA-Z0-9\\-\\.]+):serviceId:(.+?):([0-9]+).*").matcher(strReplaceAll);
            if (!matcher4.matches() || matcher4.groupCount() < 3) {
                throw new InvalidValueException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Can't parse service type string (namespace/type/version): ", strReplaceAll));
            }
            String strReplaceAll3 = matcher4.group(2).replaceAll("[^a-zA-Z_0-9\\-]", "-");
            log.warning("UPnP specification violation, replacing invalid service type token '" + matcher4.group(2) + "' with: " + strReplaceAll3);
            return new ServiceType(matcher4.group(1), strReplaceAll3, Integer.valueOf(matcher4.group(3)).intValue());
        } catch (RuntimeException e) {
            throw new InvalidValueException("Can't parse service type string (namespace/type/version) '" + strReplaceAll + "': " + e.toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ServiceType)) {
            return false;
        }
        ServiceType serviceType = (ServiceType) obj;
        return this.version == serviceType.version && this.namespace.equals(serviceType.namespace) && this.type.equals(serviceType.type);
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getType() {
        return this.type;
    }

    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.namespace.hashCode() * 31, 31, this.type) + this.version;
    }

    public boolean implementsVersion(ServiceType serviceType) {
        return serviceType != null && this.namespace.equals(serviceType.namespace) && this.type.equals(serviceType.type) && this.version >= serviceType.version;
    }

    public String toFriendlyString() {
        return getNamespace() + ":" + getType() + ":" + getVersion();
    }

    public String toString() {
        return "urn:" + getNamespace() + ":service:" + getType() + ":" + getVersion();
    }

    public ServiceType(String str, String str2, int i) {
        this.version = 1;
        if (str != null && !str.matches(Constants.REGEX_NAMESPACE)) {
            throw new IllegalArgumentException("Service type namespace contains illegal characters");
        }
        this.namespace = str;
        if (str2 != null && !str2.matches(Constants.REGEX_TYPE)) {
            throw new IllegalArgumentException("Service type suffix too long (64) or contains illegal characters");
        }
        this.type = str2;
        this.version = i;
    }
}
