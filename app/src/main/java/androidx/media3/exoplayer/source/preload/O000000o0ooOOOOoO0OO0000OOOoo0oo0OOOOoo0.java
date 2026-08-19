package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.RenderersFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2657O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2658O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Object obj, int i) {
        this.f2657O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2658O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
    public final Object get() {
        switch (this.f2657O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return DefaultPreloadManager.Builder.lambda$setLoadControl$5((LoadControl) this.f2658O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 1:
                return DefaultPreloadManager.Builder.lambda$setRenderersFactory$4((RenderersFactory) this.f2658O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            case 2:
                return DefaultPreloadManager.Builder.lambda$setBandwidthMeter$6((BandwidthMeter) this.f2658O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            default:
                return DefaultPreloadManager.Builder.lambda$setMediaSourceFactory$3((MediaSource.Factory) this.f2658O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
    }
}
