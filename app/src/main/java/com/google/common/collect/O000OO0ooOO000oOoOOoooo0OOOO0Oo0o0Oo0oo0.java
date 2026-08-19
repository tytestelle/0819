package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OO0ooOO000oOoOOoooo0OOOO0Oo0o0Oo0oo0 extends O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O {
    private final boolean positiveBoundedAbove;
    private final boolean positiveBoundedBelow;
    private final int size;
    final /* synthetic */ O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o this$0;

    public O000OO0ooOO000oOoOOoooo0OOOO0Oo0o0Oo0oo0(O000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o) {
        this.this$0 = o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o;
        boolean zHasLowerBound = ((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(0)).hasLowerBound();
        this.positiveBoundedBelow = zHasLowerBound;
        boolean zHasUpperBound = ((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO)).hasUpperBound();
        this.positiveBoundedAbove = zHasUpperBound;
        int size = o000OOO0O0o000oo0oo0ooOo00ooooo0OoOOoO0o.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size();
        size = zHasLowerBound ? size : size - 1;
        this.size = zHasUpperBound ? size + 1 : size;
    }

    @Override // com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.O000O0000OOoo0O00OoO00O0o0OO00OOOOoOoo0O, com.google.common.collect.O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // java.util.List
    public O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0 get(int i) {
        O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOoBelowAll;
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, this.size);
        if (this.positiveBoundedBelow) {
            o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOoBelowAll = i == 0 ? O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.belowAll() : ((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) this.this$0.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(i - 1)).upperBound;
        } else {
            o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOoBelowAll = ((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) this.this$0.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(i)).upperBound;
        }
        return O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0.create(o0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOoBelowAll, (this.positiveBoundedAbove && i == this.size + (-1)) ? O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.aboveAll() : ((O000oOo0o0000OO0oooo00OO0OoOoo00OoO0oOo0) this.this$0.f3538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(i + (!this.positiveBoundedBelow ? 1 : 0))).lowerBound);
    }
}
