package O0000oOooOO0OOoooO0ooOO0o0oOooOoOoo0OOoo;

import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public int f1689O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    private volatile /* synthetic */ Object _state;

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj) {
        this._state = obj;
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj) {
        int i;
        if (obj == null) {
            obj = O0000oOooo0Oo0ooO0Oo0OoOOoOOO00oO00O0o0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1690O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
        synchronized (this) {
            if (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this._state, obj)) {
                return;
            }
            this._state = obj;
            int i2 = this.f1689O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if ((i2 & 1) != 0) {
                this.f1689O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i2 + 2;
                return;
            }
            int i3 = i2 + 1;
            this.f1689O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i3;
            while (true) {
                synchronized (this) {
                    i = this.f1689O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (i == i3) {
                        this.f1689O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i3 + 1;
                        return;
                    }
                }
                i3 = i;
            }
        }
    }
}
