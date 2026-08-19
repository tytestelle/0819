package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Consumer, DrmSessionManager.DrmSessionReference {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2532O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) {
        this.f2532O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        DrmSessionEventListener.EventDispatcher eventDispatcher = (DrmSessionEventListener.EventDispatcher) obj;
        switch (this.f2532O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                eventDispatcher.drmSessionAcquired(3);
                break;
            case 1:
                eventDispatcher.drmKeysRemoved();
                break;
            case 2:
                eventDispatcher.drmKeysLoaded();
                break;
            default:
                eventDispatcher.drmKeysRestored();
                break;
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference
    public void release() {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }
}
