package O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends Drawable implements O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, Animatable, Animatable2Compat {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f657O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public boolean f658O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public boolean f659O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public boolean f660O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public int f662O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public boolean f664O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public Paint f665O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public Rect f666O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public ArrayList f667O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public boolean f661O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = true;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final int f663O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = -1;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, "Argument must not be null");
        this.f657O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f660O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = this.f657O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f656O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f675O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f171O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f147O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == 1) {
            invalidateSelf();
            return;
        }
        if (this.f658O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            return;
        }
        this.f658O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = true;
        if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f684O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f677O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f680O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f680O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = true;
            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f684O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = false;
            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
        invalidateSelf();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final void clearAnimationCallbacks() {
        ArrayList arrayList = this.f667O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f660O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) {
            return;
        }
        if (this.f664O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f666O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO == null) {
                this.f666O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f666O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO);
            this.f664O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = false;
        }
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = this.f657O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f656O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f683O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        Bitmap bitmap = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 != null ? o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f672O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 : o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f686O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        if (this.f666O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO == null) {
            this.f666O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = new Rect();
        }
        Rect rect = this.f666O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        if (this.f665O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null) {
            this.f665O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f665O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f657O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f657O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f656O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f690O00000OOoOOO00O00o0ooooooooO000ooooO0000;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f657O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f656O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f689O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f658O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f664O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = true;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.f667O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O == null) {
            this.f667O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = new ArrayList();
        }
        this.f667O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f665O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null) {
            this.f665O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new Paint(2);
        }
        this.f665O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f665O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null) {
            this.f665O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new Paint(2);
        }
        this.f665O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f660O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        this.f661O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = z;
        if (!z) {
            this.f658O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = false;
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = this.f657O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f656O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            ArrayList arrayList = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f677O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f680O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = false;
            }
        } else if (this.f659O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f659O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = true;
        this.f662O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = 0;
        if (this.f661O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) {
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f659O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
        this.f658O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = false;
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = this.f657O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f656O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        ArrayList arrayList = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f677O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f680O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = false;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        ArrayList arrayList = this.f667O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        if (arrayList == null || animationCallback == null) {
            return false;
        }
        return arrayList.remove(animationCallback);
    }
}
