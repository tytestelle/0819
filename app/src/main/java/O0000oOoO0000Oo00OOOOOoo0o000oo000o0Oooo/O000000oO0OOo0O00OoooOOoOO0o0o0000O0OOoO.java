package O0000oOoO0000Oo00OOOOOoo0o000oo000o0Oooo;

import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {
    public static final O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 Default = new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(null);

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f1675O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1670O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();

    public static /* synthetic */ byte[] nextBytes$default(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.nextBytes(bArr, i, i2);
    }

    public abstract int nextBits(int i);

    public abstract boolean nextBoolean();

    public abstract byte[] nextBytes(byte[] bArr);

    public byte[] nextBytes(byte[] array, int i, int i2) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(array, "array");
        if (i >= 0 && i <= new O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(0, array.length, 1).f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(0, array.length, 1);
            if (i2 >= 0 && i2 <= o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                if (i > i2) {
                    throw new IllegalArgumentException(("fromIndex (" + i + ") must be not greater than toIndex (" + i2 + ").").toString());
                }
                int i3 = (i2 - i) / 4;
                for (int i4 = 0; i4 < i3; i4++) {
                    int iNextInt = nextInt();
                    array[i] = (byte) iNextInt;
                    array[i + 1] = (byte) (iNextInt >>> 8);
                    array[i + 2] = (byte) (iNextInt >>> 16);
                    array[i + 3] = (byte) (iNextInt >>> 24);
                    i += 4;
                }
                int i5 = i2 - i;
                int iNextBits = nextBits(i5 * 8);
                for (int i6 = 0; i6 < i5; i6++) {
                    array[i + i6] = (byte) (iNextBits >>> (i6 * 8));
                }
                return array;
            }
        }
        StringBuilder sbO00000OOoOOO00O00o0ooooooooO000ooooO0000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(i, i2, "fromIndex (", ") or toIndex (", ") are out of range: 0..");
        sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.append(array.length);
        sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.append('.');
        throw new IllegalArgumentException(sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.toString().toString());
    }

    public abstract double nextDouble();

    public double nextDouble(double d) {
        return nextDouble(0.0d, d);
    }

    public abstract float nextFloat();

    public abstract int nextInt();

    public abstract int nextInt(int i);

    public int nextInt(int i, int i2) {
        int iNextInt;
        int i3;
        int iNextBits;
        if (i2 <= i) {
            throw new IllegalArgumentException(com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iNextBits = nextBits(31 - Integer.numberOfLeadingZeros(i4));
            } else {
                do {
                    iNextInt = nextInt() >>> 1;
                    i3 = iNextInt % i4;
                } while ((i4 - 1) + (iNextInt - i3) < 0);
                iNextBits = i3;
            }
            return i + iNextBits;
        }
        while (true) {
            int iNextInt2 = nextInt();
            if (i <= iNextInt2 && iNextInt2 < i2) {
                return iNextInt2;
            }
        }
    }

    public abstract long nextLong();

    public long nextLong(long j) {
        return nextLong(0L, j);
    }

    public double nextDouble(double d, double d2) {
        double dNextDouble;
        if (d2 <= d) {
            throw new IllegalArgumentException(com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Double.valueOf(d), Double.valueOf(d2)).toString());
        }
        double d3 = d2 - d;
        if (!Double.isInfinite(d3) || Double.isInfinite(d) || Double.isNaN(d) || Double.isInfinite(d2) || Double.isNaN(d2)) {
            dNextDouble = d + (nextDouble() * d3);
        } else {
            double d4 = 2;
            double dNextDouble2 = ((d2 / d4) - (d / d4)) * nextDouble();
            dNextDouble = d + dNextDouble2 + dNextDouble2;
        }
        return dNextDouble >= d2 ? Math.nextAfter(d2, Double.NEGATIVE_INFINITY) : dNextDouble;
    }

    public long nextLong(long j, long j2) {
        long jNextLong;
        long j3;
        long jNextBits;
        int iNextInt;
        if (j2 <= j) {
            throw new IllegalArgumentException(com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iNextInt = nextBits(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    iNextInt = nextInt();
                } else {
                    jNextBits = (((long) nextBits(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (((long) nextInt()) & 4294967295L);
                }
                jNextBits = ((long) iNextInt) & 4294967295L;
            } else {
                do {
                    jNextLong = nextLong() >>> 1;
                    j3 = jNextLong % j4;
                } while ((j4 - 1) + (jNextLong - j3) < 0);
                jNextBits = j3;
            }
            return j + jNextBits;
        }
        while (true) {
            long jNextLong2 = nextLong();
            if (j <= jNextLong2 && jNextLong2 < j2) {
                return jNextLong2;
            }
        }
    }

    public byte[] nextBytes(int i) {
        return nextBytes(new byte[i]);
    }
}
