package com.google.common.util.concurrent;

import com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo;
import com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
import com.google.common.collect.O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo extends O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 {

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public static final O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o f3752O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.class);

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O f3753O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O f3754O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    public O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O o00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O, O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        int size = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.size();
        Object obj = null;
        this.f3750O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = null;
        this.f3751O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = size;
        this.f3753O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
        this.f3754O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = new O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(this, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O);
        Objects.requireNonNull(this.f3753O000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
        if (this.f3753O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.isEmpty()) {
            O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = this.f3754O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
            if (o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O != null) {
                o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.execute();
                return;
            }
            return;
        }
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, obj, 23);
        O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo it = this.f3753O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.iterator();
        while (it.hasNext()) {
            O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = (O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) it.next();
            if (o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.isDone()) {
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(null);
            } else {
                o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.addListener(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2, O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.INSTANCE);
            }
        }
    }

    @Override // com.google.common.util.concurrent.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O = this.f3753O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.OUTPUT_FUTURE_DONE.getClass();
        this.f3753O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = null;
        this.f3754O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
        boolean z = false;
        if ((this.f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO instanceof O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) && (o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O != null)) {
            Object obj = this.f3743O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if ((obj instanceof O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) && ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) obj).f3715O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                z = true;
            }
            O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo it = o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(z);
            }
        }
    }

    @Override // com.google.common.util.concurrent.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() {
        O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = this.f3754O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        if (o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O != null) {
            o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.interruptTask();
        }
    }

    @Override // com.google.common.util.concurrent.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final String O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() {
        O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O = this.f3753O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        if (o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O == null) {
            return super.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
        }
        return "futures=" + o000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O;
    }

    public final void O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo o0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo) {
        int iO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f3748O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this);
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(iO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 >= 0, "Less than 0 remaining futures");
        if (iO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == 0) {
            if (o0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo != null) {
                O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo it = o0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        try {
                            com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(future);
                        } catch (ExecutionException e) {
                            O00000OOoOOO00O00o0ooooooooO000ooooO0000(e.getCause());
                        } catch (Throwable th) {
                            O00000OOoOOO00O00o0ooooooooO000ooooO0000(th);
                        }
                    }
                }
            }
            this.f3750O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = null;
            O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = this.f3754O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
            if (o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O != null) {
                o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.execute();
            }
            O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.ALL_INPUT_FUTURES_PROCESSED;
            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.getClass();
            this.f3753O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = null;
            if (o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO == O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.OUTPUT_FUTURE_DONE) {
                this.f3754O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
            }
        }
    }

    public final void O00000OOoOOO00O00o0ooooooooO000ooooO0000(Throwable th) {
        th.getClass();
        boolean z = th instanceof Error;
        if (z) {
            f3752O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO().log(Level.SEVERE, z ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
        }
    }
}
