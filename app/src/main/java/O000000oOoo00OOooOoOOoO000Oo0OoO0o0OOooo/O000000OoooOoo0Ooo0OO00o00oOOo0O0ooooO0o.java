package O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

import org.fourthline.cling.android.AndroidUpnpServiceConfiguration;
import org.fourthline.cling.model.types.ServiceType;

/* JADX INFO: loaded from: classes.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends AndroidUpnpServiceConfiguration {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f59O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    @Override // org.fourthline.cling.DefaultUpnpServiceConfiguration, org.fourthline.cling.UpnpServiceConfiguration
    public int getAliveIntervalMillis() {
        switch (this.f59O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 1:
                return 5000;
            default:
                return super.getAliveIntervalMillis();
        }
    }

    @Override // org.fourthline.cling.DefaultUpnpServiceConfiguration, org.fourthline.cling.UpnpServiceConfiguration
    public ServiceType[] getExclusiveServiceTypes() {
        switch (this.f59O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return new ServiceType[]{O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f48O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f49O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f50O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f51O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0};
            default:
                return super.getExclusiveServiceTypes();
        }
    }
}
