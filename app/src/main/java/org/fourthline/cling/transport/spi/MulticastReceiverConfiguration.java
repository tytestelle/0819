package org.fourthline.cling.transport.spi;

import java.net.InetAddress;

/* JADX INFO: loaded from: classes2.dex */
public interface MulticastReceiverConfiguration {
    InetAddress getGroup();

    int getMaxDatagramBytes();

    int getPort();
}
