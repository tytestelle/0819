package O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;

import O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.github.tvbox.osc.base.App;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.dialog.O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import fi.iki.elonen.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
import fi.iki.elonen.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
import fi.iki.elonen.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import org.fourthline.cling.model.ServiceReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 extends O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo {

    /* JADX INFO: renamed from: O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, reason: collision with root package name */
    public static int f1057O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = 9978;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public App f1058O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public boolean f1059O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 f1060O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public ArrayList f1061O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public ArrayList f1062O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public String f1063O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public boolean f1064O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 f1065O00000OOoOOO00O00o0ooooooooO000ooooO0000;

    public static String O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(String str, String str2) {
        File file = new File(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(str, ServiceReference.DELIMITER, str2));
        File[] fileArrListFiles = file.listFiles();
        JsonObject jsonObject = new JsonObject();
        StringBuilder sb = new StringBuilder();
        sb.append("http://127.0.0.1:" + f1057O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO + ServiceReference.DELIMITER);
        sb.append("file/");
        jsonObject.addProperty("remote", sb.toString());
        jsonObject.addProperty("del", (Number) 0);
        if (str2.isEmpty()) {
            jsonObject.addProperty("parent", ".");
        } else {
            jsonObject.addProperty("parent", file.getParentFile().getAbsolutePath().replace(str + ServiceReference.DELIMITER, "").replace(str, ""));
        }
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            jsonObject.add("files", new JsonArray());
            return jsonObject.toString();
        }
        Arrays.sort(fileArrListFiles, new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(0));
        JsonArray jsonArray = new JsonArray();
        for (File file2 : fileArrListFiles) {
            if (!file2.getName().startsWith(".")) {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("name", file2.getName());
                jsonObject2.addProperty("path", file2.getAbsolutePath().replace(str + ServiceReference.DELIMITER, ""));
                long jLastModified = file2.lastModified();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(jLastModified);
                jsonObject2.addProperty("time", new SimpleDateFormat("yyyy/MM/dd aHH:mm:ss").format(calendar.getTime()));
                jsonObject2.addProperty("dir", Integer.valueOf(file2.isDirectory() ? 1 : 0));
                jsonArray.add(jsonObject2);
            } else if (file2.getName().equals(".tvbox_folder")) {
                jsonObject.addProperty("del", (Number) 1);
            }
        }
        jsonObject.add("files", jsonArray);
        return jsonObject.toString();
    }

    public static JSONObject O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo : O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1334O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("groupName", o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f955O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            jSONObject2.put("groupNamePath", o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f956O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("categories", jSONArray);
        return jSONObject;
    }

    public static String O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(Context context) {
        int ipAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getIpAddress();
        if (ipAddress != 0) {
            return String.format("%d.%d.%d.%d", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255));
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                String displayName = networkInterfaceNextElement.getDisplayName();
                if (displayName.equals("eth0") || displayName.equals("wlan0")) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                            return inetAddressNextElement.getHostAddress();
                        }
                    }
                }
            }
            return "0.0.0.0";
        } catch (SocketException e) {
            e.printStackTrace();
            return "0.0.0.0";
        }
    }

    public static void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(File file, String str) throws IOException {
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
            StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(str);
            sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(File.separator);
            sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(zipEntryNextElement.getName());
            String string = sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString();
            if (zipEntryNextElement.isDirectory()) {
                File file3 = new File(string);
                if (!file3.exists()) {
                    file3.mkdirs();
                }
                File file4 = new File(file3 + "/.tvbox_folder");
                if (!file4.exists()) {
                    file4.createNewFile();
                }
            } else {
                File file5 = new File(string);
                if (file5.exists()) {
                    file5.delete();
                }
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(string));
                byte[] bArr = new byte[2048];
                for (int i = inputStream.read(bArr); i > 0; i = inputStream.read(bArr)) {
                    bufferedOutputStream.write(bArr, 0, i);
                }
                bufferedOutputStream.close();
            }
        }
    }

    public final O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(fi.iki.elonen.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        String str;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        String str2;
        String str3;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1;
        byte[] bArrLookupHttpsForwardSync;
        String string;
        String str4;
        String strConcat = "";
        O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(19));
        boolean zIsEmpty = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3954O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.isEmpty();
        ArrayList<O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO> arrayList = this.f1061O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        if (zIsEmpty) {
            str = "";
        } else {
            String strTrim = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3954O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.trim();
            if (strTrim.indexOf(63) >= 0) {
                strTrim = strTrim.substring(0, strTrim.indexOf(63));
            }
            fi.iki.elonen.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3955O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 == fi.iki.elonen.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.GET) {
                for (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3 : arrayList) {
                    if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, strTrim)) {
                        return o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(strTrim, o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000());
                    }
                }
                if (strTrim.equals("/proxy")) {
                    HashMap mapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                    mapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.putAll(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3957O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
                    mapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.put("request-headers", new Gson().toJson(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3957O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0));
                    if (mapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.containsKey("do")) {
                        Object[] objArrProxyInvoke = O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f879O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.proxyInvoke(mapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
                        int iIntValue = ((Integer) objArrProxyInvoke[0]).intValue();
                        String str5 = (String) objArrProxyInvoke[1];
                        Object obj = objArrProxyInvoke[2];
                        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.lookup(iIntValue), str5, obj != null ? (InputStream) obj : null, -1L);
                        if (objArrProxyInvoke.length > 3) {
                            try {
                                HashMap map = (HashMap) objArrProxyInvoke[3];
                                for (String str6 : map.keySet()) {
                                    o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f3969O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.put(str6, (String) map.get(str6));
                                }
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                        return o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                    }
                } else {
                    HashMap map2 = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1419O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    if (strTrim.contains("/ku9/ts-js/")) {
                        try {
                            if (!this.f1064O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 || (str4 = this.f1063O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) == null) {
                                String strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f1065O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO());
                                LivePlayActivity.f2953O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO = false;
                                if (strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) {
                                    O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.f3201O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.put("JsReturn", strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                                    JSONObject jSONObject = new JSONObject(strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                                    if (!jSONObject.has("m3u8")) {
                                        throw new Exception("m3u8 is not exist");
                                    }
                                    string = jSONObject.getString("m3u8");
                                } else {
                                    string = null;
                                }
                            } else {
                                this.f1064O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = false;
                                string = str4;
                            }
                        } catch (Exception e) {
                            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(e, new StringBuilder("m3u8切片获取失败 "), 1);
                        }
                        return string != null ? O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, "application/vnd.apple.mpegurl", string) : O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.NOT_FOUND, "text/plain", "Not Found");
                    }
                    if (strTrim.startsWith("/file/")) {
                        try {
                            String strSubstring = strTrim.substring(6);
                            String str7 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1322O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            String str8 = str7 + ServiceReference.DELIMITER + strSubstring;
                            File file = new File(str8);
                            if (file.exists()) {
                                return file.isFile() ? new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, "application/octet-stream", new FileInputStream(file), -1L) : O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, "text/plain", O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(str7, strSubstring));
                            }
                            return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.INTERNAL_ERROR, "text/plain", "File " + str8 + " not found!");
                        } catch (Throwable th2) {
                            return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.INTERNAL_ERROR, "text/plain", th2.getMessage());
                        }
                    }
                    if (strTrim.equals("/dns-query")) {
                        try {
                            bArrLookupHttpsForwardSync = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f1586O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lookupHttpsForwardSync((String) o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000().get("name"));
                        } catch (Throwable unused) {
                            bArrLookupHttpsForwardSync = new byte[0];
                        }
                        return new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, "application/dns-message", new ByteArrayInputStream(bArrLookupHttpsForwardSync), bArrLookupHttpsForwardSync.length);
                    }
                    if (strTrim.equals("/host-query")) {
                        return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, "application/host-message", O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f1586O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.lookupHost((String) o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000().get("name")));
                    }
                    if (strTrim.equals("/m3u8")) {
                        return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, "text/plain", null);
                    }
                    if (strTrim.startsWith("/ku9/js/")) {
                        String str9 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3959O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
                        return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, "application/json", O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO("http:/" + strTrim + "?" + (str9 != null ? str9 : ""), null));
                    }
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
                    if (o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 == null || (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o) == null || (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f949O00000OOoOOO00O00o0ooooooooO000ooooO0000) == null) {
                        str3 = null;
                    } else {
                        String str10 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1.f931O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
                        str3 = str10 != null ? str10 : o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1.f919O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
                    }
                    if (!TextUtils.isEmpty(str3) || O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() > 0) {
                        try {
                            String str11 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3954O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                            String str12 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3959O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
                            StringBuilder sb = new StringBuilder();
                            sb.append(str11);
                            if (str12 != null && !str12.isEmpty()) {
                                strConcat = "?".concat(str12);
                            }
                            sb.append(strConcat);
                            Response responseExecute = new OkHttpClient.Builder().connectionSpecs(Util.immutableList(ConnectionSpec.RESTRICTED_TLS, ConnectionSpec.MODERN_TLS, ConnectionSpec.COMPATIBLE_TLS, ConnectionSpec.CLEARTEXT)).dns(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f1586O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).build().newCall(new Request.Builder().url(sb.toString()).build()).execute();
                            fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0Lookup = fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.lookup(responseExecute.code());
                            if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0Lookup == null) {
                                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0Lookup = fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK;
                            }
                            return new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0Lookup, responseExecute.header("Content-Type", "application/octet-stream"), responseExecute.body().byteStream(), responseExecute.body().contentLength());
                        } catch (Throwable th3) {
                            return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.INTERNAL_ERROR, "text/plain", "请求失败: " + th3.getMessage());
                        }
                    }
                }
            } else if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 == fi.iki.elonen.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.POST) {
                HashMap map3 = new HashMap();
                try {
                    if (!o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3957O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.containsKey("content-type") || (str2 = (String) o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3957O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.get("content-type")) == null) {
                        str = "";
                    } else {
                        str = "";
                        if (str2.toLowerCase().contains("multipart/form-data") && !str2.toLowerCase().contains("charset=")) {
                            Matcher matcher = Pattern.compile("[ |\t]*(boundary[ |\t]*=[ |\t]*['|\"]?[^\"^'^;^,]*['|\"]?)", 2).matcher(str2);
                            String strGroup = matcher.find() ? matcher.group(1) : null;
                            if (strGroup != null) {
                                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3957O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.put("content-type", "multipart/form-data; charset=utf-8; ".concat(strGroup));
                            }
                        }
                    }
                    o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(map3);
                    for (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO4 : this.f1062O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
                        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO4.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, strTrim)) {
                            return o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO4.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(strTrim, o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000());
                        }
                    }
                    try {
                        HashMap mapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                        if (strTrim.equals("/upload")) {
                            String str13 = (String) mapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.get("path");
                            for (String str14 : map3.keySet()) {
                                if (str14.startsWith("files-")) {
                                    String str15 = (String) mapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.get(str14);
                                    File file2 = new File((String) map3.get(str14));
                                    String str16 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1322O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                                    File file3 = new File(str16 + ServiceReference.DELIMITER + str13 + ServiceReference.DELIMITER + str15);
                                    if (file3.exists()) {
                                        file3.delete();
                                    }
                                    if (file2.exists()) {
                                        if (str15.toLowerCase().endsWith(".zip")) {
                                            O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(file2, str16 + ServiceReference.DELIMITER + str13);
                                        } else {
                                            int i = O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1592O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                                            try {
                                                FileInputStream fileInputStream2 = new FileInputStream(file2);
                                                try {
                                                    FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                                                    try {
                                                        byte[] bArr = new byte[1024];
                                                        while (true) {
                                                            int i2 = fileInputStream2.read(bArr);
                                                            if (i2 <= 0) {
                                                                break;
                                                            }
                                                            fileOutputStream2.write(bArr, 0, i2);
                                                        }
                                                        fileInputStream2.close();
                                                        fileOutputStream2.close();
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        fileInputStream = fileInputStream2;
                                                        fileOutputStream = fileOutputStream2;
                                                        fileInputStream.close();
                                                        fileOutputStream.close();
                                                        throw th;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    fileInputStream = fileInputStream2;
                                                    fileOutputStream = null;
                                                    fileInputStream.close();
                                                    fileOutputStream.close();
                                                    throw th;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                fileInputStream = null;
                                            }
                                        }
                                    }
                                    if (file2.exists()) {
                                        file2.delete();
                                    }
                                }
                            }
                            return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, "text/plain", "upload OK");
                        }
                        if (strTrim.equals("/newFolder")) {
                            String str17 = (String) mapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.get("path");
                            String str18 = (String) mapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.get("name");
                            String str19 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1322O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            File file4 = new File(str19 + ServiceReference.DELIMITER + str17 + ServiceReference.DELIMITER + str18);
                            if (!file4.exists()) {
                                file4.mkdirs();
                                File file5 = new File(str19 + ServiceReference.DELIMITER + str17 + ServiceReference.DELIMITER + str18 + "/.tvbox_folder");
                                if (!file5.exists()) {
                                    file5.createNewFile();
                                }
                            }
                            return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, "text/plain", "newFolder OK");
                        }
                        if (strTrim.equals("/delFolder")) {
                            String str20 = (String) mapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.get("path");
                            File file6 = new File(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1322O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o + ServiceReference.DELIMITER + str20);
                            if (file6.exists()) {
                                O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(file6);
                            }
                            return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, "text/plain", "delFolder OK");
                        }
                        if (strTrim.equals("/delFile")) {
                            String str21 = (String) mapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.get("path");
                            File file7 = new File(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1322O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o + ServiceReference.DELIMITER + str21);
                            if (file7.exists()) {
                                file7.delete();
                            }
                            return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, "text/plain", "delFile OK");
                        }
                        if (strTrim.equals("/getChannelGroup")) {
                            return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, "application/json", O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo().toString());
                        }
                        if (strTrim.equals("/processGroupPath")) {
                            File file8 = new File((String) mapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.get("path"));
                            return file8.exists() ? O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, "text/plain", O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(file8.toString())) : O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.NOT_FOUND, "text/plain", "File not found");
                        }
                        if (strTrim.equals("/saveGroupPath")) {
                            String strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo((String) mapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.get("path"), (String) mapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.get("content"), (String) mapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.get("groupName"));
                            LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(1);
                            return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, "text/plain", strO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                        }
                        if (strTrim.equals("/addGroupData")) {
                            String str22 = (String) mapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.get("groupName");
                            String str23 = str22 + ",#genre#\n";
                            String str24 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1321O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + ServiceReference.DELIMITER + str22 + ".txt";
                            O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(str23, str24);
                            LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(1);
                            return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, "text/plain", str24);
                        }
                        if (strTrim.equals("/delGroup")) {
                            File file9 = new File((String) mapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.get("path"));
                            if (!file9.exists()) {
                                return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.NOT_FOUND, "text/plain", "File not found");
                            }
                            file9.delete();
                            LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3263O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(1);
                            return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, "text/plain", "delGroup OK");
                        }
                        if (strTrim.equals("/renameFile")) {
                            String str25 = (String) mapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.get("path");
                            String str26 = (String) mapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.get("name");
                            String str27 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1322O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str27);
                            sb2.append(ServiceReference.DELIMITER);
                            sb2.append(str25);
                            return O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(sb2.toString(), str26) ? O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, "text/plain", "renameFile OK") : O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.NOT_FOUND, "text/plain", "renameFile eror");
                        }
                        if (strTrim.equals("/getStoragePath")) {
                            return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, "text/plain", O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1322O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                        }
                        if (strTrim.equals("/ku9/js/debug")) {
                            String str28 = (String) map3.get("postData");
                            String str29 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f3959O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
                            return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, "application/json", O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO("http:/" + strTrim + "?" + (str29 != null ? str29 : str), str28));
                        }
                    } catch (Throwable th7) {
                        return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.OK, "text/plain", "catch error " + th7.getMessage());
                    }
                } catch (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O e2) {
                    return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(e2.getStatus(), "text/plain", e2.getMessage());
                } catch (IOException e3) {
                    return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(fi.iki.elonen.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e3.getMessage());
                }
            }
            str = "";
        }
        return ((O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) arrayList.get(0)).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str, null);
    }

    public final void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() {
        try {
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f3983O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            fi.iki.elonen.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f3985O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
            for (fi.iki.elonen.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO : new ArrayList(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f3946O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) {
                O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3935O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3936O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            }
            Thread thread = this.f3984O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (thread != null) {
                thread.join();
            }
        } catch (Exception e) {
            O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f3981O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
        }
        this.f1059O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = false;
    }
}
