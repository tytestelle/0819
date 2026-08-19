package O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo extends O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final byte[] f584O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f184O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(MessageDigest messageDigest) {
        messageDigest.update(f584O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
    }

    @Override // O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final Bitmap O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.f629O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setHasAlpha(bitmap.hasAlpha());
        O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(bitmap, bitmapO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, matrix);
        return bitmapO000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final boolean equals(Object obj) {
        return obj instanceof O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final int hashCode() {
        return -599754482;
    }
}
