package com.quickjs;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 implements O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final QuickJS f3832O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Handler f3834O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f3836O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O f3833O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new QuickJSNativeImpl();

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final Thread f3835O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = Thread.currentThread();

    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(QuickJS quickJS) {
        this.f3832O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = quickJS;
        this.f3834O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = Looper.myLooper() != null ? new Handler(Looper.myLooper()) : null;
        O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(11, false);
        synchronized (o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
            try {
                Thread thread = (Thread) o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (thread != null && thread != Thread.currentThread()) {
                    throw new Error("All QuickJS methods must be called on the same thread. Invalid QuickJS thread access: current thread is " + Thread.currentThread() + " while the locker has thread " + ((Thread) o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO));
                }
                if (((Thread) o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) != Thread.currentThread()) {
                    o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = Thread.currentThread();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3836O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
    }

    public final Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0) {
        if (this.f3832O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3851O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            Log.e("QuickJS", "QuickJS is released");
            return null;
        }
        if (Thread.currentThread() == this.f3835O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            return o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.run();
        }
        Handler handler = this.f3834O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (handler == null) {
            this.f3836O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
            return o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.run();
        }
        Object[] objArr = new Object[2];
        RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
        handler.post(new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(objArr, 11, o00000O00oOOo000000OOOo00OOOo0OooOO00OO0, runtimeExceptionArr));
        synchronized (objArr) {
            try {
                if (objArr[1] == null) {
                    objArr.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        RuntimeException runtimeException = runtimeExceptionArr[0];
        if (runtimeException == null) {
            return objArr[0];
        }
        throw runtimeException;
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(final boolean z, final Runnable runnable) {
        if (this.f3832O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3851O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            Log.e("QuickJS", "QuickJS is released");
            return;
        }
        if (Thread.currentThread() == this.f3835O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            runnable.run();
            return;
        }
        Handler handler = this.f3834O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (handler == null) {
            this.f3836O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
            runnable.run();
            return;
        }
        final Object[] objArr = new Object[2];
        final RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
        handler.post(new Runnable() { // from class: com.quickjs.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO
            @Override // java.lang.Runnable
            public final void run() {
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = this.f3823O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                Runnable runnable2 = runnable;
                RuntimeException[] runtimeExceptionArr2 = runtimeExceptionArr;
                boolean z2 = z;
                Object[] objArr2 = objArr;
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.getClass();
                try {
                    if (!o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3832O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3851O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                        runnable2.run();
                    }
                } catch (RuntimeException e) {
                    runtimeExceptionArr2[0] = e;
                }
                if (z2) {
                    synchronized (objArr2) {
                        objArr2[1] = Boolean.TRUE;
                        objArr2.notifyAll();
                    }
                }
            }
        });
        if (z) {
            synchronized (objArr) {
                try {
                    if (objArr[1] == null) {
                        objArr.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            RuntimeException runtimeException = runtimeExceptionArr[0];
            if (runtimeException != null) {
                throw runtimeException;
            }
        }
    }

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public final JSValue _Undefined(long j) {
        return (JSValue) O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, j, 4));
    }

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public final void _arrayAdd(final long j, JSValue jSValue, final Object obj) {
        final JSArray jSArray = (JSArray) jSValue;
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(true, new Runnable() { // from class: com.quickjs.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
            @Override // java.lang.Runnable
            public final void run() {
                this.f3798O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3833O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO._arrayAdd(j, jSArray, obj);
            }
        });
    }

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public final Object _arrayGet(final long j, final int i, JSValue jSValue, final int i2) {
        final JSArray jSArray = (JSArray) jSValue;
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0() { // from class: com.quickjs.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
            @Override // com.quickjs.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
            public final Object run() {
                return this.f3789O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3833O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO._arrayGet(j, i, jSArray, i2);
            }
        });
    }

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public final boolean _contains(long j, JSValue jSValue, String str) {
        return ((Boolean) O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, j, (JSObject) jSValue, 0))).booleanValue();
    }

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public final long _createContext(long j) {
        throw null;
    }

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public final Object _executeScript(long j, int i, String str, String str2, int i2) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, j, i, str, str2));
    }

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public final Object _get(long j, int i, JSValue jSValue, String str) {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, j, i, (JSObject) jSValue, str));
    }

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public final String[] _getException(long j) {
        return (String[]) O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, j, 1));
    }

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public final JSObject _getGlobalObject(long j) {
        return (JSObject) O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, j, 3));
    }

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public final String[] _getKeys(long j, JSValue jSValue) {
        return (String[]) O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this, j, (JSObject) jSValue, 1));
    }

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public final int _getObjectType(long j, JSValue jSValue) {
        return ((Integer) O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, j, jSValue, 0))).intValue();
    }

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public final JSArray _initNewJSArray(long j) {
        return (JSArray) O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, j, 2));
    }

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public final JSFunction _initNewJSFunction(final long j, final int i, final boolean z) {
        return (JSFunction) O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0() { // from class: com.quickjs.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
            @Override // com.quickjs.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
            public final Object run() {
                return this.f3828O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3833O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO._initNewJSFunction(j, i, z);
            }
        });
    }

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public final JSObject _initNewJSObject(long j) {
        return (JSObject) O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, j, 0));
    }

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public final boolean _isUndefined(long j, JSValue jSValue) {
        return ((Boolean) O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, j, jSValue, 1))).booleanValue();
    }

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public final JSFunction _registerJavaMethod(final long j, JSValue jSValue, final String str, final int i, final boolean z) {
        final JSObject jSObject = (JSObject) jSValue;
        return (JSFunction) O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0() { // from class: com.quickjs.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
            @Override // com.quickjs.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
            public final Object run() {
                return this.f3802O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3833O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO._registerJavaMethod(j, jSObject, str, i, z);
            }
        });
    }

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public final void _releaseContext(long j) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(true, new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, j, 1));
    }

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public final void _releasePtr(final long j, final long j2, final int i, final double d, final long j3) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(true, new Runnable() { // from class: com.quickjs.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3808O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3833O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO._releasePtr(j, j2, i, d, j3);
            }
        });
    }

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public final void _releaseRuntime(long j) {
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(true, new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this, j, 0));
    }

    @Override // com.quickjs.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O
    public final void _set(final long j, JSValue jSValue, final String str, final Object obj) {
        final JSObject jSObject = (JSObject) jSValue;
        O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(true, new Runnable() { // from class: com.quickjs.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
            @Override // java.lang.Runnable
            public final void run() {
                this.f3818O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f3833O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO._set(j, jSObject, str, obj);
            }
        });
    }
}
