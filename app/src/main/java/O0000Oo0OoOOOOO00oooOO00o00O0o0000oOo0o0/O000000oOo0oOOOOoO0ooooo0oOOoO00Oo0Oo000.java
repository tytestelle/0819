package O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;

import java.util.ArrayList;
import okhttp3.OkHttpClient;
import okhttp3.dnsoverhttps.DnsOverHttps;

/* JADX INFO: loaded from: classes.dex */
public abstract class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static DnsOverHttps f1586O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final ArrayList f1587O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    static {
        new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
        f1586O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
        f1587O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ArrayList();
    }

    public static synchronized void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(OkHttpClient.Builder builder) {
        try {
            builder.sslSocketFactory(new O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(), O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f870O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
            builder.hostnameVerifier(O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1610O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
