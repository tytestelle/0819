package org.seamless.http;

import java.io.ByteArrayInputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Map {
    static final byte CR = 13;
    static final byte LF = 10;
    final Map<String, List<String>> map;
    private boolean normalizeHeaders;

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        this.map = new HashMap(32);
        this.normalizeHeaders = true;
    }

    public static String readLine(ByteArrayInputStream byteArrayInputStream) {
        return readLine(new StringBuilder(256), byteArrayInputStream);
    }

    public final String O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str) {
        if (!this.normalizeHeaders) {
            return str;
        }
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        char c = charArray[0];
        if (c >= 'a' && c <= 'z') {
            charArray[0] = (char) (c - ' ');
        }
        int length = str.length();
        for (int i = 1; i < length; i++) {
            char c2 = charArray[i];
            if (c2 >= 'A' && c2 <= 'Z') {
                charArray[i] = (char) (c2 + ' ');
            }
        }
        return new String(charArray);
    }

    public void add(String str, String str2) {
        String strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str);
        List<String> linkedList = this.map.get(strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.map.put(strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, linkedList);
        }
        linkedList.add(str2);
    }

    @Override // java.util.Map
    public void clear() {
        this.map.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return obj != null && (obj instanceof String) && this.map.containsKey(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((String) obj));
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.map.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, List<String>>> entrySet() {
        return this.map.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this.map.equals(obj);
    }

    public int findEndOfString(String str) {
        int length = str.length();
        while (length > 0 && Character.isWhitespace(str.charAt(length - 1))) {
            length--;
        }
        return length;
    }

    public int findNonWhitespace(String str, int i) {
        while (i < str.length() && Character.isWhitespace(str.charAt(i))) {
            i++;
        }
        return i;
    }

    public String getFirstHeader(String str) {
        List<String> list = this.map.get(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str));
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.map.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        return this.map.keySet();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends List<String>> map) {
        for (Map.Entry<? extends String, ? extends List<String>> entry : map.entrySet()) {
            put(entry.getKey(), (List) entry.getValue());
        }
    }

    public void set(String str, String str2) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str2);
        put(str, (List) linkedList);
    }

    @Override // java.util.Map
    public int size() {
        return this.map.size();
    }

    public String[] splitHeader(String str) {
        char cCharAt;
        int iFindNonWhitespace = findNonWhitespace(str, 0);
        int i = iFindNonWhitespace;
        while (i < str.length() && (cCharAt = str.charAt(i)) != ':' && !Character.isWhitespace(cCharAt)) {
            i++;
        }
        int i2 = i;
        while (i2 < str.length()) {
            if (str.charAt(i2) == ':') {
                i2++;
                break;
            }
            i2++;
        }
        int iFindNonWhitespace2 = findNonWhitespace(str, i2);
        int iFindEndOfString = findEndOfString(str);
        return new String[]{str.substring(iFindNonWhitespace, i), (str.length() < iFindNonWhitespace2 || str.length() < iFindEndOfString || iFindNonWhitespace2 >= iFindEndOfString) ? null : str.substring(iFindNonWhitespace2, iFindEndOfString)};
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(512);
        for (Map.Entry<String, List<String>> entry : entrySet()) {
            sb.append(entry.getKey());
            sb.append(": ");
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(",");
            }
            sb.delete(sb.length() - 1, sb.length());
            sb.append("\r\n");
        }
        return sb.toString();
    }

    @Override // java.util.Map
    public Collection<List<String>> values() {
        return this.map.values();
    }

    public static String readLine(StringBuilder sb, ByteArrayInputStream byteArrayInputStream) {
        while (true) {
            int i = byteArrayInputStream.read();
            if (i == -1) {
                break;
            }
            char c = (char) i;
            if (c == '\r') {
                if (((char) byteArrayInputStream.read()) == '\n') {
                    break;
                }
                sb.append(c);
            } else {
                if (c == '\n') {
                    break;
                }
                sb.append(c);
            }
        }
        return sb.toString();
    }

    @Override // java.util.Map
    public List<String> get(Object obj) {
        return this.map.get(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((String) obj));
    }

    @Override // java.util.Map
    public List put(String str, List list) {
        return this.map.put(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str), list);
    }

    @Override // java.util.Map
    public List remove(Object obj) {
        return this.map.remove(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((String) obj));
    }

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Map map) {
        this.map = new HashMap(32);
        this.normalizeHeaders = true;
        putAll(map);
    }

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(ByteArrayInputStream byteArrayInputStream) {
        this.map = new HashMap(32);
        this.normalizeHeaders = true;
        StringBuilder sb = new StringBuilder(256);
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        String line = readLine(sb, byteArrayInputStream);
        if (line.length() != 0) {
            String str = null;
            do {
                char cCharAt = line.charAt(0);
                if (str != null && (cCharAt == ' ' || cCharAt == '\t')) {
                    List<String> list = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get((Object) str);
                    int size = list.size() - 1;
                    list.set(size, list.get(size) + line.trim());
                } else {
                    String[] strArrSplitHeader = splitHeader(line);
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.add(strArrSplitHeader[0], strArrSplitHeader[1]);
                    str = strArrSplitHeader[0];
                }
                sb.delete(0, sb.length());
                line = readLine(sb, byteArrayInputStream);
            } while (line.length() != 0);
        }
        putAll(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(boolean z) {
        this.map = new HashMap(32);
        this.normalizeHeaders = z;
    }
}
