package androidx.activity.contextaware;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

/* JADX INFO: loaded from: classes.dex */
public final class ContextAwareKt$withContextAvailable$2$1 extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function1<Throwable, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> {
    final /* synthetic */ ContextAwareKt$withContextAvailable$2$listener$1 $listener;
    final /* synthetic */ ContextAware $this_withContextAvailable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextAwareKt$withContextAvailable$2$1(ContextAware contextAware, ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1) {
        super(1);
        this.$this_withContextAvailable = contextAware;
        this.$listener = contextAwareKt$withContextAvailable$2$listener$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ O000000oooOoo00ooo0O0000000o00O0Oooo0OOO invoke(Throwable th) {
        invoke2(th);
        return O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$this_withContextAvailable.removeOnContextAvailableListener(this.$listener);
    }
}
