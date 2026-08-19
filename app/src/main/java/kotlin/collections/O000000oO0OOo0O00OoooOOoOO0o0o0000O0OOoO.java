package kotlin.collections;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO extends O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements RandomAccess {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f3991O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final int f3992O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final int f3993O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 list, int i, int i2) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(list, "list");
        this.f3991O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = list;
        this.f3992O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.Companion;
        int size = list.size();
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i, i2, size);
        this.f3993O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.Companion;
        int i2 = this.f3993O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i, i2);
        return this.f3991O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(this.f3992O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + i);
    }

    @Override // kotlin.collections.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final int getSize() {
        return this.f3993O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }
}
