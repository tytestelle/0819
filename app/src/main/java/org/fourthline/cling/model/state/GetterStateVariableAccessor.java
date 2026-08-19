package org.fourthline.cling.model.state;

import java.lang.reflect.Method;
import org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes2.dex */
public class GetterStateVariableAccessor extends StateVariableAccessor {
    private Method getter;

    public GetterStateVariableAccessor(Method method) {
        this.getter = method;
    }

    public Method getGetter() {
        return this.getter;
    }

    @Override // org.fourthline.cling.model.state.StateVariableAccessor
    public Class<?> getReturnType() {
        return getGetter().getReturnType();
    }

    @Override // org.fourthline.cling.model.state.StateVariableAccessor
    public Object read(Object obj) {
        return O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(obj, getGetter(), new Object[0]);
    }

    @Override // org.fourthline.cling.model.state.StateVariableAccessor
    public String toString() {
        return super.toString() + " Method: " + getGetter();
    }
}
