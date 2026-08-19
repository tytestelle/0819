package com.gsoft.mitv;

import O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.anymediacloud.iptv.standard.ForceTV;
import com.forcetech.service.PxpUtil;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class MainActivity extends Service {
    private IBinder binder;
    private ForceTV forceTV;

    public MainActivity() {
        try {
            System.loadLibrary("mitv");
        } catch (UnsatisfiedLinkError e) {
            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "mitv相关Libs不存在");
            e.printStackTrace();
        }
    }

    private void checkLibrary() {
        if (new File(getCacheDir() + "/libmitv.so").exists()) {
            return;
        }
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, "libmitv.so", getCacheDir() + "/libmitv.so");
    }

    private native void loadLibrary(int i);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        ForceTV forceTV = new ForceTV();
        this.forceTV = forceTV;
        forceTV.start(PxpUtil.MTV);
        return this.binder;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.binder = new LocalBinder();
        checkLibrary();
        try {
            loadLibrary(1);
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        ForceTV forceTV = this.forceTV;
        if (forceTV != null) {
            forceTV.stop();
        }
        return super.onUnbind(intent);
    }
}
