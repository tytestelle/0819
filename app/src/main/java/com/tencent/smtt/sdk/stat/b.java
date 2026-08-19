package com.tencent.smtt.sdk.stat;

import O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.TbsConfig;
import com.tencent.smtt.sdk.TbsCoreLoadStat;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsDownloader;
import com.tencent.smtt.sdk.TbsLogReport;
import com.tencent.smtt.sdk.TbsPVConfig;
import com.tencent.smtt.sdk.TbsShareManager;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.h;
import com.tencent.smtt.utils.l;
import com.tencent.smtt.utils.o;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static byte[] a;
    private static O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO b;
    private static Map<String, String> c;

    static {
        try {
            a = "65dRa93L".getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
        }
    }

    private static String a(Context context) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("cpuabi", com.tencent.smtt.utils.b.c() ? "64" : "32");
            } catch (Throwable unused) {
                jSONObject2 = jSONObject;
                jSONObject = jSONObject2;
            }
        } catch (Throwable unused2) {
        }
        return jSONObject == null ? "" : jSONObject.toString();
    }

    private static String b(Context context) {
        try {
            byte[] byteArray = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray();
            if (byteArray != null) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                messageDigest.update(byteArray);
                byte[] bArrDigest = messageDigest.digest();
                if (bArrDigest != null) {
                    StringBuilder sb = new StringBuilder("");
                    if (bArrDigest.length <= 0) {
                        return null;
                    }
                    for (int i = 0; i < bArrDigest.length; i++) {
                        String upperCase = Integer.toHexString(bArrDigest[i] & 255).toUpperCase();
                        if (i > 0) {
                            sb.append(":");
                        }
                        if (upperCase.length() < 2) {
                            sb.append(0);
                        }
                        sb.append(upperCase);
                    }
                    return sb.toString();
                }
            }
        } catch (Exception e) {
            TbsLog.i(e);
        }
        return null;
    }

    private static int c(Context context) {
        Map<String, String> map = c;
        if (map == null || map.size() == 0) {
            return 1;
        }
        Map<String, String> pVCLocal = TbsPVConfig.getInstance(context).getPVCLocal();
        TbsLog.i("HttpUtils", "getCommandForUpdatePVC, mMapPVCLocal is " + pVCLocal.toString());
        return (pVCLocal.size() != 0 && a(c, pVCLocal)) ? 0 : 2;
    }

    private static void d(Context context) {
        SharedPreferences.Editor editorEdit = TbsDownloadConfig.getInstance(context).mPreferences.edit();
        editorEdit.putLong(TbsDownloadConfig.TbsConfigKey.KEY_LAST_CHECK, 0L);
        editorEdit.apply();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c A[Catch: all -> 0x0065, Exception -> 0x006a, LOOP:0: B:21:0x0045->B:23:0x004c, LOOP_END, TryCatch #11 {Exception -> 0x006a, all -> 0x0065, blocks: (B:20:0x0043, B:21:0x0045, B:23:0x004c, B:28:0x006e, B:32:0x0079, B:33:0x0088), top: B:82:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0079 A[Catch: all -> 0x0065, Exception -> 0x006a, TryCatch #11 {Exception -> 0x006a, all -> 0x0065, blocks: (B:20:0x0043, B:21:0x0045, B:23:0x004c, B:28:0x006e, B:32:0x0079, B:33:0x0088), top: B:82:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0088 A[Catch: all -> 0x0065, Exception -> 0x006a, TRY_LEAVE, TryCatch #11 {Exception -> 0x006a, all -> 0x0065, blocks: (B:20:0x0043, B:21:0x0045, B:23:0x004c, B:28:0x006e, B:32:0x0079, B:33:0x0088), top: B:82:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b5 A[Catch: IOException -> 0x009e, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x009e, blocks: (B:39:0x009a, B:53:0x00b5), top: B:80:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x006e A[EDGE_INSN: B:83:0x006e->B:28:0x006e BREAK  A[LOOP:0: B:21:0x0045->B:23:0x004c], SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x004c, please report this as an issue */
    private static String a(HttpURLConnection httpURLConnection, String str, boolean z) throws Throwable {
        InputStream inputStream;
        InputStream inflaterInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i;
        byte[] byteArray;
        byte[] bArr2;
        String str2 = "";
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        byteArrayOutputStream2 = null;
        byteArrayOutputStream2 = null;
        byteArrayOutputStream2 = null;
        byteArrayOutputStream2 = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    String contentEncoding = httpURLConnection.getContentEncoding();
                    try {
                        try {
                            try {
                                if (contentEncoding == null || !contentEncoding.equalsIgnoreCase("gzip")) {
                                    if (contentEncoding == null || !contentEncoding.equalsIgnoreCase("deflate")) {
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        bArr = new byte[128];
                                        while (true) {
                                            i = inputStream.read(bArr);
                                            if (i != -1) {
                                                break;
                                            }
                                            TbsLog.i("HttpUtils", "getResponseFromConnection len is " + i);
                                            byteArrayOutputStream.write(bArr, 0, i);
                                        }
                                        byteArray = byteArrayOutputStream.toByteArray();
                                        if (byteArray.length == 7) {
                                            bArr2 = byteArray;
                                        } else if (z) {
                                            byte[] bArrC = h.a().c(byteArray);
                                            str2 = new String(bArrC);
                                            bArr2 = bArrC;
                                        } else {
                                            str2 = new String(h.b(byteArray, str));
                                            bArr2 = byteArray;
                                        }
                                        byteArrayOutputStream.close();
                                        inputStream.close();
                                        byteArrayOutputStream2 = bArr2;
                                        TbsLog.i("HttpUtils", "getResponseFromConnection,response=" + str2 + ";isUseRSA=" + z);
                                        return str2;
                                    }
                                    inflaterInputStream = new InflaterInputStream(inputStream, new Inflater(true));
                                    TbsLog.i(e);
                                    if (byteArrayOutputStream2 != null) {
                                        try {
                                            byteArrayOutputStream2.close();
                                        } catch (IOException e) {
                                            TbsLog.i(e);
                                        }
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                        byteArrayOutputStream2 = byteArrayOutputStream2;
                                    }
                                    TbsLog.i("HttpUtils", "getResponseFromConnection,response=" + str2 + ";isUseRSA=" + z);
                                    return str2;
                                }
                                inflaterInputStream = new GZIPInputStream(inputStream);
                                byteArrayOutputStream.close();
                            } catch (IOException e2) {
                                TbsLog.i(e2);
                            }
                            bArr = new byte[128];
                            while (true) {
                                i = inputStream.read(bArr);
                                if (i != -1) {
                                    break;
                                    break;
                                }
                                TbsLog.i("HttpUtils", "getResponseFromConnection len is " + i);
                                byteArrayOutputStream.write(bArr, 0, i);
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                            if (byteArray.length == 7) {
                                bArr2 = byteArray;
                            } else if (z) {
                                byte[] bArrC2 = h.a().c(byteArray);
                                str2 = new String(bArrC2);
                                bArr2 = bArrC2;
                            } else {
                                str2 = new String(h.b(byteArray, str));
                                bArr2 = byteArray;
                            }
                            inputStream.close();
                            byteArrayOutputStream2 = bArr2;
                        } catch (Exception e3) {
                            byteArrayOutputStream2 = byteArrayOutputStream;
                            e = e3;
                            TbsLog.i(e);
                            if (byteArrayOutputStream2 != null) {
                                byteArrayOutputStream2.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                                byteArrayOutputStream2 = byteArrayOutputStream2;
                            }
                            TbsLog.i("HttpUtils", "getResponseFromConnection,response=" + str2 + ";isUseRSA=" + z);
                            return str2;
                        } catch (Throwable th) {
                            byteArrayOutputStream2 = byteArrayOutputStream;
                            th = th;
                            if (byteArrayOutputStream2 != null) {
                                try {
                                    byteArrayOutputStream2.close();
                                } catch (IOException e4) {
                                    TbsLog.i(e4);
                                }
                            }
                            if (inputStream == null) {
                                throw th;
                            }
                            try {
                                inputStream.close();
                                throw th;
                            } catch (IOException e5) {
                                TbsLog.i(e5);
                                throw th;
                            }
                        }
                        byteArrayOutputStream = new ByteArrayOutputStream();
                    } catch (Exception e6) {
                        e = e6;
                    }
                    inputStream = inflaterInputStream;
                } catch (Exception e7) {
                    e = e7;
                    inputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                }
                TbsLog.i("HttpUtils", "getResponseFromConnection,response=" + str2 + ";isUseRSA=" + z);
                return str2;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e8) {
            TbsLog.i(e8);
        }
    }

    private static JSONObject b(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("APPNAME", o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f11O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            jSONObject.put("TIME", o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f12O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            jSONObject.put("QUA2", o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f13O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            jSONObject.put("LC", o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f14O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
            jSONObject.put("GUID", o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f15O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
            jSONObject.put("IMEI", o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f16O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
            jSONObject.put("IMSI", o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f17O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            jSONObject.put("MAC", o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f18O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
            jSONObject.put("PV", o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f22O000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
            jSONObject.put("CORETYPE", o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f23O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
            jSONObject.put("APPVN", o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f24O00000O00oOOo000000OOOo00OOOo0OooOO00OO0);
            jSONObject.put("APPMETADATA", o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f19O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
            jSONObject.put("VERSION_CODE", o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f20O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
            jSONObject.put("CPU", o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f21O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
            String str = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f25O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
            if (str == null) {
                str = SessionDescription.SUPPORTED_SDP_VERSION;
            }
            jSONObject.put("SIGNATURE", str);
            String strA = a(context);
            TbsLog.i("sdkreport", "addInfo is " + strA);
            if (!TextUtils.isEmpty(strA)) {
                jSONObject.put("EXT_INFO", strA);
            }
            jSONObject.put("PROTOCOL_VERSION", 3);
            jSONObject.put("ANDROID_ID", o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f26O00000OOoOOO00O00o0ooooooooO000ooooO0000);
            jSONObject.put("HOST_COREVERSION", 0);
            jSONObject.put("DECOUPLE_COREVERSION", 0);
            jSONObject.put("WIFICONNECTEDTIME", o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f27O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO);
            jSONObject.put("CORE_EXIST", o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f28O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
            int loadErrorCode = TbsCoreLoadStat.getLoadErrorCode();
            if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f28O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o <= 0) {
                jSONObject.put("TBS_ERROR_CODE", TbsDownloadConfig.getInstance(context).getDownloadInterruptCode());
            } else {
                jSONObject.put("TBS_ERROR_CODE", loadErrorCode);
            }
            if (loadErrorCode == -1) {
                TbsLog.e("sdkreport", "ATTENTION: Load errorCode missed!");
            }
            try {
                if (QbSdk.getTID() != null && (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f11O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.equals(TbsConfig.APP_QQ) || o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f11O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.equals(TbsConfig.APP_WX))) {
                    String tid = QbSdk.getTID();
                    jSONObject.put("TID", tid);
                    jSONObject.put("TIDTYPE", 0);
                }
            } catch (Exception unused) {
            }
            return jSONObject;
        } catch (Exception unused2) {
            TbsLog.e("sdkreport", "getPostData exception!");
            return null;
        }
    }

    public static void a(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, Context context) {
        String strSubstring;
        String strSubstring2;
        StringBuilder sb;
        String string;
        String str;
        com.tencent.smtt.utils.b.b(context, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f15O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f21O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = com.tencent.smtt.utils.b.a();
        JSONObject jSONObjectB = null;
        if (a == null) {
            try {
                a = "65dRa93L".getBytes("utf-8");
            } catch (UnsupportedEncodingException unused) {
                a = null;
                TbsLog.e("sdkreport", "Post failed -- get POST_DATA_KEY failed!");
            }
        }
        if (a == null) {
            string = "Post failed -- POST_DATA_KEY is null!";
        } else {
            String string2 = TbsDownloadConfig.getInstance(context).mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_DESkEY_TOKEN, "");
            if (TextUtils.isEmpty(string2)) {
                strSubstring = "";
                strSubstring2 = strSubstring;
            } else {
                strSubstring2 = string2.substring(0, string2.indexOf("&"));
                strSubstring = string2.substring(string2.indexOf("&") + 1, string2.length());
            }
            boolean z = TextUtils.isEmpty(strSubstring2) || strSubstring2.length() != 96 || TextUtils.isEmpty(strSubstring) || strSubstring.length() != 24;
            try {
                o oVarA = o.a();
                if (z) {
                    str = oVarA.b() + h.a().b();
                } else {
                    str = oVarA.e() + strSubstring2;
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setRequestMethod(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setConnectTimeout(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
                httpURLConnection.setRequestProperty("Connection", O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.HEAD_VALUE_CONNECTION_CLOSE);
                try {
                    jSONObjectB = b(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, context);
                } catch (Exception e) {
                    TbsLog.i(e);
                }
                if (jSONObjectB != null) {
                    try {
                        TbsLog.i("sdkreport", "Post jsonData.toString() is " + jSONObjectB.toString());
                        byte[] bytes = jSONObjectB.toString().getBytes("utf-8");
                        byte[] bArrA = z ? h.a().a(bytes) : h.a(bytes, strSubstring);
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bArrA.length));
                        try {
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            outputStream.write(bArrA);
                            outputStream.flush();
                            if (httpURLConnection.getResponseCode() == 200) {
                                TbsLog.i("SDKPVReport", "Post successful!");
                                a(context, a(httpURLConnection, strSubstring, z));
                            } else {
                                TbsLog.e("SDKPVReport", "Post failed -- not 200 code is " + httpURLConnection.getResponseCode());
                                TbsLogReport.TbsLogInfo tbsLogInfo = TbsLogReport.getInstance(context).tbsLogInfo();
                                tbsLogInfo.setErrorCode(126);
                                tbsLogInfo.setFailDetail("" + httpURLConnection.getResponseCode());
                                TbsLogReport.getInstance(context).eventReport(TbsLogReport.EventType.TYPE_PV_UPLOAD_STAT, tbsLogInfo);
                            }
                            return;
                        } catch (Throwable th) {
                            TbsLog.e("SDKPVReport", "Post failed -- exceptions:" + th.getMessage());
                            TbsLogReport.TbsLogInfo tbsLogInfo2 = TbsLogReport.getInstance(context).tbsLogInfo();
                            tbsLogInfo2.setErrorCode(126);
                            tbsLogInfo2.setFailDetail(th);
                            TbsLogReport.getInstance(context).eventReport(TbsLogReport.EventType.TYPE_PV_UPLOAD_STAT, tbsLogInfo2);
                            return;
                        }
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                string = "post -- jsonData is null!";
            } catch (IOException e2) {
                e = e2;
                sb = new StringBuilder("Post failed -- IOException:");
                sb.append(e);
                string = sb.toString();
            } catch (AssertionError e3) {
                e = e3;
                sb = new StringBuilder("Post failed -- AssertionError:");
                sb.append(e);
                string = sb.toString();
            } catch (Exception e4) {
                e = e4;
                sb = new StringBuilder("Post failed -- Exception:");
                sb.append(e);
                string = sb.toString();
            } catch (NoClassDefFoundError e5) {
                e = e5;
                sb = new StringBuilder("Post failed -- NoClassDefFoundError:");
                sb.append(e);
                string = sb.toString();
            }
        }
        TbsLog.e("sdkreport", string);
    }

    private static void a(Context context, int i) {
        TbsLog.i("HttpUtils", "updatePVConfig command is " + i);
        if (i == 1) {
            TbsPVConfig.getInstance(context).clear();
        }
        if (i == 2) {
            TbsPVConfig.getInstance(context).update(c);
        }
    }

    private static void a(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                a(context, 1);
                return;
            }
            c = new HashMap();
            for (String str2 : str.split("\\|")) {
                try {
                    String[] strArrSplit = str2.split("=");
                    if (strArrSplit.length == 2) {
                        a(context, strArrSplit[0], strArrSplit[1]);
                    }
                } catch (Exception e) {
                    TbsLog.i(e);
                }
            }
            int iC = c(context);
            TbsLog.i("HttpUtils", "readResponse, after processSwitchKeyValue mMapFromResponse is " + c.toString() + " commandForUpdatePVC is " + iC);
            a(context, iC);
        } catch (Exception e2) {
            TbsLog.i(e2);
        }
    }

    private static void a(Context context, String str, String str2) {
        TbsLog.i("HttpUtils", "PV Config Receive. Key: " + str + ", value: " + str2);
        if ("reset".equals(str) && "true".equals(str2)) {
            QbSdk.reset(context);
        } else if ("resetCfg24".equals(str) && "true".equals(str2)) {
            d(context);
        } else {
            c.put(str, str2);
        }
    }

    public static void a(Context context, String str, String str2, String str3, int i, boolean z, long j, boolean z2) {
        String str4;
        if (QbSdk.getSettings() != null && QbSdk.getSettings().containsKey(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD) && QbSdk.getSettings().get(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD).equals("false")) {
            TbsLog.i("sdkreport", "[HttpUtils.doReport] -- SET_SENDREQUEST_AND_UPLOAD is false");
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (TbsConfig.APP_QQ.equals(applicationInfo.packageName)) {
                str4 = context.getPackageManager().getPackageInfo(applicationInfo.packageName, 0).versionName;
                try {
                    if (!TextUtils.isEmpty(QbSdk.getQQBuildNumber())) {
                        str4 = str4 + "." + QbSdk.getQQBuildNumber();
                    }
                } catch (Exception e) {
                    e = e;
                    TbsLog.i(e);
                }
            } else {
                str4 = "";
            }
        } catch (Exception e2) {
            e = e2;
            str4 = "";
        }
        try {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f11O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = context.getApplicationContext().getApplicationInfo().packageName;
            o.a(context);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+08"));
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f12O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = simpleDateFormat.format(Calendar.getInstance().getTime());
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f20O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = com.tencent.smtt.utils.b.b(context);
            String strA = com.tencent.smtt.utils.b.a(context, TbsDownloader.TBS_METADATA);
            if (!TextUtils.isEmpty(strA)) {
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f19O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = strA;
            }
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f15O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = str;
            if (z) {
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f13O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = str2;
            } else {
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f13O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = l.a(context);
            }
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f14O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = str3;
            String strF = com.tencent.smtt.utils.b.f(context);
            String strD = com.tencent.smtt.utils.b.d(context);
            String strE = com.tencent.smtt.utils.b.e(context);
            String strG = com.tencent.smtt.utils.b.g(context);
            if (strD != null && !"".equals(strD)) {
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f16O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = strD;
            }
            if (strE != null && !"".equals(strE)) {
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f17O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = strE;
            }
            if (!TextUtils.isEmpty(strG)) {
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f26O00000OOoOOO00O00o0ooooooooO000ooooO0000 = strG;
            }
            if (strF != null && !"".equals(strF)) {
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f18O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = strF;
            }
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f22O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = i;
            if (!TbsShareManager.isThirdPartyApp(context)) {
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f23O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = z ? 1 : 0;
                if (z && z2) {
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f23O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = 3;
                }
            } else if (z) {
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f23O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = 1;
                if (z2) {
                    o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f23O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = 3;
                }
            } else {
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f23O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = 0;
            }
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f24O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = str4;
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f25O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = b(context);
            if (!z) {
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f27O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = j;
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f28O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = QbSdk.getTbsVersion(context);
            }
            b = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            a(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, context.getApplicationContext());
        } catch (Throwable th) {
            TbsLog.i(th);
        }
    }

    private static boolean a(Map<String, String> map, Map<String, String> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!(entry.getValue() == null ? "" : entry.getValue()).equals(map2.get(entry.getKey()) != null ? map2.get(entry.getKey()) : "")) {
                return false;
            }
        }
        return true;
    }
}
