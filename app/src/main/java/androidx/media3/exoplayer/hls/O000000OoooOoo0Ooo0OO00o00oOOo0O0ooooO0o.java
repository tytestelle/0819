package androidx.media3.exoplayer.hls;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.PlayerMessage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements Consumer, PlayerMessage.Target {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ Object f2561O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj) {
        this.f2561O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        HlsInterstitialsAdsLoader.lambda$startLoadingAssetList$5((HlsInterstitialsAdsLoader.AssetListData) this.f2561O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, (HlsInterstitialsAdsLoader.Listener) obj);
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, Object obj) {
        ((HlsInterstitialsAdsLoader.RunnableAtPosition) this.f2561O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).run();
    }
}
