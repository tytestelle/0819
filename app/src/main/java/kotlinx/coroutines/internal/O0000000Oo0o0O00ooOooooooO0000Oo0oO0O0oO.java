package kotlinx.coroutines.internal;

import androidx.media3.common.C;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import kotlinx.coroutines.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo;
import kotlinx.coroutines.O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
import kotlinx.coroutines.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
import kotlinx.coroutines.O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo;
import kotlinx.coroutines.O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f4110O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO("NO_DECISION", 1);

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f4111O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO("UNDEFINED", 1);

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f4112O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO("REUSABLE_CLAIMED", 1);

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f4113O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO("CONDITION_FALSE", 1);

    public static final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, Object obj, Function1 function1) {
        Object o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        if (!(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o)) {
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.resumeWith(obj);
            return;
        }
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        Throwable thM4exceptionOrNullimpl = O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m4exceptionOrNullimpl(obj);
        if (thM4exceptionOrNullimpl == null) {
            o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = function1 != null ? new kotlinx.coroutines.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(obj, function1) : obj;
        } else {
            o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = new kotlinx.coroutines.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(thM4exceptionOrNullimpl, false);
        }
        kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4117O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo context = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.getContext();
        kotlinx.coroutines.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4116O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.isDispatchNeeded(context)) {
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4118O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4079O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 1;
            o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.dispatch(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.getContext(), o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            return;
        }
        O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOoO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        if (o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOoO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f4084O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO >= IjkMediaMeta.AV_CH_WIDE_RIGHT) {
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4118O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4079O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = 1;
            o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOoO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            return;
        }
        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOoO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(true);
        try {
            O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = (O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.getContext().get(kotlinx.coroutines.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f4063O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            if (o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 == null || o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.isActive()) {
                Object obj2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f4119O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo context2 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.getContext();
                Object objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(context2, obj2);
                O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO o0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OOO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.f4140O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO ? O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001, context2, objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) : null;
                try {
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.resumeWith(obj);
                    if (o0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OOO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O == null || o0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OOO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o()) {
                        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(context2, objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    }
                } catch (Throwable th) {
                    if (o0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OOO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O == null || o0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OOO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o()) {
                        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(context2, objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = ((O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo) o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O();
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, cancellationExceptionO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.resumeWith(O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(cancellationExceptionO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O)));
            }
            while (o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOoO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0()) {
            }
        } catch (Throwable th2) {
            try {
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(th2, null);
            } finally {
                o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOoO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008a A[LOOP:0: B:26:0x005a->B:41:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x002a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x002a A[SYNTHETIC] */
    public static final long O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(String str, long j, long j2, long j3) {
        String property;
        boolean z;
        long j4;
        long j5;
        String str2;
        Long lValueOf;
        int iDigit;
        long j6;
        long j7;
        int i = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f4139O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        if (10 > new O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(2, 36, 1).f1677O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            throw new IllegalArgumentException("radix 10 was not in valid range " + new O0000oOoOo0OOo0O0o0O0oOoOo00OOOo0OO00O0o.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(2, 36, 1));
        }
        int length = property.length();
        if (length == 0) {
            str2 = property;
            lValueOf = null;
        } else {
            int i2 = 0;
            char cCharAt = property.charAt(0);
            long j8 = C.TIME_UNSET;
            if (cCharAt >= '0') {
                z = false;
                j4 = 0;
                j5 = -256204778801521550L;
                while (true) {
                    if (i2 >= length) {
                        str2 = property;
                        if (!z) {
                            j4 = -j4;
                        }
                        lValueOf = Long.valueOf(j4);
                    } else {
                        iDigit = Character.digit((int) property.charAt(i2), 10);
                        if (iDigit >= 0) {
                            if (j4 >= j5) {
                                if (j5 == -256204778801521550L) {
                                    str2 = property;
                                    j5 = j8 / ((long) 10);
                                    if (j4 < j5) {
                                    }
                                }
                                lValueOf = null;
                            } else {
                                str2 = property;
                            }
                            j6 = j4 * ((long) 10);
                            j7 = iDigit;
                            if (j6 >= j8 + j7) {
                                lValueOf = null;
                            } else {
                                j4 = j6 - j7;
                                i2++;
                                length = length;
                                property = str2;
                            }
                        }
                    }
                }
            } else if (length != 1) {
                if (cCharAt == '-') {
                    j8 = Long.MIN_VALUE;
                    i2 = 1;
                    z = true;
                    j4 = 0;
                    j5 = -256204778801521550L;
                    while (true) {
                        if (i2 >= length) {
                            str2 = property;
                            if (!z) {
                                j4 = -j4;
                            }
                            lValueOf = Long.valueOf(j4);
                        } else {
                            iDigit = Character.digit((int) property.charAt(i2), 10);
                            if (iDigit >= 0) {
                                if (j4 >= j5) {
                                    if (j5 == -256204778801521550L) {
                                        str2 = property;
                                        j5 = j8 / ((long) 10);
                                        if (j4 < j5) {
                                        }
                                    }
                                    lValueOf = null;
                                } else {
                                    str2 = property;
                                }
                                j6 = j4 * ((long) 10);
                                j7 = iDigit;
                                if (j6 >= j8 + j7) {
                                    lValueOf = null;
                                } else {
                                    j4 = j6 - j7;
                                    i2++;
                                    length = length;
                                    property = str2;
                                }
                            }
                        }
                    }
                } else {
                    if (cCharAt == '+') {
                        i2 = 1;
                        z = false;
                        j4 = 0;
                        j5 = -256204778801521550L;
                        while (true) {
                            if (i2 >= length) {
                                str2 = property;
                                if (!z) {
                                    j4 = -j4;
                                }
                                lValueOf = Long.valueOf(j4);
                            } else {
                                iDigit = Character.digit((int) property.charAt(i2), 10);
                                if (iDigit >= 0) {
                                    if (j4 >= j5) {
                                        str2 = property;
                                    } else if (j5 == -256204778801521550L) {
                                        str2 = property;
                                        j5 = j8 / ((long) 10);
                                        if (j4 < j5) {
                                        }
                                    }
                                    j6 = j4 * ((long) 10);
                                    j7 = iDigit;
                                    if (j6 >= j8 + j7) {
                                        j4 = j6 - j7;
                                        i2++;
                                        length = length;
                                        property = str2;
                                    }
                                }
                            }
                        }
                    }
                    lValueOf = null;
                }
            }
            str2 = property;
            lValueOf = null;
        }
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(str, i, i2, i3);
    }
}
