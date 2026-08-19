package androidx.collection;

import kotlin.collections.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public final class MutableLongObjectMap<V> extends LongObjectMap<V> {
    private int growthLimit;

    public MutableLongObjectMap() {
        this(0, 1, null);
    }

    private final void adjustStorage() {
        int i = this._capacity;
        if (i > 8) {
            if (Long.compare((((long) this._size) * 32) ^ Long.MIN_VALUE, (((long) i) * 25) ^ Long.MIN_VALUE) <= 0) {
                removeDeletedMarkers();
                return;
            }
        }
        resizeStorage(ScatterMapKt.nextCapacity(this._capacity));
    }

    private final int findAbsoluteInsertIndex(long j) {
        int i = ((int) (j ^ (j >>> 32))) * ScatterMapKt.MurmurHashC1;
        int i2 = (i << 16) ^ i;
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this._capacity;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j2 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j3 = i4;
            int i10 = i7;
            long j4 = j2 ^ (j3 * ScatterMapKt.BitmaskLsb);
            for (long j5 = (~j4) & (j4 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i6) & i5;
                if (this.keys[iNumberOfTrailingZeros] == j) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                }
                this._size++;
                int i11 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i12 = iFindFirstAvailableSlot >> 3;
                long j6 = jArr2[i12];
                int i13 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i11 - (((j6 >> i13) & 255) == 128 ? 1 : 0);
                jArr2[i12] = (j6 & (~(255 << i13))) | (j3 << i13);
                int i14 = this._capacity;
                int i15 = ((iFindFirstAvailableSlot - 7) & i14) + (i14 & 7);
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                jArr2[i16] = ((~(255 << i17)) & jArr2[i16]) | (j3 << i17);
                return iFindFirstAvailableSlot;
            }
            i7 = i10 + 8;
            i6 = (i6 + i7) & i5;
        }
    }

    private final int findFirstAvailableSlot(int i) {
        int i2 = this._capacity;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    private final void initializeMetadata(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((i + 15) & (-8)) >> 3];
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(jArr);
        }
        this.metadata = jArr;
        int i2 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        initializeGrowth();
    }

    private final void initializeStorage(int i) {
        int iMax = i > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(i)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = new long[iMax];
        this.values = new Object[iMax];
    }

    private final void removeDeletedMarkers() {
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 >> 3;
            int i5 = (i3 & 7) << 3;
            if (((jArr[i4] >> i5) & 255) == 254) {
                long[] jArr2 = this.metadata;
                jArr2[i4] = (128 << i5) | (jArr2[i4] & (~(255 << i5)));
                int i6 = this._capacity;
                int i7 = ((i3 - 7) & i6) + (i6 & 7);
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                jArr2[i8] = ((~(255 << i9)) & jArr2[i8]) | (128 << i9);
                i2++;
            }
        }
        this.growthLimit += i2;
    }

    private final void resizeStorage(int i) {
        long[] jArr = this.metadata;
        long[] jArr2 = this.keys;
        Object[] objArr = this.values;
        int i2 = this._capacity;
        initializeStorage(i);
        long[] jArr3 = this.keys;
        Object[] objArr2 = this.values;
        int i3 = 0;
        while (i3 < i2) {
            if (((jArr[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                long j = jArr2[i3];
                int i4 = ((int) ((j >>> 32) ^ j)) * ScatterMapKt.MurmurHashC1;
                int i5 = (i4 << 16) ^ i4;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i5 >>> 7);
                long j2 = i5 & 127;
                long[] jArr4 = this.metadata;
                int i6 = iFindFirstAvailableSlot >> 3;
                int i7 = (iFindFirstAvailableSlot & 7) << 3;
                jArr4[i6] = (jArr4[i6] & (~(255 << i7))) | (j2 << i7);
                int i8 = this._capacity;
                int i9 = ((iFindFirstAvailableSlot - 7) & i8) + (i8 & 7);
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                jArr4[i10] = (jArr4[i10] & (~(255 << i11))) | (j2 << i11);
                jArr3[iFindFirstAvailableSlot] = j;
                objArr2[iFindFirstAvailableSlot] = objArr[i3];
            }
            i3++;
            jArr = jArr;
            jArr2 = jArr2;
        }
    }

    private final void writeMetadata(int i, long j) {
        long[] jArr = this.metadata;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (j << i3);
        int i4 = this._capacity;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (j << i7) | (jArr[i6] & (~(255 << i7)));
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(jArr);
            long[] jArr2 = this.metadata;
            int i = this._capacity;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(this.values, 0, this._capacity);
        initializeGrowth();
    }

    public final V getOrPut(long j, Function0<? extends V> defaultValue) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(defaultValue, "defaultValue");
        V v = get(j);
        if (v != null) {
            return v;
        }
        V vInvoke = defaultValue.invoke();
        set(j, vInvoke);
        return vInvoke;
    }

    public final void minusAssign(long j) {
        remove(j);
    }

    public final void plusAssign(LongObjectMap<V> from) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(from, "from");
        putAll(from);
    }

    public final V put(long j, V v) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(j);
        Object[] objArr = this.values;
        V v2 = (V) objArr[iFindAbsoluteInsertIndex];
        this.keys[iFindAbsoluteInsertIndex] = j;
        objArr[iFindAbsoluteInsertIndex] = v;
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(LongObjectMap<V> from) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(from, "from");
        long[] jArr = from.keys;
        Object[] objArr = from.values;
        long[] jArr2 = from.metadata;
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
                        set(jArr[i4], objArr[i4]);
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

    public final V remove(long j) {
        int iNumberOfTrailingZeros;
        int i = ((int) (j ^ (j >>> 32))) * ScatterMapKt.MurmurHashC1;
        int i2 = (i << 16) ^ i;
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (((long) i3) * ScatterMapKt.BitmaskLsb) ^ j2;
            for (long j4 = (~j3) & (j3 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.keys[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return removeValueAt(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final void removeIf(Function2<? super Long, ? super V, Boolean> predicate) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
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
                        if (predicate.invoke(Long.valueOf(this.keys[i4]), this.values[i4]).booleanValue()) {
                            removeValueAt(i4);
                        }
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

    public final V removeValueAt(int i) {
        this._size--;
        long[] jArr = this.metadata;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        int i4 = this._capacity;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (254 << i7);
        Object[] objArr = this.values;
        V v = (V) objArr[i];
        objArr[i] = null;
        return v;
    }

    public final void set(long j, V v) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(j);
        this.keys[iFindAbsoluteInsertIndex] = j;
        this.values[iFindAbsoluteInsertIndex] = v;
    }

    public final int trim() {
        int i = this._capacity;
        int iNormalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (iNormalizeCapacity >= i) {
            return 0;
        }
        resizeStorage(iNormalizeCapacity);
        return i - this._capacity;
    }

    public /* synthetic */ MutableLongObjectMap(int i, int i2, O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public final void minusAssign(long[] keys) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(keys, "keys");
        for (long j : keys) {
            remove(j);
        }
    }

    public MutableLongObjectMap(int i) {
        super(null);
        if (i >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }

    public final void minusAssign(LongSet keys) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(keys, "keys");
        long[] jArr = keys.elements;
        long[] jArr2 = keys.metadata;
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
                        remove(jArr[(i << 3) + i3]);
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

    public final boolean remove(long j, V v) {
        int iNumberOfTrailingZeros;
        int i = ((int) (j ^ (j >>> 32))) * ScatterMapKt.MurmurHashC1;
        int i2 = (i << 16) ^ i;
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (((long) i3) * ScatterMapKt.BitmaskLsb) ^ j2;
            for (long j4 = (~j3) & (j3 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.keys[iNumberOfTrailingZeros] == j) {
                    break loop0;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        if (iNumberOfTrailingZeros < 0 || !O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.values[iNumberOfTrailingZeros], v)) {
            return false;
        }
        removeValueAt(iNumberOfTrailingZeros);
        return true;
    }

    public final void minusAssign(LongList keys) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(keys, "keys");
        long[] jArr = keys.content;
        int i = keys._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(jArr[i2]);
        }
    }
}
