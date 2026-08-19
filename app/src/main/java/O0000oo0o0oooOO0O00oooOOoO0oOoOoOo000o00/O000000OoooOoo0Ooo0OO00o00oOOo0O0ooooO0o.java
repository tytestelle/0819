package O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O f1703O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final int f1704O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O f1705O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final int f1706O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O f1707O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, int i, O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O2, int i2, O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O3) {
        this.f1703O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        this.f1704O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
        this.f1705O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O2;
        this.f1706O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i2;
        this.f1707O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O3;
    }

    public abstract O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();

    public abstract O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i);

    public abstract O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();

    public final boolean O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() != this.f1706O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            return false;
        }
        int i = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1702O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[this.f1705O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.ordinal()];
        if (i == 1) {
            return (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) && !(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        }
        if (i == 2) {
            return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        }
        if (i != 3) {
            return false;
        }
        return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    public final boolean O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() != this.f1704O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            return false;
        }
        int i = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1702O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[this.f1703O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.ordinal()];
        if (i == 1) {
            return (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) && !(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        }
        if (i == 2) {
            return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        }
        if (i != 3) {
            return false;
        }
        return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    public final O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        int i = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1702O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[this.f1705O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.ordinal()];
        int i2 = this.f1706O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (i == 1) {
            return new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(i2);
        }
        if (i == 2) {
            return new O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i2);
        }
        if (i == 3) {
            return new O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i2);
        }
        throw new IllegalStateException();
    }

    public final O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i) {
        int i2 = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1702O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[this.f1707O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.ordinal()];
        if (i2 == 1) {
            return new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(i);
        }
        if (i2 == 2) {
            return new O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i);
        }
        if (i2 == 3) {
            return new O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i);
        }
        throw new IllegalStateException();
    }

    public final O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() {
        int i = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1702O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[this.f1703O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.ordinal()];
        int i2 = this.f1704O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (i == 1) {
            return new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(i2);
        }
        if (i == 2) {
            return new O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i2);
        }
        if (i == 3) {
            return new O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i2);
        }
        throw new IllegalStateException();
    }

    public abstract void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
}
