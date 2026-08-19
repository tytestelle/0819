package com.android.cast.dlna.dmr;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.android.cast.dlna.dmr.service.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import com.android.cast.dlna.dmr.service.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
import java.util.UUID;
import kotlin.collections.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import kotlin.text.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import kotlin.text.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
import org.fourthline.cling.UpnpServiceConfiguration;
import org.fourthline.cling.android.AndroidUpnpServiceImpl;
import org.fourthline.cling.binding.annotations.AnnotationLocalServiceBinder;
import org.fourthline.cling.model.meta.DeviceDetails;
import org.fourthline.cling.model.meta.DeviceIdentity;
import org.fourthline.cling.model.meta.Icon;
import org.fourthline.cling.model.meta.LocalDevice;
import org.fourthline.cling.model.meta.LocalService;
import org.fourthline.cling.model.meta.ManufacturerDetails;
import org.fourthline.cling.model.meta.ModelDetails;
import org.fourthline.cling.model.types.UDADeviceType;
import org.fourthline.cling.model.types.UDN;
import org.fourthline.cling.support.avtransport.lastchange.AVTransportLastChangeParser;
import org.fourthline.cling.support.renderingcontrol.lastchange.RenderingControlLastChangeParser;

/* JADX INFO: loaded from: classes.dex */
public class DLNARendererService extends AndroidUpnpServiceImpl {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f2789O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO("RendererService", 0);

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f2790O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this);

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public com.android.cast.dlna.dmr.service.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f2791O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f2792O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public LocalDevice f2793O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public final LocalDevice O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String baseUrl) {
        String string;
        UDN udn;
        int i = 0;
        int i2 = 1;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(baseUrl, "baseUrl");
        try {
            string = getApplicationContext().getPackageManager().getApplicationLabel(getApplicationContext().getApplicationInfo()).toString();
        } catch (Exception unused) {
            string = "";
        }
        try {
            byte[] bytes = ("DLNA_MediaPlayer-" + baseUrl + "-" + Build.MODEL + "-" + Build.MANUFACTURER).getBytes(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f4029O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(bytes, "this as java.lang.String).getBytes(charset)");
            udn = new UDN(UUID.nameUUIDFromBytes(bytes));
        } catch (Exception unused2) {
            udn = new UDN(UUID.randomUUID());
        }
        String identifierString = udn.getIdentifierString();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(identifierString, "getIdentifierString(...)");
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f2789O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "create local device: [MediaRenderer][" + O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(identifierString, new String[]{"-"})) + "](" + baseUrl + ")");
        DeviceIdentity deviceIdentity = new DeviceIdentity(udn);
        UDADeviceType uDADeviceType = new UDADeviceType("MediaRenderer", 1);
        String str = Build.MODEL;
        AnnotationLocalServiceBinder annotationLocalServiceBinder = new AnnotationLocalServiceBinder();
        LocalService localService = annotationLocalServiceBinder.read(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.class);
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(localService, "null cannot be cast to non-null type org.fourthline.cling.model.meta.LocalService<com.android.cast.dlna.dmr.service.AVTransportServiceImpl>");
        localService.setManager(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(localService, this, new AVTransportLastChangeParser(), i));
        LocalService localService2 = annotationLocalServiceBinder.read(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.class);
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(localService2, "null cannot be cast to non-null type org.fourthline.cling.model.meta.LocalService<com.android.cast.dlna.dmr.service.AudioRenderServiceImpl>");
        localService2.setManager(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(localService2, this, new RenderingControlLastChangeParser(), i2));
        return new LocalDevice(deviceIdentity, uDADeviceType, new DeviceDetails(string + " DMR (" + str + ")", new ManufacturerDetails(Build.MANUFACTURER), new ModelDetails(str, "MPI MediaPlayer", "v1", baseUrl)), new Icon[0], new LocalService[]{localService, localService2});
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl
    public final UpnpServiceConfiguration createConfiguration() {
        return new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(1);
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public final IBinder onBind(Intent intent) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(intent, "intent");
        return this.f2790O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public final void onCreate() {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f2789O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "DLNARendererService create.");
        super.onCreate();
        Context applicationContext = getApplicationContext();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(applicationContext, "getApplicationContext(...)");
        this.f2791O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new com.android.cast.dlna.dmr.service.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(applicationContext);
        Context applicationContext2 = getApplicationContext();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(applicationContext2, "getApplicationContext(...)");
        this.f2792O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(applicationContext2);
        try {
            Context applicationContext3 = getApplicationContext();
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(applicationContext3, "getApplicationContext(...)");
            this.f2793O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(applicationContext3));
            this.upnpService.getRegistry().addDevice(this.f2793O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        } catch (Exception e) {
            e.printStackTrace();
            stopSelf();
        }
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public final void onDestroy() {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f2789O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "DLNARendererService destroy.");
        LocalDevice localDevice = this.f2793O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        if (localDevice != null) {
            this.upnpService.getRegistry().removeDevice(localDevice);
        }
        com.android.cast.dlna.dmr.service.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f2791O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo("avTransportControl");
            return;
        }
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(null);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
