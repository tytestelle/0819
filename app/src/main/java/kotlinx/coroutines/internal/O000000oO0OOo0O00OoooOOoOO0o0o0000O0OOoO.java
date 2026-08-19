package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;

/* JADX INFO: loaded from: classes2.dex */
public class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4124O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = AtomicReferenceFieldUpdater.newUpdater(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.class, Object.class, "_next");

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4125O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = AtomicReferenceFieldUpdater.newUpdater(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.class, Object.class, "_prev");

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4126O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = AtomicReferenceFieldUpdater.newUpdater(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    public final O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) this._prev;
            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
            while (true) {
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3 = null;
                while (true) {
                    obj = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2._next;
                    if (obj == this) {
                        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2) {
                            return o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
                        }
                        do {
                            atomicReferenceFieldUpdater = f4125O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                            if (atomicReferenceFieldUpdater.compareAndSet(this, o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2)) {
                                return o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                    } else {
                        if (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo()) {
                            return null;
                        }
                        if (obj == null) {
                            return o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
                        }
                        if (obj instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
                            ((O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) obj).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2);
                            break;
                        }
                        if (!(obj instanceof O000000oooOoo00ooo0O0000000o00O0Oooo0OOO)) {
                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) obj;
                        } else {
                            if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3 != null) {
                                break;
                            }
                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2._prev;
                        }
                    }
                }
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO4 = ((O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) obj).f4137O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4124O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (atomicReferenceFieldUpdater2.compareAndSet(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3, o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2, o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO4)) {
                        break;
                    }
                    if (atomicReferenceFieldUpdater2.get(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3) != o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2) {
                        break;
                    }
                }
                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3;
            }
        }
    }

    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO._prev;
            if (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() != o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
                return;
            }
            do {
                atomicReferenceFieldUpdater = f4125O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (atomicReferenceFieldUpdater.compareAndSet(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2, this)) {
                    if (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo()) {
                        o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) == o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2);
        }
    }

    public final Object O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O)) {
                return obj;
            }
            ((O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) obj).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this);
        }
    }

    public final O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        Object objO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
        O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = objO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 instanceof O000000oooOoo00ooo0O0000000o00O0Oooo0OOO ? (O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) objO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 : null;
        return (o000000oooOoo00ooo0O0000000o00O0Oooo0OOO == null || (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4137O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) == null) ? (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) objO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 : o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    public final O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
            Object obj = this._prev;
            while (true) {
                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) obj;
                if (!o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo()) {
                    break;
                }
                obj = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o._prev;
            }
        }
        return o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    public boolean O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() {
        return O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() instanceof O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
    }

    public final void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            Object objO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
            if (objO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 instanceof O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = ((O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) objO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).f4137O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                return;
            }
            if (objO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == this) {
                return;
            }
            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) objO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = (O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2._removedRef;
            if (o000000oooOoo00ooo0O0000000o00O0Oooo0OOO == null) {
                o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2);
                f4126O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.lazySet(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
            }
            do {
                atomicReferenceFieldUpdater = f4124O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (atomicReferenceFieldUpdater.compareAndSet(this, objO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO)) {
                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == objO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        }
    }

    public String toString() {
        return new kotlin.jvm.internal.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this) { // from class: kotlinx.coroutines.internal.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
            @Override // kotlin.jvm.internal.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, kotlin.jvm.internal.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO
            public Object get() {
                return this.receiver.getClass().getSimpleName();
            }
        } + '@' + O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this);
    }
}
