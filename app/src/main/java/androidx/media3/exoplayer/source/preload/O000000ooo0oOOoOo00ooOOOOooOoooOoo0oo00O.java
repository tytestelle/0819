package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O implements Consumer {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2669O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ PreCacheHelper.DownloadCallback f2670O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2671O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(PreCacheHelper.DownloadCallback downloadCallback, Object obj, int i) {
        this.f2669O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2670O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = downloadCallback;
        this.f2671O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        switch (this.f2669O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2670O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onPrepared$0((MediaItem) this.f2671O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (PreCacheHelper.Listener) obj);
                break;
            default:
                this.f2670O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onDownloadProgress$4((PreCacheHelper.Task) this.f2671O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (PreCacheHelper.Listener) obj);
                break;
        }
    }
}
