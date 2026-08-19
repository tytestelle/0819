package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.source.MediaPeriod;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2682O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ PreloadMediaSource.PreloadMediaPeriodCallback f2683O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ MediaPeriod f2684O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(PreloadMediaSource.PreloadMediaPeriodCallback preloadMediaPeriodCallback, MediaPeriod mediaPeriod, int i) {
        this.f2682O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2683O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = preloadMediaPeriodCallback;
        this.f2684O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = mediaPeriod;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2682O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2683O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onPrepared$0(this.f2684O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                this.f2683O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onContinueLoadingRequested$1(this.f2684O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
