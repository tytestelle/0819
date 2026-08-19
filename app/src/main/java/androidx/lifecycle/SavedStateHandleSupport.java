package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import kotlin.jvm.internal.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleSupport {
    private static final String SAVED_STATE_KEY = "androidx.lifecycle.internal.SavedStateHandlesProvider";
    private static final String VIEWMODEL_KEY = "androidx.lifecycle.internal.SavedStateHandlesVM";
    public static final CreationExtras.Key<SavedStateRegistryOwner> SAVED_STATE_REGISTRY_OWNER_KEY = new CreationExtras.Key<SavedStateRegistryOwner>() { // from class: androidx.lifecycle.SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1
    };
    public static final CreationExtras.Key<ViewModelStoreOwner> VIEW_MODEL_STORE_OWNER_KEY = new CreationExtras.Key<ViewModelStoreOwner>() { // from class: androidx.lifecycle.SavedStateHandleSupport$VIEW_MODEL_STORE_OWNER_KEY$1
    };
    public static final CreationExtras.Key<Bundle> DEFAULT_ARGS_KEY = new CreationExtras.Key<Bundle>() { // from class: androidx.lifecycle.SavedStateHandleSupport$DEFAULT_ARGS_KEY$1
    };

    private static final SavedStateHandle createSavedStateHandle(SavedStateRegistryOwner savedStateRegistryOwner, ViewModelStoreOwner viewModelStoreOwner, String str, Bundle bundle) {
        SavedStateHandlesProvider savedStateHandlesProvider = getSavedStateHandlesProvider(savedStateRegistryOwner);
        SavedStateHandlesVM savedStateHandlesVM = getSavedStateHandlesVM(viewModelStoreOwner);
        SavedStateHandle savedStateHandle = savedStateHandlesVM.getHandles().get(str);
        if (savedStateHandle != null) {
            return savedStateHandle;
        }
        SavedStateHandle savedStateHandleCreateHandle = SavedStateHandle.Companion.createHandle(savedStateHandlesProvider.consumeRestoredStateForKey(str), bundle);
        savedStateHandlesVM.getHandles().put(str, savedStateHandleCreateHandle);
        return savedStateHandleCreateHandle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @MainThread
    public static final <T extends SavedStateRegistryOwner & ViewModelStoreOwner> void enableSavedStateHandles(T t) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(t, "<this>");
        Lifecycle.State currentState = t.getLifecycle().getCurrentState();
        if (currentState != Lifecycle.State.INITIALIZED && currentState != Lifecycle.State.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t.getSavedStateRegistry().getSavedStateProvider(SAVED_STATE_KEY) == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(t.getSavedStateRegistry(), t);
            t.getSavedStateRegistry().registerSavedStateProvider(SAVED_STATE_KEY, savedStateHandlesProvider);
            t.getLifecycle().addObserver(new SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }

    public static final SavedStateHandlesProvider getSavedStateHandlesProvider(SavedStateRegistryOwner savedStateRegistryOwner) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(savedStateRegistryOwner, "<this>");
        SavedStateRegistry.SavedStateProvider savedStateProvider = savedStateRegistryOwner.getSavedStateRegistry().getSavedStateProvider(SAVED_STATE_KEY);
        SavedStateHandlesProvider savedStateHandlesProvider = savedStateProvider instanceof SavedStateHandlesProvider ? (SavedStateHandlesProvider) savedStateProvider : null;
        if (savedStateHandlesProvider != null) {
            return savedStateHandlesProvider;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final SavedStateHandlesVM getSavedStateHandlesVM(ViewModelStoreOwner viewModelStoreOwner) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(viewModelStoreOwner, "<this>");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        SavedStateHandleSupport$savedStateHandlesVM$1$1 savedStateHandleSupport$savedStateHandlesVM$1$1 = SavedStateHandleSupport$savedStateHandlesVM$1$1.INSTANCE;
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f4007O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
        initializerViewModelFactoryBuilder.addInitializer(new kotlin.jvm.internal.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(SavedStateHandlesVM.class), savedStateHandleSupport$savedStateHandlesVM$1$1);
        return (SavedStateHandlesVM) new ViewModelProvider(viewModelStoreOwner, initializerViewModelFactoryBuilder.build()).get(VIEWMODEL_KEY, SavedStateHandlesVM.class);
    }

    @MainThread
    public static final SavedStateHandle createSavedStateHandle(CreationExtras creationExtras) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(creationExtras, "<this>");
        SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) creationExtras.get(SAVED_STATE_REGISTRY_OWNER_KEY);
        if (savedStateRegistryOwner != null) {
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) creationExtras.get(VIEW_MODEL_STORE_OWNER_KEY);
            if (viewModelStoreOwner != null) {
                Bundle bundle = (Bundle) creationExtras.get(DEFAULT_ARGS_KEY);
                String str = (String) creationExtras.get(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
                if (str != null) {
                    return createSavedStateHandle(savedStateRegistryOwner, viewModelStoreOwner, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }
}
