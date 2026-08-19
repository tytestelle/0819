package androidx.lifecycle;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
import kotlinx.coroutines.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import kotlinx.coroutines.O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;

/* JADX INFO: loaded from: classes.dex */
public abstract class LifecycleCoroutineScope implements O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O {

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1, reason: invalid class name */
    @O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.kt", l = {337}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 implements Function2<O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, Object> {
        final /* synthetic */ Function2<O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function2<? super O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, ? super O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, ? extends Object> function2, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            super(2, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            this.$block = function2;
        }

        @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
        public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 create(Object obj, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            return LifecycleCoroutineScope.this.new AnonymousClass1(this.$block, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        }

        @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                Function2<O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, Object> function2 = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenCreated(lifecycle$lifecycle_common, function2, this) == o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                    return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(obj);
            }
            return O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            return ((AnonymousClass1) create(o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)).invokeSuspend(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1, reason: invalid class name and case insensitive filesystem */
    @O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.kt", l = {375}, m = "invokeSuspend")
    public static final class C00361 extends O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 implements Function2<O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, Object> {
        final /* synthetic */ Function2<O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C00361(Function2<? super O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, ? super O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, ? extends Object> function2, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            super(2, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            this.$block = function2;
        }

        @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
        public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 create(Object obj, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            return LifecycleCoroutineScope.this.new C00361(this.$block, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        }

        @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                Function2<O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, Object> function2 = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenResumed(lifecycle$lifecycle_common, function2, this) == o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                    return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(obj);
            }
            return O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            return ((C00361) create(o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)).invokeSuspend(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1, reason: invalid class name and case insensitive filesystem */
    @O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.kt", l = {356}, m = "invokeSuspend")
    public static final class C00371 extends O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 implements Function2<O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, Object> {
        final /* synthetic */ Function2<O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C00371(Function2<? super O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, ? super O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, ? extends Object> function2, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            super(2, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            this.$block = function2;
        }

        @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
        public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 create(Object obj, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            return LifecycleCoroutineScope.this.new C00371(this.$block, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        }

        @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                Function2<O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, Object> function2 = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenStarted(lifecycle$lifecycle_common, function2, this) == o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                    return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(obj);
            }
            return O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            return ((C00371) create(o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)).invokeSuspend(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
    }

    @Override // kotlinx.coroutines.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O
    public abstract /* synthetic */ O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo getCoroutineContext();

    public abstract Lifecycle getLifecycle$lifecycle_common();

    public final O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 launchWhenCreated(Function2<? super O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, ? super O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, ? extends Object> block) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(block, "block");
        return O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this, null, new AnonymousClass1(block, null), 3);
    }

    public final O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 launchWhenResumed(Function2<? super O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, ? super O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, ? extends Object> block) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(block, "block");
        return O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this, null, new C00361(block, null), 3);
    }

    public final O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 launchWhenStarted(Function2<? super O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, ? super O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, ? extends Object> block) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(block, "block");
        return O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this, null, new C00371(block, null), 3);
    }
}
