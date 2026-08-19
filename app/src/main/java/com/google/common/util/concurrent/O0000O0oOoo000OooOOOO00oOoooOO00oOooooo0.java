package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 extends O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 {
    private final Callable<Object> callable;
    final /* synthetic */ O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO this$0;

    public O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0(O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO, Callable<Object> callable) {
        this.this$0 = o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;
        callable.getClass();
        this.callable = callable;
    }

    @Override // com.google.common.util.concurrent.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public void afterRanInterruptiblyFailure(Throwable th) {
        this.this$0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(th);
    }

    @Override // com.google.common.util.concurrent.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public void afterRanInterruptiblySuccess(Object obj) {
        this.this$0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(obj);
    }

    @Override // com.google.common.util.concurrent.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public final boolean isDone() {
        return this.this$0.isDone();
    }

    @Override // com.google.common.util.concurrent.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public Object runInterruptibly() {
        return this.callable.call();
    }

    @Override // com.google.common.util.concurrent.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public String toPendingString() {
        return this.callable.toString();
    }
}
