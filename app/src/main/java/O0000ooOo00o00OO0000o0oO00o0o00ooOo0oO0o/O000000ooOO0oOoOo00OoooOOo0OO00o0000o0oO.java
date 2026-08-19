package O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o;

import O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import java.io.IOException;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.net.ssl.SSLEngine;
import org.eclipse.jetty.client.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
import org.eclipse.jetty.client.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import org.eclipse.jetty.client.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f1777O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public volatile Selector f1779O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public volatile Thread f1780O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public int f1781O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public long f1782O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public boolean f1783O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public boolean f1784O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public final /* synthetic */ O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O f1787O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final ConcurrentLinkedQueue f1778O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public final ConcurrentHashMap f1786O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = new ConcurrentHashMap();

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public volatile long f1785O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = System.currentTimeMillis();

    public O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, int i) {
        this.f1787O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f2050O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = System.currentTimeMillis();
        O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f2051O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f2048O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this;
        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f2045O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        this.f1777O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f2049O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 0L;
        this.f1779O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = Selector.open();
        this.f1782O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = System.currentTimeMillis() + ((long) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1789O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj) {
        this.f1778O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.add(obj);
    }

    public final O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(SocketChannel socketChannel, SelectionKey selectionKey) {
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        SSLEngine sSLEngineCreateSSLEngine;
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = (O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) this.f1787O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f4244O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4250O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.remove(socketChannel);
        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != null) {
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4247O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo()) {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Channels with connection pending: {}", Integer.valueOf(o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f4244O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4250O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.size()));
        }
        org.eclipse.jetty.client.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = (org.eclipse.jetty.client.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) selectionKey.attachment();
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(socketChannel, this, selectionKey, (int) o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f4244O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4248O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4217O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
        if (o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4231O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("secure to {}, proxied={}", socketChannel, Boolean.FALSE);
            O000O00OoO000o0oo0o00oO00oo00oOoo000O0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4232O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
            synchronized (o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) {
                try {
                    if (socketChannel != null) {
                        sSLEngineCreateSSLEngine = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2020O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O ? o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2021O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.createSSLEngine(socketChannel.socket().getInetAddress().getHostAddress(), socketChannel.socket().getPort()) : o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2021O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.createSSLEngine();
                        sSLEngineCreateSSLEngine.setEnabledCipherSuites(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(sSLEngineCreateSSLEngine.getEnabledCipherSuites(), sSLEngineCreateSSLEngine.getSupportedCipherSuites()));
                        sSLEngineCreateSSLEngine.setEnabledProtocols(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(sSLEngineCreateSSLEngine.getEnabledProtocols(), sSLEngineCreateSSLEngine.getSupportedProtocols()));
                    } else {
                        sSLEngineCreateSSLEngine = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2021O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.createSSLEngine();
                        sSLEngineCreateSSLEngine.setEnabledCipherSuites(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(sSLEngineCreateSSLEngine.getEnabledCipherSuites(), sSLEngineCreateSSLEngine.getSupportedCipherSuites()));
                        sSLEngineCreateSSLEngine.setEnabledProtocols(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(sSLEngineCreateSSLEngine.getEnabledProtocols(), sSLEngineCreateSSLEngine.getSupportedProtocols()));
                    }
                    sSLEngineCreateSSLEngine.setUseClientMode(true);
                    sSLEngineCreateSSLEngine.beginHandshake();
                } catch (Throwable th) {
                    throw th;
                }
            }
            O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o();
            o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.f4246O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = sSLEngineCreateSSLEngine;
            o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.f4245O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
        } else {
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
        }
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = this.f1787O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        selectionKey.attachment();
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2 = (O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2.getClass();
        org.eclipse.jetty.http.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o2.f4244O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4248O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4223O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
        org.eclipse.jetty.client.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3 = new org.eclipse.jetty.client.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.f4281O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.f4282O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3);
        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3.f4190O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        if (o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4231O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o2 = (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            org.eclipse.jetty.client.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo4 = (org.eclipse.jetty.client.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o2.f4245O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();
            O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o2.f4246O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o2.f4245O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o2.f4245O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1809O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
            o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o2.f4245O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
            o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.getClass();
            o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f1802O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1808O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo4;
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4247O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("upgrade {} to {} for {}", o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o2, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo4);
        }
        o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3);
        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("created {}", o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2);
        this.f1787O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getClass();
        this.f1786O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.put(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2, this);
        return o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
    }

    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        SocketChannel socketChannel;
        Object objPoll;
        SocketChannel socketChannel2;
        try {
            try {
                this.f1780O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = Thread.currentThread();
                Selector selector = this.f1779O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (selector == null) {
                    this.f1780O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
                    return;
                }
                int size = this.f1778O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.size();
                while (true) {
                    int i = size - 1;
                    if (size <= 0 || (objPoll = this.f1778O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.poll()) == null) {
                        break;
                    }
                    try {
                        try {
                            if (objPoll instanceof O00000OOoOOO00O00o0ooooooooO000ooooO0000) {
                                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) objPoll;
                                socketChannel2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                                try {
                                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
                                } catch (Throwable th) {
                                    th = th;
                                    if (this.f1787O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.isRunning()) {
                                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O00000OOoOOO00O00o0ooooooooO000ooooO0000(th);
                                    } else {
                                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(th);
                                    }
                                    if (socketChannel2 != null) {
                                        try {
                                            socketChannel2.close();
                                        } catch (IOException e) {
                                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(e);
                                        }
                                    }
                                }
                            } else if (objPoll instanceof O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
                                O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) objPoll;
                                SelectableChannel selectableChannel = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1774O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                                Object obj = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1775O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                                if ((selectableChannel instanceof SocketChannel) && ((SocketChannel) selectableChannel).isConnected()) {
                                    SelectionKey selectionKeyRegister = selectableChannel.register(selector, 1, obj);
                                    O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO((SocketChannel) selectableChannel, selectionKeyRegister);
                                    selectionKeyRegister.attach(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo();
                                } else if (selectableChannel.isOpen()) {
                                    selectableChannel.register(selector, 8, obj);
                                }
                            } else if (objPoll instanceof SocketChannel) {
                                SocketChannel socketChannel3 = (SocketChannel) objPoll;
                                SelectionKey selectionKeyRegister2 = socketChannel3.register(selector, 1, null);
                                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(socketChannel3, selectionKeyRegister2);
                                selectionKeyRegister2.attach(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2);
                                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo();
                            } else if (objPoll instanceof O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                                ((Runnable) objPoll).run();
                            } else {
                                if (!(objPoll instanceof Runnable)) {
                                    throw new IllegalArgumentException(objPoll.toString());
                                }
                                this.f1787O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.dispatch((Runnable) objPoll);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            socketChannel2 = null;
                        }
                    } catch (CancelledKeyException e2) {
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e2);
                    }
                    size = i;
                }
                int iSelectNow = selector.selectNow();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (iSelectNow == 0 && selector.selectedKeys().isEmpty()) {
                    if (this.f1783O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                        try {
                            Thread.sleep(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1791O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                        } catch (InterruptedException e3) {
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e3);
                        }
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                    this.f1777O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2050O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = jCurrentTimeMillis;
                    long jO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f1777O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                    long j = this.f1778O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.size() == 0 ? O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1792O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 : 0L;
                    if (j <= 0 || jO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o < 0 || j <= jO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                        jO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = j;
                    }
                    if (jO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o > 0) {
                        selector.select(jO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        this.f1777O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2050O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = jCurrentTimeMillis2;
                        if (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1789O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO > 0 && jCurrentTimeMillis2 - jCurrentTimeMillis <= 1) {
                            int i2 = this.f1781O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 + 1;
                            this.f1781O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i2;
                            if (i2 > O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1790O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                                this.f1783O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = true;
                                if (!this.f1784O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
                                    this.f1784O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = true;
                                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("Selector {} is too busy, pausing!", this);
                                }
                            }
                        }
                    }
                }
                if (this.f1779O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null && selector.isOpen()) {
                    for (SelectionKey selectionKey : selector.selectedKeys()) {
                        try {
                            try {
                                if (selectionKey.isValid()) {
                                    Object objAttachment = selectionKey.attachment();
                                    if (objAttachment instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
                                        if (selectionKey.isReadable() || selectionKey.isWritable()) {
                                            ((O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) objAttachment).O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo();
                                        }
                                    } else if (selectionKey.isConnectable()) {
                                        socketChannel = (SocketChannel) selectionKey.channel();
                                        try {
                                            try {
                                                if (socketChannel.finishConnect()) {
                                                    try {
                                                        selectionKey.interestOps(1);
                                                        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3 = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(socketChannel, selectionKey);
                                                        selectionKey.attach(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3);
                                                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo();
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        if (this.f1787O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.isRunning()) {
                                                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O00000OOoOOO00O00o0ooooooooO000ooooO0000(e);
                                                        } else {
                                                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
                                                        }
                                                        if (socketChannel != null) {
                                                            try {
                                                                socketChannel.close();
                                                            } catch (IOException e5) {
                                                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(e5);
                                                            }
                                                        }
                                                        if (selectionKey != null && !(selectionKey.channel() instanceof ServerSocketChannel) && selectionKey.isValid()) {
                                                            selectionKey.cancel();
                                                        }
                                                    }
                                                } else {
                                                    selectionKey.cancel();
                                                    socketChannel.close();
                                                }
                                            } catch (Throwable th3) {
                                                selectionKey.cancel();
                                                socketChannel.close();
                                                throw th3;
                                            }
                                        } catch (Exception e6) {
                                            this.f1787O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(socketChannel, e6, objAttachment);
                                            selectionKey.cancel();
                                        }
                                    } else {
                                        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4 = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO((SocketChannel) selectionKey.channel(), selectionKey);
                                        selectionKey.attach(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4);
                                        if (selectionKey.isReadable()) {
                                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo();
                                        }
                                    }
                                } else {
                                    selectionKey.cancel();
                                    O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) selectionKey.attachment();
                                    if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 != null) {
                                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
                                    }
                                }
                            } catch (CancelledKeyException e7) {
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e7);
                            }
                        } catch (Exception e8) {
                            e = e8;
                            socketChannel = null;
                        }
                    }
                    selector.selectedKeys().clear();
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    this.f1777O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2050O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = jCurrentTimeMillis3;
                    Object objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f1777O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                    while (objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null) {
                        if (objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO instanceof Runnable) {
                            this.f1787O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.dispatch((Runnable) objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                        }
                        objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f1777O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                    }
                    if (jCurrentTimeMillis3 - this.f1785O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 > O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1792O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                        this.f1785O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = jCurrentTimeMillis3;
                        this.f1787O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getClass();
                        this.f1787O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.dispatch(new O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, jCurrentTimeMillis3, 2));
                    }
                    int i3 = O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1789O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                    if (i3 > 0 && jCurrentTimeMillis3 > this.f1782O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
                        this.f1781O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = 0;
                        this.f1783O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = false;
                        this.f1782O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = jCurrentTimeMillis3 + ((long) i3);
                    }
                    this.f1780O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
                    return;
                }
                this.f1780O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
            } catch (CancelledKeyException e9) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e9);
            } catch (ClosedSelectorException e10) {
                if (this.f1787O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.isRunning()) {
                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O00000OOoOOO00O00o0ooooooooO000ooooO0000(e10);
                } else {
                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e10);
                }
            }
        } catch (Throwable th4) {
            this.f1780O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
            throw th4;
        }
    }

    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        try {
            synchronized (this) {
                try {
                    Selector selector = this.f1779O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    if (selector == null) {
                        return;
                    }
                    Selector selectorOpen = Selector.open();
                    for (SelectionKey selectionKey : selector.keys()) {
                        if (selectionKey.isValid() && selectionKey.interestOps() != 0) {
                            SelectableChannel selectableChannelChannel = selectionKey.channel();
                            Object objAttachment = selectionKey.attachment();
                            if (objAttachment == null) {
                                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(selectableChannelChannel);
                            } else if (objAttachment instanceof O00000OOoOOO00O00o0ooooooooO000ooooO0000) {
                                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(objAttachment);
                            } else {
                                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(selectableChannelChannel, objAttachment));
                            }
                        }
                    }
                    this.f1779O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.close();
                    this.f1779O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = selectorOpen;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("recreating selector", e);
        }
    }

    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        try {
            Selector selector = this.f1779O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (selector != null) {
                selector.wakeup();
            }
        } catch (Exception unused) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this));
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
        }
    }

    public final String toString() {
        Selector selector = this.f1779O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        String string = super.toString();
        int size = -1;
        Integer numValueOf = Integer.valueOf((selector == null || !selector.isOpen()) ? -1 : selector.keys().size());
        if (selector != null && selector.isOpen()) {
            size = selector.selectedKeys().size();
        }
        return String.format("%s keys=%d selected=%d", string, numValueOf, Integer.valueOf(size));
    }
}
