package com.google.common.base;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public final class O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 implements O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public transient Object f3363O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new Object();
    final O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O delegate;
    volatile transient boolean initialized;

    @CheckForNull
    transient Object value;

    public O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) {
        o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.getClass();
        this.delegate = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f3363O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new Object();
    }

    @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
    public Object get() {
        if (!this.initialized) {
            synchronized (this.f3363O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                try {
                    if (!this.initialized) {
                        Object obj = this.delegate.get();
                        this.value = obj;
                        this.initialized = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.value;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.initialized) {
            obj = "<supplier that returned " + this.value + ">";
        } else {
            obj = this.delegate;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
