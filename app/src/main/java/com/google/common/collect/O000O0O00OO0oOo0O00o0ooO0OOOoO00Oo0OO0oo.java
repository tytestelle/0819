package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class O000O0O00OO0oOo0O00o0ooO0OOOoO00Oo0OO0oo extends O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3507O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Iterator f3508O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000O0O00OO0oOo0O00o0ooO0OOOoO00Oo0OO0oo(Iterator it, int i) {
        this.f3507O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3508O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3507O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return ((O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo) this.f3508O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).hasNext();
            case 1:
                return ((O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo) this.f3508O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).hasNext();
            default:
                return this.f3508O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3507O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return new O000O00oOo0oo00oO0oOOOoooOO00o0ooOooOOOO((Map.Entry) ((O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo) this.f3508O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).next());
            case 1:
                return ((Map.Entry) ((O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo) this.f3508O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).next()).getValue();
            default:
                return this.f3508O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.next();
        }
    }

    public O000O0O00OO0oOo0O00o0ooO0OOOoO00Oo0OO0oo(O000O0OoooO0oo0OOo0oOo0oO0OooO0o000oo00o o000O0OoooO0oo0OOo0oOo0oO0OooO0o000oo00o) {
        this.f3507O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 1;
        this.f3508O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000O0OoooO0oo0OOo0oOo0oO0OooO0o000oo00o.map.entrySet().iterator();
    }
}
