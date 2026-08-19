package org.eclipse.jetty.util;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ int f4478O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.class.getName());
        HashMap map = new HashMap();
        Class cls = Boolean.TYPE;
        map.put(TypedValues.Custom.S_BOOLEAN, cls);
        Class cls2 = Byte.TYPE;
        map.put("byte", cls2);
        Class cls3 = Character.TYPE;
        map.put("char", cls3);
        Class cls4 = Double.TYPE;
        map.put("double", cls4);
        Class cls5 = Float.TYPE;
        map.put(TypedValues.Custom.S_FLOAT, cls5);
        Class cls6 = Integer.TYPE;
        map.put("int", cls6);
        Class cls7 = Long.TYPE;
        map.put("long", cls7);
        Class cls8 = Short.TYPE;
        map.put("short", cls8);
        Class cls9 = Void.TYPE;
        map.put("void", cls9);
        map.put("java.lang.Boolean.TYPE", cls);
        map.put("java.lang.Byte.TYPE", cls2);
        map.put("java.lang.Character.TYPE", cls3);
        map.put("java.lang.Double.TYPE", cls4);
        map.put("java.lang.Float.TYPE", cls5);
        map.put("java.lang.Integer.TYPE", cls6);
        map.put("java.lang.Long.TYPE", cls7);
        map.put("java.lang.Short.TYPE", cls8);
        map.put("java.lang.Void.TYPE", cls9);
        map.put("java.lang.Boolean", Boolean.class);
        map.put("java.lang.Byte", Byte.class);
        map.put("java.lang.Character", Character.class);
        map.put("java.lang.Double", Double.class);
        map.put("java.lang.Float", Float.class);
        map.put("java.lang.Integer", Integer.class);
        map.put("java.lang.Long", Long.class);
        map.put("java.lang.Short", Short.class);
        map.put("Boolean", Boolean.class);
        map.put("Byte", Byte.class);
        map.put("Character", Character.class);
        map.put("Double", Double.class);
        map.put("Float", Float.class);
        map.put("Integer", Integer.class);
        map.put("Long", Long.class);
        map.put("Short", Short.class);
        map.put(null, cls9);
        map.put(TypedValues.Custom.S_STRING, String.class);
        map.put("String", String.class);
        map.put("java.lang.String", String.class);
        HashMap map2 = new HashMap();
        map2.put(cls, TypedValues.Custom.S_BOOLEAN);
        map2.put(cls2, "byte");
        map2.put(cls3, "char");
        map2.put(cls4, "double");
        map2.put(cls5, TypedValues.Custom.S_FLOAT);
        map2.put(cls6, "int");
        map2.put(cls7, "long");
        map2.put(cls8, "short");
        map2.put(cls9, "void");
        map2.put(Boolean.class, "java.lang.Boolean");
        map2.put(Byte.class, "java.lang.Byte");
        map2.put(Character.class, "java.lang.Character");
        map2.put(Double.class, "java.lang.Double");
        map2.put(Float.class, "java.lang.Float");
        map2.put(Integer.class, "java.lang.Integer");
        map2.put(Long.class, "java.lang.Long");
        map2.put(Short.class, "java.lang.Short");
        map2.put(null, "void");
        map2.put(String.class, "java.lang.String");
        HashMap map3 = new HashMap();
        try {
            Class[] clsArr = {String.class};
            map3.put(cls, Boolean.class.getMethod("valueOf", clsArr));
            map3.put(cls2, Byte.class.getMethod("valueOf", clsArr));
            map3.put(cls4, Double.class.getMethod("valueOf", clsArr));
            map3.put(cls5, Float.class.getMethod("valueOf", clsArr));
            map3.put(cls6, Integer.class.getMethod("valueOf", clsArr));
            map3.put(cls7, Long.class.getMethod("valueOf", clsArr));
            map3.put(cls8, Short.class.getMethod("valueOf", clsArr));
            map3.put(Boolean.class, Boolean.class.getMethod("valueOf", clsArr));
            map3.put(Byte.class, Byte.class.getMethod("valueOf", clsArr));
            map3.put(Double.class, Double.class.getMethod("valueOf", clsArr));
            map3.put(Float.class, Float.class.getMethod("valueOf", clsArr));
            map3.put(Integer.class, Integer.class.getMethod("valueOf", clsArr));
            map3.put(Long.class, Long.class.getMethod("valueOf", clsArr));
            map3.put(Short.class, Short.class.getMethod("valueOf", clsArr));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public static byte O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(byte b) {
        byte b2 = (byte) ((((b >> 6) * 25) + (b & 31)) - 16);
        if (b2 < 0 || b2 > 15) {
            throw new IllegalArgumentException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(b, "!hex "));
        }
        return b2;
    }

    public static int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i, int i2, int i3, byte[] bArr) {
        if (i2 < 0) {
            i2 = bArr.length - i;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            char c = (char) (bArr[i + i5] & 255);
            int i6 = c - '0';
            if ((i6 < 0 || i6 >= i3 || i6 >= 10) && ((i6 = c - '7') < 10 || i6 >= i3)) {
                i6 = c - 'W';
            }
            if (i6 < 0 || i6 >= i3) {
                throw new NumberFormatException(new String(bArr, i, i2));
            }
            i4 = (i4 * i3) + i6;
        }
        return i4;
    }

    public static int O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i, int i2, String str) {
        if (i2 < 0) {
            i2 = str.length() - i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            char cCharAt = str.charAt(i + i4);
            int i5 = (((cCharAt >> 6) * 25) + (cCharAt & 31)) - 16;
            if (i5 < 0 || i5 > 15) {
                throw new NumberFormatException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(cCharAt, "!hex "));
            }
            if (i5 < 0 || i5 >= 16) {
                throw new NumberFormatException(str.substring(i, i2 + i));
            }
            i3 = (i3 * 16) + i5;
        }
        return i3;
    }

    public static void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(byte b, StringBuilder sb) {
        int i = ((b & 240) >> 4) & 15;
        try {
            sb.append((char) ((i > 9 ? 55 : 48) + i));
            int i2 = b & 15;
            sb.append((char) ((i2 > 9 ? 55 : 48) + i2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
