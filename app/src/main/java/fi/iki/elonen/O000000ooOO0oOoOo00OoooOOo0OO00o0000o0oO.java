package fi.iki.elonen;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Closeable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 f3965O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final String f3966O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final InputStream f3967O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final long f3968O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f3969O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this);

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final HashMap f3970O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new HashMap();

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f3971O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public boolean f3972O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public boolean f3973O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public boolean f3974O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    public O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, String str, InputStream inputStream, long j) {
        this.f3965O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        this.f3966O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = str;
        if (inputStream == null) {
            this.f3967O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new ByteArrayInputStream(new byte[0]);
            this.f3968O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = 0L;
        } else {
            this.f3967O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = inputStream;
            this.f3968O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = j;
        }
        this.f3972O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this.f3968O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo < 0;
        this.f3974O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = true;
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    public final String O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str) {
        return (String) this.f3970O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.get(str.toLowerCase());
    }

    public final boolean O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        return O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.HEAD_VALUE_CONNECTION_CLOSE.equals(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO("connection"));
    }

    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(OutputStream outputStream) {
        String str = this.f3966O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = this.f3965O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        try {
            if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null) {
                throw new Error("sendResponse(): Status can't be null.");
            }
            PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(str).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO())), false);
            printWriter.append("HTTP/1.1 ").append(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.getDescription()).append(" \r\n");
            if (str != null) {
                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(printWriter, "Content-Type", str);
            }
            if (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.DATE) == null) {
                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(printWriter, "Date", simpleDateFormat.format(new Date()));
            }
            for (Map.Entry entry : this.f3969O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.entrySet()) {
                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(printWriter, (String) entry.getKey(), (String) entry.getValue());
            }
            if (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO("connection") == null) {
                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(printWriter, "Connection", this.f3974O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO ? O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.HEAD_VALUE_CONNECTION_KEEP_ALIVE : O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.HEAD_VALUE_CONNECTION_CLOSE);
            }
            if (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO("content-length") != null) {
                this.f3973O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = false;
            }
            if (this.f3973O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(printWriter, "Content-Encoding", "gzip");
                this.f3972O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = true;
            }
            InputStream inputStream = this.f3967O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            long jO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = inputStream != null ? this.f3968O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo : 0L;
            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f3971O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.HEAD;
            if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 && this.f3972O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(printWriter, "Transfer-Encoding", "chunked");
            } else if (!this.f3973O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                jO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(jO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, printWriter);
            }
            printWriter.append("\r\n");
            printWriter.flush();
            if (this.f3971O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 && this.f3972O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
                O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(outputStream);
                if (this.f3973O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                    O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(gZIPOutputStream, -1L);
                    gZIPOutputStream.finish();
                } else {
                    O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, -1L);
                }
                o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            } else if (this.f3973O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(gZIPOutputStream2, -1L);
                gZIPOutputStream2.finish();
            } else {
                O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(outputStream, jO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
            }
            outputStream.flush();
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(inputStream);
        } catch (IOException e) {
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f3981O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
        }
    }

    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[(int) 16384];
        boolean z = j == -1;
        while (true) {
            if (j <= 0 && !z) {
                return;
            }
            int i = this.f3967O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.read(bArr, 0, (int) (z ? 16384L : Math.min(j, 16384L)));
            if (i <= 0) {
                return;
            }
            outputStream.write(bArr, 0, i);
            if (!z) {
                j -= (long) i;
            }
        }
    }

    public final long O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(long j, PrintWriter printWriter) {
        String strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO("content-length");
        if (strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null) {
            try {
                j = Long.parseLong(strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            } catch (NumberFormatException unused) {
                O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f3981O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.severe("content-length was no number ".concat(strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO));
            }
        }
        printWriter.print("Content-Length: " + j + "\r\n");
        return j;
    }

    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(boolean z) {
        this.f3973O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = z;
    }

    public final void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(boolean z) {
        this.f3974O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = z;
    }

    public final void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        this.f3971O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f3967O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
