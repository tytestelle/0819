package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements Handler.Callback {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ CompositeMediaSource f2618O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(CompositeMediaSource compositeMediaSource, int i) {
        this.f2617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2618O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = compositeMediaSource;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f2617O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return ((ConcatenatingMediaSource) this.f2618O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).handleMessage(message);
            default:
                return ((ConcatenatingMediaSource2) this.f2618O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).handleMessage(message);
        }
    }
}
