package com.github.tvbox.osc.ui.tv.CustomView;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.github.tvbox.osc.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class MusicLoadingView extends View {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Paint f3323O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final RectF f3324O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public boolean f3325O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final int f3326O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final float f3327O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final int f3328O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final int f3329O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public final int f3330O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public final int f3331O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public final int f3332O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public final int f3333O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public final int f3334O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public final float f3335O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public int f3336O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public int f3337O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public boolean f3338O00000OOoOOO00O00o0ooooooooO000ooooO0000;

    /* JADX INFO: renamed from: O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, reason: collision with root package name */
    public int f3339O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

    /* JADX INFO: renamed from: O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o, reason: collision with root package name */
    public boolean f3340O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;

    /* JADX INFO: renamed from: O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o, reason: collision with root package name */
    public int f3341O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

    /* JADX INFO: renamed from: O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, reason: collision with root package name */
    public boolean f3342O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;

    /* JADX INFO: renamed from: O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, reason: collision with root package name */
    public final ArrayList f3343O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;

    /* JADX INFO: renamed from: O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, reason: collision with root package name */
    public final ArrayList f3344O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

    /* JADX INFO: renamed from: O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, reason: collision with root package name */
    public final ArrayList f3345O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;

    public MusicLoadingView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3325O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
        this.f3336O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = 0;
        this.f3343O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = new ArrayList();
        this.f3344O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = new ArrayList();
        this.f3345O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MusicLoadingView);
        this.f3328O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = typedArrayObtainStyledAttributes.getInteger(3, 1);
        this.f3329O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (int) typedArrayObtainStyledAttributes.getDimension(8, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(3.0f));
        this.f3326O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (int) typedArrayObtainStyledAttributes.getDimension(7, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(7.0f));
        this.f3331O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = typedArrayObtainStyledAttributes.getColor(2, Color.parseColor("#FFFFE105"));
        this.f3333O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = (int) typedArrayObtainStyledAttributes.getDimension(4, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(50.0f));
        this.f3334O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = (int) typedArrayObtainStyledAttributes.getDimension(5, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(10.0f));
        this.f3327O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = typedArrayObtainStyledAttributes.getFloat(1, 0.1f) * this.f3333O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        this.f3330O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = typedArrayObtainStyledAttributes.getInt(0, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(6.0f));
        this.f3335O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = typedArrayObtainStyledAttributes.getDimension(6, O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(3.0f));
        int i = this.f3328O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO * 3;
        int i2 = this.f3326O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        int i3 = this.f3329O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        this.f3332O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = ((i2 + i3) * i) + i3;
        int i4 = this.f3334O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
        this.f3337O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = i4;
        this.f3338O00000OOoOOO00O00o0ooooooooO000ooooO0000 = false;
        int i5 = this.f3333O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        this.f3339O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = (i4 + i5) / 2;
        this.f3340O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = true;
        this.f3341O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = i5;
        this.f3342O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = true;
        Paint paint = new Paint();
        this.f3323O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f3323O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setAntiAlias(true);
        this.f3323O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setColor(this.f3331O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
        RectF rectF = new RectF();
        this.f3324O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = rectF;
        rectF.left = 0.0f;
        rectF.right = this.f3329O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        for (int i6 = 0; i6 <= this.f3328O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO * 3; i6++) {
            if (i6 % 4 == 0) {
                this.f3343O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.add(Integer.valueOf(i6));
            } else if (i6 % 2 != 0) {
                this.f3344O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.add(Integer.valueOf(i6));
            } else {
                this.f3345O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.add(Integer.valueOf(i6));
            }
        }
    }

    public final int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i, boolean z) {
        int iMax = (int) (z ? Math.max(i - this.f3327O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, this.f3334O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) : Math.min(i + this.f3327O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, this.f3333O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O));
        this.f3336O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = iMax;
        return iMax;
    }

    public final boolean O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i, boolean z) {
        if (z) {
            if (i <= this.f3334O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
                return false;
            }
            return z;
        }
        if (i >= this.f3333O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) {
            return true;
        }
        return z;
    }

    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Canvas canvas, int i) {
        RectF rectF = this.f3324O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int i2 = this.f3329O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        float f = (this.f3326O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + i2) * i;
        rectF.left = f;
        rectF.right = f + i2;
        int i3 = this.f3333O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        rectF.top = i3 - this.f3336O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
        rectF.bottom = i3;
        float f2 = this.f3335O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        canvas.drawRoundRect(rectF, f2, f2, this.f3323O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }

    public final int O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.f3337O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, this.f3338O00000OOoOOO00O00o0ooooooooO000ooooO0000);
        this.f3337O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        this.f3338O00000OOoOOO00O00o0ooooooooO000ooooO0000 = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, this.f3338O00000OOoOOO00O00o0ooooooooO000ooooO0000);
        Iterator it = this.f3343O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.iterator();
        while (it.hasNext()) {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(canvas, ((Integer) it.next()).intValue());
        }
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.f3339O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, this.f3340O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
        this.f3339O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2;
        this.f3340O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2, this.f3340O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);
        Iterator it2 = this.f3344O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.iterator();
        while (it2.hasNext()) {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(canvas, ((Integer) it2.next()).intValue());
        }
        int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3 = O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.f3341O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o, this.f3342O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0);
        this.f3341O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3;
        this.f3342O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO3, this.f3342O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0);
        Iterator it3 = this.f3345O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.iterator();
        while (it3.hasNext()) {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(canvas, ((Integer) it3.next()).intValue());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.f3332O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, this.f3333O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
    }
}
