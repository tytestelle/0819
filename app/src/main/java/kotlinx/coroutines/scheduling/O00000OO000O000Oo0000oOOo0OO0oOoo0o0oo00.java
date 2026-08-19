package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4183O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = AtomicReferenceFieldUpdater.newUpdater(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4184O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = AtomicIntegerFieldUpdater.newUpdater(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.class, "producerIndex");

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4185O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = AtomicIntegerFieldUpdater.newUpdater(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.class, "consumerIndex");

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4186O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = AtomicIntegerFieldUpdater.newUpdater(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final AtomicReferenceArray f4187O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new AtomicReferenceArray(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public final O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
        if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4173O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 1) {
            f4186O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        }
        int i = this.producerIndex & 127;
        while (this.f4187O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(i) != null) {
            Thread.yield();
        }
        this.f4187O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lazySet(i, o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
        f4184O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.incrementAndGet(this);
        return null;
    }

    public final int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    public final O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f4185O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.compareAndSet(this, i, i + 1) && (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) this.f4187O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getAndSet(i2, null)) != null) {
                if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4173O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 1) {
                    f4186O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.decrementAndGet(this);
                }
                return o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
            }
        }
    }

    public final long O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
        int i = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.producerIndex;
        AtomicReferenceArray atomicReferenceArray = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4187O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        for (int i2 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & 127;
            if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.blockingTasksInBuffer == 0) {
                break;
            }
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) atomicReferenceArray.get(i3);
            if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO != null && o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4173O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 1) {
                do {
                    if (atomicReferenceArray.compareAndSet(i3, o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, null)) {
                        f4186O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.decrementAndGet(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
                        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) f4183O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getAndSet(this, o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
                        if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 == null) {
                            return -1L;
                        }
                        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2);
                        return -1L;
                    }
                } while (atomicReferenceArray.get(i3) == o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
            }
        }
        return O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, true);
    }

    public final long O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.lastScheduledTask;
            if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO == null) {
                return -2L;
            }
            if (z && o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4173O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != 1) {
                return -2L;
            }
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4179O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getClass();
            long jNanoTime = System.nanoTime() - o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4171O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            long j = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4175O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (jNanoTime < j) {
                return j - jNanoTime;
            }
            do {
                atomicReferenceFieldUpdater = f4183O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (atomicReferenceFieldUpdater.compareAndSet(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, null)) {
                    O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) atomicReferenceFieldUpdater.getAndSet(this, o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
                    if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2 == null) {
                        return -1L;
                    }
                    O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO2);
                    return -1L;
                }
            } while (atomicReferenceFieldUpdater.get(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) == o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
        }
    }
}
