package kotlinx.coroutines;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o implements O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final boolean f4082O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(boolean z) {
        this.f4082O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = z;
    }

    @Override // kotlinx.coroutines.O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO
    public final O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        return null;
    }

    @Override // kotlinx.coroutines.O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO
    public final boolean isActive() {
        return this.f4082O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f4082O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
