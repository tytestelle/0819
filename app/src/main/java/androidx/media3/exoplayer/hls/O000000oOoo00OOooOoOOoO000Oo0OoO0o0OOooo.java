package androidx.media3.exoplayer.hls;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements Consumer {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2573O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2574O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ int f2575O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ int f2576O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final /* synthetic */ Object f2577O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final /* synthetic */ Object f2578O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public /* synthetic */ O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(int i, Object obj, int i2, Object obj2, int i3, Object obj3) {
        this.f2573O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i3;
        this.f2577O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = obj;
        this.f2574O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj2;
        this.f2575O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
        this.f2576O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i2;
        this.f2578O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = obj3;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        switch (this.f2573O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((HlsInterstitialsAdsLoader.Listener) obj).onMetadata((MediaItem) this.f2577O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, this.f2574O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2575O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2576O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, (Metadata) this.f2578O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                break;
            default:
                HlsInterstitialsAdsLoader.lambda$handlePrepareError$3((AdsMediaSource) this.f2577O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, this.f2574O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2575O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2576O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, (IOException) this.f2578O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, (HlsInterstitialsAdsLoader.Listener) obj);
                break;
        }
    }
}
