package O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;

import android.content.Context;
import android.net.Uri;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.dialog.O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo;
import com.orhanobut.hawk.Hawk;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.fourthline.cling.model.ServiceReference;

/* JADX INFO: loaded from: classes.dex */
public final class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final HashMap f1419O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new HashMap();

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final LivePlayActivity f1420O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public String f1421O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public boolean f1422O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;

    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(LivePlayActivity livePlayActivity) {
        this.f1420O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = livePlayActivity;
        Context applicationContext = livePlayActivity.getApplicationContext();
        if (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1383O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null) {
            synchronized (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.class) {
                try {
                    if (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1383O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null) {
                        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
                        o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1386O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = applicationContext;
                        if (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1385O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
                            O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(new O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(17));
                        }
                        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1383O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(applicationContext);
    }

    public static String O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str, String str2) {
        Uri uri = Uri.parse(str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add("'url' : '" + str2 + "'");
        for (String str3 : uri.getQueryParameterNames()) {
            arrayList.add("'" + str3 + "' : '" + uri.getQueryParameter(str3) + "'");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) ",");
            }
        }
        return str + "\nmain({" + sb.toString() + "});";
    }

    public static String O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String str, String str2) {
        try {
            O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
            if (!((Boolean) Hawk.get("远程调试", Boolean.FALSE)).booleanValue()) {
                return "远程调试未开启";
            }
            if (str2 != null) {
                return O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1383O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(str2, str), "main", true);
            }
            String str3 = str.split("/ku9/js/|ku9/py/")[1];
            int iIndexOf = str3.indexOf(".");
            String strSubstring = iIndexOf != -1 ? str3.substring(0, iIndexOf) : null;
            if (str.contains("/ku9/js/")) {
                File file = new File(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1324O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 + ServiceReference.DELIMITER + strSubstring + ".js");
                if (!file.exists() || !file.isFile()) {
                    return "未找到该js文件";
                }
            }
            return O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1383O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000("file:///" + O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1324O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 + ServiceReference.DELIMITER + strSubstring + ".js", null), str), strSubstring, true);
        } catch (Exception e) {
            return String.format("脚本文件运行出错:\n" + e.getMessage(), new Object[0]);
        }
    }

    public final String O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(String str) {
        String strO00000OOoOOO00O00o0ooooooooO000ooooO0000;
        try {
            if (((Boolean) Hawk.get("脚本缓存", Boolean.valueOf(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1471O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo))).booleanValue()) {
                HashMap map = f1419O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                if (map.containsKey(this.f1421O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) {
                    strO00000OOoOOO00O00o0ooooooooO000ooooO0000 = (String) map.get(this.f1421O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                } else {
                    String strO00000OOoOOO00O00o0ooooooooO000ooooO0001 = O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(this.f1421O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, null);
                    map.put(this.f1421O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, strO00000OOoOOO00O00o0ooooooooO000ooooO0001);
                    strO00000OOoOOO00O00o0ooooooooO000ooooO0000 = strO00000OOoOOO00O00o0ooooooooO000ooooO0001;
                }
            } else {
                strO00000OOoOOO00O00o0ooooooooO000ooooO0000 = O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(this.f1421O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, null);
            }
            return O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1383O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(strO00000OOoOOO00O00o0ooooooooO000ooooO0000, str), O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO("JsName"), false);
        } catch (Exception e) {
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(e, new StringBuilder("JS脚本文件运行出错: "), 1);
            return null;
        }
    }
}
