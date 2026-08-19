package O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO;

import android.os.Handler;
import android.os.Looper;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f1599O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    static {
        X509TrustManager x509TrustManager;
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1600O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new Handler(Looper.getMainLooper());
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1602O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 3;
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1604O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = -1L;
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1603O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.NO_CACHE;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = new O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO("OkGo");
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.BODY);
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.f1614O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = Level.INFO;
        builder.addInterceptor(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        builder.readTimeout(60000L, timeUnit);
        builder.writeTimeout(60000L, timeUnit);
        builder.connectTimeout(60000L, timeUnit);
        try {
            TrustManager[] trustManagerArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new InputStream[0]);
            if (trustManagerArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null) {
                int length = trustManagerArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        x509TrustManager = null;
                        break;
                    }
                    TrustManager trustManager = trustManagerArrO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[i];
                    if (trustManager instanceof X509TrustManager) {
                        x509TrustManager = (X509TrustManager) trustManager;
                        break;
                    }
                    i++;
                }
            } else {
                x509TrustManager = O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1609O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            }
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            builder.sslSocketFactory(sSLContext.getSocketFactory(), x509TrustManager);
            builder.hostnameVerifier(O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1610O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1601O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = builder.build();
            f1599O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        } catch (KeyManagementException e) {
            throw new AssertionError(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }
}
