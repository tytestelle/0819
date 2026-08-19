package androidx.collection;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public abstract class IntFloatMap {
    public int _capacity;
    public int _size;
    public int[] keys;
    public long[] metadata;
    public float[] values;

    public /* synthetic */ IntFloatMap(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        this();
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
    }

    public static /* synthetic */ void get_size$collection$annotations() {
    }

    public static /* synthetic */ String joinToString$default(IntFloatMap intFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        return intFloatMap.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4);
    }

    public final boolean all(Function2<? super Integer, ? super Float, Boolean> predicate) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        if (!predicate.invoke(Integer.valueOf(iArr[i4]), Float.valueOf(fArr[i4])).booleanValue()) {
                            return false;
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final boolean contains(int i) {
        return findKeyIndex(i) >= 0;
    }

    public final boolean containsKey(int i) {
        return findKeyIndex(i) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[LOOP:0: B:5:0x000d->B:18:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    public final boolean containsValue(float f) {
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && f == fArr[(i << 3) + i3]) {
                            return true;
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        return false;
    }

    public final int count() {
        return getSize();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0065 A[LOOP:0: B:14:0x0027->B:27:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0068 A[SYNTHETIC] */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntFloatMap)) {
            return false;
        }
        IntFloatMap intFloatMap = (IntFloatMap) obj;
        if (intFloatMap.getSize() != getSize()) {
            return false;
        }
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (fArr[i4] != intFloatMap.get(iArr[i4])) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        return true;
    }

    public final int findKeyIndex(int i) {
        int i2 = ScatterMapKt.MurmurHashC1 * i;
        int i3 = i2 ^ (i2 << 16);
        int i4 = i3 & 127;
        int i5 = this._capacity;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (((long) i4) * ScatterMapKt.BitmaskLsb) ^ j;
            for (long j3 = (~j2) & (j2 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.keys[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    public final void forEach(Function2<? super Integer, ? super Float, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> block) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(block, "block");
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        block.invoke(Integer.valueOf(iArr[i4]), Float.valueOf(fArr[i4]));
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void forEachIndexed(Function1<? super Integer, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> block) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(block, "block");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(i << 3, i3, block);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void forEachKey(Function1<? super Integer, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> block) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(block, "block");
        int[] iArr = this.keys;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        block.invoke(Integer.valueOf(iArr[(i << 3) + i3]));
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void forEachValue(Function1<? super Float, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> block) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(block, "block");
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        block.invoke(Float.valueOf(fArr[(i << 3) + i3]));
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final float get(int i) {
        int iFindKeyIndex = findKeyIndex(i);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        throw new NoSuchElementException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "Cannot find value for key "));
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final float getOrDefault(int i, float f) {
        int iFindKeyIndex = findKeyIndex(i);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : f;
    }

    public final float getOrElse(int i, Function0<Float> defaultValue) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(i);
        return iFindKeyIndex < 0 ? defaultValue.invoke().floatValue() : this.values[iFindKeyIndex];
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int iFloatToIntBits = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            iFloatToIntBits += Float.floatToIntBits(fArr[i5]) ^ iArr[i5];
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return iFloatToIntBits;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    i = iFloatToIntBits;
                }
            }
        }
        return i;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final boolean none() {
        return this._size == 0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006a A[DONT_INVERT, PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0030, B:19:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x006c A[LOOP:0: B:9:0x0022->B:21:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x006f A[EDGE_INSN: B:25:0x006f->B:22:0x006f BREAK  A[LOOP:0: B:9:0x0022->B:21:0x006c], SYNTHETIC] */
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr[i5];
                            float f = fArr[i5];
                            sb.append(i6);
                            sb.append("=");
                            sb.append(f);
                            i2++;
                            if (i2 < this._size) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(sb, '}', "s.append('}').toString()");
    }

    private IntFloatMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = IntSetKt.getEmptyIntArray();
        this.values = FloatSetKt.getEmptyFloatArray();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0060 A[LOOP:0: B:5:0x0016->B:18:0x0060, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0063 A[SYNTHETIC] */
    public final boolean any(Function2<? super Integer, ? super Float, Boolean> predicate) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (predicate.invoke(Integer.valueOf(iArr[i4]), Float.valueOf(fArr[i4])).booleanValue()) {
                                return true;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        return false;
    }

    public final int count(Function2<? super Integer, ? super Float, Boolean> predicate) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            if (predicate.invoke(Integer.valueOf(iArr[i6]), Float.valueOf(fArr[i6])).booleanValue()) {
                                i3++;
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return i3;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    i = i3;
                }
            }
        }
        return i;
    }

    public final String joinToString(CharSequence separator) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(IntFloatMap intFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function2 function2, int i2, Object obj) {
        long[] jArr;
        if (obj == null) {
            CharSequence separator = (i2 & 1) != 0 ? ", " : charSequence;
            CharSequence prefix = (i2 & 2) != 0 ? "" : charSequence2;
            CharSequence postfix = (i2 & 4) == 0 ? charSequence3 : "";
            int i3 = (i2 & 8) != 0 ? -1 : i;
            CharSequence charSequence5 = (i2 & 16) != 0 ? "..." : charSequence4;
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(postfix, "postfix");
            StringBuilder sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(charSequence5, "truncated", function2, "transform", prefix);
            int[] iArr = intFloatMap.keys;
            float[] fArr = intFloatMap.values;
            long[] jArr2 = intFloatMap.metadata;
            int length = jArr2.length - 2;
            if (length < 0) {
                sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(postfix);
                break;
            }
            int i4 = 0;
            int i5 = 0;
            loop0: while (true) {
                long j = jArr2[i4];
                int i6 = i4;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j & 255) < 128) {
                            int i9 = (i6 << 3) + i8;
                            int i10 = iArr[i9];
                            float f = fArr[i9];
                            if (i5 == i3) {
                                sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(charSequence5);
                                break loop0;
                            }
                            if (i5 != 0) {
                                sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(separator);
                            }
                            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append((CharSequence) function2.invoke(Integer.valueOf(i10), Float.valueOf(f)));
                            i5++;
                        }
                        j >>= 8;
                        i8++;
                        jArr2 = jArr2;
                    }
                    jArr = jArr2;
                    if (i7 == 8) {
                    }
                    sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(postfix);
                    break;
                }
                jArr = jArr2;
                if (i6 == length) {
                    sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(postfix);
                    break;
                }
                i4 = i6 + 1;
                jArr2 = jArr;
            }
            String string = sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.toString();
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i, null, 16, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, int i, CharSequence charSequence2) {
        int[] iArr;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        StringBuilder sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(charSequence, "postfix", charSequence2, "truncated", prefix);
        int[] iArr2 = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(charSequence);
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        int i7 = iArr2[i6];
                        float f = fArr[i6];
                        if (i3 == i) {
                            sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(charSequence2);
                            break loop0;
                        }
                        if (i3 != 0) {
                            sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(separator);
                        }
                        sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(i7);
                        sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append('=');
                        sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(f);
                        i3++;
                    }
                    j >>= 8;
                    i5++;
                    iArr2 = iArr2;
                }
                iArr = iArr2;
                if (i4 == 8) {
                }
                sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(charSequence);
                break;
            }
            iArr = iArr2;
            if (i2 == length) {
                sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(charSequence);
                break;
            }
            i2++;
            iArr2 = iArr;
        }
        String string = sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.toString();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0090 A[PHI: r12
  0x0090: PHI (r12v2 int) = (r12v1 int), (r12v3 int) binds: [B:6:0x0042, B:19:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0093 A[LOOP:0: B:5:0x0030->B:22:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x009a A[SYNTHETIC] */
    public final String joinToString(CharSequence charSequence, CharSequence prefix, CharSequence postfix, int i, CharSequence charSequence2, Function2<? super Integer, ? super Float, ? extends CharSequence> function2) {
        CharSequence separator = charSequence;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(postfix, "postfix");
        StringBuilder sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(charSequence2, "truncated", function2, "transform", prefix);
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(postfix);
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j = jArr[i2];
            int i4 = i2;
            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i4 == length) {
                    sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(postfix);
                    break;
                }
                i2 = i4 + 1;
                separator = charSequence;
            } else {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j & 255) < 128) {
                        int i7 = (i4 << 3) + i6;
                        int i8 = iArr[i7];
                        float f = fArr[i7];
                        if (i3 == i) {
                            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(charSequence2);
                            break loop0;
                        }
                        if (i3 != 0) {
                            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(separator);
                        }
                        sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(function2.invoke(Integer.valueOf(i8), Float.valueOf(f)));
                        i3++;
                    }
                    j >>= 8;
                    i6++;
                    separator = charSequence;
                }
                if (i5 == 8) {
                    if (i4 == length) {
                        i2 = i4 + 1;
                        separator = charSequence;
                    }
                }
                sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(postfix);
                break;
            }
        }
        String string = sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.toString();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(CharSequence charSequence, CharSequence prefix, CharSequence charSequence2, int i, Function2<? super Integer, ? super Float, ? extends CharSequence> function2) {
        CharSequence separator = charSequence;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        StringBuilder sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(charSequence2, "postfix", function2, "transform", prefix);
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(charSequence2);
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        int i7 = iArr[i6];
                        float f = fArr[i6];
                        if (i3 == i) {
                            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i3 != 0) {
                            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(separator);
                        }
                        sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(function2.invoke(Integer.valueOf(i7), Float.valueOf(f)));
                        i3++;
                    }
                    j >>= 8;
                    i5++;
                    separator = charSequence;
                }
                if (i4 == 8) {
                }
                sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(charSequence2);
                break;
            }
            if (i2 == length) {
                sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(charSequence2);
                break;
            }
            i2++;
            separator = charSequence;
        }
        String string = sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.toString();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0089 A[DONT_INVERT, PHI: r11
  0x0089: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x003a, B:19:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x008b A[LOOP:0: B:5:0x0029->B:21:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0090 A[SYNTHETIC] */
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, Function2<? super Integer, ? super Float, ? extends CharSequence> function2) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        StringBuilder sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(charSequence, "postfix", function2, "transform", prefix);
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(charSequence);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((j & 255) < 128) {
                        int i5 = (i << 3) + i4;
                        int i6 = iArr[i5];
                        float f = fArr[i5];
                        if (i2 == -1) {
                            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(separator);
                        }
                        sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(function2.invoke(Integer.valueOf(i6), Float.valueOf(f)));
                        i2++;
                    }
                    j >>= 8;
                }
                if (i3 == 8) {
                    if (i == length) {
                        i++;
                    }
                }
                sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(charSequence);
                break;
            }
            if (i == length) {
                sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(charSequence);
                break;
            }
            i++;
        }
        String string = sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.toString();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007d A[DONT_INVERT, PHI: r10
  0x007d: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0030, B:19:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x007f A[LOOP:0: B:5:0x0022->B:21:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0082 A[SYNTHETIC] */
    public final String joinToString(CharSequence separator, CharSequence charSequence, Function2<? super Integer, ? super Float, ? extends CharSequence> function2) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        StringBuilder sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(charSequence, "prefix", function2, "transform", charSequence);
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append((CharSequence) "");
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((j & 255) < 128) {
                        int i5 = (i << 3) + i4;
                        int i6 = iArr[i5];
                        float f = fArr[i5];
                        if (i2 == -1) {
                            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(separator);
                        }
                        sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(function2.invoke(Integer.valueOf(i6), Float.valueOf(f)));
                        i2++;
                    }
                    j >>= 8;
                }
                if (i3 == 8) {
                    if (i == length) {
                        i++;
                    }
                }
                sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append((CharSequence) "");
                break;
            }
            if (i == length) {
                sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append((CharSequence) "");
                break;
            }
            i++;
        }
        String string = sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.toString();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0084 A[DONT_INVERT, PHI: r11
  0x0084: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0035, B:19:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0086 A[LOOP:0: B:5:0x0024->B:21:0x0086, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x008b A[SYNTHETIC] */
    public final String joinToString(CharSequence separator, Function2<? super Integer, ? super Float, ? extends CharSequence> transform) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "");
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((j & 255) < 128) {
                        int i5 = (i << 3) + i4;
                        int i6 = iArr[i5];
                        float f = fArr[i5];
                        if (i2 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(separator);
                        }
                        sb.append(transform.invoke(Integer.valueOf(i6), Float.valueOf(f)));
                        i2++;
                    }
                    j >>= 8;
                }
                if (i3 == 8) {
                    if (i == length) {
                        i++;
                    }
                }
                sb.append((CharSequence) "");
                break;
            }
            if (i == length) {
                sb.append((CharSequence) "");
                break;
            }
            i++;
        }
        String string = sb.toString();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007a A[DONT_INVERT, PHI: r10
  0x007a: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x002b, B:19:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x007c A[LOOP:0: B:5:0x001d->B:21:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x007f A[SYNTHETIC] */
    public final String joinToString(Function2<? super Integer, ? super Float, ? extends CharSequence> transform) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "");
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((j & 255) < 128) {
                        int i5 = (i << 3) + i4;
                        int i6 = iArr[i5];
                        float f = fArr[i5];
                        if (i2 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append(transform.invoke(Integer.valueOf(i6), Float.valueOf(f)));
                        i2++;
                    }
                    j >>= 8;
                }
                if (i3 == 8) {
                    if (i == length) {
                        i++;
                    }
                }
                sb.append((CharSequence) "");
                break;
            }
            if (i == length) {
                sb.append((CharSequence) "");
                break;
            }
            i++;
        }
        String string = sb.toString();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
