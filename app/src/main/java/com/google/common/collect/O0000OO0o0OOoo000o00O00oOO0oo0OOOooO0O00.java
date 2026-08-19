package com.google.common.collect;

import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 implements Function {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3434O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Function f3435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00(Function function, int i) {
        this.f3434O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = function;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f3434O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                Object objApply = this.f3435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.apply(obj);
                objApply.getClass();
                return objApply;
            case 1:
                return androidx.media3.decoder.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(this.f3435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.apply(obj)).peek(new O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00());
            case 2:
                Object objApply2 = this.f3435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.apply(obj);
                objApply2.getClass();
                return objApply2;
            default:
                return androidx.media3.decoder.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(this.f3435O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.apply(obj)).peek(new O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00());
        }
    }
}
