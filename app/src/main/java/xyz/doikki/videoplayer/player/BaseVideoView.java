package xyz.doikki.videoplayer.player;

import O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
import O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.InputDeviceCompat;
import androidx.media3.datasource.RawResourceDataSource;
import com.github.tvbox.osc.R$styleable;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.orhanobut.hawk.Hawk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import xyz.doikki.videoplayer.controller.BaseVideoController;
import xyz.doikki.videoplayer.controller.MediaPlayerControl;
import xyz.doikki.videoplayer.player.AbstractPlayer;
import xyz.doikki.videoplayer.render.IRenderView;
import xyz.doikki.videoplayer.render.RenderViewFactory;
import xyz.doikki.videoplayer.render.TextureRenderView;
import xyz.doikki.videoplayer.util.L;
import xyz.doikki.videoplayer.util.PlayerUtils;

/* JADX INFO: loaded from: classes2.dex */
public class BaseVideoView<P extends AbstractPlayer> extends FrameLayout implements MediaPlayerControl, AbstractPlayer.PlayerEventListener {
    public static final int PLAYER_FULL_SCREEN = 11;
    public static final int PLAYER_NORMAL = 10;
    public static final int PLAYER_TINY_SCREEN = 12;
    public static final int SCREEN_SCALE_16_9 = 1;
    public static final int SCREEN_SCALE_4_3 = 2;
    public static final int SCREEN_SCALE_CENTER_CROP = 5;
    public static final int SCREEN_SCALE_DEFAULT = 0;
    public static final int SCREEN_SCALE_DISABLE = -1;
    public static final int SCREEN_SCALE_MATCH_PARENT = 3;
    public static final int SCREEN_SCALE_MOVIE = 6;
    public static final int SCREEN_SCALE_ORIGINAL = 4;
    public static final int STATE_BUFFERED = 7;
    public static final int STATE_BUFFERING = 6;
    public static final int STATE_ERROR = -1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_PAUSED = 4;
    public static final int STATE_PLAYBACK_COMPLETED = 5;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_PREPARED = 2;
    public static final int STATE_PREPARING = 1;
    public static final int STATE_START_ABORT = 8;
    private String audioTrack;
    protected AssetFileDescriptor mAssetFileDescriptor;

    @Nullable
    protected AudioFocusHelper mAudioFocusHelper;
    protected int mCurrentPlayState;
    protected int mCurrentPlayerState;
    protected long mCurrentPosition;
    protected int mCurrentScreenScaleType;
    protected boolean mEnableAudioFocus;
    protected Map<String, String> mHeaders;
    protected boolean mIsFullScreen;
    protected boolean mIsLooping;
    protected boolean mIsMute;
    protected boolean mIsTinyScreen;
    protected P mMediaPlayer;
    protected List<OnStateChangeListener> mOnStateChangeListeners;
    protected boolean mPlayFromZeroPosition;
    private final int mPlayerBackgroundColor;
    protected FrameLayout mPlayerContainer;
    protected PlayerFactory<P> mPlayerFactory;
    protected String mProgressKey;

    @Nullable
    protected ProgressManager mProgressManager;
    protected IRenderView mRenderView;
    protected RenderViewFactory mRenderViewFactory;
    protected int[] mTinyScreenSize;
    protected String mUrl;

    @Nullable
    protected BaseVideoController mVideoController;
    protected int[] mVideoSize;
    private List<O00000O00oOOo000000OOOo00OOOo0OooOO00OO0> trackData;
    private O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO tv_radio;
    private int videoFps;

    public interface OnStateChangeListener {
        void onPlayStateChanged(int i);

        void onPlayerStateChanged(int i);
    }

    public static class SimpleOnStateChangeListener implements OnStateChangeListener {
        @Override // xyz.doikki.videoplayer.player.BaseVideoView.OnStateChangeListener
        public void onPlayStateChanged(int i) {
        }

        @Override // xyz.doikki.videoplayer.player.BaseVideoView.OnStateChangeListener
        public void onPlayerStateChanged(int i) {
        }
    }

    public BaseVideoView(@NonNull Context context) {
        this(context, null);
    }

    private void createAndAttachRenderView() {
        this.mRenderView = this.mRenderViewFactory.createRenderView(getContext());
        this.mPlayerContainer.addView(this.mRenderView.getView(), 0, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    private void hideSysBar(ViewGroup viewGroup) {
        viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() | InputDeviceCompat.SOURCE_TOUCHSCREEN);
        getActivity().getWindow().setFlags(1024, 1024);
    }

    private boolean isInStartAbortState() {
        return this.mCurrentPlayState == 8;
    }

    private void showSysBar(ViewGroup viewGroup) {
        viewGroup.setSystemUiVisibility(viewGroup.getSystemUiVisibility() & (-4099));
        getActivity().getWindow().clearFlags(1024);
    }

    public void addDisplay() {
        if (this.mRenderView == null) {
            createAndAttachRenderView();
        }
        View view = this.mRenderView.getView();
        if (view != null) {
            this.mRenderView.attachToPlayer(this.mMediaPlayer);
            if (view instanceof O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
                SurfaceHolder surfaceHolder = ((O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) view).f1043O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (surfaceHolder.getSurface().isValid()) {
                    this.mMediaPlayer.setDisplay(surfaceHolder);
                }
            } else if (view instanceof TextureRenderView) {
                TextureRenderView textureRenderView = (TextureRenderView) view;
                if (textureRenderView.isAvailable()) {
                    this.mMediaPlayer.setSurface(textureRenderView.mSurface);
                }
            }
            this.mRenderView.setScaleType(this.mCurrentScreenScaleType);
        }
    }

    public void addOnStateChangeListener(@NonNull OnStateChangeListener onStateChangeListener) {
        if (this.mOnStateChangeListeners == null) {
            this.mOnStateChangeListeners = new ArrayList();
        }
        this.mOnStateChangeListeners.add(onStateChangeListener);
    }

    public void addTv_Radio() {
        this.tv_radio.bringToFront();
        this.tv_radio.setVisibility(0);
        this.tv_radio.setScaleType(this.mCurrentScreenScaleType);
        BaseVideoController baseVideoController = this.mVideoController;
        if (baseVideoController != null) {
            baseVideoController.bringToFront();
        }
    }

    public void clearOnStateChangeListeners() {
        List<OnStateChangeListener> list = this.mOnStateChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public Bitmap doScreenShot() {
        IRenderView iRenderView = this.mRenderView;
        if (iRenderView != null) {
            return iRenderView.doScreenShot();
        }
        return null;
    }

    public Activity getActivity() {
        BaseVideoController baseVideoController = this.mVideoController;
        if (baseVideoController == null) {
            return PlayerUtils.scanForActivity(getContext());
        }
        Activity activityScanForActivity = PlayerUtils.scanForActivity(baseVideoController.getContext());
        return activityScanForActivity == null ? PlayerUtils.scanForActivity(getContext()) : activityScanForActivity;
    }

    public String getAudioTrack() {
        return this.audioTrack;
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public int getBufferedPercentage() {
        P p = this.mMediaPlayer;
        if (p != null) {
            return p.getBufferedPercentage();
        }
        return 0;
    }

    public ViewGroup getContentView() {
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return (ViewGroup) activity.findViewById(R.id.content);
    }

    public int getCurrentPlayState() {
        return this.mCurrentPlayState;
    }

    public int getCurrentPlayerState() {
        return this.mCurrentPlayerState;
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public long getCurrentPosition() {
        if (!isInPlaybackState()) {
            return 0L;
        }
        long currentPosition = this.mMediaPlayer.getCurrentPosition();
        this.mCurrentPosition = currentPosition;
        return currentPosition;
    }

    public ViewGroup getDecorView() {
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return (ViewGroup) activity.getWindow().getDecorView();
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public long getDuration() {
        if (isInPlaybackState()) {
            return this.mMediaPlayer.getDuration();
        }
        return 0L;
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public float getSpeed() {
        if (isInPlaybackState()) {
            return this.mMediaPlayer.getSpeed();
        }
        return 1.0f;
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public long getTcpSpeed() {
        P p = this.mMediaPlayer;
        if (p != null) {
            return p.getTcpSpeed();
        }
        return 0L;
    }

    public List<O00000O00oOOo000000OOOo00OOOo0OooOO00OO0> getTrackData() {
        return this.trackData;
    }

    public String getVideoBitrate() {
        P p = this.mMediaPlayer;
        if (p != null) {
            return p.getVideoBitrate();
        }
        return null;
    }

    public int getVideoFps() {
        return this.videoFps;
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public int[] getVideoSize() {
        return this.mVideoSize;
    }

    public String getVideoSizeString() {
        if (((Integer) Hawk.get("视频标签", Integer.valueOf(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1453O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o))).intValue() == 1) {
            return this.mVideoSize[0] + "x" + this.mVideoSize[1];
        }
        int i = this.mVideoSize[1];
        if (i == 240) {
            return "240P";
        }
        if (i == 360) {
            return "360P";
        }
        if (i == 480) {
            return "480P";
        }
        if (i == 720) {
            return "HD";
        }
        if (i == 1080 || i == 1088) {
            return "FHD";
        }
        if (i == 1440) {
            return "QHD";
        }
        if (i == 2160) {
            return "4K UHD";
        }
        if (i == 4320) {
            return "8K UHD";
        }
        return this.mVideoSize[0] + "x" + this.mVideoSize[1];
    }

    public String getmUrl() {
        return this.mUrl;
    }

    public void initPlayer() {
        P p = (P) this.mPlayerFactory.createPlayer(getContext());
        this.mMediaPlayer = p;
        p.setPlayerEventListener(this);
        setInitOptions();
        this.mMediaPlayer.initPlayer();
        setOptions();
    }

    public void initRenderView() {
        IRenderView iRenderView = this.mRenderView;
        if (iRenderView != null) {
            this.mPlayerContainer.removeView(iRenderView.getView());
            releaseRenderView();
        }
        createAndAttachRenderView();
    }

    public void initView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.mPlayerContainer = frameLayout;
        frameLayout.setBackgroundColor(this.mPlayerBackgroundColor);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.mPlayerContainer, layoutParams);
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(getContext());
        this.tv_radio = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        this.mPlayerContainer.addView(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, layoutParams);
    }

    public boolean isAudio() {
        return this.mMediaPlayer.isAudio();
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public boolean isFullScreen() {
        return this.mIsFullScreen;
    }

    public boolean isInIdleState() {
        return this.mCurrentPlayState == 0;
    }

    public boolean isInPlaybackState() {
        int i;
        return (this.mMediaPlayer == null || (i = this.mCurrentPlayState) == -1 || i == 0 || i == 1 || i == 8 || i == 5) ? false : true;
    }

    public boolean isLocalDataSource() {
        if (this.mAssetFileDescriptor != null) {
            return true;
        }
        if (TextUtils.isEmpty(this.mUrl)) {
            return false;
        }
        Uri uri = Uri.parse(this.mUrl);
        return "android.resource".equals(uri.getScheme()) || "file".equals(uri.getScheme()) || RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(uri.getScheme());
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public boolean isMute() {
        return this.mIsMute;
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public boolean isPlaying() {
        return isInPlaybackState() && this.mMediaPlayer.isPlaying();
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public boolean isTinyScreen() {
        return this.mIsTinyScreen;
    }

    public boolean isTv_RadioShowing() {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.tv_radio;
        return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null && o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getVisibility() == 0;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer.PlayerEventListener
    public void onAudioTrack(String str) {
        this.audioTrack = str;
    }

    public boolean onBackPressed() {
        BaseVideoController baseVideoController = this.mVideoController;
        return baseVideoController != null && baseVideoController.onBackPressed();
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer.PlayerEventListener
    public void onCompletion() {
        this.mPlayerContainer.setKeepScreenOn(false);
        this.mCurrentPosition = 0L;
        ProgressManager progressManager = this.mProgressManager;
        if (progressManager != null) {
            String str = this.mProgressKey;
            if (str == null) {
                str = this.mUrl;
            }
            progressManager.saveProgress(str, 0L);
        }
        setPlayState(5);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer.PlayerEventListener
    public void onError() {
        this.mPlayerContainer.setKeepScreenOn(false);
        setPlayState(-1);
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer.PlayerEventListener
    public void onFps(int i) {
        this.videoFps = i;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer.PlayerEventListener
    public void onInfo(int i, int i2) {
        if (i == 3) {
            setPlayState(3);
            this.mPlayerContainer.setKeepScreenOn(true);
            return;
        }
        if (i == 10001) {
            IRenderView iRenderView = this.mRenderView;
            if (iRenderView != null) {
                iRenderView.setVideoRotation(i2);
                return;
            }
            return;
        }
        if (i == 701) {
            setPlayState(6);
        } else {
            if (i != 702) {
                return;
            }
            setPlayState(7);
        }
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer.PlayerEventListener
    public void onPrepared() {
        AudioFocusHelper audioFocusHelper;
        setPlayState(2);
        if (!isMute() && (audioFocusHelper = this.mAudioFocusHelper) != null) {
            audioFocusHelper.requestFocus();
        }
        if (O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 || "时移".equals(LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo) || getDuration() <= 0) {
            return;
        }
        long j = this.mCurrentPosition;
        if (j > 0) {
            seekTo(j);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        L.d("onSaveInstanceState: " + this.mCurrentPosition);
        saveProgress();
        return super.onSaveInstanceState();
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer.PlayerEventListener
    public void onTrackList(List<O00000O00oOOo000000OOOo00OOOo0OooOO00OO0> list) {
        this.trackData = list;
    }

    @Override // xyz.doikki.videoplayer.player.AbstractPlayer.PlayerEventListener
    public void onVideoSizeChanged(int i, int i2) {
        int[] iArr = this.mVideoSize;
        iArr[0] = i;
        iArr[1] = i2;
        IRenderView iRenderView = this.mRenderView;
        if (iRenderView != null) {
            iRenderView.setVideoSize(i, i2);
            this.mRenderView.setScaleType(this.mCurrentScreenScaleType);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.mIsFullScreen) {
            hideSysBar(getDecorView());
        }
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public void pause() {
        if (isInPlaybackState() && this.mMediaPlayer.isPlaying()) {
            this.mMediaPlayer.pause();
            setPlayState(4);
            if (this.mAudioFocusHelper != null && !isMute()) {
                this.mAudioFocusHelper.abandonFocus();
            }
            this.mPlayerContainer.setKeepScreenOn(false);
        }
    }

    public boolean prepareDataSource() {
        AssetFileDescriptor assetFileDescriptor = this.mAssetFileDescriptor;
        if (assetFileDescriptor != null) {
            this.mMediaPlayer.setDataSource(assetFileDescriptor);
            return true;
        }
        if (TextUtils.isEmpty(this.mUrl)) {
            return false;
        }
        this.mMediaPlayer.setDataSource(this.mUrl, this.mHeaders);
        return true;
    }

    public void release() {
        if (isInIdleState()) {
            return;
        }
        saveProgress();
        P p = this.mMediaPlayer;
        if (p != null) {
            p.release();
            this.mMediaPlayer = null;
        }
        IRenderView iRenderView = this.mRenderView;
        if (iRenderView != null) {
            iRenderView.attachToPlayer(null);
        }
        AssetFileDescriptor assetFileDescriptor = this.mAssetFileDescriptor;
        if (assetFileDescriptor != null) {
            try {
                assetFileDescriptor.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        AudioFocusHelper audioFocusHelper = this.mAudioFocusHelper;
        if (audioFocusHelper != null) {
            audioFocusHelper.abandonFocus();
            this.mAudioFocusHelper = null;
        }
        this.mPlayerContainer.setKeepScreenOn(false);
        this.mCurrentPosition = 0L;
        int[] iArr = this.mVideoSize;
        iArr[0] = 0;
        iArr[1] = 0;
        this.audioTrack = null;
        this.videoFps = 0;
        setPlayState(0);
    }

    public void releaseRenderView() {
        IRenderView iRenderView = this.mRenderView;
        if (iRenderView != null) {
            iRenderView.release();
            this.mRenderView = null;
        }
    }

    public void removeOnStateChangeListener(@NonNull OnStateChangeListener onStateChangeListener) {
        List<OnStateChangeListener> list = this.mOnStateChangeListeners;
        if (list != null) {
            list.remove(onStateChangeListener);
        }
    }

    public void removeTv_Radio() {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.tv_radio;
        if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null) {
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setVisibility(8);
        }
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public void replay(boolean z) {
        if (z) {
            this.mCurrentPosition = 0L;
        }
        addDisplay();
        startPrepare(true);
    }

    public void resume() {
        if (!isInPlaybackState() || this.mMediaPlayer.isPlaying()) {
            return;
        }
        this.mMediaPlayer.start();
        setPlayState(3);
        if (this.mAudioFocusHelper != null && !isMute()) {
            this.mAudioFocusHelper.requestFocus();
        }
        this.mPlayerContainer.setKeepScreenOn(true);
    }

    public void saveProgress() {
        if (this.mProgressManager == null || getDuration() <= 0) {
            return;
        }
        long j = this.mCurrentPosition;
        if (j <= 0 || j <= getDuration() / 100) {
            return;
        }
        L.d("saveProgress: " + this.mCurrentPosition);
        ProgressManager progressManager = this.mProgressManager;
        String str = this.mProgressKey;
        if (str == null) {
            str = this.mUrl;
        }
        progressManager.saveProgress(str, this.mCurrentPosition);
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public void seekTo(long j) {
        if (isInPlaybackState()) {
            this.mMediaPlayer.seekTo(j);
        }
    }

    public void setAssetFileDescriptor(AssetFileDescriptor assetFileDescriptor) {
        this.mUrl = null;
        this.mAssetFileDescriptor = assetFileDescriptor;
    }

    public void setCurrentScreenScaleType(int i) {
        this.mCurrentScreenScaleType = i;
    }

    public void setEnableAudioFocus(boolean z) {
        this.mEnableAudioFocus = z;
    }

    public void setInitOptions() {
    }

    public void setLooping(boolean z) {
        this.mIsLooping = z;
        P p = this.mMediaPlayer;
        if (p != null) {
            p.setLooping(z);
        }
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public void setMirrorRotation(boolean z) {
        IRenderView iRenderView = this.mRenderView;
        if (iRenderView != null) {
            iRenderView.getView().setScaleX(z ? -1.0f : 1.0f);
        }
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public void setMute(boolean z) {
        this.mIsMute = z;
        P p = this.mMediaPlayer;
        if (p != null) {
            float f = z ? 0.0f : 1.0f;
            p.setVolume(f, f);
        }
    }

    public void setOnStateChangeListener(@NonNull OnStateChangeListener onStateChangeListener) {
        List<OnStateChangeListener> list = this.mOnStateChangeListeners;
        if (list == null) {
            this.mOnStateChangeListeners = new ArrayList();
        } else {
            list.clear();
        }
        this.mOnStateChangeListeners.add(onStateChangeListener);
    }

    public void setOptions() {
        this.mMediaPlayer.setLooping(this.mIsLooping);
        float f = this.mIsMute ? 0.0f : 1.0f;
        this.mMediaPlayer.setVolume(f, f);
    }

    public void setPlayFromZeroPositionOnce(boolean z) {
        this.mPlayFromZeroPosition = z;
    }

    public void setPlayState(int i) {
        this.mCurrentPlayState = i;
        BaseVideoController baseVideoController = this.mVideoController;
        if (baseVideoController != null) {
            baseVideoController.setPlayState(i);
        }
        List<OnStateChangeListener> list = this.mOnStateChangeListeners;
        if (list != null) {
            for (OnStateChangeListener onStateChangeListener : PlayerUtils.getSnapshot(list)) {
                if (onStateChangeListener != null) {
                    onStateChangeListener.onPlayStateChanged(i);
                }
            }
        }
    }

    public void setPlayerBackgroundColor(int i) {
        this.mPlayerContainer.setBackgroundColor(i);
    }

    public void setPlayerFactory(PlayerFactory playerFactory) {
        if (playerFactory == null) {
            throw new IllegalArgumentException("PlayerFactory can not be null!");
        }
        this.mPlayerFactory = playerFactory;
    }

    public void setPlayerState(int i) {
        this.mCurrentPlayerState = i;
        BaseVideoController baseVideoController = this.mVideoController;
        if (baseVideoController != null) {
            baseVideoController.setPlayerState(i);
        }
        List<OnStateChangeListener> list = this.mOnStateChangeListeners;
        if (list != null) {
            for (OnStateChangeListener onStateChangeListener : PlayerUtils.getSnapshot(list)) {
                if (onStateChangeListener != null) {
                    onStateChangeListener.onPlayerStateChanged(i);
                }
            }
        }
    }

    public void setProgressKey(String str) {
        this.mProgressKey = str;
    }

    public void setProgressManager(@Nullable ProgressManager progressManager) {
        this.mProgressManager = progressManager;
    }

    public void setRenderViewFactory(RenderViewFactory renderViewFactory) {
        if (renderViewFactory == null) {
            return;
        }
        this.mRenderViewFactory = renderViewFactory;
    }

    @Override // android.view.View, xyz.doikki.videoplayer.controller.MediaPlayerControl
    public void setRotation(float f) {
        IRenderView iRenderView = this.mRenderView;
        if (iRenderView != null) {
            iRenderView.setVideoRotation((int) f);
        }
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public void setScreenScaleType(int i) {
        this.mCurrentScreenScaleType = i;
        IRenderView iRenderView = this.mRenderView;
        if (iRenderView != null) {
            iRenderView.setScaleType(i);
        }
        if (isTv_RadioShowing()) {
            this.tv_radio.setScaleType(i);
        }
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public void setSpeed(float f) {
        if (isInPlaybackState()) {
            this.mMediaPlayer.setSpeed(f);
        }
    }

    public void setTinyScreenSize(int[] iArr) {
        this.mTinyScreenSize = iArr;
    }

    public void setUrl(String str) {
        setUrl(str, null);
    }

    public void setVideoController(@Nullable BaseVideoController baseVideoController) {
        this.mPlayerContainer.removeView(this.mVideoController);
        this.mVideoController = baseVideoController;
        if (baseVideoController != null) {
            baseVideoController.setMediaPlayer(this);
            this.mPlayerContainer.addView(this.mVideoController, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void setVolume(float f, float f2) {
        P p = this.mMediaPlayer;
        if (p != null) {
            p.setVolume(f, f2);
        }
    }

    public boolean showNetWarning() {
        BaseVideoController baseVideoController;
        return (isLocalDataSource() || (baseVideoController = this.mVideoController) == null || !baseVideoController.showNetWarning()) ? false : true;
    }

    public void skipPositionWhenPlay(int i) {
        this.mCurrentPosition = i;
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public void start() {
        if (isInIdleState() || isInStartAbortState()) {
            startPlay();
        } else if (isInPlaybackState()) {
            startInPlaybackState();
        }
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public void startFullScreen() {
        ViewGroup decorView;
        if (this.mIsFullScreen || (decorView = getDecorView()) == null) {
            return;
        }
        this.mIsFullScreen = true;
        hideSysBar(decorView);
        removeView(this.mPlayerContainer);
        decorView.addView(this.mPlayerContainer);
        setPlayerState(11);
    }

    public void startInPlaybackState() {
        this.mMediaPlayer.start();
        setPlayState(3);
        if (this.mAudioFocusHelper != null && !isMute()) {
            this.mAudioFocusHelper.requestFocus();
        }
        this.mPlayerContainer.setKeepScreenOn(true);
    }

    public boolean startPlay() {
        if (showNetWarning()) {
            setPlayState(8);
            return false;
        }
        if (this.mEnableAudioFocus) {
            this.mAudioFocusHelper = new AudioFocusHelper(this);
        }
        if (this.mPlayFromZeroPosition) {
            this.mCurrentPosition = 0L;
            this.mPlayFromZeroPosition = false;
        } else {
            ProgressManager progressManager = this.mProgressManager;
            if (progressManager != null) {
                String str = this.mProgressKey;
                if (str == null) {
                    str = this.mUrl;
                }
                this.mCurrentPosition = progressManager.getSavedProgress(str);
            }
        }
        initPlayer();
        addDisplay();
        startPrepare(false);
        return true;
    }

    public void startPrepare(boolean z) {
        int i;
        if (z) {
            try {
                this.mMediaPlayer.reset();
                setOptions();
            } catch (Exception unused) {
                onError();
                return;
            }
        }
        if (prepareDataSource()) {
            this.mMediaPlayer.prepareAsync();
            setPlayState(1);
            if (isFullScreen()) {
                i = 11;
            } else {
                i = isTinyScreen() ? 12 : 10;
            }
            setPlayerState(i);
        }
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public void startTinyScreen() {
        ViewGroup contentView;
        if (this.mIsTinyScreen || (contentView = getContentView()) == null) {
            return;
        }
        removeView(this.mPlayerContainer);
        int screenWidth = this.mTinyScreenSize[0];
        if (screenWidth <= 0) {
            screenWidth = PlayerUtils.getScreenWidth(getContext(), false) / 2;
        }
        int i = this.mTinyScreenSize[1];
        if (i <= 0) {
            i = (screenWidth * 9) / 16;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(screenWidth, i);
        layoutParams.gravity = 8388693;
        contentView.addView(this.mPlayerContainer, layoutParams);
        this.mIsTinyScreen = true;
        setPlayerState(12);
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public void stopFullScreen() {
        ViewGroup decorView;
        if (this.mIsFullScreen && (decorView = getDecorView()) != null) {
            this.mIsFullScreen = false;
            showSysBar(decorView);
            decorView.removeView(this.mPlayerContainer);
            addView(this.mPlayerContainer);
            setPlayerState(10);
        }
    }

    @Override // xyz.doikki.videoplayer.controller.MediaPlayerControl
    public void stopTinyScreen() {
        ViewGroup contentView;
        if (this.mIsTinyScreen && (contentView = getContentView()) != null) {
            contentView.removeView(this.mPlayerContainer);
            addView(this.mPlayerContainer, new FrameLayout.LayoutParams(-1, -1));
            this.mIsTinyScreen = false;
            setPlayerState(10);
        }
    }

    public BaseVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setUrl(String str, Map<String, String> map) {
        this.mAssetFileDescriptor = null;
        this.mUrl = str;
        this.mHeaders = map;
    }

    public BaseVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mVideoSize = new int[]{0, 0};
        this.mProgressKey = null;
        this.mCurrentPlayState = 0;
        this.mCurrentPlayerState = 10;
        this.mTinyScreenSize = new int[]{0, 0};
        this.mPlayFromZeroPosition = false;
        this.trackData = new ArrayList();
        VideoViewConfig config = VideoViewManager.getConfig();
        this.mEnableAudioFocus = config.mEnableAudioFocus;
        this.mProgressManager = config.mProgressManager;
        this.mPlayerFactory = config.mPlayerFactory;
        this.mCurrentScreenScaleType = config.mScreenScaleType;
        this.mRenderViewFactory = config.mRenderViewFactory;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BaseVideoView);
        this.mEnableAudioFocus = typedArrayObtainStyledAttributes.getBoolean(0, this.mEnableAudioFocus);
        this.mIsLooping = typedArrayObtainStyledAttributes.getBoolean(1, false);
        this.mCurrentScreenScaleType = typedArrayObtainStyledAttributes.getInt(3, this.mCurrentScreenScaleType);
        this.mPlayerBackgroundColor = typedArrayObtainStyledAttributes.getColor(2, -16777216);
        typedArrayObtainStyledAttributes.recycle();
        initView();
    }
}
