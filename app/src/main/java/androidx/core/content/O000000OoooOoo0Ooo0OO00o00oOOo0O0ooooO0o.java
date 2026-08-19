package androidx.core.content;

import android.content.ComponentName;
import android.content.UriMatcher;
import android.net.Uri;
import androidx.core.util.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements Predicate {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2149O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2150O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj, int i) {
        this.f2149O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2150O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.f2149O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return androidx.core.util.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.f2149O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                break;
        }
        return androidx.core.util.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.f2149O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return androidx.core.util.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f2149O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return ((ComponentName) this.f2150O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).equals((ComponentName) obj);
            default:
                return UriMatcherCompat.lambda$asPredicate$0((UriMatcher) this.f2150O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Uri) obj);
        }
    }
}
