package xyz.doikki.videoplayer.render;

import android.graphics.Bitmap;
import android.view.View;
import xyz.doikki.videoplayer.player.AbstractPlayer;

/* JADX INFO: loaded from: classes2.dex */
public interface IRenderView {
    void attachToPlayer(AbstractPlayer abstractPlayer);

    Bitmap doScreenShot();

    View getView();

    void release();

    void setScaleType(int i);

    void setVideoRotation(int i);

    void setVideoSize(int i, int i2);
}
