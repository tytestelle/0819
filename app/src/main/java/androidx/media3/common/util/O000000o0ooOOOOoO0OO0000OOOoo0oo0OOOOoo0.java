package androidx.media3.common.util;

import android.content.Context;
import com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import com.google.common.util.concurrent.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
import com.google.common.util.concurrent.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2301O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2302O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2303O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Object obj, Object obj2, int i) {
        this.f2301O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2302O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f2303O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2301O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((NetworkTypeObserver.Receiver) this.f2302O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$onReceive$0((Context) this.f2303O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 1:
                ((BackgroundThreadStateHandler) this.f2302O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$updateStateAsync$1((O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) this.f2303O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 2:
                ((NetworkTypeObserver) this.f2302O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$new$0((Context) this.f2303O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                Util.lambda$transformFutureAsync$1((O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0) this.f2302O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) this.f2303O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
