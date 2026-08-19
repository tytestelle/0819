package com.quickjs;

import android.webkit.JavascriptInterface;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO extends JSObject implements Closeable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final QuickJS f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final long f3840O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Set f3841O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final Map f3842O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final List f3843O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final Map f3844O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(QuickJS quickJS, long j) {
        super((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) null, quickJS.f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o._getGlobalObject(j));
        this.f3841O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = Collections.synchronizedSet(new HashSet());
        this.f3842O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = Collections.synchronizedMap(new WeakHashMap());
        this.f3843O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = Collections.synchronizedList(new LinkedList());
        this.f3844O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = Collections.synchronizedMap(new HashMap());
        this.f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = quickJS;
        this.f3840O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = j;
        this.context = this;
        QuickJS.f3850O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.put(Long.valueOf(j), this);
    }

    public static void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) {
        if (o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.released) {
            return;
        }
        Iterator it = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3841O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.iterator();
        while (it.hasNext()) {
            ((O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) it.next()).getClass();
        }
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3841O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.clear();
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3844O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.clear();
        for (JSValue jSValue : (JSValue[]) o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3842O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.values().toArray(new JSValue[0])) {
            if (jSValue != null) {
                jSValue.close();
            }
        }
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
        super.close();
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o._releaseContext(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3840O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        QuickJS.f3850O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.remove(Long.valueOf(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3840O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
    }

    public final void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
        Set set = this.f3841O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (set.contains(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0)) {
            return;
        }
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = this.context;
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.context.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
        JSObject jSObject = new JSObject(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.context);
        for (Method method : o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.getClass().getMethods()) {
            if (method.getAnnotation(JavascriptInterface.class) != null) {
                String name = method.getName();
                if (method.getReturnType().equals(Void.TYPE)) {
                    jSObject.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(method, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0), name);
                } else {
                    jSObject.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(method, o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0), name);
                }
            }
        }
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0("console", jSObject);
        jSObject.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, 1), "assert");
        set.add(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
    }

    public final void O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() {
        while (true) {
            List list = this.f3843O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            if (list.isEmpty()) {
                return;
            }
            Object[] objArr = (Object[]) list.get(0);
            this.f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o._releasePtr(this.f3840O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, ((Long) objArr[0]).longValue(), ((Integer) objArr[1]).intValue(), ((Double) objArr[2]).doubleValue(), ((Long) objArr[3]).longValue());
            list.remove(0);
        }
    }

    public final void O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() {
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
        if (this.f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3851O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO ? true : this.released) {
            throw new Error("Context disposed error");
        }
    }

    public final void O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(JSObject jSObject) {
        if (jSObject == null || jSObject.isUndefined()) {
            return;
        }
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = jSObject.context;
        if (o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO == null) {
            throw new Error("Invalid target runtime");
        }
        QuickJS quickJS = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (quickJS == null || quickJS.f3851O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO || quickJS != this.f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            throw new Error("Invalid target runtime");
        }
    }

    public final Object O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, String str, String str2) {
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        int i = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.value;
        Map map = QuickJS.f3850O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        Object obj_executeScript = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00._executeScript(this.f3840O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, i, str, str2, 0);
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = this.context;
        String[] strArr_getException = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o._getException(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3840O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        if (strArr_getException == null) {
            return obj_executeScript;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strArr_getException[1]);
        sb.append('\n');
        for (int i2 = 2; i2 < strArr_getException.length; i2++) {
            sb.append(strArr_getException[i2]);
        }
        throw new O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(strArr_getException[0], sb.toString());
    }

    @Override // com.quickjs.JSValue, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        postEventQueue(new O00000OOoOOO00O00o0ooooooooO000ooooO0000(this, 0));
    }

    @Override // com.quickjs.JSValue
    public final long getContextPtr() {
        return this.f3840O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // com.quickjs.JSValue
    public final O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O getNative() {
        return this.f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // com.quickjs.JSValue
    public final QuickJS getQuickJS() {
        return this.f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }
}
