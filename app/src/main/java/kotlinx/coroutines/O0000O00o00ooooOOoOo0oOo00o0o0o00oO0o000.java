package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 extends kotlinx.coroutines.internal.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4078O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = AtomicIntegerFieldUpdater.newUpdater(O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        super(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
        this._decision = 0;
    }

    @Override // kotlinx.coroutines.internal.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, kotlinx.coroutines.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo
    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj) {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(obj);
    }

    @Override // kotlinx.coroutines.internal.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, kotlinx.coroutines.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo
    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj) {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                kotlinx.coroutines.internal.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this.f4138O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o), O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj), null);
                return;
            }
        } while (!f4078O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.compareAndSet(this, 0, 2));
    }

    public final Object O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o() throws Throwable {
        O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;
        do {
            int i = this._decision;
            if (i != 0) {
                if (i != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object objO00000OOoOOO00O00o0ooooooooO000ooooO0000 = O00000OOoOOO00O00o0ooooooooO000ooooO0000();
                O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo = objO00000OOoOOO00O00o0ooooooooO000ooooO0000 instanceof O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo ? (O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo) objO00000OOoOOO00O00o0ooooooooO000ooooO0000 : null;
                if (o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo != null && (o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.f4088O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) != null) {
                    objO00000OOoOOO00O00o0ooooooooO000ooooO0000 = o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;
                }
                if (objO00000OOoOOO00O00o0ooooooooO000ooooO0000 instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
                    throw ((O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) objO00000OOoOOO00O00o0ooooooooO000ooooO0000).f4057O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                }
                return objO00000OOoOOO00O00o0ooooooooO000ooooO0000;
            }
        } while (!f4078O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.compareAndSet(this, 0, 1));
        return kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.COROUTINE_SUSPENDED;
    }
}
