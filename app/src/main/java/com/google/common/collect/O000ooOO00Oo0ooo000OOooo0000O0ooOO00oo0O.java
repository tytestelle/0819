package com.google.common.collect;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000ooOO00Oo0ooo000OOooo0000O0ooOO00oo0O extends O000Oo000o0OO00O000OoOo0OO00OOO0o00o00oo {
    final /* synthetic */ O000ooOOo0Oo0ooO0OoOooOoO0OO0oOo0OOooOo0 this$0;

    public O000ooOO00Oo0ooo000OOooo0000O0ooOO00oo0O(O000ooOOo0Oo0ooO0OoOooOoO0OO0oOo0OOooOo0 o000ooOOo0Oo0ooO0OoOooOoO0OO0oOo0OOooOo0, O000ooOO0000oOo00OoOOOoO0OOO00O0OO0O00oO o000ooOO0000oOo00OoOOOoO0OOO00O0OO0O00oO) {
        this.this$0 = o000ooOOo0Oo0ooO0OoOooOoO0OO0oOo0OOooOo0;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return this.this$0.contains(obj);
    }

    @Override // com.google.common.collect.O000Oo000o0OO00O000OoOo0OO00OOO0o00o00oo
    public Object get(int i) {
        O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO = this.this$0.contents;
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        return o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[i];
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.this$0.contents.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // com.google.common.collect.O000Oo000o0OO00O000OoOo0OO00OOO0o00o00oo, com.google.common.collect.O000OOOOo000ooO0ooOoo0O0oOo0OOOo0OOOooO0, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }
}
