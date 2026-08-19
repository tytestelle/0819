package androidx.core.content;

import android.content.ComponentName;
import android.net.Uri;
import androidx.core.util.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements Predicate {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2147O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ String f2148O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String str, int i) {
        this.f2147O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2148O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = str;
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.f2147O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return androidx.core.util.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.f2147O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return androidx.core.util.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.f2147O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return androidx.core.util.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f2147O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return IntentSanitizer.Builder.lambda$allowExtraOutput$16(this.f2148O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Uri) obj);
            case 1:
                return this.f2148O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.equals((String) obj);
            case 2:
                return IntentSanitizer.Builder.lambda$allowComponentWithPackage$9(this.f2148O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (ComponentName) obj);
            case 3:
                return IntentSanitizer.Builder.lambda$allowDataWithAuthority$8(this.f2148O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Uri) obj);
            case 4:
                return IntentSanitizer.Builder.lambda$allowClipDataUriWithAuthority$11(this.f2148O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Uri) obj);
            default:
                return IntentSanitizer.Builder.lambda$allowExtraStreamUriWithAuthority$15(this.f2148O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Uri) obj);
        }
    }
}
