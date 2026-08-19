package O00000OOoOOO00O00o0ooooooooO000ooooO0000;

import O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oooOoo00ooo0O0000000o00O0Oooo0OOO {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final Bitmap.Config[] f431O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static final Bitmap.Config[] f432O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public static final Bitmap.Config[] f433O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public static final Bitmap.Config[] f434O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public static final Bitmap.Config[] f435O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f436O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(1);

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f437O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(3);

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final HashMap f438O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f431O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = configArr;
        f432O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = configArr;
        f433O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f434O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f435O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.remove(num);
                return;
            } else {
                navigableMapO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    public final Bitmap O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(config) * i * i2;
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f436O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) ((ArrayDeque) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f401O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).poll();
        if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
        }
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f429O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f430O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i3 = O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f427O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[config.ordinal()];
            if (i3 == 1) {
                configArr = f431O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            } else if (i3 == 2) {
                configArr = f433O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
            } else if (i3 != 3) {
                configArr = i3 != 4 ? new Bitmap.Config[]{config} : f435O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
            } else {
                configArr = f434O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            }
        } else {
            configArr = f432O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        }
        for (Bitmap.Config config2 : configArr) {
            Integer num = (Integer) O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(config2).ceilingKey(Integer.valueOf(iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo));
            if (num != null && num.intValue() <= iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo * 8) {
                if (num.intValue() == iO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
                int iIntValue = num.intValue();
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) ((ArrayDeque) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f401O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).poll();
                if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 == null) {
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
                }
                o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo2;
                o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f429O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = iIntValue;
                o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f430O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = config2;
                break;
            }
        }
        Bitmap bitmap = (Bitmap) this.f437O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
        if (bitmap != null) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Integer.valueOf(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f429O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    public final NavigableMap O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Bitmap.Config config) {
        HashMap map = this.f438O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Bitmap bitmap) {
        int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f436O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) ((ArrayDeque) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f401O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).poll();
        if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
        }
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f429O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f430O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = config;
        this.f437O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, bitmap);
        NavigableMap navigableMapO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(bitmap.getConfig());
        Integer num = (Integer) navigableMapO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(Integer.valueOf(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f429O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
        navigableMapO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.put(Integer.valueOf(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f429O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O("SizeConfigStrategy{groupedMap=");
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(this.f437O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(", sortedSizes=(");
        HashMap map = this.f438O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        for (Map.Entry entry : map.entrySet()) {
            sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(entry.getKey());
            sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append('[');
            sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(entry.getValue());
            sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append("], ");
        }
        if (!map.isEmpty()) {
            sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.replace(sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.length() - 2, sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.length(), "");
        }
        sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.append(")}");
        return sbO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.toString();
    }
}
