package kotlin.collections;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {
    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    public static void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbO00000OOoOOO00O00o0ooooooooO000ooooO0000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(i, i2, "fromIndex: ", ", toIndex: ", ", size: ");
            sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.append(i3);
            throw new IndexOutOfBoundsException(sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.toString());
        }
        if (i <= i2) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
    }
}
