package O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f981O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f982O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, int i) {
        this.f981O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f982O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f981O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f982O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.mPlayerEventListener.onPrepared();
                break;
            case 1:
                O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f982O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 2:
                this.f982O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.mPlayerEventListener.onInfo(3, 0);
                break;
            default:
                this.f982O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.mPlayerEventListener.onCompletion();
                break;
        }
    }
}
