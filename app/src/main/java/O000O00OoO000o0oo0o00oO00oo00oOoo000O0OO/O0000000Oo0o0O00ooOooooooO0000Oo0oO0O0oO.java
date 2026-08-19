package O000O00OoO000o0oo0o00oO00oo00oOoo000O0OO;

import O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
import O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import O000O00O00OooO00O0O000o0OOo0ooOOOo0OoO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.UnrecoverableKeyException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Properties;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import org.eclipse.jetty.util.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public static final TrustManager[] f2006O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = {new O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(2)};

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public static final O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f2007O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public static final String f2008O00000OOoOOO00O00o0ooooooooO000ooooO0000;

    /* JADX INFO: renamed from: O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, reason: collision with root package name */
    public static final String f2009O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public ByteArrayInputStream f2015O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public ByteArrayInputStream f2017O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public SSLContext f2021O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final LinkedHashSet f2010O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new LinkedHashSet();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final LinkedHashSet f2011O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new LinkedHashSet();

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final LinkedHashSet f2012O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new LinkedHashSet();

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final LinkedHashSet f2013O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new LinkedHashSet();

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final String f2014O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = "JKS";

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public String f2016O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = "JKS";

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public final String f2018O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = "TLS";

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public String f2019O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = f2009O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public final boolean f2020O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = true;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public final boolean f2022O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = true;

    static {
        Properties properties = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f2007O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.class.getName());
        f2008O00000OOoOOO00O00o0ooooooooO000ooooO0000 = Security.getProperty("ssl.KeyManagerFactory.algorithm") == null ? "SunX509" : Security.getProperty("ssl.KeyManagerFactory.algorithm");
        f2009O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = Security.getProperty("ssl.TrustManagerFactory.algorithm") != null ? Security.getProperty("ssl.TrustManagerFactory.algorithm") : "SunX509";
        System.getProperty("user.home");
        String str = File.separator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.security.KeyStore] */
    public static KeyStore O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(ByteArrayInputStream byteArrayInputStream, String str) throws IOException {
        byteArrayInputStream = byteArrayInputStream;
        if (byteArrayInputStream == 0) {
            return null;
        }
        if (byteArrayInputStream == 0) {
            try {
                byteArrayInputStream = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(null).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            } finally {
                if (byteArrayInputStream != 0) {
                    byteArrayInputStream.close();
                }
            }
        }
        KeyStore keyStore = KeyStore.getInstance(str);
        keyStore.load(byteArrayInputStream, null);
        return keyStore;
    }

    public final String[] O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(String[] strArr, String[] strArr2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet<String> linkedHashSet2 = this.f2013O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (linkedHashSet2.isEmpty()) {
            linkedHashSet.addAll(Arrays.asList(strArr));
        } else {
            for (String str : linkedHashSet2) {
                if (Arrays.asList(strArr2).contains(str)) {
                    linkedHashSet.add(str);
                }
            }
        }
        LinkedHashSet linkedHashSet3 = this.f2012O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (linkedHashSet3 != null) {
            linkedHashSet.removeAll(linkedHashSet3);
        }
        return (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }

    public final String[] O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(String[] strArr, String[] strArr2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet<String> linkedHashSet2 = this.f2011O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (linkedHashSet2.isEmpty()) {
            linkedHashSet.addAll(Arrays.asList(strArr));
        } else {
            for (String str : linkedHashSet2) {
                if (Arrays.asList(strArr2).contains(str)) {
                    linkedHashSet.add(str);
                }
            }
        }
        LinkedHashSet linkedHashSet3 = this.f2010O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (linkedHashSet3 != null) {
            linkedHashSet.removeAll(linkedHashSet3);
        }
        return (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }

    @Override // org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public final void doStart() throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyManagementException, KeyStoreException {
        KeyManager[] keyManagers;
        TrustManager[] trustManagers;
        TrustManager[] trustManagerArr;
        String str = this.f2014O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        SSLContext sSLContext = this.f2021O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        if (sSLContext == null) {
            ByteArrayInputStream byteArrayInputStream = this.f2015O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
            String str2 = this.f2018O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = f2007O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
            if (byteArrayInputStream == null && this.f2017O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null) {
                if (this.f2022O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
                    ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("No keystore or trust store configured.  ACCEPTING UNTRUSTED CERTIFICATES!!!!!", new Object[0]);
                    trustManagerArr = f2006O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
                } else {
                    trustManagerArr = null;
                }
                SSLContext sSLContext2 = SSLContext.getInstance(str2);
                this.f2021O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = sSLContext2;
                sSLContext2.init(null, trustManagerArr, null);
                return;
            }
            String str3 = f2008O00000OOoOOO00O00o0ooooooooO000ooooO0000;
            if (sSLContext == null) {
                if (byteArrayInputStream == null) {
                    throw new IllegalStateException("SSL doesn't have a valid keystore");
                }
                if (this.f2017O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null) {
                    this.f2017O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = byteArrayInputStream;
                    this.f2016O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = str;
                    this.f2019O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = str3;
                }
                if (byteArrayInputStream == this.f2017O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        ByteArrayInputStream byteArrayInputStream2 = this.f2015O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                        int i = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f4464O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        byte[] bArr = new byte[i];
                        while (true) {
                            int i2 = byteArrayInputStream2.read(bArr, 0, i);
                            if (i2 < 0) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr, 0, i2);
                            }
                        }
                        this.f2015O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.close();
                        this.f2015O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                        this.f2017O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    } catch (Exception e) {
                        throw new IllegalStateException(e);
                    }
                }
            }
            KeyStore keyStoreO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this.f2015O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, str);
            KeyStore keyStoreO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O2 = O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this.f2017O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, this.f2016O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            if (keyStoreO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O != null) {
                KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(str3);
                keyManagerFactory.init(keyStoreO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, null);
                keyManagers = keyManagerFactory.getKeyManagers();
            } else {
                keyManagers = null;
            }
            if (keyStoreO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O2 != null) {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(this.f2019O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
                trustManagerFactory.init(keyStoreO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O2);
                trustManagers = trustManagerFactory.getTrustManagers();
            } else {
                trustManagers = null;
            }
            SSLContext sSLContext3 = SSLContext.getInstance(str2);
            this.f2021O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = sSLContext3;
            sSLContext3.init(keyManagers, trustManagers, null);
            SSLEngine sSLEngineCreateSSLEngine = this.f2021O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.createSSLEngine();
            sSLEngineCreateSSLEngine.setEnabledCipherSuites(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(sSLEngineCreateSSLEngine.getEnabledCipherSuites(), sSLEngineCreateSSLEngine.getSupportedCipherSuites()));
            sSLEngineCreateSSLEngine.setEnabledProtocols(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(sSLEngineCreateSSLEngine.getEnabledProtocols(), sSLEngineCreateSSLEngine.getSupportedProtocols()));
            O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO("Enabled Protocols {} of {}", Arrays.asList(sSLEngineCreateSSLEngine.getEnabledProtocols()), Arrays.asList(sSLEngineCreateSSLEngine.getSupportedProtocols()));
            if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo()) {
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Enabled Ciphers   {} of {}", Arrays.asList(sSLEngineCreateSSLEngine.getEnabledCipherSuites()), Arrays.asList(sSLEngineCreateSSLEngine.getSupportedCipherSuites()));
            }
        }
    }

    public final String toString() {
        return String.format("%s@%x(%s,%s)", O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.class.getSimpleName(), Integer.valueOf(hashCode()), null, null);
    }
}
