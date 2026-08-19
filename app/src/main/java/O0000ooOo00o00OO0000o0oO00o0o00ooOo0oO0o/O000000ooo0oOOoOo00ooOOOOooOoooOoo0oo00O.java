package O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o;

import O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import androidx.media3.extractor.AacUtil;
import com.tencent.smtt.sdk.TbsListener;
import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O extends org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO("org.eclipse.jetty.io.nio");

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public static final int f1789O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = Integer.getInteger("org.eclipse.jetty.io.nio.MONITOR_PERIOD", 1000).intValue();

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public static final int f1790O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = Integer.getInteger("org.eclipse.jetty.io.nio.MAX_SELECTS", AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND).intValue();

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public static final int f1791O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = Integer.getInteger("org.eclipse.jetty.io.nio.BUSY_PAUSE", 50).intValue();

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public static final int f1792O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = Integer.getInteger("org.eclipse.jetty.io.nio.IDLE_TICK", TbsListener.ErrorCode.INFO_CODE_BASE).intValue();

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO[] f1793O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f1794O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public volatile int f1795O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public boolean f1796O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public abstract void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(SocketChannel socketChannel, Exception exc, Object obj);

    public final void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(SocketChannel socketChannel, org.eclipse.jetty.client.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        int i = this.f1795O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        this.f1795O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i + 1;
        if (i < 0) {
            i = -i;
        }
        int i2 = i % this.f1794O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO[] o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOArr = this.f1793O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOArr != null) {
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOArr[i2];
            if (o000000oooOoo00ooo0O0000000o00O0Oooo0OOO == null) {
                o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(socketChannel);
            } else {
                o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.getClass();
                if (o000000oooOoo00ooo0O0000000o00O0Oooo0OOO instanceof O00000OOoOOO00O00o0ooooooooO000ooooO0000) {
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
                } else {
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(socketChannel, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO));
                }
            }
            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
        }
    }

    public abstract boolean dispatch(Runnable runnable);

    @Override // org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final void doStart() {
        int i = this.f1794O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.f1793O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO[i];
        int i2 = 0;
        while (true) {
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO[] o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOArr = this.f1793O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (i2 >= o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOArr.length) {
                break;
            }
            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOArr[i2] = new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, i2);
            i2++;
        }
        super.doStart();
        for (int i3 = 0; i3 < i; i3++) {
            if (!dispatch(new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this, i3, 0))) {
                throw new IllegalStateException("!Selecting");
            }
        }
    }

    @Override // org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final void doStop() {
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO[] o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOArr = this.f1793O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        this.f1793O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
        if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOArr != null) {
            for (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO : o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOArr) {
                if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO != null) {
                    for (int i = 0; i < 100; i++) {
                        try {
                            if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1780O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
                                break;
                            }
                            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
                            Thread.sleep(10L);
                        } catch (Exception e) {
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
                        }
                    }
                    synchronized (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
                        for (SelectionKey selectionKey : o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1779O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.keys()) {
                            if (selectionKey != null) {
                                Object objAttachment = selectionKey.attachment();
                                if (objAttachment instanceof O00000OOoOOO00O00o0ooooooooO000ooooO0000) {
                                    try {
                                        ((O00000OOoOOO00O00o0ooooooooO000ooooO0000) objAttachment).close();
                                    } catch (IOException e2) {
                                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e2);
                                    }
                                }
                            }
                        }
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1777O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                        try {
                            Selector selector = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1779O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            if (selector != null) {
                                selector.close();
                            }
                        } catch (IOException e3) {
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e3);
                        }
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1779O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
                    }
                }
            }
        }
    }
}
