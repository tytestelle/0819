package com.google.common.collect;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OoOo000OO000O0OOOOOOo0oO0O0oO00ooOOo extends O00O0000oOoO0o0oO00oOoOO0o0oo0OO0OoO0o0O implements ListIterator {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ int f3570O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ AbstractList f3571O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O000OoOo000OO000O0OOOOOOo0oO0O0oO00ooOOo(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.f3570O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
        this.f3571O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = abstractList;
    }

    @Override // com.google.common.collect.O00O0000oOoO0o0oO00oOoOO0o0oo0OO0OoO0o0O
    public final Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj) {
        switch (this.f3570O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            case 0:
                return ((O000OoOo0ooOoo0o0OO0oooooOOOO0OOoo0O0OOO) this.f3571O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).function.apply(obj);
            default:
                return ((O000Ooo0Oo00oOoo0000oOO00OoOoOO0OOOoO0O0) this.f3571O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).function.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f3682O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f3682O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(((ListIterator) this.f3682O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f3682O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
