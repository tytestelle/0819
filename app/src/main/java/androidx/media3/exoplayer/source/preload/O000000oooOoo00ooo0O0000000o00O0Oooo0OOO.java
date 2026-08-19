package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2674O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(Object obj, Object obj2, int i) {
        this.f2672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f2674O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2672O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((PreCacheHelper.DownloadCallback) this.f2673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$notifyListeners$6((Consumer) this.f2674O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                ((PreloadMediaSource) this.f2673O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$onChildSourceInfoRefreshed$2((Timeline) this.f2674O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
