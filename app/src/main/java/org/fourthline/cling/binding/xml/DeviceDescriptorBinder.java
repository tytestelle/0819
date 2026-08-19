package org.fourthline.cling.binding.xml;

import org.fourthline.cling.model.Namespace;
import org.fourthline.cling.model.meta.Device;
import org.fourthline.cling.model.profile.RemoteClientInfo;
import org.w3c.dom.Document;

/* JADX INFO: loaded from: classes2.dex */
public interface DeviceDescriptorBinder {
    Document buildDOM(Device device, RemoteClientInfo remoteClientInfo, Namespace namespace);

    <T extends Device> T describe(T t, String str);

    <T extends Device> T describe(T t, Document document);

    String generate(Device device, RemoteClientInfo remoteClientInfo, Namespace namespace);
}
