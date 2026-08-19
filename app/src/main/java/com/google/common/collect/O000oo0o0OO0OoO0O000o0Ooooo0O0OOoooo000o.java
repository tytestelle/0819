package com.google.common.collect;

import com.tencent.smtt.export.external.interfaces.ISelectionInterface;
import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000o extends O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o {
    static final O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o EMPTY = new O000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000o(new Object[0], 0, null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final transient Object f3662O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final transient int f3663O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    final transient Object[] alternatingKeysAndValues;

    public O000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000o(Object[] objArr, int i, Object obj) {
        this.f3662O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = obj;
        this.alternatingKeysAndValues = objArr;
        this.f3663O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = i;
    }

    public static Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object[] objArr, int i, int i2, int i3) {
        O000O00OoO000o0oo0o00oO00oo00oOoo000O0OO o000O00OoO000o0oo0o00oO00oo00oOoo000O0OO = null;
        if (i == 1) {
            Objects.requireNonNull(objArr[i3]);
            Objects.requireNonNull(objArr[i3 ^ 1]);
            return null;
        }
        int i4 = i2 - 1;
        int i5 = -1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                int i8 = (i7 * 2) + i3;
                int i9 = (i6 * 2) + i3;
                Object obj = objArr[i8];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i8 ^ 1];
                Objects.requireNonNull(obj2);
                int iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(obj.hashCode());
                while (true) {
                    int i10 = iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 & i4;
                    int i11 = bArr[i10] & 255;
                    if (i11 == 255) {
                        bArr[i10] = (byte) i9;
                        if (i6 < i7) {
                            objArr[i9] = obj;
                            objArr[i9 ^ 1] = obj2;
                        }
                        i6++;
                        break;
                    }
                    if (obj.equals(objArr[i11])) {
                        int i12 = i11 ^ 1;
                        Object obj3 = objArr[i12];
                        Objects.requireNonNull(obj3);
                        o000O00OoO000o0oo0o00oO00oo00oOoo000O0OO = new O000O00OoO000o0oo0o00oO00oo00oOoo000O0OO(obj, obj2, obj3);
                        objArr[i12] = obj2;
                        break;
                    }
                    iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = i10 + 1;
                }
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), o000O00OoO000o0oo0o00oO00oo00oOoo000O0OO};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i; i14++) {
                int i15 = (i14 * 2) + i3;
                int i16 = (i13 * 2) + i3;
                Object obj4 = objArr[i15];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i15 ^ 1];
                Objects.requireNonNull(obj5);
                int iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00001 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(obj4.hashCode());
                while (true) {
                    int i17 = iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00001 & i4;
                    int i18 = sArr[i17] & ISelectionInterface.HELD_NOTHING;
                    if (i18 == 65535) {
                        sArr[i17] = (short) i16;
                        if (i13 < i14) {
                            objArr[i16] = obj4;
                            objArr[i16 ^ 1] = obj5;
                        }
                        i13++;
                        break;
                    }
                    if (obj4.equals(objArr[i18])) {
                        int i19 = i18 ^ 1;
                        Object obj6 = objArr[i19];
                        Objects.requireNonNull(obj6);
                        o000O00OoO000o0oo0o00oO00oo00oOoo000O0OO = new O000O00OoO000o0oo0o00oO00oo00oOoo000O0OO(obj4, obj5, obj6);
                        objArr[i19] = obj5;
                        break;
                    }
                    iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00001 = i17 + 1;
                }
            }
            return i13 == i ? sArr : new Object[]{sArr, Integer.valueOf(i13), o000O00OoO000o0oo0o00oO00oo00oOoo000O0OO};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i20 = 0;
        int i21 = 0;
        while (i20 < i) {
            int i22 = (i20 * 2) + i3;
            int i23 = (i21 * 2) + i3;
            Object obj7 = objArr[i22];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i22 ^ 1];
            Objects.requireNonNull(obj8);
            int iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00002 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(obj7.hashCode());
            while (true) {
                int i24 = iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00002 & i4;
                int i25 = iArr[i24];
                if (i25 == i5) {
                    iArr[i24] = i23;
                    if (i21 < i20) {
                        objArr[i23] = obj7;
                        objArr[i23 ^ 1] = obj8;
                    }
                    i21++;
                    break;
                }
                if (obj7.equals(objArr[i25])) {
                    int i26 = i25 ^ 1;
                    Object obj9 = objArr[i26];
                    Objects.requireNonNull(obj9);
                    o000O00OoO000o0oo0o00oO00oo00oOoo000O0OO = new O000O00OoO000o0oo0o00oO00oo00oOoo000O0OO(obj7, obj8, obj9);
                    objArr[i26] = obj8;
                    break;
                }
                iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00002 = i24 + 1;
                i5 = -1;
            }
            i20++;
            i5 = -1;
        }
        return i21 == i ? iArr : new Object[]{iArr, Integer.valueOf(i21), o000O00OoO000o0oo0o00oO00oo00oOoo000O0OO};
    }

    public static <K, V> O000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000o create(int i, Object[] objArr) {
        return create(i, objArr, null);
    }

    @CheckForNull
    public static Object createHashTableOrThrow(Object[] objArr, int i, int i2, int i3) {
        Object objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(objArr, i, i2, i3);
        if (objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO instanceof Object[]) {
            throw ((O000O00OoO000o0oo0o00oO00oo00oOoo000O0OO) ((Object[]) objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO)[2]).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
        return objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o
    public O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 createEntrySet() {
        return new O000oo0O0o00O0oO00OOoooo0000OoOOoOOOo0oO(this, this.alternatingKeysAndValues, 0, this.f3663O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o
    public O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 createKeySet() {
        return new O000oo0OO00OoO0o00o0oO00O00o0o0Oo0OO0o0O(this, new O000oo0o00OO0ooOO0O0ooOoOOoo0OooOO00oOoo(this.alternatingKeysAndValues, 0, this.f3663O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO));
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o
    public O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo createValues() {
        return new O000oo0o00OO0ooOO0O0ooOoOOoo0OooOO00oOoo(this.alternatingKeysAndValues, 1, this.f3663O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o, java.util.Map
    @CheckForNull
    public Object get(@CheckForNull Object obj) {
        Object obj2 = get(this.f3662O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, this.alternatingKeysAndValues, this.f3663O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, 0, obj);
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f3663O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o
    public Object writeReplace() {
        return super.writeReplace();
    }

    public static <K, V> O000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000o create(int i, Object[] objArr, O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O) {
        if (i == 0) {
            return (O000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000o) EMPTY;
        }
        if (i == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new O000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000o(objArr, 1, null);
        }
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(i, objArr.length >> 1);
        Object objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(objArr, i, O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0.chooseTableSize(i), 0);
        if (objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO instanceof Object[]) {
            Object[] objArr2 = (Object[]) objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            O000O00OoO000o0oo0o00oO00oo00oOoo000O0OO o000O00OoO000o0oo0o00oO00oo00oOoo000O0OO = (O000O00OoO000o0oo0o00oO00oo00oOoo000O0OO) objArr2[2];
            if (o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O == null) {
                throw o000O00OoO000o0oo0o00oO00oo00oOoo000O0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            }
            o000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O.f3505O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000O00OoO000o0oo0o00oO00oo00oOoo000O0OO;
            Object obj = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = obj;
            i = iIntValue;
        }
        return new O000oo0o0OO0OoO0O000o0Ooooo0O0OOoooo000o(objArr, i, objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }

    @CheckForNull
    public static Object get(@CheckForNull Object obj, Object[] objArr, int i, int i2, @CheckForNull Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(obj2.hashCode());
            while (true) {
                int i3 = iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00001 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(obj2.hashCode());
            while (true) {
                int i5 = iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00001 & length2;
                int i6 = sArr[i5] & ISelectionInterface.HELD_NOTHING;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00001 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00002 = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(obj2.hashCode());
            while (true) {
                int i7 = iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00002 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                iO0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00002 = i7 + 1;
            }
        }
    }
}
