package org.fourthline.cling.transport.impl;

import com.tencent.smtt.sdk.TbsListener;
import java.net.InetAddress;
import org.fourthline.cling.transport.spi.MulticastReceiverConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class MulticastReceiverConfigurationImpl implements MulticastReceiverConfiguration {
    private InetAddress group;
    private int maxDatagramBytes;
    private int port;

    public MulticastReceiverConfigurationImpl(InetAddress inetAddress, int i, int i2) {
        this.group = inetAddress;
        this.port = i;
        this.maxDatagramBytes = i2;
    }

    @Override // org.fourthline.cling.transport.spi.MulticastReceiverConfiguration
    public InetAddress getGroup() {
        return this.group;
    }

    @Override // org.fourthline.cling.transport.spi.MulticastReceiverConfiguration
    public int getMaxDatagramBytes() {
        return this.maxDatagramBytes;
    }

    @Override // org.fourthline.cling.transport.spi.MulticastReceiverConfiguration
    public int getPort() {
        return this.port;
    }

    public void setGroup(InetAddress inetAddress) {
        this.group = inetAddress;
    }

    public void setMaxDatagramBytes(int i) {
        this.maxDatagramBytes = i;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public MulticastReceiverConfigurationImpl(InetAddress inetAddress, int i) {
        this(inetAddress, i, TbsListener.ErrorCode.STATIC_TBS_INSTALL_MAKE_SYMBOLIC_LINK_ERR);
    }

    public MulticastReceiverConfigurationImpl(String str, int i, int i2) {
        this(InetAddress.getByName(str), i, i2);
    }

    public MulticastReceiverConfigurationImpl(String str, int i) {
        this(InetAddress.getByName(str), i, TbsListener.ErrorCode.STATIC_TBS_INSTALL_MAKE_SYMBOLIC_LINK_ERR);
    }
}
