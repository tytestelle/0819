package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

/* JADX INFO: loaded from: classes.dex */
public final class ViewModelLazy<VM extends ViewModel> implements O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {
    private VM cached;
    private final Function0<CreationExtras> extrasProducer;
    private final Function0<ViewModelProvider.Factory> factoryProducer;
    private final Function0<ViewModelStore> storeProducer;
    private final O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO viewModelClass;

    /* JADX INFO: renamed from: androidx.lifecycle.ViewModelLazy$1, reason: invalid class name */
    public static final class AnonymousClass1 extends O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements Function0<CreationExtras.Empty> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras.Empty invoke() {
            return CreationExtras.Empty.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelLazy(O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO viewModelClass, Function0<? extends ViewModelStore> storeProducer, Function0<? extends ViewModelProvider.Factory> factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(viewModelClass, "viewModelClass");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(storeProducer, "storeProducer");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(factoryProducer, "factoryProducer");
    }

    public boolean isInitialized() {
        return this.cached != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelLazy(O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO viewModelClass, Function0<? extends ViewModelStore> storeProducer, Function0<? extends ViewModelProvider.Factory> factoryProducer, Function0<? extends CreationExtras> extrasProducer) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(viewModelClass, "viewModelClass");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(storeProducer, "storeProducer");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(factoryProducer, "factoryProducer");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(extrasProducer, "extrasProducer");
        this.viewModelClass = viewModelClass;
        this.storeProducer = storeProducer;
        this.factoryProducer = factoryProducer;
        this.extrasProducer = extrasProducer;
    }

    @Override // O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        ViewModelProvider viewModelProvider = new ViewModelProvider(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke());
        O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.viewModelClass;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, "<this>");
        Class clsO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = ((kotlin.jvm.internal.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(clsO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        VM vm2 = (VM) viewModelProvider.get(clsO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        this.cached = vm2;
        return vm2;
    }

    public /* synthetic */ ViewModelLazy(O0000oOoOoO0Oo0OOO00oo00o0Oo00o0o0000OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, Function0 function0, Function0 function1, Function0 function2, int i, kotlin.jvm.internal.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        this(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, function0, function1, (i & 8) != 0 ? AnonymousClass1.INSTANCE : function2);
    }
}
