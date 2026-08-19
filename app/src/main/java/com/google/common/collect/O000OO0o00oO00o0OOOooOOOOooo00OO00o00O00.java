package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OO0o00oO00o0OOOooOOOOooo00OO00o00O00 extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ int f3530O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final Iterator f3531O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public Object f3532O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final /* synthetic */ Object f3533O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public O000OO0o00oO00o0OOOooOOOOooo00OO00o00O00(O000OO0o0o0oooo00oooOoOooo0O0o0oOo00000O o000OO0o0o0oooo00oooOoOooo0O0o0oOo00000O, int i) {
        this.f3530O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
        switch (i) {
            case 1:
                this.f3533O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000OO0o0o0oooo00oooOoOooo0O0o0oOo00000O;
                this.f3531O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000OO0o0o0oooo00oooOoOooo0O0o0oOo00000O.this$0.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.reverse().iterator();
                this.f3532O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000Oo00OoOOooO000o0oOo00oOo0OOOo0OOOo0o.f3558O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                break;
            default:
                this.f3533O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000OO0o0o0oooo00oooOoOooo0O0o0oOo00000O;
                this.f3531O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000OO0o0o0oooo00oooOoOooo0O0o0oOo00000O.this$0.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.iterator();
                this.f3532O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000Oo00OoOOooO000o0oOo00oOo0OOOo0OOOo0o.f3558O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.common.collect.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        switch (this.f3530O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            case 0:
                while (!((O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo) this.f3532O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).hasNext()) {
                    O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo o00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo = (O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo) this.f3531O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    if (!o00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo.hasNext()) {
                        this.f3371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.DONE;
                        return null;
                    }
                    this.f3532O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.create((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo.next(), ((O000OO0o0o0oooo00oooOoOooo0O0o0oOo00000O) this.f3533O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO).domain).iterator();
                }
                return (Comparable) ((O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo) this.f3532O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).next();
            case 1:
                while (!((O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo) this.f3532O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).hasNext()) {
                    O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo o00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo2 = (O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo) this.f3531O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    if (!o00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo2.hasNext()) {
                        this.f3371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.DONE;
                        return null;
                    }
                    this.f3532O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.create((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo2.next(), ((O000OO0o0o0oooo00oooOoOooo0O0o0oOo00000O) this.f3533O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO).domain).descendingIterator();
                }
                return (Comparable) ((O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo) this.f3532O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).next();
            default:
                Iterator it = this.f3531O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                if (!it.hasNext()) {
                    this.f3371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.DONE;
                    return null;
                }
                O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 = (O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) it.next();
                if (((O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) this.f3532O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).isLessThan(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.lowerBound)) {
                    this.f3371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.DONE;
                    return null;
                }
                O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Intersection = o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.intersection(((O00O00OOoO0o0oOoOooO0O00o0O0oO00O0oOooOo) this.f3533O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO).f3702O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00(o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Intersection.lowerBound, o000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0Intersection);
        }
    }

    public O000OO0o00oO00o0OOOooOOOOooo00OO00o00O00(O00O00OOoO0o0oOoOooO0O00o0O0oO00O0oOooOo o00O00OOoO0o0oOoOooO0O00o0O0oO00O0oOooOo, Iterator it, O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) {
        this.f3530O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 2;
        this.f3531O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = it;
        this.f3532O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo;
        this.f3533O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o00O00OOoO0o0oOoOooO0O00o0O0oO00O0oOooOo;
    }
}
