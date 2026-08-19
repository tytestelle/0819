package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import kotlin.collections.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class SavedStateViewModelFactoryKt {
    private static final List<Class<?>> ANDROID_VIEWMODEL_SIGNATURE;
    private static final List<Class<?>> VIEWMODEL_SIGNATURE;

    static {
        List<Class<?>> listAsList = Arrays.asList(Application.class, SavedStateHandle.class);
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(listAsList, "asList(this)");
        ANDROID_VIEWMODEL_SIGNATURE = listAsList;
        VIEWMODEL_SIGNATURE = org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(SavedStateHandle.class);
    }

    public static final <T> Constructor<T> findMatchingConstructor(Class<T> modelClass, List<? extends Class<?>> signature) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(modelClass, "modelClass");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(signature, "signature");
        Object[] constructors = modelClass.getConstructors();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(parameterTypes, "constructor.parameterTypes");
            int length = parameterTypes.length;
            List arrayList = length != 0 ? length != 1 ? new ArrayList(new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(parameterTypes)) : org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(parameterTypes[0]) : O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.INSTANCE;
            if (signature.equals(arrayList)) {
                return constructor;
            }
            if (signature.size() == arrayList.size() && arrayList.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends ViewModel> T newInstance(Class<T> modelClass, Constructor<T> constructor, Object... params) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(modelClass, "modelClass");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(constructor, "constructor");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(modelClass, "Failed to access "), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(modelClass, "An exception happened in constructor of "), e3.getCause());
        }
    }
}
