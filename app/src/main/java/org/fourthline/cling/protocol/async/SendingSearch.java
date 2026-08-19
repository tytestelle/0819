package org.fourthline.cling.protocol.async;

import com.tencent.smtt.sdk.TbsListener;
import java.util.logging.Logger;
import org.fourthline.cling.UpnpService;
import org.fourthline.cling.model.message.discovery.OutgoingSearchRequest;
import org.fourthline.cling.model.message.header.MXHeader;
import org.fourthline.cling.model.message.header.STAllHeader;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.protocol.SendingAsync;

/* JADX INFO: loaded from: classes2.dex */
public class SendingSearch extends SendingAsync {
    private static final Logger log = Logger.getLogger(SendingSearch.class.getName());
    private final int mxSeconds;
    private final UpnpHeader searchTarget;

    public SendingSearch(UpnpService upnpService) {
        this(upnpService, new STAllHeader());
    }

    @Override // org.fourthline.cling.protocol.SendingAsync
    public void execute() {
        log.fine("Executing search for target: " + this.searchTarget.getString() + " with MX seconds: " + getMxSeconds());
        OutgoingSearchRequest outgoingSearchRequest = new OutgoingSearchRequest(this.searchTarget, getMxSeconds());
        prepareOutgoingSearchRequest(outgoingSearchRequest);
        for (int i = 0; i < getBulkRepeat(); i++) {
            try {
                getUpnpService().getRouter().send(outgoingSearchRequest);
                log.finer("Sleeping " + getBulkIntervalMilliseconds() + " milliseconds");
                Thread.sleep((long) getBulkIntervalMilliseconds());
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public int getBulkIntervalMilliseconds() {
        return TbsListener.ErrorCode.INFO_CODE_MINIQB;
    }

    public int getBulkRepeat() {
        return 5;
    }

    public int getMxSeconds() {
        return this.mxSeconds;
    }

    public UpnpHeader getSearchTarget() {
        return this.searchTarget;
    }

    public void prepareOutgoingSearchRequest(OutgoingSearchRequest outgoingSearchRequest) {
    }

    public SendingSearch(UpnpService upnpService, UpnpHeader upnpHeader) {
        this(upnpService, upnpHeader, MXHeader.DEFAULT_VALUE.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SendingSearch(UpnpService upnpService, UpnpHeader upnpHeader, int i) {
        super(upnpService);
        if (UpnpHeader.Type.ST.isValidHeaderType(upnpHeader.getClass())) {
            this.searchTarget = upnpHeader;
            this.mxSeconds = i;
        } else {
            throw new IllegalArgumentException("Given search target instance is not a valid header class for type ST: " + upnpHeader.getClass());
        }
    }
}
