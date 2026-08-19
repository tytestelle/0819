package O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f577O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Object f578O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Object f579O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, Bitmap bitmap) {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(bitmap, "Bitmap must not be null");
        this.f578O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = bitmap;
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, "BitmapPool must not be null");
        this.f579O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    public static O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, bitmap);
    }

    @Override // O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o
    public final Class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        switch (this.f577O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o
    public final Object get() {
        switch (this.f577O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return (Bitmap) this.f578O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            default:
                return new BitmapDrawable((Resources) this.f578O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Bitmap) ((O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) this.f579O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).get());
        }
    }

    @Override // O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o
    public final int getSize() {
        switch (this.f577O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o((Bitmap) this.f578O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            default:
                return ((O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) this.f579O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).getSize();
        }
    }

    @Override // O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public final void initialize() {
        switch (this.f577O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((Bitmap) this.f578O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).prepareToDraw();
                break;
            default:
                O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o = (O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) this.f579O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o instanceof O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00) {
                    ((O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00) o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o).initialize();
                }
                break;
        }
    }

    @Override // O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o
    public final void recycle() {
        switch (this.f577O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ((O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) this.f579O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo((Bitmap) this.f578O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            default:
                ((O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) this.f579O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).recycle();
                break;
        }
    }

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Resources resources, O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(resources, "Argument must not be null");
        this.f578O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = resources;
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, "Argument must not be null");
        this.f579O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
    }
}
