package org.fourthline.cling.protocol.sync;

import java.util.logging.Logger;
import org.fourthline.cling.UpnpService;
import org.fourthline.cling.model.gena.CancelReason;
import org.fourthline.cling.model.gena.RemoteGENASubscription;
import org.fourthline.cling.model.message.StreamResponseMessage;
import org.fourthline.cling.model.message.gena.IncomingSubscribeResponseMessage;
import org.fourthline.cling.model.message.gena.OutgoingRenewalRequestMessage;
import org.fourthline.cling.protocol.SendingSync;
import org.fourthline.cling.transport.RouterException;

/* JADX INFO: loaded from: classes2.dex */
public class SendingRenewal extends SendingSync<OutgoingRenewalRequestMessage, IncomingSubscribeResponseMessage> {
    private static final Logger log = Logger.getLogger(SendingRenewal.class.getName());
    protected final RemoteGENASubscription subscription;

    public SendingRenewal(UpnpService upnpService, RemoteGENASubscription remoteGENASubscription) {
        super(upnpService, new OutgoingRenewalRequestMessage(remoteGENASubscription, upnpService.getConfiguration().getEventSubscriptionHeaders(remoteGENASubscription.getService())));
        this.subscription = remoteGENASubscription;
    }

    public void onRenewalFailure() {
        log.fine("Subscription renewal failed, removing subscription from registry");
        getUpnpService().getRegistry().removeRemoteSubscription(this.subscription);
        getUpnpService().getConfiguration().getRegistryListenerExecutor().execute(new Runnable() { // from class: org.fourthline.cling.protocol.sync.SendingRenewal.3
            @Override // java.lang.Runnable
            public void run() {
                SendingRenewal.this.subscription.end(CancelReason.RENEWAL_FAILED, null);
            }
        });
    }

    @Override // org.fourthline.cling.protocol.SendingSync
    public IncomingSubscribeResponseMessage executeSync() throws RouterException {
        Logger logger = log;
        logger.fine("Sending subscription renewal request: " + getInputMessage());
        try {
            StreamResponseMessage streamResponseMessageSend = getUpnpService().getRouter().send(getInputMessage());
            if (streamResponseMessageSend == null) {
                onRenewalFailure();
                return null;
            }
            final IncomingSubscribeResponseMessage incomingSubscribeResponseMessage = new IncomingSubscribeResponseMessage(streamResponseMessageSend);
            if (streamResponseMessageSend.getOperation().isFailed()) {
                logger.fine("Subscription renewal failed, response was: " + streamResponseMessageSend);
                getUpnpService().getRegistry().removeRemoteSubscription(this.subscription);
                getUpnpService().getConfiguration().getRegistryListenerExecutor().execute(new Runnable() { // from class: org.fourthline.cling.protocol.sync.SendingRenewal.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SendingRenewal.this.subscription.end(CancelReason.RENEWAL_FAILED, incomingSubscribeResponseMessage.getOperation());
                    }
                });
            } else if (incomingSubscribeResponseMessage.isValidHeaders()) {
                logger.fine("Subscription renewed, updating in registry, response was: " + streamResponseMessageSend);
                this.subscription.setActualSubscriptionDurationSeconds(incomingSubscribeResponseMessage.getSubscriptionDurationSeconds());
                getUpnpService().getRegistry().updateRemoteSubscription(this.subscription);
            } else {
                logger.severe("Subscription renewal failed, invalid or missing (SID, Timeout) response headers");
                getUpnpService().getConfiguration().getRegistryListenerExecutor().execute(new Runnable() { // from class: org.fourthline.cling.protocol.sync.SendingRenewal.2
                    @Override // java.lang.Runnable
                    public void run() {
                        SendingRenewal.this.subscription.end(CancelReason.RENEWAL_FAILED, incomingSubscribeResponseMessage.getOperation());
                    }
                });
            }
            return incomingSubscribeResponseMessage;
        } catch (RouterException e) {
            onRenewalFailure();
            throw e;
        }
    }
}
