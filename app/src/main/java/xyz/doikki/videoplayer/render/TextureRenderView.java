package xyz.doikki.videoplayer.render;

import O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.Nullable;
import is.xyz.mpv.MPVLib;
import xyz.doikki.videoplayer.player.AbstractPlayer;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class TextureRenderView extends TextureView implements IRenderView, TextureView.SurfaceTextureListener {
    private final MeasureHelper mMeasureHelper;

    @Nullable
    private AbstractPlayer mMediaPlayer;
    public Surface mSurface;
    private SurfaceTexture mSurfaceTexture;

    public TextureRenderView(Context context) {
        super(context);
        this.mMeasureHelper = new MeasureHelper();
        setSurfaceTextureListener(this);
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public void attachToPlayer(AbstractPlayer abstractPlayer) {
        this.mMediaPlayer = abstractPlayer;
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public Bitmap doScreenShot() {
        return getBitmap();
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int[] iArrDoMeasure = this.mMeasureHelper.doMeasure(i, i2);
        setMeasuredDimension(iArrDoMeasure[0], iArrDoMeasure[1]);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        SurfaceTexture surfaceTexture2 = this.mSurfaceTexture;
        if (surfaceTexture2 != null) {
            setSurfaceTexture(surfaceTexture2);
            return;
        }
        this.mSurfaceTexture = surfaceTexture;
        Surface surface = new Surface(surfaceTexture);
        this.mSurface = surface;
        AbstractPlayer abstractPlayer = this.mMediaPlayer;
        if (abstractPlayer != null) {
            abstractPlayer.setSurface(surface);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.mMediaPlayer instanceof O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            MPVLib.setPropertyString("android-surface-size", i + "x" + i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public void release() {
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
        }
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public void setScaleType(int i) {
        MeasureHelper measureHelper = this.mMeasureHelper;
        AbstractPlayer abstractPlayer = this.mMediaPlayer;
        if (abstractPlayer != null && abstractPlayer.setScaleType(i)) {
            i = -1;
        }
        measureHelper.setScreenScale(i);
        requestLayout();
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public void setVideoRotation(int i) {
        this.mMeasureHelper.setVideoRotation(i);
        setRotation(i);
    }

    @Override // xyz.doikki.videoplayer.render.IRenderView
    public void setVideoSize(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.mMeasureHelper.setVideoSize(i, i2);
        requestLayout();
    }
}
