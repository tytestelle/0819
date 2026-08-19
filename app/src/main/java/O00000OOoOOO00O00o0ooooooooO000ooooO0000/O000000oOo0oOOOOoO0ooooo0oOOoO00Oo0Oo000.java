package O00000OOoOOO00O00o0ooooooooO000ooooO0000;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f411O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(3);

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f412O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(0);

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final HashMap f413O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new HashMap();

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final HashMap f414O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new HashMap();

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final int f415O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public int f416O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i) {
        this.f415O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i;
    }

    public final synchronized void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(0);
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i, Class cls) {
        NavigableMap navigableMapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(cls);
        Integer num = (Integer) navigableMapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i) {
        while (this.f416O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO > i) {
            Object objO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = this.f411O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo();
            O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(objO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo);
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(objO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.getClass());
            this.f416O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO -= o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() * o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(objO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo);
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(objO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo), objO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.getClass());
            if (Log.isLoggable(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(), 2)) {
                Log.v(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(), "evicted: " + o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(objO00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo));
            }
        }
    }

    public final synchronized Object O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(int i, Class cls) {
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        int i2;
        try {
            Integer num = (Integer) O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i2 = this.f416O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) != 0 && this.f415O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 / i2 < 2 && num.intValue() > i * 8)) {
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f412O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) ((ArrayDeque) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f401O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).poll();
                if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                }
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f408O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f409O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = cls;
            } else {
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = this.f412O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                int iIntValue = num.intValue();
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) ((ArrayDeque) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.f401O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).poll();
                if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 == null) {
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                }
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2;
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f408O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = iIntValue;
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f409O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, cls);
    }

    public final O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Class cls) {
        HashMap map = this.f414O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) map.get(cls);
        if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
            if (cls.equals(int[].class)) {
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(1);
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
                }
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(0);
            }
            map.put(cls, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        }
        return o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    public final Object O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, Class cls) {
        Object obj;
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(cls);
        Object objO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f411O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        if (objO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != null) {
            this.f416O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO -= o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() * o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(objO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
            O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(objO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00), cls);
        }
        if (objO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != null) {
            return objO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        }
        if (Log.isLoggable(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(), 2)) {
            Log.v(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(), "Allocated " + o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f408O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + " bytes");
        }
        int i = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f408O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        switch (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f402O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                obj = new byte[i];
                break;
            default:
                obj = new int[i];
                break;
        }
        return obj;
    }

    public final NavigableMap O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Class cls) {
        HashMap map = this.f413O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Object obj) {
        Class<?> cls = obj.getClass();
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(cls);
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj);
        int iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() * iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO <= this.f415O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 / 2) {
            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f412O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) ((ArrayDeque) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f401O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).poll();
            if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
            }
            O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f408O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f409O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = cls;
            this.f411O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, obj);
            NavigableMap navigableMapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(cls);
            Integer num = (Integer) navigableMapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.get(Integer.valueOf(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f408O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
            Integer numValueOf = Integer.valueOf(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f408O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.put(numValueOf, Integer.valueOf(iIntValue));
            this.f416O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO += iO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f415O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        }
    }

    public final synchronized void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(int i) {
        try {
            if (i >= 40) {
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            } else if (i >= 20 || i == 15) {
                O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f415O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
