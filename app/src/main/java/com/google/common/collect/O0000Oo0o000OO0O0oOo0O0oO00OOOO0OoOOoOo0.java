package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 extends O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo {

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public transient int f3469O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public transient int f3470O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
    private final boolean accessOrder;

    @CheckForNull
    transient long[] links;

    public O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0() {
        this(3);
    }

    public static <K, V> O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 create() {
        return new O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0();
    }

    public static <K, V> O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 createWithExpectedSize(int i) {
        return new O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0(i);
    }

    public final long[] O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() {
        long[] jArr = this.links;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    public final void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(int i, int i2) {
        if (i == -2) {
            this.f3469O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = i2;
        } else {
            O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo()[i] = (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo()[i] & (-4294967296L)) | (((long) (i2 + 1)) & 4294967295L);
        }
        if (i2 == -2) {
            this.f3470O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = i;
        } else {
            O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo()[i2] = (4294967295L & O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo()[i2]) | (((long) (i + 1)) << 32);
        }
    }

    @Override // com.google.common.collect.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo
    public void accessEntry(int i) {
        if (this.accessOrder) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(((int) (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo()[i] >>> 32)) - 1, getSuccessor(i));
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this.f3470O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, i);
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(i, -2);
            incrementModCount();
        }
    }

    @Override // com.google.common.collect.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo
    public int adjustAfterRemove(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    @Override // com.google.common.collect.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo
    public int allocArrays() {
        int iAllocArrays = super.allocArrays();
        this.links = new long[iAllocArrays];
        return iAllocArrays;
    }

    @Override // com.google.common.collect.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        this.f3469O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = -2;
        this.f3470O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = -2;
        long[] jArr = this.links;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // com.google.common.collect.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo
    @CanIgnoreReturnValue
    public Map<Object, Object> convertToHashFloodingResistantImplementation() {
        Map<Object, Object> mapConvertToHashFloodingResistantImplementation = super.convertToHashFloodingResistantImplementation();
        this.links = null;
        return mapConvertToHashFloodingResistantImplementation;
    }

    @Override // com.google.common.collect.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo
    public Map<Object, Object> createHashFloodingResistantDelegate(int i) {
        return new LinkedHashMap(i, 1.0f, this.accessOrder);
    }

    @Override // com.google.common.collect.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo
    public int firstEntryIndex() {
        return this.f3469O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
    }

    @Override // com.google.common.collect.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo
    public int getSuccessor(int i) {
        return ((int) O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo()[i]) - 1;
    }

    @Override // com.google.common.collect.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo
    public void init(int i) {
        super.init(i);
        this.f3469O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = -2;
        this.f3470O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = -2;
    }

    @Override // com.google.common.collect.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo
    public void insertEntry(int i, Object obj, Object obj2, int i2, int i3) {
        super.insertEntry(i, obj, obj2, i2, i3);
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this.f3470O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, i);
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(i, -2);
    }

    @Override // com.google.common.collect.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo
    public void moveLastEntry(int i, int i2) {
        int size = size() - 1;
        super.moveLastEntry(i, i2);
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(((int) (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo()[i] >>> 32)) - 1, getSuccessor(i));
        if (i < size) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(((int) (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo()[size] >>> 32)) - 1, i);
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(i, getSuccessor(size));
        }
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo()[size] = 0;
    }

    @Override // com.google.common.collect.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo
    public void resizeEntries(int i) {
        super.resizeEntries(i);
        this.links = Arrays.copyOf(O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(), i);
    }

    public O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0(int i) {
        this(i, false);
    }

    public O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0(int i, boolean z) {
        super(i);
        this.accessOrder = z;
    }
}
