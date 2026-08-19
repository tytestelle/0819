package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo extends O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o implements Serializable {
    private static final long serialVersionUID = 0;
    final transient O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o map;
    final transient int size;

    public O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo(O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o, int i) {
        this.map = o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
        this.size = i;
    }

    public static <K, V> O000O0o0Oooo0ooOO0O0OooooOO0O0o0ooooo0o0 builder() {
        return new O000O0o0Oooo0ooOO0O0OooooOO0O0o0ooooo0o0();
    }

    public static <K, V> O000O0o0Oooo0ooOO0O0OooooOO0O0o0ooooo0o0 builderWithExpectedKeys(int i) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, "expectedKeys");
        return new O000O0o0Oooo0ooOO0O0OooooOO0O0o0ooooo0o0(i);
    }

    public static <K, V> O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo copyOf(O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00 o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00) {
        if (o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00 instanceof O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo) {
            O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo o000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo = (O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo) o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00;
            if (!o000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo.isPartialView()) {
                return o000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo;
            }
        }
        return O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.copyOf(o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00);
    }

    public static <K, V> O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo of() {
        return O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.of();
    }

    @Override // com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public /* bridge */ /* synthetic */ boolean containsEntry(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public boolean containsKey(@CheckForNull Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO
    public boolean containsValue(@CheckForNull Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO
    public Map<Object, Collection<Object>> createAsMap() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO
    public Set<Object> createKeySet() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public abstract O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo get(Object obj);

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public abstract O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo inverse();

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public boolean isPartialView() {
        return this.map.isPartialView();
    }

    @Override // com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean putAll(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    /* JADX INFO: renamed from: replaceValues, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Collection mo740replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static <K, V> O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo of(K k, V v) {
        return O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.of((Object) k, (Object) v);
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o asMap() {
        return this.map;
    }

    /* JADX INFO: renamed from: createEntries, reason: merged with bridge method [inline-methods] */
    public O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo m736createEntries() {
        return new O000O0o0o0OoOOooooOoO0Ooo00OOooooOooOO0O(this);
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO
    public O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 createKeys() {
        return new O000O0oO0oO0OoOo0oooOOO000O0oooo0000O0oo(this);
    }

    /* JADX INFO: renamed from: createValues, reason: merged with bridge method [inline-methods] */
    public O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo m737createValues() {
        return new O000O0oo00ooOo0oOoO000oo0OO0oOo0oO00ooo0(this);
    }

    @Override // com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo entries() {
        Collection collectionM736createEntries = this.f3416O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (collectionM736createEntries == null) {
            collectionM736createEntries = m736createEntries();
            this.f3416O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = collectionM736createEntries;
        }
        return (O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo) collectionM736createEntries;
    }

    /* JADX INFO: renamed from: entryIterator, reason: merged with bridge method [inline-methods] */
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo m738entryIterator() {
        return new O000O0OoooOoO0oo0o0o0oOo00oo0o0OoOOooOoO(this);
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 keySet() {
        return this.map.keySet();
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO
    public O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0 keys() {
        return (O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0) super.keys();
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean putAll(O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00 o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00) {
        throw new UnsupportedOperationException();
    }

    @Override // 
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    /* JADX INFO: renamed from: removeAll */
    public O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo mo739removeAll(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo replaceValues(Object obj, Iterable<Object> iterable) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: valueIterator, reason: merged with bridge method [inline-methods] */
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo m741valueIterator() {
        return new O000O0o0OOoo00OoO00O00OooOo0oOO00oO0OOOO(this);
    }

    @Override // com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo values() {
        Collection collectionM737createValues = this.f3419O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (collectionM737createValues == null) {
            collectionM737createValues = m737createValues();
            this.f3419O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = collectionM737createValues;
        }
        return (O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo) collectionM737createValues;
    }

    public static <K, V> O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo of(K k, V v, K k2, V v2) {
        return O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.of((Object) k, (Object) v, (Object) k2, (Object) v2);
    }

    public static <K, V> O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo of(K k, V v, K k2, V v2, K k3, V v3) {
        return O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.of((Object) k, (Object) v, (Object) k2, (Object) v2, (Object) k3, (Object) v3);
    }

    public static <K, V> O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.copyOf((Iterable) iterable);
    }

    public static <K, V> O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.of((Object) k, (Object) v, (Object) k2, (Object) v2, (Object) k3, (Object) v3, (Object) k4, (Object) v4);
    }

    public static <K, V> O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.of((Object) k, (Object) v, (Object) k2, (Object) v2, (Object) k3, (Object) v3, (Object) k4, (Object) v4, (Object) k5, (Object) v5);
    }
}
