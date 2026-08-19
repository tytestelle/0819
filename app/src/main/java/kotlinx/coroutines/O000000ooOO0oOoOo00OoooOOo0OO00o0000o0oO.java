package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Object f4051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 f4052O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Function1 f4053O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final Object f4054O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final Throwable f4055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(Object obj, O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00, Function1 function1, Object obj2, Throwable th) {
        this.f4051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = obj;
        this.f4052O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00;
        this.f4053O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = function1;
        this.f4054O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = obj2;
        this.f4055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = th;
    }

    public static O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00, CancellationException cancellationException, int i) {
        Object obj = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if ((i & 2) != 0) {
            o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4052O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        }
        O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo01 = o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00;
        Function1 function1 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4053O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        Object obj2 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4054O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        }
        o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.getClass();
        return new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(obj, o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo01, function1, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO)) {
            return false;
        }
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) obj;
        return kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.f4051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) && kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.f4052O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4052O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) && kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.f4053O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4053O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) && kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.f4054O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4054O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) && kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.f4055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
    }

    public final int hashCode() {
        Object obj = this.f4051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 = this.f4052O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int iHashCode2 = (iHashCode + (o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 == null ? 0 : o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00.hashCode())) * 31;
        Function1 function1 = this.f4053O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Object obj2 = this.f4054O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f4055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f4051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + ", cancelHandler=" + this.f4052O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + ", onCancellation=" + this.f4053O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o + ", idempotentResume=" + this.f4054O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + ", cancelCause=" + this.f4055O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 + ')';
    }

    public /* synthetic */ O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(Object obj, O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00, Function1 function1, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00, (i & 4) != 0 ? null : function1, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
