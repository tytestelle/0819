package com.quickjs;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JSObject extends JSValue {
    public JSObject(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) {
        super(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o._initNewJSObject(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3840O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
    }

    public static Object[] O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Method method, JSArray jSArray) {
        int iO00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = jSArray.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
        Object[] objArr = new Object[iO00000O00oOOo000000OOOo00OOOo0OooOO00OO0];
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        for (int i = 0; i < iO00000O00oOOo000000OOOo00OOOo0OooOO00OO0; i++) {
            Type type = genericParameterTypes[i];
            if (type == Integer.TYPE || type == Integer.class) {
                objArr[i] = Integer.valueOf(jSArray.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(i));
            } else if (type == Double.TYPE || type == Double.class) {
                objArr[i] = Double.valueOf(jSArray.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(i));
            } else if (type == Boolean.TYPE || type == Boolean.class) {
                objArr[i] = Boolean.valueOf(jSArray.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(i));
            } else if (type == String.class) {
                objArr[i] = jSArray.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(i);
            } else if (type == JSArray.class) {
                Object objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = jSArray.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.JS_ARRAY, i);
                objArr[i] = objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo instanceof JSArray ? (JSArray) objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo : null;
            } else {
                if (type != JSObject.class && type != JSFunction.class) {
                    throw new RuntimeException("Type error");
                }
                objArr[i] = jSArray.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(i);
            }
        }
        return objArr;
    }

    public Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, String str) {
        this.context.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
        if (o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 == null) {
            o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.UNKNOWN;
        }
        return JSValue.checkType(this.context.f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o._get(getContextPtr(), o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.value, this, str), o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0);
    }

    public void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, String str) {
        this.context.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
        getNative()._registerJavaMethod(getContextPtr(), this, str, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.hashCode(), false);
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = this.context;
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.getClass();
        O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = new O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000();
        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f3849O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3844O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.put(Integer.valueOf(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.hashCode()), o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000);
    }

    public void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, String str) {
        this.context.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
        getNative()._registerJavaMethod(getContextPtr(), this, str, o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.hashCode(), true);
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = this.context;
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.getClass();
        O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = new O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000();
        o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f3848O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3844O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.put(Integer.valueOf(o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.hashCode()), o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000);
    }

    public final JSObject O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(String str, JSObject jSObject) {
        this.context.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(jSObject);
        return O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(jSObject, str);
    }

    public JSObject O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Object obj, String str) {
        this.context.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
        this.context.f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o._set(getContextPtr(), this, str, obj);
        return this;
    }

    public final JSONObject O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        JSONObject jSONObject = new JSONObject();
        this.context.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
        for (String str : getContext().f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o._getKeys(getContextPtr(), this)) {
            Object objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.UNKNOWN, str);
            if (!(objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO instanceof O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) && !(objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO instanceof JSFunction)) {
                if ((objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO instanceof Number) || (objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO instanceof String) || (objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO instanceof Boolean)) {
                    try {
                        jSONObject.put(str, objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO instanceof JSArray) {
                    try {
                        jSONObject.put(str, ((JSArray) objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).O00000OOoOOO00O00o0ooooooooO000ooooO0000());
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                } else if (objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO instanceof JSObject) {
                    try {
                        jSONObject.put(str, ((JSObject) objO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000());
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                }
            }
        }
        return jSONObject;
    }

    public JSObject(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, JSONObject jSONObject) {
        super(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o._initNewJSObject(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3840O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof String) {
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO((String) objOpt, next);
            } else if (objOpt instanceof Integer) {
                Integer num = (Integer) objOpt;
                num.getClass();
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(num, next);
            } else if (objOpt instanceof Boolean) {
                Boolean bool = (Boolean) objOpt;
                bool.getClass();
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(bool, next);
            } else if (objOpt instanceof Number) {
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Double.valueOf(((Number) objOpt).doubleValue()), next);
            } else if (objOpt instanceof JSONObject) {
                O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(next, new JSObject(this.context, (JSONObject) objOpt));
            } else if (objOpt instanceof JSONArray) {
                O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(next, new JSArray(this.context, (JSONArray) objOpt));
            }
        }
    }
}
