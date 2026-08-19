package com.google.common.collect;

import java.lang.ref.ReferenceQueue;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O000o0O000000OoOOo0Oo00O0OoOo0oOOoooOoO0 extends O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00 {
    private final ReferenceQueue<Object> queueForValues;

    public O000o0O000000OoOOo0Oo00O0OoOo0oOOoooOoO0(O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO, int i) {
        super(o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO, i);
        this.queueForValues = new ReferenceQueue<>();
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    public ReferenceQueue<Object> getValueReferenceQueueForTesting() {
        return this.queueForValues;
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    public O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO getWeakValueReferenceForTesting(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) {
        return castForTesting(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000).f3605O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    public void maybeClearReferenceQueues() {
        clearReferenceQueue(this.queueForValues);
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    public void maybeDrainReferenceQueues() {
        drainValueReferenceQueue(this.queueForValues);
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    public O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO newWeakValueReferenceForTesting(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, Object obj) {
        return new O000o0Oo000OoO000oO000Oo0oOo0oOOOoO0O000(this.queueForValues, obj, castForTesting(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000));
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    public O000o0O000000OoOOo0Oo00O0OoOo0oOOoooOoO0 self() {
        return this;
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    public void setWeakValueReferenceForTesting(O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000, O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO o000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO) {
        O000o00oOoo0O0o0OOO0ooOooOO00O0Ooooooo0O o000o00oOoo0O0o0OOO0ooOooOO00O0Ooooooo0OCastForTesting = castForTesting(o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000);
        O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO o000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO2 = o000o00oOoo0O0o0OOO0ooOooOO00O0Ooooooo0OCastForTesting.f3605O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o000o00oOoo0O0o0OOO0ooOooOO00O0Ooooooo0OCastForTesting.f3605O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO;
        o000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO2.clear();
    }

    @Override // com.google.common.collect.O000OooooOOooO0OOOoOOoo0OOo0OoOO0O000o00
    @CheckForNull
    public O000o00oOoo0O0o0OOO0ooOooOO00O0Ooooooo0O castForTesting(@CheckForNull O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000 o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000) {
        return (O000o00oOoo0O0o0OOO0ooOooOO00O0Ooooooo0O) o000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000;
    }
}
