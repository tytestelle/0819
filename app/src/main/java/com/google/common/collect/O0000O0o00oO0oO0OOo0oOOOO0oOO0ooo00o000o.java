package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o extends O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo {
    private static final long serialVersionUID = 0;
    transient int expectedValuesPerKey;

    public O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(int i, int i2) {
        super(O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.createWithExpectedSize(i));
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i2, "expectedValuesPerKey");
        this.expectedValuesPerKey = i2;
    }

    public static <K, V> O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o create() {
        return new O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(12, 3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.expectedValuesPerKey = 3;
        int i = objectInputStream.readInt();
        setMap(O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.create());
        for (int i2 = 0; i2 < i; i2++) {
            Collection collection = get(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo(this, objectOutputStream);
    }

    @Override // com.google.common.collect.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public /* bridge */ /* synthetic */ boolean containsEntry(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public /* bridge */ /* synthetic */ boolean containsKey(@CheckForNull Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO
    public /* bridge */ /* synthetic */ boolean containsValue(@CheckForNull Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public /* bridge */ /* synthetic */ Collection entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO
    public /* bridge */ /* synthetic */ boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public /* bridge */ /* synthetic */ List get(Object obj) {
        return super.get(obj);
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO
    public /* bridge */ /* synthetic */ O000oO0O0o0oo00OOo0Oooo0000O0O0o0oO00o0o keys() {
        return super.keys();
    }

    @Override // com.google.common.collect.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00 o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00) {
        return super.putAll(o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00);
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ List removeAll(@CheckForNull Object obj) {
        return super.removeAll(obj);
    }

    @Override // com.google.common.collect.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ List replaceValues(Object obj, Iterable iterable) {
        return super.replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Deprecated
    public void trimToSize() {
        Iterator<Collection<Object>> it = backingMap().values().iterator();
        while (it.hasNext()) {
            ((ArrayList) it.next()).trimToSize();
        }
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    @Override // com.google.common.collect.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public List<Object> createCollection() {
        return new ArrayList(this.expectedValuesPerKey);
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    public static <K, V> O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o create(int i, int i2) {
        return new O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(i, i2);
    }

    public static <K, V> O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o create(O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00 o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00) {
        O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o o0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o = new O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00.keySet().size(), o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00 instanceof O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o ? ((O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o) o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00).expectedValuesPerKey : 3);
        o0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.putAll(o000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00);
        return o0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o;
    }
}
