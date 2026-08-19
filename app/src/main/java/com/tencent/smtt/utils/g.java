package com.tencent.smtt.utils;

import O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    public interface a {
        void a(int i);
    }

    public static String a(String str, byte[] bArr, a aVar, boolean z) {
        String str2;
        try {
            String str3 = str + (z ? i.a().c() : h.a().b());
            try {
                bArr = z ? i.a().a(bArr) : h.a().a(bArr);
            } catch (Exception e) {
                e.printStackTrace();
                TbsLog.e("HttpUtils", "rsaKey exception #2: " + e);
            }
            if (bArr == null) {
                str2 = "postData is null";
                TbsLog.e("HttpUtils", str2);
                return null;
            }
            HashMap map = new HashMap();
            map.put("Content-Type", "application/x-www-form-urlencoded");
            map.put("Content-Length", String.valueOf(bArr.length));
            HttpURLConnection httpURLConnectionA = a(str3, map);
            if (httpURLConnectionA == null) {
                return null;
            }
            a(httpURLConnectionA, bArr);
            return a(httpURLConnectionA, aVar, z);
        } catch (Exception e2) {
            e2.printStackTrace();
            str2 = "rsaKey exception #1: " + e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0052 A[Catch: all -> 0x0057, LOOP:0: B:24:0x004b->B:26:0x0052, LOOP_END, TryCatch #1 {all -> 0x0057, blocks: (B:23:0x0049, B:24:0x004b, B:26:0x0052, B:30:0x005e, B:32:0x006d), top: B:46:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x005e A[Catch: all -> 0x0057, TryCatch #1 {all -> 0x0057, blocks: (B:23:0x0049, B:24:0x004b, B:26:0x0052, B:30:0x005e, B:32:0x006d), top: B:46:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x006d A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #1 {all -> 0x0057, blocks: (B:23:0x0049, B:24:0x004b, B:26:0x0052, B:30:0x005e, B:32:0x006d), top: B:46:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x005c A[EDGE_INSN: B:50:0x005c->B:29:0x005c BREAK  A[LOOP:0: B:24:0x004b->B:26:0x0052], SYNTHETIC] */
    private static String a(HttpURLConnection httpURLConnection, a aVar, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        String str;
        InputStream inflaterInputStream;
        byte[] bArr;
        int i;
        String str2;
        InputStream inputStream = null;
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (aVar != null) {
                aVar.a(responseCode);
            }
            if (responseCode == 200) {
                InputStream inputStream2 = httpURLConnection.getInputStream();
                String contentEncoding = httpURLConnection.getContentEncoding();
                try {
                    try {
                        if (contentEncoding == null || !contentEncoding.equalsIgnoreCase("gzip")) {
                            if (contentEncoding == null || !contentEncoding.equalsIgnoreCase("deflate")) {
                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                bArr = new byte[128];
                                while (true) {
                                    i = inputStream2.read(bArr);
                                    if (i != -1) {
                                        break;
                                    }
                                    byteArrayOutputStream2.write(bArr, 0, i);
                                }
                                if (z) {
                                    str2 = new String(byteArrayOutputStream2.toByteArray(), "utf-8");
                                } else {
                                    str2 = new String(h.a().c(byteArrayOutputStream2.toByteArray()));
                                }
                                String str3 = str2;
                                inputStream = inputStream2;
                                str = str3;
                            } else {
                                inflaterInputStream = new InflaterInputStream(inputStream2, new Inflater(true));
                            }
                            try {
                                th.printStackTrace();
                                TbsLog.e("HttpUtil", "httpPost exception: " + th);
                                return "[HttpError] " + th.getMessage();
                            } finally {
                                a(inputStream);
                                a(byteArrayOutputStream);
                            }
                        }
                        inflaterInputStream = new GZIPInputStream(inputStream2);
                        bArr = new byte[128];
                        while (true) {
                            i = inputStream2.read(bArr);
                            if (i != -1) {
                                break;
                                break;
                            }
                            byteArrayOutputStream2.write(bArr, 0, i);
                        }
                        if (z) {
                            str2 = new String(byteArrayOutputStream2.toByteArray(), "utf-8");
                        } else {
                            str2 = new String(h.a().c(byteArrayOutputStream2.toByteArray()));
                        }
                        String str4 = str2;
                        inputStream = inputStream2;
                        str = str4;
                    } catch (Throwable th) {
                        inputStream = inputStream2;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        th = th;
                    }
                    byteArrayOutputStream2 = new ByteArrayOutputStream();
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStream2;
                    byteArrayOutputStream = null;
                }
                inputStream2 = inflaterInputStream;
            } else {
                byteArrayOutputStream2 = null;
                str = null;
            }
            a(inputStream);
            a(byteArrayOutputStream2);
            return str;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    private static HttpURLConnection a(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection2.setRequestMethod(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST);
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setDoInput(true);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setConnectTimeout(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
                httpURLConnection2.setRequestProperty("Connection", O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.HEAD_VALUE_CONNECTION_CLOSE);
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnection2.setRequestProperty(entry.getKey(), entry.getValue());
                }
                return httpURLConnection2;
            } catch (Exception e) {
                e = e;
                httpURLConnection = httpURLConnection2;
                TbsLog.e("HttpUtil", "initHttpPostURLConnection exception: " + e);
                return httpURLConnection;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    private static void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream = null;
        try {
            try {
                outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.flush();
            } catch (Exception e) {
                TbsLog.e("HttpUtil", "writePostData exception: " + e);
            }
        } finally {
            a(outputStream);
        }
    }
}
