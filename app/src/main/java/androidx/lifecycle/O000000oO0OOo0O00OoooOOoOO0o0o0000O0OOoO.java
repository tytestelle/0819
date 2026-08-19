package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {
    static {
        ViewModelProvider.Factory.Companion companion = ViewModelProvider.Factory.Companion;
    }

    public static ViewModel O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(ViewModelProvider.Factory factory, Class modelClass) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(modelClass, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static ViewModel O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(ViewModelProvider.Factory factory, Class modelClass, CreationExtras extras) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(modelClass, "modelClass");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(extras, "extras");
        return factory.create(modelClass);
    }

    public static ViewModelProvider.Factory O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(ViewModelInitializer... viewModelInitializerArr) {
        return ViewModelProvider.Factory.Companion.from(viewModelInitializerArr);
    }
}
