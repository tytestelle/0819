package fi.iki.elonen;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo {

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static final Pattern f3978O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public static final Pattern f3979O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public static final Pattern f3980O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public static final Logger f3981O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = Logger.getLogger(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.class.getName());

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final int f3982O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public volatile ServerSocket f3983O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public Thread f3984O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f3985O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();

    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(int i) {
        this.f3982O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    public static String O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            f3981O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e);
            return null;
        }
    }

    public static O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, String str, String str2) {
        byte[] bytes;
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(str);
        if (str2 == null) {
            return new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            if (!Charset.forName(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()).newEncoder().canEncode(str2) && o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f3943O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(str.concat("; charset=UTF-8"));
            }
            bytes = str2.getBytes(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO());
        } catch (UnsupportedEncodingException e) {
            f3981O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e);
            bytes = new byte[0];
        }
        return new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f3941O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, new ByteArrayInputStream(bytes), bytes.length);
    }

    public static final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else {
                    if (!(obj instanceof ServerSocket)) {
                        throw new IllegalArgumentException("Unknown object to close");
                    }
                    ((ServerSocket) obj).close();
                }
            } catch (IOException e) {
                f3981O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.log(Level.SEVERE, "Could not close", (Throwable) e);
            }
        }
    }

    public static boolean O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
        String str = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f3966O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        return str != null && (str.toLowerCase().contains("text/") || o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f3966O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.toLowerCase().contains("/json"));
    }

    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() throws IOException {
        O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this;
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1059O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = true;
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3983O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ServerSocket();
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3983O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setReuseAddress(true);
        O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        Thread thread = new Thread(o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3984O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = thread;
        thread.setDaemon(true);
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3984O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setName("NanoHttpd Main Listener");
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3984O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.start();
        while (!o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f3976O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO && o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f3975O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        IOException iOException = o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f3975O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (iOException != null) {
            throw iOException;
        }
        O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(19));
    }
}
