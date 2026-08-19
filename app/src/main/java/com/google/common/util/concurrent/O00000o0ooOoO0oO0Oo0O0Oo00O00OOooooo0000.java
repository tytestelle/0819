package com.google.common.util.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 extends O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 {
    private final Executor listenerExecutor;
    final /* synthetic */ O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo this$0;

    public O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo, Executor executor) {
        this.this$0 = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
        executor.getClass();
        this.listenerExecutor = executor;
    }

    @Override // com.google.common.util.concurrent.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public final void afterRanInterruptiblyFailure(Throwable th) {
        O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = this.this$0;
        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.f3754O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
        if (th instanceof ExecutionException) {
            o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.cancel(false);
        } else {
            o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(th);
        }
    }

    @Override // com.google.common.util.concurrent.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public final void afterRanInterruptiblySuccess(Object obj) {
        this.this$0.f3754O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
        setValue(obj);
    }

    public final void execute() {
        try {
            this.listenerExecutor.execute(this);
        } catch (RejectedExecutionException e) {
            this.this$0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(e);
        }
    }

    @Override // com.google.common.util.concurrent.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public final boolean isDone() {
        return this.this$0.isDone();
    }

    public abstract void setValue(Object obj);
}
