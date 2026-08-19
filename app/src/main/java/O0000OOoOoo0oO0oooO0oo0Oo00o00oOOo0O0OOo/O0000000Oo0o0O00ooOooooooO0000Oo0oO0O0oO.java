package O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;

import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import xyz.doikki.videoplayer.player.AbstractPlayer;
import xyz.doikki.videoplayer.render.IRenderView;
import xyz.doikki.videoplayer.render.MeasureHelper;

/* JADX INFO: loaded from: classes.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends AppCompatImageView implements IRenderView {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final MeasureHelper f1040O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Context context) {
        super(context);
        this.f1040O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new MeasureHelper();
        setBackgroundColor(-16777216);
        setImageResource(R.drawable.back_icon);
        setScaleType(((Integer) Hawk.get("画面比例", Integer.valueOf(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1436O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO))).intValue());
        setVisibility(8);
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public final Bitmap doScreenShot() {
        setDrawingCacheEnabled(true);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getDrawingCache());
        setDrawingCacheEnabled(false);
        return bitmapCreateBitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int[] iArrDoMeasure = this.f1040O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.doMeasure(i, i2);
        setMeasuredDimension(iArrDoMeasure[0], iArrDoMeasure[1]);
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public final void release() {
        setImageDrawable(null);
    }

    @Override // android.view.View
    public void setRotation(float f) {
        if (f != getRotation()) {
            super.setRotation(f);
            requestLayout();
        }
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public void setScaleType(int i) {
        this.f1040O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setScreenScale(i);
        if (i == 3) {
            setScaleType(ImageView.ScaleType.FIT_XY);
            return;
        }
        if (i == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
        } else if (i != 5) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public void setVideoRotation(int i) {
        this.f1040O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setVideoRotation(i);
        setRotation(i);
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public View getView() {
        return this;
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public final void attachToPlayer(AbstractPlayer abstractPlayer) {
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public final void setVideoSize(int i, int i2) {
    }
}
