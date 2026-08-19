package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000ooOoOOoO0O00OO0oO0O0oO0O0o0O00O00Oo0 extends O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo implements Serializable {
    private static final long serialVersionUID = 0;
    final O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo forwardOrder;

    public O000ooOoOOoO0O00OO0oO0O0oO0O0o0O00O00Oo0(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo) {
        o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.getClass();
        this.forwardOrder = o000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.forwardOrder.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof O000ooOoOOoO0O00OO0oO0O0oO0O0o0O00O00Oo0) {
            return this.forwardOrder.equals(((O000ooOoOOoO0O00OO0oO0O0oO0O0o0O00O00Oo0) obj).forwardOrder);
        }
        return false;
    }

    public int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <E> E max(E e, E e2) {
        return (E) this.forwardOrder.min(e, e2);
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <E> E min(E e, E e2) {
        return (E) this.forwardOrder.max(e, e2);
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <S> O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo reverse() {
        return this.forwardOrder;
    }

    public String toString() {
        return this.forwardOrder + ".reverse()";
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <E> E max(E e, E e2, E e3, E... eArr) {
        return (E) this.forwardOrder.min(e, e2, e3, eArr);
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <E> E min(E e, E e2, E e3, E... eArr) {
        return (E) this.forwardOrder.max(e, e2, e3, eArr);
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <E> E max(Iterator<E> it) {
        return (E) this.forwardOrder.min(it);
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <E> E min(Iterator<E> it) {
        return (E) this.forwardOrder.max(it);
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <E> E max(Iterable<E> iterable) {
        return (E) this.forwardOrder.min(iterable);
    }

    @Override // com.google.common.collect.O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo
    public <E> E min(Iterable<E> iterable) {
        return (E) this.forwardOrder.max(iterable);
    }
}
