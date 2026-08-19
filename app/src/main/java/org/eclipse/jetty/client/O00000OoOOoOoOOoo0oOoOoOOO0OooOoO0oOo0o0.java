package org.eclipse.jetty.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import java.nio.channels.UnresolvedAddressException;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 extends org.eclipse.jetty.util.component.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f4247O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O f4248O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o f4249O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final ConcurrentHashMap f4250O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f4247O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.class.getName());
    }

    public O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(this);
        this.f4249O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
        this.f4250O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new ConcurrentHashMap();
        this.f4248O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, false);
        O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o, true);
    }

    @Override // org.eclipse.jetty.client.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) throws IOException {
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = this.f4248O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        SocketChannel socketChannelOpen = null;
        try {
            socketChannelOpen = SocketChannel.open();
            o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.getClass();
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4230O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
            socketChannelOpen.socket().setTcpNoDelay(true);
            boolean z = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4211O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = this.f4249O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            if (z) {
                Socket socket = socketChannelOpen.socket();
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
                socket.connect(new InetSocketAddress(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4198O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4199O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO), o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4219O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
                socketChannelOpen.configureBlocking(false);
                o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(socketChannelOpen, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
            } else {
                socketChannelOpen.configureBlocking(false);
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
                socketChannelOpen.connect(new InetSocketAddress(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4198O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4199O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
                o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(socketChannelOpen, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
                O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(this, socketChannelOpen, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
                long j = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4219O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4220O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, j - o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f2049O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                this.f4250O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.put(socketChannelOpen, o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO);
            }
        } catch (IOException e) {
            if (socketChannelOpen != null) {
                socketChannelOpen.close();
            }
            o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(e);
        } catch (UnresolvedAddressException e2) {
            if (socketChannelOpen != null) {
                socketChannelOpen.close();
            }
            o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(e2);
        }
    }
}
