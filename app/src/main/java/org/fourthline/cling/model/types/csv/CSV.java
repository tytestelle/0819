package org.fourthline.cling.model.types.csv;

import O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import org.fourthline.cling.model.ModelUtil;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CSV<T> extends ArrayList<T> {
    protected final Datatype.Builtin datatype = getBuiltinDatatype();

    public CSV() {
    }

    public Datatype.Builtin getBuiltinDatatype() {
        Type genericSuperclass = getClass();
        HashMap map = new HashMap();
        while (true) {
            if (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(genericSuperclass).equals(ArrayList.class)) {
                break;
            }
            if (genericSuperclass instanceof Class) {
                genericSuperclass = ((Class) genericSuperclass).getGenericSuperclass();
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
                Class cls = (Class) parameterizedType.getRawType();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    map.put(typeParameters[i], actualTypeArguments[i]);
                }
                if (!cls.equals(ArrayList.class)) {
                    genericSuperclass = cls.getGenericSuperclass();
                }
            }
        }
        Type[] typeParameters2 = genericSuperclass instanceof Class ? ((Class) genericSuperclass).getTypeParameters() : ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        ArrayList arrayList = new ArrayList();
        int length = typeParameters2.length;
        for (int i2 = 0; i2 < length; i2++) {
            Type type = typeParameters2[i2];
            while (map.containsKey(type)) {
                type = (Type) map.get(type);
            }
            arrayList.add(O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(type));
        }
        Class cls2 = (Class) arrayList.get(0);
        Datatype.Default byJavaType = Datatype.Default.getByJavaType(cls2);
        if (byJavaType != null) {
            return byJavaType.getBuiltinType();
        }
        throw new InvalidValueException(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(cls2, "No built-in UPnP datatype for Java type of CSV: "));
    }

    public List parseString(String str) {
        String[] strArrFromCommaSeparatedList = ModelUtil.fromCommaSeparatedList(str);
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrFromCommaSeparatedList) {
            arrayList.add(this.datatype.getDatatype().valueOf(str2));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            arrayList.add(this.datatype.getDatatype().getString(it.next()));
        }
        return ModelUtil.toCommaSeparatedList(arrayList.toArray(new Object[arrayList.size()]));
    }

    public CSV(String str) {
        addAll(parseString(str));
    }
}
