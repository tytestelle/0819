package O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Method f2095O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final ThreadMode f2096O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Class f2097O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final int f2098O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final boolean f2099O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public String f2100O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(Method method, Class cls, ThreadMode threadMode, int i, boolean z) {
        this.f2095O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = method;
        this.f2096O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = threadMode;
        this.f2097O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = cls;
        this.f2098O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = i;
        this.f2099O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = z;
    }

    public final synchronized void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        if (this.f2100O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f2095O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f2095O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getName());
            sb.append('(');
            sb.append(this.f2097O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getName());
            this.f2100O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O000000oooOoo00ooo0O0000000o00O0Oooo0OOO)) {
            return false;
        }
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = (O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) obj;
        o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        return this.f2100O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.equals(o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f2100O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
    }

    public final int hashCode() {
        return this.f2095O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.hashCode();
    }
}
