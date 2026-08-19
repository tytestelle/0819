package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.source.MediaSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements ListenerSet.Event {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2650O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2651O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj, int i) {
        this.f2650O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2651O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.f2650O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                BasePreloadManager.lambda$onPreloadCompleted$1((MediaSource) this.f2651O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (PreloadManagerListener) obj);
                break;
            default:
                ((PreloadManagerListener) obj).onError((PreloadException) this.f2651O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
        }
    }
}
