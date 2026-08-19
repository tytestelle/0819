package org.eclipse.jetty.client;

import com.google.common.util.concurrent.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Properties;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 extends org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f4251O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O f4252O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f4251O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.class.getName());
    }

    public O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
        this.f4252O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO] */
    @Override // org.eclipse.jetty.client.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) throws IOException {
        Socket socketCreateSocket;
        if (o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4231O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            O000O00OoO000o0oo0o00oO00oo00oOoo000O0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4232O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
            SSLSocket sSLSocket = (SSLSocket) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2021O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.getSocketFactory().createSocket();
            sSLSocket.setEnabledCipherSuites(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(sSLSocket.getEnabledCipherSuites(), sSLSocket.getSupportedCipherSuites()));
            sSLSocket.setEnabledProtocols(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(sSLSocket.getEnabledProtocols(), sSLSocket.getSupportedProtocols()));
            socketCreateSocket = sSLSocket;
        } else {
            socketCreateSocket = SocketFactory.getDefault().createSocket();
        }
        socketCreateSocket.setSoTimeout(0);
        socketCreateSocket.setTcpNoDelay(true);
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4230O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4198O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4199O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = this.f4252O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        socketCreateSocket.connect(inetSocketAddress, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4219O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
        O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = new O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(socketCreateSocket);
        org.eclipse.jetty.http.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4223O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4281O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4282O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2);
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f4207O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = false;
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4215O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.dispatch(new O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO, 4));
    }
}
