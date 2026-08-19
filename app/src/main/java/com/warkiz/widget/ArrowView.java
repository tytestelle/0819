package com.warkiz.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes2.dex */
public class ArrowView extends View {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final int f3854O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final int f3855O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final Path f3856O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final Paint f3857O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public ArrowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(context, 12.0f);
        this.f3854O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
        int iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2 = O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(context, 7.0f);
        this.f3855O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2;
        Path path = new Path();
        this.f3856O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = path;
        path.moveTo(0.0f, 0.0f);
        float f = iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
        path.lineTo(f, 0.0f);
        path.lineTo(f / 2.0f, iO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO2);
        path.close();
        Paint paint = new Paint();
        this.f3857O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = paint;
        paint.setAntiAlias(true);
        paint.setStrokeWidth(1.0f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawPath(this.f3856O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, this.f3857O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f3854O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, this.f3855O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
    }

    public void setColor(int i) {
        this.f3857O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setColor(i);
        invalidate();
    }
}
