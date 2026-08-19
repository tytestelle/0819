package com.quickjs;

import androidx.annotation.Keep;
import java.io.Closeable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class QuickJS implements Closeable {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final Map f3850O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public boolean f3851O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final long f3852O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this);

    static {
        System.loadLibrary("quickjs");
        System.loadLibrary("quickjs-android");
    }

    public QuickJS(long j) {
        this.f3852O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = j;
    }

    public static QuickJS O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return new QuickJS(QuickJSNativeImpl._createRuntime());
    }

    @Keep
    public static Object callJavaCallback(long j, int i, JSValue jSValue, JSArray jSArray, boolean z) {
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) f3850O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(Long.valueOf(j));
        if (o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO == null) {
            return null;
        }
        O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = (O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000) o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3844O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.get(Integer.valueOf(i));
        if (o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 == null) {
            return null;
        }
        JSObject jSObject = jSValue instanceof JSObject ? (JSObject) jSValue : null;
        if (!z) {
            return o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f3849O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(jSObject, jSArray);
        }
        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f3848O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(jSArray);
        return null;
    }

    @Keep
    public static String convertModuleName(long j, String str, String str2) {
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) f3850O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(Long.valueOf(j));
        if (o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO == null || !(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO instanceof O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO)) {
            return null;
        }
        return O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(str, str2);
    }

    @Keep
    public static JSValue createJSValue(long j, int i, long j2, int i2, double d, long j3) {
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) f3850O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(Long.valueOf(j));
        if (i == 5) {
            return new JSArray(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, j2, i2, d, j3);
        }
        if (i == 6) {
            return new JSObject(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, j2, i2, d, j3);
        }
        if (i == 7) {
            return new JSFunction(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, j2, i2, d, j3);
        }
        if (i != 99) {
            return new JSValue(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, j2, i2, d, j3);
        }
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, j2, i2, d, j3);
        o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.released = true;
        return o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
    }

    @Keep
    public static String getModuleScript(long j, String str) {
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = (O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) f3850O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(Long.valueOf(j));
        if (o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO != null && (o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO instanceof O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO)) {
            return ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO).O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(str);
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(false, new O00000OOoOOO00O00o0ooooooooO000ooooO0000(this, 1));
    }
}
