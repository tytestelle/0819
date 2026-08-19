package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OO0o0o0oooo00oooOoOooo0O0o0oOo00000O extends O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public transient Integer f3534O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    private final O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O domain;
    final /* synthetic */ O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O000OO0o0o0oooo00oooOoOooo0O0o0oOo00000O(O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o, O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O) {
        super(O000oOOoo0O00000oo0OOOO00o0o0OOo0oooO0Oo.natural());
        this.this$0 = o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o;
        this.domain = o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.this$0.contains((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 createDescendingSet() {
        return new O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo(this);
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public int indexOf(@CheckForNull Object obj) {
        if (!contains(obj)) {
            return -1;
        }
        Objects.requireNonNull(obj);
        Comparable comparable = (Comparable) obj;
        O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo it = this.this$0.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.iterator();
        long size = 0;
        while (it.hasNext()) {
            O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 = (O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) it.next();
            if (o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.contains(comparable)) {
                return com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOO00O00o0ooooooooO000ooooO0000(size + ((long) O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.create(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0, this.domain).indexOf(comparable)));
            }
            size += (long) O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.create(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0, this.domain).size();
        }
        throw new AssertionError("impossible");
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return this.this$0.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isPartialView();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Integer numValueOf = this.f3534O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (numValueOf == null) {
            O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo it = this.this$0.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.iterator();
            long size = 0;
            while (it.hasNext()) {
                size += (long) O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.create((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) it.next(), this.domain).size();
                if (size >= 2147483647L) {
                    break;
                }
            }
            numValueOf = Integer.valueOf(com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOO00O00o0ooooooooO000ooooO0000(size));
            this.f3534O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = numValueOf;
        }
        return numValueOf.intValue();
    }

    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 subSet(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        return this.this$0.m743subRangeSet(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0).asSet(this.domain);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return this.this$0.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.toString();
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return new O000OO0oOOoOO0OooOoOo00OoOOoOOoOOo0o00OO(this.this$0.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, this.domain);
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo descendingIterator() {
        return new O000OO0o00oO00o0OOOooOOOOooo00OO00o00O00(this, 1);
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 headSetImpl(Comparable comparable, boolean z) {
        return subSet(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upTo(comparable, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.forBoolean(z)));
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0, com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo iterator() {
        return new O000OO0o00oO00o0OOOooOOOOooo00OO00o00O00(this, 0);
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 subSetImpl(Comparable comparable, boolean z, Comparable comparable2, boolean z2) {
        return (z || z2 || O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.compareOrThrow(comparable, comparable2) != 0) ? subSet(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.range(comparable, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.forBoolean(z), comparable2, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.forBoolean(z2))) : O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0.of();
    }

    @Override // com.google.common.collect.O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 tailSetImpl(Comparable comparable, boolean z) {
        return subSet(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.downTo(comparable, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.forBoolean(z)));
    }
}
