package xyz.doikki.videoplayer.player;

import O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractPlayer extends FrameLayout {
    public static final int MEDIA_INFO_BUFFERING_END = 702;
    public static final int MEDIA_INFO_BUFFERING_START = 701;
    public static final int MEDIA_INFO_RENDERING_START = 3;
    public static final int MEDIA_INFO_VIDEO_ROTATION_CHANGED = 10001;
    protected PlayerEventListener mPlayerEventListener;

    public interface PlayerEventListener {
        void onAudioTrack(String str);

        void onCompletion();

        void onError();

        void onFps(int i);

        void onInfo(int i, int i2);

        void onPrepared();

        void onTrackList(List<O00000O00oOOo000000OOOo00OOOo0OooOO00OO0> list);

        void onVideoSizeChanged(int i, int i2);
    }

    public AbstractPlayer(@NonNull Context context) {
        super(context);
    }

    public abstract int getBufferedPercentage();

    public abstract long getCurrentPosition();

    public abstract long getDuration();

    public abstract float getSpeed();

    public abstract long getTcpSpeed();

    public abstract String getVideoBitrate();

    public abstract void initPlayer();

    public abstract boolean isAudio();

    public abstract boolean isPlaying();

    public abstract void pause();

    public abstract void prepareAsync();

    public abstract void release();

    public abstract void reset();

    public abstract void seekTo(long j);

    public abstract void setDataSource(AssetFileDescriptor assetFileDescriptor);

    public abstract void setDataSource(String str, Map<String, String> map);

    public abstract void setDisplay(SurfaceHolder surfaceHolder);

    public abstract void setLooping(boolean z);

    public abstract void setOptions();

    public void setPlayerEventListener(PlayerEventListener playerEventListener) {
        this.mPlayerEventListener = playerEventListener;
    }

    public boolean setScaleType(int i) {
        return false;
    }

    public abstract void setSpeed(float f);

    public abstract void setSurface(Surface surface);

    public abstract void setVolume(float f, float f2);

    public abstract void start();

    public abstract void stop();
}
