package androidx.core.os;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class HandlerKt$postDelayed$runnable$1 implements Runnable {
    final /* synthetic */ Function0<O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> $action;

    public HandlerKt$postDelayed$runnable$1(Function0<O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function0) {
        this.$action = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$action.invoke();
    }
}
