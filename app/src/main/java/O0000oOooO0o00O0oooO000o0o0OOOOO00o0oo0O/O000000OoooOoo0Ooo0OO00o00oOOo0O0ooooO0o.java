package O0000oOooO0o00O0oooO000o0o0OOOOO00o0oo0O;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import kotlinx.coroutines.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import kotlinx.coroutines.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;
import kotlinx.coroutines.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
import kotlinx.coroutines.O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
import kotlinx.coroutines.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
import kotlinx.coroutines.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
import kotlinx.coroutines.scheduling.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o implements O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Handler f1685O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final String f1686O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final boolean f1687O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f1688O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    private volatile O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o _immediate;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Handler handler, String str, boolean z) {
        this.f1685O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = handler;
        this.f1686O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = str;
        this.f1687O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = z;
        this._immediate = z ? this : null;
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this._immediate;
        if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(handler, str, true);
            this._immediate = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        }
        this.f1688O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
    public final void dispatch(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, Runnable runnable) {
        if (this.f1685O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = (O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00) o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.get(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4063O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        if (o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 != null) {
            ((O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo) o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(cancellationException);
        }
        O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f4081O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.dispatch(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) && ((O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) obj).f1685O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == this.f1685O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1685O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }

    @Override // kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
    public final boolean isDispatchNeeded(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        return (this.f1687O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o && O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Looper.myLooper(), this.f1685O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
    public O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o limitedParallelism(int i) {
        kotlinx.coroutines.internal.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i);
        return this;
    }

    @Override // kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
    public final String toString() {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        String str;
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f4080O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4136O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (this == o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2) {
            str = "Dispatchers.Main";
        } else {
            try {
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.f1688O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            } catch (UnsupportedOperationException unused) {
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
            }
            str = this == o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f1686O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (string == null) {
            string = this.f1685O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.toString();
        }
        return this.f1687O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o ? O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(string, ".immediate") : string;
    }

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Handler handler) {
        this(handler, null, false);
    }
}
