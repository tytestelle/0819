package com.google.common.collect;

import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000O0Ooo0oOo0oOOoOoOoOOOOOO000ooo00O00O extends O000Oo000o0OO00O000OoOo0OO00OOO0o00o00oo {
    private final O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o map;

    public O000O0Ooo0oOo0oOOoOoOoOOOOOO000ooo00O00O(O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o) {
        this.map = o000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // com.google.common.collect.O000Oo000o0OO00O000OoOo0OO00OOO0o00o00oo
    public Object get(int i) {
        return ((Map.Entry) this.map.entrySet().asList().get(i)).getKey();
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.map.size();
    }

    @Override // com.google.common.collect.O000Oo000o0OO00O000OoOo0OO00OOO0o00o00oo, com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return new O000O0Oo00OoO000oo00o0OOo0O0OO0O0o0oO00O(this.map);
    }

    @Override // com.google.common.collect.O000Oo000o0OO00O000OoOo0OO00OOO0o00o00oo, com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo iterator() {
        return this.map.keyIterator();
    }
}
