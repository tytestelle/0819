package org.fourthline.cling.model.types;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class DLNADoc {
    public static final Pattern PATTERN = Pattern.compile("(.+?)[ -]([0-9].[0-9]{2})");
    private final String devClass;
    private final String version;

    public enum Version {
        V1_0("1.00"),
        V1_5("1.50");

        String s;

        Version(String str) {
            this.s = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.s;
        }
    }

    public DLNADoc(String str, String str2) {
        this.devClass = str;
        this.version = str2;
    }

    public static DLNADoc valueOf(String str) {
        Matcher matcher = PATTERN.matcher(str);
        if (matcher.matches()) {
            return new DLNADoc(matcher.group(1), matcher.group(2));
        }
        throw new InvalidValueException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Can't parse DLNADoc: ", str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DLNADoc dLNADoc = (DLNADoc) obj;
        return this.devClass.equals(dLNADoc.devClass) && this.version.equals(dLNADoc.version);
    }

    public String getDevClass() {
        return this.devClass;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version.hashCode() + (this.devClass.hashCode() * 31);
    }

    public String toString() {
        return getDevClass() + "-" + getVersion();
    }

    public DLNADoc(String str, Version version) {
        this.devClass = str;
        this.version = version.s;
    }
}
