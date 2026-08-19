package com.bumptech.glide.manager;

/* JADX INFO: loaded from: classes.dex */
public final class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2915O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ boolean f2916O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2917O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(int i, Object obj, boolean z) {
        this.f2915O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2917O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj;
        this.f2916O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2915O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = (O00000OOoOOO00O00o0ooooooooO000ooooO0000) this.f2917O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                o00000OOoOOO00O00o0ooooooooO000ooooO0000.getClass();
                O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000OOoOOO00O00o0ooooooooO000ooooO0000.f2918O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                boolean z = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f103O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                boolean z2 = this.f2916O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f103O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = z2;
                if (z != z2) {
                    ((O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f104O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(z2);
                }
                break;
            default:
                ((O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) this.f2917O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f2924O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.f2916O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
        }
    }
}
