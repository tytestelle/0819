package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public class O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo implements O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00, O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4102O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = AtomicReferenceFieldUpdater.newUpdater(O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    public O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo(boolean z) {
        this._state = z ? O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4074O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo : O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4073O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        this._parentHandle = null;
    }

    public static O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(kotlinx.coroutines.internal.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        while (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo()) {
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        }
        while (true) {
            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
            if (!o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo()) {
                if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO instanceof O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                    return (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                }
                if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO instanceof O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00) {
                    return null;
                }
            }
        }
    }

    public static String O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(Object obj) {
        if (!(obj instanceof O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo)) {
            if (obj instanceof O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO) {
                return ((O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O ? "Cancelled" : "Completed";
        }
        O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo = (O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo) obj;
        if (o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo()) {
            return "Cancelling";
        }
        return o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() ? "Completing" : "Active";
    }

    public final boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO, O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00, O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00) {
        char c;
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo o0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo = new O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo(o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00, this, o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO);
        do {
            kotlinx.coroutines.internal.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
            kotlinx.coroutines.internal.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f4125O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lazySet(o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00, o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f4124O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            atomicReferenceFieldUpdater.lazySet(o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00, o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00);
            o0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.f4099O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00, o0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo)) {
                    if (o0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) != null) {
                        c = 2;
                        break;
                    }
                    c = 1;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoOO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) != o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00) {
                    c = 0;
                    break;
                }
            }
            if (c == 1) {
                return true;
            }
        } while (c != 2);
        return false;
    }

    public void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj) {
    }

    public void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(obj);
    }

    public final boolean O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Object obj) {
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        Object objO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4068O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (this instanceof O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0) {
            do {
                Object objO00000OOoOOO00O00o0ooooooooO000ooooO0000 = O00000OOoOOO00O00o0ooooooooO000ooooO0000();
                if (!(objO00000OOoOOO00O00o0ooooooooO000ooooO0000 instanceof O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO) || ((objO00000OOoOOO00O00o0ooooooooO000ooooO0000 instanceof O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo) && ((O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo) objO00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0())) {
                    objO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4068O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    break;
                }
                objO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(objO00000OOoOOO00O00o0ooooooooO000ooooO0000, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(obj), false));
            } while (objO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO == O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4070O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
            if (objO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO == O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4069O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                return true;
            }
        }
        if (objO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO == O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4068O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            Throwable thO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
            loop1: while (true) {
                Object objO00000OOoOOO00O00o0ooooooooO000ooooO0001 = O00000OOoOOO00O00o0ooooooooO000ooooO0000();
                if (objO00000OOoOOO00O00o0ooooooooO000ooooO0001 instanceof O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo) {
                    synchronized (objO00000OOoOOO00O00o0ooooooooO000ooooO0001) {
                        try {
                            if (((O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo) objO00000OOoOOO00O00o0ooooooooO000ooooO0001).O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()) {
                                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4071O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                            } else {
                                boolean zO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = ((O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo) objO00000OOoOOO00O00o0ooooooooO000ooooO0001).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                                if (thO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null) {
                                    thO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(obj);
                                }
                                ((O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo) objO00000OOoOOO00O00o0ooooooooO000ooooO0001).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(thO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                                Throwable thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = zO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo ? null : ((O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo) objO00000OOoOOO00O00o0ooooooooO000ooooO0001).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                                if (thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) {
                                    O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(((O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo) objO00000OOoOOO00O00o0ooooooooO000ooooO0001).f4097O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                                }
                                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4068O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else if (objO00000OOoOOO00O00o0ooooooooO000ooooO0001 instanceof O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO) {
                    if (thO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null) {
                        thO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(obj);
                    }
                    O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO = (O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO) objO00000OOoOOO00O00o0ooooooooO000ooooO0001;
                    if (o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.isActive()) {
                        O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO);
                        if (o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 == null) {
                            continue;
                        } else {
                            O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo = new O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo(o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, thO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4102O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO, o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo)) {
                                    O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, thO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4068O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                                } else if (atomicReferenceFieldUpdater.get(this) != o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO) {
                                }
                            }
                        }
                    } else {
                        Object objO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO2 = O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(objO00000OOoOOO00O00o0ooooooooO000ooooO0001, new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(thO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, false));
                        if (objO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO2 == O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4068O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                            throw new IllegalStateException(("Cannot happen in " + objO00000OOoOOO00O00o0ooooooooO000ooooO0001).toString());
                        }
                        if (objO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO2 != O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4070O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                            objO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = objO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO2;
                            break;
                        }
                    }
                } else {
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4071O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                }
                objO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                break;
            }
        }
        if (objO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO != O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4068O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO && objO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO != O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4069O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            if (objO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO == O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4071O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
                return false;
            }
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(objO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO);
        }
        return true;
    }

    public final boolean O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Throwable th) {
        if (O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this._parentHandle;
        if (o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null || o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.f4104O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            return z;
        }
        return o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(th) || z;
    }

    public String O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        return "Job was cancelled";
    }

    public boolean O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(th) && O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
    }

    public final void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO, Object obj) {
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this._parentHandle;
        if (o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo != null) {
            o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.dispose();
            this._parentHandle = O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.f4104O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = obj instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O ? (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) obj : null;
        Throwable th = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O != null ? o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4057O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO : null;
        if (o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO instanceof O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00) {
            try {
                ((O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00) o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(th);
                return;
            } catch (Throwable th2) {
                O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo("Exception in completion handler " + o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO + " for " + this, th2));
                return;
            }
        }
        O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        if (o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null) {
            for (kotlinx.coroutines.internal.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = (kotlinx.coroutines.internal.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(); !kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2, o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO); O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()) {
                if (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 instanceof O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00) {
                    O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 = (O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00) O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
                    try {
                        o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(th);
                    } catch (Throwable th3) {
                        if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo != null) {
                            O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, th3);
                        } else {
                            o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo("Exception in completion handler " + o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 + " for " + this, th3);
                        }
                    }
                }
            }
            if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo != null) {
                O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
            }
        }
    }

    public final Throwable O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(Object obj) {
        Throwable thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = (O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo) ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000) obj);
        Object objO00000OOoOOO00O00o0ooooooooO000ooooO0000 = o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O00000OOoOOO00O00o0ooooooooO000ooooO0000();
        if (objO00000OOoOOO00O00o0ooooooooO000ooooO0000 instanceof O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo) {
            thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ((O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo) objO00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        } else if (objO00000OOoOOO00O00o0ooooooooO000ooooO0000 instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
            thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ((O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) objO00000OOoOOO00O00o0ooooooooO000ooooO0000).f4057O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        } else {
            if (objO00000OOoOOO00O00o0ooooooooO000ooooO0000 instanceof O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objO00000OOoOOO00O00o0ooooooooO000ooooO0000).toString());
            }
            thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
        }
        CancellationException o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000 = thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o instanceof CancellationException ? (CancellationException) thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o : null;
        if (o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000 == null) {
            o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000 = new O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000("Parent job is ".concat(O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(objO00000OOoOOO00O00o0ooooooooO000ooooO0000)), thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo);
        }
        return o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000;
    }

    public final Object O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo, Object obj) {
        Throwable thO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = obj instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O ? (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) obj : null;
        Throwable th = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O != null ? o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4057O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO : null;
        synchronized (o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo) {
            o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
            ArrayList<Throwable> arrayListO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(th);
            thO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo, arrayListO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            if (thO000000oooOoo00ooo0O0000000o00O0Oooo0OOO != null && arrayListO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.size()));
                for (Throwable th2 : arrayListO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                    if (th2 != thO000000oooOoo00ooo0O0000000o00O0Oooo0OOO && th2 != thO000000oooOoo00ooo0O0000000o00O0Oooo0OOO && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(thO000000oooOoo00ooo0O0000000o00O0Oooo0OOO, th2);
                    }
                }
            }
        }
        if (thO000000oooOoo00ooo0O0000000o00O0Oooo0OOO != null && thO000000oooOoo00ooo0O0000000o00O0Oooo0OOO != th) {
            obj = new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(thO000000oooOoo00ooo0O0000000o00O0Oooo0OOO, false);
        }
        if (thO000000oooOoo00ooo0O0000000o00O0Oooo0OOO != null && (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(thO000000oooOoo00ooo0O0000000o00O0Oooo0OOO) || O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(thO000000oooOoo00ooo0O0000000o00O0Oooo0OOO))) {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            }
            O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4056O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.compareAndSet((O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) obj, 0, 1);
        }
        O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4102O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Object o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo = obj instanceof O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO ? new O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo((O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo, o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo) && atomicReferenceFieldUpdater.get(this) == o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo) {
        }
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo, obj);
        return obj;
    }

    public final CancellationException O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() {
        CancellationException cancellationException;
        Object objO00000OOoOOO00O00o0ooooooooO000ooooO0000 = O00000OOoOOO00O00o0ooooooooO000ooooO0000();
        if (!(objO00000OOoOOO00O00o0ooooooooO000ooooO0000 instanceof O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo)) {
            if (objO00000OOoOOO00O00o0ooooooooO000ooooO0000 instanceof O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objO00000OOoOOO00O00o0ooooooooO000ooooO0000 instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O)) {
                return new O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) objO00000OOoOOO00O00o0ooooooooO000ooooO0000).f4057O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(), th, this) : cancellationException;
        }
        Throwable thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ((O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo) objO00000OOoOOO00O00o0ooooooooO000ooooO0000).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        if (thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o instanceof CancellationException ? (CancellationException) thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
        }
        return new O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000(strConcat, thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this);
    }

    public final Throwable O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo()) {
                return new O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo() {
        return true;
    }

    public final O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO) {
        O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        if (o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null) {
            return o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        }
        if (o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO instanceof O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) {
            return new O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00();
        }
        if (o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO instanceof O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00) {
            O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O((O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00) o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO).toString());
    }

    public final O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00() {
        return (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this._parentHandle;
    }

    public final Object O00000OOoOOO00O00o0ooooooooO000ooooO0000() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) obj).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this);
        }
    }

    public boolean O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(Throwable th) {
        return false;
    }

    public final void O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00) {
        byte b;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.f4104O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 == null) {
            this._parentHandle = o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
            return;
        }
        O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = (O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo) o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
        do {
            Object objO00000OOoOOO00O00o0ooooooooO000ooooO0000 = o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O00000OOoOOO00O00o0ooooooooO000ooooO0000();
            boolean z = objO00000OOoOOO00O00o0ooooooooO000ooooO0000 instanceof O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4102O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            b = 0;
            if (z) {
                if (!((O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) objO00000OOoOOO00O00o0ooooooooO000ooooO0000).f4082O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                    O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4074O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo, objO00000OOoOOO00O00o0ooooooooO000ooooO0000, o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o)) {
                            o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O();
                            b = 1;
                        } else if (atomicReferenceFieldUpdater.get(o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo) != objO00000OOoOOO00O00o0ooooooooO000ooooO0000) {
                            b = -1;
                        }
                    }
                }
            } else if (objO00000OOoOOO00O00o0ooooooooO000ooooO0000 instanceof O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0) {
                O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 = ((O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0) objO00000OOoOOO00O00o0ooooooooO000ooooO0000).f4087O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo, objO00000OOoOOO00O00o0ooooooooO000ooooO0000, o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00)) {
                        o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O();
                        b = 1;
                    } else if (atomicReferenceFieldUpdater.get(o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo) != objO00000OOoOOO00O00o0ooooooooO000ooooO0000) {
                        b = -1;
                    }
                }
            }
            if (b == 0) {
                break;
            }
        } while (b != 1);
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo, true, new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this), 2);
        this._parentHandle = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        if (O00000OOoOOO00O00o0ooooooooO000ooooO0000() instanceof O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO) {
            return;
        }
        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.dispose();
        this._parentHandle = o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
    }

    public boolean O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0() {
        return false;
    }

    public final Object O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(Object obj) {
        Object objO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
        do {
            objO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(O00000OOoOOO00O00o0ooooooooO000ooooO0000(), obj);
            if (objO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO == O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4068O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = obj instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O ? (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) obj : null;
                throw new IllegalStateException(str, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O != null ? o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4057O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO : null);
            }
        } while (objO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO == O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4070O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        return objO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
    }

    public final void O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00, Throwable th) {
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
        for (kotlinx.coroutines.internal.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = (kotlinx.coroutines.internal.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(); !kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2, o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00); O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()) {
            if (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 instanceof O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0) {
                O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 = (O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00) O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
                try {
                    o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(th);
                } catch (Throwable th2) {
                    if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo != null) {
                        O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, th2);
                    } else {
                        o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo("Exception in completion handler " + o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 + " for " + this, th2);
                    }
                }
            }
        }
        if (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo != null) {
            O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
        }
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(th);
    }

    public void O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(Object obj) {
    }

    public void O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O() {
    }

    public final void O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 = new O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00();
        o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.getClass();
        kotlinx.coroutines.internal.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f4125O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lazySet(o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00, o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = kotlinx.coroutines.internal.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f4124O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        atomicReferenceFieldUpdater2.lazySet(o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00, o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00);
        loop0: while (o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() == o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00, o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00, o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00)) {
                    o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00) == o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00);
        }
        kotlinx.coroutines.internal.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
        do {
            atomicReferenceFieldUpdater = f4102O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (atomicReferenceFieldUpdater.compareAndSet(this, o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00, O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00);
    }

    public final Object O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO)) {
            return O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4068O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        }
        if (((obj instanceof O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) || (obj instanceof O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00)) && !(obj instanceof O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) && !(obj2 instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O)) {
            O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO = (O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO) obj;
            Object o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo = obj2 instanceof O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO ? new O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo((O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f4102O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (atomicReferenceFieldUpdater.compareAndSet(this, o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO, o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo)) {
                    O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(obj2);
                    O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO);
            return O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4070O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        }
        O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO2 = (O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO) obj;
        O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO2);
        if (o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 == null) {
            return O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4070O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        }
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = null;
        O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo = o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO2 instanceof O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo ? (O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo) o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO2 : null;
        if (o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo == null) {
            o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo = new O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo(o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, null);
        }
        kotlin.jvm.internal.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = new kotlin.jvm.internal.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
        synchronized (o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo) {
            if (o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0()) {
                return O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4068O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            }
            o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
            if (o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo != o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4102O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO2, o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo)) {
                    if (atomicReferenceFieldUpdater2.get(this) != o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO2) {
                        return O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4070O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    }
                }
            }
            boolean zO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
            O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = obj2 instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O ? (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) obj2 : null;
            if (o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O != null) {
                o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f4057O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            }
            Throwable thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            if (zO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
                thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
            }
            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.element = thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) {
                O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, thO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            }
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO2 instanceof O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 ? (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO2 : null;
            if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null) {
                O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO2.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                if (o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null) {
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                }
            } else {
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
            }
            if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O != null) {
                while (O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.f4050O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, false, new O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO(this, o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, obj2), 1) == O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.f4104O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O);
                    if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O == null) {
                    }
                }
                return O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4069O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            }
            return O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo, obj2);
        }
    }

    @Override // kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final Object fold(Object obj, Function2 operation) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final kotlin.coroutines.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO get(kotlin.coroutines.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
        return com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
    }

    @Override // kotlin.coroutines.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO
    public final kotlin.coroutines.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O getKey() {
        return O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4063O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // kotlinx.coroutines.O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00
    public boolean isActive() {
        Object objO00000OOoOOO00O00o0ooooooooO000ooooO0000 = O00000OOoOOO00O00o0ooooooooO000ooooO0000();
        return (objO00000OOoOOO00O00o0ooooooooO000ooooO0000 instanceof O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO) && ((O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO) objO00000OOoOOO00O00o0ooooooooO000ooooO0000).isActive();
    }

    @Override // kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo minusKey(kotlin.coroutines.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
        return com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
    }

    @Override // kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo plus(kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo context) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(context, "context");
        return context == kotlin.coroutines.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.INSTANCE ? this : (kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) context.fold(this, kotlin.coroutines.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.INSTANCE);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(O00000OOoOOO00O00o0ooooooooO000ooooO0000()) + '}');
        sb.append('@');
        sb.append(O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this));
        return sb.toString();
    }

    public void O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        throw o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
    }
}
