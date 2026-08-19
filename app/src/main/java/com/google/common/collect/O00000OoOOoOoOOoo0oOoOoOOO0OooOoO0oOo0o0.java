package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public class O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 extends O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 implements SortedSet {

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final /* synthetic */ O000oO0000o0o00Ooo0OOOO00oo0O0OOO0ooOoOO f3404O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(O000oO0000o0o00Ooo0OOOO00oo0O0OOO0ooOoOO o000oO0000o0o00Ooo0OOOO00oo0O0OOO0ooOoOO, Object obj, SortedSet sortedSet, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
        super(o000oO0000o0o00Ooo0OOOO00oo0O0OOO0ooOoOO, obj, sortedSet, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
        this.f3404O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000oO0000o0o00Ooo0OOOO00oo0O0OOO0ooOoOO;
    }

    public SortedSet O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        return (SortedSet) this.f3396O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().first();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        SortedSet sortedSetHeadSet = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().headSet(obj);
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f3397O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 == null) {
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this;
        }
        return new O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(this.f3404O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, this.f3395O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, sortedSetHeadSet, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().last();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        SortedSet sortedSetSubSet = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().subSet(obj, obj2);
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f3397O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 == null) {
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this;
        }
        return new O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(this.f3404O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, this.f3395O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, sortedSetSubSet, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        SortedSet sortedSetTailSet = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().tailSet(obj);
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f3397O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 == null) {
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this;
        }
        return new O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(this.f3404O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, this.f3395O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, sortedSetTailSet, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
    }
}
