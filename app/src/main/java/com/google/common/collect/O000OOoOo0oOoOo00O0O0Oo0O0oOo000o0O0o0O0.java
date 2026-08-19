package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class O000OOoOo0oOoOo00O0O0Oo0O0oOo000o0O0o0O0 extends O000O0O0oOoOo0OO0o0oooO0o0O0ooOOOooOOoo0 {
    private static final long serialVersionUID = 0;
    private final Comparator<Object> comparator;

    public O000OOoOo0oOoOo00O0O0Oo0O0oOo000o0O0o0O0(O000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00 o000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00) {
        super(o000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00);
        this.comparator = o000OOoOoOo0O0oOOo0OOoo0oOOoO0OoOOOO0O00.comparator();
    }

    @Override // com.google.common.collect.O000O0O0oOoOo0OO0o0oooO0o0O0ooOOOooOOoo0
    public O000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0 makeBuilder(int i) {
        return new O000OOoOOo00oOo000OoOoOoOOOoO0OoOOOO00O0(this.comparator);
    }
}
