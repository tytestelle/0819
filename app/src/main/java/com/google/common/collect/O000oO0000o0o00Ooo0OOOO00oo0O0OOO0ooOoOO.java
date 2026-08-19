package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oO0000o0o00Ooo0OOOO00oo0O0OOO0ooOoOO extends O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o {
    private static final long serialVersionUID = 0;
    transient com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O factory;

    public O000oO0000o0o00Ooo0OOOO00oo0O0OOO0ooOoOO(Map<Object, Collection<Object>> map, com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) {
        super(map);
        o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.getClass();
        this.factory = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        this.factory = (com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) object;
        Object object2 = objectInputStream.readObject();
        Objects.requireNonNull(object2);
        setMap((Map) object2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.factory);
        objectOutputStream.writeObject(backingMap());
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO
    public Map<Object, Collection<Object>> createAsMap() {
        return createMaybeNavigableAsMap();
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO
    public Set<Object> createKeySet() {
        return createMaybeNavigableKeySet();
    }

    @Override // com.google.common.collect.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        if (collection instanceof NavigableSet) {
            return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO((NavigableSet) collection);
        }
        return collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection);
    }

    @Override // com.google.common.collect.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public Collection<Object> wrapCollection(Object obj, Collection<Object> collection) {
        if (collection instanceof NavigableSet) {
            return new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(this, obj, (NavigableSet) collection, null);
        }
        return collection instanceof SortedSet ? new O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(this, obj, (SortedSet) collection, null) : new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(this, obj, (Set) collection);
    }

    @Override // com.google.common.collect.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public Set<Object> createCollection() {
        return (Set) this.factory.get();
    }
}
