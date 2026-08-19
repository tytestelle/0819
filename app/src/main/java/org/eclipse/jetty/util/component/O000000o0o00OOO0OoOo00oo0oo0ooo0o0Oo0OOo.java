package org.eclipse.jetty.util.component;

import java.lang.ref.WeakReference;
import java.util.Properties;
import java.util.concurrent.CopyOnWriteArrayList;
import org.eclipse.jetty.util.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f4490O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final CopyOnWriteArrayList f4491O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new CopyOnWriteArrayList();

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f4490O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.class.getName());
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, Object obj, String str) {
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4490O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo()) {
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Container " + o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO + " + " + obj + " as " + str, new Object[0]);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4491O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (copyOnWriteArrayList != null) {
            new WeakReference(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
            new WeakReference(obj);
            if (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size(copyOnWriteArrayList) <= 0) {
                return;
            }
            O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.get(copyOnWriteArrayList, 0).getClass();
            throw new ClassCastException();
        }
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4491O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (copyOnWriteArrayList == null || O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size(copyOnWriteArrayList) <= 0) {
            return;
        }
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.get(copyOnWriteArrayList, 0).getClass();
        throw new ClassCastException();
    }

    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, Object obj, String str) {
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) f4490O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo()) {
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Container " + o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO + " - " + obj + " as " + str, new Object[0]);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4491O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (copyOnWriteArrayList != null) {
            new WeakReference(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
            new WeakReference(obj);
            if (O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size(copyOnWriteArrayList) <= 0) {
                return;
            }
            O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.get(copyOnWriteArrayList, 0).getClass();
            throw new ClassCastException();
        }
    }

    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4491O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (copyOnWriteArrayList == null || O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.size(copyOnWriteArrayList) <= 0) {
            return;
        }
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.get(copyOnWriteArrayList, 0).getClass();
        throw new ClassCastException();
    }

    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, Object obj, Object obj2, String str, boolean z) {
        if (obj != null && !obj.equals(obj2)) {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, obj, str);
            if (z) {
                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
            }
        }
        if (obj2 == null || obj2.equals(obj)) {
            return;
        }
        if (z) {
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        }
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, obj2, str);
    }

    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O000O000O00OO0Oooo0o0O00OoOoOo00O0oOooOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, Object[] objArr, Object[] objArr2, String str, boolean z) {
        Object[] objArr3 = null;
        if (objArr2 != null) {
            Object[] objArr4 = new Object[objArr2.length];
            int length = objArr2.length;
            while (true) {
                int i = length - 1;
                if (length <= 0) {
                    break;
                }
                boolean z2 = true;
                if (objArr != null) {
                    int length2 = objArr.length;
                    while (true) {
                        length2--;
                        if (length2 <= 0) {
                            break;
                        }
                        Object obj = objArr2[i];
                        if (obj != null && obj.equals(objArr[length2])) {
                            objArr[length2] = null;
                            z2 = false;
                        }
                    }
                }
                if (z2) {
                    objArr4[i] = objArr2[i];
                }
                length = i;
            }
            objArr3 = objArr4;
        }
        if (objArr != null) {
            int length3 = objArr.length;
            while (true) {
                int i2 = length3 - 1;
                if (length3 <= 0) {
                    break;
                }
                Object obj2 = objArr[i2];
                if (obj2 != null) {
                    O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, obj2, str);
                    if (z) {
                        Object obj3 = objArr[i2];
                        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                    }
                }
                length3 = i2;
            }
        }
        if (objArr3 != null) {
            for (int i3 = 0; i3 < objArr3.length; i3++) {
                if (objArr3[i3] != null) {
                    if (z) {
                        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                    }
                    O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, objArr3[i3], str);
                }
            }
        }
    }
}
