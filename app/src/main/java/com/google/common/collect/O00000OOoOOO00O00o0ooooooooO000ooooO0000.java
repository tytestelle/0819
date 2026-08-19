package com.google.common.collect;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000OOoOOO00O00o0ooooooooO000ooooO0000 extends O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements ListIterator {

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final /* synthetic */ O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO f3400O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O00000OOoOOO00O00o0ooooooooO000ooooO0000(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) {
        super(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO);
        this.f3400O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
    }

    public final ListIterator O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        return (ListIterator) this.f3382O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = this.f3400O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        boolean zIsEmpty = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.isEmpty();
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().add(obj);
        O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.access$208(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3401O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
        if (zIsEmpty) {
            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O00000OOoOOO00O00o0ooooooooO000ooooO0000(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, int i) {
        super(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, ((List) o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).listIterator(i));
        this.f3400O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
    }
}
