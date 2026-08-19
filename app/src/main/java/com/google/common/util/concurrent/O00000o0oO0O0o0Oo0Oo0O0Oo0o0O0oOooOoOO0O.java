package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O extends O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 {
    private final Callable<Object> callable;
    final /* synthetic */ O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo, Callable<Object> callable, Executor executor) {
        super(o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo, executor);
        this.this$0 = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
        callable.getClass();
        this.callable = callable;
    }

    @Override // com.google.common.util.concurrent.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public Object runInterruptibly() {
        return this.callable.call();
    }

    @Override // com.google.common.util.concurrent.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000
    public void setValue(Object obj) {
        this.this$0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(obj);
    }

    @Override // com.google.common.util.concurrent.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public String toPendingString() {
        return this.callable.toString();
    }
}
