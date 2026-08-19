package org.fourthline.cling.transport.impl;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.enterprise.inject.Alternative;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.XMLUtil;
import org.fourthline.cling.model.message.gena.IncomingEventRequestMessage;
import org.fourthline.cling.transport.spi.GENAEventProcessor;
import org.seamless.xml.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

/* JADX INFO: loaded from: classes2.dex */
@Alternative
public class RecoveringGENAEventProcessorImpl extends PullGENAEventProcessorImpl {
    private static Logger log = Logger.getLogger(GENAEventProcessor.class.getName());

    public String fixXMLEncodedLastChange(String str) {
        Matcher matcher = Pattern.compile("<LastChange>(.*)</LastChange>", 32).matcher(str);
        if (!matcher.find() || matcher.groupCount() != 1) {
            return str;
        }
        String strGroup = matcher.group(1);
        Logger logger = O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f4523O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (strGroup == null || strGroup.length() == 0) {
            return str;
        }
        String strTrim = strGroup.trim();
        String strEncodeText = strTrim.charAt(0) == '<' ? XMLUtil.encodeText(strTrim) : strTrim;
        return strEncodeText.equals(strTrim) ? str : O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("<?xml version=\"1.0\" encoding=\"utf-8\"?><e:propertyset xmlns:e=\"urn:schemas-upnp-org:event-1-0\"><e:property><LastChange>", strEncodeText, "</LastChange></e:property></e:propertyset>");
    }

    @Override // org.fourthline.cling.transport.impl.PullGENAEventProcessorImpl, org.fourthline.cling.transport.impl.GENAEventProcessorImpl, org.fourthline.cling.transport.spi.GENAEventProcessor
    public void readBody(IncomingEventRequestMessage incomingEventRequestMessage) {
        try {
            super.readBody(incomingEventRequestMessage);
        } catch (UnsupportedDataException e) {
            if (!incomingEventRequestMessage.isBodyNonEmptyString()) {
                throw e;
            }
            log.warning("Trying to recover from invalid GENA XML event: " + e);
            incomingEventRequestMessage.getStateVariableValues().clear();
            try {
                incomingEventRequestMessage.setBody(fixXMLEncodedLastChange(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(getMessageBody(incomingEventRequestMessage))));
                super.readBody(incomingEventRequestMessage);
            } catch (UnsupportedDataException unused) {
                if (incomingEventRequestMessage.getStateVariableValues().isEmpty()) {
                    throw e;
                }
                log.warning("Partial read of GENA event properties (probably due to truncated XML)");
            }
        }
    }
}
