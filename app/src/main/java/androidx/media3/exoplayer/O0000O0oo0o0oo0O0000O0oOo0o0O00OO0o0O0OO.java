package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2391O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ MediaSourceList.ForwardingEventListener f2392O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Pair f2393O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ LoadEventInfo f2394O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final /* synthetic */ MediaLoadData f2395O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public /* synthetic */ O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.f2391O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2392O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = forwardingEventListener;
        this.f2393O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = pair;
        this.f2394O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = loadEventInfo;
        this.f2395O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2391O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2392O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onLoadCanceled$2(this.f2393O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2394O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, this.f2395O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                break;
            default:
                this.f2392O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onLoadCompleted$1(this.f2393O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2394O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, this.f2395O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                break;
        }
    }
}
