package org.fourthline.cling.model;

import androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

/* JADX INFO: loaded from: classes2.dex */
public class ServerClientTokens {
    public static final String UNKNOWN_PLACEHOLDER = "UNKNOWN";
    private int majorVersion;
    private int minorVersion;
    private String osName;
    private String osVersion;
    private String productName;
    private String productVersion;

    public ServerClientTokens() {
        this.majorVersion = 1;
        this.minorVersion = 0;
        this.osName = System.getProperty("os.name").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.osVersion = System.getProperty("os.version").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.productName = UserConstants.PRODUCT_TOKEN_NAME;
        this.productVersion = UserConstants.PRODUCT_TOKEN_VERSION;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerClientTokens serverClientTokens = (ServerClientTokens) obj;
        return this.majorVersion == serverClientTokens.majorVersion && this.minorVersion == serverClientTokens.minorVersion && this.osName.equals(serverClientTokens.osName) && this.osVersion.equals(serverClientTokens.osVersion) && this.productName.equals(serverClientTokens.productName) && this.productVersion.equals(serverClientTokens.productVersion);
    }

    public String getHttpToken() {
        StringBuilder sb = new StringBuilder(256);
        sb.append(this.osName.indexOf(32) != -1 ? this.osName.replace(' ', '_') : this.osName);
        sb.append('/');
        sb.append(this.osVersion.indexOf(32) != -1 ? this.osVersion.replace(' ', '_') : this.osVersion);
        sb.append(" UPnP/");
        sb.append(this.majorVersion);
        sb.append('.');
        sb.append(this.minorVersion);
        sb.append(' ');
        sb.append(this.productName.indexOf(32) != -1 ? this.productName.replace(' ', '_') : this.productName);
        sb.append('/');
        sb.append(this.productVersion.indexOf(32) != -1 ? this.productVersion.replace(' ', '_') : this.productVersion);
        return sb.toString();
    }

    public int getMajorVersion() {
        return this.majorVersion;
    }

    public int getMinorVersion() {
        return this.minorVersion;
    }

    public String getOsName() {
        return this.osName;
    }

    public String getOsToken() {
        return getOsName().replaceAll(" ", "_") + ServiceReference.DELIMITER + getOsVersion().replaceAll(" ", "_");
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getProductName() {
        return this.productName;
    }

    public String getProductToken() {
        return getProductName().replaceAll(" ", "_") + ServiceReference.DELIMITER + getProductVersion().replaceAll(" ", "_");
    }

    public String getProductVersion() {
        return this.productVersion;
    }

    public int hashCode() {
        return this.productVersion.hashCode() + O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(((this.majorVersion * 31) + this.minorVersion) * 31, 31, this.osName), 31, this.osVersion), 31, this.productName);
    }

    public void setMajorVersion(int i) {
        this.majorVersion = i;
    }

    public void setMinorVersion(int i) {
        this.minorVersion = i;
    }

    public void setOsName(String str) {
        this.osName = str;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public void setProductName(String str) {
        this.productName = str;
    }

    public void setProductVersion(String str) {
        this.productVersion = str;
    }

    public String toString() {
        return getOsName() + ServiceReference.DELIMITER + getOsVersion() + " UPnP/" + getMajorVersion() + "." + getMinorVersion() + " " + getProductName() + ServiceReference.DELIMITER + getProductVersion();
    }

    public ServerClientTokens(int i, int i2) {
        this.majorVersion = 1;
        this.minorVersion = 0;
        this.osName = System.getProperty("os.name").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.osVersion = System.getProperty("os.version").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.productName = UserConstants.PRODUCT_TOKEN_NAME;
        this.productVersion = UserConstants.PRODUCT_TOKEN_VERSION;
        this.majorVersion = i;
        this.minorVersion = i2;
    }

    public ServerClientTokens(String str, String str2) {
        this.majorVersion = 1;
        this.minorVersion = 0;
        this.osName = System.getProperty("os.name").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.osVersion = System.getProperty("os.version").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.productName = str;
        this.productVersion = str2;
    }

    public ServerClientTokens(int i, int i2, String str, String str2, String str3, String str4) {
        this.majorVersion = 1;
        this.minorVersion = 0;
        this.osName = System.getProperty("os.name").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        System.getProperty("os.version").replaceAll("[^a-zA-Z0-9\\.\\-_]", "");
        this.majorVersion = i;
        this.minorVersion = i2;
        this.osName = str;
        this.osVersion = str2;
        this.productName = str3;
        this.productVersion = str4;
    }
}
