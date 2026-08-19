package androidx.core.location;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2184O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.PreRGnssStatusTransport f2185O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Executor f2186O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport, Executor executor, int i) {
        this.f2184O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2185O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = preRGnssStatusTransport;
        this.f2186O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2184O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2185O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onStopped$1(this.f2186O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                this.f2185O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onStarted$0(this.f2186O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
