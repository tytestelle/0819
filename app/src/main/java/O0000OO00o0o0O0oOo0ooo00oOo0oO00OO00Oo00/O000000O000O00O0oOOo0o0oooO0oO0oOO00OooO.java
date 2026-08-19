package O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO extends SSLSocketFactory {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final String[] f868O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final String[] f869O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f870O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final SSLSocketFactory f871O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    static {
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLSocketFactory.getDefault().createSocket();
            LinkedList linkedList = new LinkedList();
            for (String str : sSLSocket.getSupportedProtocols()) {
                if (!str.toUpperCase().contains("SSL")) {
                    linkedList.add(str);
                }
            }
            f869O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (String[]) linkedList.toArray(new String[linkedList.size()]);
            List listAsList = Arrays.asList("TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECHDE_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
            List listAsList2 = Arrays.asList(sSLSocket.getSupportedCipherSuites());
            HashSet hashSet = new HashSet(listAsList);
            hashSet.retainAll(listAsList2);
            hashSet.addAll(new HashSet(Arrays.asList(sSLSocket.getEnabledCipherSuites())));
            f868O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (String[]) hashSet.toArray(new String[hashSet.size()]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        f870O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(0);
    }

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new X509TrustManager[]{f870O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            this.f871O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = socketFactory;
            HttpsURLConnection.setDefaultSSLSocketFactory(socketFactory);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(SSLSocket sSLSocket) {
        String[] strArr = f869O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = f868O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = this.f871O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.createSocket(socket, str, i, z);
        if (socketCreateSocket instanceof SSLSocket) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return f868O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return f868O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException {
        Socket socketCreateSocket = this.f871O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.createSocket(str, i);
        if (socketCreateSocket instanceof SSLSocket) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket socketCreateSocket = this.f871O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.createSocket(str, i, inetAddress, i2);
        if (socketCreateSocket instanceof SSLSocket) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket socketCreateSocket = this.f871O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.createSocket(inetAddress, i);
        if (socketCreateSocket instanceof SSLSocket) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket socketCreateSocket = this.f871O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.createSocket(inetAddress, i, inetAddress2, i2);
        if (socketCreateSocket instanceof SSLSocket) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((SSLSocket) socketCreateSocket);
        }
        return socketCreateSocket;
    }
}
