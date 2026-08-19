package O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
import android.net.ConnectivityManager;
import android.util.Log;
import com.bumptech.glide.manager.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import com.bumptech.glide.manager.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
import com.bumptech.glide.manager.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public boolean f103O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Object f104O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Object f105O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final Object f106O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        this.f106O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O00000OOoOOO00O00o0ooooooooO000ooooO0000(this);
        this.f105O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
        this.f104O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
    }

    @Override // com.bumptech.glide.manager.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    public boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = (O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O) this.f105O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        this.f103O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = ((ConnectivityManager) o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.get()).registerDefaultNetworkCallback((O00000OOoOOO00O00o0ooooooooO000ooooO0000) this.f106O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
            return true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
            return false;
        }
    }

    @Override // com.bumptech.glide.manager.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    public void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        ((ConnectivityManager) ((O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O) this.f105O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).get()).unregisterNetworkCallback((O00000OOoOOO00O00o0ooooooooO000ooooO0000) this.f106O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
    }

    public void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f106O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, this, false);
    }

    public File O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        File file;
        synchronized (((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f106O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo)) {
            try {
                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) this.f104O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f112O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != this) {
                    throw new IllegalStateException();
                }
                if (!o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f111O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
                    ((boolean[]) this.f105O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)[0] = true;
                }
                file = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f110O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo[0];
                ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f106O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).f114O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        this.f106O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        this.f104O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        this.f105O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f111O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 ? null : new boolean[o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f120O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000];
    }
}
