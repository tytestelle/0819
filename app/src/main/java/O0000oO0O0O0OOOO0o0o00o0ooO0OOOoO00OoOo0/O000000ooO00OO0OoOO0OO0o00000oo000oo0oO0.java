package O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 implements O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, Serializable {
    private volatile Object _value;
    private Function0<Object> initializer;
    private final Object lock;

    public O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(Function0<Object> initializer, Object obj) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(initializer, "initializer");
        this.initializer = initializer;
        this._value = O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1664O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        this.lock = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(getValue());
    }

    @Override // O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public Object getValue() {
        Object objInvoke;
        Object obj = this._value;
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1664O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (obj != o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
            return obj;
        }
        synchronized (this.lock) {
            objInvoke = this._value;
            if (objInvoke == o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
                Function0<Object> function0 = this.initializer;
                kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(function0);
                objInvoke = function0.invoke();
                this._value = objInvoke;
                this.initializer = null;
            }
        }
        return objInvoke;
    }

    public boolean isInitialized() {
        return this._value != O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f1664O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(Function0 function0, Object obj, int i, kotlin.jvm.internal.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        this(function0, (i & 2) != 0 ? null : obj);
    }
}
