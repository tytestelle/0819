package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2539O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ DrmSessionEventListener.EventDispatcher f2540O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ DrmSessionEventListener f2541O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i) {
        this.f2539O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2540O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventDispatcher;
        this.f2541O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = drmSessionEventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2539O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2540O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$drmKeysRemoved$4(this.f2541O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 1:
                this.f2540O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$drmKeysRestored$3(this.f2541O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 2:
                this.f2540O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$drmKeysLoaded$1(this.f2541O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                this.f2540O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$drmSessionReleased$5(this.f2541O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
