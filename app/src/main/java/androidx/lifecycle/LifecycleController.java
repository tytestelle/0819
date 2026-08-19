package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import kotlinx.coroutines.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import kotlinx.coroutines.O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;

/* JADX INFO: loaded from: classes.dex */
@MainThread
public final class LifecycleController {
    private final DispatchQueue dispatchQueue;
    private final Lifecycle lifecycle;
    private final Lifecycle.State minState;
    private final LifecycleEventObserver observer;

    public LifecycleController(Lifecycle lifecycle, Lifecycle.State minState, DispatchQueue dispatchQueue, final O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 parentJob) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(lifecycle, "lifecycle");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(minState, "minState");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(dispatchQueue, "dispatchQueue");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(parentJob, "parentJob");
        this.lifecycle = lifecycle;
        this.minState = minState;
        this.dispatchQueue = dispatchQueue;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                LifecycleController.observer$lambda$0(this.f2231O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, parentJob, lifecycleOwner, event);
            }
        };
        this.observer = lifecycleEventObserver;
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(lifecycleEventObserver);
        } else {
            O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(parentJob);
            finish();
        }
    }

    private final void handleDestroy(O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00) {
        O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$0(LifecycleController this$0, O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 parentJob, LifecycleOwner source, Lifecycle.Event event) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this$0, "this$0");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(parentJob, "$parentJob");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(source, "source");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(event, "<anonymous parameter 1>");
        if (source.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(parentJob);
            this$0.finish();
        } else if (source.getLifecycle().getCurrentState().compareTo(this$0.minState) < 0) {
            this$0.dispatchQueue.pause();
        } else {
            this$0.dispatchQueue.resume();
        }
    }

    @MainThread
    public final void finish() {
        this.lifecycle.removeObserver(this.observer);
        this.dispatchQueue.finish();
    }
}
