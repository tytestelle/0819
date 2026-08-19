package O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;

import O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
import O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
import O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f643O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f644O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, int i) {
        this.f643O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f644O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    public final boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) throws IOException {
        switch (this.f643O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeO00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0((ArrayList) this.f644O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (ByteBuffer) obj);
                return imageHeaderParser$ImageTypeO00000O00oOOo000000OOOo00OOOo0OooOO00OO0 == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeO00000O00oOOo000000OOOo00OOOo0OooOO00OO0 == ImageHeaderParser$ImageType.ANIMATED_AVIF);
            default:
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f644O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo((ArrayList) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (InputStream) obj, (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                return imageHeaderParser$ImageTypeO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo == ImageHeaderParser$ImageType.ANIMATED_AVIF);
        }
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, int i, int i2, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        switch (this.f643O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(ImageDecoder.createSource((ByteBuffer) obj), i, i2, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
            default:
                return O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(ImageDecoder.createSource(O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO((InputStream) obj)), i, i2, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
        }
    }
}
