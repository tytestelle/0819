package org.fourthline.cling.transport.spi;

import org.fourthline.cling.model.message.gena.IncomingEventRequestMessage;
import org.fourthline.cling.model.message.gena.OutgoingEventRequestMessage;

/* JADX INFO: loaded from: classes2.dex */
public interface GENAEventProcessor {
    void readBody(IncomingEventRequestMessage incomingEventRequestMessage);

    void writeBody(OutgoingEventRequestMessage outgoingEventRequestMessage);
}
