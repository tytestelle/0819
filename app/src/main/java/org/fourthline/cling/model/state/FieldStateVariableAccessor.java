package org.fourthline.cling.model.state;

import java.lang.reflect.Field;
import org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes2.dex */
public class FieldStateVariableAccessor extends StateVariableAccessor {
    protected Field field;

    public FieldStateVariableAccessor(Field field) {
        this.field = field;
    }

    public Field getField() {
        return this.field;
    }

    @Override // org.fourthline.cling.model.state.StateVariableAccessor
    public Class<?> getReturnType() {
        return getField().getType();
    }

    @Override // org.fourthline.cling.model.state.StateVariableAccessor
    public Object read(Object obj) {
        Field field = this.field;
        boolean zIsAccessible = field.isAccessible();
        try {
            try {
                field.setAccessible(true);
                Object obj2 = field.get(obj);
                field.setAccessible(zIsAccessible);
                return obj2;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Could not get field value by reflection: " + O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(field) + " on: " + obj.getClass().getName(), e);
            }
        } catch (Throwable th) {
            field.setAccessible(zIsAccessible);
            throw th;
        }
    }

    @Override // org.fourthline.cling.model.state.StateVariableAccessor
    public String toString() {
        return super.toString() + " Field: " + getField();
    }
}
