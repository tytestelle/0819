package kotlin.sequences;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 implements Iterator, O0000oOo00ooOO00OoO00OO0000OoooOoooooOoo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Iterator f4027O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f4028O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
        this.f4028O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        this.f4027O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = ((O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f4015O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4027O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO] */
    @Override // java.util.Iterator
    public final Object next() {
        return ((kotlin.jvm.internal.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) this.f4028O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f4016O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).invoke(this.f4027O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
