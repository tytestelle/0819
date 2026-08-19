package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public final class O00O00O00ooO0oOOooO0oOOO00Oo0OO0Oo0O00o0 extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ int f3689O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo f3690O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final /* synthetic */ O000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o f3691O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final /* synthetic */ O00O00O0OoOo0oO0o00OOOO0oO0O000oOOoooooo f3692O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public /* synthetic */ O00O00O00ooO0oOOooO0oOOO00Oo0OO0Oo0O00o0(O00O00O0OoOo0oO0o00OOOO0oO0O000oOOoooooo o00O00O0OoOo0oO0o00OOOO0oO0O000oOOoooooo, O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo, O000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o, int i) {
        this.f3689O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
        this.f3691O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o;
        this.f3692O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o00O00O0OoOo0oO0o00OOOO0oO0O000oOOoooooo;
        this.f3690O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo;
    }

    @Override // com.google.common.collect.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Create;
        switch (this.f3689O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            case 0:
                if (this.f3692O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f3695O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.upperBound.isLessThan(this.f3690O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) || this.f3690O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.aboveAll()) {
                    this.f3371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.DONE;
                    return null;
                }
                O000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o = this.f3691O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                if (o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o.hasNext()) {
                    O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 = (O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o.next();
                    o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Create = O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.create(this.f3690O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound);
                    this.f3690O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound;
                } else {
                    o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Create = O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.create(this.f3690O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.aboveAll());
                    this.f3690O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.aboveAll();
                }
                return new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Create.lowerBound, o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Create);
            default:
                if (this.f3690O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowAll()) {
                    this.f3371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.DONE;
                    return null;
                }
                O000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o2 = this.f3691O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                boolean zHasNext = o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o2.hasNext();
                O00O00O0OoOo0oO0o00OOOO0oO0O000oOOoooooo o00O00O0OoOo0oO0o00OOOO0oO0O000oOOoooooo = this.f3692O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                if (zHasNext) {
                    O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1 = (O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o2.next();
                    O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Create2 = O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.create(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1.upperBound, this.f3690O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    this.f3690O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1.lowerBound;
                    if (o00O00O0OoOo0oO0o00OOOO0oO0O000oOOoooooo.f3695O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.lowerBound.isLessThan(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Create2.lowerBound)) {
                        return new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Create2.lowerBound, o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Create2);
                    }
                } else if (o00O00O0OoOo0oO0o00OOOO0oO0O000oOOoooooo.f3695O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.lowerBound.isLessThan(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowAll())) {
                    O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Create3 = O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.create(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowAll(), this.f3690O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    this.f3690O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowAll();
                    return new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowAll(), o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Create3);
                }
                this.f3371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.DONE;
                return null;
        }
    }
}
