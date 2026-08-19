package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class O00O00O0o0oOoOOOooooo0OO00ooOOo00OoO0O00 extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ int f3696O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ Object f3697O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final Iterator f3698O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public /* synthetic */ O00O00O0o0oOoOOOooooo0OO00ooOOo00OoO0O00(O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00, Iterator it, int i) {
        this.f3696O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
        this.f3698O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = it;
        this.f3697O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.common.collect.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        Object next;
        Object next2;
        switch (this.f3696O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            case 0:
                Iterator it = this.f3698O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                if (!it.hasNext()) {
                    this.f3371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.DONE;
                    return null;
                }
                O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 = (O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) it.next();
                if (!((O00O00OO00Oo0OoO0ooOO00oOOo000ooOoOOOOoO) this.f3697O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).f3700O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.upperBound.isLessThan(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound)) {
                    return new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.upperBound, o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0);
                }
                this.f3371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.DONE;
                return null;
            case 1:
                O000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o = (O000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o) this.f3698O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                if (!o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o.hasNext()) {
                    this.f3371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.DONE;
                    return null;
                }
                O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1 = (O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o000Oo0O0oO0OooOoooooO0o0oOOOoOOo00OOO0o.next();
                if (((O00O00OO00Oo0OoO0ooOO00oOOo000ooOoOOOOoO) this.f3697O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).f3700O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lowerBound.isLessThan(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1.upperBound)) {
                    return new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1.upperBound, o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo1);
                }
                this.f3371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.DONE;
                return null;
            case 2:
                Iterator it2 = this.f3698O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                if (!it2.hasNext()) {
                    this.f3371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.DONE;
                    return null;
                }
                O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo2 = (O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) it2.next();
                O00O00OOoO0o0oOoOooO0O00o0O0oO00O0oOooOo o00O00OOoO0o0oOoOooO0O00o0O0oO00O0oOooOo = (O00O00OOoO0o0oOoOooO0O00o0O0oO00O0oOooOo) this.f3697O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                if (o00O00OOoO0o0oOoOooO0O00o0O0oO00O0oOooOo.f3702O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lowerBound.compareTo(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo2.upperBound) >= 0) {
                    this.f3371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.DONE;
                    return null;
                }
                O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Intersection = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo2.intersection(o00O00OOoO0o0oOoOooO0O00o0O0oO00O0oOooOo.f3702O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                if (o00O00OOoO0o0oOoOooO0O00o0O0oO00O0oOooOo.f3701O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.contains(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Intersection.lowerBound)) {
                    return new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Intersection.lowerBound, o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Intersection);
                }
                this.f3371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.DONE;
                return null;
            case 3:
                do {
                    Iterator it3 = this.f3698O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    if (!it3.hasNext()) {
                        this.f3371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.DONE;
                        return null;
                    }
                    next = it3.next();
                } while (!((com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) this.f3697O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).apply(next));
                return next;
            default:
                do {
                    Iterator it4 = this.f3698O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    if (!it4.hasNext()) {
                        this.f3371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.DONE;
                        return null;
                    }
                    next2 = it4.next();
                } while (!((O000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOO) this.f3697O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).f3671O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.contains(next2));
                return next2;
        }
    }

    public O00O00O0o0oOoOOOooooo0OO00ooOOo00OoO0O00(Iterator it, com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
        this.f3696O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 3;
        this.f3698O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = it;
        this.f3697O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
    }

    public O00O00O0o0oOoOOOooooo0OO00ooOOo00OoO0O00(O000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOO o000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOO) {
        this.f3696O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 4;
        this.f3697O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOO;
        this.f3698O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000ooOoOooo0ooo0O0000oOO0oooO00OOo0OoOO.f3670O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.iterator();
    }
}
