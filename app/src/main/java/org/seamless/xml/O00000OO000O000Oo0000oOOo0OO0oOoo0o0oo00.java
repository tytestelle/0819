package org.seamless.xml;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 implements ErrorHandler {
    @Override // org.xml.sax.ErrorHandler
    public final void error(SAXParseException sAXParseException) throws SAXException {
        throw new SAXException(sAXParseException);
    }

    @Override // org.xml.sax.ErrorHandler
    public final void fatalError(SAXParseException sAXParseException) throws SAXException {
        throw new SAXException(sAXParseException);
    }

    @Override // org.xml.sax.ErrorHandler
    public final void warning(SAXParseException sAXParseException) throws SAXException {
        throw new SAXException(sAXParseException);
    }
}
