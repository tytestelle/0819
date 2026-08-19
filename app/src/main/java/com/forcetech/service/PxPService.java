package com.forcetech.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.forcetech.android.ForceTV;
import com.gsoft.mitv.LocalBinder;

/* JADX INFO: loaded from: classes.dex */
public abstract class PxPService extends Service {
    private IBinder binder;
    private ForceTV forceTV;

    public abstract int getPort();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        ForceTV forceTV = new ForceTV();
        this.forceTV = forceTV;
        forceTV.start(intent.getStringExtra("scheme"), getPort());
        return this.binder;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.binder = new LocalBinder();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        try {
            ForceTV forceTV = this.forceTV;
            if (forceTV != null) {
                forceTV.stop();
            }
        } catch (UnsatisfiedLinkError unused) {
        }
        return super.onUnbind(intent);
    }
}
