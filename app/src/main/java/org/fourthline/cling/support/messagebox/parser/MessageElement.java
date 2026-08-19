package org.fourthline.cling.support.messagebox.parser;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import javax.xml.xpath.XPath;
import org.seamless.xml.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
import org.seamless.xml.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import org.seamless.xml.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes2.dex */
public class MessageElement extends O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {
    public static final String XPATH_PREFIX = "m";

    public MessageElement(XPath xPath, Element element) {
        super(xPath, element);
    }

    @Override // org.seamless.xml.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo createChildBuilder(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        return new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) { // from class: org.fourthline.cling.support.messagebox.parser.MessageElement.2
            @Override // org.seamless.xml.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
            public MessageElement build(Element element) {
                return new MessageElement(MessageElement.this.getXpath(), element);
            }

            @Override // org.seamless.xml.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo
            public MessageElement[] newChildrenArray(int i) {
                return new MessageElement[i];
            }
        };
    }

    @Override // org.seamless.xml.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 createParentBuilder(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        return new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) { // from class: org.fourthline.cling.support.messagebox.parser.MessageElement.1
            @Override // org.seamless.xml.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
            public MessageElement build(Element element) {
                return new MessageElement(MessageElement.this.getXpath(), element);
            }
        };
    }

    @Override // org.seamless.xml.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public String prefix(String str) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("m:", str);
    }
}
