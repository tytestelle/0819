package com.google.common.collect;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class O000o0O0o0O00ooOoOoOoOo0Oo0O0OOO0o000Oo0 extends O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00 {
    private final ReferenceQueue<Object> queueForKeys;

    public O000o0O0o0O00ooOoOoOoOo0Oo0O0OOO0o000Oo0(O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO, int i) {
        super(o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO, i);
        this.queueForKeys = new ReferenceQueue<>();
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    public ReferenceQueue<Object> getKeyReferenceQueueForTesting() {
        return this.queueForKeys;
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    public void maybeClearReferenceQueues() {
        clearReferenceQueue(this.queueForKeys);
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    public void maybeDrainReferenceQueues() {
        drainKeyReferenceQueue(this.queueForKeys);
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    public O000o0O0o0O00ooOoOoOoOo0Oo0O0OOO0o000Oo0 self() {
        return this;
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    public O000o0O0OOO0OO0O0oOOOOo00oOO000O000O0o00 castForTesting(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) {
        return (O000o0O0OOO0OO0O0oOOOOo00oOO000O000O0o00) o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000;
    }
}
