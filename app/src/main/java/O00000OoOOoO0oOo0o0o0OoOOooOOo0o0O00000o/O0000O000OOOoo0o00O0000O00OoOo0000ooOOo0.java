package O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 implements O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f532O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 f533O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, int i) {
        this.f532O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f533O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final /* bridge */ /* synthetic */ boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj) {
        switch (this.f532O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, int i, int i2, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        Uri uriFromFile;
        switch (this.f532O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null) {
                    return null;
                }
                O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = this.f533O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(uriFromFile)) {
                    return o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(uriFromFile, i, i2, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
                }
                return null;
            default:
                return this.f533O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO((URL) obj), i, i2, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
        }
    }
}
