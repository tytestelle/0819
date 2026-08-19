package kotlin.collections;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo implements Iterator, O0000oOo00ooOO00OoO00OO0000OoooOoooooOoo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(nextLong());
    }

    public abstract long nextLong();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final Long next() {
        return Long.valueOf(nextLong());
    }
}
