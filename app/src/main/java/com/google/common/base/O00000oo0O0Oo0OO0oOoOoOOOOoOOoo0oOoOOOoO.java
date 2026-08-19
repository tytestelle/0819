package com.google.common.base;

/* JADX INFO: loaded from: classes.dex */
public final class O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO implements O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final androidx.media3.exoplayer.analytics.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo f3364O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new androidx.media3.exoplayer.analytics.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(1);

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Object f3365O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new Object();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public volatile O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O f3366O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public Object f3367O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) {
        this.f3366O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
    }

    @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
    public final Object get() {
        O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = this.f3366O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        androidx.media3.exoplayer.analytics.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = f3364O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O != o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo) {
            synchronized (this.f3365O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                try {
                    if (this.f3366O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo) {
                        Object obj = this.f3366O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get();
                        this.f3367O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj;
                        this.f3366O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f3367O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    public final String toString() {
        Object obj = this.f3366O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f3364O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            obj = "<supplier that returned " + this.f3367O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
