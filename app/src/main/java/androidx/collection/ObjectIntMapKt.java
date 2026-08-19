package androidx.collection;

import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public final class ObjectIntMapKt {
    private static final MutableObjectIntMap<Object> EmptyObjectIntMap = new MutableObjectIntMap<>(0);

    public static final <K> ObjectIntMap<K> emptyObjectIntMap() {
        MutableObjectIntMap<Object> mutableObjectIntMap = EmptyObjectIntMap;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(mutableObjectIntMap, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        return mutableObjectIntMap;
    }

    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf() {
        return new MutableObjectIntMap<>(0, 1, null);
    }

    public static final <K> ObjectIntMap<K> objectIntMap() {
        MutableObjectIntMap<Object> mutableObjectIntMap = EmptyObjectIntMap;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(mutableObjectIntMap, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.objectIntMap>");
        return mutableObjectIntMap;
    }

    public static final <K> ObjectIntMap<K> objectIntMapOf(K k, int i) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k, i);
        return mutableObjectIntMap;
    }

    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k, int i) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k, i);
        return mutableObjectIntMap;
    }

    public static final <K> ObjectIntMap<K> objectIntMapOf(K k, int i, K k2, int i2) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k, i);
        mutableObjectIntMap.set(k2, i2);
        return mutableObjectIntMap;
    }

    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k, int i, K k2, int i2) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k, i);
        mutableObjectIntMap.set(k2, i2);
        return mutableObjectIntMap;
    }

    public static final <K> ObjectIntMap<K> objectIntMapOf(K k, int i, K k2, int i2, K k3, int i3) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k, i);
        mutableObjectIntMap.set(k2, i2);
        mutableObjectIntMap.set(k3, i3);
        return mutableObjectIntMap;
    }

    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k, int i, K k2, int i2, K k3, int i3) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k, i);
        mutableObjectIntMap.set(k2, i2);
        mutableObjectIntMap.set(k3, i3);
        return mutableObjectIntMap;
    }

    public static final <K> ObjectIntMap<K> objectIntMapOf(K k, int i, K k2, int i2, K k3, int i3, K k4, int i4) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k, i);
        mutableObjectIntMap.set(k2, i2);
        mutableObjectIntMap.set(k3, i3);
        mutableObjectIntMap.set(k4, i4);
        return mutableObjectIntMap;
    }

    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k, int i, K k2, int i2, K k3, int i3, K k4, int i4) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k, i);
        mutableObjectIntMap.set(k2, i2);
        mutableObjectIntMap.set(k3, i3);
        mutableObjectIntMap.set(k4, i4);
        return mutableObjectIntMap;
    }

    public static final <K> ObjectIntMap<K> objectIntMapOf(K k, int i, K k2, int i2, K k3, int i3, K k4, int i4, K k5, int i5) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k, i);
        mutableObjectIntMap.set(k2, i2);
        mutableObjectIntMap.set(k3, i3);
        mutableObjectIntMap.set(k4, i4);
        mutableObjectIntMap.set(k5, i5);
        return mutableObjectIntMap;
    }

    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k, int i, K k2, int i2, K k3, int i3, K k4, int i4, K k5, int i5) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k, i);
        mutableObjectIntMap.set(k2, i2);
        mutableObjectIntMap.set(k3, i3);
        mutableObjectIntMap.set(k4, i4);
        mutableObjectIntMap.set(k5, i5);
        return mutableObjectIntMap;
    }
}
