package O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* JADX INFO: loaded from: classes.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO extends ShapeDrawable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Paint f40O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final String f41O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final int f42O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final int f43O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final int f44O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        super(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f37O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
        this.f42O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f35O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        this.f43O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f34O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        this.f41O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f32O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int i = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f33O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.f44O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f39O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        Paint paint = new Paint();
        this.f40O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = paint;
        paint.setColor(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f38O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
        paint.setAntiAlias(true);
        paint.setFakeBoldText(false);
        paint.setStyle(Paint.Style.FILL);
        paint.setTypeface(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f36O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        paint.setTextAlign(Paint.Align.CENTER);
        float f = 0;
        paint.setStrokeWidth(f);
        Paint paint2 = new Paint();
        paint2.setColor(Color.rgb((int) (Color.red(i) * 0.9f), (int) (Color.green(i) * 0.9f), (int) (Color.blue(i) * 0.9f)));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(f);
        getPaint().setColor(i);
    }

    public static O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f32O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = "";
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f33O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = -7829368;
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f38O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = -1;
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f34O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = -1;
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f35O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = -1;
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f37O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new RectShape();
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f36O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = Typeface.create("sans-serif-light", 0);
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f39O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = -1;
        return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Rect bounds = getBounds();
        int iSave = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        int iWidth = this.f43O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (iWidth < 0) {
            iWidth = bounds.width();
        }
        int iHeight = this.f42O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (iHeight < 0) {
            iHeight = bounds.height();
        }
        int iMin = this.f44O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        if (iMin < 0) {
            iMin = Math.min(iWidth, iHeight) / 2;
        }
        Paint paint = this.f40O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        paint.setTextSize(iMin);
        canvas.drawText(this.f41O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, iWidth / 2, (iHeight / 2) - ((paint.ascent() + paint.descent()) / 2.0f), paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f42O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f43O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f40O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setAlpha(i);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f40O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setColorFilter(colorFilter);
    }
}
