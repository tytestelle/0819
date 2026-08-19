package O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final Pattern f1555O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = Pattern.compile("^(?!.*#genre#).*#EXTM3U.*", 8);

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final Pattern f1556O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = Pattern.compile(".*,(.+?)$");

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final Pattern f1557O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = Pattern.compile(".*group-title=\"(.?|.+?)\".*");

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final Pattern f1558O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = Pattern.compile(".*tvg-logo=\"(.?|.+?)\".*");

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static final Pattern f1559O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = Pattern.compile(".*tvg-name=\"(.?|.+?)\".*");

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public static final Pattern f1560O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = Pattern.compile(".*category=\"(.?|.+?)\".*");

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public static final Pattern f1561O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = Pattern.compile(".*catchup-source=\"(.?|.+?)\".*");

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public static final Pattern f1562O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = Pattern.compile(".*catchup=\"(.?|.+?)\".*");

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public static final HashMap f1563O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new HashMap();

    public static O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str, String str2) {
        O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = new O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o();
        o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.f1552O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = str;
        o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.f1553O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = str2;
        o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.f1554O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new LinkedHashMap();
        return o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
    }

    public static String O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str.trim());
        return matcher.matches() ? matcher.group(1) : "";
    }

    public static String O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return pattern.pattern().equals(f1557O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.pattern()) ? "未分类" : "未命名";
    }

    public static JsonArray O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(LinkedHashMap linkedHashMap) {
        Iterator it;
        Iterator it2;
        JsonArray jsonArray = new JsonArray();
        Iterator it3 = linkedHashMap.keySet().iterator();
        while (it3.hasNext()) {
            String str = (String) it3.next();
            JsonArray jsonArray2 = new JsonArray();
            O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o = (O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o) linkedHashMap.get(str);
            LinkedHashMap linkedHashMap2 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f1546O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (linkedHashMap2 == null || linkedHashMap2.isEmpty()) {
                it = it3;
            } else {
                for (String str2 : linkedHashMap2.keySet()) {
                    JsonArray jsonArray3 = new JsonArray();
                    O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = (O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) linkedHashMap2.get(str2);
                    LinkedHashMap linkedHashMap3 = o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.f1554O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    if (linkedHashMap3 != null && !linkedHashMap3.isEmpty()) {
                        Iterator it4 = linkedHashMap3.keySet().iterator();
                        while (it4.hasNext()) {
                            O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = (O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) linkedHashMap3.get((String) it4.next());
                            ArrayList arrayList = o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f1551O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                            if (arrayList == null || arrayList.isEmpty()) {
                                it2 = it3;
                            } else {
                                JsonArray jsonArray4 = new JsonArray();
                                Iterator it5 = arrayList.iterator();
                                while (it5.hasNext()) {
                                    jsonArray4.add((String) it5.next());
                                    it3 = it3;
                                }
                                it2 = it3;
                                JsonObject jsonObject = new JsonObject();
                                try {
                                    jsonObject.addProperty("channelName", o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f1547O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                                    jsonObject.addProperty("catchup", o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f1549O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                                    jsonObject.addProperty("catchup_source", o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f1548O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                                    jsonObject.addProperty("m3uLogoUrl", o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f1550O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                                    jsonObject.add("channelUrls", jsonArray4);
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                                jsonArray3.add(jsonObject);
                            }
                            it3 = it2;
                        }
                    }
                    Iterator it6 = it3;
                    JsonObject jsonObject2 = new JsonObject();
                    try {
                        jsonObject2.addProperty("groupName", o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.f1552O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.split(",")[0].trim());
                        jsonObject2.add("groupChannels", jsonArray3);
                        String str3 = o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.f1553O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        if (str3 != null) {
                            jsonObject2.addProperty("groupConfigs", str3);
                        }
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                    jsonArray2.add(jsonObject2);
                    it3 = it6;
                }
                it = it3;
                JsonObject jsonObject3 = new JsonObject();
                try {
                    jsonObject3.addProperty("largeGroup", str.split(",")[0]);
                    jsonObject3.addProperty("isLocalData", Boolean.valueOf(o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f1545O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO));
                    jsonObject3.add("group", jsonArray2);
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
                jsonArray.add(jsonObject3);
            }
            it3 = it;
        }
        return jsonArray;
    }

    public static void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(LinkedHashMap linkedHashMap, String str, String str2, boolean z) {
        String str3;
        String str4;
        String str5;
        String str6;
        ArrayList arrayList;
        O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
        BufferedReader bufferedReader;
        int iIndexOf;
        O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2;
        String strTrim = str.replace("\r\n", "\n").trim();
        String str7 = "未分组";
        if (!f1555O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.matcher(strTrim).find()) {
            try {
                bufferedReader = new BufferedReader(new StringReader(strTrim));
                try {
                    O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3 = new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o();
                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.f1545O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = z;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    int iO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
                    if (!TextUtils.isEmpty(str2)) {
                        str7 = str2;
                    }
                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        String strTrim2 = line.trim();
                        if (!strTrim2.isEmpty()) {
                            String[] strArrSplit = strTrim2.split(",");
                            if (strArrSplit.length >= 2) {
                                if (strTrim2.contains("#group#") && iO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 > 1) {
                                    String strTrim3 = strArrSplit[0].trim();
                                    if (linkedHashMap.containsKey(strTrim3)) {
                                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2 = (O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o) linkedHashMap.get(strTrim3);
                                    } else {
                                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2 = new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o();
                                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.f1545O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = z;
                                    }
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2.getClass();
                                    linkedHashMap.put(strTrim3, o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2);
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o2;
                                } else if (strTrim2.contains("#genre#")) {
                                    String strTrim4 = strTrim2.trim();
                                    String[] strArrSplit2 = strTrim2.trim().split(",#genre#,");
                                    String strTrim5 = strArrSplit2.length > 1 ? strArrSplit2[1].trim() : null;
                                    if (iO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 > 1) {
                                        if (linkedHashMap.isEmpty()) {
                                            o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.getClass();
                                            linkedHashMap.put(str7, o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3);
                                        }
                                        boolean zIsEmpty = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.f1546O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isEmpty();
                                        LinkedHashMap linkedHashMap4 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.f1546O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                                        if (zIsEmpty && !linkedHashMap2.isEmpty()) {
                                            O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = new O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o();
                                            o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.f1552O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = "未分类";
                                            o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.f1554O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new LinkedHashMap(linkedHashMap2);
                                            linkedHashMap4.put("未分类", o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o);
                                            linkedHashMap2 = new LinkedHashMap();
                                        }
                                        O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o2 = (O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) linkedHashMap4.get(strTrim4);
                                        if (o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o2 != null) {
                                            linkedHashMap3 = o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o2.f1554O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                                        } else {
                                            O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(strTrim4, strTrim5);
                                            linkedHashMap4.put(strTrim4, o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                                            linkedHashMap3 = o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1554O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                                        }
                                    } else if (iO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == 1 || !z) {
                                        if (o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.f1546O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isEmpty() && !linkedHashMap2.isEmpty()) {
                                            O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o3 = new O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o();
                                            o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o3.f1552O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = "未分类";
                                            o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o3.f1554O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new LinkedHashMap(linkedHashMap2);
                                            o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.f1546O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.put("未分类", o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o3);
                                            linkedHashMap.put(str7, o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3);
                                            linkedHashMap2 = new LinkedHashMap();
                                        }
                                        if (linkedHashMap.containsKey(strTrim4)) {
                                            o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3 = (O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o) linkedHashMap.get(strTrim4);
                                            O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o4 = (O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.f1546O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(strTrim4);
                                            if (o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o4 != null) {
                                                linkedHashMap3 = o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o4.f1554O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                                            } else {
                                                O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(strTrim4, strTrim5);
                                                o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.f1546O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.put(strTrim4, o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2);
                                                linkedHashMap3 = o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2.f1554O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                                            }
                                        } else {
                                            o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3 = new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o();
                                            o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.f1545O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = z;
                                            O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(strTrim4, strTrim5);
                                            o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.f1546O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.put(strTrim4, o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3);
                                            linkedHashMap3 = o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3.f1554O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                                            linkedHashMap.put(strTrim4, o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3);
                                        }
                                    }
                                } else if (!strTrim2.contains("#group#") && (iIndexOf = strTrim2.indexOf(44)) != -1) {
                                    String strTrim6 = strArrSplit[0].trim();
                                    for (String str8 : strTrim2.substring(iIndexOf + 1).trim().split("(?<!/)#(?!/)")) {
                                        String strTrim7 = str8.trim();
                                        if (!strTrim7.isEmpty()) {
                                            O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = (O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) linkedHashMap3.get(strTrim6);
                                            if (o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 == null) {
                                                o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = new O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000();
                                                o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f1547O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = strTrim6;
                                                linkedHashMap3.put(strTrim6, o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000);
                                            }
                                            if (!o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f1551O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.contains(strTrim7)) {
                                                o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f1551O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.add(strTrim7);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (linkedHashMap.isEmpty()) {
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.getClass();
                        linkedHashMap.put(str7, o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3);
                    }
                    if (o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.f1546O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isEmpty()) {
                        O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o5 = new O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o();
                        o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o5.f1552O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = str7;
                        o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o5.f1554O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = linkedHashMap2;
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3.f1546O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.put(str7, o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o5);
                        linkedHashMap.put(str7, o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o3);
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "节目解析错误：" + th.getMessage());
                        if (bufferedReader == null) {
                            return;
                        }
                    } finally {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused) {
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
            try {
                return;
            } catch (IOException unused2) {
                return;
            }
        }
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new StringReader(strTrim));
            O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o4 = new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o();
            o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o4.f1545O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = z;
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            int iO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
            str7 = TextUtils.isEmpty(str2) ? "未分组" : str2;
            String str9 = "http://ku9-drm-mpd.mpd?url=#1&manifest_type=#2&license_type=#3&license_key=#4";
            LinkedHashMap linkedHashMap6 = linkedHashMap5;
            String str10 = "append";
            String str11 = null;
            boolean z2 = false;
            String strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
            String strTrim8 = null;
            String str12 = null;
            String strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
            O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o5 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o4;
            String strReplace = "http://ku9-drm-mpd.mpd?url=#1&manifest_type=#2&license_type=#3&license_key=#4";
            while (true) {
                String line2 = bufferedReader2.readLine();
                if (line2 == null) {
                    break;
                }
                if (line2.isEmpty()) {
                    str3 = str9;
                    str4 = str11;
                } else {
                    boolean zStartsWith = line2.startsWith("#EXTM3U");
                    str3 = str9;
                    Pattern pattern = f1562O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                    str4 = str11;
                    Pattern pattern2 = f1561O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                    if (zStartsWith) {
                        String strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(line2, pattern2);
                        str11 = !TextUtils.isEmpty(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2) ? strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 : str4;
                        String strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3 = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(line2, pattern);
                        if (!TextUtils.isEmpty(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3)) {
                            str10 = strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO3;
                        }
                        str9 = str3;
                    } else if (line2.startsWith("#EXTINF")) {
                        strTrim8 = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(line2, f1556O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).trim();
                        String strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4 = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(line2, f1560O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                        strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(line2, f1557O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                        if (TextUtils.isEmpty(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4)) {
                            strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4 = null;
                        }
                        String strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO5 = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(line2, pattern2);
                        str12 = TextUtils.isEmpty(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO5) ? str4 : strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO5;
                        String strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO6 = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(line2, pattern);
                        if (!TextUtils.isEmpty(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO6)) {
                            str10 = strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO6;
                        }
                        strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(line2, f1558O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                        String strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO7 = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(line2, f1559O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                        String lowerCase = strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO7.toLowerCase();
                        JsonObject jsonObject = new JsonObject();
                        String str13 = str10;
                        jsonObject.addProperty("epgid", lowerCase);
                        HashMap map = O00000OOoOOO00O00o0ooooooooO000ooooO0000.f1425O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                        if (!map.containsKey(strTrim8.toLowerCase()) && !strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO7.isEmpty()) {
                            map.put(strTrim8.toLowerCase(), jsonObject);
                        }
                        if (iO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 > 1) {
                            if (strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4 != null) {
                                if (linkedHashMap.containsKey(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4)) {
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o = (O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o) linkedHashMap.get(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4);
                                } else {
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o = new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o();
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f1545O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = z;
                                }
                                o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.getClass();
                                linkedHashMap.put(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO4, o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o);
                            } else {
                                if (linkedHashMap.containsKey(str7)) {
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o = (O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o) linkedHashMap.get(str7);
                                } else {
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o = new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o();
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f1545O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = z;
                                }
                                o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.getClass();
                                linkedHashMap.put(str7, o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o);
                            }
                            O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o6 = (O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f1546O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                            if (o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o6 != null) {
                                linkedHashMap6 = o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o6.f1554O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            } else {
                                O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, null);
                                o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f1546O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.put(strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4);
                                linkedHashMap6 = o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4.f1554O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                            }
                        } else {
                            if (iO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 == 1 || !z) {
                                if (linkedHashMap.containsKey(strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)) {
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o = (O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o) linkedHashMap.get(strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                                    O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o7 = (O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f1546O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                                    if (o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o7 != null) {
                                        linkedHashMap6 = o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o7.f1554O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                                    } else {
                                        O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO5 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, null);
                                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f1546O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.put(strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO5);
                                        linkedHashMap6 = o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO5.f1554O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o5 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
                                    }
                                } else {
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o = new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o();
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f1545O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = z;
                                    O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO6 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, null);
                                    o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f1546O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.put(strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO6);
                                    linkedHashMap6 = o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0oO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO6.f1554O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                                    linkedHashMap.put(strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o);
                                }
                            }
                            str9 = str3;
                            str11 = str4;
                            str10 = str13;
                        }
                        o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o5 = o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
                        str9 = str3;
                        str11 = str4;
                        str10 = str13;
                    } else {
                        if (line2.startsWith("#KODIPROP:inputstream.adaptive.manifest_type")) {
                            strReplace = strReplace.replace("#2", line2.substring(line2.indexOf("=") + 1));
                        } else if (line2.startsWith("#KODIPROP:inputstream.adaptive.license_type")) {
                            strReplace = strReplace.replace("#3", line2.substring(line2.indexOf("=") + 1));
                        } else if (line2.startsWith("#KODIPROP:inputstream.adaptive.license_key")) {
                            strReplace = strReplace.replace("#4", line2.substring(line2.indexOf("=") + 1));
                        } else if (line2.startsWith("#EXTKU9OPT")) {
                            String strTrim9 = line2.replace("#EXTKU9OPT:", "").trim();
                            if (TextUtils.isEmpty(strTrim9)) {
                                strTrim9 = null;
                            }
                            ((O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o5.f1546O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(strO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)).f1553O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = strTrim9;
                        } else if (!line2.startsWith("#")) {
                            if (z2) {
                                try {
                                    line2 = strReplace.replace("#1", URLEncoder.encode(line2, "UTF-8"));
                                } catch (UnsupportedEncodingException e) {
                                    e.printStackTrace();
                                }
                            }
                            if (line2.contains("#2")) {
                                line2 = line2.replace("#2", "dash");
                            }
                            String str14 = strTrim8;
                            if (str14 == null) {
                                str5 = str12;
                                str6 = strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                            } else {
                                O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00001 = (O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) linkedHashMap6.get(str14);
                                if (o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00001 != null) {
                                    arrayList = o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00001.f1551O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                                    str5 = str12;
                                    str6 = strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                                } else {
                                    O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00002 = new O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000();
                                    o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00002.f1547O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = str14;
                                    o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00002.f1549O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = str10;
                                    str5 = str12;
                                    o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00002.f1548O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = str5;
                                    str6 = strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                                    o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00002.f1550O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = str6;
                                    ArrayList arrayList2 = new ArrayList();
                                    o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00002.f1551O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = arrayList2;
                                    linkedHashMap6.put(str14, o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00002);
                                    arrayList = arrayList2;
                                }
                                if (arrayList != null && !arrayList.contains(line2)) {
                                    arrayList.add(line2);
                                }
                            }
                            strReplace = str3;
                            strTrim8 = str14;
                            str12 = str5;
                            strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = str6;
                            str11 = str4;
                            z2 = false;
                            str9 = strReplace;
                        }
                        str9 = str3;
                        str11 = str4;
                        z2 = true;
                    }
                }
                strTrim8 = strTrim8;
                str12 = str12;
                strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                str11 = str4;
                str9 = str3;
                e.printStackTrace();
            }
            bufferedReader2.close();
            if (linkedHashMap.isEmpty()) {
                o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o5.getClass();
                linkedHashMap.put(str7, o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o5);
            }
            if (o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o5.f1546O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isEmpty()) {
                O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o8 = new O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o();
                o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o8.f1552O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = str7;
                o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o8.f1554O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = linkedHashMap5;
                o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o5.f1546O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.put(str7, o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o8);
                linkedHashMap.put(str7, o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o5);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
