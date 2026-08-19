package O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

import com.google.gson.JsonObject;
import java.util.HashMap;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static JsonObject f1371O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final HashMap f1372O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new HashMap();

    public static String[] O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str, HashMap map) {
        try {
            JsonObject jsonObject = (JsonObject) map.get(str);
            if (jsonObject == null) {
                return null;
            }
            String asString = (!jsonObject.has("logo") || jsonObject.get("logo").isJsonNull()) ? "" : jsonObject.get("logo").getAsString();
            if ("".equals(asString)) {
                asString = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1326O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 + ServiceReference.DELIMITER + str + ".png";
            } else if (!asString.startsWith("http")) {
                asString = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1326O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 + ServiceReference.DELIMITER + asString + ".png";
            }
            return new String[]{asString, jsonObject.get("epgid").getAsString()};
        } catch (Exception unused) {
            return new String[]{"", ""};
        }
    }

    public static String[] O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String str) {
        String lowerCase = str.toLowerCase();
        try {
            HashMap map = O00000OOoOOO00O00o0ooooooooO000ooooO0000.f1425O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (map.containsKey(lowerCase)) {
                return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(lowerCase, map);
            }
            HashMap map2 = f1372O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (map2.containsKey(lowerCase)) {
                return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(lowerCase, map2);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
