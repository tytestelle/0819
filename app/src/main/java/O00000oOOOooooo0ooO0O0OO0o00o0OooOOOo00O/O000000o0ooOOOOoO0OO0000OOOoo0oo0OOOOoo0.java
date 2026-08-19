package O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 extends O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final Handler f669O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final int f670O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final long f671O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public Bitmap f672O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Handler handler, int i, long j) {
        this.f669O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = handler;
        this.f670O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i;
        this.f671O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = j;
    }

    @Override // O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj) {
        this.f672O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (Bitmap) obj;
        Handler handler = this.f669O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f671O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
    }

    @Override // O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Drawable drawable) {
        this.f672O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = null;
    }
}
