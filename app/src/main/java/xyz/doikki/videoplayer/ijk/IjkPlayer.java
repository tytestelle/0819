package xyz.doikki.videoplayer.ijk;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.annotation.OptIn;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.rtsp.RtspMediaSource;
import java.util.Locale;
import java.util.Map;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.misc.IjkMediaFormat;
import tv.danmaku.ijk.media.player.misc.IjkTrackInfo;
import xyz.doikki.videoplayer.player.AbstractPlayer;
import xyz.doikki.videoplayer.player.VideoViewManager;

/* JADX INFO: loaded from: classes2.dex */
public class IjkPlayer extends AbstractPlayer implements IMediaPlayer.OnErrorListener, IMediaPlayer.OnCompletionListener, IMediaPlayer.OnInfoListener, IMediaPlayer.OnBufferingUpdateListener, IMediaPlayer.OnPreparedListener, IMediaPlayer.OnVideoSizeChangedListener, IjkMediaPlayer.OnNativeInvokeListener, IMediaPlayer.OnTimedTextListener {
    protected final Context mAppContext;
    private int mBufferedPercent;
    protected IjkMediaPlayer mMediaPlayer;

    public IjkPlayer(Context context) {
        super(context);
        this.mAppContext = context;
    }

    private String audioTrack() {
        int selectedTrack = this.mMediaPlayer.getSelectedTrack(2);
        if (selectedTrack == -1) {
            return null;
        }
        String string = this.mMediaPlayer.getTrackInfo()[selectedTrack].getFormat().getString(IjkMediaFormat.KEY_IJK_CHANNEL_UI);
        if ("mono".equals(string)) {
            return "单声道";
        }
        if ("stereo".equals(string)) {
            return "立体声";
        }
        if ("3f".equals(string) || "60f".equals(string)) {
            return "5.1环绕声";
        }
        return ("2d63f".equals(string) || "2d03f".equals(string)) ? "三维菁彩声" : string;
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

    private int fps() {
        int selectedTrack = this.mMediaPlayer.getSelectedTrack(1);
        if (selectedTrack == -1) {
            return 0;
        }
        String string = this.mMediaPlayer.getTrackInfo()[selectedTrack].getFormat().getString(IjkMediaFormat.KEY_IJK_FRAME_RATE_UI);
        if ("N/A".equals(string)) {
            return 0;
        }
        return (int) Float.parseFloat(string);
    }

    private boolean isVideo() {
        IjkTrackInfo[] trackInfo = this.mMediaPlayer.getTrackInfo();
        if (trackInfo == null) {
            return false;
        }
        for (IjkTrackInfo ijkTrackInfo : trackInfo) {
            if (ijkTrackInfo.getTrackType() == 1) {
                return true;
            }
        }
        return false;
    }

    @OptIn(markerClass = {UnstableApi.class})
    private String videoBitrate() {
        int selectedTrack = this.mMediaPlayer.getSelectedTrack(1);
        return selectedTrack != -1 ? this.mMediaPlayer.getTrackInfo()[selectedTrack].getFormat().getString(IjkMediaFormat.KEY_IJK_BIT_RATE_UI) : "N/A";
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

    public String getIjkVideoBitrate() {
        long bitRate = this.mMediaPlayer.getBitRate();
        if (bitRate > 0) {
            return formatBitrate(bitRate);
        }
        long tcpSpeed = getTcpSpeed();
        if (tcpSpeed > 0) {
            return formatBitrate(tcpSpeed * 8);
        }
        long trafficStatisticByteCount = this.mMediaPlayer.getTrafficStatisticByteCount();
        long currentPosition = getCurrentPosition();
        if (trafficStatisticByteCount <= 0 || currentPosition <= 0) {
            return null;
        }
        return formatBitrate((trafficStatisticByteCount * RtspMediaSource.DEFAULT_TIMEOUT_MS) / currentPosition);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public float getSpeed() {
        return this.mMediaPlayer.getSpeed();
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public long getTcpSpeed() {
        return this.mMediaPlayer.getTcpSpeed();
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public String getVideoBitrate() {
        return getIjkVideoBitrate();
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void initPlayer() {
        this.mMediaPlayer = new IjkMediaPlayer();
        IjkMediaPlayer.native_setLogLevel(VideoViewManager.getConfig().mIsEnableLog ? 4 : 8);
        setOptions();
        this.mMediaPlayer.setOnErrorListener(this);
        this.mMediaPlayer.setOnCompletionListener(this);
        this.mMediaPlayer.setOnInfoListener(this);
        this.mMediaPlayer.setOnBufferingUpdateListener(this);
        this.mMediaPlayer.setOnPreparedListener(this);
        this.mMediaPlayer.setOnVideoSizeChangedListener(this);
        this.mMediaPlayer.setOnNativeInvokeListener(this);
        this.mMediaPlayer.setOnTimedTextListener(this);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public boolean isAudio() {
        return !isVideo();
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public boolean isPlaying() {
        return this.mMediaPlayer.isPlaying();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
        this.mBufferedPercent = i;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        this.mPlayerEventListener.onCompletion();
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        this.mPlayerEventListener.onError();
        return true;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
    public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
        this.mPlayerEventListener.onInfo(i, i2);
        return true;
    }

    @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener
    public boolean onNativeInvoke(int i, Bundle bundle) {
        return true;
    }

    public void onPrepared(IMediaPlayer iMediaPlayer) {
        this.mPlayerEventListener.onPrepared();
        if (isVideo()) {
            return;
        }
        this.mPlayerEventListener.onInfo(3, 0);
    }

    public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
        int videoWidth = iMediaPlayer.getVideoWidth();
        int videoHeight = iMediaPlayer.getVideoHeight();
        if (videoWidth != 0 && videoHeight != 0) {
            this.mPlayerEventListener.onVideoSizeChanged(videoWidth, videoHeight);
            requestLayout();
        }
        this.mPlayerEventListener.onAudioTrack(audioTrack());
        this.mPlayerEventListener.onFps(fps());
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
        this.mMediaPlayer.setOnTimedTextListener(null);
        new Thread() { // from class: xyz.doikki.videoplayer.ijk.IjkPlayer.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    IjkPlayer.this.mMediaPlayer.release();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void reset() {
        this.mMediaPlayer.reset();
        this.mMediaPlayer.setOnVideoSizeChangedListener(this);
        setOptions();
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void seekTo(long j) {
        try {
            this.mMediaPlayer.seekTo((int) j);
        } catch (IllegalStateException unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setDataSource(String str, Map<String, String> map) {
        try {
            Uri uri = Uri.parse(str);
            if ("android.resource".equals(uri.getScheme())) {
                this.mMediaPlayer.setDataSource(RawDataSourceProvider.create(this.mAppContext, uri));
            } else {
                this.mMediaPlayer.setDataSource(this.mAppContext, uri);
            }
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        this.mMediaPlayer.setDisplay(surfaceHolder);
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
        this.mMediaPlayer.setSpeed(f);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer
    public void setSurface(Surface surface) {
        this.mMediaPlayer.setSurface(surface);
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
            this.mMediaPlayer.setDataSource(new RawDataSourceProvider(assetFileDescriptor));
        } catch (Exception unused) {
            this.mPlayerEventListener.onError();
        }
    }
}
