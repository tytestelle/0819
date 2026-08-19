package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements Iterator, O0000oOo00ooOO00OoO00OO0000OoooOoooooOoo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Iterator f4010O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f4011O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = -1;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public Object f4012O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f4013O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        this.f4013O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        this.f4010O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00((O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4015O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        Object next;
        do {
            Iterator it = this.f4010O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (!it.hasNext()) {
                this.f4011O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) this.f4013O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4016O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).invoke(next)).booleanValue());
        this.f4012O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = next;
        this.f4011O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4011O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == -1) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
        return this.f4011O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4011O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == -1) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
        if (this.f4011O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f4012O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        this.f4012O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
        this.f4011O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
