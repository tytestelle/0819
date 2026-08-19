package org.fourthline.cling.support.messagebox.parser;

import javax.xml.xpath.XPath;
import org.seamless.xml.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
import org.seamless.xml.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
import org.w3c.dom.Document;

/* JADX INFO: loaded from: classes2.dex */
public class MessageDOMParser extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO {
    public O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O createDefaultNamespaceContext(String... strArr) {
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() { // from class: org.fourthline.cling.support.messagebox.parser.MessageDOMParser.1
            @Override // org.seamless.xml.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
            public String getDefaultNamespaceURI() {
                return MessageDOM.NAMESPACE_URI;
            }
        };
        for (String str : strArr) {
            o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.put(str, MessageDOM.NAMESPACE_URI);
        }
        return o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
    }

    public XPath createXPath() {
        return super.createXPath(createDefaultNamespaceContext("m"));
    }

    @Override // org.seamless.xml.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO
    public MessageDOM createDOM(Document document) {
        return new MessageDOM(document);
    }
}
