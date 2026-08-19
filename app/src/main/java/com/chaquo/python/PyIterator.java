package com.chaquo.python;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
abstract class PyIterator<T> implements Iterator<T> {
    private boolean hasNextElem = true;
    private PyObject iter;
    private PyObject nextElem;

    public PyIterator(MethodCache methodCache) {
        this.iter = methodCache.get("__iter__").call(new Object[0]);
        updateNext();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNextElem;
    }

    public abstract T makeNext(PyObject pyObject);

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tMakeNext = makeNext(this.nextElem);
        updateNext();
        return tMakeNext;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Python does not support removing from a container while iterating over it");
    }

    public void updateNext() {
        try {
            this.nextElem = this.iter.callAttr("__next__", new Object[0]);
        } catch (PyException e) {
            if (!e.getMessage().startsWith("StopIteration:")) {
                throw e;
            }
            this.hasNextElem = false;
            this.nextElem = null;
        }
    }
}
