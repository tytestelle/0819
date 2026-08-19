package androidx.collection;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import androidx.collection.internal.ContainerHelpersKt;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ObjectLongMap<K> {
    public int _capacity;
    public int _size;
    public Object[] keys;
    public long[] metadata;
    public long[] values;

    public /* synthetic */ ObjectLongMap(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
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

    public static /* synthetic */ String joinToString$default(ObjectLongMap objectLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
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
        return objectLongMap.joinToString(charSequence, charSequence5, charSequence6, i3, charSequence4);
    }

    public final boolean all(Function2<? super K, ? super Long, Boolean> predicate) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        if (!predicate.invoke(objArr[i4], Long.valueOf(jArr[i4])).booleanValue()) {
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

    public final boolean contains(K k) {
        return findKeyIndex(k) >= 0;
    }

    public final boolean containsKey(K k) {
        return findKeyIndex(k) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[LOOP:0: B:5:0x000d->B:18:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    public final boolean containsValue(long j) {
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j2 = jArr2[i];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j2) < 128 && j == jArr[(i << 3) + i3]) {
                            return true;
                        }
                        j2 >>= 8;
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

    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064 A[LOOP:0: B:14:0x0027->B:26:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ObjectLongMap)) {
            return false;
        }
        ObjectLongMap objectLongMap = (ObjectLongMap) obj;
        if (objectLongMap.getSize() != getSize()) {
            return false;
        }
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (jArr[i4] != objectLongMap.get(objArr[i4])) {
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

    public final int findKeyIndex(K k) {
        int i = 0;
        int iHashCode = (k != null ? k.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.metadata;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * ScatterMapKt.BitmaskLsb) ^ j;
            for (long j3 = (~j2) & (j2 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.keys[iNumberOfTrailingZeros], k)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final void forEach(Function2<? super K, ? super Long, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> block) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(block, "block");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        block.invoke(objArr[i4], Long.valueOf(jArr[i4]));
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

    public final void forEachKey(Function1<? super K, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> block) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(block, "block");
        Object[] objArr = this.keys;
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
                        block.invoke(objArr[(i << 3) + i3]);
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

    public final void forEachValue(Function1<? super Long, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> block) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(block, "block");
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        block.invoke(Long.valueOf(jArr[(i << 3) + i3]));
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

    public final long get(K k) {
        int iFindKeyIndex = findKeyIndex(k);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        throw new NoSuchElementException("There is no key " + k + " in the map");
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final long getOrDefault(K k, long j) {
        int iFindKeyIndex = findKeyIndex(k);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : j;
    }

    public final long getOrElse(K k, Function0<Long> defaultValue) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(k);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : defaultValue.invoke().longValue();
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int iHashCode = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            long j2 = jArr[i5];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ ((int) (j2 ^ (j2 >>> 32)));
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return iHashCode;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    i = iHashCode;
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

    public String toString() {
        int i;
        int i2;
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            Object obj = objArr[i7];
                            i2 = i3;
                            long j2 = jArr[i7];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(j2);
                            i4++;
                            if (i4 < this._size) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(sb, '}', "s.append('}').toString()");
    }

    private ObjectLongMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = ContainerHelpersKt.EMPTY_OBJECTS;
        this.values = LongSetKt.getEmptyLongArray();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x005c A[LOOP:0: B:5:0x0016->B:18:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x005f A[SYNTHETIC] */
    public final boolean any(Function2<? super K, ? super Long, Boolean> predicate) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (predicate.invoke(objArr[i4], Long.valueOf(jArr[i4])).booleanValue()) {
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

    public final int count(Function2<? super K, ? super Long, Boolean> predicate) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            if (predicate.invoke(objArr[i6], Long.valueOf(jArr[i6])).booleanValue()) {
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

    public static /* synthetic */ String joinToString$default(ObjectLongMap objectLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function2 function2, int i2, Object obj) {
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
            Object[] objArr = objectLongMap.keys;
            long[] jArr2 = objectLongMap.values;
            long[] jArr3 = objectLongMap.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(postfix);
                break;
            }
            int i4 = 0;
            int i5 = 0;
            loop0: while (true) {
                long j = jArr3[i4];
                int i6 = i4;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j & 255) < 128) {
                            int i9 = (i6 << 3) + i8;
                            Object obj2 = objArr[i9];
                            long j2 = jArr2[i9];
                            if (i5 == i3) {
                                sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(charSequence5);
                                break loop0;
                            }
                            if (i5 != 0) {
                                sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(separator);
                            }
                            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append((CharSequence) function2.invoke(obj2, Long.valueOf(j2)));
                            i5++;
                        }
                        j >>= 8;
                        i8++;
                        jArr3 = jArr3;
                    }
                    jArr = jArr3;
                    if (i7 == 8) {
                    }
                    sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(postfix);
                    break;
                }
                jArr = jArr3;
                if (i6 == length) {
                    sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(postfix);
                    break;
                }
                i4 = i6 + 1;
                jArr3 = jArr;
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
        long[] jArr;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        StringBuilder sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(charSequence, "postfix", charSequence2, "truncated", prefix);
        Object[] objArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(charSequence);
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j = jArr3[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        Object obj = objArr[i6];
                        long j2 = jArr2[i6];
                        if (i3 == i) {
                            sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(charSequence2);
                            break loop0;
                        }
                        if (i3 != 0) {
                            sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(separator);
                        }
                        sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(obj);
                        sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append('=');
                        sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(j2);
                        i3++;
                    }
                    j >>= 8;
                    i5++;
                    jArr3 = jArr3;
                    length = length;
                }
                jArr = jArr3;
                int i7 = length;
                if (i4 == 8) {
                    length = i7;
                }
                sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(charSequence);
                break;
            }
            jArr = jArr3;
            if (i2 == length) {
                sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.append(charSequence);
                break;
            }
            i2++;
            jArr3 = jArr;
        }
        String string = sbO00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.toString();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String joinToString(CharSequence charSequence, CharSequence prefix, CharSequence postfix, int i, CharSequence charSequence2, Function2<? super K, ? super Long, ? extends CharSequence> function2) {
        Object[] objArr;
        CharSequence separator = charSequence;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(postfix, "postfix");
        StringBuilder sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(charSequence2, "truncated", function2, "transform", prefix);
        Object[] objArr2 = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(postfix);
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j = jArr2[i2];
            int i4 = i2;
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8 - ((~(i4 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j & 255) < 128) {
                        int i7 = (i4 << 3) + i6;
                        Object obj = objArr2[i7];
                        long j2 = jArr[i7];
                        if (i3 == i) {
                            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(charSequence2);
                            break loop0;
                        }
                        if (i3 != 0) {
                            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(separator);
                        }
                        sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(function2.invoke(obj, Long.valueOf(j2)));
                        i3++;
                    }
                    j >>= 8;
                    i6++;
                    separator = charSequence;
                    objArr2 = objArr2;
                }
                objArr = objArr2;
                if (i5 == 8) {
                }
                sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(postfix);
                break;
            }
            objArr = objArr2;
            if (i4 == length) {
                sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(postfix);
                break;
            }
            i2 = i4 + 1;
            separator = charSequence;
            objArr2 = objArr;
        }
        String string = sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.toString();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0086 A[DONT_INVERT, PHI: r11
  0x0086: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x003a, B:19:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0088 A[LOOP:0: B:5:0x0029->B:21:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x008d A[SYNTHETIC] */
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, int i, Function2<? super K, ? super Long, ? extends CharSequence> function2) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        StringBuilder sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(charSequence, "postfix", function2, "transform", prefix);
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(charSequence);
            break;
        }
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            long j = jArr2[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((j & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        Object obj = objArr[i6];
                        long j2 = jArr[i6];
                        if (i3 == i) {
                            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i3 != 0) {
                            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(separator);
                        }
                        sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(function2.invoke(obj, Long.valueOf(j2)));
                        i3++;
                    }
                    j >>= 8;
                }
                if (i4 == 8) {
                    if (i2 == length) {
                        i2++;
                    }
                }
                sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(charSequence);
                break;
            }
            if (i2 == length) {
                sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(charSequence);
                break;
            }
            i2++;
        }
        String string = sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.toString();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0085 A[DONT_INVERT, PHI: r11
  0x0085: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x003a, B:19:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0087 A[LOOP:0: B:5:0x0029->B:21:0x0087, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x008c A[SYNTHETIC] */
    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, Function2<? super K, ? super Long, ? extends CharSequence> function2) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(prefix, "prefix");
        StringBuilder sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(charSequence, "postfix", function2, "transform", prefix);
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(charSequence);
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((j & 255) < 128) {
                        int i5 = (i << 3) + i4;
                        Object obj = objArr[i5];
                        long j2 = jArr[i5];
                        if (i2 == -1) {
                            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(separator);
                        }
                        sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(function2.invoke(obj, Long.valueOf(j2)));
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

    /* JADX WARN: Code duplicated, block: B:20:0x0079 A[DONT_INVERT, PHI: r10
  0x0079: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0030, B:19:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x007b A[LOOP:0: B:5:0x0022->B:21:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x007e A[SYNTHETIC] */
    public final String joinToString(CharSequence separator, CharSequence charSequence, Function2<? super K, ? super Long, ? extends CharSequence> function2) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        StringBuilder sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(charSequence, "prefix", function2, "transform", charSequence);
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append((CharSequence) "");
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((j & 255) < 128) {
                        int i5 = (i << 3) + i4;
                        Object obj = objArr[i5];
                        long j2 = jArr[i5];
                        if (i2 == -1) {
                            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(separator);
                        }
                        sbO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.append(function2.invoke(obj, Long.valueOf(j2)));
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

    /* JADX WARN: Code duplicated, block: B:20:0x0080 A[DONT_INVERT, PHI: r11
  0x0080: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0035, B:19:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0082 A[LOOP:0: B:5:0x0024->B:21:0x0082, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0087 A[SYNTHETIC] */
    public final String joinToString(CharSequence separator, Function2<? super K, ? super Long, ? extends CharSequence> transform) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(separator, "separator");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "");
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((j & 255) < 128) {
                        int i5 = (i << 3) + i4;
                        Object obj = objArr[i5];
                        long j2 = jArr[i5];
                        if (i2 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append(separator);
                        }
                        sb.append(transform.invoke(obj, Long.valueOf(j2)));
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

    /* JADX WARN: Code duplicated, block: B:20:0x0076 A[DONT_INVERT, PHI: r10
  0x0076: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x002b, B:19:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[LOOP:0: B:5:0x001d->B:21:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x007b A[SYNTHETIC] */
    public final String joinToString(Function2<? super K, ? super Long, ? extends CharSequence> transform) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "");
            break;
        }
        int i = 0;
        int i2 = 0;
        loop0: while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((j & 255) < 128) {
                        int i5 = (i << 3) + i4;
                        Object obj = objArr[i5];
                        long j2 = jArr[i5];
                        if (i2 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i2 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append(transform.invoke(obj, Long.valueOf(j2)));
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
