package org.fourthline.cling.transport.impl.jetty;

import O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
import O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jetty.servlet.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import org.fourthline.cling.transport.spi.ServletContainerAdapter;

/* JADX INFO: loaded from: classes2.dex */
public class JettyServletContainer implements ServletContainerAdapter {
    protected O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 server;
    private static final Logger log = Logger.getLogger(JettyServletContainer.class.getName());
    public static final JettyServletContainer INSTANCE = new JettyServletContainer();

    private JettyServletContainer() {
        resetServer();
    }

    public static boolean isConnectionOpen(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        return isConnectionOpen(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, " ".getBytes());
    }

    @Override // org.fourthline.cling.transport.spi.ServletContainerAdapter
    public synchronized int addConnector(String str, int i) {
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1824O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = str;
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1825O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = i;
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = this.server;
        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o((O000000oooOoo00ooo0O0000000o00O0Oooo0OOO[]) O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.addToArray(o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f1927O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.class));
        if (this.server.isStarted()) {
            try {
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.start();
            } catch (Exception e) {
                log.severe("Couldn't start connector: " + o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + " " + e);
                throw new RuntimeException(e);
            }
        }
        return o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1944O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
    }

    @Override // org.fourthline.cling.transport.spi.ServletContainerAdapter
    public synchronized void registerServlet(String str, O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        try {
            if (this.server.f1963O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
                return;
            }
            log.info("Registering UPnP servlet under context path: " + str);
            org.eclipse.jetty.servlet.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new org.eclipse.jetty.servlet.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
            if (str != null && str.length() > 0) {
                o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(str);
            }
            o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO));
            this.server.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.fourthline.cling.transport.spi.ServletContainerAdapter
    public synchronized void removeConnector(String str, int i) {
        try {
            Object[] objArr = this.server.f1927O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
            for (Object obj : objArr) {
                if (((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) obj).f1824O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.equals(str) && ((O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) obj).f1944O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 == i) {
                    org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) obj;
                    if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isStarted() || o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isStarting()) {
                        try {
                            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.stop();
                        } catch (Exception e) {
                            log.severe("Couldn't stop connector: " + obj + " " + e);
                            throw new RuntimeException(e);
                        }
                    }
                    O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = this.server;
                    o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o((O000000oooOoo00ooo0O0000000o00O0Oooo0OOO[]) O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.removeFromArray(o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f1927O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, obj));
                    if (objArr.length != 1) {
                        break;
                    }
                    log.info("No more connectors, stopping Jetty server");
                    stopIfRunning();
                    break;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void resetServer() {
        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = new O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
        this.server = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
        o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f1929O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = 1000;
    }

    @Override // org.fourthline.cling.transport.spi.ServletContainerAdapter
    public synchronized void setExecutorService(ExecutorService executorService) {
        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = INSTANCE.server;
        if (o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f1926O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null) {
            O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(executorService) { // from class: org.fourthline.cling.transport.impl.jetty.JettyServletContainer.1
                @Override // org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
                public void doStop() {
                }
            };
            org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f1926O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 != null) {
                o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2);
            }
            o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f1925O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f1926O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "threadpool", false);
            o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f1926O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
    }

    @Override // org.fourthline.cling.transport.spi.ServletContainerAdapter
    public synchronized void startIfNotRunning() {
        if (!this.server.isStarted() && !this.server.isStarting()) {
            log.info("Starting Jetty server... ");
            try {
                this.server.start();
            } catch (Exception e) {
                log.severe("Couldn't start Jetty server: " + e);
                throw new RuntimeException(e);
            }
        }
    }

    @Override // org.fourthline.cling.transport.spi.ServletContainerAdapter
    public synchronized void stopIfRunning() {
        if (!this.server.isStopped() && !this.server.isStopping()) {
            log.info("Stopping Jetty server...");
            try {
                try {
                    this.server.stop();
                    resetServer();
                } catch (Exception e) {
                    log.severe("Couldn't stop Jetty server: " + e);
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                resetServer();
                throw th;
            }
        }
    }

    public static boolean isConnectionOpen(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, byte[] bArr) {
        Socket socket = (Socket) ((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f1894O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getTransport();
        Logger logger = log;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("Checking if client connection is still open: " + socket.getRemoteSocketAddress());
        }
        try {
            socket.getOutputStream().write(bArr);
            socket.getOutputStream().flush();
            return true;
        } catch (IOException unused) {
            Logger logger2 = log;
            if (!logger2.isLoggable(Level.FINE)) {
                return false;
            }
            logger2.fine("Client connection has been closed: " + socket.getRemoteSocketAddress());
            return false;
        }
    }
}
