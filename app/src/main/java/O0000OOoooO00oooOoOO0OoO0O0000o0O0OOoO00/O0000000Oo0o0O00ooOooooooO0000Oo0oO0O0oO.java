package O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00;

import O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o;
import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import com.github.tvbox.osc.base.App;
import com.github.tvbox.osc.bean.AddressItem;
import com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import com.google.common.base.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
import com.google.common.base.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
import com.google.common.util.concurrent.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
import com.orhanobut.hawk.Hawk;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import kotlin.jvm.internal.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import kotlinx.coroutines.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
import kotlinx.coroutines.O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;
import kotlinx.coroutines.O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;
import xyz.doikki.videoplayer.player.AndroidMediaPlayerFactory;
import xyz.doikki.videoplayer.player.PlayerFactory;
import xyz.doikki.videoplayer.player.VideoView;
import xyz.doikki.videoplayer.render.RenderViewFactory;
import xyz.doikki.videoplayer.render.TextureRenderViewFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static ExecutorService f1066O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static ExecutorService f1067O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static ExecutorService f1068O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static ExecutorService f1069O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX WARN: Code duplicated, block: B:17:0x0080 A[Catch: Exception | OutOfMemoryError -> 0x00d6, TryCatch #0 {Exception | OutOfMemoryError -> 0x00d6, blocks: (B:3:0x000e, B:5:0x0016, B:8:0x0021, B:10:0x0036, B:15:0x0077, B:17:0x0080, B:21:0x009c, B:22:0x00a2, B:24:0x00aa, B:25:0x00b3, B:27:0x00ba, B:28:0x00be, B:30:0x00c3, B:32:0x00d1, B:11:0x006c), top: B:36:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00aa A[Catch: Exception | OutOfMemoryError -> 0x00d6, TryCatch #0 {Exception | OutOfMemoryError -> 0x00d6, blocks: (B:3:0x000e, B:5:0x0016, B:8:0x0021, B:10:0x0036, B:15:0x0077, B:17:0x0080, B:21:0x009c, B:22:0x00a2, B:24:0x00aa, B:25:0x00b3, B:27:0x00ba, B:28:0x00be, B:30:0x00c3, B:32:0x00d1, B:11:0x006c), top: B:36:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ba A[Catch: Exception | OutOfMemoryError -> 0x00d6, LOOP:0: B:25:0x00b3->B:27:0x00ba, LOOP_END, TryCatch #0 {Exception | OutOfMemoryError -> 0x00d6, blocks: (B:3:0x000e, B:5:0x0016, B:8:0x0021, B:10:0x0036, B:15:0x0077, B:17:0x0080, B:21:0x009c, B:22:0x00a2, B:24:0x00aa, B:25:0x00b3, B:27:0x00ba, B:28:0x00be, B:30:0x00c3, B:32:0x00d1, B:11:0x006c), top: B:36:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c3 A[Catch: Exception | OutOfMemoryError -> 0x00d6, TryCatch #0 {Exception | OutOfMemoryError -> 0x00d6, blocks: (B:3:0x000e, B:5:0x0016, B:8:0x0021, B:10:0x0036, B:15:0x0077, B:17:0x0080, B:21:0x009c, B:22:0x00a2, B:24:0x00aa, B:25:0x00b3, B:27:0x00ba, B:28:0x00be, B:30:0x00c3, B:32:0x00d1, B:11:0x006c), top: B:36:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00d1 A[Catch: Exception | OutOfMemoryError -> 0x00d6, TRY_LEAVE, TryCatch #0 {Exception | OutOfMemoryError -> 0x00d6, blocks: (B:3:0x000e, B:5:0x0016, B:8:0x0021, B:10:0x0036, B:15:0x0077, B:17:0x0080, B:21:0x009c, B:22:0x00a2, B:24:0x00aa, B:25:0x00b3, B:27:0x00ba, B:28:0x00be, B:30:0x00c3, B:32:0x00d1, B:11:0x006c), top: B:36:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00be A[EDGE_INSN: B:37:0x00be->B:28:0x00be BREAK  A[LOOP:0: B:25:0x00b3->B:27:0x00ba], SYNTHETIC] */
    public static String O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(AddressItem addressItem, String str) {
        boolean z;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i;
        BufferedInputStream bufferedInputStream;
        int i2;
        FilterInputStream gZIPInputStream;
        boolean zIsB64decode = addressItem.isB64decode();
        String headers = addressItem.getHeaders();
        String format = addressItem.getFormat();
        try {
            if (!str.startsWith("file")) {
                String strO00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(str);
                if (!TextUtils.isEmpty(strO00000O00oOOo000000OOOo00OOOo0OooOO00OO0)) {
                    str = strO00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
                }
            }
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00(headers, uRLConnectionOpenConnection);
            if (!"scheme".equals(format)) {
                z = "XML".equals(format);
                uRLConnectionOpenConnection.connect();
                inputStream = uRLConnectionOpenConnection.getInputStream();
                if (z) {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    bArr = new byte[1024];
                    while (true) {
                        i = inputStream.read(bArr);
                        if (i != -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                    inputStream.close();
                    return zIsB64decode ? new String(Base64.decode(byteArrayOutputStream.toString(), 0)) : byteArrayOutputStream.toString();
                }
                bufferedInputStream = new BufferedInputStream(inputStream);
                bufferedInputStream.mark(2);
                i2 = bufferedInputStream.read();
                int i3 = bufferedInputStream.read();
                bufferedInputStream.reset();
                if (i2 == 31 && i3 == 139) {
                    gZIPInputStream = bufferedInputStream;
                    gZIPInputStream = bufferedInputStream;
                    gZIPInputStream = new GZIPInputStream(bufferedInputStream);
                }
                gZIPInputStream = bufferedInputStream;
                gZIPInputStream = bufferedInputStream;
                gZIPInputStream = bufferedInputStream;
                O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(gZIPInputStream);
                return "<?xml";
            }
            String strEncodeToString = Base64.encodeToString((addressItem.getUser() + ":" + addressItem.getPass()).getBytes(), 0);
            StringBuilder sb = new StringBuilder("Basic ");
            sb.append(strEncodeToString);
            uRLConnectionOpenConnection.setRequestProperty(RtspHeaders.AUTHORIZATION, sb.toString());
            uRLConnectionOpenConnection.connect();
            inputStream = uRLConnectionOpenConnection.getInputStream();
            if (z) {
                byteArrayOutputStream = new ByteArrayOutputStream();
                bArr = new byte[1024];
                while (true) {
                    i = inputStream.read(bArr);
                    if (i != -1) {
                        break;
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
                inputStream.close();
                if (zIsB64decode) {
                }
            }
            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedInputStream.mark(2);
            i2 = bufferedInputStream.read();
            int i4 = bufferedInputStream.read();
            bufferedInputStream.reset();
            if (i2 == 31) {
                gZIPInputStream = bufferedInputStream;
                gZIPInputStream = bufferedInputStream;
                gZIPInputStream = new GZIPInputStream(bufferedInputStream);
            }
            gZIPInputStream = bufferedInputStream;
            gZIPInputStream = bufferedInputStream;
            gZIPInputStream = bufferedInputStream;
            O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(gZIPInputStream);
            return "<?xml";
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(ContextWrapper contextWrapper, String str, String str2) {
        try {
            InputStream inputStreamOpen = contextWrapper.getAssets().open(str);
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStreamOpen.read(bArr);
                if (-1 == i) {
                    inputStreamOpen.close();
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Throwable exception) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(exception, "exception");
        return new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(exception);
    }

    public static void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        File file = new File(str2);
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.isDirectory() || parentFile.mkdirs()) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                try {
                    bufferedWriter.write(str);
                    bufferedWriter.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(String str, String str2) {
        char c;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length != str2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            char cCharAt2 = str2.charAt(i);
            if (cCharAt != cCharAt2 && ((c = (char) ((cCharAt | ' ') - 97)) >= 26 || c != ((char) ((cCharAt2 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(Runnable runnable) {
        ExecutorService executorService;
        synchronized (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.class) {
            try {
                ExecutorService executorService2 = f1068O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (executorService2 == null || executorService2.isShutdown()) {
                    f1068O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = Executors.newFixedThreadPool(3);
                }
                executorService = f1068O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            } catch (Throwable th) {
                throw th;
            }
        }
        executorService.execute(runnable);
    }

    public static void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(Runnable runnable) {
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().execute(runnable);
    }

    public static void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(Runnable runnable) {
        ExecutorService executorService;
        synchronized (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.class) {
            try {
                ExecutorService executorService2 = f1069O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                if (executorService2 == null || executorService2.isShutdown()) {
                    f1069O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = Executors.newSingleThreadExecutor();
                }
                executorService = f1069O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            } catch (Throwable th) {
                throw th;
            }
        }
        executorService.execute(runnable);
    }

    public static String O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(str)));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append("\n");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return sb.toString();
    }

    public static synchronized ExecutorService O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo() {
        try {
            ExecutorService executorService = f1067O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (executorService == null || executorService.isShutdown()) {
                f1067O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = Executors.newSingleThreadExecutor();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1067O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    public static String O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setConnectTimeout(5000);
        return httpURLConnection.getHeaderField("location");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String O00000OOoOOO00O00o0ooooooooO000ooooO0000(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00(str2, uRLConnectionOpenConnection);
            uRLConnectionOpenConnection.connect();
            InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            String string = byteArrayOutputStream.toString();
                            byteArrayOutputStream.close();
                            inputStream.close();
                            return string;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th4;
            }
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public static boolean O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0047  */
    public static boolean O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(SQLiteDatabase sQLiteDatabase, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) throws Throwable {
        boolean z;
        Cursor cursorRawQuery;
        int i;
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
        Cursor cursor = null;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*) FROM sqlite_master WHERE type = ? AND name = ?", new String[]{"table", null});
                try {
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            i = cursorRawQuery.getInt(0);
                            cursorRawQuery.close();
                            z = i > 0;
                        } else {
                            cursorRawQuery.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorRawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    i = 0;
                }
            } catch (Exception e2) {
                e = e2;
                cursorRawQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        if (!z) {
            return true;
        }
        Cursor cursorRawQuery2 = sQLiteDatabase.rawQuery("select * from ".concat(null), null);
        if (cursorRawQuery2 == null) {
            return false;
        }
        try {
            throw null;
        } catch (Throwable th3) {
            cursorRawQuery2.close();
            throw th3;
        }
    }

    public static O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) {
        if ((o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O instanceof O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO) || (o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O instanceof O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0)) {
            return o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
        }
        return o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O instanceof Serializable ? new O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) : new O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O);
    }

    public static String O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(String str, String str2, boolean z, String str3) {
        Response responseExecute;
        BufferedInputStream bufferedInputStream;
        try {
            HashMap map = new HashMap();
            FilterInputStream gZIPInputStream = null;
            if (str2 != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, jSONObject.getString(next));
                    }
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            } else {
                map = null;
            }
            O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            if (map != null) {
                for (String str4 : map.keySet()) {
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.put(str4, (String) map.get(str4));
                }
                responseExecute = ((O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) new O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str).headers(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO)).execute();
            } else {
                responseExecute = ((O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) new O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str).headers("User-Agent", str.startsWith("https://gitcode.net/") ? O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o() : "okhttp/3.15")).execute();
            }
            if (!responseExecute.isSuccessful() || responseExecute.body() == null) {
                return "";
            }
            if ("XML".equals(str3)) {
                bufferedInputStream = new BufferedInputStream(responseExecute.body().byteStream());
                bufferedInputStream.mark(2);
                int i = bufferedInputStream.read();
                int i2 = bufferedInputStream.read();
                bufferedInputStream.reset();
                if (i == 31 && i2 == 139) {
                    gZIPInputStream = bufferedInputStream;
                    gZIPInputStream = bufferedInputStream;
                    gZIPInputStream = new GZIPInputStream(bufferedInputStream);
                }
            }
            if (gZIPInputStream == null) {
                return z ? new String(Base64.decode(responseExecute.body().bytes(), 0), StandardCharsets.UTF_8) : new String(responseExecute.body().bytes(), StandardCharsets.UTF_8);
            }
            O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(gZIPInputStream);
            return "<?xml";
        } catch (IOException | OutOfMemoryError e2) {
            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "错误信息: " + e2.getMessage());
            return "";
        }
    }

    public static String O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getAssets().open(str), "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return sb.toString();
        }
    }

    public static void O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(ExecutorService executorService) {
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        executorService.shutdownNow();
        try {
            executorService.awaitTermination(1L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public static final Object O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(kotlinx.coroutines.internal.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0, kotlinx.coroutines.internal.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO1, Function2 function2) throws Throwable {
        Object o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        Object objO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
        O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;
        try {
            O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(2, function2);
            o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = function2.invoke(o00000O00oOOo000000OOOo00OOOo0OooOO00OO1, o00000O00oOOo000000OOOo00OOOo0OooOO00OO0);
        } catch (Throwable th) {
            o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(th, false);
        }
        kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.COROUTINE_SUSPENDED;
        if (o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O == o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO || (objO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O)) == kotlinx.coroutines.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f4069O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
        if (objO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 instanceof O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
            throw ((O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) objO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0).f4057O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
        O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo = objO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 instanceof O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo ? (O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo) objO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 : null;
        return (o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo == null || (o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.f4088O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) == null) ? objO00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 : o0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;
    }

    public static final void O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(Object obj) throws Throwable {
        if (obj instanceof O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            throw ((O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) obj).exception;
        }
    }

    public static String O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'A' && c <= 'Z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e4 A[Catch: JSONException -> 0x0051, TryCatch #0 {JSONException -> 0x0051, blocks: (B:4:0x0003, B:6:0x0039, B:9:0x0054, B:18:0x0066, B:27:0x0078, B:31:0x0080, B:35:0x008b, B:39:0x0094, B:43:0x009d, B:45:0x00a3, B:67:0x00e4, B:69:0x00ec, B:74:0x010b, B:80:0x0123, B:75:0x0111, B:77:0x0115, B:78:0x011c, B:79:0x011f, B:49:0x00ae, B:61:0x00c5, B:62:0x00ce, B:63:0x00d3, B:64:0x00da, B:42:0x009b, B:38:0x0092, B:34:0x0089, B:26:0x0075, B:21:0x006c, B:17:0x0064, B:12:0x005b), top: B:84:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x010b A[Catch: JSONException -> 0x0051, TryCatch #0 {JSONException -> 0x0051, blocks: (B:4:0x0003, B:6:0x0039, B:9:0x0054, B:18:0x0066, B:27:0x0078, B:31:0x0080, B:35:0x008b, B:39:0x0094, B:43:0x009d, B:45:0x00a3, B:67:0x00e4, B:69:0x00ec, B:74:0x010b, B:80:0x0123, B:75:0x0111, B:77:0x0115, B:78:0x011c, B:79:0x011f, B:49:0x00ae, B:61:0x00c5, B:62:0x00ce, B:63:0x00d3, B:64:0x00da, B:42:0x009b, B:38:0x0092, B:34:0x0089, B:26:0x0075, B:21:0x006c, B:17:0x0064, B:12:0x005b), top: B:84:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0111 A[Catch: JSONException -> 0x0051, TryCatch #0 {JSONException -> 0x0051, blocks: (B:4:0x0003, B:6:0x0039, B:9:0x0054, B:18:0x0066, B:27:0x0078, B:31:0x0080, B:35:0x008b, B:39:0x0094, B:43:0x009d, B:45:0x00a3, B:67:0x00e4, B:69:0x00ec, B:74:0x010b, B:80:0x0123, B:75:0x0111, B:77:0x0115, B:78:0x011c, B:79:0x011f, B:49:0x00ae, B:61:0x00c5, B:62:0x00ce, B:63:0x00d3, B:64:0x00da, B:42:0x009b, B:38:0x0092, B:34:0x0089, B:26:0x0075, B:21:0x006c, B:17:0x0064, B:12:0x005b), top: B:84:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0115 A[Catch: JSONException -> 0x0051, TryCatch #0 {JSONException -> 0x0051, blocks: (B:4:0x0003, B:6:0x0039, B:9:0x0054, B:18:0x0066, B:27:0x0078, B:31:0x0080, B:35:0x008b, B:39:0x0094, B:43:0x009d, B:45:0x00a3, B:67:0x00e4, B:69:0x00ec, B:74:0x010b, B:80:0x0123, B:75:0x0111, B:77:0x0115, B:78:0x011c, B:79:0x011f, B:49:0x00ae, B:61:0x00c5, B:62:0x00ce, B:63:0x00d3, B:64:0x00da, B:42:0x009b, B:38:0x0092, B:34:0x0089, B:26:0x0075, B:21:0x006c, B:17:0x0064, B:12:0x005b), top: B:84:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x011f A[Catch: JSONException -> 0x0051, TryCatch #0 {JSONException -> 0x0051, blocks: (B:4:0x0003, B:6:0x0039, B:9:0x0054, B:18:0x0066, B:27:0x0078, B:31:0x0080, B:35:0x008b, B:39:0x0094, B:43:0x009d, B:45:0x00a3, B:67:0x00e4, B:69:0x00ec, B:74:0x010b, B:80:0x0123, B:75:0x0111, B:77:0x0115, B:78:0x011c, B:79:0x011f, B:49:0x00ae, B:61:0x00c5, B:62:0x00ce, B:63:0x00d3, B:64:0x00da, B:42:0x009b, B:38:0x0092, B:34:0x0089, B:26:0x0075, B:21:0x006c, B:17:0x0064, B:12:0x005b), top: B:84:0x0003 }] */
    public static void O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(VideoView videoView, JSONObject jSONObject, String str, O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, boolean z) {
        PlayerFactory o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        RenderViewFactory renderViewFactoryCreate;
        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
            return;
        }
        try {
            int iIntValue = jSONObject.getInt("pl");
            int iIntValue2 = ((Integer) Hawk.get("画面比例", Integer.valueOf(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1436O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO))).intValue();
            int iIntValue3 = ((Integer) Hawk.get("渲染类型", Integer.valueOf(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1438O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o))).intValue();
            if (!z) {
                iIntValue = ((Integer) Hawk.get("解码方式", Integer.valueOf(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1437O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO))).intValue();
            }
            int i = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f929O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
            if ((i != -1 ? i : o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f913O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) != -1) {
                iIntValue = i != -1 ? i : o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f913O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
            }
            int i2 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O;
            if ((i2 != -1 ? i2 : o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f914O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) != -1) {
                if (i2 == -1) {
                    i2 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f914O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                }
                iIntValue2 = i2;
            }
            boolean z2 = true;
            boolean z3 = O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f185O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != iIntValue;
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f185O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = iIntValue;
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f186O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = iIntValue2;
            int i3 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f933O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
            if (i3 == -1) {
                i3 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f922O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
            }
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f189O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = i3;
            int i4 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
            if (i4 == -1) {
                i4 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f921O00000OOoOOO00O00o0ooooooooO000ooooO0000;
            }
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f187O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i4;
            int i5 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f932O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;
            if (i5 == -1) {
                i5 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f923O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
            }
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f188O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i5;
            if (iIntValue == 1) {
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, 0);
            } else if (iIntValue == 2) {
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(str, 1);
            } else if (iIntValue == 3 || iIntValue == 4) {
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(0);
            } else {
                if (iIntValue != 5 && iIntValue != 6) {
                    if (iIntValue == 101) {
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(2);
                        iIntValue3 = 101;
                    } else {
                        o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = AndroidMediaPlayerFactory.create();
                    }
                    if (videoView == null) {
                        return;
                    }
                    videoView.setPlayerFactory(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                    videoView.setCurrentScreenScaleType(iIntValue2);
                    if (z2 && ((Boolean) Hawk.get("画面锁定", Boolean.valueOf(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1481O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0))).booleanValue() && iIntValue3 != 101) {
                        return;
                    }
                    if (iIntValue3 != 0) {
                        renderViewFactoryCreate = TextureRenderViewFactory.create();
                    } else if (iIntValue3 != 101) {
                        renderViewFactoryCreate = new O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                    } else {
                        if (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1044O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                            O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1044O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                        }
                        renderViewFactoryCreate = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1044O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    }
                    videoView.setRenderViewFactory(renderViewFactoryCreate);
                    videoView.initRenderView();
                }
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(1);
            }
            z2 = z3;
            if (videoView == null) {
                return;
            }
            videoView.setPlayerFactory(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
            videoView.setCurrentScreenScaleType(iIntValue2);
            if (z2) {
            }
            if (iIntValue3 != 0) {
                renderViewFactoryCreate = TextureRenderViewFactory.create();
            } else if (iIntValue3 != 101) {
                renderViewFactoryCreate = new O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            } else {
                if (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1044O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                    O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1044O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                }
                renderViewFactoryCreate = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1044O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            }
            videoView.setRenderViewFactory(renderViewFactoryCreate);
            videoView.initRenderView();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00(String str, URLConnection uRLConnection) {
        uRLConnection.setConnectTimeout(5000);
        uRLConnection.setReadTimeout(15000);
        uRLConnection.setRequestProperty("accept", "*/*");
        uRLConnection.setRequestProperty("connection", "Keep-Alive");
        uRLConnection.setRequestProperty("user-agent", "MTV");
        HashMap map = new HashMap();
        HashMap map2 = null;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.getString(next));
                }
            } catch (JSONException unused) {
            }
        } else {
            map = null;
        }
        map2 = map;
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                uRLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public abstract void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);

    public abstract int O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo);

    public abstract void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();

    public abstract void O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();

    public abstract void O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();

    public abstract void O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001);

    public abstract void O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002);

    public abstract void O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, int i, O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001);
}
