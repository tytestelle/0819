package org.seamless.xml;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 extends DefaultHandler {
    protected Attributes attributes;
    protected StringBuilder characters;
    protected Object instance;
    protected O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 parent;
    protected O00000OOoOOO00O00o0ooooooooO000ooooO0000 parser;

    public O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(Object obj, O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0) {
        this(obj, o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.getParser(), o00000O00oOOo000000OOOo00OOOo0OooOO00OO0);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) {
        this.characters.append(cArr, i, i2);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        if (!isLastElement(str, str2, str3)) {
            O00000OOoOOO00O00o0ooooooooO000ooooO0000.log.finer(getClass().getSimpleName() + " ending: " + str2);
            return;
        }
        O00000OOoOOO00O00o0ooooooooO000ooooO0000.log.finer(getClass().getSimpleName() + ": last element, switching to parent: " + str2);
        switchToParent();
    }

    public Attributes getAttributes() {
        return this.attributes;
    }

    public String getCharacters() {
        return this.characters.toString();
    }

    public Object getInstance() {
        return this.instance;
    }

    public O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 getParent() {
        return this.parent;
    }

    public O00000OOoOOO00O00o0ooooooooO000ooooO0000 getParser() {
        return this.parser;
    }

    public boolean isLastElement(String str, String str2, String str3) {
        return false;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        this.characters = new StringBuilder();
        this.attributes = new AttributesImpl(attributes);
        O00000OOoOOO00O00o0ooooooooO000ooooO0000.log.finer(getClass().getSimpleName() + " starting: " + str2);
    }

    public void switchToParent() {
        O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
        O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = this.parser;
        if (o00000OOoOOO00O00o0ooooooooO000ooooO0000 == null || (o00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = this.parent) == null) {
            return;
        }
        o00000OOoOOO00O00o0ooooooooO000ooooO0000.setContentHandler(o00000O00oOOo000000OOOo00OOOo0OooOO00OO0);
        this.attributes = null;
    }

    public O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(Object obj, O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000, O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0) {
        this.characters = new StringBuilder();
        this.instance = obj;
        this.parser = o00000OOoOOO00O00o0ooooooooO000ooooO0000;
        this.parent = o00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
        if (o00000OOoOOO00O00o0ooooooooO000ooooO0000 != null) {
            o00000OOoOOO00O00o0ooooooooO000ooooO0000.setContentHandler(this);
        }
    }
}
