package org.seamless.xml;

import org.fourthline.cling.support.messagebox.parser.MessageElement;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {
    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO element;
    final /* synthetic */ O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO this$0;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(MessageElement messageElement, O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        this.this$0 = messageElement;
        this.element = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    public abstract O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO build(Element element);

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO firstChildOrNull(String str) {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO firstChild = this.element.getFirstChild(str);
        if (firstChild != null) {
            return build(firstChild.getW3CElement());
        }
        return null;
    }
}
