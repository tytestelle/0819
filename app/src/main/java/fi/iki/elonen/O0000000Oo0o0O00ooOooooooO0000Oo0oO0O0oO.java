package fi.iki.elonen;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final InputStream f3935O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Socket f3936O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f3937O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, InputStream inputStream, Socket socket) {
        this.f3937O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        this.f3935O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = inputStream;
        this.f3936O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = socket;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        OutputStream outputStream;
        Throwable th;
        Exception e;
        InputStream inputStream = this.f3935O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.f3937O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        Socket socket = this.f3936O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        try {
            outputStream = socket.getOutputStream();
            try {
                try {
                    O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(16), this.f3935O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, outputStream, socket.getInetAddress());
                    while (!socket.isClosed()) {
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                    }
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(outputStream);
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(inputStream);
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(socket);
                } catch (Throwable th2) {
                    th = th2;
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(outputStream);
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(inputStream);
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(socket);
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3985O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f3946O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove(this);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f3981O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
                }
                O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(outputStream);
                O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(inputStream);
                O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(socket);
            }
        } catch (Exception e3) {
            outputStream = null;
            e = e3;
        } catch (Throwable th3) {
            outputStream = null;
            th = th3;
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(outputStream);
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(inputStream);
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(socket);
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3985O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f3946O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove(this);
            throw th;
        }
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3985O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f3946O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove(this);
    }
}
