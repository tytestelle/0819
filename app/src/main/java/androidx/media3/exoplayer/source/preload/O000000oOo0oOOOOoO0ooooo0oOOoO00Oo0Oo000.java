package androidx.media3.exoplayer.source.preload;

import com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2661O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i) {
        this.f2661O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // com.google.common.base.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final boolean apply(Object obj) {
        DefaultPreloadManager.PreloadStatus preloadStatus = (DefaultPreloadManager.PreloadStatus) obj;
        switch (this.f2661O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return DefaultPreloadManager.SourcePreloadControl.lambda$onTracksSelected$1(preloadStatus);
            default:
                return DefaultPreloadManager.SourcePreloadControl.lambda$onSourcePrepared$0(preloadStatus);
        }
    }
}
