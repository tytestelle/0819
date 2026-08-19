package O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f575O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f576O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        this.f575O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;
        this.f576O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(5);
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    public final /* bridge */ /* synthetic */ boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        switch (this.f575O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(obj);
                break;
            default:
                break;
        }
        return true;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, int i, int i2, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        switch (this.f575O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(obj), i, i2, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO);
            default:
                return O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f576O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, ((O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) obj).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO());
        }
    }

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(ImageDecoder.Source source, int i, int i2, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i, i2, o000000oooOoo00ooo0O0000000o00O0Oooo0OOO));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo((O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) this.f576O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, bitmapDecodeBitmap);
    }

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        this.f575O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 1;
        this.f576O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }
}
