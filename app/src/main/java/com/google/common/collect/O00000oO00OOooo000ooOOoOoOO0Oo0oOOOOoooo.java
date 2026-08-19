package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo extends O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 implements Serializable {
    private static final long serialVersionUID = 0;
    transient O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO backingMap;
    transient long size;

    public O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(int i) {
        this.backingMap = newBackingMap(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        this.backingMap = newBackingMap(3);
        for (int i2 = 0; i2 < i; i2++) {
            add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(entrySet().size());
        for (O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0 : entrySet()) {
            objectOutputStream.writeObject(o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getElement());
            objectOutputStream.writeInt(o000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0.getCount());
        }
    }

    @Override // com.google.common.collect.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0, com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    @CanIgnoreReturnValue
    public final int add(Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i, "occurrences cannot be negative: %s", i > 0);
        int iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.backingMap.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(obj);
        if (iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == -1) {
            this.backingMap.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(i, obj);
            this.size += (long) i;
            return 0;
        }
        int iO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.backingMap.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
        long j = i;
        long j2 = ((long) iO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) + j;
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("too many occurrences: %s", j2, j2 <= 2147483647L);
        O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO = this.backingMap;
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3633O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO] = (int) j2;
        this.size += j;
        return iO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    public void addTo(O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o) {
        o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o.getClass();
        int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.backingMap.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
        while (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o >= 0) {
            O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO = this.backingMap;
            org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            o000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o.add(o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o], this.backingMap.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o));
            iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.backingMap.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.backingMap.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        this.size = 0L;
    }

    @Override // com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    public final int count(@CheckForNull Object obj) {
        return this.backingMap.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(obj);
    }

    @Override // com.google.common.collect.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0
    public final int distinctElements() {
        return this.backingMap.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // com.google.common.collect.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0
    public final Iterator<Object> elementIterator() {
        return new O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(this, 0);
    }

    @Override // com.google.common.collect.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0
    public final Iterator<O000oO0O0OO000oOO0OOO0oo0O0OO0OO00OOOoo0> entryIterator() {
        return new O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(this, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new O000oO0o00o0OOOoOOOooOOoO000oO0Oo0oOOOOO(this, entrySet().iterator());
    }

    public abstract O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO newBackingMap(int i);

    @Override // com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    @CanIgnoreReturnValue
    public final int remove(@CheckForNull Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i, "occurrences cannot be negative: %s", i > 0);
        int iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.backingMap.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(obj);
        if (iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == -1) {
            return 0;
        }
        int iO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.backingMap.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
        if (iO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 > i) {
            O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO = this.backingMap;
            org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3633O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO] = iO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 - i;
        } else {
            this.backingMap.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
            i = iO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        }
        this.size -= (long) i;
        return iO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    @Override // com.google.common.collect.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0, com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    @CanIgnoreReturnValue
    public final int setCount(Object obj, int i) {
        int iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, "count");
        O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO = this.backingMap;
        if (i == 0) {
            o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.getClass();
            iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(obj, O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(obj));
        } else {
            iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(i, obj);
        }
        this.size += (long) (i - iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
        return iO000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOO00O00o0ooooooooO000ooooO0000(this.size);
    }

    @Override // com.google.common.collect.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0, com.google.common.collect.O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o
    public final boolean setCount(Object obj, int i, int i2) {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i, "oldCount");
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i2, "newCount");
        int iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.backingMap.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(obj);
        if (iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.backingMap.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(i2, obj);
                this.size += (long) i2;
            }
            return true;
        }
        if (this.backingMap.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) != i) {
            return false;
        }
        if (i2 == 0) {
            this.backingMap.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
            this.size -= (long) i;
        } else {
            O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO = this.backingMap;
            org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            o000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO.f3633O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO] = i2;
            this.size += (long) (i2 - i);
        }
        return true;
    }
}
