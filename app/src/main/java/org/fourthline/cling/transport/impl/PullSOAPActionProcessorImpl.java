package org.fourthline.cling.transport.impl;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import androidx.media3.common.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.action.ActionArgumentValue;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.message.control.ActionRequestMessage;
import org.fourthline.cling.model.message.control.ActionResponseMessage;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.transport.spi.SOAPActionProcessor;
import org.seamless.xml.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
@Alternative
public class PullSOAPActionProcessorImpl extends SOAPActionProcessorImpl {
    protected static Logger log = Logger.getLogger(SOAPActionProcessor.class.getName());

    public String findActionArgumentValue(Map<String, String> map, ActionArgument actionArgument) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (actionArgument.isNameOrAlias(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    public Map<String, String> getMatchingNodes(XmlPullParser xmlPullParser, ActionArgument[] actionArgumentArr) throws XmlPullParserException, ActionException, IOException {
        ArrayList arrayList = new ArrayList();
        for (ActionArgument actionArgument : actionArgumentArr) {
            arrayList.add(actionArgument.getName().toUpperCase(Locale.ROOT));
            Iterator it = Arrays.asList(actionArgument.getAliases()).iterator();
            while (it.hasNext()) {
                arrayList.add(((String) it.next()).toUpperCase(Locale.ROOT));
            }
        }
        HashMap map = new HashMap();
        String name = xmlPullParser.getName();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2 && arrayList.contains(xmlPullParser.getName().toUpperCase(Locale.ROOT))) {
                map.put(xmlPullParser.getName(), xmlPullParser.nextText());
            }
            if (next == 1 || (next == 3 && xmlPullParser.getName().equals(name))) {
                break;
            }
        }
        if (map.size() >= actionArgumentArr.length) {
            return map;
        }
        throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "Invalid number of input or output arguments in XML message, expected " + actionArgumentArr.length + " but found " + map.size());
    }

    public void readActionInputArguments(XmlPullParser xmlPullParser, ActionInvocation actionInvocation) {
        actionInvocation.setInput(readArgumentValues(xmlPullParser, actionInvocation.getAction().getInputArguments()));
    }

    public void readActionOutputArguments(XmlPullParser xmlPullParser, ActionInvocation actionInvocation) {
        actionInvocation.setOutput(readArgumentValues(xmlPullParser, actionInvocation.getAction().getOutputArguments()));
    }

    public ActionArgumentValue[] readArgumentValues(XmlPullParser xmlPullParser, ActionArgument[] actionArgumentArr) throws XmlPullParserException, ActionException, IOException {
        Map<String, String> matchingNodes = getMatchingNodes(xmlPullParser, actionArgumentArr);
        ActionArgumentValue[] actionArgumentValueArr = new ActionArgumentValue[actionArgumentArr.length];
        for (int i = 0; i < actionArgumentArr.length; i++) {
            ActionArgument actionArgument = actionArgumentArr[i];
            String strFindActionArgumentValue = findActionArgumentValue(matchingNodes, actionArgument);
            if (strFindActionArgumentValue == null) {
                throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "Could not find argument '" + actionArgument.getName() + "' node");
            }
            log.fine("Reading action argument: " + actionArgument.getName());
            actionArgumentValueArr[i] = createValue(actionArgument, strFindActionArgumentValue);
        }
        return actionArgumentValueArr;
    }

    @Override // org.fourthline.cling.transport.impl.SOAPActionProcessorImpl, org.fourthline.cling.transport.spi.SOAPActionProcessor
    public void readBody(ActionRequestMessage actionRequestMessage, ActionInvocation actionInvocation) {
        String messageBody = getMessageBody(actionRequestMessage);
        try {
            readBodyRequest(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(messageBody), actionRequestMessage, actionInvocation);
        } catch (Exception e) {
            throw new UnsupportedDataException(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("Can't transform message payload: ", e), e, messageBody);
        }
    }

    public void readBodyElement(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(xmlPullParser, "Body");
    }

    public void readBodyRequest(XmlPullParser xmlPullParser, ActionRequestMessage actionRequestMessage, ActionInvocation actionInvocation) throws XmlPullParserException, IOException {
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(xmlPullParser, actionInvocation.getAction().getName());
        readActionInputArguments(xmlPullParser, actionInvocation);
    }

    public void readBodyResponse(XmlPullParser xmlPullParser, ActionInvocation actionInvocation) throws XmlPullParserException, ActionException, IOException {
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("Fault")) {
                    actionInvocation.setFailure(readFaultElement(xmlPullParser));
                    return;
                }
                if (xmlPullParser.getName().equals(actionInvocation.getAction().getName() + "Response")) {
                    readActionOutputArguments(xmlPullParser, actionInvocation);
                    return;
                }
            }
            if (next == 1 || (next == 3 && xmlPullParser.getName().equals("Body"))) {
                throw new ActionException(ErrorCode.ACTION_FAILED, O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("Action SOAP response do not contain ", actionInvocation.getAction().getName() + "Response", " element"));
            }
        }
    }

    public ActionException readFaultElement(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(xmlPullParser, "UPnPError");
        String strNextText = null;
        String strNextText2 = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("errorCode")) {
                    strNextText = xmlPullParser.nextText();
                } else if (name.equals("errorDescription")) {
                    strNextText2 = xmlPullParser.nextText();
                }
            }
            if (next == 1 || (next == 3 && xmlPullParser.getName().equals("UPnPError"))) {
                break;
            }
        }
        if (strNextText == null) {
            throw new RuntimeException("Received fault element but no error code");
        }
        try {
            int iIntValue = Integer.valueOf(strNextText).intValue();
            ErrorCode byCode = ErrorCode.getByCode(iIntValue);
            if (byCode != null) {
                log.fine("Reading fault element: " + byCode.getCode() + " - " + strNextText2);
                return new ActionException(byCode, strNextText2, false);
            }
            log.fine("Reading fault element: " + iIntValue + " - " + strNextText2);
            return new ActionException(iIntValue, strNextText2);
        } catch (NumberFormatException unused) {
            throw new RuntimeException("Error code was not a number");
        }
    }

    @Override // org.fourthline.cling.transport.impl.SOAPActionProcessorImpl, org.fourthline.cling.transport.spi.SOAPActionProcessor
    public void readBody(ActionResponseMessage actionResponseMessage, ActionInvocation actionInvocation) {
        String messageBody = getMessageBody(actionResponseMessage);
        try {
            XmlPullParser xmlPullParserO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(messageBody);
            readBodyElement(xmlPullParserO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            readBodyResponse(xmlPullParserO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, actionInvocation);
        } catch (Exception e) {
            throw new UnsupportedDataException(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("Can't transform message payload: ", e), e, messageBody);
        }
    }
}
