package xyz.doikki.videoplayer.ijk;

import android.content.Context;
import xyz.doikki.videoplayer.player.PlayerFactory;

/* JADX INFO: loaded from: classes2.dex */
public class IjkPlayerFactory extends PlayerFactory<IjkPlayer> {
    public static IjkPlayerFactory create() {
        return new IjkPlayerFactory();
    }

    @Override // xyz.doikki.videoplayer.player.PlayerFactory
    public IjkPlayer createPlayer(Context context) {
        return new IjkPlayer(context);
    }
}
