package androidx.core.util;

import androidx.core.content.IntentSanitizer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Predicate {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2187O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Predicate f2188O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2189O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Predicate predicate, Predicate predicate2, int i) {
        this.f2187O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2188O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = predicate;
        this.f2189O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = predicate2;
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.f2187O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.f2187O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                break;
            case 1:
                break;
        }
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.f2187O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f2187O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this.f2188O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Predicate) this.f2189O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, obj);
            case 1:
                return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f2188O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Predicate) this.f2189O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, obj);
            default:
                return IntentSanitizer.Builder.lambda$allowExtra$13((Class) this.f2189O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2188O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, obj);
        }
    }

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Class cls, Predicate predicate) {
        this.f2187O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 2;
        this.f2189O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = cls;
        this.f2188O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = predicate;
    }
}
