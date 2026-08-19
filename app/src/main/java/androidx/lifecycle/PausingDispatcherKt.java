package androidx.lifecycle;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import kotlinx.coroutines.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
import kotlinx.coroutines.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import kotlinx.coroutines.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
import kotlinx.coroutines.O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
import kotlinx.coroutines.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

/* JADX INFO: loaded from: classes.dex */
public final class PausingDispatcherKt {

    /* JADX INFO: renamed from: androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2, reason: invalid class name */
    @O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {TbsListener.ErrorCode.APK_VERSION_ERROR}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 implements Function2<O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, Object> {
        final /* synthetic */ Function2<O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, Object> $block;
        final /* synthetic */ Lifecycle.State $minState;
        final /* synthetic */ Lifecycle $this_whenStateAtLeast;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Lifecycle lifecycle, Lifecycle.State state, Function2<? super O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, ? super O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, ? extends Object> function2, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            super(2, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            this.$this_whenStateAtLeast = lifecycle;
            this.$minState = state;
            this.$block = function2;
        }

        @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
        public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 create(Object obj, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_whenStateAtLeast, this.$minState, this.$block, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
        public final Object invokeSuspend(Object obj) throws Throwable {
            LifecycleController lifecycleController;
            kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lifecycleController = (LifecycleController) this.L$0;
                try {
                    O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(obj);
                    lifecycleController.finish();
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    lifecycleController.finish();
                    throw th;
                }
            }
            O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(obj);
            O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = (O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00) ((O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O) this.L$0).getCoroutineContext().get(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4063O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            if (o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 == null) {
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
            PausingDispatcher pausingDispatcher = new PausingDispatcher();
            LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00);
            try {
                Function2<O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, Object> function2 = this.$block;
                this.L$0 = lifecycleController2;
                this.label = 1;
                obj = O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(pausingDispatcher, function2, this);
                if (obj == o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                    return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                }
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            return ((AnonymousClass2) create(o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)).invokeSuspend(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
    }

    public static final <T> Object whenCreated(LifecycleOwner lifecycleOwner, Function2<? super O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, ? super O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, ? extends Object> function2, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        return whenCreated(lifecycleOwner.getLifecycle(), function2, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
    }

    public static final <T> Object whenResumed(LifecycleOwner lifecycleOwner, Function2<? super O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, ? super O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, ? extends Object> function2, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        return whenResumed(lifecycleOwner.getLifecycle(), function2, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
    }

    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, Function2<? super O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, ? super O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, ? extends Object> function2, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        return whenStarted(lifecycleOwner.getLifecycle(), function2, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
    }

    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, Function2<? super O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, ? super O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, ? extends Object> function2, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        kotlinx.coroutines.scheduling.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f4080O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4136O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1688O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, new AnonymousClass2(lifecycle, state, function2, null), o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
    }

    public static final <T> Object whenCreated(Lifecycle lifecycle, Function2<? super O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, ? super O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, ? extends Object> function2, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, function2, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
    }

    public static final <T> Object whenResumed(Lifecycle lifecycle, Function2<? super O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, ? super O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, ? extends Object> function2, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, function2, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
    }

    public static final <T> Object whenStarted(Lifecycle lifecycle, Function2<? super O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, ? super O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, ? extends Object> function2, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, function2, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
    }
}
