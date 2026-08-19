package kotlin.collections;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function1 {
    final /* synthetic */ O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        super(1);
        this.this$0 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Object obj) {
        return obj == this.this$0 ? "(this Collection)" : String.valueOf(obj);
    }
}
