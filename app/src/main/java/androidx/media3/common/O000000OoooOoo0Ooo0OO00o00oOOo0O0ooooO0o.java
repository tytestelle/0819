package androidx.media3.common;

import androidx.media3.common.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {
    public static int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static String O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static String O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(String str, Exception exc) {
        return str + exc;
    }

    public static void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(int i, String str, String str2) {
        Log.w(str2, str + i);
    }

    public static void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static /* synthetic */ void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(String str, String str2, String str3) {
        Log.w(str3, str + str2);
    }
}
