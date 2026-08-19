package androidx.media3.exoplayer;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2323O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2324O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2325O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Object obj, Object obj2, int i) {
        this.f2323O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2325O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj;
        this.f2324O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2323O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((DefaultSuitableOutputChecker.ImplApi23) this.f2325O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$enable$1((Context) this.f2324O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 1:
                ((DefaultSuitableOutputChecker.ImplApi35) this.f2325O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$enable$1((Context) this.f2324O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 2:
                ((ExoPlayerImpl) this.f2325O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$new$1((ExoPlayerImplInternal.PlaybackInfoUpdate) this.f2324O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            default:
                ((ExoPlayerImplInternal) this.f2325O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$sendMessageToTargetThread$2((PlayerMessage) this.f2324O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
        }
    }
}
