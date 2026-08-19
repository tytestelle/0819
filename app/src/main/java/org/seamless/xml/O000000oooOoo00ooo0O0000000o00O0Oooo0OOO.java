package org.seamless.xml;

import org.xml.sax.SAXParseException;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO extends Exception {
    public O000000oooOoo00ooo0O0000000o00O0Oooo0OOO() {
    }

    public O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(String str) {
        super(str);
    }

    public O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(String str, Throwable th) {
        super(str, th);
    }

    public O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(Throwable th) {
        super(th);
    }

    public O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(SAXParseException sAXParseException) {
        super("(Line/Column: " + sAXParseException.getLineNumber() + ":" + sAXParseException.getColumnNumber() + ") " + sAXParseException.getMessage());
    }
}
