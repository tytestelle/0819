package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4127O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = AtomicReferenceFieldUpdater.newUpdater(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(8, false);

    public final boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this._cur;
            int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(runnable);
            if (iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 0) {
                return true;
            }
            if (iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 1) {
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
                do {
                    atomicReferenceFieldUpdater = f4127O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
            } else if (iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 2) {
                return false;
            }
        }
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        while (true) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this._cur;
            if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4127O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) && atomicReferenceFieldUpdater.get(this) == o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
            }
        }
    }

    public final int O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        return ((O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this._cur).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
    }

    public final Object O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        while (true) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this._cur;
            Object objO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
            if (objO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f4131O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                return objO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4127O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) && atomicReferenceFieldUpdater.get(this) == o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
            }
        }
    }
}
