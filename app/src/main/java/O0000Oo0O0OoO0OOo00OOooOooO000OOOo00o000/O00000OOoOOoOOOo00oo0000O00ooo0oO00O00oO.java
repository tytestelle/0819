package O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

import android.content.Context;
import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;
import com.chaquo.python.internal.Common;

/* JADX INFO: loaded from: classes.dex */
public final class O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO f1426O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public Context f1427O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f1428O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public static void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Context context) {
        if (f1426O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
            synchronized (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.class) {
                try {
                    if (f1426O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
                        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1427O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = context;
                        f1426O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str, String str2) {
        if (this.f1428O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null) {
            if (!Python.isStarted()) {
                Python.start(new AndroidPlatform(this.f1427O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO));
            }
            this.f1428O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Python.getInstance().getModule(Common.ASSET_APP).callAttr("App", O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1325O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO), 10);
        }
        return ((PyObject) this.f1428O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f836O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).callAttr("parse", str, str2).toString();
    }
}
