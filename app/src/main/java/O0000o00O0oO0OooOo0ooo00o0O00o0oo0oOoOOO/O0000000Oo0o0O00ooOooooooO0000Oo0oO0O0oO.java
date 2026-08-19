package O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static String O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String str, LinkedHashMap linkedHashMap) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (str.indexOf(38) > 0 || str.indexOf(63) > 0) {
                sb.append("&");
            } else {
                sb.append("?");
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    String strEncode = URLEncoder.encode((String) it.next(), "UTF-8");
                    sb.append((String) entry.getKey());
                    sb.append("=");
                    sb.append(strEncode);
                    sb.append("&");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return str;
        }
    }
}
