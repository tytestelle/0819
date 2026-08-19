package org.fourthline.cling.model.types;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class UDAServiceType extends ServiceType {
    public static final String DEFAULT_NAMESPACE = "schemas-upnp-org";
    public static final Pattern PATTERN = Pattern.compile("urn:schemas-upnp-org:service:([a-zA-Z_0-9\\-]{1,64}):([0-9]+).*");

    public UDAServiceType(String str) {
        this(str, 1);
    }

    public static UDAServiceType valueOf(String str) {
        Matcher matcher = PATTERN.matcher(str);
        try {
            if (matcher.matches()) {
                return new UDAServiceType(matcher.group(1), Integer.valueOf(matcher.group(2)).intValue());
            }
            throw new InvalidValueException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Can't parse UDA service type string (namespace/type/version): ", str));
        } catch (RuntimeException e) {
            throw new InvalidValueException("Can't parse UDA service type string (namespace/type/version) '" + str + "': " + e.toString());
        }
    }

    public UDAServiceType(String str, int i) {
        super("schemas-upnp-org", str, i);
    }
}
