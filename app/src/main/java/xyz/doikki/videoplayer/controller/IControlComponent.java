package xyz.doikki.videoplayer.controller;

import android.view.View;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface IControlComponent {
    void attach(@NonNull ControlWrapper controlWrapper);

    @Nullable
    View getView();

    void onLockStateChanged(boolean z);

    void onPlayStateChanged(int i);

    void onPlayerStateChanged(int i);

    void onVisibilityChanged(boolean z, Animation animation);

    void setProgress(int i, int i2);
}
