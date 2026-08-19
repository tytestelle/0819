package org.eclipse.jetty.client;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final String f4198O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final int f4199O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Host is null");
        }
        this.f4198O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = str.trim();
        this.f4199O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.class != obj.getClass()) {
            return false;
        }
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) obj;
        return this.f4198O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.equals(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4198O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) && this.f4199O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4199O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    public final int hashCode() {
        return (this.f4198O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.hashCode() * 31) + this.f4199O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    public final String toString() {
        return this.f4198O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + ":" + this.f4199O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }
}
