package O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 implements O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final Set f538O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Object f539O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o) {
        this.f539O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj) {
        return f538O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.contains(((Uri) obj).getScheme());
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o, java.lang.Object] */
    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, int i, int i2, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        Uri uri = (Uri) obj;
        return new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(uri), this.f539O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(uri));
    }
}
