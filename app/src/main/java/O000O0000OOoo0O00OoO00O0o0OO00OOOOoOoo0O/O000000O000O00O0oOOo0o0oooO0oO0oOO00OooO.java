package O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;

import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
import O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
import O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO extends O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, reason: collision with root package name */
    public static final O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f1941O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

    /* JADX INFO: renamed from: O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o, reason: collision with root package name */
    public ServerSocket f1942O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

    /* JADX INFO: renamed from: O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, reason: collision with root package name */
    public volatile int f1944O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = -1;

    /* JADX INFO: renamed from: O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, reason: collision with root package name */
    public final HashSet f1943O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = new HashSet();

    static {
        Properties properties = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f1941O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.class.getName());
    }

    public static void O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1832O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.get() == -1) {
            return;
        }
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1833O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
        long jAddAndGet = ((AtomicLong) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).addAndGet(1L);
        ((AtomicLong) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).addAndGet(1L);
        AtomicLong atomicLong = (AtomicLong) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        for (long j = atomicLong.get(); jAddAndGet > j && !atomicLong.compareAndSet(j, jAddAndGet); j = atomicLong.get()) {
        }
    }

    public static void O00000OOoOOO00O00o0ooooooooO000ooooO0000(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getClass();
        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.onClose();
        if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1832O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.get() == -1) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00).f1709O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1834O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO ? ((O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00).f1851O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo : 0);
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1833O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
        long jAddAndGet = ((AtomicLong) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).addAndGet(-1L);
        AtomicLong atomicLong = (AtomicLong) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f227O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        for (long j = atomicLong.get(); jAddAndGet > j && !atomicLong.compareAndSet(j, jAddAndGet); j = atomicLong.get()) {
        }
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1835O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(jCurrentTimeMillis);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO] */
    @Override // O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final void O00000O00oOOo000000OOOo00OOOo0OooOO00OO0() throws IOException {
        Socket socketAccept = this.f1942O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.accept();
        try {
            socketAccept.setTcpNoDelay(true);
            int i = this.f1830O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
            if (i >= 0) {
                socketAccept.setSoLinger(true, i / 1000);
            } else {
                socketAccept.setSoLinger(false, 0);
            }
        } catch (Exception e) {
            ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1821O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
        }
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, socketAccept);
        Object r2 = this.f1823O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (r2 == 0 || !r2.dispatch(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO)) {
            ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f1941O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("dispatch failed for {}", o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1938O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.close();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO] */
    /* JADX WARN: Type inference failed for: r0v2, types: [O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO] */
    public final void O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) throws SocketException {
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o00000OOoOOO00O00o0ooooooooO000ooooO0000;
        Object r0 = this.f1823O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(r0 != 0 ? r0.isLowOnThreads() : this.f1822O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1926O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.isLowOnThreads() ? this.f1829O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO : this.f1828O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
    }

    public final void O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o() throws SocketException {
        ServerSocket serverSocket = this.f1942O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
        if (serverSocket == null || serverSocket.isClosed()) {
            String str = this.f1824O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            int i = this.f1825O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
            this.f1942O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = str == null ? new ServerSocket(i, 0) : new ServerSocket(i, 0, InetAddress.getByName(str));
        }
        this.f1942O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.setReuseAddress(this.f1827O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        this.f1944O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = this.f1942O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.getLocalPort();
        if (this.f1944O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 > 0) {
            return;
        }
        throw new IllegalStateException("port not allocated for " + this);
    }

    @Override // O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, org.eclipse.jetty.util.component.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final void doStart() {
        this.f1943O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.clear();
        super.doStart();
    }

    @Override // O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, org.eclipse.jetty.util.component.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final void doStop() {
        super.doStop();
        HashSet hashSet = new HashSet();
        synchronized (this.f1943O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
            hashSet.addAll(this.f1943O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) ((O00000OOoOOO00O00o0ooooooooO000ooooO0000) it.next())).close();
        }
    }
}
