package O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 implements O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f633O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(int i) {
        this.f633O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    public final /* bridge */ /* synthetic */ boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        switch (this.f633O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0
    public final O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, int i, int i2, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        switch (this.f633O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return new O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o((Bitmap) obj, 0);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(drawable, 0);
                }
                return null;
            default:
                return new O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o((File) obj);
        }
    }
}
