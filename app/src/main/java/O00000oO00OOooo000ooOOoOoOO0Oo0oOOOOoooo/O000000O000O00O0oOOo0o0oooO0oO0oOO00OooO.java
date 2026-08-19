package O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;

import O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
import O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00;
import O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
import O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
import O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o, O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Drawable f645O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ int f646O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Drawable drawable, int i) {
        this.f646O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(drawable, "Argument must not be null");
        this.f645O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = drawable;
    }

    @Override // O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o
    public final Class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        switch (this.f646O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            case 0:
                return this.f645O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
            default:
                return O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.class;
        }
    }

    @Override // O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o
    public final Object get() {
        Drawable drawable = this.f645O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o
    public final int getSize() {
        switch (this.f646O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            case 0:
                Drawable drawable = this.f645O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = ((O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) this.f645O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).f657O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f656O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f675O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                return (o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f169O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.length * 4) + o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f163O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.limit() + o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f168O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.length + o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f688O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
        }
    }

    @Override // O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00
    public void initialize() {
        switch (this.f646O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            case 1:
                ((O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) this.f645O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).f657O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f656O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f686O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.prepareToDraw();
                break;
            default:
                Drawable drawable = this.f645O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                    ((O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) drawable).f657O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f656O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f686O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.prepareToDraw();
                }
                break;
        }
    }

    @Override // O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o
    public final void recycle() {
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002;
        switch (this.f646O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            case 0:
                break;
            default:
                O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) this.f645O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.stop();
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f660O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = true;
                O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f657O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f656O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f677O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.clear();
                Bitmap bitmap = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f686O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                if (bitmap != null) {
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f679O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(bitmap);
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f686O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = null;
                }
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f680O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = false;
                O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f683O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f678O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null) {
                    o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f683O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = null;
                }
                O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f685O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
                if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 != null) {
                    o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1);
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f685O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = null;
                }
                O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f687O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2 != null) {
                    o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo2);
                    o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f687O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
                }
                O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f675O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f171O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = null;
                byte[] bArr = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f168O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f162O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (bArr != null && (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002 = (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) != null) {
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(bArr);
                }
                int[] iArr = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f169O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                if (iArr != null && (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) != null) {
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(iArr);
                }
                Bitmap bitmap2 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f172O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                if (bitmap2 != null) {
                    ((O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f77O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(bitmap2);
                }
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f172O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = null;
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f163O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
                o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f178O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = null;
                byte[] bArr2 = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f164O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                if (bArr2 != null && (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f78O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) != null) {
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(bArr2);
                }
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f684O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = true;
                break;
        }
    }

    private final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
    }
}
