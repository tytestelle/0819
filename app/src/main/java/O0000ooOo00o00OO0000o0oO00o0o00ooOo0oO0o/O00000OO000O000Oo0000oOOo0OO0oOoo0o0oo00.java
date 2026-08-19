package O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o;

import O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 extends O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, reason: collision with root package name */
    public static final O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f1803O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(0);

    /* JADX INFO: renamed from: O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, reason: collision with root package name */
    public static final ThreadLocal f1804O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = new ThreadLocal();

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f1805O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final SSLEngine f1806O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final SSLSession f1807O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f1808O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public final O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 f1809O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public int f1810O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo f1811O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f1812O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f1813O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f1814O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public final O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f1815O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public final boolean f1816O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public boolean f1817O00000OOoOOO00O00o0ooooooooO000ooooO0000;

    /* JADX INFO: renamed from: O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, reason: collision with root package name */
    public boolean f1818O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

    /* JADX INFO: renamed from: O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o, reason: collision with root package name */
    public boolean f1819O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;

    /* JADX INFO: renamed from: O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o, reason: collision with root package name */
    public final AtomicBoolean f1820O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(SSLEngine sSLEngine, O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
        super(o00000OOoOOO00O00o0ooooooooO000ooooO0000, System.currentTimeMillis());
        this.f1805O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO("org.eclipse.jetty.io.nio.ssl");
        this.f1816O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = true;
        this.f1820O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = new AtomicBoolean();
        this.f1806O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = sSLEngine;
        this.f1807O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = sSLEngine.getSession();
        this.f1815O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = (O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o00000OOoOOO00O00o0ooooooooO000ooooO0000;
        this.f1809O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(this);
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00
    public final O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f1805O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = this.f1809O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        try {
            O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
            boolean zO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = true;
            while (zO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
                zO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f1806O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING ? O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(null, null) : false;
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1808O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != this.f1808O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 && o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null) {
                    this.f1808O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    zO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = true;
                }
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("{} handle {} progress={}", this.f1807O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, this, Boolean.valueOf(zO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO));
            }
            return this;
        } finally {
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
            if (!this.f1818O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO && o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() && o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.isOpen()) {
                this.f1818O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = true;
                try {
                    this.f1808O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                } catch (Throwable th) {
                    O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0("onInputShutdown failed", th);
                    try {
                        o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.close();
                    } catch (IOException e) {
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
                    }
                }
            }
        }
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00
    public final boolean O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        return false;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00
    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(long j) {
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f1805O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        try {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("onIdleExpired {}ms on {}", Long.valueOf(j), this);
            boolean zO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = this.f1809O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
            if (zO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.close();
            } else {
                o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
            }
        } catch (IOException e) {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O00000OOoOOO00O00o0ooooooooO000ooooO0000(e);
            super.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(j);
        }
    }

    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        synchronized (this) {
            try {
                int i = this.f1810O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                this.f1810O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = i + 1;
                if (i == 0 && this.f1811O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO == null) {
                    ThreadLocal threadLocal = f1804O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = (O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) threadLocal.get();
                    this.f1811O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                    if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo == null) {
                        this.f1811O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this.f1807O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getPacketBufferSize() * 2, this.f1807O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getApplicationBufferSize() * 2);
                    }
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2 = this.f1811O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                    this.f1812O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2.f1799O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    this.f1814O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2.f1800O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    this.f1813O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2.f1801O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    threadLocal.set(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001) {
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002;
        int i;
        boolean z;
        int iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
        boolean z2;
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo003 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001;
        boolean z3 = false;
        synchronized (this) {
            try {
                try {
                    O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
                    if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null) {
                        this.f1813O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002 = this.f1813O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                    } else {
                        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() < this.f1807O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.getApplicationBufferSize()) {
                            boolean zO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(null, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo003);
                            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f1813O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                            if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null || !o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0()) {
                                O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                                return zO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                            }
                            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = this.f1813O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2));
                            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                            return true;
                        }
                        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3 = this.f1813O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                        if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3 != null && o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo3.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0()) {
                            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo4 = this.f1813O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo4.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo4));
                            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                            return true;
                        }
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                    }
                    if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo003 == null) {
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo003 = f1803O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
                    }
                    O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo004 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo003;
                    boolean z4 = true;
                    boolean z5 = false;
                    while (z4) {
                        try {
                            if (this.f1812O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000OOoOOO00O00o0ooooooooO000ooooO0000() > 0) {
                                int iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f1812O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
                                i = iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                                z = iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO > 0;
                            } else {
                                z = false;
                                i = 0;
                            }
                            try {
                                try {
                                    if (this.f1814O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0()) {
                                        iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(this.f1814O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
                                        if (iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 > 0) {
                                            z = true;
                                        }
                                    } else {
                                        iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = 0;
                                    }
                                    try {
                                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1805O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("{} {} {} filled={}/{} flushed={}/{}", this.f1807O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, this, this.f1806O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getHandshakeStatus(), Integer.valueOf(i), Integer.valueOf(this.f1812O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O()), Integer.valueOf(iO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0), Integer.valueOf(this.f1814O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O()));
                                        int i2 = O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1797O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[this.f1806O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getHandshakeStatus().ordinal()];
                                        if (i2 == 1) {
                                            throw new IllegalStateException();
                                        }
                                        if (i2 != 2) {
                                            if (i2 == 3) {
                                                while (true) {
                                                    Runnable delegatedTask = this.f1806O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getDelegatedTask();
                                                    if (delegatedTask == null) {
                                                        break;
                                                    }
                                                    delegatedTask.run();
                                                    z = true;
                                                }
                                            } else if (i2 != 4) {
                                                if (i2 == 5) {
                                                    if (this.f1817O00000OOoOOO00O00o0ooooooooO000ooooO0000 && !this.f1816O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
                                                        this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.close();
                                                    } else if (!this.f1812O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0() && i == -1) {
                                                        this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                                                    } else if (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002)) {
                                                    }
                                                }
                                            } else if (this.f1817O00000OOoOOO00O00o0ooooooooO000ooooO0000 && !this.f1816O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
                                                this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.close();
                                            } else if (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo004)) {
                                            }
                                        } else {
                                            if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002.O00000OOoOOO00O00o0ooooooooO000ooooO0000() > 0 && this.f1812O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0() && O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002)) {
                                                z = true;
                                            }
                                            O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo004;
                                            z2 = (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0() && this.f1814O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000OOoOOO00O00o0ooooooooO000ooooO0000() > 0 && O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO)) ? true : z;
                                        }
                                        if (this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isOpen() && this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() && !this.f1812O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0()) {
                                            try {
                                                this.f1806O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.closeInbound();
                                            } catch (SSLException e) {
                                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1805O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(e);
                                            }
                                        }
                                        if (this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isOpen() && this.f1806O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.isOutboundDone() && !this.f1814O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0()) {
                                            this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
                                        }
                                        z5 |= z2;
                                        z4 = z2;
                                    } catch (Throwable th) {
                                        th = th;
                                        z3 = z5;
                                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                                        if (z3) {
                                            this.f1820O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.set(true);
                                        }
                                        throw th;
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                    this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.close();
                                    throw e;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1805O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("{} {} {} filled={}/{} flushed={}/{}", this.f1807O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, this, this.f1806O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getHandshakeStatus(), Integer.valueOf(i), Integer.valueOf(this.f1812O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O()), 0, Integer.valueOf(this.f1814O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O()));
                                throw th;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            i = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            i = 0;
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1805O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("{} {} {} filled={}/{} flushed={}/{}", this.f1807O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, this, this.f1806O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getHandshakeStatus(), Integer.valueOf(i), Integer.valueOf(this.f1812O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O()), 0, Integer.valueOf(this.f1814O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O()));
                            throw th;
                        }
                    }
                    O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo5 = this.f1813O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                    if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002 == o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo5 && o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo5.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0()) {
                        this.f1808O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.getClass();
                        this.f1815O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
                    }
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                    if (z5) {
                        this.f1820O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.set(true);
                    }
                    return z5;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        synchronized (this) {
            try {
                int i = this.f1810O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 - 1;
                this.f1810O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = i;
                if (i == 0 && this.f1811O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO != null && this.f1812O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() == 0 && this.f1814O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() == 0 && this.f1813O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() == 0) {
                    this.f1812O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = null;
                    this.f1814O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
                    this.f1813O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = null;
                    f1804O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.set(this.f1811O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
                    this.f1811O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        SSLEngineResult sSLEngineResultUnwrap;
        int iPosition;
        int iPosition2;
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        boolean z = true;
        synchronized (this) {
            try {
                if (!this.f1812O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0()) {
                    return false;
                }
                ByteBuffer byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.buffer() instanceof O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 ? ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.buffer()).O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo() : ByteBuffer.wrap(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo());
                synchronized (byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
                    ByteBuffer byteBuffer = this.f1812O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1754O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
                    synchronized (byteBuffer) {
                        try {
                            try {
                                try {
                                    byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.position(((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                                    byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.limit(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO());
                                    int iPosition3 = byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.position();
                                    byteBuffer.position(this.f1812O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                                    byteBuffer.limit(this.f1812O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                                    int iPosition4 = byteBuffer.position();
                                    sSLEngineResultUnwrap = this.f1806O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.unwrap(byteBuffer, byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
                                    if (((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1805O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo()) {
                                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1805O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("{} unwrap {} {} consumed={} produced={}", this.f1807O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, sSLEngineResultUnwrap.getStatus(), sSLEngineResultUnwrap.getHandshakeStatus(), Integer.valueOf(sSLEngineResultUnwrap.bytesConsumed()), Integer.valueOf(sSLEngineResultUnwrap.bytesProduced()));
                                    }
                                    iPosition = byteBuffer.position() - iPosition4;
                                    this.f1812O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(iPosition);
                                    this.f1812O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();
                                    iPosition2 = byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.position() - iPosition3;
                                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + iPosition2);
                                    byteBuffer.position(0);
                                    byteBuffer.limit(byteBuffer.capacity());
                                    byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.position(0);
                                    byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.limit(byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.capacity());
                                } catch (SSLException e) {
                                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1805O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(String.valueOf(this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO), e);
                                    this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.close();
                                    throw e;
                                } catch (Exception e2) {
                                    throw new IOException(e2);
                                }
                            } catch (IOException e3) {
                                throw e3;
                            }
                        } catch (Throwable th) {
                            byteBuffer.position(0);
                            byteBuffer.limit(byteBuffer.capacity());
                            byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.position(0);
                            byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.limit(byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.capacity());
                            throw th;
                        }
                    }
                }
                int i = O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1798O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[sSLEngineResultUnwrap.getStatus().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1805O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("{} wrap default {}", this.f1807O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, sSLEngineResultUnwrap);
                                throw new IOException(sSLEngineResultUnwrap.toString());
                            }
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1805O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("unwrap CLOSE {} {}", this, sSLEngineResultUnwrap);
                            if (sSLEngineResultUnwrap.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                                this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.close();
                            }
                        } else if (sSLEngineResultUnwrap.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                            this.f1817O00000OOoOOO00O00o0ooooooooO000ooooO0000 = true;
                        }
                    } else if (((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1805O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo()) {
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1805O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("{} unwrap {} {}->{}", this.f1807O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, sSLEngineResultUnwrap.getStatus(), this.f1812O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(), o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o());
                    }
                } else if (this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO()) {
                    this.f1812O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.clear();
                }
                if (iPosition <= 0 && iPosition2 <= 0) {
                    z = false;
                }
                return z;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized boolean O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        SSLEngineResult sSLEngineResultWrap;
        int iPosition;
        int iPosition2;
        boolean z = true;
        synchronized (this) {
            try {
                ByteBuffer byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.buffer() instanceof O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 ? ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.buffer()).O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo() : ByteBuffer.wrap(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo());
                synchronized (byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
                    this.f1814O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();
                    ByteBuffer byteBuffer = this.f1814O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f1754O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
                    synchronized (byteBuffer) {
                        try {
                            try {
                                try {
                                    byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.position(((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                                    byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.limit(((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                                    int iPosition3 = byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.position();
                                    byteBuffer.position(this.f1814O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                                    byteBuffer.limit(byteBuffer.capacity());
                                    int iPosition4 = byteBuffer.position();
                                    sSLEngineResultWrap = this.f1806O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.wrap(byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, byteBuffer);
                                    if (((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1805O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo()) {
                                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1805O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("{} wrap {} {} consumed={} produced={}", this.f1807O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, sSLEngineResultWrap.getStatus(), sSLEngineResultWrap.getHandshakeStatus(), Integer.valueOf(sSLEngineResultWrap.bytesConsumed()), Integer.valueOf(sSLEngineResultWrap.bytesProduced()));
                                    }
                                    iPosition = byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.position() - iPosition3;
                                    ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(iPosition);
                                    iPosition2 = byteBuffer.position() - iPosition4;
                                    O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f1814O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + iPosition2);
                                    byteBuffer.position(0);
                                    byteBuffer.limit(byteBuffer.capacity());
                                    byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.position(0);
                                    byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.limit(byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.capacity());
                                } catch (SSLException e) {
                                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1805O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(String.valueOf(this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO), e);
                                    this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.close();
                                    throw e;
                                } catch (Exception e2) {
                                    throw new IOException(e2);
                                }
                            } catch (IOException e3) {
                                throw e3;
                            }
                        } catch (Throwable th) {
                            byteBuffer.position(0);
                            byteBuffer.limit(byteBuffer.capacity());
                            byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.position(0);
                            byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.limit(byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.capacity());
                            throw th;
                        }
                    }
                }
                int i = O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1798O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[sSLEngineResultWrap.getStatus().ordinal()];
                if (i == 1) {
                    throw new IllegalStateException();
                }
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1805O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("{} wrap default {}", this.f1807O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, sSLEngineResultWrap);
                            throw new IOException(sSLEngineResultWrap.toString());
                        }
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1805O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("wrap CLOSE {} {}", this, sSLEngineResultWrap);
                        if (sSLEngineResultWrap.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                            this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.close();
                        }
                    } else if (sSLEngineResultWrap.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                        this.f1817O00000OOoOOO00O00o0ooooooooO000ooooO0000 = true;
                    }
                }
                if (iPosition <= 0 && iPosition2 <= 0) {
                    z = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00
    public final void onClose() {
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f1809O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1802O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1808O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null || o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == this) {
            return;
        }
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.onClose();
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
    public final String toString() {
        StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(super.toString(), " ");
        sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(this.f1809O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
        return sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.toString();
    }

    @Override // O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
    }
}
