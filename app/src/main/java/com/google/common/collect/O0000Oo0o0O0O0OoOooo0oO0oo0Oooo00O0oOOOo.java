package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo extends O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 {

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public transient int[] f3471O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public transient int[] f3472O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public transient int f3473O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public transient int f3474O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    public O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo() {
    }

    public static <E> O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo create() {
        return new O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo();
    }

    public static <E> O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo createWithExpectedSize(int i) {
        return new O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo(i);
    }

    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(int i, int i2) {
        if (i == -2) {
            this.f3473O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = i2;
        } else {
            int[] iArr = this.f3472O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
            Objects.requireNonNull(iArr);
            iArr[i] = i2 + 1;
        }
        if (i2 == -2) {
            this.f3474O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = i;
            return;
        }
        int[] iArr2 = this.f3471O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        Objects.requireNonNull(iArr2);
        iArr2[i2] = i + 1;
    }

    @Override // com.google.common.collect.O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0
    public int adjustAfterRemove(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    @Override // com.google.common.collect.O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0
    public int allocArrays() {
        int iAllocArrays = super.allocArrays();
        this.f3471O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new int[iAllocArrays];
        this.f3472O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new int[iAllocArrays];
        return iAllocArrays;
    }

    @Override // com.google.common.collect.O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        this.f3473O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = -2;
        this.f3474O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = -2;
        int[] iArr = this.f3471O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        if (iArr != null && this.f3472O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.f3472O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, 0, size(), 0);
        }
        super.clear();
    }

    @Override // com.google.common.collect.O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0
    @CanIgnoreReturnValue
    public Set<Object> convertToHashFloodingResistantImplementation() {
        Set<Object> setConvertToHashFloodingResistantImplementation = super.convertToHashFloodingResistantImplementation();
        this.f3471O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
        this.f3472O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = null;
        return setConvertToHashFloodingResistantImplementation;
    }

    @Override // com.google.common.collect.O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0
    public int firstEntryIndex() {
        return this.f3473O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    @Override // com.google.common.collect.O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0
    public int getSuccessor(int i) {
        int[] iArr = this.f3472O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        Objects.requireNonNull(iArr);
        return iArr[i] - 1;
    }

    @Override // com.google.common.collect.O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0
    public void init(int i) {
        super.init(i);
        this.f3473O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = -2;
        this.f3474O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = -2;
    }

    @Override // com.google.common.collect.O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0
    public void insertEntry(int i, Object obj, int i2, int i3) {
        super.insertEntry(i, obj, i2, i3);
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this.f3474O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, i);
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, -2);
    }

    @Override // com.google.common.collect.O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0
    public void moveLastEntry(int i, int i2) {
        int size = size() - 1;
        super.moveLastEntry(i, i2);
        int[] iArr = this.f3471O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        Objects.requireNonNull(iArr);
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(iArr[i] - 1, getSuccessor(i));
        if (i < size) {
            int[] iArr2 = this.f3471O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            Objects.requireNonNull(iArr2);
            O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(iArr2[size] - 1, i);
            O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, getSuccessor(size));
        }
        int[] iArr3 = this.f3471O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        Objects.requireNonNull(iArr3);
        iArr3[size] = 0;
        int[] iArr4 = this.f3472O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        Objects.requireNonNull(iArr4);
        iArr4[size] = 0;
    }

    @Override // com.google.common.collect.O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0
    public void resizeEntries(int i) {
        super.resizeEntries(i);
        int[] iArr = this.f3471O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        Objects.requireNonNull(iArr);
        this.f3471O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = Arrays.copyOf(iArr, i);
        int[] iArr2 = this.f3472O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        Objects.requireNonNull(iArr2);
        this.f3472O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = Arrays.copyOf(iArr2, i);
    }

    @Override // com.google.common.collect.O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        int size = size();
        int i = 0;
        if (tArr.length < size) {
            if (tArr.length != 0) {
                tArr = (T[]) Arrays.copyOf(tArr, 0);
            }
            tArr = (T[]) Arrays.copyOf(tArr, size);
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            tArr[i] = it.next();
            i++;
        }
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    public O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo(int i) {
        super(i);
    }

    public static <E> O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo create(Collection<? extends E> collection) {
        O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo o0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOoCreateWithExpectedSize = createWithExpectedSize(collection.size());
        o0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOoCreateWithExpectedSize.addAll(collection);
        return o0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOoCreateWithExpectedSize;
    }

    @SafeVarargs
    public static <E> O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo create(E... eArr) {
        O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo o0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOoCreateWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(o0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOoCreateWithExpectedSize, eArr);
        return o0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOoCreateWithExpectedSize;
    }

    @Override // com.google.common.collect.O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }
}
