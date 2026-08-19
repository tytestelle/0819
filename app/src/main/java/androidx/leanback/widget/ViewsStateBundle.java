package androidx.leanback.widget;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.collection.LruCache;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ViewsStateBundle {
    private static final int LIMIT_DEFAULT = 100;
    private static final int UNLIMITED = Integer.MAX_VALUE;
    private LruCache<String, SparseArray<Parcelable>> mChildStates;
    private int mSavePolicy = 0;
    private int mLimitNumber = 100;

    private void applyPolicyChanges() {
        int i = this.mSavePolicy;
        if (i == 2) {
            if (this.mLimitNumber <= 0) {
                throw new IllegalArgumentException();
            }
            LruCache<String, SparseArray<Parcelable>> lruCache = this.mChildStates;
            if (lruCache == null || lruCache.maxSize() != this.mLimitNumber) {
                this.mChildStates = new LruCache<>(this.mLimitNumber);
                return;
            }
            return;
        }
        if (i != 3 && i != 1) {
            this.mChildStates = null;
            return;
        }
        LruCache<String, SparseArray<Parcelable>> lruCache2 = this.mChildStates;
        if (lruCache2 == null || lruCache2.maxSize() != Integer.MAX_VALUE) {
            this.mChildStates = new LruCache<>(Integer.MAX_VALUE);
        }
    }

    public static String getSaveStatesKey(int i) {
        return Integer.toString(i);
    }

    private void saveViewUnchecked(View view, int i) {
        if (this.mChildStates != null) {
            String saveStatesKey = getSaveStatesKey(i);
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            view.saveHierarchyState(sparseArray);
            this.mChildStates.put(saveStatesKey, sparseArray);
        }
    }

    public void clear() {
        LruCache<String, SparseArray<Parcelable>> lruCache = this.mChildStates;
        if (lruCache != null) {
            lruCache.evictAll();
        }
    }

    public int getLimitNumber() {
        return this.mLimitNumber;
    }

    public int getSavePolicy() {
        return this.mSavePolicy;
    }

    public void loadFromBundle(Bundle bundle) {
        LruCache<String, SparseArray<Parcelable>> lruCache = this.mChildStates;
        if (lruCache == null || bundle == null) {
            return;
        }
        lruCache.evictAll();
        for (String str : bundle.keySet()) {
            this.mChildStates.put(str, bundle.getSparseParcelableArray(str));
        }
    }

    public void loadView(View view, int i) {
        if (this.mChildStates != null) {
            SparseArray<Parcelable> sparseArrayRemove = this.mChildStates.remove(getSaveStatesKey(i));
            if (sparseArrayRemove != null) {
                view.restoreHierarchyState(sparseArrayRemove);
            }
        }
    }

    public void remove(int i) {
        LruCache<String, SparseArray<Parcelable>> lruCache = this.mChildStates;
        if (lruCache == null || lruCache.size() == 0) {
            return;
        }
        this.mChildStates.remove(getSaveStatesKey(i));
    }

    public Bundle saveAsBundle() {
        LruCache<String, SparseArray<Parcelable>> lruCache = this.mChildStates;
        if (lruCache == null || lruCache.size() == 0) {
            return null;
        }
        Map<String, SparseArray<Parcelable>> mapSnapshot = this.mChildStates.snapshot();
        Bundle bundle = new Bundle();
        for (Map.Entry<String, SparseArray<Parcelable>> entry : mapSnapshot.entrySet()) {
            bundle.putSparseParcelableArray(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public void saveOffscreenView(View view, int i) {
        int i2 = this.mSavePolicy;
        if (i2 == 1) {
            remove(i);
        } else if (i2 == 2 || i2 == 3) {
            saveViewUnchecked(view, i);
        }
    }

    public Bundle saveOnScreenView(Bundle bundle, View view, int i) {
        if (this.mSavePolicy != 0) {
            String saveStatesKey = getSaveStatesKey(i);
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            view.saveHierarchyState(sparseArray);
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(saveStatesKey, sparseArray);
        }
        return bundle;
    }

    public void setLimitNumber(int i) {
        this.mLimitNumber = i;
        applyPolicyChanges();
    }

    public void setSavePolicy(int i) {
        this.mSavePolicy = i;
        applyPolicyChanges();
    }
}
