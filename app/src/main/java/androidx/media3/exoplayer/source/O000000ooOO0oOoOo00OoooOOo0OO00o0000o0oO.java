package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Consumer {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2625O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f2626O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ LoadEventInfo f2627O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ MediaLoadData f2628O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(MediaSourceEventListener.EventDispatcher eventDispatcher, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.f2625O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2626O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventDispatcher;
        this.f2627O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = loadEventInfo;
        this.f2628O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = mediaLoadData;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        switch (this.f2625O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2626O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$loadCompleted$1(this.f2627O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2628O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, (MediaSourceEventListener) obj);
                break;
            default:
                this.f2626O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$loadCanceled$2(this.f2627O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f2628O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, (MediaSourceEventListener) obj);
                break;
        }
    }
}
