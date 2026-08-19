package com.orhanobut.hawk;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

/* JADX INFO: loaded from: classes2.dex */
final class HawkUtils {
    private HawkUtils() {
    }

    public static void checkNull(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(str, " should not be null"));
        }
    }

    public static void checkNullOrEmpty(String str, String str2) {
        if (isEmpty(str2)) {
            throw new NullPointerException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(str, " should not be null or empty"));
        }
    }

    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }
}
