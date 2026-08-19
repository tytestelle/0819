package com.google.common.collect;

import java.util.Iterator;
import java.util.ListIterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o extends O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final transient O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O f3496O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O) {
        this.f3496O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return this.f3496O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.contains(obj);
    }

    @Override // java.util.List
    public Object get(int i) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, size());
        return this.f3496O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.get((size() - 1) - i);
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, java.util.List
    public int indexOf(@CheckForNull Object obj) {
        int iLastIndexOf = this.f3496O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return this.f3496O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.isPartialView();
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, java.util.List
    public int lastIndexOf(@CheckForNull Object obj) {
        int iIndexOf = this.f3496O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.indexOf(obj);
        if (iIndexOf >= 0) {
            return (size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O
    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O reverse() {
        return this.f3496O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f3496O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.size();
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return super.listIterator(i);
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, java.util.List
    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O subList(int i, int i2) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(i, i2, size());
        return this.f3496O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.subList(size() - i2, size() - i).reverse();
    }
}
