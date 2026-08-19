package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {
    public static boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(DrmSession drmSession) {
        return false;
    }

    public static void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.acquire(null);
        }
        if (drmSession != null) {
            drmSession.release(null);
        }
    }
}
