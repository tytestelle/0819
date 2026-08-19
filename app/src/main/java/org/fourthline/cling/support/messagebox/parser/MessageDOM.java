package org.fourthline.cling.support.messagebox.parser;

import javax.xml.xpath.XPath;
import org.seamless.xml.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import org.w3c.dom.Document;

/* JADX INFO: loaded from: classes2.dex */
public class MessageDOM extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {
    public static final String NAMESPACE_URI = "urn:samsung-com:messagebox-1-0";

    public MessageDOM(Document document) {
        super(document);
    }

    public MessageElement createRoot(XPath xPath, String str) {
        super.createRoot(str);
        return m751getRoot(xPath);
    }

    @Override // org.seamless.xml.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public String getRootElementNamespace() {
        return NAMESPACE_URI;
    }

    /* JADX INFO: renamed from: copy, reason: merged with bridge method [inline-methods] */
    public MessageDOM m750copy() {
        return new MessageDOM((Document) getW3CDocument().cloneNode(true));
    }

    /* JADX INFO: renamed from: getRoot, reason: merged with bridge method [inline-methods] */
    public MessageElement m751getRoot(XPath xPath) {
        return new MessageElement(xPath, getW3CDocument().getDocumentElement());
    }
}
