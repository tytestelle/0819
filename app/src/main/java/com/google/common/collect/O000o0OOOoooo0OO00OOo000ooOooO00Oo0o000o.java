package com.google.common.collect;

import java.lang.ref.ReferenceQueue;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000o0OOOoooo0OO00OOo000ooOooO00Oo0o000o extends O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00 {
    private final ReferenceQueue<Object> queueForKeys;
    private final ReferenceQueue<Object> queueForValues;

    public O000o0OOOoooo0OO00OOo000ooOooO00Oo0o000o(O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO, int i) {
        super(o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO, i);
        this.queueForKeys = new ReferenceQueue<>();
        this.queueForValues = new ReferenceQueue<>();
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    public ReferenceQueue<Object> getKeyReferenceQueueForTesting() {
        return this.queueForKeys;
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    public ReferenceQueue<Object> getValueReferenceQueueForTesting() {
        return this.queueForValues;
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    public O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO getWeakValueReferenceForTesting(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) {
        return castForTesting(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000).f3610O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    public void maybeClearReferenceQueues() {
        clearReferenceQueue(this.queueForKeys);
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    public void maybeDrainReferenceQueues() {
        drainKeyReferenceQueue(this.queueForKeys);
        drainValueReferenceQueue(this.queueForValues);
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    public O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO newWeakValueReferenceForTesting(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, Object obj) {
        return new O000o0Oo000OoO000oO000Oo0oOo0oOOOoO0O000(this.queueForValues, obj, castForTesting(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000));
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    public O000o0OOOoooo0OO00OOo000ooOooO00Oo0o000o self() {
        return this;
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    public void setWeakValueReferenceForTesting(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO o000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO) {
        O000o0OOOoO0oo0OOOO0oOooo0OO0oOOO0oOOOOo o000o0OOOoO0oo0OOOO0oOooo0OO0oOOO0oOOOOoCastForTesting = castForTesting(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000);
        O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO o000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO2 = o000o0OOOoO0oo0OOOO0oOooo0OO0oOOO0oOOOOoCastForTesting.f3610O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        o000o0OOOoO0oo0OOOO0oOooo0OO0oOOO0oOOOOoCastForTesting.f3610O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO;
        o000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO2.clear();
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    @CheckForNull
    public O000o0OOOoO0oo0OOOO0oOooo0OO0oOOO0oOOOOo castForTesting(@CheckForNull O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) {
        return (O000o0OOOoO0oo0OOOO0oOooo0OO0oOOO0oOOOOo) o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000;
    }
}
