package com.google.common.util.concurrent;

import android.os.StrictMode;
import android.util.Log;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3756O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Object f3757O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Object f3758O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(Object obj, int i, Object obj2, boolean z) {
        this.f3756O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3758O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj;
        this.f3757O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        switch (this.f3756O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = (O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) this.f3757O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                boolean z = o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 instanceof O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = (O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) this.f3758O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (z && (thO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = ((O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) != null) {
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.onFailure(thO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    return;
                }
                try {
                    org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("Future was expected to be done: %s", o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.isDone(), o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000);
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.onSuccess(com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000));
                    return;
                } catch (ExecutionException e) {
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.onFailure(e.getCause());
                    return;
                } catch (Throwable th) {
                    o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.onFailure(th);
                    return;
                }
            case 1:
                O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) this.f3758O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f464O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f3757O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).run();
                    return;
                } catch (Throwable th2) {
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f463O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
                        return;
                    }
                    return;
                }
            case 2:
                O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = ((O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) this.f3757O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o();
                if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o == null) {
                    throw new IllegalStateException("No pending post available");
                }
                ((O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) this.f3758O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o);
                return;
            case 3:
                O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOooooO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOooooO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
                O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOooooO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f622O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.set(true);
                ((com.bumptech.glide.manager.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f3758O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f2904O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2906O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = true;
                ((com.bumptech.glide.manager.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f3758O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f2903O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getViewTreeObserver().removeOnDrawListener((com.bumptech.glide.manager.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f3757O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                ((com.bumptech.glide.manager.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f3758O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f2904O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2905O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.clear();
                return;
            default:
                org.eclipse.jetty.client.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = (org.eclipse.jetty.client.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) this.f3758O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                org.eclipse.jetty.client.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (org.eclipse.jetty.client.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f3757O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                while (true) {
                    try {
                        try {
                            O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                            if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
                                try {
                                    o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, true);
                                    return;
                                } catch (IOException e2) {
                                    e = e2;
                                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) org.eclipse.jetty.client.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f4251O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(e);
                                    return;
                                }
                            }
                            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        } catch (IOException e3) {
                            if (e3 instanceof InterruptedIOException) {
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) org.eclipse.jetty.client.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f4251O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e3);
                            } else {
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) org.eclipse.jetty.client.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f4251O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(e3);
                                synchronized (o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
                                    try {
                                        o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4236O000000oooOoo00ooo0O0000000o00O0Oooo0OOO--;
                                        if (o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4225O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size() > 0) {
                                            org.eclipse.jetty.client.O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = (org.eclipse.jetty.client.O00000OOoOOO00O00o0ooooooooO000ooooO0000) o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4225O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.remove(0);
                                            if (o00000OOoOOO00O00o0ooooooooO000ooooO0000.setStatus(9)) {
                                                o00000OOoOOO00O00o0ooooooooO000ooooO0000.getEventListener().O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(e3);
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                            try {
                                o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, true);
                                return;
                            } catch (IOException e4) {
                                e = e4;
                                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) org.eclipse.jetty.client.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f4251O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(e);
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, true);
                            break;
                        } catch (IOException e5) {
                            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) org.eclipse.jetty.client.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f4251O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(e5);
                        }
                        throw th4;
                    }
                    break;
                }
                break;
        }
    }

    public String toString() {
        switch (this.f3756O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.class.getSimpleName());
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(12, false);
                ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001;
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f229O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001;
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.f228O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) this.f3758O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(Object obj, Object obj2, int i) {
        this.f3756O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3757O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f3758O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj2;
    }

    public O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        this.f3756O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 2;
        this.f3758O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        this.f3757O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(14, false);
    }
}
