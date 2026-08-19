package org.fourthline.cling.transport.impl;

import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.message.control.ActionRequestMessage;
import org.fourthline.cling.model.message.control.ActionResponseMessage;
import org.fourthline.cling.transport.spi.SOAPActionProcessor;
import org.seamless.xml.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

/* JADX INFO: loaded from: classes2.dex */
@Alternative
public class RecoveringSOAPActionProcessorImpl extends PullSOAPActionProcessorImpl {
    private static Logger log = Logger.getLogger(SOAPActionProcessor.class.getName());

    @Override // org.fourthline.cling.transport.impl.PullSOAPActionProcessorImpl, org.fourthline.cling.transport.impl.SOAPActionProcessorImpl, org.fourthline.cling.transport.spi.SOAPActionProcessor
    public void readBody(ActionRequestMessage actionRequestMessage, ActionInvocation actionInvocation) {
        try {
            super.readBody(actionRequestMessage, actionInvocation);
        } catch (UnsupportedDataException e) {
            if (!actionRequestMessage.isBodyNonEmptyString()) {
                throw e;
            }
            log.warning("Trying to recover from invalid SOAP XML request: " + e);
            try {
                actionRequestMessage.setBody(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(getMessageBody(actionRequestMessage)));
                super.readBody(actionRequestMessage, actionInvocation);
            } catch (UnsupportedDataException e2) {
                handleInvalidMessage(actionInvocation, e, e2);
            }
        }
    }

    @Override // org.fourthline.cling.transport.impl.PullSOAPActionProcessorImpl, org.fourthline.cling.transport.impl.SOAPActionProcessorImpl, org.fourthline.cling.transport.spi.SOAPActionProcessor
    public void readBody(ActionResponseMessage actionResponseMessage, ActionInvocation actionInvocation) {
        try {
            super.readBody(actionResponseMessage, actionInvocation);
        } catch (UnsupportedDataException e) {
            if (actionResponseMessage.isBodyNonEmptyString()) {
                log.warning("Trying to recover from invalid SOAP XML response: " + e);
                String strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(getMessageBody(actionResponseMessage));
                if (strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.endsWith("</s:Envelop")) {
                    strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.concat("e>");
                }
                try {
                    actionResponseMessage.setBody(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    super.readBody(actionResponseMessage, actionInvocation);
                    return;
                } catch (UnsupportedDataException e2) {
                    handleInvalidMessage(actionInvocation, e, e2);
                    return;
                }
            }
            throw e;
        }
    }

    public void handleInvalidMessage(ActionInvocation actionInvocation, UnsupportedDataException unsupportedDataException, UnsupportedDataException unsupportedDataException2) {
        throw unsupportedDataException;
    }
}
