package androidx.core.content;

import android.content.ClipData;
import android.content.ComponentName;
import android.net.Uri;
import androidx.core.util.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements Predicate {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2151O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(int i) {
        this.f2151O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.f2151O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return androidx.core.util.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.f2151O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
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
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
        }
        return androidx.core.util.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.f2151O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return androidx.core.util.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f2151O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return IntentSanitizer.Builder.lambda$allowAnyComponent$10((ComponentName) obj);
            case 1:
                return IntentSanitizer.Builder.lambda$allowExtra$14(obj);
            case 2:
                return IntentSanitizer.Builder.lambda$new$0((String) obj);
            case 3:
                return IntentSanitizer.Builder.lambda$new$1((Uri) obj);
            case 4:
                return IntentSanitizer.Builder.lambda$new$2((String) obj);
            case 5:
                return IntentSanitizer.Builder.lambda$new$3((String) obj);
            case 6:
                return IntentSanitizer.Builder.lambda$new$4((String) obj);
            case 7:
                return IntentSanitizer.Builder.lambda$new$5((ComponentName) obj);
            case 8:
                return IntentSanitizer.Builder.lambda$new$6((Uri) obj);
            case 9:
                return IntentSanitizer.Builder.lambda$new$7((ClipData) obj);
            case 10:
                return IntentSanitizer.Builder.lambda$allowExtra$12(obj);
            default:
                return androidx.core.util.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj);
        }
    }
}
