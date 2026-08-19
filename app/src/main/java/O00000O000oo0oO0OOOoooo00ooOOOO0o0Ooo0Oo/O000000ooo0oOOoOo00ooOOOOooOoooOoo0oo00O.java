package O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O {

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static final O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 f191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(0);

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Object f192O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO f193O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final String f194O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public volatile byte[] f195O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(String str, Object obj, O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f194O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = str;
        this.f192O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = obj;
        this.f193O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
    }

    public static O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj, String str) {
        return new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(str, obj, f191O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
            return this.f194O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.equals(((O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) obj).f194O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f194O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.hashCode();
    }

    public final String toString() {
        return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder("Option{key='"), this.f194O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, "'}");
    }
}
