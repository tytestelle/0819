package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o extends O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 implements O000ooOoOooO000o00oo0Oo0oOO0oOoOo00Ooo0o {
    private static final long serialVersionUID = 7431625294878419160L;

    public O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(Map<Object, Collection<Object>> map) {
        super(map);
    }

    @Override // com.google.common.collect.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public Map<Object, Collection<Object>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public abstract Set<Object> createCollection();

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
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public Collection<Object> wrapCollection(Object obj, Collection<Object> collection) {
        return new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(this, obj, (Set) collection);
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public Set<Object> createUnmodifiableEmptyCollection() {
        return Collections.emptySet();
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public Set<Map.Entry<Object, Object>> entries() {
        return (Set) super.entries();
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, com.google.common.collect.O000o0oo0oOoo0OOooOOoo00o00000OoOO0OoO00
    public Set<Object> get(Object obj) {
        return (Set) super.get(obj);
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    @CanIgnoreReturnValue
    public Set<Object> removeAll(@CheckForNull Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // com.google.common.collect.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    @CanIgnoreReturnValue
    public Set<Object> replaceValues(Object obj, Iterable<Object> iterable) {
        return (Set) super.replaceValues(obj, iterable);
    }
}
