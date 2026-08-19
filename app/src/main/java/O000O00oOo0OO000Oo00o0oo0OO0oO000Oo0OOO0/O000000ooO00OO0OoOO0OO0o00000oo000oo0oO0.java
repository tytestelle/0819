package O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final ArrayList f2088O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new ArrayList();

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public Object f2089O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 f2090O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 f2091O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public static O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, Object obj) {
        ArrayList arrayList = f2088O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                if (size <= 0) {
                    O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0();
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f2089O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = obj;
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f2090O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                    return o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                }
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1 = (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) arrayList.remove(size - 1);
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1.f2089O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = obj;
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1.f2090O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1.f2091O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
                return o000000ooO00OO0OoOO0OO0o00000oo000oo0oO1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
