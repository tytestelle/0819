package org.fourthline.cling.model.types;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes2.dex */
public class BytesRange {
    public static final String PREFIX = "bytes=";
    private Long byteLength;
    private Long firstByte;
    private Long lastByte;

    public BytesRange(Long l, Long l2) {
        this.firstByte = l;
        this.lastByte = l2;
        this.byteLength = null;
    }

    public static BytesRange valueOf(String str) {
        return valueOf(str, null);
    }

    public Long getByteLength() {
        return this.byteLength;
    }

    public Long getFirstByte() {
        return this.firstByte;
    }

    public Long getLastByte() {
        return this.lastByte;
    }

    public String getString() {
        return getString(false, null);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    public static BytesRange valueOf(String str, String str2) {
        Long lValueOf;
        Long lValueOf2;
        if (str.startsWith(str2 != null ? str2 : PREFIX)) {
            if (str2 == null) {
                str2 = PREFIX;
            }
            String[] strArrSplit = str.substring(str2.length()).split("[-/]");
            int length = strArrSplit.length;
            if (length == 1) {
                lValueOf = null;
                lValueOf2 = null;
            } else if (length == 2) {
                lValueOf = null;
                if (strArrSplit[1].length() != 0) {
                    lValueOf2 = Long.valueOf(Long.parseLong(strArrSplit[1]));
                } else {
                    lValueOf2 = null;
                }
            } else if (length == 3) {
                if (strArrSplit[2].length() == 0 || strArrSplit[2].equals("*")) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(Long.parseLong(strArrSplit[2]));
                }
                if (strArrSplit[1].length() != 0) {
                    lValueOf2 = Long.valueOf(Long.parseLong(strArrSplit[1]));
                } else {
                    lValueOf2 = null;
                }
            }
            Long lValueOf3 = strArrSplit[0].length() != 0 ? Long.valueOf(Long.parseLong(strArrSplit[0])) : null;
            if (lValueOf3 != null || lValueOf2 != null) {
                return new BytesRange(lValueOf3, lValueOf2, lValueOf);
            }
        }
        throw new InvalidValueException("Can't parse Bytes Range: ".concat(str));
    }

    public String getString(boolean z) {
        return getString(z, null);
    }

    public String getString(boolean z, String str) {
        if (str == null) {
            str = PREFIX;
        }
        if (this.firstByte != null) {
            StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(str);
            sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(this.firstByte.toString());
            str = sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString();
        }
        String strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(str, "-");
        if (this.lastByte != null) {
            StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
            sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2.append(this.lastByte.toString());
            strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2.toString();
        }
        if (!z) {
            return strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        }
        StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, ServiceReference.DELIMITER);
        Long l = this.byteLength;
        sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(l != null ? l.toString() : "*");
        return sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.toString();
    }

    public BytesRange(Long l, Long l2, Long l3) {
        this.firstByte = l;
        this.lastByte = l2;
        this.byteLength = l3;
    }
}
