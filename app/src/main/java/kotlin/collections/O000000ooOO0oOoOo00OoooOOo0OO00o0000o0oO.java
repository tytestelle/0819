package kotlin.collections;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO extends com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {
    public static void O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(int i, int i2, int i3, int[] iArr, int[] destination) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(iArr, "<this>");
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(destination, "destination");
        System.arraycopy(iArr, i2, destination, i, i3 - i2);
    }

    public static void O00000OOoOOO00O00o0ooooooooO000ooooO0000(float[] fArr, float[] destination, int i, int i2, int i3) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(fArr, "<this>");
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(destination, "destination");
        System.arraycopy(fArr, i2, destination, i, i3 - i2);
    }

    public static void O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(long[] jArr, long[] destination, int i, int i2, int i3) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(jArr, "<this>");
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(destination, "destination");
        System.arraycopy(jArr, i2, destination, i, i3 - i2);
    }

    public static void O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(Object[] objArr, int i, Object[] destination, int i2, int i3) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(objArr, "<this>");
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(destination, "destination");
        System.arraycopy(objArr, i2, destination, i, i3 - i2);
    }

    public static /* synthetic */ void O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(i, 0, i2, iArr, iArr2);
    }

    public static /* synthetic */ void O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(objArr, i, objArr2, i2, i3);
    }

    public static void O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(Object[] objArr, int i, int i2) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(objArr, "<this>");
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static void O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(long[] jArr) {
        int length = jArr.length;
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(jArr, "<this>");
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    public static int O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(Object[] objArr, Object obj) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
