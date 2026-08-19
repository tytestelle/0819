package O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;

import O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
import O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Bitmap.CompressFormat f696O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = Bitmap.CompressFormat.JPEG;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final int f697O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = 100;

    @Override // O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO
    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.get()).compress(this.f696O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, this.f697O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, byteArrayOutputStream);
        o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.recycle();
        return new O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(byteArrayOutputStream.toByteArray());
    }
}
