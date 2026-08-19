package O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo;

import O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import java.util.Random;
import org.eclipse.jetty.http.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import org.eclipse.jetty.http.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO extends ThreadLocal {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f1673O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i) {
        this.f1673O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f1673O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return new Random();
            case 1:
                return new O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
            case 2:
                return new O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            case 3:
                return new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
            default:
                return new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
        }
    }
}
