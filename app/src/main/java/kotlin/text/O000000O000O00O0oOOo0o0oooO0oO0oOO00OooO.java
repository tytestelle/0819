package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements Iterator, O0000oOo00ooOO00OoO00OO0000OoooOoooooOoo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public int f4030O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = -1;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f4031O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public int f4032O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f4033O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public int f4034O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final /* synthetic */ O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f4035O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        this.f4035O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        int i = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4037O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int length = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4036O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.length();
        if (length < 0) {
            throw new IllegalArgumentException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        if (i < 0) {
            i = 0;
        } else if (i > length) {
            i = length;
        }
        this.f4031O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
        this.f4032O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:17:0x0073  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        int i = this.f4032O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (i < 0) {
            this.f4030O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;
            this.f4033O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
            return;
        }
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f4035O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        int i2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4038O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        String str = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4036O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i2 > 0) {
            int i3 = this.f4034O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 + 1;
            this.f4034O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i3;
            if (i3 >= i2) {
                this.f4033O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f4031O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(str), 1);
                this.f4032O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = -1;
            } else if (i > str.length() && (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4039O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.invoke(str, Integer.valueOf(this.f4032O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o))) != null) {
                int iIntValue = ((Number) o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.component1()).intValue();
                int iIntValue2 = ((Number) o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.component2()).intValue();
                this.f4033O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(this.f4031O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.f4031O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i4;
                this.f4032O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i4 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f4033O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f4031O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(str), 1);
                this.f4032O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = -1;
            }
        } else if (i > str.length()) {
            this.f4033O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(this.f4031O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(str), 1);
            this.f4032O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = -1;
        } else {
            int iIntValue3 = ((Number) o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.component1()).intValue();
            int iIntValue4 = ((Number) o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.component2()).intValue();
            this.f4033O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(this.f4031O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, iIntValue3);
            int i5 = iIntValue3 + iIntValue4;
            this.f4031O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i5;
            this.f4032O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i5 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f4030O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4030O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == -1) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
        return this.f4030O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4030O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == -1) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
        if (this.f4030O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 0) {
            throw new NoSuchElementException();
        }
        O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f4033O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f4033O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
        this.f4030O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = -1;
        return o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
