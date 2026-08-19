package androidx.core.util;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import android.util.LongSparseArray;
import java.util.Iterator;
import kotlin.collections.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public final class LongSparseArrayKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.core.util.LongSparseArrayKt$valueIterator$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00281<T> implements Iterator<T>, O0000oOo00ooOO00OoO00OO0000OoooOoooooOoo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
        final /* synthetic */ LongSparseArray<T> $this_valueIterator;
        private int index;

        public C00281(LongSparseArray<T> longSparseArray) {
            this.$this_valueIterator = longSparseArray;
        }

        public final int getIndex() {
            return this.index;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_valueIterator.size();
        }

        @Override // java.util.Iterator
        public T next() {
            LongSparseArray<T> longSparseArray = this.$this_valueIterator;
            int i = this.index;
            this.index = i + 1;
            return longSparseArray.valueAt(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i) {
            this.index = i;
        }
    }

    public static final <T> boolean contains(LongSparseArray<T> longSparseArray, long j) {
        return longSparseArray.indexOfKey(j) >= 0;
    }

    public static final <T> boolean containsKey(LongSparseArray<T> longSparseArray, long j) {
        return longSparseArray.indexOfKey(j) >= 0;
    }

    public static final <T> boolean containsValue(LongSparseArray<T> longSparseArray, T t) {
        return longSparseArray.indexOfValue(t) >= 0;
    }

    public static final <T> void forEach(LongSparseArray<T> longSparseArray, Function2<? super Long, ? super T, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> function2) {
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            function2.invoke(Long.valueOf(longSparseArray.keyAt(i)), longSparseArray.valueAt(i));
        }
    }

    public static final <T> T getOrDefault(LongSparseArray<T> longSparseArray, long j, T t) {
        T t2 = longSparseArray.get(j);
        return t2 == null ? t : t2;
    }

    public static final <T> T getOrElse(LongSparseArray<T> longSparseArray, long j, Function0<? extends T> function0) {
        T t = longSparseArray.get(j);
        return t == null ? function0.invoke() : t;
    }

    public static final <T> int getSize(LongSparseArray<T> longSparseArray) {
        return longSparseArray.size();
    }

    public static final <T> boolean isEmpty(LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() != 0;
    }

    public static final <T> O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo keyIterator(final LongSparseArray<T> longSparseArray) {
        return new O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo() { // from class: androidx.core.util.LongSparseArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < longSparseArray.size();
            }

            @Override // kotlin.collections.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo
            public long nextLong() {
                LongSparseArray<T> longSparseArray2 = longSparseArray;
                int i = this.index;
                this.index = i + 1;
                return longSparseArray2.keyAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }

    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray2.size() + longSparseArray.size());
        putAll(longSparseArray3, longSparseArray);
        putAll(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    public static final <T> void putAll(LongSparseArray<T> longSparseArray, LongSparseArray<T> longSparseArray2) {
        int size = longSparseArray2.size();
        for (int i = 0; i < size; i++) {
            longSparseArray.put(longSparseArray2.keyAt(i), longSparseArray2.valueAt(i));
        }
    }

    public static final <T> boolean remove(LongSparseArray<T> longSparseArray, long j, T t) {
        int iIndexOfKey = longSparseArray.indexOfKey(j);
        if (iIndexOfKey < 0 || !O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(t, longSparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final <T> void set(LongSparseArray<T> longSparseArray, long j, T t) {
        longSparseArray.put(j, t);
    }

    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> longSparseArray) {
        return new C00281(longSparseArray);
    }
}
