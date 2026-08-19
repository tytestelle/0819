package O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;
import java.util.Properties;
import org.eclipse.jetty.util.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO extends O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f1985O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public File f1986O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f1985O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.class.getName());
    }

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(URL url) throws URISyntaxException, IOException {
        super(url, (URLConnection) null);
        try {
            this.f1986O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new File(new URI(url.toString()));
        } catch (URISyntaxException e) {
            throw e;
        } catch (Exception e2) {
            O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = f1985O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e2);
            try {
                URI uri = new URI("file:" + O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(url.toString().substring(5)));
                if (uri.getAuthority() == null) {
                    this.f1986O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new File(uri);
                } else {
                    this.f1986O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new File("//" + uri.getAuthority() + O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(url.getFile()));
                }
            } catch (Exception e3) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e3);
                O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
                Permission permission = this.f2003O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getPermission();
                this.f1986O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new File(permission == null ? url.getFile() : permission.getName());
            }
        }
        if (this.f1986O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.isDirectory()) {
            if (this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.endsWith(ServiceReference.DELIMITER)) {
                return;
            }
            this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder(), this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, ServiceReference.DELIMITER);
        } else if (this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.endsWith(ServiceReference.DELIMITER)) {
            this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(1, 0, this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        }
    }

    @Override // O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final InputStream O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return new FileInputStream(this.f1986O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
    }

    @Override // O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final long O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        return this.f1986O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.lastModified();
    }

    @Override // O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final boolean O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        return this.f1986O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.exists();
    }

    @Override // O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) {
            return false;
        }
        Object obj2 = ((O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) obj).f1986O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        File file = this.f1986O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        if (obj2 != file) {
            return file != null && file.equals(obj2);
        }
        return true;
    }

    @Override // O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final int hashCode() {
        File file = this.f1986O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        return file == null ? this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.hashCode() : file.hashCode();
    }
}
