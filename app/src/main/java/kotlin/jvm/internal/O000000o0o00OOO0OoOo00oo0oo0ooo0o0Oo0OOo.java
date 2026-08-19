package kotlin.jvm.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final Map f4003O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Class f4004O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    static {
        int i = 0;
        List listAsList = Arrays.asList(Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class);
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(listAsList, "asList(this)");
        ArrayList arrayList = new ArrayList(kotlin.collections.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(listAsList));
        for (Object obj : listAsList) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f4003O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(arrayList);
        HashMap map = new HashMap();
        map.put(TypedValues.Custom.S_BOOLEAN, "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put(TypedValues.Custom.S_FLOAT, "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(collectionValues, "primitiveFqNames.values");
        for (String kotlinName : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(kotlinName, "kotlinName");
            sb.append(kotlin.text.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(kotlinName));
            sb.append("CompanionObject");
            O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(sb.toString(), kotlinName.concat(".Companion"));
            map3.put(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getFirst(), o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getSecond());
        }
        for (Map.Entry entry : f4003O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), kotlin.text.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0((String) entry2.getValue()));
        }
    }

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Class jClass) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(jClass, "jClass");
        this.f4004O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = jClass;
    }

    @Override // kotlin.jvm.internal.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final Class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return this.f4004O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) && com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this).equals(com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo((O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) obj));
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        throw new O0000oOOoO0ooo0o0o0OO0oOoo0oO0o000OoOooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    }

    public final int hashCode() {
        return com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(this).hashCode();
    }

    public final String toString() {
        return this.f4004O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.toString() + " (Kotlin reflection is not available)";
    }
}
