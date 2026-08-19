package O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o;

import java.io.File;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {

    /* JADX INFO: renamed from: O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f1987O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public JarFile f1988O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public File f1989O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public JarEntry f1990O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public boolean f1991O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public String f1992O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public String f1993O00000OOoOOO00O00o0ooooooooO000ooooO0000;

    /* JADX INFO: renamed from: O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, reason: collision with root package name */
    public boolean f1994O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f1987O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.class.getName());
    }

    @Override // O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final long O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        JarEntry jarEntry;
        if (!O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() || this.f1989O000000oooOoo00ooo0O0000000o00O0Oooo0OOO == null) {
            return -1L;
        }
        return (!O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() || (jarEntry = this.f1990O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) == null) ? this.f1989O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.lastModified() : jarEntry.getTime();
    }

    @Override // O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final synchronized void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        this.f1990O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
        this.f1989O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = null;
        if (!this.f2005O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 && this.f1988O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O != null) {
            try {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f1987O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Closing JarFile " + this.f1988O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getName(), new Object[0]);
                this.f1988O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.close();
            } catch (IOException e) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f1987O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
            }
        }
        this.f1988O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = null;
        super.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
    }

    @Override // O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final boolean O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        try {
            super.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
            if (this.f1997O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null) {
                this.f1990O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
                this.f1989O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = null;
                this.f1988O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = null;
            }
            return this.f1988O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O != null;
        } catch (Throwable th) {
            if (this.f1997O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null) {
                this.f1990O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
                this.f1989O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = null;
                this.f1988O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = null;
            }
            throw th;
        }
    }

    @Override // O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final boolean O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        JarFile jarFile;
        boolean z = true;
        if (this.f1994O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) {
            return true;
        }
        boolean zEndsWith = this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.endsWith("!/");
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = f1987O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
        if (zEndsWith) {
            try {
                return O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(2, 4, this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo)).O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
            } catch (Exception e) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
                return false;
            }
        }
        boolean zO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
        if (this.f1992O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != null && this.f1993O00000OOoOOO00O00o0ooooooooO000ooooO0000 == null) {
            this.f1991O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = zO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            return true;
        }
        if (zO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
            jarFile = this.f1988O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        } else {
            try {
                JarURLConnection jarURLConnection = (JarURLConnection) new URL(this.f1992O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00).openConnection();
                jarURLConnection.setUseCaches(this.f2005O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
                jarFile = jarURLConnection.getJarFile();
            } catch (Exception e2) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e2);
                jarFile = null;
            }
        }
        if (jarFile != null && this.f1990O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo == null && !this.f1991O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) {
            Enumeration<JarEntry> enumerationEntries = jarFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                JarEntry jarEntryNextElement = enumerationEntries.nextElement();
                String strReplace = jarEntryNextElement.getName().replace('\\', '/');
                if (!strReplace.equals(this.f1993O00000OOoOOO00O00o0ooooooooO000ooooO0000)) {
                    if (!this.f1993O00000OOoOOO00O00o0ooooooooO000ooooO0000.endsWith(ServiceReference.DELIMITER)) {
                        if (strReplace.startsWith(this.f1993O00000OOoOOO00O00o0ooooooooO000ooooO0000) && strReplace.length() > this.f1993O00000OOoOOO00O00o0ooooooooO000ooooO0000.length() && strReplace.charAt(this.f1993O00000OOoOOO00O00o0ooooooooO000ooooO0000.length()) == '/') {
                            this.f1991O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = true;
                            break;
                        }
                    } else if (strReplace.startsWith(this.f1993O00000OOoOOO00O00o0ooooooooO000ooooO0000)) {
                        this.f1991O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = true;
                        break;
                    }
                } else {
                    this.f1990O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = jarEntryNextElement;
                    this.f1991O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = this.f1993O00000OOoOOO00O00o0ooooooooO000ooooO0000.endsWith(ServiceReference.DELIMITER);
                    break;
                }
            }
            if (this.f1991O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 && !this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.endsWith(ServiceReference.DELIMITER)) {
                this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder(), this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, ServiceReference.DELIMITER);
                try {
                    this.f2001O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new URL(this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                } catch (MalformedURLException e3) {
                    ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O00000OOoOOO00O00o0ooooooooO000ooooO0000(e3);
                }
            }
        }
        if (!this.f1991O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 && this.f1990O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo == null) {
            z = false;
        }
        this.f1994O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = z;
        return z;
    }

    @Override // O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final synchronized void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        try {
            super.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
            this.f1990O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
            this.f1989O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = null;
            this.f1988O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = null;
            int iIndexOf = this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.indexOf("!/") + 2;
            this.f1992O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.substring(0, iIndexOf);
            String strSubstring = this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.substring(iIndexOf);
            this.f1993O00000OOoOOO00O00o0ooooooooO000ooooO0000 = strSubstring;
            if (strSubstring.length() == 0) {
                this.f1993O00000OOoOOO00O00o0ooooooooO000ooooO0000 = null;
            }
            this.f1988O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = this.f1997O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.getJarFile();
            this.f1989O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = new File(this.f1988O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getName());
        } catch (Throwable th) {
            throw th;
        }
    }
}
