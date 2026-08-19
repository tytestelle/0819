package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.collect.O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2372O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2373O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ Object f2374O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(Object obj, int i, Object obj2, Object obj3) {
        this.f2371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2372O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f2373O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj2;
        this.f2374O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((MediaPeriodQueue) this.f2372O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$notifyQueueUpdate$0((O0000ooOOOoO00Oo0O00ooOO0OOOOOO0OOOoO0oO) this.f2373O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (MediaSource.MediaPeriodId) this.f2374O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
            default:
                ((MediaSourceList.ForwardingEventListener) this.f2372O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$onDrmSessionManagerError$8((Pair) this.f2373O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (Exception) this.f2374O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
        }
    }
}
