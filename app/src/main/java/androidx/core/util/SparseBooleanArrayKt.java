package androidx.core.util;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import android.util.SparseBooleanArray;
import kotlin.collections.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
import kotlin.collections.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class SparseBooleanArrayKt {
    public static final boolean contains(SparseBooleanArray sparseBooleanArray, int i) {
        return sparseBooleanArray.indexOfKey(i) >= 0;
    }

    public static final boolean containsKey(SparseBooleanArray sparseBooleanArray, int i) {
        return sparseBooleanArray.indexOfKey(i) >= 0;
    }

    public static final boolean containsValue(SparseBooleanArray sparseBooleanArray, boolean z) {
        return sparseBooleanArray.indexOfValue(z) >= 0;
    }

    public static final void forEach(SparseBooleanArray sparseBooleanArray, Function2<? super Integer, ? super Boolean, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function2) {
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            function2.invoke(Integer.valueOf(sparseBooleanArray.keyAt(i)), Boolean.valueOf(sparseBooleanArray.valueAt(i)));
        }
    }

    public static final boolean getOrDefault(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        return sparseBooleanArray.get(i, z);
    }

    public static final boolean getOrElse(SparseBooleanArray sparseBooleanArray, int i, Function0<Boolean> function0) {
        int iIndexOfKey = sparseBooleanArray.indexOfKey(i);
        return iIndexOfKey >= 0 ? sparseBooleanArray.valueAt(iIndexOfKey) : function0.invoke().booleanValue();
    }

    public static final int getSize(SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size();
    }

    public static final boolean isEmpty(SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() == 0;
    }

    public static final boolean isNotEmpty(SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() != 0;
    }

    public static final O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 keyIterator(final SparseBooleanArray sparseBooleanArray) {
        return new O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000() { // from class: androidx.core.util.SparseBooleanArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseBooleanArray.size();
            }

            @Override // kotlin.collections.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000
            public int nextInt() {
                SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
                int i = this.index;
                this.index = i + 1;
                return sparseBooleanArray2.keyAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }

    public static final SparseBooleanArray plus(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray2.size() + sparseBooleanArray.size());
        putAll(sparseBooleanArray3, sparseBooleanArray);
        putAll(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    public static final void putAll(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray2.size();
        for (int i = 0; i < size; i++) {
            sparseBooleanArray.put(sparseBooleanArray2.keyAt(i), sparseBooleanArray2.valueAt(i));
        }
    }

    public static final boolean remove(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        int iIndexOfKey = sparseBooleanArray.indexOfKey(i);
        if (iIndexOfKey < 0 || z != sparseBooleanArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseBooleanArray.delete(i);
        return true;
    }

    public static final void set(SparseBooleanArray sparseBooleanArray, int i, boolean z) {
        sparseBooleanArray.put(i, z);
    }

    public static final O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O valueIterator(final SparseBooleanArray sparseBooleanArray) {
        return new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() { // from class: androidx.core.util.SparseBooleanArrayKt.valueIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseBooleanArray.size();
            }

            @Override // kotlin.collections.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O
            public boolean nextBoolean() {
                SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
                int i = this.index;
                this.index = i + 1;
                return sparseBooleanArray2.valueAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }
}
