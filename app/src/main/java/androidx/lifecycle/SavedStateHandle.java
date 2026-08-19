package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O;
import kotlin.collections.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandle {
    private static final String KEYS = "keys";
    private static final String VALUES = "values";
    private final Map<String, O0000oOooOO0OOoooO0ooOO0o0oOooOoOoo0OOoo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO> flows;
    private final Map<String, SavingStateLiveData<?>> liveDatas;
    private final Map<String, Object> regular;
    private final SavedStateRegistry.SavedStateProvider savedStateProvider;
    private final Map<String, SavedStateRegistry.SavedStateProvider> savedStateProviders;
    public static final Companion Companion = new Companion(null);
    private static final Class<? extends Object>[] ACCEPTABLE_CLASSES = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
            this();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new SavedStateHandle();
                }
                HashMap map = new HashMap();
                for (String key : bundle2.keySet()) {
                    O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(key, "key");
                    map.put(key, bundle2.get(key));
                }
                return new SavedStateHandle(map);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(SavedStateHandle.KEYS);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(SavedStateHandle.VALUES);
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
            }
            return new SavedStateHandle(linkedHashMap);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean validateValue(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : SavedStateHandle.ACCEPTABLE_CLASSES) {
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    public SavedStateHandle(Map<String, ? extends Object> initialState) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.regular = linkedHashMap;
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new androidx.fragment.app.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, 2);
        linkedHashMap.putAll(initialState);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
        return Companion.createHandle(bundle, bundle2);
    }

    private final <T> MutableLiveData<T> getLiveDataInternal(String str, boolean z, T t) {
        SavingStateLiveData<?> savingStateLiveData;
        SavingStateLiveData<?> savingStateLiveData2 = this.liveDatas.get(str);
        SavingStateLiveData<?> savingStateLiveData3 = savingStateLiveData2 instanceof MutableLiveData ? savingStateLiveData2 : null;
        if (savingStateLiveData3 != null) {
            return savingStateLiveData3;
        }
        if (this.regular.containsKey(str)) {
            savingStateLiveData = new SavingStateLiveData<>(this, str, this.regular.get(str));
        } else if (z) {
            this.regular.put(str, t);
            savingStateLiveData = new SavingStateLiveData<>(this, str, t);
        } else {
            savingStateLiveData = new SavingStateLiveData<>(this, str);
        }
        this.liveDatas.put(str, savingStateLiveData);
        return savingStateLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle savedStateProvider$lambda$0(SavedStateHandle this$0) {
        Map mapO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this$0, "this$0");
        Map<String, SavedStateRegistry.SavedStateProvider> map = this$0.savedStateProviders;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(map, "<this>");
        int size = map.size();
        if (size == 0) {
            mapO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
        } else if (size != 1) {
            mapO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = new LinkedHashMap(map);
        } else {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(map, "<this>");
            Map.Entry<String, SavedStateRegistry.SavedStateProvider> next = map.entrySet().iterator().next();
            mapO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = Collections.singletonMap(next.getKey(), next.getValue());
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(mapO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, "with(entries.iterator().…ingletonMap(key, value) }");
        }
        for (Map.Entry entry : mapO00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.entrySet()) {
            this$0.set((String) entry.getKey(), ((SavedStateRegistry.SavedStateProvider) entry.getValue()).saveState());
        }
        Set<String> setKeySet = this$0.regular.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(this$0.regular.get(str));
        }
        return BundleKt.bundleOf(new O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(KEYS, arrayList), new O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(VALUES, arrayList2));
    }

    @MainThread
    public final void clearSavedStateProvider(String key) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key, "key");
        this.savedStateProviders.remove(key);
    }

    @MainThread
    public final boolean contains(String key) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key, "key");
        return this.regular.containsKey(key);
    }

    @MainThread
    public final <T> T get(String key) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key, "key");
        try {
            return (T) this.regular.get(key);
        } catch (ClassCastException unused) {
            remove(key);
            return null;
        }
    }

    @MainThread
    public final <T> MutableLiveData<T> getLiveData(String key) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key, "key");
        MutableLiveData<T> liveDataInternal = getLiveDataInternal(key, false, null);
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(liveDataInternal, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return liveDataInternal;
    }

    @MainThread
    public final <T> O0000oOooOO0OOoooO0ooOO0o0oOooOoOoo0OOoo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO getStateFlow(String key, T t) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key, "key");
        Map<String, O0000oOooOO0OOoooO0ooOO0o0oOooOoOoo0OOoo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO> map = this.flows;
        O0000oOooOO0OOoooO0ooOO0o0oOooOoOoo0OOoo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = map.get(key);
        if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, t);
            }
            Object obj = this.regular.get(key);
            if (obj == null) {
                obj = O0000oOooo0Oo0ooO0Oo0OoOOoOOO00oO00O0o0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1690O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            }
            o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000oOooOO0OOoooO0ooOO0o0oOooOoOoo0OOoo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(obj);
            this.flows.put(key, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            map.put(key, o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
        return new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(23);
    }

    @MainThread
    public final Set<String> keys() {
        return O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(this.regular.keySet(), this.savedStateProviders.keySet()), this.liveDatas.keySet());
    }

    @MainThread
    public final <T> T remove(String key) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key, "key");
        T t = (T) this.regular.remove(key);
        SavingStateLiveData<?> savingStateLiveDataRemove = this.liveDatas.remove(key);
        if (savingStateLiveDataRemove != null) {
            savingStateLiveDataRemove.detach();
        }
        this.flows.remove(key);
        return t;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final SavedStateRegistry.SavedStateProvider savedStateProvider() {
        return this.savedStateProvider;
    }

    @MainThread
    public final <T> void set(String key, T t) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key, "key");
        if (!Companion.validateValue(t)) {
            StringBuilder sb = new StringBuilder("Can't put value with type ");
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(t);
            sb.append(t.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        SavingStateLiveData<?> savingStateLiveData = this.liveDatas.get(key);
        SavingStateLiveData<?> savingStateLiveData2 = savingStateLiveData instanceof MutableLiveData ? savingStateLiveData : null;
        if (savingStateLiveData2 != null) {
            savingStateLiveData2.setValue(t);
        } else {
            this.regular.put(key, t);
        }
        O0000oOooOO0OOoooO0ooOO0o0oOooOoOoo0OOoo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.flows.get(key);
        if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == null) {
            return;
        }
        o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(t);
    }

    @MainThread
    public final void setSavedStateProvider(String key, SavedStateRegistry.SavedStateProvider provider) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key, "key");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(provider, "provider");
        this.savedStateProviders.put(key, provider);
    }

    @MainThread
    public final <T> MutableLiveData<T> getLiveData(String key, T t) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key, "key");
        return getLiveDataInternal(key, true, t);
    }

    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {
        private SavedStateHandle handle;
        private String key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingStateLiveData(SavedStateHandle savedStateHandle, String key, T t) {
            super(t);
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key, "key");
            this.key = key;
            this.handle = savedStateHandle;
        }

        public final void detach() {
            this.handle = null;
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T t) {
            SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null) {
                savedStateHandle.regular.put(this.key, t);
                O0000oOooOO0OOoooO0ooOO0o0oOooOoOoo0OOoo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (O0000oOooOO0OOoooO0ooOO0o0oOooOoOoo0OOoo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) savedStateHandle.flows.get(this.key);
                if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null) {
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(t);
                }
            }
            super.setValue(t);
        }

        public SavingStateLiveData(SavedStateHandle savedStateHandle, String key) {
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(key, "key");
            this.key = key;
            this.handle = savedStateHandle;
        }
    }

    public SavedStateHandle() {
        this.regular = new LinkedHashMap();
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new androidx.fragment.app.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, 2);
    }
}
