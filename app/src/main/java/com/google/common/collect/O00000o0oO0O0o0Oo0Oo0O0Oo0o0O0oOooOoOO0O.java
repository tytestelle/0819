package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O extends O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 {

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final /* synthetic */ int f3407O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final /* synthetic */ O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo f3408O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo, int i) {
        super(o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo);
        this.f3407O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = i;
        this.f3408O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
    }

    @Override // com.google.common.collect.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000
    public final Object O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i) {
        switch (this.f3407O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
            case 0:
                O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO = this.f3408O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.backingMap;
                org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                return o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[i];
            default:
                O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO2 = this.f3408O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.backingMap;
                org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO2.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                return new O000oOO0oO0OOOOOoOOo000OooO000o00OoOo00O(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO2, i);
        }
    }
}
