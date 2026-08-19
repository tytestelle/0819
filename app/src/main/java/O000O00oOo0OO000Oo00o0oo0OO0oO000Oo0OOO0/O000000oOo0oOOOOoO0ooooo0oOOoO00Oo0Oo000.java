package O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 extends Handler {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f2081O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final int f2082O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f2083O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public boolean f2084O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, Looper looper) {
        super(looper);
        this.f2083O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        this.f2082O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 10;
        this.f2081O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(14, false);
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, Object obj) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, obj);
        synchronized (this) {
            try {
                this.f2081O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                if (!this.f2084O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                    this.f2084O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO("Could not send handler message");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = this.f2081O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o();
                if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o == null) {
                    synchronized (this) {
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = this.f2081O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o();
                        if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o == null) {
                            this.f2084O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                            return;
                        }
                    }
                }
                this.f2083O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f2082O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            if (!sendMessage(obtainMessage())) {
                throw new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO("Could not send handler message");
            }
            this.f2084O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = true;
        } catch (Throwable th) {
            this.f2084O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
            throw th;
        }
    }
}
