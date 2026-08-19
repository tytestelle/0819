package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OO0Oo0o0ooOO0Oo0oOOOo0oO00oooOOoOOoo extends O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O {
    final /* synthetic */ O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o this$0;
    final /* synthetic */ int val$fromIndex;
    final /* synthetic */ int val$length;
    final /* synthetic */ O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 val$range;

    public O000OO0Oo0o0ooOO0Oo0oOOOo0oO00oooOOoOOoo(O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o, int i, int i2, O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        this.val$length = i;
        this.val$fromIndex = i2;
        this.val$range = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0;
        this.this$0 = o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.val$length;
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // java.util.List
    public O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 get(int i) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, this.val$length);
        return (i == 0 || i == this.val$length + (-1)) ? ((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) this.this$0.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(i + this.val$fromIndex)).intersection(this.val$range) : (O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) this.this$0.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(i + this.val$fromIndex);
    }
}
