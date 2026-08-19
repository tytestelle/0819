package O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;

/* JADX INFO: loaded from: classes.dex */
public abstract class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f812O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(0);

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f813O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(1);

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj) {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(obj, "Argument must not be null");
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
