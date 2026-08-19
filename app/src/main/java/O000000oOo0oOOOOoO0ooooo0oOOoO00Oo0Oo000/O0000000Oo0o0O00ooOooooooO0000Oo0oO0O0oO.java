package O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.orhanobut.hawk.Hawk;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    public static float O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static View O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup2, z);
    }

    public static Object O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(List list, int i) {
        return list.get(list.size() - i);
    }

    public static String O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    public static String O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(int i, String str) {
        return str + i;
    }

    public static String O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Class cls, String str) {
        return str + cls;
    }

    public static String O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(String str, long j) {
        return str + j;
    }

    public static String O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(String str, String str2) {
        return str + str2;
    }

    public static String O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(StringBuilder sb, char c, String str) {
        sb.append(c);
        String string = sb.toString();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(string, str);
        return string;
    }

    public static String O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(StringBuilder sb, String str, int i) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder O00000OOoOOO00O00o0ooooooooO000ooooO0000(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(CharSequence charSequence, String str, CharSequence charSequence2, String str2, CharSequence charSequence3) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(charSequence, str);
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(charSequence2, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence3);
        return sb;
    }

    public static StringBuilder O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(CharSequence charSequence, String str, Function1 function1, String str2, CharSequence charSequence2) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(charSequence, str);
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(function1, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        return sb;
    }

    public static StringBuilder O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(CharSequence charSequence, String str, Function2 function2, String str2, CharSequence charSequence2) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(charSequence, str);
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(function2, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        return sb;
    }

    public static StringBuilder O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(int i, int i2, Function1 function1) {
        function1.invoke(Integer.valueOf(i + i2));
    }

    public static void O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(Exception exc, StringBuilder sb, int i) {
        sb.append(exc.getMessage());
        O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(i, sb.toString());
    }

    public static void O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(String str, boolean z) {
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
        Hawk.put(str, Boolean.valueOf(z));
    }

    public static String O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(String str, String str2) {
        return str + str2;
    }

    public static String O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static void O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(int i, String tag, String message, Throwable th) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(tag, "tag");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(message, "message");
        if (th != null) {
            if (i == 10) {
                Log.v(tag, message.toString(), th);
                return;
            }
            if (i == 20) {
                Log.d(tag, message.toString(), th);
                return;
            }
            if (i == 30) {
                Log.i(tag, message.toString(), th);
                return;
            } else if (i == 40) {
                Log.w(tag, message.toString(), th);
                return;
            } else {
                if (i != 50) {
                    return;
                }
                Log.e(tag, message.toString(), th);
                return;
            }
        }
        if (i == 10) {
            Log.v(tag, message.toString());
            return;
        }
        if (i == 20) {
            Log.d(tag, message.toString());
            return;
        }
        if (i == 30) {
            Log.i(tag, message.toString());
        } else if (i == 40) {
            Log.w(tag, message.toString());
        } else {
            if (i != 50) {
                return;
            }
            Log.e(tag, message.toString());
        }
    }
}
