package com.google.common.collect;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo implements Function {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3433O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo(int i) {
        this.f3433O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f3433O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return ((O000OO0oOo0o000o0oOoO0Ooo0oOO0o0oO0OoOO0) obj).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            case 1:
                return ((O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO) obj).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
            case 2:
                return ((O000OOOO0OOo0OOOooo00oo0000Oo00Ooo00OoOO) obj).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
            case 3:
                return O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.copyOf((O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00) obj);
            case 4:
                return O000OO0OOoOo0OoO0oO0oo0Oo0Oo00000OO0OOO0.copyFromEntries(((O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o) obj).entrySet());
            case 5:
                return O000OOoO00O0000O0OOooO0O0O0Ooo0OO0oo0ooO.copyOf((O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00) obj);
            case 6:
                return ((O000O00oO00OoOOOO00OO0O0O0Oo0O00ooo0o00O) obj).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            case 7:
                return ((O000OOoOooOo00oOOo0Ooo0OO0oooo0ooOoooOOO) obj).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
            case 8:
                return ((O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo) obj).O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
            case 9:
                return ((O000OOOOo0o0OooOo0ooO0o000oooo00O0OoOOOO) obj).O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
            case 10:
                return O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o.copyOf((Map) obj);
            case 11:
                return ((O000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0) obj).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            default:
                return O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00.copyOfSorted((TreeMap) obj);
        }
    }
}
