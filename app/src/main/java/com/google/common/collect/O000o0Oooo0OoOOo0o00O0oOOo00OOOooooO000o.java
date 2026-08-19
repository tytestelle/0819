package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class O000o0Oooo0OoOOo0o00O0oOOo00OOOooooO000o extends O00O0000oOoO0o0oO00oOoOO0o0oo0OO0OoO0o0O {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ int f3615O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O000o0Oooo0OoOOo0o00O0oOOo00OOOooooO000o(Iterator it, int i) {
        super(it);
        this.f3615O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
    }

    @Override // com.google.common.collect.O00O0000oOoO0o0oO00oOoOO0o0oo0OO0OoO0o0O
    public final Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj) {
        switch (this.f3615O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            case 0:
                return ((Map.Entry) obj).getValue();
            default:
                return new O000oO000o00ooOoO0OoO0O0OOoO0O0o0o0O0oo0((Map.Entry) obj);
        }
    }
}
