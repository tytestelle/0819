package kotlinx.coroutines;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Object f4058O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Function1 f4059O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(Object obj, Function1 function1) {
        this.f4058O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = obj;
        this.f4059O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O000000oooOoo00ooo0O0000000o00O0Oooo0OOO)) {
            return false;
        }
        O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = (O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) obj;
        return kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.f4058O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4058O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) && kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.f4059O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f4059O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
    }

    public final int hashCode() {
        Object obj = this.f4058O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return this.f4059O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f4058O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + ", onCancellation=" + this.f4059O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + ')';
    }
}
