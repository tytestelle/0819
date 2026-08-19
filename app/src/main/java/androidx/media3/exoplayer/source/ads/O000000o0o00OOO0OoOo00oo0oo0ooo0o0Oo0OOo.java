package androidx.media3.exoplayer.source.ads;

import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.collect.O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2643O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2644O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2645O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ Object f2646O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Object obj, int i, Object obj2, Object obj3) {
        this.f2643O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2644O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f2645O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj2;
        this.f2646O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2643O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((AdsMediaSource.AdPrepareListener) this.f2644O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$onPrepareError$1((MediaSource.MediaPeriodId) this.f2645O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (IOException) this.f2646O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
            default:
                ((ServerSideAdInsertionMediaSource) this.f2644O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$setAdPlaybackStates$0((O000O0OO0O00oOOooOo0OoO0Oo00ooOOOOOooO0o) this.f2645O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (Timeline) this.f2646O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
        }
    }
}
