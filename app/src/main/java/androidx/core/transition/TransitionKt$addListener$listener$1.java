package androidx.core.transition;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import android.transition.Transition;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {
    final /* synthetic */ Function1<Transition, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> $onCancel;
    final /* synthetic */ Function1<Transition, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> $onEnd;
    final /* synthetic */ Function1<Transition, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> $onPause;
    final /* synthetic */ Function1<Transition, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> $onResume;
    final /* synthetic */ Function1<Transition, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> $onStart;

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionKt$addListener$listener$1(Function1<? super Transition, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function1, Function1<? super Transition, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function2, Function1<? super Transition, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function3, Function1<? super Transition, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function4, Function1<? super Transition, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function5) {
        this.$onEnd = function1;
        this.$onResume = function2;
        this.$onPause = function3;
        this.$onCancel = function4;
        this.$onStart = function5;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
        this.$onCancel.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        this.$onEnd.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
        this.$onPause.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
        this.$onResume.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        this.$onStart.invoke(transition);
    }
}
