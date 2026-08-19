package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Consumer;
import androidx.media3.extractor.SeekMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2633O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(Object obj, Object obj2, int i) {
        this.f2632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2633O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f2634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((ProgressiveMediaPeriod) this.f2633O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$seekMap$1((SeekMap) this.f2634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                ((Consumer) this.f2633O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).accept((MediaSourceEventListener) this.f2634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
