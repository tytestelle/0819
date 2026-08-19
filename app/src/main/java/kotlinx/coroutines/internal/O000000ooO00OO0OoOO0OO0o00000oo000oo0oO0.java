package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final int f4132O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final boolean f4133O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final int f4134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f4135O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public static final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f4131O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO("REMOVE_FROZEN", 1);

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4129O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = AtomicReferenceFieldUpdater.newUpdater(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.class, Object.class, "_next");

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4130O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = AtomicLongFieldUpdater.newUpdater(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.class, "_state");

    public O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(int i, boolean z) {
        this.f4132O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f4133O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = z;
        int i2 = i - 1;
        this.f4134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i2;
        this.f4135O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj) {
        while (true) {
            long j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f4134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (this.f4133O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO || this.f4135O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(i2 & i3) == null) {
                if (f4130O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    this.f4135O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.set(i2 & i3, obj);
                    O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this;
                    while ((o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0._state & 1152921504606846976L) != 0) {
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
                        AtomicReferenceArray atomicReferenceArray = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f4135O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        int i4 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f4134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o & i2;
                        Object obj2 = atomicReferenceArray.get(i4);
                        if ((obj2 instanceof O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) && ((O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) obj2).f4128O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == i2) {
                            atomicReferenceArray.set(i4, obj);
                        } else {
                            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
                        }
                        if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.f4132O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f4130O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    public final int O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final boolean O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        long j = this._state;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    public final O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        long j;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (f4130O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.compareAndSet(this, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this._next;
            if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 != null) {
                return o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
            }
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1 = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(this.f4132O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO * 2, this.f4133O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f4134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this.f4135O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(i4);
                if (o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null) {
                    o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(i);
                }
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1.f4135O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.set(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1.f4134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o & i, o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                i++;
            }
            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1._state = (-1152921504606846977L) & j;
            do {
                atomicReferenceFieldUpdater = f4129O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                if (atomicReferenceFieldUpdater.compareAndSet(this, null, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1)) {
                    break;
                }
            } while (atomicReferenceFieldUpdater.get(this) == null);
        }
    }

    public final Object O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        while (true) {
            long j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return f4131O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            }
            int i = (int) (j & 1073741823);
            int i2 = this.f4134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            Object obj = this.f4135O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(i4);
            if (obj == null) {
                if (this.f4133O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                    return null;
                }
            } else {
                if (obj instanceof O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
                    return null;
                }
                long j2 = (i + 1) & 1073741823;
                if (f4130O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                    this.f4135O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.set(this.f4134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o & i, null);
                    return obj;
                }
                if (this.f4133O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                    O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this;
                    while (true) {
                        long j3 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0._state;
                        int i5 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
                        } else {
                            if (f4130O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.compareAndSet(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, j3, (j3 & (-1073741824)) | j2)) {
                                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f4135O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.set(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f4134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o & i5, null);
                                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
                            } else {
                                continue;
                            }
                        }
                        if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
