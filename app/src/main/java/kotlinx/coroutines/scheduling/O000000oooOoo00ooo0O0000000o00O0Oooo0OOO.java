package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Runnable f4174O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(Runnable runnable, long j, O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
        super(j, o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
        this.f4174O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4174O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.run();
        } finally {
            this.f4172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f4174O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(runnable));
        sb.append(", ");
        sb.append(this.f4171O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        sb.append(", ");
        sb.append(this.f4172O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        sb.append(']');
        return sb.toString();
    }
}
