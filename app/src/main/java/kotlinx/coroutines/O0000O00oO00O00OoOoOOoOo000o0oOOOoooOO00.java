package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 extends kotlinx.coroutines.scheduling.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public int f4079O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00(int i) {
        super(0L, kotlinx.coroutines.scheduling.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f4180O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
        this.f4079O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
    }

    public abstract void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj, CancellationException cancellationException);

    public abstract kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();

    public Throwable O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj) {
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = obj instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O ? (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) obj : null;
        if (o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O != null) {
            return o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4057O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
        return null;
    }

    public Object O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Object obj) {
        return obj;
    }

    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(th);
        O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().getContext(), new O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();

    @Override // java.lang.Runnable
    public final void run() {
        Object objM1constructorimpl;
        Object objM1constructorimpl2;
        O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        kotlinx.coroutines.scheduling.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = this.f4172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        try {
            kotlinx.coroutines.internal.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (kotlinx.coroutines.internal.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
            kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4117O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            Object obj = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4119O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo context = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.getContext();
            Object objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = kotlinx.coroutines.internal.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(context, obj);
            O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO o0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OOO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != kotlinx.coroutines.internal.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.f4140O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO ? O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, context, objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) : null;
            try {
                kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo context2 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.getContext();
                Object objO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                Throwable thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(objO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = (thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null && O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this.f4079O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)) ? (O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00) context2.get(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4063O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) : null;
                if (o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 != null && !o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.isActive()) {
                    CancellationException cancellationExceptionO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = ((O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo) o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
                    O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(objO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, cancellationExceptionO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.resumeWith(O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(cancellationExceptionO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O)));
                } else if (thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) {
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.resumeWith(O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)));
                } else {
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.resumeWith(O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(objO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)));
                }
                if (o0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OOO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O == null || o0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OOO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o()) {
                    kotlinx.coroutines.internal.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(context, objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                }
                try {
                    o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getClass();
                    objM1constructorimpl2 = O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
                } catch (Throwable th) {
                    objM1constructorimpl2 = O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(th));
                }
                O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(null, O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m4exceptionOrNullimpl(objM1constructorimpl2));
            } catch (Throwable th2) {
                if (o0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OOO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O == null || o0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OOO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o()) {
                    kotlinx.coroutines.internal.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(context, objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getClass();
                objM1constructorimpl = O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
            } catch (Throwable th4) {
                objM1constructorimpl = O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(th4));
            }
            O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(th3, O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m4exceptionOrNullimpl(objM1constructorimpl));
        }
    }
}
