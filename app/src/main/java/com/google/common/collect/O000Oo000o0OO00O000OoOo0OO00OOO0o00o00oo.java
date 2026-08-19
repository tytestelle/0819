package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000Oo000o0OO00O000OoOo0OO00OOO0o00o00oo extends O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0 {
    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public int copyIntoArray(Object[] objArr, int i) {
        return asList().copyIntoArray(objArr, i);
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0
    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O createAsList() {
        return new O000OOooo0ooOo0ooO0o0OoooOoOOOo00O0o0oO0(this);
    }

    public abstract Object get(int i);

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo iterator() {
        return asList().iterator();
    }
}
