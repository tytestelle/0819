package androidx.core.location;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2172O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.LocationListenerTransport f2173O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ String f2174O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(LocationManagerCompat.LocationListenerTransport locationListenerTransport, String str, int i) {
        this.f2172O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2173O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = locationListenerTransport;
        this.f2174O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2172O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2173O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onProviderEnabled$4(this.f2174O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                this.f2173O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$onProviderDisabled$5(this.f2174O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
