package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OoO00o000OoOOoO0oO0oo0o0OoOoO0OoOo0O extends O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo {
    public O000OoO00o000OoOOoO0oO0oo0o0OoOoO0OoOo0O(int i) {
        super(i);
    }

    public static <E> O000OoO00o000OoOOoO0oO0oo0o0OoOoO0OoOo0O create() {
        return create(3);
    }

    @Override // com.google.common.collect.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean contains(@CheckForNull Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0, com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0, com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo
    public O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO newBackingMap(int i) {
        return new O000oOOOOOo000O00o0O0OO00o0OoO0OOooOOOoO(i);
    }

    public static <E> O000OoO00o000OoOOoO0oO0oo0o0OoOoO0OoOo0O create(int i) {
        return new O000OoO00o000OoOOoO0oO0oo0o0OoOoO0OoOo0O(i);
    }

    public static <E> O000OoO00o000OoOOoO0oO0oo0o0OoOoO0OoOo0O create(Iterable<? extends E> iterable) {
        O000OoO00o000OoOOoO0oO0oo0o0OoOoO0OoOo0O o000OoO00o000OoOOoO0oO0oo0o0OoOoO0OoOo0OCreate = create(iterable instanceof O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o ? ((O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o) iterable).elementSet().size() : 11);
        if (iterable instanceof Collection) {
            o000OoO00o000OoOOoO0oO0oo0o0OoOoO0OoOo0OCreate.addAll((Collection) iterable);
        } else {
            iterable.getClass();
            O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000OoO00o000OoOOoO0oO0oo0o0OoOoO0OoOo0OCreate, iterable.iterator());
        }
        return o000OoO00o000OoOOoO0oO0oo0o0OoOoO0OoOo0OCreate;
    }
}
