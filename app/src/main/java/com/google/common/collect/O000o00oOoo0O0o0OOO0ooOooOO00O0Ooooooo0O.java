package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public class O000o00oOoo0O0o0OOO0ooOooOO00O0Ooooooo0O extends O000OooOoO00o00oOOOO00oOO0Ooo00o0o000O0O implements O000o0OOo00oo0o0ooOOoOooO0oo00o0o0OO000o {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public volatile O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO f3605O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000o00oOoo0O0o0OOO0ooOooOO00O0Ooooooo0O(Object obj, int i) {
        super(obj, i);
        this.f3605O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO.unsetWeakValueReference();
    }

    @Override // com.google.common.collect.O000o0OOo00oo0o0ooOOoOooO0oo00o0o0OO000o
    public final O000o0Oo000O0oOo0OOoo0oo0oOo0OOOO0oo00OO O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        return this.f3605O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // com.google.common.collect.O000Oooo0oo00o0OOo0o0oOOO0o0oo0O0ooOo000
    public final Object getValue() {
        return this.f3605O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.get();
    }
}
