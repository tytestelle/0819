package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo extends O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 implements O000OoOOOoOooO0OOOoOo00ooOO0OO0o0OOoOO00 {
    private static final long serialVersionUID = 6588350623831699109L;

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Map<Object, Collection<Object>> map) {
        super(map);
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public Map<Object, Collection<Object>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public abstract List<Object> createCollection();

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO
    public boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    @CanIgnoreReturnValue
    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues(obj, (Iterable<Object>) iterable);
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public Collection<Object> wrapCollection(Object obj, Collection<Object> collection) {
        return wrapList(obj, (List) collection, null);
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public List<Object> createUnmodifiableEmptyCollection() {
        return Collections.emptyList();
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public List<Object> get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    @CanIgnoreReturnValue
    public List<Object> removeAll(@CheckForNull Object obj) {
        return (List) super.removeAll(obj);
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    @CanIgnoreReturnValue
    public List<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        return (List) super.replaceValues(obj, iterable);
    }
}
