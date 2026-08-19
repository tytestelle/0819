package O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

import android.util.Log;
import androidx.core.view.InputDeviceCompat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 implements O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final byte[] f588O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final int[] f589O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        try {
            int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            if (!((iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o & 65496) == 65496 || iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == 19789 || iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == 18761)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                }
                return -1;
            }
            int iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
            if (iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, byte[].class);
            try {
                return O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, bArr, iO000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
            } finally {
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(bArr);
            }
        } catch (O000000oooOoo00ooo0O0000000o00O0Oooo0OOO unused) {
            return -1;
        }
    }

    public static ImageHeaderParser$ImageType O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        try {
            int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o << 8) | o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
            if (iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = (iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO << 8) | o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
            if (iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 == -1991225785) {
                o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.skip(21L);
                try {
                    return o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (O000000oooOoo00ooo0O0000000o00O0Oooo0OOO unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 == 1380533830) {
                o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.skip(4L);
                if (((o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() << 16) | o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() << 16) | o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                if ((iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 & InputDeviceCompat.SOURCE_ANY) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 & 255;
                if (i != 88) {
                    if (i != 76) {
                        return ImageHeaderParser$ImageType.WEBP;
                    }
                    o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.skip(4L);
                    return (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.skip(4L);
                short sO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                if ((sO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                return (sO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() << 16) | o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3 = (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() << 16) | o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3 == 1635150182;
            o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.skip(4L);
            int i3 = iO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o4 = (o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() << 16) | o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                    if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (O000000oooOoo00ooo0O0000000o00O0Oooo0OOO unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        short sO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        int iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        long j;
        long jSkip;
        do {
            short sO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
            if (sO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2));
                }
                return -1;
            }
            sO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
            if (sO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == 218) {
                return -1;
            }
            if (sO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() - 2;
            if (sO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == 225) {
                return iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            }
            j = iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            jSkip = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.skip(j);
        } while (jSkip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sbO00000OOoOOO00O00o0ooooooooO000ooooO0000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(sO000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, iO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, "Unable to skip enough data, type: ", ", wanted to skip: ", ", but actually skipped: ");
            sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.append(jSkip);
            Log.d("DfltImageHeaderParser", sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.toString());
        }
        return -1;
    }

    public static int O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int i2 = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.read(bArr, i);
        if (i2 != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + i2);
            }
            return -1;
        }
        short s = 1;
        int i3 = 0;
        byte[] bArr2 = f588O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        boolean z = bArr != null && i > bArr2.length;
        if (z) {
            for (int i4 = 0; i4 < bArr2.length; i4++) {
                if (bArr[i4] != bArr2[i4]) {
                    z = false;
                    break;
                }
            }
        }
        if (!z) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = new O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(bArr, i);
        short sO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(6);
        if (sO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != 18761) {
            if (sO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) sO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        ByteBuffer byteBuffer = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f587O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        byteBuffer.order(byteOrder);
        int i5 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
        short sO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i5 + 6);
        while (i3 < sO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2) {
            int i6 = (i3 * 12) + i5 + 8;
            short sO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3 = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i6);
            if (sO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3 == 274) {
                short sO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4 = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i6 + 2);
                if (sO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4 >= s && sO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4 <= 12) {
                    int i7 = i6 + 4;
                    int i8 = byteBuffer.remaining() - i7 >= 4 ? byteBuffer.getInt(i7) : -1;
                    if (i8 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sbO00000OOoOOO00O00o0ooooooooO000ooooO0000 = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOO00O00o0ooooooooO000ooooO0000(i3, sO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3, "Got tagIndex=", " tagType=", " formatCode=");
                            sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.append((int) sO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4);
                            sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.append(" componentCount=");
                            sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.append(i8);
                            Log.d("DfltImageHeaderParser", sbO00000OOoOOO00O00o0ooooooooO000ooooO0000.toString());
                        }
                        int i9 = i8 + f589O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO[sO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4];
                        if (i9 <= 4) {
                            int i10 = i6 + 8;
                            if (i10 >= 0 && i10 <= byteBuffer.remaining()) {
                                if (i9 >= 0 && i9 + i10 <= byteBuffer.remaining()) {
                                    return o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i10);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) sO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i10 + " tagType=" + ((int) sO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4));
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) sO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO4));
                }
            }
            i3++;
            s = 1;
        }
        return -1;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final ImageHeaderParser$ImageType O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(ByteBuffer byteBuffer) {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(byteBuffer, "Argument must not be null");
        return O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(byteBuffer));
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final ImageHeaderParser$ImageType O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(InputStream inputStream) {
        return O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(new O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(inputStream, 8));
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final int O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(ByteBuffer byteBuffer, O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(byteBuffer);
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, "Argument must not be null");
        return O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final int O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(InputStream inputStream, O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(inputStream, 8);
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, "Argument must not be null");
        return O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
    }
}
