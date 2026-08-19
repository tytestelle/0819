package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public class O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 extends O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 implements SortedSet {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 f3394O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, SortedMap sortedMap) {
        super(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, sortedMap);
        this.f3394O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
    }

    public SortedMap O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        return (SortedMap) this.f3617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this.f3394O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this.f3394O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this.f3394O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().tailMap(obj));
    }
}
