package androidx.media3.exoplayer;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2396O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ MediaSourceList.ForwardingEventListener f2397O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Pair f2398O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, int i) {
        this.f2396O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2397O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = forwardingEventListener;
        this.f2398O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2396O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2397O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onDrmKeysRemoved$10(this.f2398O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 1:
                this.f2397O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onDrmKeysRestored$9(this.f2398O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 2:
                this.f2397O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onDrmSessionReleased$11(this.f2398O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                this.f2397O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onDrmKeysLoaded$7(this.f2398O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
