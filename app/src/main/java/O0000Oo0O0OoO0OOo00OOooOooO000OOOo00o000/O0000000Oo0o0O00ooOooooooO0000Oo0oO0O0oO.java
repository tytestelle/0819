package O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

import android.os.storage.StorageManager;
import android.text.TextUtils;
import com.github.tvbox.osc.base.App;
import com.github.tvbox.osc.bean.AddressItem;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.orhanobut.hawk.Hawk;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.ServiceReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static String f1321O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static String f1322O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static String f1323O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static String f1324O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public static String f1325O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public static String f1326O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public static String f1327O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public static String f1328O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public static String f1329O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public static String f1330O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public static String f1331O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public static JSONObject f1332O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public static String[] f1333O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    /* JADX INFO: renamed from: O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, reason: collision with root package name */
    public static String f1336O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

    /* JADX INFO: renamed from: O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o, reason: collision with root package name */
    public static String f1337O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;

    /* JADX INFO: renamed from: O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o, reason: collision with root package name */
    public static O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f1338O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

    /* JADX INFO: renamed from: O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, reason: collision with root package name */
    public static String f1340O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public String f1341O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public static final ArrayList f1334O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = new ArrayList();

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public static final ArrayList f1335O00000OOoOOO00O00o0ooooooooO000ooooO0000 = new ArrayList();

    /* JADX INFO: renamed from: O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, reason: collision with root package name */
    public static String f1339O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = "";

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(JsonArray jsonArray, String str, JsonArray jsonArray2, String str2) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("groupName", str);
        jsonObject.add("groupChannels", jsonArray2);
        jsonObject.addProperty("groupConfigs", "");
        jsonObject.addProperty(str2, "yes");
        jsonArray.add(jsonObject);
    }

    public static JsonObject O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(File file) {
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(".");
        if (iLastIndexOf > 0) {
            name = name.substring(0, iLastIndexOf);
        }
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        jsonArray.add("file://" + file.getPath());
        jsonObject.addProperty("channelName", name);
        jsonObject.add("channelUrls", jsonArray);
        return jsonObject;
    }

    public static String[] O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        try {
            return (String[]) StorageManager.class.getMethod("getVolumePaths", null).invoke((StorageManager) App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getSystemService("storage"), null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        String str;
        if (f1338O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o == null) {
            App app = App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            f1338O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            String[] strArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            if (strArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                str = null;
                break;
            }
            int length = strArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = null;
                    break;
                }
                str = strArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[i];
                if (str.contains("/storage") || str.contains("/mnt") || str.contains("fat")) {
                    break;
                }
                i++;
            }
            f1322O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = str;
            f1337O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = app.getFilesDir().getPath();
            f1331O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
            O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
            f1339O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(app, "webview_jscode.js");
            f1338O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        }
        return f1338O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
    }

    public static void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        if (!new File(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder(), f1328O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, "/Configuration.json")).exists()) {
            O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "Configuration.json", f1328O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 + "/Configuration.json");
            String strO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000("Configuration.json");
            if (!strO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.isEmpty()) {
                try {
                    JSONObject jSONObject = new JSONObject(strO00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000);
                    if (jSONObject.has("Configuration")) {
                        f1332O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = jSONObject.getJSONObject("Configuration");
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        if (f1332O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo != null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(f1328O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 + "/Configuration.json"));
            if (jSONObject2.has("Configuration")) {
                f1332O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = jSONObject2.getJSONObject("Configuration");
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static boolean O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(String str) {
        return str.endsWith(".nomedia") || str.endsWith(".jpg") || str.endsWith(".jpeg") || str.endsWith(".png") || str.endsWith(".gif") || str.endsWith(".bmp") || str.endsWith(".webp") || str.endsWith(".tiff");
    }

    public static void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(String[] strArr, int i) {
        File[] fileArrListFiles;
        String strGroup;
        TreeMap treeMap = new TreeMap(new O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(1));
        for (String str : strArr) {
            File file = new File(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(str, ServiceReference.DELIMITER), f1331O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, "/localData"));
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
                for (File file2 : fileArrListFiles) {
                    String name = file2.getName();
                    O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                    o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f956O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = file2.toString();
                    if (name.endsWith(".m3u") || name.endsWith(".txt")) {
                        Matcher matcher = Pattern.compile("^\\d+#").matcher(name);
                        if (matcher.find()) {
                            strGroup = matcher.group();
                            int iIndexOf = name.indexOf("#") + 1;
                            int iLastIndexOf = name.lastIndexOf(".");
                            if (iLastIndexOf > 0) {
                                strGroup = name.substring(0, iLastIndexOf);
                            }
                            if (iIndexOf > 0 && iLastIndexOf > 0) {
                                name = name.substring(iIndexOf, iLastIndexOf);
                            }
                        } else {
                            int iLastIndexOf2 = name.lastIndexOf(".");
                            if (iLastIndexOf2 > 0) {
                                name = name.substring(0, iLastIndexOf2);
                            }
                            strGroup = name;
                        }
                        o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f955O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = strGroup;
                        f1334O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.add(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                        String strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(file2.toString());
                        if (!TextUtils.isEmpty(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(linkedHashMap, strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, name, true);
                            treeMap.put(strGroup, O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(linkedHashMap));
                        }
                    }
                }
            }
        }
        JsonArray jsonArray = new JsonArray();
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            jsonArray.addAll((JsonArray) it.next());
        }
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(jsonArray, i);
    }

    public static void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0() {
        String strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
        ArrayList<AddressItem> arrayList = (ArrayList) Hawk.get("live_url_list", new ArrayList());
        JsonArray jsonArray = new JsonArray();
        for (AddressItem addressItem : arrayList) {
            if (addressItem.isSelected()) {
                File file = new File(f1323O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(addressItem.getItemId(), ".txt"));
                if (file.exists() && !file.isDirectory()) {
                    try {
                        strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new FileInputStream(file));
                    } catch (Exception unused) {
                        strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = "";
                    }
                    if (!TextUtils.isEmpty(strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO)) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(linkedHashMap, strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, addressItem.getLiveUrlName(), false);
                        jsonArray.addAll(O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(linkedHashMap));
                    }
                }
            }
        }
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(jsonArray, 0);
    }

    public static void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() {
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(new String[]{f1322O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o}, 1);
        String[] strArr = null;
        try {
            String[] strArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            if (strArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null && strArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.length > 0) {
                int i = 0;
                for (String str : strArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                    if (str != null && !str.equals(f1322O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)) {
                        i++;
                    }
                }
                String[] strArr2 = new String[i];
                int i2 = 0;
                for (String str2 : strArrO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                    if (str2 != null && !str2.equals(f1322O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)) {
                        int i3 = i2 + 1;
                        strArr2[i2] = str2;
                        i2 = i3;
                    }
                }
                strArr = strArr2;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        f1333O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = strArr;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(strArr, 2);
    }

    public static void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() {
        File[] fileArrListFiles;
        JsonArray jsonArray = new JsonArray();
        if (!((Boolean) Hawk.get("开启本地视频", Boolean.valueOf(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1480O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000))).booleanValue()) {
            O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(jsonArray, 3);
            return;
        }
        File file = new File(f1330O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("largeGroup", "本地视频");
            jsonObject.addProperty("isLocalData", Boolean.TRUE);
            JsonArray jsonArray2 = new JsonArray();
            JsonArray jsonArray3 = new JsonArray();
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    JsonArray jsonArray4 = new JsonArray();
                    File[] fileArrListFiles2 = file2.listFiles();
                    if (fileArrListFiles2 != null) {
                        for (File file3 : fileArrListFiles2) {
                            if (file3.isFile() && !O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(file3.getPath())) {
                                jsonArray4.add(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(file3));
                            }
                        }
                    }
                    O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(jsonArray2, file2.getName(), jsonArray4, "has_local_video_path");
                } else if (file2.isFile() && !O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(file2.getPath())) {
                    jsonArray3.add(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(file2));
                }
            }
            if (jsonArray3.size() > 0) {
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(jsonArray2, "精彩视频", jsonArray3, "has_local_video_path");
            }
            jsonObject.add("group", jsonArray2);
            jsonArray.add(jsonObject);
        }
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(jsonArray, 3);
    }

    public static void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AddressItem addressItem : f1335O00000OOoOOO00O00o0ooooooooO000ooooO0000) {
            String liveUrlName = addressItem.getLiveUrlName();
            if (!linkedHashMap.containsKey(liveUrlName)) {
                linkedHashMap.put(liveUrlName, new JsonArray());
            }
            ((JsonArray) linkedHashMap.get(liveUrlName)).add(addressItem.getLiveUrl());
        }
        JsonArray jsonArray = new JsonArray();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("largeGroup", "推送频道");
        jsonObject.addProperty("isLocalData", Boolean.TRUE);
        JsonArray jsonArray2 = new JsonArray();
        JsonArray jsonArray3 = new JsonArray();
        for (String str : linkedHashMap.keySet()) {
            JsonArray jsonArray4 = (JsonArray) linkedHashMap.get(str);
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("channelName", str);
            jsonObject2.add("channelUrls", jsonArray4);
            jsonArray3.add(jsonObject2);
        }
        if (jsonArray3.size() > 0) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(jsonArray2, "精彩视频", jsonArray3, "has_tmp_channels");
        }
        jsonObject.add("group", jsonArray2);
        jsonArray.add(jsonObject);
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(jsonArray, 4);
    }

    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        this.f1341O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = f1322O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o + ServiceReference.DELIMITER + f1331O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        f1323O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder(), this.f1341O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "/download");
        f1321O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder(), this.f1341O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "/localData");
        f1324O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder(), this.f1341O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "/js");
        f1325O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder(), this.f1341O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "/py");
        f1326O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder(), this.f1341O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "/logo");
        f1327O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder(), this.f1341O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "/epgCache");
        f1328O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder(), this.f1341O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "/configuration");
        f1329O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder(), this.f1341O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "/backup");
        f1336O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder(), this.f1341O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "/x5.tbs.apk");
        f1340O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder(), this.f1341O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "/webviewJscode");
        f1330O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(new StringBuilder(), this.f1341O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "/videoFile");
    }
}
