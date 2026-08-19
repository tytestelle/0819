package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
public final class O000O00OoO000o0oo0o00oO00oo00oOoo000O0OO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Object f3500O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Object f3501O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Object f3502O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000O00OoO000o0oo0o00oO00oo00oOoo000O0OO(Object obj, Object obj2, Object obj3) {
        this.f3500O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = obj;
        this.f3501O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj2;
        this.f3502O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj3;
    }

    public final IllegalArgumentException O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f3500O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f3501O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f3502O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        return new IllegalArgumentException(sb.toString());
    }
}
