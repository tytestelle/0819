package O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

import android.os.Build;
import android.os.StrictMode;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements Closeable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final File f114O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final File f115O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final File f116O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final File f117O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final long f119O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public BufferedWriter f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public int f124O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public long f121O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = 0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public final LinkedHashMap f123O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public long f125O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = 0;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public final ThreadPoolExecutor f126O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO());

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public final O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f127O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, 0);

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final int f118O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = 1;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final int f120O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = 1;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(File file, long j) {
        this.f114O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = file;
        this.f115O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new File(file, "journal");
        this.f116O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new File(file, "journal.tmp");
        this.f117O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new File(file, "journal.bkp");
        this.f119O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = j;
    }

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, boolean z) {
        synchronized (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f104O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f112O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                throw new IllegalStateException();
            }
            if (z && !o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f111O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
                for (int i = 0; i < o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f120O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000; i++) {
                    if (!((boolean[]) o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f105O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)[i]) {
                        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f110O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo[i].exists()) {
                        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f120O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000; i2++) {
                File file = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f110O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo[i2];
                if (!z) {
                    O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(file);
                } else if (file.exists()) {
                    File file2 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f109O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[i2];
                    file.renameTo(file2);
                    long j = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f108O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i2];
                    long length = file2.length();
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f108O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i2] = length;
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f121O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f121O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo - j) + length;
                }
            }
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f124O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O++;
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f112O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = null;
            if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f111O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 || z) {
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f111O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = true;
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.append((CharSequence) "CLEAN");
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.append(' ');
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.append((CharSequence) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.append((CharSequence) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO());
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.append('\n');
                if (z) {
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f125O000000oooOoo00ooo0O0000000o00O0Oooo0OOO++;
                }
            } else {
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f123O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.remove(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.append((CharSequence) "REMOVE");
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.append(' ');
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.append((CharSequence) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.append('\n');
            }
            O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
            if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f121O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo > o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f119O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO || o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000()) {
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f126O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.submit(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f127O00000O00oOOo000000OOOo00OOOo0OooOO00OO0);
            }
        }
    }

    public static void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(file2, file3, false);
            }
        }
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(file, j);
        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f115O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.exists()) {
            try {
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
                return o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.close();
                O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f114O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            }
        }
        file.mkdirs();
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(file, j);
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
        return o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1;
    }

    public static void O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(File file, File file2, boolean z) throws IOException {
        if (z) {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(String str) {
        synchronized (this) {
            try {
                if (this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null) {
                    throw new IllegalStateException("cache is closed");
                }
                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) this.f123O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.get(str);
                if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, str);
                    this.f123O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.put(str, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                } else if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f112O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != null) {
                    return null;
                }
                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f112O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.append((CharSequence) "DIRTY");
                this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.append(' ');
                this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.append((CharSequence) str);
                this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.append('\n');
                O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                return o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(String str) {
        if (this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null) {
            throw new IllegalStateException("cache is closed");
        }
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) this.f123O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.get(str);
        if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
            return null;
        }
        if (!o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f111O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
            return null;
        }
        for (File file : o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f109O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f124O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O++;
        this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.append((CharSequence) "READ");
        this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.append(' ');
        this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.append((CharSequence) str);
        this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.append('\n');
        if (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000()) {
            this.f126O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.submit(this.f127O00000O00oOOo000000OOOo00OOOo0OooOO00OO0);
        }
        return new O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f109O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, 1);
    }

    public final boolean O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        int i = this.f124O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        return i >= 2000 && i >= this.f123O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.size();
    }

    public final void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0() throws IOException {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f116O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        Iterator it = this.f123O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.values().iterator();
        while (it.hasNext()) {
            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) it.next();
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f112O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
            int i = this.f120O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            int i2 = 0;
            if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                while (i2 < i) {
                    this.f121O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo += o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f108O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i2];
                    i2++;
                }
            } else {
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f112O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = null;
                while (i2 < i) {
                    O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f109O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[i2]);
                    O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f110O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() {
        File file = this.f115O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        FileInputStream fileInputStream = new FileInputStream(file);
        Charset charset = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f133O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(fileInputStream);
        try {
            String strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            String strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            String strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            String strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            String strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO5 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            if (!"libcore.io.DiskLruCache".equals(strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2) || !Integer.toString(this.f118O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).equals(strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3) || !Integer.toString(this.f120O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).equals(strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4) || !"".equals(strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO5)) {
                throw new IOException("unexpected journal header: [" + strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + ", " + strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 + ", " + strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4 + ", " + strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO());
                    i++;
                } catch (EOFException unused) {
                    this.f124O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = i - this.f123O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.size();
                    if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f132O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == -1) {
                        O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
                    } else {
                        this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f133O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO));
                    }
                    try {
                        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f123O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) linkedHashMap.get(strSubstring);
        if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, strSubstring);
            linkedHashMap.put(strSubstring, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f112O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f111O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = true;
        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f112O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = null;
        if (strArrSplit.length != o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f113O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f120O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f108O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO() {
        try {
            BufferedWriter bufferedWriter = this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
            if (bufferedWriter != null) {
                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f116O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o), O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f133O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f118O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f120O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo : this.f123O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.values()) {
                    if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f112O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != null) {
                        bufferedWriter2.write("DIRTY " + o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() + '\n');
                    }
                }
                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(bufferedWriter2);
                if (this.f115O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.exists()) {
                    O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this.f115O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f117O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, true);
                }
                O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this.f116O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f115O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, false);
                this.f117O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.delete();
                this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f115O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, true), O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f133O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO));
            } catch (Throwable th) {
                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void O00000O00oOOo000000OOOo00OOOo0OooOO00OO0() {
        while (this.f121O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo > this.f119O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
            String str = (String) ((Map.Entry) this.f123O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) this.f123O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.get(str);
                    if (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo != null && o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f112O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == null) {
                        for (int i = 0; i < this.f120O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000; i++) {
                            File file = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f109O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.f121O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                            long[] jArr = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f108O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                            this.f121O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f124O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O++;
                        this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.append((CharSequence) "REMOVE");
                        this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.append(' ');
                        this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.append((CharSequence) str);
                        this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.append('\n');
                        this.f123O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.remove(str);
                        if (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000()) {
                            this.f126O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.submit(this.f127O00000O00oOOo000000OOOo00OOOo0OooOO00OO0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null) {
                return;
            }
            Iterator it = new ArrayList(this.f123O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.values()).iterator();
            while (it.hasNext()) {
                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = ((O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) it.next()).f112O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) {
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                }
            }
            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
            this.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
