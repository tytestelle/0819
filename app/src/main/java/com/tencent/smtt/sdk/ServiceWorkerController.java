package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Build;
import com.tencent.smtt.export.external.interfaces.IX5CoreServiceWorkerController;
import com.tencent.smtt.export.external.interfaces.ServiceWorkerClient;
import com.tencent.smtt.export.external.interfaces.ServiceWorkerWebSettings;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ServiceWorkerController {
    public static ServiceWorkerController getInstance(Context context) {
        u uVarA = u.a();
        uVarA.a(context);
        if (!uVarA.b()) {
            if (Build.VERSION.SDK_INT >= 24) {
                return new j();
            }
            return null;
        }
        final IX5CoreServiceWorkerController iX5CoreServiceWorkerControllerQ = u.a().c().q();
        if (iX5CoreServiceWorkerControllerQ != null) {
            return new ServiceWorkerController() { // from class: com.tencent.smtt.sdk.ServiceWorkerController.1
                @Override // com.tencent.smtt.sdk.ServiceWorkerController
                public ServiceWorkerWebSettings getServiceWorkerWebSettings() {
                    return iX5CoreServiceWorkerControllerQ.getServiceWorkerWebSettings();
                }

                @Override // com.tencent.smtt.sdk.ServiceWorkerController
                public void setServiceWorkerClient(ServiceWorkerClient serviceWorkerClient) {
                    iX5CoreServiceWorkerControllerQ.setServiceWorkerClient(serviceWorkerClient);
                }
            };
        }
        return null;
    }

    public abstract ServiceWorkerWebSettings getServiceWorkerWebSettings();

    public abstract void setServiceWorkerClient(ServiceWorkerClient serviceWorkerClient);
}
