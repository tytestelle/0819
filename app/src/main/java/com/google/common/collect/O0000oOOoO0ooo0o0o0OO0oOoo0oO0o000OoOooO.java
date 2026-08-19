package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000oOOoO0ooo0o0o0OO0oOoo0oO0o000OoOooO extends O0000oOoOo0OOO000o0O0Oo00oO0000OoOOooO0o implements Collection {
    @Override // java.util.Collection
    @CanIgnoreReturnValue
    public boolean add(Object obj) {
        return delegate().add(obj);
    }

    @Override // java.util.Collection
    @CanIgnoreReturnValue
    public boolean addAll(Collection<Object> collection) {
        return delegate().addAll(collection);
    }

    @Override // java.util.Collection
    public void clear() {
        delegate().clear();
    }

    @Override // java.util.Collection
    public boolean contains(@CheckForNull Object obj) {
        return delegate().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return delegate().containsAll(collection);
    }

    @Override // com.google.common.collect.O0000oOoOo0OOO000o0O0Oo00oO0000OoOOooO0o
    public abstract Collection delegate();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return delegate().iterator();
    }

    @Override // java.util.Collection
    @CanIgnoreReturnValue
    public boolean remove(@CheckForNull Object obj) {
        return delegate().remove(obj);
    }

    @Override // java.util.Collection
    @CanIgnoreReturnValue
    public boolean removeAll(Collection<?> collection) {
        return delegate().removeAll(collection);
    }

    @Override // java.util.Collection
    @CanIgnoreReturnValue
    public boolean retainAll(Collection<?> collection) {
        return delegate().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return delegate().size();
    }

    public boolean standardAddAll(Collection<Object> collection) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, collection.iterator());
    }

    public void standardClear() {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(iterator());
    }

    public boolean standardContainsAll(Collection<?> collection) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(this, collection);
    }

    public boolean standardIsEmpty() {
        return !iterator().hasNext();
    }

    public boolean standardRetainAll(Collection<?> collection) {
        Iterator<Object> it = iterator();
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public <T> T[] standardToArray(T[] tArr) {
        int size = size();
        int i = 0;
        if (tArr.length < size) {
            if (tArr.length != 0) {
                tArr = (T[]) Arrays.copyOf(tArr, 0);
            }
            tArr = (T[]) Arrays.copyOf(tArr, size);
        }
        Iterator<Object> it = iterator();
        while (it.hasNext()) {
            tArr[i] = it.next();
            i++;
        }
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    public String standardToString() {
        int size = size();
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, IjkMediaMeta.AV_CH_STEREO_RIGHT));
        sb.append('[');
        boolean z = true;
        for (Object obj : this) {
            if (!z) {
                sb.append(", ");
            }
            if (obj == this) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return delegate().toArray();
    }

    @Override // java.util.Collection
    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        return (T[]) delegate().toArray(tArr);
    }

    public Object[] standardToArray() {
        return toArray(new Object[size()]);
    }
}
