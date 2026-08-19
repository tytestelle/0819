package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.source.MediaSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2652O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ BasePreloadManager f2653O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ MediaSource f2654O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(BasePreloadManager basePreloadManager, MediaSource mediaSource, int i) {
        this.f2652O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2653O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = basePreloadManager;
        this.f2654O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = mediaSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2652O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2653O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onPreloadCompleted$2(this.f2654O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                this.f2653O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onPreloadSkipped$5(this.f2654O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
