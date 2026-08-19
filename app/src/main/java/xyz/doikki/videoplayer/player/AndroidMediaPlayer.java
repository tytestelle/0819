package xyz.doikki.videoplayer.player;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import xyz.doikki.videoplayer.util.PlayerUtils;

/* JADX INFO: loaded from: classes2.dex */
public class AndroidMediaPlayer extends AbstractPlayer implements MediaPlayer.OnErrorListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnInfoListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    protected Context mAppContext;
    private int mBufferedPercent;
    private boolean mIsPreparing;
    protected MediaPlayer mMediaPlayer;

    public AndroidMediaPlayer(Context context) {
        super(context);
        this.mAppContext = context.getApplicationContext();
    }

    private String formatBitrate(long j) {
        if (j >= 1000000) {
            return String.format(Locale.US, "%.2f Mbps", Double.valueOf(j / 1000000.0d));
        }
        if (j >= 1000) {
            return String.format(Locale.US, "%.0f Kbps", Double.valueOf(j / 1000.0d));
        }
        return j + " bps";
    }

    private boolean isVideo() {
        try {
            for (MediaPlayer.TrackInfo trackInfo : this.mMediaPlayer.getTrackInfo()) {
                if (trackInfo.getTrackType() == 1) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public String getAndroidPlayerVideoBitrate() {
        MediaPlayer.TrackInfo[] trackInfo = this.mMediaPlayer.getTrackInfo();
        if (trackInfo == null) {
            return null;
        }
        for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
            if (trackInfo2.getTrackType() == 1) {
                MediaFormat format = trackInfo2.getFormat();
                if (format == null || !format.containsKey(IjkMediaMeta.IJKM_KEY_BITRATE)) {
                    return null;
                }
                long integer = format.getInteger(IjkMediaMeta.IJKM_KEY_BITRATE);
                if (integer > 0) {
                    return formatBitrate(integer);
                }
                return null;
            }
        }
        return null;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public int getBufferedPercentage() {
        return this.mBufferedPercent;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public long getCurrentPosition() {
        return this.mMediaPlayer.getCurrentPosition();
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public long getDuration() {
        return this.mMediaPlayer.getDuration();
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public float getSpeed() {
        if (Build.VERSION.SDK_INT < 23) {
            return 1.0f;
        }
        try {
            float speed = this.mMediaPlayer.getPlaybackParams().getSpeed();
            if (speed == 0.0f) {
                return 1.0f;
            }
            return speed;
        } catch (Exception unused) {
            return 1.0f;
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public long getTcpSpeed() {
        return PlayerUtils.getNetSpeed(this.mAppContext);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public String getVideoBitrate() {
        return getAndroidPlayerVideoBitrate();
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void initPlayer() {
        this.mMediaPlayer = new MediaPlayer();
        setOptions();
        this.mMediaPlayer.setAudioStreamType(3);
        this.mMediaPlayer.setOnErrorListener(this);
        this.mMediaPlayer.setOnCompletionListener(this);
        this.mMediaPlayer.setOnInfoListener(this);
        this.mMediaPlayer.setOnBufferingUpdateListener(this);
        this.mMediaPlayer.setOnPreparedListener(this);
        this.mMediaPlayer.setOnVideoSizeChangedListener(this);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public boolean isAudio() {
        return false;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public boolean isPlaying() {
        return this.mMediaPlayer.isPlaying();
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.mBufferedPercent = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        this.mPlayerEventListener.onCompletion();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.mPlayerEventListener.onError();
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i != 3) {
            this.mPlayerEventListener.onInfo(i, i2);
            return true;
        }
        if (!this.mIsPreparing) {
            return true;
        }
        this.mPlayerEventListener.onInfo(i, i2);
        this.mIsPreparing = false;
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.mPlayerEventListener.onPrepared();
        start();
        if (isVideo()) {
            return;
        }
        this.mPlayerEventListener.onInfo(3, 0);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        int videoWidth = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        if (videoWidth != 0 && videoHeight != 0) {
            this.mPlayerEventListener.onVideoSizeChanged(videoWidth, videoHeight);
        }
        this.mPlayerEventListener.onTrackList(new ArrayList());
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void pause() {
        try {
            this.mMediaPlayer.pause();
        } catch (IllegalStateException unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void prepareAsync() {
        try {
            this.mIsPreparing = true;
            this.mMediaPlayer.prepareAsync();
        } catch (IllegalStateException unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void release() {
        this.mMediaPlayer.setOnErrorListener(null);
        this.mMediaPlayer.setOnCompletionListener(null);
        this.mMediaPlayer.setOnInfoListener(null);
        this.mMediaPlayer.setOnBufferingUpdateListener(null);
        this.mMediaPlayer.setOnPreparedListener(null);
        this.mMediaPlayer.setOnVideoSizeChangedListener(null);
        stop();
        final MediaPlayer mediaPlayer = this.mMediaPlayer;
        this.mMediaPlayer = null;
        new Thread() { // from class: xyz.doikki.videoplayer.player.AndroidMediaPlayer.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    mediaPlayer.release();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void reset() {
        stop();
        this.mMediaPlayer.reset();
        this.mMediaPlayer.setSurface(null);
        this.mMediaPlayer.setDisplay(null);
        this.mMediaPlayer.setVolume(1.0f, 1.0f);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void seekTo(long j) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                this.mMediaPlayer.seekTo(j, 3);
            } else {
                this.mMediaPlayer.seekTo((int) j);
            }
        } catch (IllegalStateException unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setDataSource(String str, Map<String, String> map) {
        try {
            this.mMediaPlayer.setDataSource(this.mAppContext, Uri.parse(str), map);
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        try {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.setDisplay(surfaceHolder);
            }
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setLooping(boolean z) {
        this.mMediaPlayer.setLooping(z);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setOptions() {
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setSpeed(float f) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                MediaPlayer mediaPlayer = this.mMediaPlayer;
                mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f));
            } catch (Exception unused) {
                this.mPlayerEventListener.onError();
            }
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setSurface(Surface surface) {
        try {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(surface);
            }
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setVolume(float f, float f2) {
        this.mMediaPlayer.setVolume(f, f2);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void start() {
        try {
            this.mMediaPlayer.start();
        } catch (IllegalStateException unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void stop() {
        try {
            this.mMediaPlayer.stop();
        } catch (IllegalStateException unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setDataSource(AssetFileDescriptor assetFileDescriptor) {
        try {
            this.mMediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }
}
