package O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o;

import java.io.File;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f1998O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final boolean f1999O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f1998O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.class.getName());
        f1999O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = true;
    }

    public static O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(String str) throws MalformedURLException {
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = f1998O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        boolean z = f1999O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        try {
            URL url = new URL(str);
            String externalForm = url.toExternalForm();
            if (!externalForm.startsWith("file:")) {
                boolean zStartsWith = externalForm.startsWith("jar:file:");
                boolean z2 = f1999O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (zStartsWith) {
                    return new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(url, z2);
                }
                return externalForm.startsWith("jar:") ? new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(url, z2) : new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(url, z2);
            }
            try {
                return new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(url);
            } catch (Exception e) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("EXCEPTION ", e);
                String string = e.toString();
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(url, null);
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1984O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = string;
                return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            }
        } catch (MalformedURLException e2) {
            if (str.startsWith("ftp:") || str.startsWith("file:") || str.startsWith("jar:")) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00("Bad Resource: ".concat(str), new Object[0]);
                throw e2;
            }
            try {
                if (str.startsWith("./")) {
                    str = str.substring(2);
                }
                File canonicalFile = new File(str).getCanonicalFile();
                URL url2 = canonicalFile.toURI().toURL();
                URLConnection uRLConnectionOpenConnection = url2.openConnection();
                uRLConnectionOpenConnection.setUseCaches(z);
                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(url2, uRLConnectionOpenConnection);
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1986O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = canonicalFile;
                if (canonicalFile.isDirectory() && !o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.endsWith(ServiceReference.DELIMITER)) {
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo += ServiceReference.DELIMITER;
                }
                return o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            } catch (Exception e3) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("EXCEPTION ", e3);
                throw e2;
            }
        }
    }

    public abstract InputStream O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();

    public abstract long O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();

    public abstract void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();

    public final void finalize() {
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
    }
}
