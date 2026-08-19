package org.seamless.xml;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final Logger f4523O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = Logger.getLogger(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.class.getName());

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final XmlPullParserFactory f4524O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    static {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            f4524O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            f4523O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.severe("cannot create XmlPullParserFactory instance: " + e);
        }
    }

    public static XmlPullParser O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str) throws XmlPullParserException {
        XmlPullParserFactory xmlPullParserFactory = f4524O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (xmlPullParserFactory == null) {
            throw new XmlPullParserException("no XML Pull parser factory");
        }
        XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactory.newPullParser();
        try {
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(str.getBytes("UTF-8")), "UTF-8");
            return xmlPullParserNewPullParser;
        } catch (UnsupportedEncodingException unused) {
            throw new XmlPullParserException("UTF-8: unsupported encoding");
        }
    }

    public static String O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '&') {
                String strSubstring = str.substring(i, Math.min(i + 10, str.length()));
                if (strSubstring.startsWith("&#") || strSubstring.startsWith("&lt;") || strSubstring.startsWith("&gt;") || strSubstring.startsWith("&amp;") || strSubstring.startsWith("&apos;") || strSubstring.startsWith("&quot;")) {
                    sb.append(cCharAt);
                } else {
                    sb.append("&amp;");
                    z = true;
                }
            } else {
                sb.append(cCharAt);
            }
        }
        if (z) {
            f4523O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.warning("fixed badly encoded entities in XML");
        }
        return sb.toString();
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                throw new IOException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O("tag '", str, "' not found"));
            }
            if (next == 2 && xmlPullParser.getName().equals(str)) {
                return;
            }
        }
    }
}
