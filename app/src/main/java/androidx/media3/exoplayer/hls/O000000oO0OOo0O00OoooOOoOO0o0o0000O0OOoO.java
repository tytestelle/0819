package androidx.media3.exoplayer.hls;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO implements Consumer {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2565O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2566O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2567O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Object obj, Object obj2, int i) {
        this.f2565O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2566O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f2567O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj2;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        switch (this.f2565O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((HlsInterstitialsAdsLoader.LoaderCallback) this.f2566O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$onLoadCompleted$0((HlsInterstitialsAdsLoader.AssetList) this.f2567O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (HlsInterstitialsAdsLoader.Listener) obj);
                break;
            default:
                HlsInterstitialsAdsLoader.lambda$stop$4((AdsMediaSource) this.f2566O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (AdPlaybackState) this.f2567O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (HlsInterstitialsAdsLoader.Listener) obj);
                break;
        }
    }
}
