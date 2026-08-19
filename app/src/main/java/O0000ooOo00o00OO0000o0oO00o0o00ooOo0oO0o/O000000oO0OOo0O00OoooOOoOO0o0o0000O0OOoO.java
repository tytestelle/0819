package O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o;

import O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
import androidx.media3.exoplayer.Renderer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO extends O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 {

    /* JADX INFO: renamed from: O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO("org.eclipse.jetty.io.nio");

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public final boolean f1756O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public final O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO f1757O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public final O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O f1758O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public SelectionKey f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public final O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f1760O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public int f1761O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public volatile O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f1762O00000OOoOOO00O00o0ooooooooO000ooooO0000;

    /* JADX INFO: renamed from: O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, reason: collision with root package name */
    public int f1763O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

    /* JADX INFO: renamed from: O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o, reason: collision with root package name */
    public boolean f1764O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;

    /* JADX INFO: renamed from: O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o, reason: collision with root package name */
    public volatile boolean f1765O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

    /* JADX INFO: renamed from: O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, reason: collision with root package name */
    public boolean f1766O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;

    /* JADX INFO: renamed from: O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, reason: collision with root package name */
    public boolean f1767O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;

    /* JADX INFO: renamed from: O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, reason: collision with root package name */
    public boolean f1768O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

    /* JADX INFO: renamed from: O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, reason: collision with root package name */
    public volatile long f1769O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;

    /* JADX INFO: renamed from: O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo, reason: collision with root package name */
    public volatile boolean f1770O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
    public boolean O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O;

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(SocketChannel socketChannel, O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, SelectionKey selectionKey, int i) {
        super(socketChannel, i);
        this.f1756O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = System.getProperty("os.name").toLowerCase(Locale.ENGLISH).contains("win");
        this.f1760O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, 12);
        this.f1765O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = true;
        this.f1758O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1787O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        this.f1757O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        this.f1763O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = 0;
        this.f1764O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = false;
        this.f1768O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = true;
        this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = selectionKey;
        O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(true);
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) {
        this.f1746O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = i;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) throws Throwable {
        int i = -1;
        if (!this.f1747O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000Buffer = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.buffer();
            if (!(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000Buffer instanceof O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0)) {
                throw new IOException("Not Implemented");
            }
            ByteBuffer byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000Buffer).O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
            int i2 = 0;
            try {
                synchronized (byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
                    try {
                        try {
                            byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.position(((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                            int i3 = this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.read(byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
                            try {
                                ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.position());
                                byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.position(0);
                                if (i3 < 0) {
                                    try {
                                        if (this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isOpen()) {
                                            if (!O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO()) {
                                                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                                            }
                                            if (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0()) {
                                                this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.close();
                                            }
                                        }
                                    } catch (IOException e) {
                                        e = e;
                                        i2 = i3;
                                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1740O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("Exception while filling", e);
                                        try {
                                            if (this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isOpen()) {
                                                this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.close();
                                            }
                                        } catch (Exception e2) {
                                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1740O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e2);
                                        }
                                        if (i2 > 0) {
                                            throw e;
                                        }
                                    }
                                }
                                i = i3;
                            } catch (Throwable th) {
                                th = th;
                                i2 = i3;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.position());
                            byteBufferO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.position(0);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } catch (IOException e3) {
                e = e3;
            }
        }
        if (i > 0) {
            this.f1769O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = System.currentTimeMillis();
        }
        return i;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final boolean O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(long j) {
        O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        synchronized (this) {
            if (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO()) {
                throw new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
            }
            long j2 = this.f1757O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1777O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2050O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            long j3 = j2 + j;
            boolean z = this.f1770O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
            O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(true);
            try {
                this.f1766O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = true;
                while (!O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() && this.f1766O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
                    try {
                        try {
                            O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                            wait(j > 0 ? j3 - j2 : Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
                            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f1757O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1777O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        } catch (Throwable th) {
                            long j4 = this.f1757O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1777O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2050O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            throw th;
                        }
                    } catch (InterruptedException e) {
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O00000OOoOOO00O00o0ooooooooO000ooooO0000(e);
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f1757O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1777O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    }
                    j2 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f2050O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    if (this.f1766O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 && j > 0 && j2 >= j3) {
                        this.f1766O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = false;
                        O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(z);
                        return false;
                    }
                }
                this.f1766O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = false;
                O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(z);
                return true;
            } catch (Throwable th2) {
                this.f1766O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = false;
                O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(z);
                throw th2;
            }
        }
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
        this.f1757O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getClass();
        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() {
        synchronized (this) {
            try {
                if (this.f1763O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO <= 0) {
                    if (this.f1764O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) {
                        this.f1763O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = -1;
                    } else {
                        this.f1763O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = 1;
                        if (!this.f1758O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.dispatch(this.f1760O00000O00oOOo000000OOOo00OOOo0OooOO00OO0)) {
                            this.f1763O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = -1;
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("Dispatched Failed! " + this + " to " + this.f1758O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, new Object[0]);
                            O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final boolean O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo() {
        return false;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final boolean O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(long j) {
        O000O00oOO0Oo0Oo00oOOo0OOoO00oOOo0ooO0O0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        synchronized (this) {
            if (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0()) {
                throw new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
            }
            long j2 = this.f1757O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1777O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2050O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            long j3 = j2 + j;
            boolean z = this.f1770O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
            O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(true);
            try {
                this.f1767O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = true;
                while (this.f1767O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 && !O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0()) {
                    try {
                        try {
                            O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                            wait(j > 0 ? j3 - j2 : Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
                            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f1757O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1777O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        } catch (Throwable th) {
                            long j4 = this.f1757O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1777O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2050O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            throw th;
                        }
                    } catch (InterruptedException e) {
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O00000OOoOOO00O00o0ooooooooO000ooooO0000(e);
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f1757O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1777O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    }
                    j2 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f2050O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    if (this.f1767O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 && j > 0 && j2 >= j3) {
                        this.f1767O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = false;
                        O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(z);
                        return false;
                    }
                }
                this.f1767O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = false;
                O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(z);
                return true;
            } catch (Throwable th2) {
                this.f1767O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = false;
                O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(z);
                throw th2;
            }
        }
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    public final O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00() {
        return this.f1762O00000OOoOOO00O00o0ooooooooO000ooooO0000;
    }

    @Override // O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final int O00000OOoOOO00O00o0ooooooooO000ooooO0000(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001) {
        int iO00000OOoOOO00O00o0ooooooooO000ooooO0000 = super.O00000OOoOOO00O00o0ooooooooO000ooooO0000(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001);
        if (iO00000OOoOOO00O00o0ooooooooO000ooooO0000 == 0 && ((o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != null && ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0()) || (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 != null && ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001).O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0()))) {
            synchronized (this) {
                try {
                    this.f1765O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = false;
                    if (this.f1763O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO < 1) {
                        O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (iO00000OOoOOO00O00o0ooooooooO000ooooO0000 > 0) {
            this.f1765O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = true;
            this.f1769O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = System.currentTimeMillis();
        }
        return iO00000OOoOOO00O00o0ooooooooO000ooooO0000;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, long j) {
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = this.f1757O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.getClass();
        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1777O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, j);
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o() {
        synchronized (this) {
            try {
                int i = this.f1763O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
                if (i == -1 || i == 0) {
                    O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
                } else if (i == 1 || i == 2) {
                    this.f1763O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = 2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    public final void O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f1762O00000OOoOOO00O00o0ooooooooO000ooooO0000;
        this.f1762O00000OOoOOO00O00o0ooooooooO000ooooO0000 = (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null || o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == this.f1762O00000OOoOOO00O00o0ooooooooO000ooooO0000) {
            return;
        }
        this.f1758O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.getClass();
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final int O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) throws IOException {
        int iWrite;
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000Buffer = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.buffer();
        boolean z = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000Buffer instanceof O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        SocketChannel socketChannel = this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (z) {
            ByteBuffer byteBufferAsReadOnlyBuffer = ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000Buffer).O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().asReadOnlyBuffer();
            O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            byteBufferAsReadOnlyBuffer.position(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            byteBufferAsReadOnlyBuffer.limit(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
            iWrite = socketChannel.write(byteBufferAsReadOnlyBuffer);
            if (iWrite > 0) {
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(iWrite);
            }
        } else {
            if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() == null) {
                throw new IOException("Not Implemented");
            }
            O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = (O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            iWrite = socketChannel.write(ByteBuffer.wrap(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(), o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O()));
            if (iWrite > 0) {
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(iWrite);
            }
        }
        if (iWrite == 0 && ((O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0()) {
            synchronized (this) {
                try {
                    this.f1765O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = false;
                    if (this.f1763O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO < 1) {
                        O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (iWrite > 0) {
            this.f1765O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = true;
            this.f1769O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = System.currentTimeMillis();
        }
        return iWrite;
    }

    public final void O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() {
        synchronized (this) {
            try {
                if (!this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isOpen()) {
                    SelectionKey selectionKey = this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                    if (selectionKey != null && selectionKey.isValid()) {
                        this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.cancel();
                    }
                    if (this.f1768O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O) {
                        this.f1768O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = false;
                        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = this.f1757O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.getClass();
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("destroyEndPoint {}", this);
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1786O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.remove(this);
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1787O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getClass();
                    }
                    this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
                } else if (this.f1761O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 > 0) {
                    SelectionKey selectionKey2 = this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                    if (selectionKey2 != null && selectionKey2.isValid()) {
                        this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.interestOps(this.f1761O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
                    } else if (this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isRegistered()) {
                        O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                    } else {
                        try {
                            this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.register(this.f1757O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1779O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f1761O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, this);
                        } catch (Exception e) {
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
                            SelectionKey selectionKey3 = this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                            if (selectionKey3 != null && selectionKey3.isValid()) {
                                this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.cancel();
                            }
                            if (this.f1768O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O) {
                                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = this.f1757O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
                                o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2.getClass();
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("destroyEndPoint {}", this);
                                o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2.f1786O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.remove(this);
                                o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2.f1787O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getClass();
                            }
                            this.f1768O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = false;
                            this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
                        }
                    }
                } else {
                    SelectionKey selectionKey4 = this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                    if (selectionKey4 == null || !selectionKey4.isValid()) {
                        this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
                    } else {
                        this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.interestOps(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(long j) {
        try {
            synchronized (this) {
                this.f1764O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = true;
            }
            this.f1762O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(j);
            synchronized (this) {
                try {
                    this.f1764O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = false;
                    if (this.f1763O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO == -1) {
                        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            synchronized (this) {
                try {
                    this.f1764O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = false;
                    if (this.f1763O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO == -1) {
                        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
                    }
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final void O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo() {
        synchronized (this) {
            try {
                SelectionKey selectionKey = this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                if (selectionKey != null && selectionKey.isValid()) {
                    boolean z = this.f1766O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
                    if (!z && !this.f1767O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) {
                        if ((this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.readyOps() & 4) == 4 && (this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.interestOps() & 4) == 4) {
                            int iInterestOps = this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.interestOps() & (-5);
                            this.f1761O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = iInterestOps;
                            this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.interestOps(iInterestOps);
                            this.f1765O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = true;
                        }
                        if (this.f1763O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO >= 1) {
                            this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.interestOps(0);
                        } else {
                            O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
                            if (this.f1763O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO >= 1 && !this.f1757O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1787O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1796O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                                this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.interestOps(0);
                            }
                        }
                        return;
                    }
                    if (z && this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.isReadable()) {
                        this.f1766O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = false;
                    }
                    if (this.f1767O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 && this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.isWritable()) {
                        this.f1767O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = false;
                    }
                    notifyAll();
                    this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.interestOps(0);
                    if (this.f1763O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO < 1) {
                        O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                    }
                    return;
                }
                this.f1766O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = false;
                this.f1767O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = false;
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(boolean z) {
        if (!z) {
            this.f1770O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = false;
        } else {
            this.f1769O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = System.currentTimeMillis();
            this.f1770O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = true;
        }
    }

    public final boolean O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O() {
        synchronized (this) {
            try {
                if (this.f1763O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO == 2) {
                    this.f1763O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = 1;
                    return false;
                }
                this.f1763O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = 0;
                O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0() {
        boolean z;
        boolean z2;
        synchronized (this) {
            try {
                int iInterestOps = -1;
                if (this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isOpen()) {
                    if (this.f1766O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
                        z2 = true;
                    } else if (this.f1763O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO < 1) {
                        this.f1762O00000OOoOOO00O00o0ooooooooO000ooooO0000.getClass();
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.f1761O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = ((this.f1743O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.isInputShutdown() || !z2) ? 0 : 1) | ((this.f1743O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.isOutputShutdown() || !(this.f1767O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 || (this.f1763O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO < 1 && !this.f1765O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o))) ? 0 : 4);
                    try {
                        SelectionKey selectionKey = this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                        if (selectionKey != null && selectionKey.isValid()) {
                            iInterestOps = this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.interestOps();
                        }
                    } catch (Exception e) {
                        this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
                    }
                }
                z = this.f1761O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != iInterestOps;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.f1757O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this);
            this.f1757O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
        }
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final void close() {
        boolean z = this.f1756O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = f1755O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
        if (z) {
            try {
                SelectionKey selectionKey = this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                if (selectionKey != null) {
                    selectionKey.cancel();
                }
            } catch (Throwable th) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(th);
            }
        }
        try {
            try {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1740O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("close {}", this);
                this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.close();
            } catch (IOException e) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
            }
        } finally {
            O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0();
        }
    }

    public final String toString() {
        String strConcat;
        SelectionKey selectionKey = this.f1759O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        if (selectionKey == null) {
            strConcat = "-";
        } else if (selectionKey.isValid()) {
            strConcat = selectionKey.isReadable() ? "r" : "";
            if (selectionKey.isWritable()) {
                strConcat = strConcat.concat("w");
            }
        } else {
            strConcat = "!";
        }
        return String.format("SCEP@%x{l(%s)<->r(%s),s=%d,open=%b,ishut=%b,oshut=%b,rb=%b,wb=%b,w=%b,i=%d%s}-{%s}", Integer.valueOf(hashCode()), this.f1743O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getRemoteSocketAddress(), this.f1743O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getLocalSocketAddress(), Integer.valueOf(this.f1763O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO), Boolean.valueOf(this.f1741O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isOpen()), Boolean.valueOf(O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO()), Boolean.valueOf(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0()), Boolean.valueOf(this.f1766O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0), Boolean.valueOf(this.f1767O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0), Boolean.valueOf(this.f1765O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o), Integer.valueOf(this.f1761O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00), strConcat, this.f1762O00000OOoOOO00O00o0ooooooooO000ooooO0000);
    }
}
