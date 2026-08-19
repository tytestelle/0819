package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00O0000oOoO0o0oO00oOoOO0o0oo0OO0OoO0o0O implements Iterator {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Iterator f3682O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O00O0000oOoO0o0oO00oOoOO0o0oo0OO0OoO0o0O(Iterator it) {
        it.getClass();
        this.f3682O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = it;
    }

    public abstract Object O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3682O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.f3682O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f3682O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.remove();
    }
}
