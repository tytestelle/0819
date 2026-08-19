package kotlin.coroutines.intrinsics;

import kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import kotlin.jvm.internal.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 extends O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {
    final /* synthetic */ Object $receiver$inlined;
    final /* synthetic */ Function2 $this_createCoroutineUnintercepted$inlined;
    private int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, Function2 function2, Object obj) {
        super(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
        this.$this_createCoroutineUnintercepted$inlined = function2;
        this.$receiver$inlined = obj;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.label = 2;
            O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(obj);
            return obj;
        }
        this.label = 1;
        O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(obj);
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        Function2 function2 = this.$this_createCoroutineUnintercepted$inlined;
        O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(2, function2);
        return function2.invoke(this.$receiver$inlined, this);
    }
}
