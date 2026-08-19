package androidx.media3.exoplayer.drm;

import androidx.media3.common.Format;
import com.google.common.util.concurrent.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2534O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2535O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2536O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj, Object obj2, int i) {
        this.f2534O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2535O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f2536O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2534O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((DefaultDrmSessionManager.PreacquiredSessionReference) this.f2535O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$acquire$0((Format) this.f2536O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                ((OfflineLicenseHelper) this.f2535O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$releaseManagerOnHandlerThread$4((O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0) this.f2536O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
