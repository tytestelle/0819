package O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.github.tvbox.osc.bean.AddressItem;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.google.gson.JsonArray;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final HashMap f1378O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new HashMap();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static ArrayList f1379O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ArrayList();

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(AddressItem addressItem, boolean z, LivePlayActivity livePlayActivity, JsonArray jsonArray) {
        String strO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(addressItem);
        if (TextUtils.isEmpty(strO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) || strO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.trim().startsWith("<?xml")) {
            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, addressItem.getLiveUrlName() + " 获取数据为空");
            File file = new File(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1323O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, addressItem.getItemId() + ".txt");
            if (file.exists() && !file.isDirectory()) {
                try {
                    strO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new FileInputStream(file));
                } catch (Exception unused) {
                    strO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = "";
                }
            }
        }
        if (TextUtils.isEmpty(strO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0)) {
            return;
        }
        livePlayActivity.getClass();
        String itemId = addressItem.getItemId();
        String str = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1323O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        String strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(itemId, ".txt");
        StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(str);
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(File.separator);
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(strO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
        O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(strO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString());
        if (z) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(linkedHashMap, strO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, addressItem.getLiveUrlName(), false);
        jsonArray.addAll(O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(linkedHashMap));
    }

    public static void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(JSONArray jSONArray, ArrayList arrayList) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String strOptString = jSONObject.optString("url", null);
                String strOptString2 = jSONObject.optString("name", null);
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                    AddressItem addressItem = new AddressItem();
                    addressItem.setLiveUrl(strOptString);
                    addressItem.setLiveUrlName(strOptString2);
                    addressItem.setSelected(false);
                    addressItem.setItemId(O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(strOptString2 + "_" + strOptString, "MD5"));
                    arrayList.add(addressItem);
                }
            } catch (JSONException unused) {
                return;
            }
        }
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(JSONArray jSONArray, ArrayList arrayList) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String strOptString = jSONArray.getJSONObject(i).optString("sourceUrl", null);
                if (!TextUtils.isEmpty(strOptString)) {
                    String strO00000OOoOOO00O00o0ooooooooO000ooooO0000 = O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(strOptString, null);
                    if (!(TextUtils.isEmpty(strO00000OOoOOO00O00o0ooooooooO000ooooO0000) || strO00000OOoOOO00O00o0ooooooooO000ooooO0000.trim().startsWith("<?xml"))) {
                        try {
                            JSONObject jSONObject = new JSONObject(strO00000OOoOOO00O00o0ooooooooO000ooooO0000);
                            if (jSONObject.has("urls")) {
                                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(jSONObject.getJSONArray("urls"), arrayList);
                            } else if (jSONObject.has("lives")) {
                                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(jSONObject.getJSONArray("lives"), arrayList);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (JSONException unused2) {
                return;
            }
        }
    }

    public static void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(JSONArray jSONArray, ArrayList arrayList) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String strOptString = jSONArray.getJSONObject(i).optString("url", null);
                if (!TextUtils.isEmpty(strOptString)) {
                    String strO00000OOoOOO00O00o0ooooooooO000ooooO0000 = O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(strOptString, null);
                    if (!(TextUtils.isEmpty(strO00000OOoOOO00O00o0ooooooooO000ooooO0000) || strO00000OOoOOO00O00o0ooooooooO000ooooO0000.trim().startsWith("<?xml"))) {
                        try {
                            JSONObject jSONObject = new JSONObject(strO00000OOoOOO00O00o0ooooooooO000ooooO0000);
                            if (jSONObject.has("lives")) {
                                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(jSONObject.getJSONArray("lives"), arrayList);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            } catch (JSONException unused2) {
                return;
            }
        }
    }

    public static String O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(AddressItem addressItem) {
        try {
            String str = new String(Base64.decode(Uri.parse("http://127.0.0.1:" + O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1057O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO + "/proxy?do=live&type=txt&ext=" + Base64.encodeToString(addressItem.getRequestUrl().getBytes(Charset.forName("UTF-8")), 10)).getQueryParameter("ext"), 10), Charset.forName("UTF-8"));
            if (str.isEmpty()) {
                return null;
            }
            String strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(addressItem, str);
            if (strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null || TextUtils.isEmpty(strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) || strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.contains("<!DOCTYPE html>") || strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.trim().startsWith("<html>")) {
                strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(addressItem.getRequestUrl(), addressItem.getHeaders(), addressItem.isB64decode(), addressItem.getFormat());
            }
            if (TextUtils.isEmpty(strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) || strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.contains("<!DOCTYPE html>") || strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.trim().startsWith("<html>")) {
                return null;
            }
            return strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        } catch (Exception e) {
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(e, new StringBuilder("网络数据请求出错"), 1);
            return null;
        }
    }

    public static void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(AddressItem addressItem) {
        if (TextUtils.isEmpty(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(addressItem))) {
            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, addressItem.getLiveUrlName() + " XML数据获取为空");
        }
    }
}
