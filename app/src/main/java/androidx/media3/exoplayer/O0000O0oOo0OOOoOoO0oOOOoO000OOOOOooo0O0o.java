package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.source.MediaLoadData;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2376O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ MediaSourceList.ForwardingEventListener f2377O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Pair f2378O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ MediaLoadData f2379O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o(MediaSourceList.ForwardingEventListener forwardingEventListener, Pair pair, MediaLoadData mediaLoadData, int i) {
        this.f2376O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2377O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = forwardingEventListener;
        this.f2378O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = pair;
        this.f2379O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = mediaLoadData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2376O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2377O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onUpstreamDiscarded$4(this.f2378O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2379O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
            default:
                this.f2377O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onDownstreamFormatChanged$5(this.f2378O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2379O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
        }
    }
}
