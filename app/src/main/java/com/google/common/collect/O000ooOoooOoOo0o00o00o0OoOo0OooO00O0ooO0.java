package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000ooOoooOoOo0o00o00o0OoOo0OooO00O0ooO0 extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
