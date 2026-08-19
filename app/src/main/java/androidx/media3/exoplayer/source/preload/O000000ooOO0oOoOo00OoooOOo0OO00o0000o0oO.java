package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.util.Consumer;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Consumer {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2666O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ PreCacheHelper.DownloadCallback f2667O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ IOException f2668O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(PreCacheHelper.DownloadCallback downloadCallback, IOException iOException, int i) {
        this.f2666O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2667O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = downloadCallback;
        this.f2668O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = iOException;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        switch (this.f2666O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2667O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onDownloadStopped$2(this.f2668O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (PreCacheHelper.Listener) obj);
                break;
            default:
                this.f2667O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onPrepareError$1(this.f2668O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (PreCacheHelper.Listener) obj);
                break;
        }
    }
}
