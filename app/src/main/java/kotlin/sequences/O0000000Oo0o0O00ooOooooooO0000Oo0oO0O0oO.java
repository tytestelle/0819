package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final AtomicReference f4008O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
        this.f4008O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new AtomicReference(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
    }

    @Override // kotlin.sequences.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final Iterator iterator() {
        O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) this.f4008O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getAndSet(null);
        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != null) {
            return o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
