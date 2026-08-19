package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public class ViewModelProvider {
    private final CreationExtras defaultCreationExtras;
    private final Factory factory;
    private final ViewModelStore store;

    public interface Factory {
        public static final Companion Companion = Companion.$$INSTANCE;

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final Factory from(ViewModelInitializer<?>... initializers) {
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(initializers, "initializers");
                return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(initializers, initializers.length));
            }
        }

        <T extends ViewModel> T create(Class<T> cls);

        <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras);
    }

    public static class NewInstanceFactory implements Factory {
        public static final Companion Companion = new Companion(null);
        public static final CreationExtras.Key<String> VIEW_MODEL_KEY = Companion.ViewModelKeyImpl.INSTANCE;
        private static NewInstanceFactory sInstance;

        public static final class Companion {

            public static final class ViewModelKeyImpl implements CreationExtras.Key<String> {
                public static final ViewModelKeyImpl INSTANCE = new ViewModelKeyImpl();

                private ViewModelKeyImpl() {
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
                this();
            }

            public static /* synthetic */ void getInstance$annotations() {
            }

            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
            public final NewInstanceFactory getInstance() {
                if (NewInstanceFactory.sInstance == null) {
                    NewInstanceFactory.sInstance = new NewInstanceFactory();
                }
                NewInstanceFactory newInstanceFactory = NewInstanceFactory.sInstance;
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(newInstanceFactory);
                return newInstanceFactory;
            }

            private Companion() {
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final NewInstanceFactory getInstance() {
            return Companion.getInstance();
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) throws InvocationTargetException {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(modelClass, "modelClass");
            try {
                T tNewInstance = modelClass.getDeclaredConstructor(null).newInstance(null);
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(tNewInstance, "{\n                modelC…wInstance()\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(modelClass, "Cannot create an instance of "), e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(modelClass, "Cannot create an instance of "), e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(modelClass, "Cannot create an instance of "), e3);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class OnRequeryFactory {
        public void onRequery(ViewModel viewModel) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore store, Factory factory) {
        this(store, factory, null, 4, null);
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(store, "store");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(factory, "factory");
    }

    @MainThread
    public <T extends ViewModel> T get(Class<T> modelClass) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) get("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static class AndroidViewModelFactory extends NewInstanceFactory {
        public static final String DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";
        private static AndroidViewModelFactory sInstance;
        private final Application application;
        public static final Companion Companion = new Companion(null);
        public static final CreationExtras.Key<Application> APPLICATION_KEY = Companion.ApplicationKeyImpl.INSTANCE;

        public static final class Companion {

            public static final class ApplicationKeyImpl implements CreationExtras.Key<Application> {
                public static final ApplicationKeyImpl INSTANCE = new ApplicationKeyImpl();

                private ApplicationKeyImpl() {
                }
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
                this();
            }

            public final Factory defaultFactory$lifecycle_viewmodel_release(ViewModelStoreOwner owner) {
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(owner, "owner");
                return owner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelProviderFactory() : NewInstanceFactory.Companion.getInstance();
            }

            public final AndroidViewModelFactory getInstance(Application application) {
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(application, "application");
                if (AndroidViewModelFactory.sInstance == null) {
                    AndroidViewModelFactory.sInstance = new AndroidViewModelFactory(application);
                }
                AndroidViewModelFactory androidViewModelFactory = AndroidViewModelFactory.sInstance;
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(androidViewModelFactory);
                return androidViewModelFactory;
            }

            private Companion() {
            }
        }

        private AndroidViewModelFactory(Application application, int i) {
            this.application = application;
        }

        public static final AndroidViewModelFactory getInstance(Application application) {
            return Companion.getInstance(application);
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(modelClass, "modelClass");
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(extras, "extras");
            if (this.application != null) {
                return (T) create(modelClass);
            }
            Application application = (Application) extras.get(APPLICATION_KEY);
            if (application != null) {
                return (T) create(modelClass, application);
            }
            if (AndroidViewModel.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.create(modelClass);
        }

        public AndroidViewModelFactory() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AndroidViewModelFactory(Application application) {
            this(application, 0);
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(application, "application");
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(modelClass, "modelClass");
            Application application = this.application;
            if (application != null) {
                return (T) create(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        private final <T extends ViewModel> T create(Class<T> cls, Application application) {
            if (AndroidViewModel.class.isAssignableFrom(cls)) {
                try {
                    T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                    O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(tNewInstance, "{\n                try {\n…          }\n            }");
                    return tNewInstance;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(cls, "Cannot create an instance of "), e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(cls, "Cannot create an instance of "), e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(cls, "Cannot create an instance of "), e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(cls, "Cannot create an instance of "), e4);
                }
            }
            return (T) super.create(cls);
        }
    }

    public ViewModelProvider(ViewModelStore store, Factory factory, CreationExtras defaultCreationExtras) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(store, "store");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(factory, "factory");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(defaultCreationExtras, "defaultCreationExtras");
        this.store = store;
        this.factory = factory;
        this.defaultCreationExtras = defaultCreationExtras;
    }

    @MainThread
    public <T extends ViewModel> T get(String key, Class<T> modelClass) {
        T t;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key, "key");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(modelClass, "modelClass");
        T t2 = (T) this.store.get(key);
        if (modelClass.isInstance(t2)) {
            Object obj = this.factory;
            OnRequeryFactory onRequeryFactory = obj instanceof OnRequeryFactory ? (OnRequeryFactory) obj : null;
            if (onRequeryFactory != null) {
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(t2);
                onRequeryFactory.onRequery(t2);
            }
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(t2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return t2;
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(this.defaultCreationExtras);
        mutableCreationExtras.set(NewInstanceFactory.VIEW_MODEL_KEY, key);
        try {
            t = (T) this.factory.create(modelClass, mutableCreationExtras);
        } catch (AbstractMethodError unused) {
            t = (T) this.factory.create(modelClass);
        }
        this.store.put(key, t);
        return t;
    }

    public /* synthetic */ ViewModelProvider(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras, int i, kotlin.jvm.internal.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
        this(viewModelStore, factory, (i & 4) != 0 ? CreationExtras.Empty.INSTANCE : creationExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStoreOwner owner) {
        this(owner.getViewModelStore(), AndroidViewModelFactory.Companion.defaultFactory$lifecycle_viewmodel_release(owner), ViewModelProviderGetKt.defaultCreationExtras(owner));
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(owner, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStoreOwner owner, Factory factory) {
        this(owner.getViewModelStore(), factory, ViewModelProviderGetKt.defaultCreationExtras(owner));
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(owner, "owner");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(factory, "factory");
    }
}
