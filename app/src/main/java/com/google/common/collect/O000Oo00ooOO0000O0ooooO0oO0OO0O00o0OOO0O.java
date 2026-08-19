package com.google.common.collect;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class O000Oo00ooOO0000O0ooooO0oO0OO0O00o0OOO0O implements Iterator {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public Iterator f3560O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public Iterator f3561O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public Iterator f3562O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public ArrayDeque f3563O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.f3561O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            it2.getClass();
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                Iterator it3 = this.f3562O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (it3 != null && it3.hasNext()) {
                    it = this.f3562O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    break;
                }
                ArrayDeque arrayDeque = this.f3563O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    it = null;
                    break;
                }
                this.f3562O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (Iterator) this.f3563O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.removeFirst();
            }
            this.f3562O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = it;
            if (it == null) {
                return false;
            }
            Iterator it4 = (Iterator) it.next();
            this.f3561O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = it4;
            if (it4 instanceof O000Oo00ooOO0000O0ooooO0oO0OO0O00o0OOO0O) {
                O000Oo00ooOO0000O0ooooO0oO0OO0O00o0OOO0O o000Oo00ooOO0000O0ooooO0oO0OO0O00o0OOO0O = (O000Oo00ooOO0000O0ooooO0oO0OO0O00o0OOO0O) it4;
                this.f3561O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000Oo00ooOO0000O0ooooO0oO0OO0O00o0OOO0O.f3561O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (this.f3563O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
                    this.f3563O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new ArrayDeque();
                }
                this.f3563O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.addFirst(this.f3562O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                if (o000Oo00ooOO0000O0ooooO0oO0OO0O00o0OOO0O.f3563O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo != null) {
                    while (!o000Oo00ooOO0000O0ooooO0oO0OO0O00o0OOO0O.f3563O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.isEmpty()) {
                        this.f3563O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.addFirst((Iterator) o000Oo00ooOO0000O0ooooO0oO0OO0O00o0OOO0O.f3563O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.removeLast());
                    }
                }
                this.f3562O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000Oo00ooOO0000O0ooooO0oO0OO0O00o0OOO0O.f3562O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            }
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Iterator it = this.f3561O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.f3560O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = it;
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator it = this.f3560O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (it == null) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        it.remove();
        this.f3560O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = null;
    }
}
