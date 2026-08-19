package O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public abstract class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000OOoOOO00O00o0ooooooooO000ooooO0000 {
    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000OOoOOO00O00o0ooooooooO000ooooO0000
    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(com.bumptech.glide.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, int i, int i2) {
        if (!O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = com.bumptech.glide.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).f2816O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Bitmap bitmap = (Bitmap) o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, bitmap, i, i2);
        return bitmap.equals(bitmapO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) ? o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o : O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, bitmapO000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
    }

    public abstract Bitmap O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, Bitmap bitmap, int i, int i2);
}
