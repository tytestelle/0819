package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 extends kotlinx.coroutines.internal.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO implements O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000, O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO, Function1 {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo f4092O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    @Override // kotlinx.coroutines.O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO
    public final O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        return null;
    }

    public final O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() {
        O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = this.f4092O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo != null) {
            return o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
        }
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("job");
        throw null;
    }

    public abstract void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(Throwable th);

    @Override // kotlinx.coroutines.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0ooO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
        while (true) {
            Object objO00000OOoOOO00O00o0ooooooooO000ooooO0000 = o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0ooO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000();
            if (!(objO00000OOoOOO00O00o0ooooooooO000ooooO0000 instanceof O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00)) {
                if (!(objO00000OOoOOO00O00o0ooooooooO000ooooO0000 instanceof O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO) || ((O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO) objO00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() == null) {
                    return;
                }
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
                return;
            }
            if (objO00000OOoOOO00O00o0ooooooooO000ooooO0000 != this) {
                return;
            }
            O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4074O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
            do {
                atomicReferenceFieldUpdater = O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f4102O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (atomicReferenceFieldUpdater.compareAndSet(o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0ooO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, objO00000OOoOOO00O00o0ooooooooO000ooooO0000, o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o)) {
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0ooO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) == objO00000OOoOOO00O00o0ooooooooO000ooooO0000);
        }
    }

    @Override // kotlinx.coroutines.O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO
    public final boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final String toString() {
        return getClass().getSimpleName() + '@' + O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this) + "[job@" + O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO()) + ']';
    }
}
