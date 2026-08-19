package O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 implements O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Map f497O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = Collections.unmodifiableMap(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f494O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public volatile Map f498O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public final HashMap O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f497O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) list.get(i)).f496O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final Map O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        if (this.f498O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
            synchronized (this) {
                try {
                    if (this.f498O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                        this.f498O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = Collections.unmodifiableMap(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f498O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) {
            return this.f497O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.equals(((O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) obj).f497O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
        return false;
    }

    public final int hashCode() {
        return this.f497O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f497O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + '}';
    }
}
