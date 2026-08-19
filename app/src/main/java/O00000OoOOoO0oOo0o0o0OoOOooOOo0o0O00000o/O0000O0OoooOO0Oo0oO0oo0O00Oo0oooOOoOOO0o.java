package O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o implements O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final Set f540O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 f541O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
        this.f541O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj) {
        return f540O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.contains(((Uri) obj).getScheme());
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, int i, int i2, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        return this.f541O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(((Uri) obj).toString()), i, i2, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
    }
}
