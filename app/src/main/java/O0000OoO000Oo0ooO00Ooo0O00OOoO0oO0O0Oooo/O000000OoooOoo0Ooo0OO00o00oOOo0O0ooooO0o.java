package O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo;

import java.math.RoundingMode;
import org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ int f1596O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(double d) {
        return com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(d) && (d == 0.0d || 52 - Long.numberOfTrailingZeros(com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(d)) <= Math.getExponent(d));
    }

    public static boolean O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(double d) {
        if (d <= 0.0d || !com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(d)) {
            return false;
        }
        long jO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(d);
        return (jO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 & (jO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 - 1)) == 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public static int O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(double d, RoundingMode roundingMode) {
        boolean zO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        boolean z = false;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("x must be positive and finite", d > 0.0d && com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(d));
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(d * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1595O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[roundingMode.ordinal()]) {
            case 1:
                O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(d));
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z = !O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(d);
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z = exponent < 0;
                zO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(d);
                z &= !zO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z = exponent >= 0;
                zO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(d);
                z &= !zO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z = true;
                }
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x009a  */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x009a, please report this as an issue */
    public static long O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(double d, RoundingMode roundingMode) {
        long j;
        double dRint;
        boolean z;
        if (!com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(d)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1595O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[roundingMode.ordinal()]) {
            case 1:
                O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(d));
                dRint = d;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 2:
                if (d >= 0.0d || O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(d)) {
                    dRint = d;
                } else {
                    j = ((long) d) - 1;
                    dRint = j;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 3:
                if (d <= 0.0d || O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(d)) {
                    dRint = d;
                } else {
                    j = ((long) d) + 1;
                    dRint = j;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 4:
                dRint = d;
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 5:
                if (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(d)) {
                    dRint = d;
                } else {
                    dRint = ((long) d) + ((long) (d > 0.0d ? 1 : -1));
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 6:
                dRint = Math.rint(d);
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 7:
                dRint = Math.rint(d);
                if (Math.abs(d - dRint) == 0.5d) {
                    dRint = Math.copySign(0.5d, d) + d;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 8:
                dRint = Math.rint(d);
                if (Math.abs(d - dRint) == 0.5d) {
                    dRint = d;
                }
                if ((-9.223372036854776E18d) - dRint < 1.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (dRint < 9.223372036854776E18d)) {
                    return (long) dRint;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            default:
                throw new AssertionError();
        }
    }
}
