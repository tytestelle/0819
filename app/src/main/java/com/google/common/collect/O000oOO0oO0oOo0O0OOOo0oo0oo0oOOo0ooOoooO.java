package com.google.common.collect;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public transient Object[] f3632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public transient int[] f3633O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public transient int f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public transient int f3635O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public transient int[] f3636O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public transient long[] f3637O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public transient float f3638O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public transient int f3639O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    public O000oOO0oO0oOo0O0OOOo0oo0oo0oOOo0ooOoooO(int i) {
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i);
    }

    public void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        this.f3635O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo++;
        Arrays.fill(this.f3632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 0, this.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, (Object) null);
        Arrays.fill(this.f3633O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, 0, this.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, 0);
        Arrays.fill(this.f3636O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, -1);
        Arrays.fill(this.f3637O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, -1L);
        this.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 0;
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i) {
        if (i > this.f3637O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.length) {
            O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(i);
        }
        if (i >= this.f3639O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
            O00000OOoOOO00O00o0ooooooooO000ooooO0000(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    public int O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        return this.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == 0 ? -1 : 0;
    }

    public final int O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Object obj) {
        int iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(obj);
        if (iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == -1) {
            return 0;
        }
        return this.f3633O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO];
    }

    public final int O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(int i) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, this.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        return this.f3633O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i];
    }

    public final int O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Object obj) {
        int iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(obj);
        int[] iArr = this.f3636O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        int i = iArr[(iArr.length - 1) & iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o];
        while (i != -1) {
            long j = this.f3637O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[i];
            if (((int) (j >>> 32)) == iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o && com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj, this.f3632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("Initial capacity must be non-negative", i >= 0);
        int iMax = Math.max(i, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax > ((int) (((double) 1.0f) * ((double) iHighestOneBit)))) {
            int i2 = iHighestOneBit << 1;
            iHighestOneBit = i2 > 0 ? i2 : 1073741824;
        }
        int[] iArr = new int[iHighestOneBit];
        Arrays.fill(iArr, -1);
        this.f3636O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = iArr;
        this.f3638O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = 1.0f;
        this.f3632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new Object[i];
        this.f3633O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.f3637O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = jArr;
        this.f3639O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = Math.max(1, (int) (iHighestOneBit * 1.0f));
    }

    public void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(int i, Object obj, int i2, int i3) {
        this.f3637O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[i] = (((long) i3) << 32) | 4294967295L;
        this.f3632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[i] = obj;
        this.f3633O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i] = i2;
    }

    public void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(int i) {
        int i2 = this.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o - 1;
        if (i >= i2) {
            this.f3632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[i] = null;
            this.f3633O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i] = 0;
            this.f3637O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[i] = -1;
            return;
        }
        Object[] objArr = this.f3632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        objArr[i] = objArr[i2];
        int[] iArr = this.f3633O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        iArr[i] = iArr[i2];
        objArr[i2] = null;
        iArr[i2] = 0;
        long[] jArr = this.f3637O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        long j = jArr[i2];
        jArr[i] = j;
        jArr[i2] = -1;
        int[] iArr2 = this.f3636O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        int length = ((int) (j >>> 32)) & (iArr2.length - 1);
        int i3 = iArr2[length];
        if (i3 == i2) {
            iArr2[length] = i;
            return;
        }
        while (true) {
            long[] jArr2 = this.f3637O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
            long j2 = jArr2[i3];
            int i4 = (int) j2;
            if (i4 == i2) {
                jArr2[i3] = (j2 & (-4294967296L)) | (4294967295L & ((long) i));
                return;
            }
            i3 = i4;
        }
    }

    public int O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(int i) {
        int i2 = i + 1;
        if (i2 < this.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            return i2;
        }
        return -1;
    }

    public int O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(int i, int i2) {
        return i - 1;
    }

    public final int O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(int i, Object obj) {
        if (i <= 0) {
            throw new IllegalArgumentException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "count must be positive but was: "));
        }
        long[] jArr = this.f3637O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        Object[] objArr = this.f3632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int[] iArr = this.f3633O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o(obj);
        int[] iArr2 = this.f3636O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        int length = (iArr2.length - 1) & iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
        int i2 = this.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        int i3 = iArr2[length];
        if (i3 == -1) {
            iArr2[length] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (((int) (j >>> 32)) == iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o && com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
                int i5 = (int) j;
                if (i5 == -1) {
                    jArr[i3] = ((-4294967296L) & j) | (4294967295L & ((long) i2));
                    break;
                }
                i3 = i5;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i6 = i2 + 1;
        int length2 = this.f3637O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.length;
        if (i6 > length2) {
            int iMax = Math.max(1, length2 >>> 1) + length2;
            int i7 = iMax >= 0 ? iMax : Integer.MAX_VALUE;
            if (i7 != length2) {
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(i7);
            }
        }
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(i2, obj, i, iO0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o);
        this.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = i6;
        if (i2 >= this.f3639O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
            O00000OOoOOO00O00o0ooooooooO000ooooO0000(this.f3636O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.length * 2);
        }
        this.f3635O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo++;
        return 0;
    }

    public final int O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(Object obj, int i) {
        int[] iArr = this.f3636O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        int length = (iArr.length - 1) & i;
        int i2 = iArr[length];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.f3637O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[i2] >>> 32)) == i && com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj, this.f3632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[i2])) {
                int i4 = this.f3633O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[i2];
                if (i3 == -1) {
                    this.f3636O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0[length] = (int) this.f3637O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[i2];
                } else {
                    long[] jArr = this.f3637O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                    jArr[i3] = (jArr[i3] & (-4294967296L)) | (4294967295L & ((long) ((int) jArr[i2])));
                }
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(i2);
                this.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o--;
                this.f3635O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo++;
                return i4;
            }
            int i5 = (int) this.f3637O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[i2];
            if (i5 == -1) {
                return 0;
            }
            i3 = i2;
            i2 = i5;
        }
    }

    public final int O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(int i) {
        return O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(this.f3632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[i], (int) (this.f3637O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO[i] >>> 32));
    }

    public void O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(int i) {
        this.f3632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = Arrays.copyOf(this.f3632O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, i);
        this.f3633O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = Arrays.copyOf(this.f3633O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, i);
        long[] jArr = this.f3637O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.f3637O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = jArrCopyOf;
    }

    public final void O00000OOoOOO00O00o0ooooooooO000ooooO0000(int i) {
        if (this.f3636O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.length >= 1073741824) {
            this.f3639O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (i * this.f3638O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)) + 1;
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        long[] jArr = this.f3637O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        int i3 = i - 1;
        for (int i4 = 0; i4 < this.f3634O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o; i4++) {
            int i5 = (int) (jArr[i4] >>> 32);
            int i6 = i5 & i3;
            int i7 = iArr[i6];
            iArr[i6] = i4;
            jArr[i4] = (((long) i5) << 32) | (((long) i7) & 4294967295L);
        }
        this.f3639O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = i2;
        this.f3636O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = iArr;
    }
}
