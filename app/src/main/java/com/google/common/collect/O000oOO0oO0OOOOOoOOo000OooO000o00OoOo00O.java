package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oOO0oO0OOOOOoOOo000OooO000o00OoOo00O extends O000oO0Oo0oooo0oO00Ooo0o0O0o0000oOO0oOo0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Object f3629O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f3630O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO f3631O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000oOO0oO0OOOOOoOOo000OooO000o00OoOo00O(O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO, int i) {
        this.f3631O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO;
        this.f3629O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[i];
        this.f3630O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
    }

    @Override // com.google.common.collect.O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0
    public final int getCount() {
        int i = this.f3630O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO = this.f3631O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        Object obj = this.f3629O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i == -1 || i >= o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o || !com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj, o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[i])) {
            this.f3630O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(obj);
        }
        int i2 = this.f3630O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (i2 == -1) {
            return 0;
        }
        return o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3633O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i2];
    }

    @Override // com.google.common.collect.O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0
    public final Object getElement() {
        return this.f3629O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }
}
