package org.eclipse.jetty.http;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 implements Map.Entry {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final String f4385O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Object f4386O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public String f4387O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public transient String f4388O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(String str, Object obj) {
        this.f4385O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = str;
        this.f4386O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4385O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4386O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        if (this.f4388O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
            this.f4388O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = ((Object) this.f4385O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) + "=" + this.f4386O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        }
        return this.f4388O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }
}
