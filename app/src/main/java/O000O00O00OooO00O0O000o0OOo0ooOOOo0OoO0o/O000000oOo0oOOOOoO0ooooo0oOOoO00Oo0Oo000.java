package O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 extends O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f2000O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public URL f2001O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public String f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public URLConnection f2003O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public InputStream f2004O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final transient boolean f2005O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f2000O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.class.getName());
    }

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(URL url, URLConnection uRLConnection) {
        this.f2004O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = null;
        this.f2005O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1999O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.f2001O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = url;
        this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = url.toString();
        this.f2003O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = uRLConnection;
    }

    @Override // O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public synchronized InputStream O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        if (!O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0()) {
            throw new IOException("Invalid resource");
        }
        try {
            InputStream inputStream = this.f2004O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
            if (inputStream != null) {
                this.f2004O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = null;
                this.f2003O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
                return inputStream;
            }
            InputStream inputStream2 = this.f2003O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getInputStream();
            this.f2003O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
            return inputStream2;
        } catch (Throwable th) {
            this.f2003O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
            throw th;
        }
    }

    @Override // O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public long O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        if (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0()) {
            return this.f2003O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getLastModified();
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001a A[Catch: all -> 0x000a, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0006, B:12:0x0014, B:13:0x0016, B:15:0x001a, B:11:0x000d), top: B:20:0x0001, inners: #1 }] */
    @Override // O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public synchronized void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        InputStream inputStream = this.f2004O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f2000O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
            }
            this.f2004O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = null;
            if (this.f2003O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
                this.f2003O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
            }
        } else if (this.f2003O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
            this.f2003O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = null;
        }
        throw th;
    }

    public synchronized boolean O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        if (this.f2003O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
            try {
                URLConnection uRLConnectionOpenConnection = this.f2001O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.openConnection();
                this.f2003O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = uRLConnectionOpenConnection;
                uRLConnectionOpenConnection.setUseCaches(this.f2005O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            } catch (IOException e) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f2000O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
            }
        }
        return this.f2003O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null;
    }

    public boolean O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        try {
            synchronized (this) {
                try {
                    if (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() && this.f2004O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == null) {
                        this.f2004O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f2003O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getInputStream();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IOException e) {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f2000O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
        }
        return this.f2004O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) && this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.equals(((O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) obj).f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
    }

    public int hashCode() {
        return this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.hashCode();
    }

    public String toString() {
        return this.f2002O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(URL url, boolean z) {
        this(url, (URLConnection) null);
        this.f2005O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = z;
    }
}
