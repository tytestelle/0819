package androidx.media3.exoplayer.source.ads;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.source.MediaSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2647O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2648O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2649O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Object obj, Object obj2, int i) {
        this.f2647O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2648O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f2649O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2647O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((AdsMediaSource.AdPrepareListener) this.f2648O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$onPrepareComplete$0((MediaSource.MediaPeriodId) this.f2649O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 1:
                ((AdsMediaSource.ComponentListener) this.f2648O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$onAdPlaybackState$0((AdPlaybackState) this.f2649O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                ((AdsMediaSource) this.f2648O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$onChildSourceInfoRefreshed$2((Timeline) this.f2649O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
