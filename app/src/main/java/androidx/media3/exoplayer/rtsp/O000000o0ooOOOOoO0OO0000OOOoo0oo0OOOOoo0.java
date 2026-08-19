package androidx.media3.exoplayer.rtsp;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2610O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2611O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Object obj, int i) {
        this.f2610O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2611O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2610O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                RtspMediaPeriod.access$500((RtspMediaPeriod) this.f2611O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 1:
                RtspMediaPeriod.access$500((RtspMediaPeriod) this.f2611O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            default:
                ((HandlerThread) this.f2611O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).quit();
                break;
        }
    }
}
