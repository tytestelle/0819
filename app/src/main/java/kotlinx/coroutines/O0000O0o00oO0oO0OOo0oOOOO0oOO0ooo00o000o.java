package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o extends O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo implements O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4083O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = AtomicReferenceFieldUpdater.newUpdater(O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.class, Object.class, "_queue");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    static {
        AtomicReferenceFieldUpdater.newUpdater(O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.class, Object.class, "_delayed");
    }

    public void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Runnable runnable) {
        loop0: while (true) {
            Object obj = this._queue;
            if (this._isCompleted == 0) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4083O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                if (obj == null) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == null);
                } else if (obj instanceof kotlinx.coroutines.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                    kotlinx.coroutines.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = (kotlinx.coroutines.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) obj;
                    int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(runnable);
                    if (iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 0) {
                        break;
                    }
                    if (iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 1) {
                        kotlinx.coroutines.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != 2) {
                    }
                } else if (obj != O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4067O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                    kotlinx.coroutines.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1 = new kotlinx.coroutines.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(8, true);
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((Runnable) obj);
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(runnable);
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                }
            }
            O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.f4075O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(runnable);
            return;
        }
        Thread threadO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        if (Thread.currentThread() != threadO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            LockSupport.unpark(threadO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        }
    }

    public final long O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f4086O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (((o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null || o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f801O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f802O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0)) {
                return obj == O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4067O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO ? Long.MAX_VALUE : 0L;
            }
            if (!((kotlinx.coroutines.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) obj).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo()) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    public final boolean O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f4086O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (!(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null || o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f801O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f802O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                return ((kotlinx.coroutines.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) obj).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
            }
            if (obj != O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4067O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                return false;
            }
        }
        return true;
    }

    public final long O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0() {
        Runnable runnable;
        if (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0()) {
            return 0L;
        }
        loop0: while (true) {
            Object obj = this._queue;
            runnable = null;
            if (obj == null) {
                break;
            }
            if (obj instanceof kotlinx.coroutines.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                kotlinx.coroutines.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = (kotlinx.coroutines.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) obj;
                Object objO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                if (objO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != kotlinx.coroutines.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f4131O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                    runnable = (Runnable) objO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4083O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                kotlinx.coroutines.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else {
                if (obj == O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4067O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4083O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                        runnable = (Runnable) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
        }
        if (runnable == null) {
            return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        }
        runnable.run();
        return 0L;
    }

    public final void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() {
        this._queue = null;
        this._delayed = null;
    }

    @Override // kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o
    public final void dispatch(kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, Runnable runnable) {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(runnable);
    }

    @Override // kotlinx.coroutines.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo
    public void shutdown() {
        O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo.f4106O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.set(null);
        this._isCompleted = 1;
        loop0: while (true) {
            Object obj = this._queue;
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4067O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4083O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof kotlinx.coroutines.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                ((kotlinx.coroutines.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) obj).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                break;
            } else {
                if (obj == o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                    break;
                }
                kotlinx.coroutines.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new kotlinx.coroutines.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(8, true);
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0() <= 0) {
        }
        System.nanoTime();
    }
}
