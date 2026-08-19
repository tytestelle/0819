package com.quickjs;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class JSValue {
    static final int TYPE_BOOLEAN = 3;
    static final int TYPE_BYTE = 9;
    static final int TYPE_DOUBLE = 2;
    static final int TYPE_FLOAT_32_ARRAY = 16;
    static final int TYPE_FLOAT_64_ARRAY = 2;
    static final int TYPE_INTEGER = 1;
    static final int TYPE_INT_16_ARRAY = 13;
    static final int TYPE_INT_32_ARRAY = 1;
    static final int TYPE_INT_8_ARRAY = 9;
    static final int TYPE_JS_ARRAY = 5;
    static final int TYPE_JS_ARRAY_BUFFER = 10;
    static final int TYPE_JS_FUNCTION = 7;
    static final int TYPE_JS_OBJECT = 6;
    static final int TYPE_JS_TYPED_ARRAY = 8;
    static final int TYPE_NULL = 0;
    static final int TYPE_STRING = 4;
    static final int TYPE_UNDEFINED = 99;
    static final int TYPE_UNKNOWN = 0;
    static final int TYPE_UNSIGNED_INT_16_ARRAY = 14;
    static final int TYPE_UNSIGNED_INT_32_ARRAY = 15;
    static final int TYPE_UNSIGNED_INT_8_ARRAY = 11;
    static final int TYPE_UNSIGNED_INT_8_CLAMPED_ARRAY = 12;
    protected O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO context;
    volatile boolean released;
    long tag;
    double u_float64;
    int u_int32;
    long u_ptr;

    public JSValue(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, long j, int i, double d, long j2) {
        this.released = false;
        this.context = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
        this.tag = j;
        this.u_int32 = i;
        this.u_float64 = d;
        this.u_ptr = j2;
        if (o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO == null || getClass() == O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.class) {
            return;
        }
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3842O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.put(Integer.valueOf(hashCode()), this);
    }

    public static JSValue NULL() {
        return null;
    }

    public static JSObject Undefined(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) {
        return (JSObject) o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o._Undefined(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3840O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
    }

    public static Object checkType(Object obj, O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0) {
        switch (o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.value) {
            case 0:
                return obj;
            case 1:
                if (obj instanceof Integer) {
                    return obj;
                }
                return 0;
            case 2:
                if (obj instanceof Double) {
                    return obj;
                }
                return 0;
            case 3:
                return obj instanceof Boolean ? obj : Boolean.FALSE;
            case 4:
                if (obj instanceof String) {
                    return obj;
                }
                return null;
            case 5:
                if (obj instanceof JSArray) {
                    return obj;
                }
                return null;
            case 6:
                if (obj instanceof JSObject) {
                    return obj;
                }
                return null;
            case 7:
                if (obj instanceof JSFunction) {
                    return obj;
                }
                return null;
            default:
                return null;
        }
    }

    public void close() {
        close(false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && ((JSValue) obj).tag == this.tag;
    }

    public void finalize() throws Throwable {
        if (!(this instanceof O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO)) {
            close(true);
        }
        super.finalize();
    }

    public O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO getContext() {
        return this.context;
    }

    public long getContextPtr() {
        return this.context.f3840O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    public O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O getNative() {
        return getContext().f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    public QuickJS getQuickJS() {
        return getContext().f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public long getTag() {
        return this.tag;
    }

    public O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 getType() {
        this.context.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
        int i_getObjectType = getContext().f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o._getObjectType(getContextPtr(), this);
        if (i_getObjectType == 99) {
            return O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.UNDEFINED;
        }
        switch (i_getObjectType) {
            case 0:
                return O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.UNKNOWN;
            case 1:
                return O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.INTEGER;
            case 2:
                return O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.DOUBLE;
            case 3:
                return O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.BOOLEAN;
            case 4:
                return O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.STRING;
            case 5:
                return O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.JS_ARRAY;
            case 6:
                return O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.JS_OBJECT;
            case 7:
                return O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.JS_FUNCTION;
            default:
                return O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.UNKNOWN;
        }
    }

    public boolean isUndefined() {
        return getContext().f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o._isUndefined(getContextPtr(), this);
    }

    public void postEventQueue(Runnable runnable) {
        getQuickJS().f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(false, runnable);
    }

    private void close(boolean z) {
        if (this.released) {
            return;
        }
        this.released = true;
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = this.context;
        if (z) {
            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.getClass();
            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3843O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.add(new Object[]{Long.valueOf(this.tag), Integer.valueOf(this.u_int32), Double.valueOf(this.u_float64), Long.valueOf(this.u_ptr)});
        } else {
            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o._releasePtr(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3840O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.tag, this.u_int32, this.u_float64, this.u_ptr);
        }
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.getClass();
        o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3842O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.remove(Integer.valueOf(hashCode()));
    }

    public JSValue(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, JSValue jSValue) {
        this.released = false;
        jSValue.released = true;
        this.context = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
        this.tag = jSValue.tag;
        this.u_int32 = jSValue.u_int32;
        this.u_float64 = jSValue.u_float64;
        this.u_ptr = jSValue.u_ptr;
        if (o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO != null) {
            jSValue.released = true;
            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3842O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.remove(Integer.valueOf(jSValue.hashCode()));
            if (getClass() != O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.class) {
                o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3842O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.put(Integer.valueOf(hashCode()), this);
            }
        }
        if (o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO != null) {
            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
        }
    }
}
