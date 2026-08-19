package org.eclipse.jetty.util.component;

import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {
    public static final String FAILED = "FAILED";
    private static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo LOG;
    public static final String RUNNING = "RUNNING";
    public static final String STARTED = "STARTED";
    public static final String STARTING = "STARTING";
    public static final String STOPPED = "STOPPED";
    public static final String STOPPING = "STOPPING";
    private final Object _lock = new Object();
    private final int __FAILED = -1;
    private final int __STOPPED = 0;
    private final int __STARTING = 1;
    private final int __STARTED = 2;
    private final int __STOPPING = 3;
    private volatile int _state = 0;
    protected final CopyOnWriteArrayList<O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO> _listeners = new CopyOnWriteArrayList<>();

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        LOG = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.class.getName());
    }

    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Throwable th) {
        this._state = -1;
        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0("FAILED " + this + ": " + th, th);
        Iterator<O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO> it = this._listeners.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        this._state = 2;
        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("STARTED {}", this);
        Iterator<O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO> it = this._listeners.iterator();
        if (it.hasNext()) {
            androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(it.next());
        }
    }

    public final void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() {
        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("starting {}", this);
        this._state = 1;
        Iterator<O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO> it = this._listeners.iterator();
        if (it.hasNext()) {
            androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(it.next());
        }
    }

    public final void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0() {
        this._state = 0;
        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("{} {}", STOPPED, this);
        Iterator<O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO> it = this._listeners.iterator();
        if (it.hasNext()) {
            androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(it.next());
        }
    }

    public final void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() {
        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) LOG).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("stopping {}", this);
        this._state = 3;
        Iterator<O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO> it = this._listeners.iterator();
        if (it.hasNext()) {
            androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(it.next());
        }
    }

    public void addLifeCycleListener(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        this._listeners.add(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
    }

    public void doStart() {
    }

    public void doStop() {
    }

    public String getState() {
        int i = this._state;
        if (i == -1) {
            return FAILED;
        }
        if (i == 0) {
            return STOPPED;
        }
        if (i == 1) {
            return STARTING;
        }
        if (i == 2) {
            return STARTED;
        }
        if (i != 3) {
            return null;
        }
        return STOPPING;
    }

    public boolean isFailed() {
        return this._state == -1;
    }

    @Override // org.eclipse.jetty.util.component.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public boolean isRunning() {
        int i = this._state;
        return i == 2 || i == 1;
    }

    @Override // org.eclipse.jetty.util.component.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public boolean isStarted() {
        return this._state == 2;
    }

    @Override // org.eclipse.jetty.util.component.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public boolean isStarting() {
        return this._state == 1;
    }

    @Override // org.eclipse.jetty.util.component.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public boolean isStopped() {
        return this._state == 0;
    }

    @Override // org.eclipse.jetty.util.component.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public boolean isStopping() {
        return this._state == 3;
    }

    public void removeLifeCycleListener(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        this._listeners.remove(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
    }

    @Override // org.eclipse.jetty.util.component.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final void start() {
        synchronized (this._lock) {
            try {
                try {
                    if (this._state != 2 && this._state != 1) {
                        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                        doStart();
                        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                    }
                } catch (Error e) {
                    O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(e);
                    throw e;
                } catch (Exception e2) {
                    O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(e2);
                    throw e2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.eclipse.jetty.util.component.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final void stop() {
        synchronized (this._lock) {
            try {
                try {
                    if (this._state != 3 && this._state != 0) {
                        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                        doStop();
                        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
                    }
                } catch (Error e) {
                    O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(e);
                    throw e;
                } catch (Exception e2) {
                    O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(e2);
                    throw e2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String getState(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.isStarting()) {
            return STARTING;
        }
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.isStarted()) {
            return STARTED;
        }
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.isStopping()) {
            return STOPPING;
        }
        return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.isStopped() ? STOPPED : FAILED;
    }
}
