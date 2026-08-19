package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f4014O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Object f4015O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Object f4016O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 predicate) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(predicate, "predicate");
        this.f4015O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        this.f4016O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = predicate;
    }

    @Override // kotlin.sequences.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final Iterator iterator() {
        switch (this.f4014O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this);
            case 1:
                return new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this);
            default:
                return new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, Function1 transformer) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(transformer, "transformer");
        this.f4015O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        this.f4016O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) transformer;
    }

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO, Function1 getNextValue) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(getNextValue, "getNextValue");
        this.f4015O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        this.f4016O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = getNextValue;
    }
}
