package org.eclipse.jetty.http;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo extends HashMap implements Externalizable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static String f4389O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = ":,";
    O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 _default;
    List _defaultSingletonList;
    final Set _entrySet;
    final org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO _exactMap;
    boolean _nodefault;
    O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 _prefixDefault;
    final org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO _prefixMap;
    final org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO _suffixMap;

    public O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo() {
        super(11);
        this._prefixMap = new org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
        this._suffixMap = new org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
        this._exactMap = new org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
        this._defaultSingletonList = null;
        this._prefixDefault = null;
        this._default = null;
        this._nodefault = false;
        this._entrySet = entrySet();
    }

    public static boolean O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(String str, String str2) {
        int length = str.length() - 2;
        return str.endsWith("/*") && str2.regionMatches(0, str, 0, length) && (str2.length() == length || '/' == str2.charAt(length));
    }

    public static String pathInfo(String str, String str2) {
        if ("".equals(str)) {
            return str2;
        }
        if (str.charAt(0) != '/' || str.length() == 1) {
            return null;
        }
        boolean zO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(str, str2);
        if ((!str.equals(str2) || zO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) && zO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO && str2.length() != str.length() - 2) {
            return str2.substring(str.length() - 2);
        }
        return null;
    }

    public static String pathMatch(String str, String str2) {
        char cCharAt = str.charAt(0);
        if (cCharAt != '/') {
            if (cCharAt == '*' && str2.regionMatches(str2.length() - (str.length() - 1), str, 1, str.length() - 1)) {
                return str2;
            }
            return null;
        }
        if (str.length() == 1 || str.equals(str2)) {
            return str2;
        }
        if (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(str, str2)) {
            return str2.substring(0, str.length() - 2);
        }
        return null;
    }

    public static String relativePath(String str, String str2, String str3) {
        String strPathInfo = pathInfo(str2, str3);
        if (strPathInfo != null) {
            str3 = strPathInfo;
        }
        if (str3.startsWith("./")) {
            str3 = str3.substring(2);
        }
        if (!str.endsWith(ServiceReference.DELIMITER)) {
            return str3.startsWith(ServiceReference.DELIMITER) ? str.concat(str3) : O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(str, ServiceReference.DELIMITER, str3);
        }
        if (!str3.startsWith(ServiceReference.DELIMITER)) {
            return str.concat(str3);
        }
        StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(str);
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(str3.substring(1));
        return sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString();
    }

    public static void setPathSpecSeparators(String str) {
        f4389O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = str;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        this._exactMap.clear();
        this._prefixMap.clear();
        this._suffixMap.clear();
        this._default = null;
        this._defaultSingletonList = null;
        super.clear();
    }

    public boolean containsMatch(String str) {
        O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 match = getMatch(str);
        return (match == null || match.equals(this._default)) ? false : true;
    }

    public Object getLazyMatches(String str) {
        if (str == null) {
            return org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getList(null);
        }
        int length = str.length();
        int iIndexOf = 0;
        Map.Entry entry = this._exactMap.getEntry(str, 0, length);
        Object objAdd = entry != null ? org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.add(null, entry.getValue()) : null;
        int iLastIndexOf = length - 1;
        while (true) {
            iLastIndexOf = str.lastIndexOf(47, iLastIndexOf - 1);
            if (iLastIndexOf < 0) {
                break;
            }
            Map.Entry entry2 = this._prefixMap.getEntry(str, 0, iLastIndexOf);
            if (entry2 != null) {
                objAdd = org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.add(objAdd, entry2.getValue());
            }
        }
        O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = this._prefixDefault;
        if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 != null) {
            objAdd = org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.add(objAdd, o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000);
        }
        while (true) {
            iIndexOf = str.indexOf(46, iIndexOf + 1);
            if (iIndexOf <= 0) {
                break;
            }
            Map.Entry entry3 = this._suffixMap.getEntry(str, iIndexOf + 1, (length - iIndexOf) - 1);
            if (entry3 != null) {
                objAdd = org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.add(objAdd, entry3.getValue());
            }
        }
        O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = this._default;
        if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 != null) {
            return objAdd == null ? this._defaultSingletonList : org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.add(objAdd, o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001);
        }
        return objAdd;
    }

    public O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 getMatch(String str) {
        Map.Entry entry;
        Map.Entry entry2;
        Map.Entry entry3;
        if (str == null) {
            return null;
        }
        int length = str.length();
        int iIndexOf = 0;
        if (length == 1 && str.charAt(0) == '/' && (entry3 = (Map.Entry) this._exactMap.get("")) != null) {
            return (O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000) entry3;
        }
        Map.Entry entry4 = this._exactMap.getEntry(str, 0, length);
        if (entry4 != null) {
            return (O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000) entry4.getValue();
        }
        int iLastIndexOf = length;
        do {
            iLastIndexOf = str.lastIndexOf(47, iLastIndexOf - 1);
            if (iLastIndexOf < 0) {
                O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = this._prefixDefault;
                if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 != null) {
                    return o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                }
                do {
                    iIndexOf = str.indexOf(46, iIndexOf + 1);
                    if (iIndexOf <= 0) {
                        return this._default;
                    }
                    entry = this._suffixMap.getEntry(str, iIndexOf + 1, (length - iIndexOf) - 1);
                } while (entry == null);
                return (O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000) entry.getValue();
            }
            entry2 = this._prefixMap.getEntry(str, 0, iLastIndexOf);
        } while (entry2 == null);
        return (O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000) entry2.getValue();
    }

    public List getMatches(String str) {
        return org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getList(getLazyMatches(str));
    }

    public Object match(String str) {
        O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 match = getMatch(str);
        if (match != null) {
            return match.getValue();
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        String string = obj.toString();
        if ("".equals(string.trim())) {
            O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = new O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000("", obj2);
            o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f4387O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = "";
            this._exactMap.put("", (Object) o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000);
            return super.put("", obj2);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(string, f4389O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        Object obj3 = null;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (!strNextToken.startsWith(ServiceReference.DELIMITER) && !strNextToken.startsWith("*.")) {
                throw new IllegalArgumentException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("PathSpec ", strNextToken, ". must start with '/' or '*.'"));
            }
            Object objPut = super.put(strNextToken, obj2);
            O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001 = new O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(strNextToken, obj2);
            if (strNextToken.equals(strNextToken)) {
                if (strNextToken.equals("/*")) {
                    this._prefixDefault = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001;
                } else if (strNextToken.endsWith("/*")) {
                    String strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(2, 0, strNextToken);
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.f4387O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    this._prefixMap.put(strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, (Object) o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001);
                    this._exactMap.put(strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, (Object) o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001);
                    this._exactMap.put(strNextToken.substring(0, strNextToken.length() - 1), (Object) o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001);
                } else if (strNextToken.startsWith("*.")) {
                    this._suffixMap.put(strNextToken.substring(2), (Object) o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001);
                } else if (!strNextToken.equals(ServiceReference.DELIMITER)) {
                    o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001.f4387O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = strNextToken;
                    this._exactMap.put(strNextToken, (Object) o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001);
                } else if (this._nodefault) {
                    this._exactMap.put(strNextToken, (Object) o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001);
                } else {
                    this._default = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001;
                    this._defaultSingletonList = Collections.singletonList(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0001);
                }
            }
            obj3 = objPut;
        }
        return obj3;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        putAll((HashMap) objectInput.readObject());
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        if (obj != null) {
            String str = (String) obj;
            if (str.equals("/*")) {
                this._prefixDefault = null;
            } else if (str.endsWith("/*")) {
                this._prefixMap.remove(str.substring(0, str.length() - 2));
                this._exactMap.remove(str.substring(0, str.length() - 1));
                this._exactMap.remove(str.substring(0, str.length() - 2));
            } else if (str.startsWith("*.")) {
                this._suffixMap.remove(str.substring(2));
            } else if (str.equals(ServiceReference.DELIMITER)) {
                this._default = null;
                this._defaultSingletonList = null;
            } else {
                this._exactMap.remove(str);
            }
        }
        return super.remove(obj);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(new HashMap(this));
    }

    public static boolean match(String str, String str2) {
        return match(str, str2, false);
    }

    public static boolean match(String str, String str2, boolean z) {
        if (str.length() == 0) {
            return ServiceReference.DELIMITER.equals(str2);
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == '/') {
            if ((!z && str.length() == 1) || str.equals(str2) || O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(str, str2)) {
                return true;
            }
        } else if (cCharAt == '*') {
            return str2.regionMatches((str2.length() - str.length()) + 1, str, 1, str.length() - 1);
        }
        return false;
    }

    public O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(boolean z) {
        super(11);
        this._prefixMap = new org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
        this._suffixMap = new org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
        this._exactMap = new org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
        this._defaultSingletonList = null;
        this._prefixDefault = null;
        this._default = null;
        this._nodefault = false;
        this._entrySet = entrySet();
        this._nodefault = z;
    }

    public O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(int i) {
        super(i);
        this._prefixMap = new org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
        this._suffixMap = new org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
        this._exactMap = new org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
        this._defaultSingletonList = null;
        this._prefixDefault = null;
        this._default = null;
        this._nodefault = false;
        this._entrySet = entrySet();
    }

    public O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(Map map) {
        this._prefixMap = new org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
        this._suffixMap = new org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
        this._exactMap = new org.eclipse.jetty.util.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
        this._defaultSingletonList = null;
        this._prefixDefault = null;
        this._default = null;
        this._nodefault = false;
        putAll(map);
        this._entrySet = entrySet();
    }
}
