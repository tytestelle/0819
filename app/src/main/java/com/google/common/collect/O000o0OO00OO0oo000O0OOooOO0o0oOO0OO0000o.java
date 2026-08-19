package com.google.common.collect;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class O000o0OO00OO0oo000O0OOooOO0o0oOO0OO0000o extends O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00 {
    private final ReferenceQueue<Object> queueForKeys;

    public O000o0OO00OO0oo000O0OOooOO0o0oOO0OO0000o(O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO, int i) {
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
    public O000o0OO00OO0oo000O0OOooOO0o0oOO0OO0000o self() {
        return this;
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    public O000o0OO000000oO0Ooo0O0oooO000Oo000oOOoO castForTesting(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) {
        return (O000o0OO000000oO0Ooo0O0oooO000Oo000oOOoO) o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000;
    }
}
