package O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ArrayList f2101O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new ArrayList();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final HashMap f2102O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new HashMap();

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final HashMap f2103O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new HashMap();

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final StringBuilder f2104O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new StringBuilder(128);

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public Class f2105O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public boolean f2106O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public final boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Method method, Class cls) {
        StringBuilder sb = this.f2104O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        sb.setLength(0);
        sb.append(method.getName());
        sb.append('>');
        sb.append(cls.getName());
        String string = sb.toString();
        Class<?> declaringClass = method.getDeclaringClass();
        HashMap map = this.f2103O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        Class cls2 = (Class) map.put(string, declaringClass);
        if (cls2 == null || cls2.isAssignableFrom(declaringClass)) {
            return true;
        }
        map.put(string, cls2);
        return false;
    }
}
