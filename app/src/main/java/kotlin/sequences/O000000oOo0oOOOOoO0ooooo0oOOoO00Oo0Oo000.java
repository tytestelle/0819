package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 extends O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements Iterator, kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, O0000oOo00ooOO00OoO00OO0000OoooOoooooOoo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public int f4020O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public Object f4021O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public Iterator f4022O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 f4023O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    @Override // kotlin.sequences.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj, O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
        this.f4021O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
        this.f4020O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 3;
        this.f4023O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        return kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.COROUTINE_SUSPENDED;
    }

    public final RuntimeException O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        int i = this.f4020O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f4020O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }

    @Override // kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo getContext() {
        return kotlin.coroutines.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.INSTANCE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f4020O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                }
                Iterator it = this.f4022O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(it);
                if (it.hasNext()) {
                    this.f4020O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 2;
                    return true;
                }
                this.f4022O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
            }
            this.f4020O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 5;
            kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f4023O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            this.f4023O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.resumeWith(O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO));
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f4020O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f4020O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 1;
            Iterator it = this.f4022O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(it);
            return it.next();
        }
        if (i != 3) {
            throw O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
        }
        this.f4020O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;
        Object obj = this.f4021O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.f4021O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final void resumeWith(Object obj) throws Throwable {
        O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO(obj);
        this.f4020O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 4;
    }
}
