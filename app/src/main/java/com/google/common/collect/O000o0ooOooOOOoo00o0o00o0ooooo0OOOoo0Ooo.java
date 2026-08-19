package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class O000o0ooOooOOOoo00o0o00o0ooooo0OOOoo0Ooo implements com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, Serializable {
    private final int expectedValuesPerKey;

    public O000o0ooOooOOOoo00o0o00o0ooooo0OOOoo0Ooo(int i) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, "expectedValuesPerKey");
        this.expectedValuesPerKey = i;
    }

    @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
    public List<Object> get() {
        return new ArrayList(this.expectedValuesPerKey);
    }
}
