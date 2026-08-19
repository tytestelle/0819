package androidx.collection;

import O0000oOo00ooOO00OoO00OO0000OoooOoooooOoo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class IndexBasedArrayIterator<T> implements Iterator<T>, O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    private boolean canRemove;
    private int index;
    private int size;

    public IndexBasedArrayIterator(int i) {
        this.size = i;
    }

    public abstract T elementAt(int i);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.size;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tElementAt = elementAt(this.index);
        this.index++;
        this.canRemove = true;
        return tElementAt;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.canRemove) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.index - 1;
        this.index = i;
        removeAt(i);
        this.size--;
        this.canRemove = false;
    }

    public abstract void removeAt(int i);
}
