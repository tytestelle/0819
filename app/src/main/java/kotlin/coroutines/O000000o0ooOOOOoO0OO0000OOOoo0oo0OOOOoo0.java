package kotlin.coroutines;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.O00000OOoOOO00O00o0ooooooooO000ooooO0000;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 extends kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function2 {
    final /* synthetic */ O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[] $elements;
    final /* synthetic */ O00000OOoOOO00O00o0ooooooooO000ooooO0000 $index;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[] o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr, O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
        super(2);
        this.$elements = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr;
        this.$index = o00000OOoOOO00O00o0ooooooooO000ooooO0000;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) obj, (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) obj2);
        return O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public final void invoke(O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO, O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO element) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000oooOoo00ooo0O0000000o00O0Oooo0OOO, "<anonymous parameter 0>");
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(element, "element");
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo[] o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr = this.$elements;
        O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = this.$index;
        int i = o00000OOoOOO00O00o0ooooooooO000ooooO0000.element;
        o00000OOoOOO00O00o0ooooooooO000ooooO0000.element = i + 1;
        o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0OoArr[i] = element;
    }
}
