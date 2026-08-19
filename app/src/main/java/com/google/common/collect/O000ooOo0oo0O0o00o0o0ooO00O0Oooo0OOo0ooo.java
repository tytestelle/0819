package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class O000ooOo0oo0O0o00o0o0ooO00O0Oooo0OOo0ooo extends O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo implements Serializable {
    static final O000ooOo0oo0O0o00o0o0ooO00O0Oooo0OOo0ooo INSTANCE = new O000ooOo0oo0O0o00o0o0ooO00O0Oooo0OOo0ooo();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <S extends Comparable<?>> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo reverse() {
        return O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural();
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // java.util.Comparator
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <E extends Comparable<?>> E max(E e, E e2) {
        return (E) O000oO0ooOooo00OOoOOoOOoOoO00Ooo00Oo0Oo0.INSTANCE.min(e, e2);
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <E extends Comparable<?>> E min(E e, E e2) {
        return (E) O000oO0ooOooo00OOoOOoOOoOoO00Ooo00Oo0Oo0.INSTANCE.max(e, e2);
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <E extends Comparable<?>> E max(E e, E e2, E e3, E... eArr) {
        return (E) O000oO0ooOooo00OOoOOoOOoOoO00Ooo00Oo0Oo0.INSTANCE.min(e, e2, e3, eArr);
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <E extends Comparable<?>> E min(E e, E e2, E e3, E... eArr) {
        return (E) O000oO0ooOooo00OOoOOoOOoOoO00Ooo00Oo0Oo0.INSTANCE.max(e, e2, e3, eArr);
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <E extends Comparable<?>> E max(Iterator<E> it) {
        return (E) O000oO0ooOooo00OOoOOoOOoOoO00Ooo00Oo0Oo0.INSTANCE.min(it);
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <E extends Comparable<?>> E min(Iterator<E> it) {
        return (E) O000oO0ooOooo00OOoOOoOOoOoO00Ooo00Oo0Oo0.INSTANCE.max(it);
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <E extends Comparable<?>> E max(Iterable<E> iterable) {
        return (E) O000oO0ooOooo00OOoOOoOOoOoO00Ooo00Oo0Oo0.INSTANCE.min(iterable);
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <E extends Comparable<?>> E min(Iterable<E> iterable) {
        return (E) O000oO0ooOooo00OOoOOoOOoOoO00Ooo00Oo0Oo0.INSTANCE.max(iterable);
    }
}
