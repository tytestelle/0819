package androidx.media3.exoplayer.offline;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements Handler.Callback {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2597O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2598O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Object obj, int i) {
        this.f2597O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2598O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f2597O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return ((DownloadHelper.MediaPreparer) this.f2598O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).handleDownloadHelperCallbackMessage(message);
            default:
                return ((DownloadManager) this.f2598O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).handleMainMessage(message);
        }
    }
}
