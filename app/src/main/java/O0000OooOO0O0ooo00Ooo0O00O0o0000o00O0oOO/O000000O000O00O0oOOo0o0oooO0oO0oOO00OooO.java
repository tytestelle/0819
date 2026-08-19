package O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f1609O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(1);

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f1610O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();

    public static TrustManager[] O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(InputStream... inputStreamArr) {
        if (inputStreamArr.length <= 0) {
            return null;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null);
            int length = inputStreamArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                InputStream inputStream = inputStreamArr[i];
                int i3 = i2 + 1;
                keyStore.setCertificateEntry(Integer.toString(i2), certificateFactory.generateCertificate(inputStream));
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                i++;
                i2 = i3;
            }
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            return trustManagerFactory.getTrustManagers();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
