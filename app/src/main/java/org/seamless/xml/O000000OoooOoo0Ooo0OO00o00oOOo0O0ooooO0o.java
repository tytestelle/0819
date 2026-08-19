package org.seamless.xml;

import java.net.URI;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {
    public static final String CDATA_BEGIN = "<![CDATA[";
    public static final String CDATA_END = "]]>";
    public static final URI XML_SCHEMA_NAMESPACE = URI.create("http://www.w3.org/2001/xml.xsd");
    private Document dom;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Document document) {
        this.dom = document;
    }

    public Element createRoot(String str) {
        Element elementCreateElementNS = getW3CDocument().createElementNS(getRootElementNamespace(), str);
        getW3CDocument().appendChild(elementCreateElementNS);
        return elementCreateElementNS;
    }

    public abstract String getRootElementNamespace();

    public Document getW3CDocument() {
        return this.dom;
    }
}
