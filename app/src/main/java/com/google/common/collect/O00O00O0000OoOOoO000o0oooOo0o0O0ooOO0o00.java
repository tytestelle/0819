package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public final class O00O00O0000OoOOoO000o0oooOo0o0O0ooOO0o00 extends O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0 {
    final /* synthetic */ O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O00O00O0000OoOOoO000o0oooOo0o0O0ooOO0o00(O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0 o00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0) {
        super(new O00O00O0OoOo0oO0o00OOOO0oO0O000oOOoooooo(o00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0.rangesByLowerBound, O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.all()));
        this.this$0 = o00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0;
    }

    @Override // com.google.common.collect.O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0
    public void add(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        this.this$0.remove(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0);
    }

    @Override // com.google.common.collect.O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0, com.google.common.collect.O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0
    public O000oOo0o0ooOO0OOoOo0o0Oo000o00OoOOo00O0 complement() {
        return this.this$0;
    }

    @Override // com.google.common.collect.O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0
    public boolean contains(Comparable<?> comparable) {
        return !this.this$0.contains(comparable);
    }

    @Override // com.google.common.collect.O00O00Oo0O0000O00O0OO0ooOOOo00000o000OO0
    public void remove(O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) {
        this.this$0.add(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0);
    }
}
