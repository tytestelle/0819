package androidx.lifecycle;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import kotlinx.coroutines.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
import kotlinx.coroutines.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import kotlinx.coroutines.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
import kotlinx.coroutines.O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
import kotlinx.coroutines.O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000;
import kotlinx.coroutines.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
import kotlinx.coroutines.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {
    private final O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo coroutineContext;
    private final Lifecycle lifecycle;

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1, reason: invalid class name */
    @O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 implements Function2<O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            super(2, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        }

        @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
        public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 create(Object obj, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            AnonymousClass1 anonymousClass1 = LifecycleCoroutineScopeImpl.this.new AnonymousClass1(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
        public final Object invokeSuspend(Object obj) throws Throwable {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(obj);
            O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = (O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O) this.L$0;
            if (LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
                LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().addObserver(LifecycleCoroutineScopeImpl.this);
            } else {
                O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = (O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00) o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.getCoroutineContext().get(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4063O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                if (o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 != null) {
                    O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = (O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo) o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
                    o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(new O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000(o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(), null, o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo));
                }
            }
            return O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            return ((AnonymousClass1) create(o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)).invokeSuspend(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
    }

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo coroutineContext) {
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(lifecycle, "lifecycle");
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(coroutineContext, "coroutineContext");
        this.lifecycle = lifecycle;
        this.coroutineContext = coroutineContext;
        if (getLifecycle$lifecycle_common().getCurrentState() != Lifecycle.State.DESTROYED || (o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = (O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00) getCoroutineContext().get(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4063O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) == null) {
            return;
        }
        O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = (O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo) o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
        o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(new O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000(o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(), null, o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo));
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope, kotlinx.coroutines.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O
    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    public Lifecycle getLifecycle$lifecycle_common() {
        return this.lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(source, "source");
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(event, "event");
        if (getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            getLifecycle$lifecycle_common().removeObserver(this);
            O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = (O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00) getCoroutineContext().get(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4063O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            if (o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 != null) {
                O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = (O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo) o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
                o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(new O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000(o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(), null, o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo));
            }
        }
    }

    public final void register() {
        kotlinx.coroutines.scheduling.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f4080O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this, O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f4136O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1688O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, new AnonymousClass1(null), 2);
    }
}
