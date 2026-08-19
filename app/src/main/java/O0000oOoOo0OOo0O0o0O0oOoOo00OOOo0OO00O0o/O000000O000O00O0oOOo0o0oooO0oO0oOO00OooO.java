package O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements Iterable, O0000oOo00ooOO00OoO00OO0000OoooOoooooOoo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final int f1676O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final int f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final int f1678O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f1676O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                int i5 = i % i3;
                int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                i2 -= i6 < 0 ? i6 + i3 : i6;
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                int i9 = i2 % i7;
                int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                i2 += i10 < 0 ? i10 + i7 : i10;
            }
        }
        this.f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i2;
        this.f1678O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            if (!isEmpty() || !((O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) obj).isEmpty()) {
                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) obj;
                if (this.f1676O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1676O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO || this.f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO || this.f1678O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1678O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f1676O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO * 31) + this.f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) * 31) + this.f1678O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    public boolean isEmpty() {
        int i = this.f1678O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        int i2 = this.f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int i3 = this.f1676O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i > 0) {
            if (i3 <= i2) {
                return false;
            }
        } else if (i3 >= i2) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f1676O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, this.f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f1678O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int i2 = this.f1676O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int i3 = this.f1678O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
