package kotlin.text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
import kotlin.sequences.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O extends O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {
    public static final int O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(CharSequence charSequence) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(CharSequence charSequence, String string, int i, boolean z) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(charSequence, "<this>");
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(string, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i, length, 1);
        boolean z2 = charSequence instanceof String;
        int i2 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1678O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        int i3 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int i4 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1676O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (z2 && (string instanceof String)) {
            if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
                while (!O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(string, (String) charSequence, i4, string.length(), z)) {
                    if (i4 != i3) {
                        i4 += i2;
                    }
                }
                return i4;
            }
            return -1;
        }
        if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
            while (!O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(string, charSequence, i4, string.length(), z)) {
                if (i4 != i3) {
                    i4 += i2;
                }
            }
            return i4;
        }
        return -1;
    }

    public static final boolean O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(String str, String other, int i, int i2, boolean z) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(str, "<this>");
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(other, "other");
        return !z ? str.regionMatches(0, other, i, i2) : str.regionMatches(z, 0, other, i, i2);
    }

    public static final boolean O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(String str, CharSequence other, int i, int i2, boolean z) {
        char upperCase;
        char upperCase2;
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(str, "<this>");
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(other, "other");
        if (i < 0 || str.length() - i2 < 0 || i > other.length() - i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            char cCharAt = str.charAt(i3);
            char cCharAt2 = other.charAt(i + i3);
            if (cCharAt != cCharAt2 && (!z || ((upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)))) {
                return false;
            }
        }
        return true;
    }

    public static List O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(String str, String[] strArr) {
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                int iO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(str, str2, 0, false);
                if (iO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 == -1) {
                    return org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(str.toString());
                }
                ArrayList arrayList = new ArrayList(10);
                int length = 0;
                do {
                    arrayList.add(str.subSequence(length, iO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000).toString());
                    length = str2.length() + iO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                    iO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(str, str2, length, false);
                } while (iO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 != -1);
                arrayList.add(str.subSequence(length, str.length()).toString());
                return arrayList;
            }
        }
        List listAsList = Arrays.asList(strArr);
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(listAsList, "asList(this)");
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(str, 0, 0, new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(listAsList, false)));
        ArrayList arrayList2 = new ArrayList(O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo));
        Iterator it = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.iterator();
        while (true) {
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) it;
            if (!o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.hasNext()) {
                return arrayList2;
            }
            O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo range = (O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.next();
            kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(range, "range");
            arrayList2.add(str.subSequence(range.f1676O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, range.f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + 1).toString());
        }
    }

    public static String O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(String missingDelimiterValue) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf = missingDelimiterValue.lastIndexOf(46, O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(missingDelimiterValue));
        if (iLastIndexOf == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(iLastIndexOf + 1, missingDelimiterValue.length());
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
