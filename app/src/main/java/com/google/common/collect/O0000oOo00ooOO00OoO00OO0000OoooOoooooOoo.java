package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000oOo00ooOO00OoO00OO0000OoooOoooooOoo extends O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo implements ConcurrentMap {
    @Override // com.google.common.collect.O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo, com.google.common.collect.O0000oOoOo0OOO000o0O0Oo00oO0000OoOOooO0o
    public abstract ConcurrentMap delegate();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    @CheckForNull
    public Object putIfAbsent(Object obj, Object obj2) {
        return delegate().putIfAbsent(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        return delegate().remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    @CheckForNull
    public Object replace(Object obj, Object obj2) {
        return delegate().replace(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public boolean replace(Object obj, Object obj2, Object obj3) {
        return delegate().replace(obj, obj2, obj3);
    }
}
