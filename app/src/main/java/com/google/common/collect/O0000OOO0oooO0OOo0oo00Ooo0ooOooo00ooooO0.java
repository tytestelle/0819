package com.google.common.collect;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 implements Supplier {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3439O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f3440O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0(Object obj, int i) {
        this.f3439O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3440O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f3439O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return new O000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO((Comparator) this.f3440O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 1:
                return new O000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0((Comparator) this.f3440O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 2:
                return new TreeMap((Comparator) this.f3440O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            default:
                ((O000o0ooo000oooooOOo000o00O0OOO0oO0ooOo0) this.f3440O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f3618O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
                return new O000oO0000O00000O00OOo0OOo0Oo000OoO0ooO0(O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0.createWithExpectedSize(8), new O000o0ooOooOOOoo00o0o00o0ooooo0OOOoo0Ooo(2));
        }
    }
}
