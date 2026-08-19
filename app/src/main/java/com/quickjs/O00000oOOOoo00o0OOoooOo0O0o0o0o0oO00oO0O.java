package com.quickjs;

/* JADX INFO: loaded from: classes2.dex */
public interface O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O {
    JSValue _Undefined(long j);

    void _arrayAdd(long j, JSValue jSValue, Object obj);

    Object _arrayGet(long j, int i, JSValue jSValue, int i2);

    boolean _contains(long j, JSValue jSValue, String str);

    long _createContext(long j);

    Object _executeScript(long j, int i, String str, String str2, int i2);

    Object _get(long j, int i, JSValue jSValue, String str);

    String[] _getException(long j);

    JSObject _getGlobalObject(long j);

    String[] _getKeys(long j, JSValue jSValue);

    int _getObjectType(long j, JSValue jSValue);

    JSArray _initNewJSArray(long j);

    JSFunction _initNewJSFunction(long j, int i, boolean z);

    JSObject _initNewJSObject(long j);

    boolean _isUndefined(long j, JSValue jSValue);

    JSFunction _registerJavaMethod(long j, JSValue jSValue, String str, int i, boolean z);

    void _releaseContext(long j);

    void _releasePtr(long j, long j2, int i, double d, long j3);

    void _releaseRuntime(long j);

    void _set(long j, JSValue jSValue, String str, Object obj);
}
