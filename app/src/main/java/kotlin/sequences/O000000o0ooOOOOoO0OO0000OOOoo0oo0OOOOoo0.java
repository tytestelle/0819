package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements Iterator, O0000oOo00ooOO00OoO00OO0000OoooOoooooOoo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public Object f4017O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f4018O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = -2;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f4019O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        this.f4019O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        Object objInvoke;
        int i = this.f4018O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f4019O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (i == -2) {
            objInvoke = ((O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4015O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).invoke();
        } else {
            Object r0 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4016O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            Object obj = this.f4017O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(obj);
            objInvoke = r0.invoke(obj);
        }
        this.f4017O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = objInvoke;
        this.f4018O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4018O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO < 0) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
        return this.f4018O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4018O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO < 0) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
        if (this.f4018O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f4017O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f4018O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
