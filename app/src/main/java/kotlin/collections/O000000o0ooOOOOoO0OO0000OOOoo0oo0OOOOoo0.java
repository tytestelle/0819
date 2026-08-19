package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 extends O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements ListIterator {

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f3990O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, int i) {
        super(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        this.f3990O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.Companion;
        int size = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.size();
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getClass();
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(i, size);
        this.f3988O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3988O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3988O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f3988O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO - 1;
        this.f3988O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
        return this.f3990O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3988O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
