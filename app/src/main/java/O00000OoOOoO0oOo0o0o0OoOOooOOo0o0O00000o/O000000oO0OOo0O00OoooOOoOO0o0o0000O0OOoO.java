package O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO implements O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f479O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Context f480O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Context context, int i) {
        this.f479O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f480O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = context;
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public Class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return InputStream.class;
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public Object O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Resources resources, int i, Resources.Theme theme) {
        return resources.openRawResource(i);
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO) {
        switch (this.f479O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f480O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this);
            default:
                return new O00000OOoOOO00O00o0ooooooooO000ooooO0000(this.f480O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, 2);
        }
    }

    @Override // O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public Object get() {
        return (ConnectivityManager) this.f480O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getSystemService("connectivity");
    }
}
