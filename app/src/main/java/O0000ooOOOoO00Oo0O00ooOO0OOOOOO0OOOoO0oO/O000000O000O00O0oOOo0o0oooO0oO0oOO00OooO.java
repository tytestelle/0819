package O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO;

import O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements O00000OOoOOO00O00o0ooooooooO000ooooO0000 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public InputStream f1735O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public OutputStream f1736O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public int f1737O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public boolean f1738O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public boolean f1739O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(InputStream inputStream, OutputStream outputStream) {
        this.f1735O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = inputStream;
        this.f1736O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = outputStream;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) throws IOException {
        if (this.f1738O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            return -1;
        }
        if (this.f1735O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null) {
            return 0;
        }
        int iO00000OOoOOO00O00o0ooooooooO000ooooO0000 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O00000OOoOOO00O00o0ooooooooO000ooooO0000();
        if (iO00000OOoOOO00O00o0ooooooooO000ooooO0000 <= 0) {
            if (((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0()) {
                return 0;
            }
            throw new IOException("FULL");
        }
        try {
            int iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this.f1735O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, iO00000OOoOOO00O00o0ooooooooO000ooooO0000);
            if (iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO < 0) {
                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            }
            return iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        } catch (SocketTimeoutException unused) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this;
            try {
                if (!o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO()) {
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                }
            } catch (IOException e) {
                ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1731O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1732O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.close();
            }
            return -1;
        }
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final boolean O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(long j) {
        return true;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final boolean O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        return true;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final int O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        return this.f1737O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final boolean O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(long j) {
        return true;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final int O00000OOoOOO00O00o0ooooooooO000ooooO0000(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001) {
        int iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
        int iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
        int iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2;
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null || (iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2 = ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O()) <= 0) {
            iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = 0;
        } else {
            iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            if (iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 < iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O2) {
                return iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
            }
        }
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 != null && (iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001).O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O()) > 0) {
            int iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo1 = O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001);
            if (iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo1 < 0) {
                return iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 > 0 ? iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 : iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo1;
            }
            iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 += iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo1;
            if (iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo1 < iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O) {
            }
        }
        return iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final int O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        if (this.f1739O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
            return -1;
        }
        if (this.f1736O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null) {
            return 0;
        }
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        int iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
        if (iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O > 0) {
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f1736O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
        if (!o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0()) {
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.clear();
        }
        return iO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final void flush() throws IOException {
        OutputStream outputStream = this.f1736O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (outputStream != null) {
            outputStream.flush();
        }
    }
}
