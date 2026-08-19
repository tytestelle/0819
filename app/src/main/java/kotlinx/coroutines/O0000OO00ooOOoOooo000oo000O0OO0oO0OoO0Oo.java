package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo extends O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 {

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4090O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = AtomicIntegerFieldUpdater.newUpdater(O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.class, "_invoked");

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 f4091O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    private volatile /* synthetic */ int _invoked = 0;

    public O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo(O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00) {
        this.f4091O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00;
    }

    @Override // kotlinx.coroutines.O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00
    public final void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(Throwable th) {
        if (f4090O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.compareAndSet(this, 0, 1)) {
            this.f4091O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.invoke(th);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O((Throwable) obj);
        return O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }
}
