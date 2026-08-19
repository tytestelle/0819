package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o extends O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo f3499O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o(O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo o00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo) {
        this.f3499O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3499O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.f3499O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.next()).getKey();
    }
}
