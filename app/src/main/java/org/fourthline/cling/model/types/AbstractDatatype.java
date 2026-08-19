package org.fourthline.cling.model.types;

import java.lang.reflect.ParameterizedType;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractDatatype<V> implements Datatype<V> {
    private Datatype.Builtin builtin;

    @Override // org.fourthline.cling.model.types.Datatype
    public Datatype.Builtin getBuiltin() {
        return this.builtin;
    }

    @Override // org.fourthline.cling.model.types.Datatype
    public String getDisplayString() {
        if (this instanceof CustomDatatype) {
            return ((CustomDatatype) this).getName();
        }
        return getBuiltin() != null ? getBuiltin().getDescriptorName() : getValueType().getSimpleName();
    }

    @Override // org.fourthline.cling.model.types.Datatype
    public String getString(V v) {
        if (v == null) {
            return "";
        }
        if (isValid(v)) {
            return v.toString();
        }
        throw new InvalidValueException("Value is not valid: " + v);
    }

    public Class<V> getValueType() {
        return (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override // org.fourthline.cling.model.types.Datatype
    public boolean isHandlingJavaType(Class cls) {
        return getValueType().isAssignableFrom(cls);
    }

    @Override // org.fourthline.cling.model.types.Datatype
    public boolean isValid(V v) {
        return v == null || getValueType().isAssignableFrom(v.getClass());
    }

    public void setBuiltin(Datatype.Builtin builtin) {
        this.builtin = builtin;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }

    @Override // org.fourthline.cling.model.types.Datatype
    public V valueOf(String str) {
        return null;
    }
}
