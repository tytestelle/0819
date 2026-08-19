package com.android.cast.dlna.dmc;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import android.content.Intent;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import org.fourthline.cling.UpnpServiceConfiguration;
import org.fourthline.cling.android.AndroidUpnpServiceImpl;

/* JADX INFO: loaded from: classes.dex */
public final class DLNACastService extends AndroidUpnpServiceImpl {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f2784O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO("CastService", 0);

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl
    public final UpnpServiceConfiguration createConfiguration() {
        return new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(0);
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public final void onCreate() {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f2784O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "DLNACastService onCreate");
        super.onCreate();
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public final void onDestroy() {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f2784O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "DLNACastService onDestroy");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(intent, "intent");
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f2784O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "DLNACastService onStartCommand: " + i + ", " + i2 + ", " + intent);
        return super.onStartCommand(intent, i, i2);
    }
}
