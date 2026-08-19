package kotlinx.coroutines.scheduling;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.exoplayer.Renderer;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements Executor, Closeable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final int f4160O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final int f4161O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final long f4162O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f4163O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f4164O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final kotlinx.coroutines.internal.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo f4165O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public static final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f4159O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO("NOT_IN_STACK", 1);

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4156O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = AtomicLongFieldUpdater.newUpdater(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4157O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = AtomicLongFieldUpdater.newUpdater(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.class, "controlState");

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4158O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = AtomicIntegerFieldUpdater.newUpdater(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.class, "_isTerminated");

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(int i, int i2, long j) {
        this.f4160O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f4161O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i2;
        this.f4162O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = j;
        if (i < 1) {
            throw new IllegalArgumentException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f4163O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        this.f4164O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        this.parkedWorkersStack = 0L;
        this.f4165O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new kotlinx.coroutines.internal.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(i + 1);
        this.controlState = ((long) i) << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, Runnable runnable, boolean z, int i) {
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4180O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if ((i & 4) != 0) {
            z = false;
        }
        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(runnable, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, z);
    }

    public final int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        synchronized (this.f4165O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.f4160O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                return 0;
            }
            if (i >= this.f4161O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (i3 <= 0 || this.f4165O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i3) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, i3);
            this.f4165O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i3, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            if (i3 != ((int) (2097151 & f4157O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.incrementAndGet(this)))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.start();
            return i2 + 1;
        }
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Runnable runnable, O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, boolean z) {
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4179O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
            o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) runnable;
            o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4171O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = jNanoTime;
            o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        } else {
            o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(runnable, jNanoTime, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
        }
        Thread threadCurrentThread = Thread.currentThread();
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = threadCurrentThread instanceof O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO ? (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) threadCurrentThread : null;
        if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null || !kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4154O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, this)) {
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
        }
        if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null || (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4149O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) == O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.TERMINATED || (o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4173O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 0 && o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.BLOCKING)) {
            o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        } else {
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4153O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = true;
            O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4148O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (z) {
                o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
            } else {
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.getClass();
                O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4183O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getAndSet(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
                if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO != null) {
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
                }
            }
        }
        if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null) {
            if (!(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f4172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4173O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 1 ? this.f4164O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) : this.f4163O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO))) {
                throw new RejectedExecutionException("DefaultDispatcher was terminated");
            }
        }
        boolean z2 = z && o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null;
        if (o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4173O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 0) {
            if (z2 || O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() || O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this.controlState)) {
                return;
            }
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
            return;
        }
        long jAddAndGet = f4157O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        if (z2 || O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() || O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(jAddAndGet)) {
            return;
        }
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
    }

    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        long j;
        long j2;
        int iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() != f4159O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
            return;
        }
        do {
            j = this.parkedWorkersStack;
            j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
            iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this.f4165O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO((int) (2097151 & j)));
        } while (!f4156O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.compareAndSet(this, j, j2 | ((long) iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)));
    }

    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (int) (2097151 & j);
            long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
            if (iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == i) {
                if (i2 == 0) {
                    Object objO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                    while (true) {
                        if (objO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == f4159O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
                            iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = -1;
                            break;
                        }
                        if (objO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                            iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 0;
                            break;
                        }
                        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) objO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                        iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                        if (iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != 0) {
                            break;
                        } else {
                            objO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                        }
                    }
                } else {
                    iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i2;
                }
            }
            if (iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO >= 0) {
                if (f4156O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.compareAndSet(this, j, j2 | ((long) iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO))) {
                    return;
                }
            }
        }
    }

    public final boolean O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f4160O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i < i2) {
            int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            if (iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 1 && i2 > 1) {
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            }
            if (iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        while (true) {
            long j = this.parkedWorkersStack;
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) this.f4165O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO((int) (2097151 & j));
            if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 == null) {
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = null;
            } else {
                long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
                Object objO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                while (true) {
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = f4159O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                    if (objO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                        iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = -1;
                        break;
                    }
                    if (objO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                        iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 0;
                        break;
                    }
                    O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3 = (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) objO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                    if (iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != 0) {
                        break;
                    }
                    objO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                }
                if (iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO >= 0) {
                    if (f4156O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.compareAndSet(this, j, ((long) iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) | j2)) {
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 == null) {
                return false;
            }
            if (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4147O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.compareAndSet(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2, -1, 0)) {
                LockSupport.unpark(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2);
                return true;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (f4158O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = threadCurrentThread instanceof O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO ? (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) threadCurrentThread : null;
            if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null || !kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4154O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, this)) {
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
            }
            synchronized (this.f4165O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f4165O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i2);
                    kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 != o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                        while (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.isAlive()) {
                            LockSupport.unpark(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2);
                            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.join(Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
                        }
                        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.f4148O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f4164O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.getClass();
                        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4183O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getAndSet(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, null);
                        if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO != null) {
                            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
                        }
                        while (true) {
                            O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                            if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                                break;
                            } else {
                                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f4164O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
            this.f4163O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
            while (true) {
                if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null) {
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(true);
                    if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null) {
                        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) this.f4163O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                        if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) this.f4163O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                    if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null && (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) this.f4164O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo()) == null) {
                        break;
                    }
                }
                try {
                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null) {
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, runnable, false, 6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f4165O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO; i6++) {
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) this.f4165O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i6);
            if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null) {
                int iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4148O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                int i7 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f4146O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4149O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = this.controlState;
        return "DefaultDispatcher@" + O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this) + "[Pool Size {core = " + this.f4160O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + ", max = " + this.f4161O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f4163O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() + ", global blocking queue size = " + this.f4164O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f4160O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }
}
