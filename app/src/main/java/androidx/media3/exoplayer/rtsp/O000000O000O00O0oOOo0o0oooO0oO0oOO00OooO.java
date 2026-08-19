package androidx.media3.exoplayer.rtsp;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2604O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2605O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Serializable f2606O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ Object f2607O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, Serializable serializable, Object obj2, int i) {
        this.f2604O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2605O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f2606O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = serializable;
        this.f2607O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2604O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((RtpDataLoadable) this.f2605O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$load$0((String) this.f2606O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (RtpDataChannel) this.f2607O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
            default:
                ((RtspMessageChannel.Sender) this.f2605O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$send$0((byte[]) this.f2606O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (List) this.f2607O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
        }
    }
}
