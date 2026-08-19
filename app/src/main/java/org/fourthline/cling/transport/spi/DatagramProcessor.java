package org.fourthline.cling.transport.spi;

import java.net.DatagramPacket;
import java.net.InetAddress;
import org.fourthline.cling.model.message.IncomingDatagramMessage;
import org.fourthline.cling.model.message.OutgoingDatagramMessage;

/* JADX INFO: loaded from: classes2.dex */
public interface DatagramProcessor {
    IncomingDatagramMessage read(InetAddress inetAddress, DatagramPacket datagramPacket);

    DatagramPacket write(OutgoingDatagramMessage outgoingDatagramMessage);
}
