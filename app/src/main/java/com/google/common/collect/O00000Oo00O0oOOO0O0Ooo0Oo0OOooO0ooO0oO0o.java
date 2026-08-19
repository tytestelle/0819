package com.google.common.collect;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o extends O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 implements NavigableSet {

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final /* synthetic */ O000oO0000o0o00Ooo0OOOO00oo0O0OOO0ooOoOO f3402O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(O000oO0000o0o00Ooo0OOOO00oo0O0OOO0ooOoOO o000oO0000o0o00Ooo0OOOO00oo0O0OOO0ooOoOO, Object obj, NavigableSet navigableSet, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
        super(o000oO0000o0o00Ooo0OOOO00oo0O0OOO0ooOoOO, obj, navigableSet, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
        this.f3402O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000oO0000o0o00Ooo0OOOO00oo0O0OOO0ooOoOO;
    }

    @Override // com.google.common.collect.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: merged with bridge method [inline-methods] */
    public final NavigableSet O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        return (NavigableSet) ((SortedSet) this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
    }

    public final O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(NavigableSet navigableSet) {
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f3397O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 == null) {
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this;
        }
        return new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(this.f3402O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, this.f3395O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, navigableSet, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().ceiling(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().descendingSet());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().floor(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().headSet(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().higher(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().lower(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().subSet(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().tailSet(obj, z));
    }
}
