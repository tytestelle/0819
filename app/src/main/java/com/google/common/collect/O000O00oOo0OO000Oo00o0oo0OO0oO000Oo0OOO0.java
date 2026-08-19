package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0 extends O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o {
    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o
    public O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 createEntrySet() {
        return new O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0(this);
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o
    public O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 createKeySet() {
        return new O000O0Ooo0oOo0oOOoOoOoOOOOOO000ooo00O00O(this);
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o
    public O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo createValues() {
        return new O000O0OoooO0oo0OOo0oOo0oO0OooO0o000oo00o(this);
    }

    public abstract O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo entryIterator();

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o, java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return keySet();
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o, java.util.Map
    public /* bridge */ /* synthetic */ Collection values() {
        return values();
    }

    @Override // com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o
    public Object writeReplace() {
        return super.writeReplace();
    }
}
