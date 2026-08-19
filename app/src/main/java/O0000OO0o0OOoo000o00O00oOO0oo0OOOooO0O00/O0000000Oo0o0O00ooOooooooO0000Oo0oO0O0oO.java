package O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;

import O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
import O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import android.text.TextUtils;
import com.github.catvod.crawler.JarLoader;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.orhanobut.hawk.Hawk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public static O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f874O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ArrayList f875O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new ArrayList();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public ArrayList f876O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ArrayList();

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final ArrayList f877O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new ArrayList();

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final ArrayList f878O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new ArrayList();

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final JarLoader f879O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new JarLoader();

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public JsonArray f880O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public JsonArray f881O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public JsonArray f882O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public JsonArray f883O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public JsonArray f884O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    public static O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        if (f874O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O == null) {
            synchronized (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.class) {
                try {
                    if (f874O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O == null) {
                        f874O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f874O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
    }

    public static int O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i, String str) {
        try {
            return TextUtils.isEmpty(str) ? i : Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static String O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(String str) {
        if (TextUtils.isEmpty(str) || str.equals("null")) {
            return null;
        }
        return str;
    }

    public static void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, String[] strArr) {
        HashMap map = new HashMap();
        for (String str : strArr) {
            Matcher matcher = Pattern.compile("([^=]+)=(.*)").matcher(str);
            if (matcher.find()) {
                map.put(matcher.group(1), matcher.group(2));
            }
        }
        int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(-1, map.containsKey("DE") ? (String) map.get("DE") : null);
        if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o < 0 || iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o > 4) {
            iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = -1;
        }
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f913O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(-1, map.containsKey("SC") ? (String) map.get("SC") : null);
        if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 < 0 || iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 > 5) {
            iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = -1;
        }
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f914O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2;
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f917O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(map.containsKey("HEADERS") ? (String) map.get("HEADERS") : null);
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f915O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(map.containsKey("JS") ? (String) map.get("JS") : null);
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f916O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(map.containsKey("PY") ? (String) map.get("PY") : null);
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f918O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(map.containsKey("PB") ? (String) map.get("PB") : null);
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f919O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(map.containsKey("HOST") ? (String) map.get("HOST") : null);
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f920O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(0, map.containsKey("PBO") ? (String) map.get("PBO") : null);
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f921O00000OOoOOO00O00o0ooooooooO000ooooO0000 = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(-1, map.containsKey("IJKAD") ? (String) map.get("IJKAD") : null);
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f922O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(-1, map.containsKey("EXOBM") ? (String) map.get("EXOBM") : null);
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f923O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(-1, map.containsKey("MPVAD") ? (String) map.get("MPVAD") : null);
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f924O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(0, map.containsKey("TSO") ? (String) map.get("TSO") : null);
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(ArrayList arrayList) {
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f904O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = "我的收藏";
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f907O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = "我的收藏";
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f909O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = arrayList;
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f928O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        this.f876O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.add(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f905O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f876O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O()) {
            return;
        }
        this.f875O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.add(0, o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
    }

    public final ArrayList O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(int i) {
        if (i != -1) {
            ArrayList arrayList = this.f875O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (arrayList.size() > i) {
                return ((O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) arrayList.get(i)).f905O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            }
        }
        return new ArrayList();
    }

    public final ArrayList O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(int i, int i2) {
        if (i == -1 || i2 == -1) {
            return new ArrayList();
        }
        ArrayList arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(i);
        return arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.size() > i2 ? ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(i2)).f909O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo : new ArrayList();
    }

    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(JsonArray jsonArray, int i) {
        if (i == 0) {
            JsonArray jsonArray2 = new JsonArray();
            this.f880O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = jsonArray2;
            jsonArray2.addAll(jsonArray);
            return;
        }
        if (i == 1) {
            JsonArray jsonArray3 = new JsonArray();
            this.f881O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = jsonArray3;
            jsonArray3.addAll(jsonArray);
            return;
        }
        if (i == 2) {
            JsonArray jsonArray4 = new JsonArray();
            this.f882O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = jsonArray4;
            jsonArray4.addAll(jsonArray);
        } else if (i == 3) {
            JsonArray jsonArray5 = new JsonArray();
            this.f883O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = jsonArray5;
            jsonArray5.addAll(jsonArray);
        } else {
            if (i != 4) {
                return;
            }
            JsonArray jsonArray6 = new JsonArray();
            this.f884O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = jsonArray6;
            jsonArray6.addAll(jsonArray);
        }
    }

    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean] */
    public final void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo() {
        JsonArray jsonArray = new JsonArray();
        JsonArray jsonArray2 = this.f880O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (jsonArray2 != null) {
            jsonArray.addAll(jsonArray2);
        }
        JsonArray jsonArray3 = this.f883O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        if (jsonArray3 != null) {
            jsonArray.addAll(jsonArray3);
        }
        JsonArray jsonArray4 = this.f881O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        if (jsonArray4 != null) {
            jsonArray.addAll(jsonArray4);
        }
        JsonArray jsonArray5 = this.f884O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        if (jsonArray5 != null) {
            jsonArray.addAll(jsonArray5);
        }
        JsonArray jsonArray6 = this.f882O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        if (jsonArray6 != null) {
            jsonArray.addAll(jsonArray6);
        }
        synchronized (this) {
            try {
                this.f875O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.clear();
                this.f876O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.clear();
                this.f877O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.clear();
                this.f878O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.clear();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator<JsonElement> it = jsonArray.iterator();
                boolean z = false;
                int i = 0;
                while (it.hasNext()) {
                    JsonElement next = it.next();
                    O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                    int size = this.f875O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.size();
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f905O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ArrayList();
                    String strTrim = ((JsonObject) next).get("largeGroup").getAsString().trim();
                    boolean asBoolean = ((JsonObject) next).get("isLocalData").getAsBoolean();
                    int i2 = 2;
                    o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f904O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (asBoolean || O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() < 2) ? strTrim.split("_", 2)[z ? 1 : 0] : strTrim;
                    Iterator<JsonElement> it2 = ((JsonObject) next).get("group").getAsJsonArray().iterator();
                    boolean r4 = z;
                    while (it2.hasNext()) {
                        JsonElement next2 = it2.next();
                        int size2 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f905O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.size();
                        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f909O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new ArrayList();
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f906O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = size2;
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f927O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = asBoolean;
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f928O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        String[] strArrSplit = ((JsonObject) next2).get("groupName").getAsString().trim().split("_", i2);
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f907O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = strArrSplit[r4];
                        if (strArrSplit.length > 1) {
                            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f908O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = strArrSplit[1];
                        } else {
                            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f908O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = "";
                        }
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f925O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = r4;
                        JsonElement jsonElement = ((JsonObject) next2).get("has_local_video_path");
                        JsonElement jsonElement2 = ((JsonObject) next2).get("has_tmp_channels");
                        Iterator<JsonElement> it3 = it;
                        Iterator<JsonElement> it4 = ((JsonObject) next2).get("groupChannels").getAsJsonArray().iterator();
                        while (it4.hasNext()) {
                            JsonElement next3 = it4.next();
                            Iterator<JsonElement> it5 = it4;
                            int size3 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f909O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.size();
                            JsonObject jsonObject = (JsonObject) next3;
                            Iterator<JsonElement> it6 = it2;
                            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                            JsonElement jsonElement3 = next2;
                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f940O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = 0;
                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f941O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = 0;
                            String strTrim2 = jsonObject.get("channelName").getAsString().trim();
                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f937O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = strTrim2;
                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f935O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = size3;
                            int i3 = i + 1;
                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f936O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i3;
                            JsonElement jsonElement4 = jsonObject.get("m3uLogoUrl");
                            if (jsonElement4 != null && !jsonElement4.isJsonNull()) {
                                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f950O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = jsonElement4.getAsString().trim();
                            }
                            JsonElement jsonElement5 = jsonObject.get("catchup_source");
                            if (jsonElement5 != null && !jsonElement5.isJsonNull()) {
                                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f947O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = jsonElement5.getAsString().trim();
                            }
                            JsonElement jsonElement6 = jsonObject.get("catchup");
                            if (jsonElement6 != null && !jsonElement6.isJsonNull()) {
                                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f948O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = jsonElement6.getAsString().trim();
                            }
                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f934O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = size;
                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f949O00000OOoOOO00O00o0ooooooooO000ooooO0000 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f946O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = (jsonElement == null || jsonElement.isJsonNull()) ? false : true;
                            StringBuilder sb = new StringBuilder();
                            sb.append("FAVOR/");
                            sb.append(asBoolean);
                            sb.append("-");
                            sb.append(strTrim);
                            sb.append("-");
                            int i4 = size;
                            sb.append(strArrSplit[0]);
                            sb.append("-");
                            sb.append(strTrim2);
                            String string = sb.toString();
                            O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                            Boolean bool = Boolean.FALSE;
                            o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f942O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = ((Boolean) Hawk.get(string, bool)).booleanValue();
                            ArrayList arrayListO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(jsonObject);
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it7 = arrayListO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.iterator();
                            int i5 = 1;
                            while (it7.hasNext()) {
                                Iterator it8 = it7;
                                JsonElement jsonElement7 = jsonElement;
                                String[] strArrSplit2 = ((String) it7.next()).split("\\$", 2);
                                arrayList4.add(strArrSplit2[0]);
                                if (strArrSplit2.length > 1) {
                                    arrayList3.add(strArrSplit2[1]);
                                } else {
                                    arrayList3.add("源" + i5);
                                }
                                i5++;
                                it7 = it8;
                                jsonElement = jsonElement7;
                            }
                            JsonElement jsonElement8 = jsonElement;
                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f938O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = arrayList3;
                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f939O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = arrayList4;
                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f941O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = arrayList4.size();
                            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f909O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.add(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                            if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f942O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                                arrayList.add(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                            }
                            if (jsonElement2 != null && !jsonElement2.isJsonNull()) {
                                arrayList2.add(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                            }
                            it4 = it5;
                            it2 = it6;
                            next2 = jsonElement3;
                            i = i3;
                            size = i4;
                            jsonElement = jsonElement8;
                        }
                        Iterator<JsonElement> it9 = it2;
                        int i6 = size;
                        JsonElement jsonElement9 = next2;
                        String str = "GROUP_ID/" + asBoolean + "-" + strTrim + "-" + strArrSplit[0];
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f926O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = str;
                        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2 = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                        Boolean bool2 = Boolean.FALSE;
                        o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2.getClass();
                        boolean zBooleanValue = ((Boolean) Hawk.get(str, bool2)).booleanValue();
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f910O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = zBooleanValue;
                        if (!zBooleanValue && !o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f909O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.isEmpty()) {
                            o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f905O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.add(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                        }
                        String strTrim3 = "";
                        String str2 = "GROUP_CONFIG/" + asBoolean + "-" + strTrim + "-" + strArrSplit[0];
                        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                        String str3 = (String) Hawk.get(str2, null);
                        if (str3 == null) {
                            JsonElement jsonElement10 = ((JsonObject) jsonElement9).get("groupConfigs");
                            if (jsonElement10 != null && !jsonElement10.isJsonNull()) {
                                strTrim3 = jsonElement10.getAsString().trim();
                            }
                            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f912O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = strTrim3;
                            str3 = strTrim3;
                        }
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f911O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = str3;
                        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, str3.split("#"));
                        if (!o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f909O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.isEmpty()) {
                            this.f877O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.add(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                        }
                        it = it3;
                        it2 = it9;
                        size = i6;
                        r4 = 0;
                        i2 = 2;
                    }
                    Iterator<JsonElement> it10 = it;
                    if (!o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f905O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isEmpty()) {
                        this.f875O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.add(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    }
                    it = it10;
                    z = false;
                }
                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2.f904O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = "推送频道";
                O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1.f907O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = "精彩视频";
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1.f909O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = arrayList2;
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1.f928O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2;
                this.f878O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.add(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1);
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
