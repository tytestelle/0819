package O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;

import O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Context f557O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 f558O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 f559O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final Class f560O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Context context, O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1, Class cls) {
        this.f557O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = context.getApplicationContext();
        this.f558O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
        this.f559O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o1;
        this.f560O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = cls;
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO((Uri) obj);
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, int i, int i2, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        Uri uri = (Uri) obj;
        return new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(uri), new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f557O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, this.f558O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f559O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, uri, i, i2, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO, this.f560O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo));
    }
}
