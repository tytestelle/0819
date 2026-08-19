package xyz.doikki.videoplayer.player;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
final class AudioFocusHelper implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager mAudioManager;
    private final WeakReference<BaseVideoView> mWeakVideoView;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private boolean mStartRequested = false;
    private boolean mPausedForLoss = false;
    private int mCurrentFocus = 0;

    public AudioFocusHelper(@NonNull BaseVideoView baseVideoView) {
        this.mWeakVideoView = new WeakReference<>(baseVideoView);
        this.mAudioManager = (AudioManager) baseVideoView.getContext().getApplicationContext().getSystemService("audio");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAudioFocusChange(int i) {
        BaseVideoView baseVideoView = this.mWeakVideoView.get();
        if (baseVideoView == null) {
            return;
        }
        if (i == -3) {
            if (!baseVideoView.isPlaying() || baseVideoView.isMute()) {
                return;
            }
            baseVideoView.setVolume(0.1f, 0.1f);
            return;
        }
        if (i == -2 || i == -1) {
            if (baseVideoView.isPlaying()) {
                this.mPausedForLoss = true;
                baseVideoView.pause();
                return;
            }
            return;
        }
        if (i == 1 || i == 2) {
            if (this.mStartRequested || this.mPausedForLoss) {
                baseVideoView.start();
                this.mStartRequested = false;
                this.mPausedForLoss = false;
            }
            if (baseVideoView.isMute()) {
                return;
            }
            baseVideoView.setVolume(1.0f, 1.0f);
        }
    }

    public void abandonFocus() {
        AudioManager audioManager = this.mAudioManager;
        if (audioManager == null) {
            return;
        }
        this.mStartRequested = false;
        audioManager.abandonAudioFocus(this);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(final int i) {
        if (this.mCurrentFocus == i) {
            return;
        }
        this.mHandler.post(new Runnable() { // from class: xyz.doikki.videoplayer.player.AudioFocusHelper.1
            @Override // java.lang.Runnable
            public void run() {
                AudioFocusHelper.this.handleAudioFocusChange(i);
            }
        });
        this.mCurrentFocus = i;
    }

    public void requestFocus() {
        AudioManager audioManager;
        if (this.mCurrentFocus == 1 || (audioManager = this.mAudioManager) == null) {
            return;
        }
        if (1 == audioManager.requestAudioFocus(this, 3, 1)) {
            this.mCurrentFocus = 1;
        } else {
            this.mStartRequested = true;
        }
    }
}
