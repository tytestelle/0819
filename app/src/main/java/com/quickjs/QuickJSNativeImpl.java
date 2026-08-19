package com.quickjs;

/* JADX INFO: loaded from: classes2.dex */
class QuickJSNativeImpl implements O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O {
    public static native long _createRuntime();

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public native JSValue _Undefined(long j);

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public native void _arrayAdd(long j, JSValue jSValue, Object obj);

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public native Object _arrayGet(long j, int i, JSValue jSValue, int i2);

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public native boolean _contains(long j, JSValue jSValue, String str);

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public native long _createContext(long j);

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public native Object _executeScript(long j, int i, String str, String str2, int i2);

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public native Object _get(long j, int i, JSValue jSValue, String str);

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public native String[] _getException(long j);

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public native JSObject _getGlobalObject(long j);

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public native String[] _getKeys(long j, JSValue jSValue);

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public native int _getObjectType(long j, JSValue jSValue);

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public native JSArray _initNewJSArray(long j);

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public native JSFunction _initNewJSFunction(long j, int i, boolean z);

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public native JSObject _initNewJSObject(long j);

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public native boolean _isUndefined(long j, JSValue jSValue);

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public native JSFunction _registerJavaMethod(long j, JSValue jSValue, String str, int i, boolean z);

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public native void _releaseContext(long j);

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public native void _releasePtr(long j, long j2, int i, double d, long j3);

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public native void _releaseRuntime(long j);

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public native void _set(long j, JSValue jSValue, String str, Object obj);
}
