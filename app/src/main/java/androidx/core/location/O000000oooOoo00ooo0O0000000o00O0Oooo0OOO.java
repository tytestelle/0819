package androidx.core.location;

import android.location.Location;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2175O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f2176O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2177O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(LocationManagerCompat.LocationListenerTransport locationListenerTransport, Object obj, int i) {
        this.f2175O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2176O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = locationListenerTransport;
        this.f2177O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2175O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2176O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onLocationChanged$1((List) this.f2177O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                this.f2176O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onLocationChanged$0((Location) this.f2177O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
