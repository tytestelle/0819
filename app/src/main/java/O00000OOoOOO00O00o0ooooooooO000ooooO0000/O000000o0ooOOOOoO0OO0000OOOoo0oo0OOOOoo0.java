package O00000OOoOOO00O00o0ooooooooO000ooooO0000;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f407O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f408O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public Class f409O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        this.f407O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    @Override // O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        this.f407O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0)) {
            return false;
        }
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) obj;
        return this.f408O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f408O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO && this.f409O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f409O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    public final int hashCode() {
        int i = this.f408O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO * 31;
        Class cls = this.f409O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f408O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + "array=" + this.f409O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o + '}';
    }
}
