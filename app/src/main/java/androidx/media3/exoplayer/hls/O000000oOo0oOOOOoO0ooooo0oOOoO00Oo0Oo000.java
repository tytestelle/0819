package androidx.media3.exoplayer.hls;

import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements Consumer {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2568O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2569O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ int f2570O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ int f2571O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final /* synthetic */ Object f2572O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public /* synthetic */ O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i, Object obj, Object obj2, int i2, int i3) {
        this.f2568O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i3;
        this.f2572O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = obj;
        this.f2569O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj2;
        this.f2570O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
        this.f2571O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i2;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        switch (this.f2568O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((HlsInterstitialsAdsLoader.Listener) obj).onAdCompleted((MediaItem) this.f2572O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, this.f2569O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2570O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2571O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
            default:
                HlsInterstitialsAdsLoader.lambda$handlePrepareComplete$2((AdsMediaSource) this.f2572O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, this.f2569O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2570O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2571O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, (HlsInterstitialsAdsLoader.Listener) obj);
                break;
        }
    }
}
