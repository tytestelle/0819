package xyz.doikki.videoplayer.controller;

/* JADX INFO: loaded from: classes2.dex */
public interface IVideoController {
    int getCutoutHeight();

    boolean hasCutout();

    void hide();

    boolean isLocked();

    boolean isShowing();

    void setLocked(boolean z);

    void show();

    void startFadeOut();

    void startProgress();

    void stopFadeOut();

    void stopProgress();
}
