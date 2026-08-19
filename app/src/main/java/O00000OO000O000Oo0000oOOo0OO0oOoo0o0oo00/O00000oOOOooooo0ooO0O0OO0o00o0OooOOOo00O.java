package O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O implements Iterable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f321O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Iterable f322O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(Iterable iterable, int i) {
        this.f321O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f322O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f321O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return ((ArrayList) this.f322O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).iterator();
            default:
                return new com.google.common.base.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(this);
        }
    }
}
