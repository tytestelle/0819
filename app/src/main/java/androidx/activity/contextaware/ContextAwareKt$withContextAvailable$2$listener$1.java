package androidx.activity.contextaware;

import O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import kotlinx.coroutines.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
import kotlinx.coroutines.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

/* JADX INFO: loaded from: classes.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo $co;
    final /* synthetic */ Function1<Context, R> $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, Function1<Context, R> function1) {
        this.$co = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        this.$onContextAvailable = function1;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(Context context) {
        Object objM1constructorimpl;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(context, "context");
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.$co;
        try {
            objM1constructorimpl = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(this.$onContextAvailable.invoke(context));
        } catch (Throwable th) {
            objM1constructorimpl = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(th));
        }
        ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).resumeWith(objM1constructorimpl);
    }
}
