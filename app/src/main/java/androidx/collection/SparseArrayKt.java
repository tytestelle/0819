package androidx.collection;

import O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import O0000oOo00ooOO00OoO00OO0000OoooOoooooOoo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.util.Iterator;
import kotlin.collections.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public final class SparseArrayKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.collection.SparseArrayKt$valueIterator$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00241<T> implements Iterator<T>, O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
        final /* synthetic */ SparseArrayCompat<T> $this_valueIterator;
        private int index;

        public C00241(SparseArrayCompat<T> sparseArrayCompat) {
            this.$this_valueIterator = sparseArrayCompat;
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
            SparseArrayCompat<T> sparseArrayCompat = this.$this_valueIterator;
            int i = this.index;
            this.index = i + 1;
            return sparseArrayCompat.valueAt(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i) {
            this.index = i;
        }
    }

    public static final <T> boolean contains(SparseArrayCompat<T> sparseArrayCompat, int i) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(sparseArrayCompat, "<this>");
        return sparseArrayCompat.containsKey(i);
    }

    public static final <T> void forEach(SparseArrayCompat<T> sparseArrayCompat, Function2<? super Integer, ? super T, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO> action) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(sparseArrayCompat, "<this>");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(action, "action");
        int size = sparseArrayCompat.size();
        for (int i = 0; i < size; i++) {
            action.invoke(Integer.valueOf(sparseArrayCompat.keyAt(i)), sparseArrayCompat.valueAt(i));
        }
    }

    public static final <T> T getOrDefault(SparseArrayCompat<T> sparseArrayCompat, int i, T t) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(sparseArrayCompat, "<this>");
        return sparseArrayCompat.get(i, t);
    }

    public static final <T> T getOrElse(SparseArrayCompat<T> sparseArrayCompat, int i, Function0<? extends T> defaultValue) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(sparseArrayCompat, "<this>");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(defaultValue, "defaultValue");
        T t = sparseArrayCompat.get(i);
        return t == null ? defaultValue.invoke() : t;
    }

    public static final <T> int getSize(SparseArrayCompat<T> sparseArrayCompat) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(sparseArrayCompat, "<this>");
        return sparseArrayCompat.size();
    }

    public static final <T> boolean isNotEmpty(SparseArrayCompat<T> sparseArrayCompat) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(sparseArrayCompat, "<this>");
        return !sparseArrayCompat.isEmpty();
    }

    public static final <T> O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 keyIterator(final SparseArrayCompat<T> sparseArrayCompat) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(sparseArrayCompat, "<this>");
        return new O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000() { // from class: androidx.collection.SparseArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseArrayCompat.size();
            }

            @Override // kotlin.collections.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000
            public int nextInt() {
                SparseArrayCompat<T> sparseArrayCompat2 = sparseArrayCompat;
                int i = this.index;
                this.index = i + 1;
                return sparseArrayCompat2.keyAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }

    public static final <T> SparseArrayCompat<T> plus(SparseArrayCompat<T> sparseArrayCompat, SparseArrayCompat<T> other) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(sparseArrayCompat, "<this>");
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(other, "other");
        SparseArrayCompat<T> sparseArrayCompat2 = new SparseArrayCompat<>(other.size() + sparseArrayCompat.size());
        sparseArrayCompat2.putAll(sparseArrayCompat);
        sparseArrayCompat2.putAll(other);
        return sparseArrayCompat2;
    }

    public static final /* synthetic */ boolean remove(SparseArrayCompat sparseArrayCompat, int i, Object obj) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(sparseArrayCompat, "<this>");
        return sparseArrayCompat.remove(i, obj);
    }

    public static final <T> void set(SparseArrayCompat<T> sparseArrayCompat, int i, T t) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(sparseArrayCompat, "<this>");
        sparseArrayCompat.put(i, t);
    }

    public static final <T> Iterator<T> valueIterator(SparseArrayCompat<T> sparseArrayCompat) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(sparseArrayCompat, "<this>");
        return new C00241(sparseArrayCompat);
    }
}
