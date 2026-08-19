package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO extends AbstractMap implements ConcurrentMap, Serializable {
    static final int CONTAINS_VALUE_RETRIES = 3;
    static final int DRAIN_MAX = 16;
    static final int DRAIN_THRESHOLD = 63;
    static final int MAXIMUM_CAPACITY = 1073741824;
    static final int MAX_SEGMENTS = 65536;
    static final O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO UNSET_WEAK_VALUE_REFERENCE = new O000OooO0oOoooOOoooo0oo00oo0Oo0OOooOOo0o();
    private static final long serialVersionUID = 5;
    final int concurrencyLevel;
    final transient O000Ooooo00ooOooo0ooooO0OoOoOOo000OO0OoO entryHelper;

    @CheckForNull
    @LazyInit
    transient Set<Map.Entry<Object, Object>> entrySet;
    final com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO keyEquivalence;

    @CheckForNull
    @LazyInit
    transient Set<Object> keySet;
    final transient int segmentMask;
    final transient int segmentShift;
    final transient O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00[] segments;

    @CheckForNull
    @LazyInit
    transient Collection<Object> values;

    public O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO(O000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo, O000Ooooo00ooOooo0ooooO0OoOoOOo000OO0OoO o000Ooooo00ooOooo0ooooO0OoOoOOo000OO0OoO) {
        int i = o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.f3575O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        this.concurrencyLevel = Math.min(i == -1 ? 4 : i, 65536);
        this.keyEquivalence = (com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.f3578O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().defaultEquivalence());
        this.entryHelper = o000Ooooo00ooOooo0ooooO0OoOoOOo000OO0OoO;
        int i2 = o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.f3574O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int iMin = Math.min(i2 == -1 ? 16 : i2, 1073741824);
        int i3 = 1;
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        while (i5 < this.concurrencyLevel) {
            i6++;
            i5 <<= 1;
        }
        this.segmentShift = 32 - i6;
        this.segmentMask = i5 - 1;
        this.segments = newSegmentArray(i5);
        int i7 = iMin / i5;
        while (i3 < (i5 * i7 < iMin ? i7 + 1 : i7)) {
            i3 <<= 1;
        }
        while (true) {
            O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00[] o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00Arr = this.segments;
            if (i4 >= o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00Arr.length) {
                return;
            }
            o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00Arr[i4] = createSegment(i3);
            i4++;
        }
    }

    public static <K, V> O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO create(O000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo) {
        O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO = O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO.STRONG;
        if (o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO && o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() == o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO) {
            return new O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO(o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo, O000o000o0Oo0OoO00o000O0oOO0oo0O0OO0O0OO.f3595O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        }
        if (o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() == o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO && o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() == O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO.WEAK) {
            return new O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO(o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo, O000o000o0Oo0OoO00o000O0oOO0oo0O0OO0O0OO.f3596O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        }
        O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO2 = O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO.WEAK;
        if (o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 == o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO2 && o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() == o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO) {
            return new O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO(o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo, O000o000o0Oo0OoO00o000O0oOO0oo0O0OO0O0OO.f3598O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
        }
        if (o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() == o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO2 && o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() == o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO2) {
            return new O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO(o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo, O000o000o0Oo0OoO00o000O0oOO0oo0O0OO0O0OO.f3599O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        }
        throw new AssertionError();
    }

    public static <K> O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO createWithDummyValues(O000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo) {
        O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO = O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO.STRONG;
        if (o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO && o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() == o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO) {
            return new O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO(o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo, O000o000o0Oo0OoO00o000O0oOO0oo0O0OO0O0OO.f3594O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
        O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO2 = O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO.WEAK;
        if (o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 == o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO2 && o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() == o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO) {
            return new O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO(o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo, O000o000o0Oo0OoO00o000O0oOO0oo0O0OO0O0OO.f3597O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        }
        if (o000Ooo0ooooo00o000oooo0oO00ooo0OoooOOOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() == o000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO2) {
            throw new IllegalArgumentException("Map cannot have both weak and dummy values");
        }
        throw new AssertionError();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    public static int rehash(int i) {
        int i2 = i + ((i << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = (i5 << 2) + (i5 << 14) + i5;
        return (i6 >>> 16) ^ i6;
    }

    public static <K, V, E extends O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000> O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO unsetWeakValueReference() {
        return UNSET_WEAK_VALUE_REFERENCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00 o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00 : this.segments) {
            o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).containsKey(obj, iHash);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00[] o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00Arr = this.segments;
        long j = -1;
        int i = 0;
        while (i < 3) {
            long j2 = 0;
            for (O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00 o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00 : o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00Arr) {
                int i2 = o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00.count;
                AtomicReferenceArray<O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000> atomicReferenceArray = o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00.table;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                    for (O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = atomicReferenceArray.get(i3); o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null; o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                        Object liveValue = o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00.getLiveValue(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                        if (liveValue != null && valueEquivalence().equivalent(obj, liveValue)) {
                            return true;
                        }
                    }
                }
                j2 += (long) o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00.modCount;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
        }
        return false;
    }

    public O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 copyEntry(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo001) {
        return segmentFor(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o()).copyEntry(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo001);
    }

    public O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00 createSegment(int i) {
        return this.entryHelper.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        Set<Map.Entry<Object, Object>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        O000OooOoooo0O0OO0oo0000o0OOO00OO00oo0O0 o000OooOoooo0O0OO0oo0000o0OOO00OO00oo0O0 = new O000OooOoooo0O0OO0oo0000o0OOO00OO00oo0O0(this, 0);
        this.entrySet = o000OooOoooo0O0OO0oo0000o0OOO00OO00oo0O0;
        return o000OooOoooo0O0OO0oo0000o0OOO00OO00oo0O0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public Object get(@CheckForNull Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).get(obj, iHash);
    }

    @CheckForNull
    public O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 getEntry(@CheckForNull Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).getEntry(obj, iHash);
    }

    @CheckForNull
    public Object getLiveValue(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) {
        if (o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000.getKey() == null) {
            return null;
        }
        return o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000.getValue();
    }

    public int hash(Object obj) {
        return rehash(this.keyEquivalence.hash(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00[] o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00Arr = this.segments;
        long j = 0;
        for (int i = 0; i < o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00Arr.length; i++) {
            if (o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00Arr[i].count != 0) {
                return false;
            }
            j += (long) o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00Arr[i].modCount;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00Arr.length; i2++) {
            if (o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00Arr[i2].count != 0) {
                return false;
            }
            j -= (long) o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00Arr[i2].modCount;
        }
        return j == 0;
    }

    public boolean isLiveForTesting(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) {
        return segmentFor(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o()).getLiveValueForTesting(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Object> keySet() {
        Set<Object> set = this.keySet;
        if (set != null) {
            return set;
        }
        O000OooOoooo0O0OO0oo0000o0OOO00OO00oo0O0 o000OooOoooo0O0OO0oo0000o0OOO00OO00oo0O0 = new O000OooOoooo0O0OO0oo0000o0OOO00OO00oo0O0(this, 1);
        this.keySet = o000OooOoooo0O0OO0oo0000o0OOO00OO00oo0O0;
        return o000OooOoooo0O0OO0oo0000o0OOO00OO00oo0O0;
    }

    public O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO keyStrength() {
        return this.entryHelper.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
    }

    public final O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00[] newSegmentArray(int i) {
        return new O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iHash = hash(obj);
        return segmentFor(iHash).put(obj, iHash, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<Object, Object> map) {
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    @CheckForNull
    public Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iHash = hash(obj);
        return segmentFor(iHash).put(obj, iHash, obj2, true);
    }

    public void reclaimKey(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) {
        int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        segmentFor(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).reclaimKey(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
    }

    public void reclaimValue(O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO o000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO) {
        O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        segmentFor(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).reclaimValue(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getKey(), iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public Object remove(@CheckForNull Object obj) {
        if (obj == null) {
            return null;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).remove(obj, iHash);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    @CheckForNull
    public Object replace(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iHash = hash(obj);
        return segmentFor(iHash).replace(obj, iHash, obj2);
    }

    public O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00 segmentFor(int i) {
        return this.segments[(i >>> this.segmentShift) & this.segmentMask];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j = 0;
        for (O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00 o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00 : this.segments) {
            j += (long) o000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00.count;
        }
        return com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOO00O00o0ooooooooO000ooooO0000(j);
    }

    public com.google.common.base.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO valueEquivalence() {
        return this.entryHelper.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().defaultEquivalence();
    }

    public O000o000o00oOoO00o0oO00oOo0o0OOOO00oOoOO valueStrength() {
        return this.entryHelper.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<Object> values() {
        Collection<Object> collection = this.values;
        if (collection != null) {
            return collection;
        }
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = new O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo(this, 1);
        this.values = o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
        return o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
    }

    public Object writeReplace() {
        return new O000OoooooOoOOooOoo0ooOooOOooooOoO0O0OO0(this.entryHelper.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(), this.entryHelper.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(), this.keyEquivalence, this.entryHelper.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().defaultEquivalence(), this.concurrencyLevel, this);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).remove(obj, iHash, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public boolean replace(Object obj, @CheckForNull Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        if (obj2 == null) {
            return false;
        }
        int iHash = hash(obj);
        return segmentFor(iHash).replace(obj, iHash, obj2, obj3);
    }
}
