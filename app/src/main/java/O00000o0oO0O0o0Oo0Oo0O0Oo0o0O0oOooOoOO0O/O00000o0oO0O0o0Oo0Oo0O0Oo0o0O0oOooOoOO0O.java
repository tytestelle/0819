package O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O implements O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {
    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final ImageHeaderParser$ImageType O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final ImageHeaderParser$ImageType O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final int O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(ByteBuffer byteBuffer, O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        AtomicReference atomicReference = O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f804O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(new O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(byteBuffer), o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000
    public final int O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(InputStream inputStream, O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }
}
