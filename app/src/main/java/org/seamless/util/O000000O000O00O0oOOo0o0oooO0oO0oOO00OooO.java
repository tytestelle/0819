package org.seamless.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final String f4514O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final String f4515O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Map f4516O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String str, String str2, Map map) {
        this.f4514O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = str == null ? "*" : str;
        this.f4515O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = str2 == null ? "*" : str2;
        if (map == null) {
            this.f4516O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = Collections.EMPTY_MAP;
            return;
        }
        TreeMap treeMap = new TreeMap(new O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(4));
        for (Map.Entry entry : map.entrySet()) {
            treeMap.put(entry.getKey(), entry.getValue());
        }
        this.f4516O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = Collections.unmodifiableMap(treeMap);
    }

    public static O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str) {
        String strTrim;
        String strTrim2;
        int iIndexOf;
        if (str == null) {
            throw new IllegalArgumentException("String value is null");
        }
        int iIndexOf2 = str.indexOf(";");
        String strTrim3 = null;
        if (iIndexOf2 > -1) {
            strTrim = str.substring(iIndexOf2 + 1).trim();
            str = str.substring(0, iIndexOf2);
        } else {
            strTrim = null;
        }
        String[] strArrSplit = str.split(ServiceReference.DELIMITER);
        if (strArrSplit.length < 2 && str.equals("*")) {
            strTrim2 = "*";
            strTrim3 = strTrim2;
        } else if (strArrSplit.length == 2) {
            strTrim3 = strArrSplit[0].trim();
            strTrim2 = strArrSplit[1].trim();
        } else {
            if (strArrSplit.length != 2) {
                throw new IllegalArgumentException("Error parsing string: ".concat(str));
            }
            strTrim2 = null;
        }
        if (strTrim == null || strTrim.length() <= 0) {
            return new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(strTrim3, strTrim2, Collections.EMPTY_MAP);
        }
        HashMap map = new HashMap();
        for (int i = 0; i < strTrim.length(); i = iIndexOf) {
            iIndexOf = strTrim.indexOf(61, i);
            int iIndexOf3 = strTrim.indexOf(59, i);
            if (iIndexOf == -1 && iIndexOf3 == -1) {
                iIndexOf = strTrim.length();
            } else if (iIndexOf == -1 || (iIndexOf3 != -1 && iIndexOf >= iIndexOf3)) {
                iIndexOf = iIndexOf3;
            }
            String strTrim4 = strTrim.substring(i, iIndexOf).trim();
            if (iIndexOf < strTrim.length() && strTrim.charAt(iIndexOf) == '=') {
                iIndexOf++;
            }
            StringBuilder sb = new StringBuilder(strTrim.length() - iIndexOf);
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (iIndexOf >= strTrim.length()) {
                    map.put(strTrim4, sb.toString().trim());
                    break;
                }
                char cCharAt = strTrim.charAt(iIndexOf);
                if (cCharAt != '\"') {
                    if (cCharAt == ';') {
                        if (!z2) {
                            map.put(strTrim4, sb.toString().trim());
                            iIndexOf++;
                            break;
                        }
                        sb.append(cCharAt);
                    } else if (cCharAt != '\\') {
                        sb.append(cCharAt);
                    } else if (z) {
                        sb.append(cCharAt);
                        z = false;
                    } else {
                        z = true;
                    }
                } else if (z) {
                    sb.append(cCharAt);
                    z = false;
                } else {
                    z2 = !z2;
                }
                iIndexOf++;
            }
        }
        return new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(strTrim3, strTrim2, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.class != obj.getClass()) {
            return false;
        }
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) obj;
        Map map = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4516O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        Map map2 = this.f4516O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (map2 == null ? map == null : map2.equals(map)) {
            return this.f4515O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.equalsIgnoreCase(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4515O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) && this.f4514O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.equalsIgnoreCase(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4514O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f4515O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.toLowerCase().hashCode() + (this.f4514O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.toLowerCase().hashCode() * 31)) * 31;
        Map map = this.f4516O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4514O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + ServiceReference.DELIMITER + this.f4515O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        Map map = this.f4516O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (map != null || map.size() > 0) {
            for (String str : map.keySet()) {
                sb.append(";");
                sb.append(str);
                sb.append("=\"");
                sb.append((String) map.get(str));
                sb.append("\"");
            }
        }
        return sb.toString();
    }
}
