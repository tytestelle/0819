package O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO;

import O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Properties;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public static final O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f1731O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final Socket f1732O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final InetSocketAddress f1733O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public final InetSocketAddress f1734O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    static {
        Properties properties = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f1731O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.class.getName());
    }

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Socket socket) {
        super(socket.getInputStream(), socket.getOutputStream());
        this.f1732O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = socket;
        this.f1733O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (InetSocketAddress) socket.getLocalSocketAddress();
        this.f1734O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (InetSocketAddress) socket.getRemoteSocketAddress();
        this.f1737O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = socket.getSoTimeout();
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) throws SocketException {
        if (i != this.f1737O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            this.f1732O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.setSoTimeout(i > 0 ? i : 0);
        }
        this.f1737O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() throws IOException {
        InputStream inputStream;
        Socket socket = this.f1732O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (socket instanceof SSLSocket) {
            this.f1738O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = true;
            if (!this.f1739O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 || (inputStream = this.f1735O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) == null) {
                return;
            }
            inputStream.close();
            return;
        }
        if (socket.isClosed()) {
            return;
        }
        if (!socket.isInputShutdown()) {
            socket.shutdownInput();
        }
        if (socket.isOutputShutdown()) {
            socket.close();
        }
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final String O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        InetSocketAddress inetSocketAddress = this.f1733O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || inetSocketAddress.getAddress().isAnyLocalAddress()) ? "0.0.0.0" : inetSocketAddress.getAddress().getHostAddress();
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final boolean O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0() {
        Socket socket = this.f1732O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (socket instanceof SSLSocket) {
            return this.f1739O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        }
        return socket.isClosed() || socket.isOutputShutdown();
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final boolean O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() {
        Socket socket = this.f1732O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (socket instanceof SSLSocket) {
            return this.f1738O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        }
        return socket.isClosed() || socket.isInputShutdown();
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO() throws IOException {
        OutputStream outputStream;
        Socket socket = this.f1732O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (socket instanceof SSLSocket) {
            this.f1739O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = true;
            if (!this.f1738O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo || (outputStream = this.f1736O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) == null) {
                return;
            }
            outputStream.close();
            return;
        }
        if (socket.isClosed()) {
            return;
        }
        if (!socket.isOutputShutdown()) {
            socket.shutdownOutput();
        }
        if (socket.isInputShutdown()) {
            socket.close();
        }
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final String O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO() {
        InetAddress address;
        InetSocketAddress inetSocketAddress = this.f1734O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        if (inetSocketAddress == null || (address = inetSocketAddress.getAddress()) == null) {
            return null;
        }
        return address.getHostAddress();
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public void close() throws IOException {
        this.f1732O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.close();
        this.f1735O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
        this.f1736O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final int getLocalPort() {
        InetSocketAddress inetSocketAddress = this.f1733O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        if (inetSocketAddress == null) {
            return -1;
        }
        return inetSocketAddress.getPort();
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final Object getTransport() {
        return this.f1732O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final boolean isOpen() {
        Socket socket;
        return (this.f1735O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null || (socket = this.f1732O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) == null || socket.isClosed()) ? false : true;
    }

    public final String toString() {
        return this.f1733O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 + " <--> " + this.f1734O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
    }

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Socket socket, int i) throws SocketException {
        super(socket.getInputStream(), socket.getOutputStream());
        this.f1732O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = socket;
        this.f1733O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (InetSocketAddress) socket.getLocalSocketAddress();
        this.f1734O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (InetSocketAddress) socket.getRemoteSocketAddress();
        socket.setSoTimeout(i > 0 ? i : 0);
        this.f1737O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
    }
}
