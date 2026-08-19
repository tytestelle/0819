package androidx.lifecycle;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

/* JADX INFO: Add missing generic type declarations: [Y] */
/* JADX INFO: loaded from: classes.dex */
public final class Transformations$switchMap$1$onChanged$1<Y> extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function1<Y, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> {
    final /* synthetic */ MediatorLiveData<Y> $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$switchMap$1$onChanged$1(MediatorLiveData<Y> mediatorLiveData) {
        super(1);
        this.$result = mediatorLiveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ O000000oooOoo00ooo0O0000000o00O0Oooo0OOO invoke(Object obj) {
        invoke2(obj);
        return O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Y y) {
        this.$result.setValue(y);
    }
}
