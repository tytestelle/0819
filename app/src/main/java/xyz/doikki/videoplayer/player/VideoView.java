package xyz.doikki.videoplayer.player;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class VideoView extends BaseVideoView<AbstractPlayer> {
    public VideoView(@NonNull Context context) {
        super(context);
    }

    public AbstractPlayer getMediaPlayer() {
        return this.mMediaPlayer;
    }

    public VideoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VideoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
