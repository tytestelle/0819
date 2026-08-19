package org.fourthline.cling.support.lastchange;

import com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilderFactory;
import org.fourthline.cling.model.XMLUtil;
import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;
import org.fourthline.cling.support.shared.AbstractMap;
import org.seamless.xml.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
import org.seamless.xml.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import org.seamless.xml.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
import org.seamless.xml.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LastChangeParser extends O00000OOoOOO00O00o0ooooooooO000ooooO0000 {
    private static final Logger log = Logger.getLogger(LastChangeParser.class.getName());

    public enum CONSTANTS {
        Event,
        InstanceID,
        val;

        public boolean equals(String str) {
            return name().equals(str);
        }
    }

    public class InstanceIDHandler extends O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 {
        public InstanceIDHandler(InstanceID instanceID, O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0) {
            super(instanceID, o00000O00oOOo000000OOOo00OOOo0OooOO00OO0);
        }

        @Override // org.seamless.xml.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
        public boolean isLastElement(String str, String str2, String str3) {
            return CONSTANTS.InstanceID.equals(str2);
        }

        @Override // org.seamless.xml.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            super.startElement(str, str2, str3, attributes);
            int length = attributes.getLength();
            Map.Entry<String, String>[] entryArr = new Map.Entry[length];
            for (int i = 0; i < length; i++) {
                entryArr[i] = new AbstractMap.SimpleEntry(attributes.getLocalName(i), attributes.getValue(i));
            }
            try {
                EventedValue eventedValueCreateValue = LastChangeParser.this.createValue(str2, entryArr);
                if (eventedValueCreateValue != null) {
                    ((InstanceID) getInstance()).getValues().add(eventedValueCreateValue);
                }
            } catch (Exception e) {
                LastChangeParser.log.warning("Error reading event XML, ignoring value: " + O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(e));
            }
        }
    }

    public Document buildDOM(Event event) {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
        Document documentNewDocument = documentBuilderFactoryNewInstance.newDocumentBuilder().newDocument();
        generateRoot(event, documentNewDocument);
        return documentNewDocument;
    }

    public EventedValue createValue(String str, Map.Entry<String, String>[] entryArr) {
        for (Class<? extends EventedValue> cls : getEventedVariables()) {
            if (cls.getSimpleName().equals(str)) {
                return cls.getConstructor(Map.Entry[].class).newInstance(entryArr);
            }
        }
        return null;
    }

    public String generate(Event event) {
        return XMLUtil.documentToFragmentString(buildDOM(event));
    }

    public void generateEventedValue(EventedValue eventedValue, Document document, Element element) {
        String name = eventedValue.getName();
        Map.Entry<String, String>[] attributes = eventedValue.getAttributes();
        if (attributes == null || attributes.length <= 0) {
            return;
        }
        Element elementAppendNewElement = XMLUtil.appendNewElement(document, element, name);
        for (Map.Entry<String, String> entry : attributes) {
            elementAppendNewElement.setAttribute(entry.getKey(), O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.escape(entry.getValue()));
        }
    }

    public void generateInstanceIDs(Event event, Document document, Element element) {
        for (InstanceID instanceID : event.getInstanceIDs()) {
            if (instanceID.getId() != null) {
                Element elementAppendNewElement = XMLUtil.appendNewElement(document, element, CONSTANTS.InstanceID.name());
                elementAppendNewElement.setAttribute(CONSTANTS.val.name(), instanceID.getId().toString());
                Iterator<EventedValue> it = instanceID.getValues().iterator();
                while (it.hasNext()) {
                    generateEventedValue(it.next(), document, elementAppendNewElement);
                }
            }
        }
    }

    public void generateRoot(Event event, Document document) {
        Element elementCreateElementNS = document.createElementNS(getNamespace(), CONSTANTS.Event.name());
        document.appendChild(elementCreateElementNS);
        generateInstanceIDs(event, document, elementCreateElementNS);
    }

    public Set<Class<? extends EventedValue>> getEventedVariables() {
        return Collections.EMPTY_SET;
    }

    public abstract String getNamespace();

    public Event parse(String str) throws O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {
        if (str == null || str.length() == 0) {
            throw new RuntimeException("Null or empty XML");
        }
        Event event = new Event();
        new RootHandler(event, this);
        Logger logger = log;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("Parsing 'LastChange' event XML content");
            logger.fine("===================================== 'LastChange' BEGIN ============================================");
            logger.fine(str);
            logger.fine("====================================== 'LastChange' END  ============================================");
        }
        parse(new InputSource(new StringReader(str)));
        logger.fine("Parsed event with instances IDs: " + event.getInstanceIDs().size());
        if (logger.isLoggable(Level.FINEST)) {
            for (InstanceID instanceID : event.getInstanceIDs()) {
                log.finest("InstanceID '" + instanceID.getId() + "' has values: " + instanceID.getValues().size());
                for (EventedValue eventedValue : instanceID.getValues()) {
                    log.finest(eventedValue.getName() + " => " + eventedValue.getValue());
                }
            }
        }
        return event;
    }

    public Event parseResource(String str) throws IOException {
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(str);
            Event event = parse(O000O0O0O00ooOoOo00oO0ooo0oOooOo0OOO0Oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(resourceAsStream));
            resourceAsStream.close();
            return event;
        } catch (Throwable th) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            throw th;
        }
    }

    public class RootHandler extends O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 {
        public RootHandler(Event event, O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
            super(event, o00000OOoOOO00O00o0ooooooooO000ooooO0000, null);
        }

        @Override // org.seamless.xml.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            String value;
            super.startElement(str, str2, str3, attributes);
            if (!CONSTANTS.InstanceID.equals(str2) || (value = attributes.getValue(CONSTANTS.val.name())) == null) {
                return;
            }
            InstanceID instanceID = new InstanceID(new UnsignedIntegerFourBytes(value));
            ((Event) getInstance()).getInstanceIDs().add(instanceID);
            LastChangeParser.this.new InstanceIDHandler(instanceID, this);
        }

        public RootHandler(Event event) {
            super(event, null, null);
        }
    }
}
