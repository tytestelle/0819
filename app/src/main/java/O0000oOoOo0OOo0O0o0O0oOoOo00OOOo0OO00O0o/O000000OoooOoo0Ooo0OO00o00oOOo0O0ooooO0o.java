package O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o;

import java.util.NoSuchElementException;
import kotlin.collections.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final int f1679O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final int f1680O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public boolean f1681O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public int f1682O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i, int i2, int i3) {
        this.f1679O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i3;
        this.f1680O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f1681O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = z;
        this.f1682O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1681O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // kotlin.collections.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000
    public final int nextInt() {
        int i = this.f1682O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (i != this.f1680O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            this.f1682O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f1679O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + i;
        } else {
            if (!this.f1681O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                throw new NoSuchElementException();
            }
            this.f1681O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
        }
        return i;
    }
}
