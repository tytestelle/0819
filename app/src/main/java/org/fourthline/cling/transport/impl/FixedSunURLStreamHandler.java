package org.fourthline.cling.transport.impl;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.logging.Logger;
import sun.net.www.protocol.http.Handler;
import sun.net.www.protocol.http.HttpURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class FixedSunURLStreamHandler implements URLStreamHandlerFactory {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ int f4492O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;
    private static final Logger log = Logger.getLogger(FixedSunURLStreamHandler.class.getName());

    public static class UpnpURLConnection extends HttpURLConnection {
        private static final String[] methods = {"GET", HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST, "HEAD", "OPTIONS", "PUT", "DELETE", "SUBSCRIBE", "UNSUBSCRIBE", "NOTIFY"};

        public UpnpURLConnection(URL url, Handler handler) {
            super(url, handler);
        }

        public synchronized OutputStream getOutputStream() {
            OutputStream outputStream;
            try {
                String str = this.method;
                if (this.method.equals("PUT") || this.method.equals(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST) || this.method.equals("NOTIFY")) {
                    this.method = "PUT";
                } else {
                    this.method = "GET";
                }
                outputStream = super.getOutputStream();
                this.method = str;
            } catch (Throwable th) {
                throw th;
            }
            return outputStream;
        }

        public void setRequestMethod(String str) throws ProtocolException {
            if (this.connected) {
                throw new ProtocolException("Cannot reset method once connected");
            }
            for (String str2 : methods) {
                if (str2.equals(str)) {
                    this.method = str;
                    return;
                }
            }
            throw new ProtocolException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("Invalid UPnP HTTP method: ", str));
        }

        public UpnpURLConnection(URL url, String str, int i) {
            super(url, str, i);
        }
    }

    @Override // java.net.URLStreamHandlerFactory
    public URLStreamHandler createURLStreamHandler(String str) {
        log.fine("Creating new URLStreamHandler for protocol: " + str);
        if ("http".equals(str)) {
            return new Handler() { // from class: org.fourthline.cling.transport.impl.FixedSunURLStreamHandler.1
                public URLConnection openConnection(URL url) {
                    return openConnection(url, null);
                }

                public URLConnection openConnection(URL url, Proxy proxy) {
                    return new UpnpURLConnection(url, this);
                }
            };
        }
        return null;
    }
}
