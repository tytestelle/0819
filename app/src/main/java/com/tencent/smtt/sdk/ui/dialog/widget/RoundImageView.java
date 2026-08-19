package com.tencent.smtt.sdk.ui.dialog.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.smtt.sdk.ui.dialog.a;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class RoundImageView extends ImageView {
    private Paint a;
    private Xfermode b;
    private Bitmap c;
    private float[] d;
    private RectF e;
    private int f;
    private WeakReference<Bitmap> g;
    private float h;
    private Path i;

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        this.f = Color.parseColor("#eaeaea");
        Paint paint = new Paint();
        this.a = paint;
        paint.setAntiAlias(true);
        this.i = new Path();
        this.d = new float[8];
        this.e = new RectF();
        this.h = a.a(context, 16.46f);
        int i = 0;
        while (true) {
            float[] fArr = this.d;
            if (i >= fArr.length) {
                return;
            }
            fArr[i] = this.h;
            i++;
        }
    }

    private Bitmap a() {
        Bitmap bitmapCreateBitmap = null;
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint(1);
            paint.setColor(-16777216);
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            float f = this.h;
            canvas.drawRoundRect(rectF, f, f, paint);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            th.printStackTrace();
            return bitmapCreateBitmap;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        this.g = null;
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            bitmap.recycle();
            this.c = null;
        }
        super.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        WeakReference<Bitmap> weakReference = this.g;
        Bitmap bitmap = weakReference == null ? null : weakReference.get();
        if (bitmap == null || bitmap.isRecycled()) {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f = intrinsicWidth;
                float f2 = intrinsicHeight;
                float fMax = Math.max((getWidth() * 1.0f) / f, (getHeight() * 1.0f) / f2);
                drawable.setBounds(0, 0, (int) (f * fMax), (int) (fMax * f2));
                drawable.draw(canvas2);
                Bitmap bitmap2 = this.c;
                if (bitmap2 == null || bitmap2.isRecycled()) {
                    this.c = a();
                }
                this.a.reset();
                this.a.setFilterBitmap(false);
                this.a.setXfermode(this.b);
                Bitmap bitmap3 = this.c;
                if (bitmap3 != null) {
                    canvas2.drawBitmap(bitmap3, 0.0f, 0.0f, this.a);
                }
                this.a.setXfermode(null);
                canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
                this.g = new WeakReference<>(bitmapCreateBitmap);
            }
        } else {
            this.a.setXfermode(null);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.a);
        }
        a(canvas, 1, this.f, this.e, this.d);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.e.set(0.5f, 0.5f, i - 0.5f, i2 - 0.5f);
    }

    private void a(int i, int i2) {
        this.i.reset();
        this.a.setStrokeWidth(i);
        this.a.setColor(i2);
        this.a.setStyle(Paint.Style.STROKE);
    }

    private void a(Canvas canvas, int i, int i2, RectF rectF, float[] fArr) {
        a(i, i2);
        this.i.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.i, this.a);
    }
}
