package com.quickjs;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class JSArray extends JSObject {
    public JSArray(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, JSONArray jSONArray) {
        super(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o._initNewJSArray(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3840O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
        if (jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt instanceof String) {
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00((String) objOpt);
            } else if (objOpt instanceof Integer) {
                Object obj = (Integer) objOpt;
                obj.getClass();
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(obj);
            } else if (objOpt instanceof Boolean) {
                Object obj2 = (Boolean) objOpt;
                obj2.getClass();
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(obj2);
            } else if (objOpt instanceof Number) {
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(Double.valueOf(((Number) objOpt).doubleValue()));
            } else if (objOpt instanceof JSONObject) {
                JSObject jSObject = new JSObject(this.context, (JSONObject) objOpt);
                this.context.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(jSObject);
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(jSObject);
            } else if (objOpt instanceof JSONArray) {
                JSArray jSArray = new JSArray(this.context, (JSONArray) objOpt);
                this.context.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(jSArray);
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(jSArray);
            }
        }
    }

    public final Object O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, int i) {
        this.context.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
        if (o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 == null) {
            o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.UNKNOWN;
        }
        return JSValue.checkType(getNative()._arrayGet(getContextPtr(), o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.value, this, i), o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0);
    }

    public final boolean O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(int i) {
        Object objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.BOOLEAN, i);
        if (objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo instanceof Boolean) {
            return ((Boolean) objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo).booleanValue();
        }
        return false;
    }

    public final double O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(int i) {
        Object objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.DOUBLE, i);
        if (objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo instanceof Double) {
            return ((Double) objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo).doubleValue();
        }
        return 0.0d;
    }

    public final int O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(int i) {
        Object objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.INTEGER, i);
        if (objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo instanceof Integer) {
            return ((Integer) objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo).intValue();
        }
        return 0;
    }

    public final JSObject O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(int i) {
        Object objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.JS_OBJECT, i);
        if (objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo instanceof JSObject) {
            return (JSObject) objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        }
        return null;
    }

    public final String O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(int i) {
        Object objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.STRING, i);
        if (objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo instanceof String) {
            return (String) objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        }
        return null;
    }

    public final int O00000O00oOOo000000OOOo00OOOo0OooOO00OO0() {
        return ((Integer) O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.INTEGER, SessionDescription.ATTR_LENGTH)).intValue();
    }

    public final void O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(Object obj) {
        this.context.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
        getNative()._arrayAdd(getContextPtr(), this, obj);
    }

    public final JSONArray O00000OOoOOO00O00o0ooooooooO000ooooO0000() {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(); i++) {
            Object objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.UNKNOWN, i);
            if (!(objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo instanceof O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) && !(objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo instanceof JSFunction)) {
                if ((objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo instanceof Number) || (objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo instanceof String) || (objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo instanceof Boolean)) {
                    jSONArray.put(objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                } else if (objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo instanceof JSArray) {
                    jSONArray.put(((JSArray) objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo).O00000OOoOOO00O00o0ooooooooO000ooooO0000());
                } else if (objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo instanceof JSObject) {
                    jSONArray.put(((JSObject) objO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo).O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000());
                }
            }
        }
        return jSONArray;
    }
}
