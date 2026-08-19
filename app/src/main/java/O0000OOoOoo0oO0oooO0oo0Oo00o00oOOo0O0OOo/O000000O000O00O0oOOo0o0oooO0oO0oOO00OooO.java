package O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;

import O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import android.graphics.Bitmap;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import is.xyz.mpv.MPVLib;
import xyz.doikki.videoplayer.player.AbstractPlayer;
import xyz.doikki.videoplayer.render.IRenderView;
import xyz.doikki.videoplayer.render.MeasureHelper;

/* JADX INFO: loaded from: classes.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO extends SurfaceView implements IRenderView, SurfaceHolder.Callback {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public MeasureHelper f1041O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public AbstractPlayer f1042O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public SurfaceHolder f1043O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public final void attachToPlayer(AbstractPlayer abstractPlayer) {
        this.f1042O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = abstractPlayer;
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public final Bitmap doScreenShot() {
        return null;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        int[] iArrDoMeasure = this.f1041O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.doMeasure(i, i2);
        setMeasuredDimension(iArrDoMeasure[0], iArrDoMeasure[1]);
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
        AbstractPlayer abstractPlayer = this.f1042O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (abstractPlayer != null && abstractPlayer.setScaleType(i)) {
            i = -1;
        }
        this.f1041O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setScreenScale(i);
        requestLayout();
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public void setVideoRotation(int i) {
        this.f1041O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setVideoRotation(i);
        setRotation(i);
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public final void setVideoSize(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.f1041O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setVideoSize(i, i2);
        requestLayout();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (this.f1042O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO instanceof O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            MPVLib.setPropertyString("android-surface-size", i2 + "x" + i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        AbstractPlayer abstractPlayer = this.f1042O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (abstractPlayer != null) {
            abstractPlayer.setDisplay(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        AbstractPlayer abstractPlayer = this.f1042O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (abstractPlayer != null) {
            abstractPlayer.setDisplay(null);
        }
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public View getView() {
        return this;
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public final void release() {
    }
}
