package O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00;

import androidx.media3.common.C;
import androidx.media3.exoplayer.MediaPeriodQueue;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final byte[] f1713O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final int[] f1714O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = {268435456, 16777216, 1048576, 65536, 4096, 256, 16, 1};

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final long[] f1715O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = {1000000000000000000L, 100000000000000000L, 10000000000000000L, 1000000000000000L, 100000000000000L, 10000000000000L, MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US, 100000000000L, 10000000000L, C.NANOS_PER_SECOND, 100000000, 10000000, 1000000, SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, Renderer.DEFAULT_DURATION_TO_PROGRESS_US, 1000, 100, 10, 1};

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, long j) {
        if (j < 0) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0((byte) 45);
            if (j == Long.MIN_VALUE) {
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0((byte) 57);
                j = 223372036854775808L;
            } else {
                j = -j;
            }
        }
        byte[] bArr = f1713O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (j < 10) {
            ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(bArr[(int) j]);
            return;
        }
        boolean z = false;
        for (int i = 0; i < 19; i++) {
            long[] jArr = f1715O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            long j2 = jArr[i];
            if (j >= j2) {
                long j3 = j / j2;
                ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(bArr[(int) j3]);
                j -= j3 * jArr[i];
                z = true;
            } else if (z) {
                ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0((byte) 48);
            }
        }
    }

    public static void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        if (i < 0) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0((byte) 45);
            if (i == Integer.MIN_VALUE) {
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0((byte) 56);
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0((byte) 48);
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0((byte) 48);
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0((byte) 48);
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0((byte) 48);
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0((byte) 48);
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0((byte) 48);
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0((byte) 48);
                return;
            }
            i = -i;
        }
        byte[] bArr = f1713O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i < 16) {
            ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(bArr[i]);
            return;
        }
        boolean z = false;
        for (int i2 = 0; i2 < 8; i2++) {
            int[] iArr = f1714O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            int i3 = iArr[i2];
            if (i >= i3) {
                int i4 = i / i3;
                ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(bArr[i4]);
                i -= i4 * iArr[i2];
                z = true;
            } else if (z) {
                ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0((byte) 48);
            }
        }
    }

    public static String O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 instanceof O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
            return o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.toString();
        }
        Charset charset = org.eclipse.jetty.util.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f4476O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
        try {
            byte[] bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
            return bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo != null ? new String(bArrO000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(), charset) : new String(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(), 0, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O(), charset);
        } catch (Exception e) {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1691O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O).O00000OOoOOO00O00o0ooooooooO000ooooO0000(e);
            return new String(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(), 0, o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O());
        }
    }

    public static int O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        for (int i2 = ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o; i2 < ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo; i2++) {
            byte bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i2);
            if (bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 > 32) {
                if (bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 >= 48 && bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 <= 57) {
                    i = (bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 - 48) + (i * 10);
                    z = true;
                } else {
                    if (bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != 45 || z) {
                        break;
                    }
                    z2 = true;
                }
            } else {
                if (z) {
                    break;
                }
            }
        }
        if (z) {
            return z2 ? -i : i;
        }
        throw new NumberFormatException(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.toString());
    }

    public static long O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        for (int i = ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).f1694O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o; i < ((O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).f1695O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo; i++) {
            byte bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i);
            if (bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 > 32) {
                if (bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 >= 48 && bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 <= 57) {
                    j = (j * 10) + ((long) (bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 - 48));
                    z = true;
                } else {
                    if (bO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 != 45 || z) {
                        break;
                    }
                    z2 = true;
                }
            } else {
                if (z) {
                    break;
                }
            }
        }
        if (z) {
            return z2 ? -j : j;
        }
        throw new NumberFormatException(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.toString());
    }
}
