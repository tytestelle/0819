package androidx.core.animation;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import android.animation.Animator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatorKt$addListener$listener$1 implements Animator.AnimatorListener {
    final /* synthetic */ Function1<Animator, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> $onCancel;
    final /* synthetic */ Function1<Animator, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> $onEnd;
    final /* synthetic */ Function1<Animator, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> $onRepeat;
    final /* synthetic */ Function1<Animator, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> $onStart;

    /* JADX WARN: Multi-variable type inference failed */
    public AnimatorKt$addListener$listener$1(Function1<? super Animator, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function1, Function1<? super Animator, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function2, Function1<? super Animator, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function3, Function1<? super Animator, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function4) {
        this.$onRepeat = function1;
        this.$onEnd = function2;
        this.$onCancel = function3;
        this.$onStart = function4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.$onCancel.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.$onEnd.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        this.$onRepeat.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.$onStart.invoke(animator);
    }
}
