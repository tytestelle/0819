package O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 implements O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f368O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(20, new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(4));

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f369O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o f370O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public boolean f371O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public boolean f372O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    @Override // O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o
    public final Class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return this.f370O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    @Override // O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        return this.f369O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public final synchronized void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        this.f369O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        if (!this.f371O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f371O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
        if (this.f372O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            recycle();
        }
    }

    @Override // O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o
    public final Object get() {
        return this.f370O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get();
    }

    @Override // O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o
    public final int getSize() {
        return this.f370O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getSize();
    }

    @Override // O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o
    public final synchronized void recycle() {
        this.f369O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        this.f372O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = true;
        if (!this.f371O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            this.f370O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.recycle();
            this.f370O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
            f368O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.release(this);
        }
    }
}
