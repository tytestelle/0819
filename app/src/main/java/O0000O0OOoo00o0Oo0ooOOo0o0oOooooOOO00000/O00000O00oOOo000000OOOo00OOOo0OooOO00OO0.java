package O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;

/* JADX INFO: loaded from: classes.dex */
public final class O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public Class f822O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public Class f823O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public Class f824O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(Class cls, Class cls2, Class cls3) {
        this.f822O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = cls;
        this.f823O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = cls2;
        this.f824O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.class != obj.getClass()) {
            return false;
        }
        O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = (O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) obj;
        return this.f822O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.equals(o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f822O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) && this.f823O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.equals(o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f823O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) && O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f824O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f824O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
    }

    public final int hashCode() {
        int iHashCode = (this.f823O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.hashCode() + (this.f822O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.hashCode() * 31)) * 31;
        Class cls = this.f824O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f822O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + ", second=" + this.f823O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + '}';
    }
}
