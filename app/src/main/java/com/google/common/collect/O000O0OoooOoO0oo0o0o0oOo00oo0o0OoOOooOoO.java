package com.google.common.collect;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class O000O0OoooOoO0oo0o0o0oOo00oo0o0OoOOooOoO extends O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo f3513O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public Object f3514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public O00O00OooOOOO000O0oOOoOo0O0Oo0o0o0oo0oOo f3515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000Oo00OoOOooO000o0oOo00oOo0OOOo0OOOo0o.f3558O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O000O0OoooOoO0oo0o0o0oOo00oo0o0OoOOooOoO(O000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo o000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo) {
        this.f3513O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000O0oo0O0oOOoo00o0Oo00O000Oo0O00OooOoo.map.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.hasNext() || this.f3513O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f3515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f3513O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.next();
            this.f3514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = entry.getKey();
            this.f3515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ((O0000oo0o00o0oOoOoooo0000Ooo000Oo00oOooo) entry.getValue()).iterator();
        }
        Object obj = this.f3514O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        Objects.requireNonNull(obj);
        return new O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00(obj, this.f3515O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.next());
    }
}
