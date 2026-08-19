package androidx.media3.exoplayer.drm;

import com.google.common.util.concurrent.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2548O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ OfflineLicenseHelper f2549O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ DrmSession f2550O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 f2551O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(DrmSession drmSession, OfflineLicenseHelper offlineLicenseHelper, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0) {
        this.f2548O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 1;
        this.f2549O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = offlineLicenseHelper;
        this.f2550O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = drmSession;
        this.f2551O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2548O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2549O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$getLicenseDurationRemainingSec$0(this.f2551O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, this.f2550O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 1:
                this.f2549O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$acquireFirstSessionOnHandlerThread$3(this.f2550O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2551O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
            default:
                this.f2549O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1(this.f2551O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, this.f2550O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }

    public /* synthetic */ O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(OfflineLicenseHelper offlineLicenseHelper, O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0, DrmSession drmSession, int i) {
        this.f2548O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2549O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = offlineLicenseHelper;
        this.f2551O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0;
        this.f2550O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = drmSession;
    }
}
