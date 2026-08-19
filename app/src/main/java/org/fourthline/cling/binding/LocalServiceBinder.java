package org.fourthline.cling.binding;

import org.fourthline.cling.model.meta.LocalService;
import org.fourthline.cling.model.types.ServiceId;
import org.fourthline.cling.model.types.ServiceType;

/* JADX INFO: loaded from: classes2.dex */
public interface LocalServiceBinder {
    LocalService read(Class<?> cls);

    LocalService read(Class<?> cls, ServiceId serviceId, ServiceType serviceType, boolean z, Class[] clsArr);
}
