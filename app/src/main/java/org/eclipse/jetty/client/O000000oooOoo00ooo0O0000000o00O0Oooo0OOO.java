package org.eclipse.jetty.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Properties;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f4224O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f4230O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final boolean f4231O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public final O000O00OoO000o0oo0o00oO00oo00oOoo000O0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f4232O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public final O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo f4233O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public volatile int f4234O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public volatile int f4235O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final LinkedList f4225O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new LinkedList();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final LinkedList f4226O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new LinkedList();

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final ArrayBlockingQueue f4227O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new ArrayBlockingQueue(10, true);

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final ArrayList f4228O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new ArrayList();

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public int f4236O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = 0;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public int f4237O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = 0;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f4224O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.class.getName());
    }

    public O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, boolean z, O000O00OoO000o0oo0o00oO00oo00oOoo000O0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        this.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        this.f4230O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        this.f4231O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = z;
        this.f4232O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        this.f4234O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4212O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        this.f4235O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4213O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        String string = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4198O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4199O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != (z ? 443 : 80)) {
            StringBuilder sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(string, ":");
            sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.append(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4199O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            string = sbO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.toString();
        }
        this.f4233O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(string);
    }

    public final O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
        do {
            synchronized (this) {
                if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null) {
                    try {
                        this.f4226O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f4228O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.size() > 0) {
                    ArrayList arrayList = this.f4228O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) arrayList.remove(arrayList.size() - 1);
                }
            }
            if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null) {
                return null;
            }
        } while (!o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0());
        return o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Exception exc) {
        boolean z;
        synchronized (this) {
            try {
                z = true;
                this.f4236O000000oooOoo00ooo0O0000000o00O0Oooo0OOO--;
                int i = this.f4237O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                if (i > 0) {
                    this.f4237O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = i - 1;
                } else {
                    if (this.f4225O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size() > 0) {
                        O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = (O00000OOoOOO00O00o0ooooooooO000ooooO0000) this.f4225O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.remove(0);
                        if (o00000OOoOOO00O00o0ooooooooO000ooooO0000.setStatus(9)) {
                            o00000OOoOOO00O00o0ooooooooO000ooooO0000.getEventListener().O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(exc);
                        }
                        if (!this.f4225O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isEmpty() && this.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.isStarted()) {
                            exc = null;
                        }
                    }
                    exc = null;
                }
                z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
        }
        if (exc != null) {
            try {
                this.f4227O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.put(exc);
            } catch (InterruptedException e) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4224O00000O00oOOo000000OOOo00OOOo0OooOO00OO0).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
            }
        }
    }

    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        synchronized (this) {
            try {
                this.f4236O000000oooOoo00ooo0O0000000o00O0Oooo0OOO--;
                this.f4226O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.add(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                int i = this.f4237O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                if (i > 0) {
                    this.f4237O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = i - 1;
                } else {
                    if (this.f4225O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size() == 0) {
                        ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4224O00000O00oOOo000000OOOo00OOOo0OooOO00OO0).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("No exchanges for new connection {}", o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                        this.f4228O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.add(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    } else {
                        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (O00000OOoOOO00O00o0ooooooooO000ooooO0000) this.f4225O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.remove(0));
                    }
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null) {
            try {
                this.f4227O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.put(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            } catch (InterruptedException e) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4224O00000O00oOOo000000OOOo00OOOo0OooOO00OO0).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
            }
        }
    }

    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, boolean z) {
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getClass();
        if (z) {
            try {
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
            } catch (IOException e) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4224O00000O00oOOo000000OOOo00OOOo0OooOO00OO0).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
            }
        }
        if (this.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.isStarted()) {
            boolean z2 = false;
            if (!z && o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isOpen()) {
                synchronized (this) {
                    try {
                        if (this.f4225O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size() == 0) {
                            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                            this.f4228O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.add(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                        } else {
                            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (O00000OOoOOO00O00o0ooooooooO000ooooO0000) this.f4225O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.remove(0));
                        }
                        notifyAll();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            synchronized (this) {
                try {
                    this.f4226O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    if (this.f4225O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isEmpty()) {
                        this.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getClass();
                    } else if (this.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.isStarted()) {
                        z2 = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z2) {
                O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
            }
        }
    }

    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        boolean z;
        O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o00000OOoOOO00O00o0ooooooooO000ooooO0000 != null ? o00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() : -1L);
        synchronized (this) {
            try {
                this.f4228O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.remove(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                this.f4226O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                z = false;
                if (this.f4225O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isEmpty()) {
                    this.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getClass();
                } else if (this.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.isStarted()) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
        }
    }

    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
        synchronized (this) {
            try {
                if (!o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(o00000OOoOOO00O00o0ooooooooO000ooooO0000)) {
                    if (o00000OOoOOO00O00o0ooooooooO000ooooO0000.getStatus() <= 1) {
                        this.f4225O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.add(0, o00000OOoOOO00O00o0ooooooooO000ooooO0000);
                    }
                    O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
        boolean z;
        o00000OOoOOO00O00o0ooooooooO000ooooO0000.setStatus(1);
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = this.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getClass();
        o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getClass();
        synchronized (this) {
        }
        o00000OOoOOO00O00o0ooooooooO000ooooO0000.scheduleTimeout(this);
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null) {
            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooOO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000OOoOOO00O00o0ooooooooO000ooooO0000);
            return;
        }
        synchronized (this) {
            if (this.f4225O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size() == this.f4235O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
                throw new RejectedExecutionException("Queue full for address " + this.f4230O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
            }
            this.f4225O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.add(o00000OOoOOO00O00o0ooooooooO000ooooO0000);
            z = this.f4226O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.size() + this.f4236O000000oooOoo00ooo0O0000000o00O0Oooo0OOO < this.f4234O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        }
        if (z) {
            O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [org.eclipse.jetty.client.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO] */
    public final void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() {
        try {
            synchronized (this) {
                this.f4236O000000oooOoo00ooo0O0000000o00O0Oooo0OOO++;
            }
            Object r0 = this.f4229O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f4216O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
            if (r0 != 0) {
                r0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this);
            }
        } catch (Exception e) {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4224O00000O00oOOo000000OOOo00OOOo0OooOO00OO0).O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(e);
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(e);
        }
    }

    public final synchronized String toString() {
        Integer numValueOf;
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        numValueOf = Integer.valueOf(hashCode());
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f4230O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        return String.format("HttpDestination@%x//%s:%d(%d/%d,%d,%d/%d)%n", numValueOf, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4198O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, Integer.valueOf(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4199O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO), Integer.valueOf(this.f4226O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.size()), Integer.valueOf(this.f4234O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO), Integer.valueOf(this.f4228O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.size()), Integer.valueOf(this.f4225O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size()), Integer.valueOf(this.f4235O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O));
    }
}
