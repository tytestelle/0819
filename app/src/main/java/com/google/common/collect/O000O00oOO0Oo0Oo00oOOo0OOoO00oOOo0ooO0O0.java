package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public final class O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0 extends O000O0OOoOOO0OoOo00oO00OOo00OOoOo0oOO00O {
    final /* synthetic */ O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0 this$0;

    public O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0(O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0 o000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0) {
        this.this$0 = o000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0;
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
        return this.this$0.entryIterator();
    }
}
