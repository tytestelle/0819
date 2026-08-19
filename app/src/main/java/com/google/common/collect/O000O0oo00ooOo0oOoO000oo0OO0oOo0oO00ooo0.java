package com.google.common.collect;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000O0oo00ooOo0oOoO000oo0OO0oOo0oO00ooo0 extends O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final transient O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo f3521O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000O0oo00ooOo0oOoO000oo0OO0oOo0oO00ooo0(O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo o000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo) {
        this.f3521O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return this.f3521O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.containsValue(obj);
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public int copyIntoArray(Object[] objArr, int i) {
        O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo it = this.f3521O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.map.values().iterator();
        while (it.hasNext()) {
            i = ((O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo) it.next()).copyIntoArray(objArr, i);
        }
        return i;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f3521O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.size();
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo iterator() {
        return this.f3521O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.m741valueIterator();
    }
}
