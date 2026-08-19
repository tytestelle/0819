package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OOoOOOooo0o000O00O0O0OOO0OooooOoO0o0 extends O000O0OOoOOO0OoOo00oO00OOo00OOoOo0oOO00O {
    final /* synthetic */ O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 this$0;

    public O000OOoOOOooo0o000O00O0O0OOO0OooooOoO0o0(O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 o000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00) {
        this.this$0 = o000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00;
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0
    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O createAsList() {
        return new O000OOoOOOo0O0O0000OoO0oOoOoOOo0o0O0ooo0(this);
    }

    @Override // com.google.common.collect.O000O0OOoOOO0OoOo00oO00OOo00OOoOo0oOO00O
    public O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o map() {
        return this.this$0;
    }

    @Override // com.google.common.collect.O000O0OOoOOO0OoOo00oO00OOo00OOoOo0oOO00O, com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo iterator() {
        return asList().iterator();
    }
}
