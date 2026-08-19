package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements Predicate {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2190O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2191O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, int i) {
        this.f2190O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2191O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.f2190O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.f2190O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                break;
        }
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.f2190O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f2190O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return this.f2191O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.equals(obj);
            default:
                return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0((Predicate) this.f2191O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, obj);
        }
    }
}
