package O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f1373O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final HashMap f1374O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new HashMap();

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(ArrayList arrayList, Date date) {
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList, new O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(2));
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) arrayList.get(0);
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) arrayList.get(arrayList.size() - 1);
        if (!o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f893O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.equals("00:00")) {
            arrayList.add(0, new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(date, "精彩节目", "00:00", o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f893O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, "暂无描述信息"));
        }
        if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.f894O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.equals("00:00")) {
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(date, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.f893O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, "23:59");
        }
        if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.f897O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo > o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.f898O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(date, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.f893O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, "23:59");
        }
        if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.f894O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.equals("23:59")) {
            return;
        }
        arrayList.add(new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(date, "精彩节目", o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.f894O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, "23:59", "暂无描述信息"));
    }

    public static O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        if (f1373O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null) {
            synchronized (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.class) {
                try {
                    if (f1373O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == null) {
                        f1373O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f1373O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public static String O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(ArrayList arrayList, String str, Date date, String str2) {
        String string;
        if (!str.contains("epg_data")) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(str.trim());
            if (jSONObject.has("icon")) {
                string = jSONObject.getString("icon");
                try {
                    O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.f1563O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.put(str2.toLowerCase(), string);
                } catch (JSONException unused) {
                    return string;
                }
            } else {
                string = null;
            }
            if (!jSONObject.has("epg_data")) {
                return "";
            }
            JSONArray jSONArray = jSONObject.getJSONArray("epg_data");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String strOptString = jSONObject2.optString("title", null);
                String strOptString2 = jSONObject2.optString(TtmlNode.START, null);
                String strOptString3 = jSONObject2.optString(TtmlNode.END, null);
                String strOptString4 = jSONObject2.optString("desc", null);
                if (TextUtils.isEmpty(strOptString4)) {
                    strOptString4 = "暂无描述信息";
                }
                String str3 = strOptString4;
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3)) {
                    arrayList.add(new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(date, strOptString, strOptString2, strOptString3, str3));
                }
            }
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(arrayList, date);
            return string;
        } catch (JSONException unused2) {
            return null;
        }
    }
}
