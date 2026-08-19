package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO extends Thread {

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4147O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = AtomicIntegerFieldUpdater.newUpdater(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.class, "workerCtl");

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 f4148O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f4149O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public long f4150O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public long f4151O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public int f4152O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public boolean f4153O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final /* synthetic */ O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f4154O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    volatile /* synthetic */ int workerCtl;

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, int i) {
        this.f4154O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        setDaemon(true);
        this.f4148O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();
        this.f4149O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.DORMANT;
        this.workerCtl = 0;
        this.nextParkedWorker = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4159O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        this.f4152O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.Default.nextInt();
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i);
    }

    public final O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(boolean z) {
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1;
        long j;
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (this.f4149O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.CPU_ACQUIRED) {
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f4154O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            do {
                j = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.controlState;
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    if (z) {
                        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f4148O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.getClass();
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4183O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getAndSet(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, null);
                        if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                        }
                        if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) this.f4154O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f4164O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                        }
                    } else {
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) this.f4154O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f4164O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                    }
                    return o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null ? O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(true) : o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                }
            } while (!O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4157O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.compareAndSet(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, j, j - 4398046511104L));
            this.f4149O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.CPU_ACQUIRED;
        }
        if (z) {
            boolean z2 = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f4154O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f4160O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO * 2) == 0;
            if (z2 && (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0()) != null) {
                return o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1;
            }
            O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = this.f4148O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.getClass();
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4183O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getAndSet(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01, null);
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO == null ? o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() : o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
            if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 != null) {
                return o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2;
            }
            if (!z2 && (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0()) != null) {
                return o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            }
        } else {
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2 = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
            if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2 != null) {
                return o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2;
            }
        }
        return O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(false);
    }

    public final int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        return this.indexInArray;
    }

    public final Object O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        return this.nextParkedWorker;
    }

    public final int O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(int i) {
        int i2 = this.f4152O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f4152O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    public final O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        int iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(2);
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f4154O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        if (iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == 0) {
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4163O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
            return o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO != null ? o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO : (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4164O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
        }
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4164O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
        return o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 != null ? o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 : (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4163O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
    }

    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(int i) {
        StringBuilder sb = new StringBuilder("DefaultDispatcher-worker-");
        this.f4154O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.getClass();
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = this.f4149O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        boolean z = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 == O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.CPU_ACQUIRED;
        if (z) {
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4157O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.addAndGet(this.f4154O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, 4398046511104L);
        }
        if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 != o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            this.f4149O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        }
        return z;
    }

    public final O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(boolean z) {
        long jO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        int i = (int) (this.f4154O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.controlState & 2097151);
        if (i < 2) {
            return null;
        }
        int iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i);
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f4154O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        long jMin = Long.MAX_VALUE;
        for (int i2 = 0; i2 < i; i2++) {
            iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo++;
            if (iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo > i) {
                iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = 1;
            }
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4165O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
            if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null && o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != this) {
                if (z) {
                    jO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.f4148O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4148O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                } else {
                    O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f4148O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4148O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.getClass();
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                    if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) {
                        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4183O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getAndSet(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                        if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO != null) {
                            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
                        }
                        jO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = -1;
                    } else {
                        jO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01, false);
                    }
                }
                if (jO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == -1) {
                    O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02 = this.f4148O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02.getClass();
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4183O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getAndSet(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02, null);
                    return o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 == null ? o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo02.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() : o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2;
                }
                if (jO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 > 0) {
                    jMin = Math.min(jMin, jO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f4151O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (!this.f4154O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.isTerminated()) {
                    O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f4149O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.TERMINATED;
                    if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2) {
                        break loop0;
                    }
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.f4153O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                    if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null) {
                        this.f4151O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = 0L;
                        int i = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f4172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4173O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        this.f4150O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 0L;
                        if (this.f4149O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.PARKING) {
                            this.f4149O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.BLOCKING;
                        }
                        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f4154O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        if (i != 0 && O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.BLOCKING) && !o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() && !o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.controlState)) {
                            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                        }
                        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.getClass();
                        try {
                            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.run();
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                        }
                        if (i != 0) {
                            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4157O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.addAndGet(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, -2097152L);
                            if (this.f4149O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2) {
                                break;
                            }
                            this.f4149O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.DORMANT;
                            break;
                        }
                        break;
                    }
                    this.f4153O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = false;
                    if (this.f4151O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo != 0) {
                        if (z) {
                            O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f4151O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                            this.f4151O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = 0L;
                            break;
                        }
                        z = true;
                    } else if (this.nextParkedWorker != O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4159O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
                        this.workerCtl = -1;
                        while (this.nextParkedWorker != O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4159O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO && this.workerCtl == -1 && !this.f4154O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.isTerminated()) {
                            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3 = this.f4149O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o4 = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.TERMINATED;
                            if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3 == o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o4) {
                                break;
                            }
                            O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.PARKING);
                            Thread.interrupted();
                            if (this.f4150O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == 0) {
                                this.f4150O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = System.nanoTime() + this.f4154O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f4162O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            }
                            LockSupport.parkNanos(this.f4154O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f4162O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                            if (System.nanoTime() - this.f4150O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o >= 0) {
                                this.f4150O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 0L;
                                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = this.f4154O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                                synchronized (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.f4165O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
                                    try {
                                        if (!o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.isTerminated()) {
                                            if (((int) (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.controlState & 2097151)) > o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.f4160O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                                                if (f4147O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.compareAndSet(this, -1, 1)) {
                                                    int i2 = this.indexInArray;
                                                    O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(0);
                                                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this, i2, 0);
                                                    int andDecrement = (int) (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4157O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getAndDecrement(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2) & 2097151);
                                                    if (andDecrement != i2) {
                                                        Object objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.f4165O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(andDecrement);
                                                        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                                                        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                                                        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.f4165O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i2, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                                                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i2);
                                                        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, andDecrement, i2);
                                                    }
                                                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.f4165O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(andDecrement, null);
                                                    this.f4149O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o4;
                                                }
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                        }
                    } else {
                        this.f4154O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this);
                    }
                } else {
                    break loop0;
                }
            }
        }
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.TERMINATED);
    }
}
