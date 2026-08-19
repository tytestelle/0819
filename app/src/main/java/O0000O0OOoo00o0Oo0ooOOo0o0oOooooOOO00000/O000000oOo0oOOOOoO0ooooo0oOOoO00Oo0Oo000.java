package O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements Executor {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f811O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i) {
        this.f811O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f811O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO().post(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
