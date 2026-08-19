package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oO0000O00000O00OOo0OOo0Oo000OoO0ooO0 extends O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {
    private static final long serialVersionUID = 0;
    transient com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O factory;

    public O000oO0000O00000O00OOo0OOo0Oo000OoO0ooO0(Map<Object, Collection<Object>> map, com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) {
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

    @Override // com.google.common.collect.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public List<Object> createCollection() {
        return (List) this.factory.get();
    }
}
