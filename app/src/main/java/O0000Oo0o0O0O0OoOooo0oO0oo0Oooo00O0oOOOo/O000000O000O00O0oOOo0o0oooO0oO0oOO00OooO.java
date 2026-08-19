package O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo;

import com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {
    static {
        new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(0);
    }

    public static byte[] O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static byte[] O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = inputStream.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(arrayDeque, i);
                }
                i2 += i3;
                i += i3;
            }
            iMin = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OOoOOO00O00o0ooooooooO000ooooO0000(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
