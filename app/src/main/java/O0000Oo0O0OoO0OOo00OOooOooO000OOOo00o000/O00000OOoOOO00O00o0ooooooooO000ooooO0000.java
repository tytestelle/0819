package O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.io.File;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes.dex */
public final class O00000OOoOOO00O00o0ooooooooO000ooooO0000 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final HashMap f1423O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new HashMap();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final HashMap f1424O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new HashMap();

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final HashMap f1425O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new HashMap();

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(File file) {
        HashMap map = f1424O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        map.clear();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            String name = file2.getName();
            int iLastIndexOf = name.lastIndexOf(".");
            if (iLastIndexOf > 0) {
                name = name.substring(0, iLastIndexOf);
            }
            if (!map.containsKey(name.toLowerCase())) {
                map.put(name.toLowerCase(), file2.getAbsolutePath());
            }
        }
    }

    public static void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(File file, String str) {
        try {
            String str2 = str + "/epg_data.json";
            File file2 = new File(str2);
            if (file2.exists() || file2.isDirectory()) {
                String strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(str2);
                if (strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isEmpty()) {
                    return;
                }
                HashMap map = f1423O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                map.clear();
                for (JsonElement jsonElement : ((JsonObject) new Gson().fromJson(strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Type) JsonObject.class)).get("epgs").getAsJsonArray()) {
                    if (!jsonElement.isJsonObject()) {
                        O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "本地epg_date.json格式错误");
                        return;
                    }
                    JsonObject asJsonObject = jsonElement.getAsJsonObject();
                    String str3 = "";
                    String asString = (!asJsonObject.has("logo") || asJsonObject.get("logo").isJsonNull()) ? "" : asJsonObject.get("logo").getAsString();
                    if (!"".equals(asString)) {
                        str3 = asString.trim().startsWith("http") ? asString : file + ServiceReference.DELIMITER + asString.trim() + ".png";
                    }
                    for (String str4 : asJsonObject.get("name").getAsString().trim().split(",")) {
                        map.put(str4.toLowerCase(), str3);
                        f1425O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.put(str4.toLowerCase(), asJsonObject);
                    }
                }
            }
        } catch (JsonSyntaxException e) {
            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "本地epg_date.json格式错误" + e.getMessage());
        }
    }
}
