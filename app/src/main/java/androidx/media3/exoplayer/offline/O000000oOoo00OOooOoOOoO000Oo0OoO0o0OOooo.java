package androidx.media3.exoplayer.offline;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2600O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2601O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2602O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Object obj, Object obj2, int i) {
        this.f2600O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2601O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f2602O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2600O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((DownloadService.DownloadManagerHelper) this.f2601O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$attachService$0((DownloadService) this.f2602O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 1:
                ((DownloadHelper) this.f2601O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$onMediaPreparationFailed$3((IOException) this.f2602O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                ((DownloadHelper) this.f2601O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$prepare$1((DownloadHelper.Callback) this.f2602O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
