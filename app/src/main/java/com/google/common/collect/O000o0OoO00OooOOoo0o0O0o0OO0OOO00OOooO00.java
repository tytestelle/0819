package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class O000o0OoO00OooOOoo0o0O0o0OO0OOO00OOooO00 extends O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Object f3612O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public Object f3613O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO f3614O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000o0OoO00OooOOoo0o0O0o0OO0OOO00OOooO00(O000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO, Object obj, Object obj2) {
        this.f3614O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000o0OoO0o0oOo00O0O0oO0oooo000OOo0ooOoO;
        this.f3612O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = obj;
        this.f3613O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj2;
    }

    @Override // com.google.common.collect.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O, java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f3612O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.equals(entry.getKey()) && this.f3613O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.equals(entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3612O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3613O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // com.google.common.collect.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O, java.util.Map.Entry
    public final int hashCode() {
        return this.f3612O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.hashCode() ^ this.f3613O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.hashCode();
    }

    @Override // com.google.common.collect.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object objPut = this.f3614O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.put(this.f3612O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, obj);
        this.f3613O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        return objPut;
    }
}
