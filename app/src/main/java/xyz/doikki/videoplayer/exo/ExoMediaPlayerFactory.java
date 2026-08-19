package xyz.doikki.videoplayer.exo;

import android.content.Context;
import androidx.annotation.OptIn;
import androidx.media3.common.util.UnstableApi;
import xyz.doikki.videoplayer.player.PlayerFactory;

/* JADX INFO: loaded from: classes2.dex */
public class ExoMediaPlayerFactory extends PlayerFactory<ExoMediaPlayer> {
    public static ExoMediaPlayerFactory create() {
        return new ExoMediaPlayerFactory();
    }

    @Override // xyz.doikki.videoplayer.player.PlayerFactory
    @OptIn(markerClass = {UnstableApi.class})
    public ExoMediaPlayer createPlayer(Context context) {
        return new ExoMediaPlayer(context);
    }
}
