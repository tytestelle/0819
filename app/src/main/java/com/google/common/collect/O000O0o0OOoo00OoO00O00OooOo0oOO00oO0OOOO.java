package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public final class O000O0o0OOoo00OoO00O00OooOo0oOO00oO0OOOO extends O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo f3516O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo f3517O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000Oo00OoOOooO000o0oOo00oOo0OOOo0OOOo0o.f3558O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O000O0o0OOoo00OoO00O00OooOo0oOO00oO0OOOO(O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo o000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo) {
        this.f3516O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo.map.values().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3517O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.hasNext() || this.f3516O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f3517O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.hasNext()) {
            this.f3517O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = ((O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo) this.f3516O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.next()).iterator();
        }
        return this.f3517O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.next();
    }
}
