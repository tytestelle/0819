package androidx.core.location;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2165O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Executor f2166O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ int f2167O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ Object f2168O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(Object obj, Executor executor, int i, int i2) {
        this.f2165O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i2;
        this.f2168O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = obj;
        this.f2166O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = executor;
        this.f2167O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2165O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((LocationManagerCompat.GnssMeasurementsTransport) this.f2168O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).lambda$onStatusChanged$1(this.f2166O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2167O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            case 1:
                ((LocationManagerCompat.GpsStatusTransport) this.f2168O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).lambda$onGpsStatusChanged$2(this.f2166O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2167O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                ((LocationManagerCompat.PreRGnssStatusTransport) this.f2168O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).lambda$onFirstFix$2(this.f2166O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f2167O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
