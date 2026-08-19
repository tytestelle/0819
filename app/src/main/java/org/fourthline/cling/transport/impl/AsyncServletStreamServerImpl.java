package org.fourthline.cling.transport.impl;

import O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
import O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
import O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jetty.servlet.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import org.fourthline.cling.model.message.Connection;
import org.fourthline.cling.transport.Router;
import org.fourthline.cling.transport.spi.InitializationException;
import org.fourthline.cling.transport.spi.StreamServer;

/* JADX INFO: loaded from: classes2.dex */
public class AsyncServletStreamServerImpl implements StreamServer<AsyncServletStreamServerConfigurationImpl> {
    private static final Logger log = Logger.getLogger(StreamServer.class.getName());
    protected final AsyncServletStreamServerConfigurationImpl configuration;
    protected String hostAddress;
    protected int localPort;
    private int mCounter = 0;

    public class AsyncServletConnection implements Connection {
        protected O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO request;

        public AsyncServletConnection(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            this.request = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        }

        @Override // org.fourthline.cling.model.message.Connection
        public InetAddress getLocalAddress() {
            try {
                O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = ((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) getRequest()).f1899O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                return InetAddress.getByName(o00000OOoOOO00O00o0ooooooooO000ooooO0000 == null ? null : o00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO());
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // org.fourthline.cling.model.message.Connection
        public InetAddress getRemoteAddress() {
            try {
                O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) getRequest();
                o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.getClass();
                O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1899O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                return InetAddress.getByName(o00000OOoOOO00O00o0ooooooooO000ooooO0000 == null ? null : o00000OOoOOO00O00o0ooooooooO000ooooO0000.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO());
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }
        }

        public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO getRequest() {
            return this.request;
        }

        @Override // org.fourthline.cling.model.message.Connection
        public boolean isOpen() {
            return AsyncServletStreamServerImpl.this.isConnectionOpen(getRequest());
        }
    }

    public AsyncServletStreamServerImpl(AsyncServletStreamServerConfigurationImpl asyncServletStreamServerConfigurationImpl) {
        this.configuration = asyncServletStreamServerConfigurationImpl;
    }

    public static /* synthetic */ int access$008(AsyncServletStreamServerImpl asyncServletStreamServerImpl) {
        int i = asyncServletStreamServerImpl.mCounter;
        asyncServletStreamServerImpl.mCounter = i + 1;
        return i;
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO createServlet(final Router router) {
        return new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() { // from class: org.fourthline.cling.transport.impl.AsyncServletStreamServerImpl.1
            @Override // O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
            public void service(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                final int iAccess$008 = AsyncServletStreamServerImpl.access$008(AsyncServletStreamServerImpl.this);
                if (AsyncServletStreamServerImpl.log.isLoggable(Level.FINE)) {
                    AsyncServletStreamServerImpl.log.fine(String.format("HttpServlet.service(): id: %3d, request URI: %s", Integer.valueOf(iAccess$008), ((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000()));
                }
                O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (!o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1892O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                    throw new IllegalStateException("!asyncSupported");
                }
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1891O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.getClass();
                O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f1877O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1857O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2.f1895O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1861O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
                synchronized (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                    try {
                        int i = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f1880O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        if (i != 1 && i != 6) {
                            throw new IllegalStateException(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
                        }
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f1882O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = false;
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f1883O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = false;
                        O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f1885O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 != null && o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2 == o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.f1654O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO && o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o == o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.f1655O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO && o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.f1873O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.getClass();
                        } else {
                            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f1885O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2, o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
                        }
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f1880O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = 2;
                        ArrayList arrayList = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f1878O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f1878O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f1879O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f1879O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = arrayList;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ArrayList arrayList2 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f1878O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        try {
                            ((O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) it.next()).onStartAsync(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f1885O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                        } catch (Exception e) {
                            ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f1876O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O).O00000OOoOOO00O00o0ooooooooO000ooooO0000(e);
                        }
                    }
                }
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1 = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1891O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1.O00000OOoOOO00O00o0ooooooooO000ooooO0000(AsyncServletStreamServerImpl.this.getConfiguration().getAsyncTimeoutSeconds() * 1000);
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() { // from class: org.fourthline.cling.transport.impl.AsyncServletStreamServerImpl.1.1
                    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
                    public void onComplete(O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (AsyncServletStreamServerImpl.log.isLoggable(Level.FINE)) {
                            AsyncServletStreamServerImpl.log.fine(String.format("AsyncListener.onComplete(): id: %3d, duration: %,4d, response: %s", Integer.valueOf(iAccess$008), Long.valueOf(jCurrentTimeMillis2), o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.f1655O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
                        }
                    }

                    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
                    public void onError(O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (AsyncServletStreamServerImpl.log.isLoggable(Level.FINE)) {
                            AsyncServletStreamServerImpl.log.fine(String.format("AsyncListener.onError(): id: %3d, duration: %,4d, response: %s", Integer.valueOf(iAccess$008), Long.valueOf(jCurrentTimeMillis2), o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.f1655O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
                        }
                    }

                    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
                    public void onStartAsync(O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2) {
                        if (AsyncServletStreamServerImpl.log.isLoggable(Level.FINE)) {
                            AsyncServletStreamServerImpl.log.fine(String.format("AsyncListener.onStartAsync(): id: %3d, request: %s", Integer.valueOf(iAccess$008), o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.f1654O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO));
                        }
                    }

                    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
                    public void onTimeout(O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (AsyncServletStreamServerImpl.log.isLoggable(Level.FINE)) {
                            AsyncServletStreamServerImpl.log.fine(String.format("AsyncListener.onTimeout(): id: %3d, duration: %,4d, request: %s", Integer.valueOf(iAccess$008), Long.valueOf(jCurrentTimeMillis2), o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.f1654O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO));
                        }
                    }
                });
                router.received(new AsyncServletUpnpStream(router.getProtocolFactory(), o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) { // from class: org.fourthline.cling.transport.impl.AsyncServletStreamServerImpl.1.2
                    @Override // org.fourthline.cling.transport.impl.AsyncServletUpnpStream
                    public Connection createConnection() {
                        return AsyncServletStreamServerImpl.this.new AsyncServletConnection(getRequest());
                    }
                });
            }
        };
    }

    @Override // org.fourthline.cling.transport.spi.StreamServer
    public synchronized int getPort() {
        return this.localPort;
    }

    @Override // org.fourthline.cling.transport.spi.StreamServer
    public synchronized void init(InetAddress inetAddress, Router router) {
        try {
            try {
                Logger logger = log;
                Level level = Level.FINE;
                if (logger.isLoggable(level)) {
                    logger.fine("Setting executor service on servlet container adapter");
                }
                getConfiguration().getServletContainerAdapter().setExecutorService(router.getConfiguration().getStreamServerExecutorService());
                if (logger.isLoggable(level)) {
                    logger.fine("Adding connector: " + inetAddress + ":" + getConfiguration().getListenPort());
                }
                this.hostAddress = inetAddress.getHostAddress();
                this.localPort = getConfiguration().getServletContainerAdapter().addConnector(this.hostAddress, getConfiguration().getListenPort());
                getConfiguration().getServletContainerAdapter().registerServlet(router.getConfiguration().getNamespace().getBasePath().getPath(), createServlet(router));
            } catch (Exception e) {
                throw new InitializationException("Could not initialize " + getClass().getSimpleName() + ": " + e.toString(), e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean isConnectionOpen(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        getConfiguration().getServletContainerAdapter().startIfNotRunning();
    }

    @Override // org.fourthline.cling.transport.spi.StreamServer
    public synchronized void stop() {
        getConfiguration().getServletContainerAdapter().removeConnector(this.hostAddress, this.localPort);
    }

    @Override // org.fourthline.cling.transport.spi.StreamServer
    public AsyncServletStreamServerConfigurationImpl getConfiguration() {
        return this.configuration;
    }
}
