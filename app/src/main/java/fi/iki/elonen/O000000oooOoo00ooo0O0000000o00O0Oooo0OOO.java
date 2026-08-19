package fi.iki.elonen;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public IOException f3975O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public boolean f3976O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = false;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f3977O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        this.f3977O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f3977O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f3983O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.bind(new InetSocketAddress(this.f3977O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f3982O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO));
            this.f3976O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = true;
            do {
                try {
                    Socket socketAccept = this.f3977O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f3983O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.accept();
                    socketAccept.setSoTimeout(5000);
                    InputStream inputStream = socketAccept.getInputStream();
                    O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.f3977O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3985O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, inputStream, socketAccept));
                } catch (IOException e) {
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f3981O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                }
            } while (!this.f3977O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f3983O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isClosed());
        } catch (IOException e2) {
            this.f3975O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = e2;
        }
    }
}
