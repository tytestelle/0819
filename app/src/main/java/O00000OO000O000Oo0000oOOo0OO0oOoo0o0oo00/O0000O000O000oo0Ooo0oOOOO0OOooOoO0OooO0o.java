package O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o implements O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final boolean f355O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final boolean f356O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o f357O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 f358O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO f359O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public int f360O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public boolean f361O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    public O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, boolean z, boolean z2, O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000) {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, "Argument must not be null");
        this.f357O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
        this.f355O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = z;
        this.f356O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = z2;
        this.f359O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, "Argument must not be null");
        this.f358O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
    }

    @Override // O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o
    public final Class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return this.f357O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    public final synchronized void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        if (this.f361O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f360O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO++;
    }

    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        boolean z;
        synchronized (this) {
            int i = this.f360O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f360O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f358O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this.f359O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, this);
        }
    }

    @Override // O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o
    public final Object get() {
        return this.f357O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.get();
    }

    @Override // O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o
    public final int getSize() {
        return this.f357O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getSize();
    }

    @Override // O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o
    public final synchronized void recycle() {
        if (this.f360O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f361O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f361O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = true;
        if (this.f356O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            this.f357O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.recycle();
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f355O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + ", listener=" + this.f358O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + ", key=" + this.f359O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 + ", acquired=" + this.f360O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO + ", isRecycled=" + this.f361O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 + ", resource=" + this.f357O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o + '}';
    }
}
