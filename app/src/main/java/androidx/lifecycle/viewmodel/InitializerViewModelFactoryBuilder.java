package androidx.lifecycle.viewmodel;

import O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
@ViewModelFactoryDsl
public final class InitializerViewModelFactoryBuilder {
    private final List<ViewModelInitializer<?>> initializers = new ArrayList();

    public final <T extends ViewModel> void addInitializer(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO clazz, Function1<? super CreationExtras, ? extends T> initializer) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(clazz, "clazz");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(initializer, "initializer");
        List<ViewModelInitializer<?>> list = this.initializers;
        Class clsO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = ((O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) clazz).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(clsO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        list.add(new ViewModelInitializer<>(clsO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, initializer));
    }

    public final ViewModelProvider.Factory build() {
        ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) this.initializers.toArray(new ViewModelInitializer[0]);
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }
}
