package com.google.common.collect;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class O000oOOOOOo000O00o0O0OO00o0OoO0OOooOOOoO extends O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO {

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public transient long[] f3640O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public transient int f3641O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public transient int f3642O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    @Override // com.google.common.collect.O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        super.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        this.f3641O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = -2;
        this.f3642O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = -2;
    }

    @Override // com.google.common.collect.O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO
    public final int O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        int i = this.f3641O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    @Override // com.google.common.collect.O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO
    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i) {
        super.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i);
        this.f3641O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = -2;
        this.f3642O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = -2;
        long[] jArr = new long[i];
        this.f3640O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO
    public final void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(int i, Object obj, int i2, int i3) {
        super.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(i, obj, i2, i3);
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(this.f3642O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, i);
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, -2);
    }

    @Override // com.google.common.collect.O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO
    public final void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(int i) {
        int i2 = this.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o - 1;
        long j = this.f3640O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0[i];
        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO((int) (j >>> 32), (int) j);
        if (i < i2) {
            O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO((int) (this.f3640O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0[i2] >>> 32), i);
            O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, (int) this.f3640O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0[i2]);
        }
        super.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(i);
    }

    @Override // com.google.common.collect.O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO
    public final int O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(int i) {
        int i2 = (int) this.f3640O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0[i];
        if (i2 == -2) {
            return -1;
        }
        return i2;
    }

    @Override // com.google.common.collect.O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO
    public final int O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(int i, int i2) {
        return i == this.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o ? i2 : i;
    }

    @Override // com.google.common.collect.O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO
    public final void O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(int i) {
        super.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(i);
        long[] jArr = this.f3640O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        this.f3640O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i, -1L);
    }

    public final void O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(int i, int i2) {
        if (i == -2) {
            this.f3641O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = i2;
        } else {
            long[] jArr = this.f3640O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
            jArr[i] = (jArr[i] & (-4294967296L)) | (((long) i2) & 4294967295L);
        }
        if (i2 == -2) {
            this.f3642O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = i;
        } else {
            long[] jArr2 = this.f3640O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
            jArr2[i2] = (4294967295L & jArr2[i2]) | (((long) i) << 32);
        }
    }
}
