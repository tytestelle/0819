package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements Iterator, O0000oOo00ooOO00OoO00OO0000OoooOoooooOoo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3987O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f3988O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Object f3989O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Object[] array) {
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(array, "array");
        this.f3989O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3987O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return this.f3988O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO < ((O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) this.f3989O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).size();
            default:
                return this.f3988O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO < ((Object[]) this.f3989O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3987O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f3988O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                this.f3988O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i + 1;
                return ((O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) this.f3989O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).get(i);
            default:
                try {
                    Object[] objArr = (Object[]) this.f3989O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    int i2 = this.f3988O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    this.f3988O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f3988O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3987O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        this.f3989O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }
}
