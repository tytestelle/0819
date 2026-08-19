package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O implements O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Class f4006O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(Class jClass) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(jClass, "jClass");
        this.f4006O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = jClass;
    }

    @Override // kotlin.jvm.internal.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final Class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return this.f4006O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
            if (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.f4006O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, ((O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) obj).f4006O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4006O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.hashCode();
    }

    public final String toString() {
        return this.f4006O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.toString() + " (Kotlin reflection is not available)";
    }
}
