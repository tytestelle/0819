package O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final ConcurrentLinkedQueue f1719O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final ConcurrentLinkedQueue f1720O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public final ConcurrentLinkedQueue f1721O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public final AtomicInteger f1722O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public final int f1723O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public final boolean f1724O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public final boolean f1725O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    public O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, int i, O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O2, int i2, O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O3, int i3) {
        super(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, i, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O2, i2, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O3);
        this.f1722O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new AtomicInteger();
        this.f1719O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new ConcurrentLinkedQueue();
        this.f1720O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new ConcurrentLinkedQueue();
        this.f1721O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new ConcurrentLinkedQueue();
        this.f1724O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O == o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O3;
        this.f1725O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O2 == o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O3;
        this.f1723O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = i3;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) this.f1720O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.poll();
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null) {
            return O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
        }
        this.f1722O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.decrementAndGet();
        return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i) {
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        AtomicInteger atomicInteger;
        if (this.f1724O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O && i == this.f1704O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        }
        if (this.f1725O000000oooOoo00ooo0O0000000o00O0Oooo0OOO && i == this.f1706O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f1721O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        Object objPoll = concurrentLinkedQueue.poll();
        while (true) {
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) objPoll;
            atomicInteger = this.f1722O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
            if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null || o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() == i) {
                break;
            }
            atomicInteger.decrementAndGet();
            objPoll = concurrentLinkedQueue.poll();
        }
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null) {
            return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i);
        }
        atomicInteger.decrementAndGet();
        return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) this.f1719O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.poll();
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null) {
            return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
        }
        this.f1722O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.decrementAndGet();
        return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.clear();
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() || ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0()) {
            return;
        }
        AtomicInteger atomicInteger = this.f1722O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        if (atomicInteger.incrementAndGet() > this.f1723O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
            atomicInteger.decrementAndGet();
            return;
        }
        if (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)) {
            this.f1719O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.add(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        } else if (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)) {
            this.f1720O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.add(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        } else {
            this.f1721O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.add(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        }
    }

    public final String toString() {
        String simpleName = O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.class.getSimpleName();
        Integer numValueOf = Integer.valueOf(this.f1719O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.size());
        int i = this.f1723O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        return String.format("%s [%d/%d@%d,%d/%d@%d,%d/%d@-]", simpleName, numValueOf, Integer.valueOf(i), Integer.valueOf(this.f1704O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO), Integer.valueOf(this.f1720O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.size()), Integer.valueOf(i), Integer.valueOf(this.f1706O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo), Integer.valueOf(this.f1721O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size()), Integer.valueOf(i));
    }
}
