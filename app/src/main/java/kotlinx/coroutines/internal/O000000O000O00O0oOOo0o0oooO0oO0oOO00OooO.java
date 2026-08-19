package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO extends O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4114O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = AtomicReferenceFieldUpdater.newUpdater(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f4110O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    @Override // kotlinx.coroutines.internal.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
    public final Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = this._consensus;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f4110O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (obj2 == o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(obj);
            obj2 = this._consensus;
            if (obj2 == o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                do {
                    atomicReferenceFieldUpdater = f4114O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)) {
                        obj2 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                obj2 = this._consensus;
            }
        }
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(obj, obj2);
        return obj2;
    }

    public abstract void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, Object obj2);

    public abstract O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj);
}
