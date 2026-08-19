package O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;

import O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
import O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
import O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Runnable, O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 {

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public volatile O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 f1938O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public final Socket f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public final /* synthetic */ O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, Socket socket) {
        super(socket, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1828O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
        this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.f1938O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1822O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = socket;
    }

    @Override // O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) throws IOException {
        int iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = super.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        if (iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO < 0) {
            if (!O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO()) {
                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            }
            if (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0()) {
                close();
            }
        }
        return iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final void close() {
        if (this.f1938O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO instanceof O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = ((O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) this.f1938O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO).f1857O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1891O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            synchronized (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
            }
        }
        super.close();
    }

    /* JADX WARN: Type inference failed for: r0v73, types: [O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO] */
    /* JADX WARN: Type inference failed for: r1v51, types: [O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO] */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                try {
                    try {
                        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
                        synchronized (this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1943O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
                            this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1943O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.add(this);
                        }
                        while (this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.isStarted() && isOpen()) {
                            if (this.f1938O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO()) {
                                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                                org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO r1 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1823O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                                if (r1 != 0 ? r1.isLowOnThreads() : o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1822O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1926O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.isLowOnThreads()) {
                                    O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1829O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
                                }
                            }
                            this.f1938O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = this.f1938O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                        }
                        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, this.f1938O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
                        synchronized (this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1943O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
                            this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1943O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.remove(this);
                        }
                        try {
                            if (this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.isClosed()) {
                                return;
                            }
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            int i = this.f1737O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.setSoTimeout(i);
                            while (this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getInputStream().read() >= 0 && System.currentTimeMillis() - jCurrentTimeMillis < i) {
                            }
                            if (this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.isClosed()) {
                                return;
                            }
                            this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.close();
                        } catch (IOException e) {
                            e = e;
                            ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1941O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
                        }
                    } catch (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO e2) {
                        ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1941O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("EOF", e2);
                        try {
                            close();
                        } catch (IOException e3) {
                            ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1941O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e3);
                        }
                        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, this.f1938O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
                        synchronized (this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1943O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
                            this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1943O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.remove(this);
                            try {
                                if (this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.isClosed()) {
                                    return;
                                }
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                int i2 = this.f1737O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                                this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.setSoTimeout(i2);
                                while (this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getInputStream().read() >= 0 && System.currentTimeMillis() - jCurrentTimeMillis2 < i2) {
                                }
                                if (this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.isClosed()) {
                                    return;
                                }
                                this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.close();
                            } catch (IOException e4) {
                                e = e4;
                                ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1941O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
                            }
                        }
                    } catch (org.eclipse.jetty.http.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 e5) {
                        ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1941O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("BAD", e5);
                        try {
                            close();
                        } catch (IOException e6) {
                            ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1941O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e6);
                        }
                        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, this.f1938O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
                        synchronized (this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1943O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
                            this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1943O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.remove(this);
                            try {
                                if (this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.isClosed()) {
                                    return;
                                }
                                long jCurrentTimeMillis3 = System.currentTimeMillis();
                                int i3 = this.f1737O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                                this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.setSoTimeout(i3);
                                while (this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getInputStream().read() >= 0 && System.currentTimeMillis() - jCurrentTimeMillis3 < i3) {
                                }
                                if (this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.isClosed()) {
                                    return;
                                }
                                this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.close();
                            } catch (IOException e7) {
                                e = e7;
                                ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1941O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
                            }
                        }
                    }
                } catch (SocketException e8) {
                    ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1941O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("EOF", e8);
                    try {
                        close();
                    } catch (IOException e9) {
                        ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1941O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e9);
                    }
                    O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, this.f1938O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
                    synchronized (this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1943O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
                        this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1943O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.remove(this);
                        try {
                            if (this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.isClosed()) {
                                return;
                            }
                            long jCurrentTimeMillis4 = System.currentTimeMillis();
                            int i4 = this.f1737O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.setSoTimeout(i4);
                            while (this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getInputStream().read() >= 0 && System.currentTimeMillis() - jCurrentTimeMillis4 < i4) {
                            }
                            if (this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.isClosed()) {
                                return;
                            }
                            this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.close();
                        } catch (IOException e10) {
                            e = e10;
                            ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1941O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
                        }
                    }
                }
            } catch (Exception e11) {
                ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1941O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0("handle failed?", e11);
                try {
                    close();
                } catch (IOException e12) {
                    ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1941O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e12);
                }
                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, this.f1938O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
                synchronized (this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1943O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
                    this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1943O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.remove(this);
                    try {
                        if (this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.isClosed()) {
                            return;
                        }
                        long jCurrentTimeMillis5 = System.currentTimeMillis();
                        int i5 = this.f1737O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                        this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.setSoTimeout(i5);
                        while (this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getInputStream().read() >= 0 && System.currentTimeMillis() - jCurrentTimeMillis5 < i5) {
                        }
                        if (this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.isClosed()) {
                            return;
                        }
                        this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.close();
                    } catch (IOException e13) {
                        e = e13;
                        ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1941O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
                    }
                }
            }
        } catch (Throwable th) {
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, this.f1938O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
            synchronized (this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1943O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
                this.f1940O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1943O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.remove(this);
                try {
                    if (!this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.isClosed()) {
                        long jCurrentTimeMillis6 = System.currentTimeMillis();
                        int i6 = this.f1737O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                        this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.setSoTimeout(i6);
                        while (this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getInputStream().read() >= 0 && System.currentTimeMillis() - jCurrentTimeMillis6 < i6) {
                        }
                        if (!this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.isClosed()) {
                            this.f1939O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.close();
                        }
                    }
                } catch (IOException e14) {
                    ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1941O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e14);
                }
                throw th;
            }
        }
    }
}
