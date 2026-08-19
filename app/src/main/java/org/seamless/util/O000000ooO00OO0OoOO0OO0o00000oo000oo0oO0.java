package org.seamless.util;

import java.net.URI;
import java.net.URL;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f4517O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f4518O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();

    static {
        new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
        new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
        new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
    }

    public static URI O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(URI uri, URI uri2) {
        if (uri == null && !uri2.isAbsolute()) {
            throw new IllegalArgumentException("Base URI is null and given URI is not absolute");
        }
        if (uri == null && uri2.isAbsolute()) {
            return uri2;
        }
        if (uri.getPath().length() == 0) {
            try {
                uri = new URI(uri.getScheme(), uri.getAuthority(), ServiceReference.DELIMITER, uri.getQuery(), uri.getFragment());
            } catch (Exception e) {
                throw new IllegalArgumentException(e);
            }
        }
        return uri.resolve(uri2);
    }

    public static URL O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(URL url, URI uri) {
        if (url == null && !uri.isAbsolute()) {
            throw new IllegalArgumentException("Base URL is null and given URI is not absolute");
        }
        if (url == null && uri.isAbsolute()) {
            try {
                return uri.toURL();
            } catch (Exception unused) {
                throw new IllegalArgumentException("Base URL was null and given URI can't be converted to URL");
            }
        }
        try {
            return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(url.toURI(), uri).toURL();
        } catch (Exception e) {
            throw new IllegalArgumentException("Base URL is not an URI, or can't create absolute URI (null?), or absolute URI can not be converted to URL", e);
        }
    }
}
