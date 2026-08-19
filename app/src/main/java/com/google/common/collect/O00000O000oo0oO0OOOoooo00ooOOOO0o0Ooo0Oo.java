package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public class O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo extends O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements SortedMap {

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public SortedSet f3392O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final /* synthetic */ O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 f3393O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, SortedMap sortedMap) {
        super(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, sortedMap);
        this.f3393O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
    }

    public SortedSet O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        return new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this.f3393O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo());
    }

    @Override // com.google.common.collect.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f3392O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        this.f3392O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = sortedSetO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        return sortedSetO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    public SortedMap O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        return (SortedMap) this.f3387O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this.f3393O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this.f3393O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this.f3393O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo().tailMap(obj));
    }
}
