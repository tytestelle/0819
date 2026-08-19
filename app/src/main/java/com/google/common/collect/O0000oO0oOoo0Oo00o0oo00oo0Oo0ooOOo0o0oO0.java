package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000oO0oOoo0Oo00o0oo00oo0Oo0ooOOo0o0oO0 extends O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ int f3487O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 1;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final Iterable f3488O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0000oO0oOoo0Oo00o0oo00oo0Oo0ooOOo0o0oO0(O0000oO0oOooooOOo0oO00Oo0OoO0Oo00OOOo0oo o0000oO0oOooooOOo0oO00Oo0OoO0Oo00OOOo0oo, int i) {
        super(i, 0);
        this.f3488O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o0000oO0oOooooOOo0oO00Oo0OoO0Oo00OOOo0oo;
    }

    @Override // com.google.common.collect.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) {
        switch (this.f3487O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            case 0:
                return ((Iterable[]) ((O0000oO0oOooooOOo0oO00Oo0OoO0Oo00OOOo0oo) this.f3488O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).f3491O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)[i].iterator();
            default:
                return ((O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O) this.f3488O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).get(i);
        }
    }

    public O0000oO0oOoo0Oo00o0oo00oo0Oo0ooOOo0o0oO0(int i, O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O) {
        super(o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.size(), i);
        this.f3488O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
    }
}
