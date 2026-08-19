package org.seamless.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Iterator {
    int nextIndex = 0;
    boolean removedCurrent = false;
    final Iterator<Object> wrapped;

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Collection collection) {
        this.wrapped = new CopyOnWriteArrayList(collection).iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.wrapped.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        this.removedCurrent = false;
        this.nextIndex++;
        return this.wrapped.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.nextIndex;
        if (i == 0) {
            throw new IllegalStateException("Call next() first");
        }
        if (this.removedCurrent) {
            throw new IllegalStateException("Already removed current, call next()");
        }
        synchronizedRemove(i - 1);
        this.removedCurrent = true;
    }

    public abstract void synchronizedRemove(int i);
}
