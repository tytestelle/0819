package org.seamless.xml;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.logging.Logger;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements LSResourceResolver {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final Logger f4520O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = Logger.getLogger(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.class.getName());

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final HashMap f4521O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(HashMap map) {
        this.f4521O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = map;
    }

    @Override // org.w3c.dom.ls.LSResourceResolver
    public final LSInput resolveResource(String str, String str2, String str3, String str4, String str5) {
        String strO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Trying to resolve system identifier URI in catalog: ", str4);
        Logger logger = f4520O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        logger.finest(strO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO);
        URL url = (URL) this.f4521O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(URI.create(str4));
        if (url == null) {
            logger.info("System identifier not found in catalog, continuing with default resolution (this most likely means remote HTTP request!): " + str4);
            return null;
        }
        logger.finest("Loading catalog resource: " + url);
        try {
            InputStream inputStreamOpenStream = url.openStream();
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f4519O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = inputStreamOpenStream;
            return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
