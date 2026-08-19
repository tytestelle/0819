package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2161O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Executor f2162O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f2163O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ Object f2164O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Object obj, Executor executor, Object obj2, int i) {
        this.f2161O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2163O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj;
        this.f2162O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = executor;
        this.f2164O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2161O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((LocationManagerCompat.GnssMeasurementsTransport) this.f2163O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$onGnssMeasurementsReceived$0(this.f2162O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (GnssMeasurementsEvent) this.f2164O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
            case 1:
                ((LocationManagerCompat.GpsStatusTransport) this.f2163O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$onGpsStatusChanged$3(this.f2162O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (GnssStatusCompat) this.f2164O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
            default:
                ((LocationManagerCompat.PreRGnssStatusTransport) this.f2163O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).lambda$onSatelliteStatusChanged$3(this.f2162O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (GnssStatus) this.f2164O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                break;
        }
    }
}
