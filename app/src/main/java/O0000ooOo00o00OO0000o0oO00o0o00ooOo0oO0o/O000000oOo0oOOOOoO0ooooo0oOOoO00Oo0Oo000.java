package O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o;

import O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f1771O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final int f1772O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f1773O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, int i, int i2) {
        this.f1771O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i2;
        this.f1773O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        this.f1772O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ae A[Catch: all -> 0x00b3, TryCatch #1 {all -> 0x00b3, blocks: (B:33:0x00a6, B:35:0x00ae, B:38:0x00b5), top: B:79:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Thread[] threadArr;
        switch (this.f1771O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                int i = this.f1772O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) this.f1773O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                String name = Thread.currentThread().getName();
                Thread.currentThread().getPriority();
                try {
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO[] o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOArr = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1793O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOArr == null) {
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Stopped {} on {}", Thread.currentThread(), this);
                    } else {
                        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOArr[i];
                        Thread.currentThread().setName(name + " Selector" + i);
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Starting {} on {}", Thread.currentThread(), this);
                        while (o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.isRunning()) {
                            try {
                                o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                            } catch (IOException e) {
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
                            } catch (Exception e2) {
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O00000OOoOOO00O00o0ooooooooO000ooooO0000(e2);
                            }
                            break;
                        }
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Stopped {} on {}", Thread.currentThread(), this);
                    }
                    Thread.currentThread().setName(name);
                    return;
                } catch (Throwable th) {
                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1788O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Stopped {} on {}", Thread.currentThread(), this);
                    Thread.currentThread().setName(name);
                    o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getClass();
                    throw th;
                }
            default:
                Thread threadCurrentThread = Thread.currentThread();
                synchronized (((O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1773O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)) {
                    try {
                        Thread[] threadArr2 = ((O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1773O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f1831O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                        if (threadArr2 == null) {
                            return;
                        }
                        threadArr2[this.f1772O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO] = threadCurrentThread;
                        String name2 = threadCurrentThread.getName();
                        threadCurrentThread.setName(name2 + " Acceptor" + this.f1772O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + " " + ((O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1773O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o));
                        int priority = threadCurrentThread.getPriority();
                        try {
                            ((O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1773O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).getClass();
                            threadCurrentThread.setPriority(priority);
                            while (((O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1773O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).isRunning()) {
                                O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1773O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                                if (((O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).f1942O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o == null) {
                                    threadCurrentThread.setPriority(priority);
                                    threadCurrentThread.setName(name2);
                                    synchronized (((O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1773O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)) {
                                        try {
                                            threadArr = ((O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1773O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f1831O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                                            if (threadArr != null) {
                                                threadArr[this.f1772O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO] = null;
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                        break;
                                    }
                                    return;
                                }
                                try {
                                    try {
                                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
                                    } catch (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO e3) {
                                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1821O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e3);
                                    } catch (InterruptedException e4) {
                                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1821O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e4);
                                    }
                                } catch (IOException e5) {
                                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1821O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e5);
                                } catch (Throwable th3) {
                                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1821O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o).O00000OOoOOO00O00o0ooooooooO000ooooO0000(th3);
                                }
                                break;
                            }
                            threadCurrentThread.setPriority(priority);
                            threadCurrentThread.setName(name2);
                            synchronized (((O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1773O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)) {
                                threadArr = ((O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1773O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f1831O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                                if (threadArr != null) {
                                    threadArr[this.f1772O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO] = null;
                                }
                                return;
                            }
                        } catch (Throwable th4) {
                            threadCurrentThread.setPriority(priority);
                            threadCurrentThread.setName(name2);
                            synchronized (((O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1773O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)) {
                                try {
                                    Thread[] threadArr3 = ((O0000oooOooOoOoOO0oO0O0oooo000OoOOO0o00o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1773O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f1831O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                                    if (threadArr3 != null) {
                                        threadArr3[this.f1772O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO] = null;
                                    }
                                    throw th4;
                                } catch (Throwable th5) {
                                    throw th5;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
        }
    }
}
