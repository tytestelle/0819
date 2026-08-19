package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oOoo00O0oooO0ooOOoOo000oo0O0O0oOOooO extends O0000oOooOO0OOoooO0ooOO0o0oOooOoOoo0OOoo {
    final /* synthetic */ O000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0 this$0;

    public O000oOoo00O0oooO0ooOOoOo000oo0O0O0oOOooO(O000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0 o000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0) {
        this.this$0 = o000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0;
    }

    @Override // com.google.common.collect.O0000oOooOO0OOoooO0ooOO0o0oOooOoOoo0OOoo, com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.O0000oOooOO0OOoooO0ooOO0o0oOooOoOoo0OOoo
    public O000OOoo0OOo0o0ooO00o0OO0O00oOOOOoO0ooO0 delegateCollection() {
        return this.this$0;
    }

    @Override // java.util.List
    public Comparable get(int i) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, size());
        O000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0 o000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0 = this.this$0;
        return o000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0.domain.offset(o000oOooooOOO0OOooooOOooOooOOoo0Oo0OooO0.first(), i);
    }
}
