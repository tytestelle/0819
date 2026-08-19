package O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo extends O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f1683O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(1, 0, 1);

    @Override // O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final boolean equals(Object obj) {
        if (obj instanceof O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            if (!isEmpty() || !((O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) obj).isEmpty()) {
                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) obj;
                if (this.f1676O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1676O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                    if (this.f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final Comparable getEndInclusive() {
        return Integer.valueOf(this.f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
    }

    @Override // O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final Comparable getStart() {
        return Integer.valueOf(this.f1676O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }

    @Override // O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f1676O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO * 31) + this.f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final boolean isEmpty() {
        return this.f1676O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO > this.f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final String toString() {
        return this.f1676O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + ".." + this.f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }
}
