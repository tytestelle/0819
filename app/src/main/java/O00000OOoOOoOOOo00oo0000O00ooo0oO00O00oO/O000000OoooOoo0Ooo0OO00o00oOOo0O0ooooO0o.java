package O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

import O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final File f442O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f445O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f444O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(4);

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final long f443O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 262144000;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 f441O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(File file) {
        this.f442O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = file;
    }

    public final synchronized O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        try {
            if (this.f445O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
                this.f445O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this.f442O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f443O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f445O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    @Override // O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final File O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
        String strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f441O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + " for for Key: " + o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        }
        try {
            O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != null) {
                return ((File[]) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1050O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooOO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        String strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f441O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f444O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        synchronized (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
            try {
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooOO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) ((HashMap) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).get(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooOO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null) {
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooOO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = ((O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                    ((HashMap) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).put(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooOO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
                }
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooOO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f440O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO++;
            } catch (Throwable th) {
                throw th;
            }
        }
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooOO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f439O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + " for for Key: " + o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
            }
            try {
                O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) != null) {
                    this.f444O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    return;
                }
                O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
                    throw new IllegalStateException("Had two simultaneous puts for: ".concat(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
                }
                try {
                    if (((O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(), (O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo)) {
                        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f106O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, true);
                        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f103O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = true;
                    }
                    if (!o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f103O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                        try {
                            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                        } catch (IOException unused) {
                        }
                    }
                    this.f444O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                } catch (Throwable th2) {
                    if (!o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f103O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                        try {
                            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th2;
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } catch (Throwable th3) {
            this.f444O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            throw th3;
        }
    }
}
