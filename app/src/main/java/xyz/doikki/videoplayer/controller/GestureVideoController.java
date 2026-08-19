package xyz.doikki.videoplayer.controller;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Map;
import xyz.doikki.videoplayer.util.PlayerUtils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GestureVideoController extends BaseVideoController implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, View.OnTouchListener {
    private AudioManager mAudioManager;
    private float mBrightness;
    private boolean mCanChangePosition;
    private boolean mCanSlide;
    private boolean mChangeBrightness;
    private boolean mChangePosition;
    private boolean mChangeVolume;
    private int mCurPlayState;
    private boolean mEnableInNormal;
    private boolean mFirstTouch;
    private GestureDetector mGestureDetector;
    private boolean mIsDoubleTapTogglePlayEnabled;
    private boolean mIsGestureEnabled;
    private int mSeekPosition;
    private int mStreamVolume;

    public GestureVideoController(@NonNull Context context) {
        super(context);
        this.mIsGestureEnabled = true;
        this.mSeekPosition = -1;
        this.mCanChangePosition = true;
        this.mIsDoubleTapTogglePlayEnabled = true;
    }

    private boolean isInPlaybackState() {
        int i;
        return (this.mControlWrapper == null || (i = this.mCurPlayState) == -1 || i == 0 || i == 1 || i == 2 || i == 8 || i == 5) ? false : true;
    }

    private void stopSlide() {
        Iterator<Map.Entry<IControlComponent, Boolean>> it = this.mControlComponents.entrySet().iterator();
        while (it.hasNext()) {
            IControlComponent key = it.next().getKey();
            if (key instanceof IGestureComponent) {
                ((IGestureComponent) key).onStopSlide();
            }
        }
    }

    @Override // xyz.doikki.videoplayer.controller.BaseVideoController
    public void initView() {
        super.initView();
        this.mAudioManager = (AudioManager) getContext().getSystemService("audio");
        this.mGestureDetector = new GestureDetector(getContext(), this);
        setOnTouchListener(this);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (!this.mIsDoubleTapTogglePlayEnabled || isLocked() || !isInPlaybackState()) {
            return true;
        }
        togglePlay();
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (isInPlaybackState() && this.mIsGestureEnabled && !PlayerUtils.isEdge(getContext(), motionEvent)) {
            this.mStreamVolume = this.mAudioManager.getStreamVolume(3);
            Activity activityScanForActivity = PlayerUtils.scanForActivity(getContext());
            if (activityScanForActivity == null) {
                this.mBrightness = 0.0f;
            } else {
                this.mBrightness = activityScanForActivity.getWindow().getAttributes().screenBrightness;
            }
            this.mFirstTouch = true;
            this.mChangePosition = false;
            this.mChangeBrightness = false;
            this.mChangeVolume = false;
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (isInPlaybackState() && this.mIsGestureEnabled && this.mCanSlide && !isLocked() && !PlayerUtils.isEdge(getContext(), motionEvent)) {
            float x = motionEvent.getX() - motionEvent2.getX();
            float y = motionEvent.getY() - motionEvent2.getY();
            if (this.mFirstTouch) {
                boolean z = Math.abs(f) >= Math.abs(f2);
                this.mChangePosition = z;
                if (!z) {
                    if (motionEvent2.getX() > PlayerUtils.getScreenWidth(getContext(), true) / 2) {
                        this.mChangeVolume = true;
                    } else {
                        this.mChangeBrightness = true;
                    }
                }
                if (this.mChangePosition) {
                    this.mChangePosition = this.mCanChangePosition;
                }
                if (this.mChangePosition || this.mChangeBrightness || this.mChangeVolume) {
                    Iterator<Map.Entry<IControlComponent, Boolean>> it = this.mControlComponents.entrySet().iterator();
                    while (it.hasNext()) {
                        IControlComponent key = it.next().getKey();
                        if (key instanceof IGestureComponent) {
                            ((IGestureComponent) key).onStartSlide();
                        }
                    }
                }
                this.mFirstTouch = false;
            }
            if (this.mChangePosition) {
                slideToChangePosition(x);
            } else if (this.mChangeBrightness) {
                slideToChangeBrightness(y);
            } else if (this.mChangeVolume) {
                slideToChangeVolume(y);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!isInPlaybackState()) {
            return true;
        }
        this.mControlWrapper.toggleShowState();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.mGestureDetector.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mGestureDetector.onTouchEvent(motionEvent)) {
            int action = motionEvent.getAction();
            if (action == 1) {
                stopSlide();
                int i = this.mSeekPosition;
                if (i >= 0) {
                    this.mControlWrapper.seekTo(i);
                    this.mSeekPosition = -1;
                }
            } else if (action == 3) {
                stopSlide();
                this.mSeekPosition = -1;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCanChangePosition(boolean z) {
        this.mCanChangePosition = z;
    }

    public void setDoubleTapTogglePlayEnabled(boolean z) {
        this.mIsDoubleTapTogglePlayEnabled = z;
    }

    public void setEnableInNormal(boolean z) {
        this.mEnableInNormal = z;
    }

    public void setGestureEnabled(boolean z) {
        this.mIsGestureEnabled = z;
    }

    @Override // xyz.doikki.videoplayer.controller.BaseVideoController
    public void setPlayState(int i) {
        super.setPlayState(i);
        this.mCurPlayState = i;
    }

    @Override // xyz.doikki.videoplayer.controller.BaseVideoController
    public void setPlayerState(int i) {
        super.setPlayerState(i);
        if (i == 10) {
            this.mCanSlide = this.mEnableInNormal;
        } else if (i == 11) {
            this.mCanSlide = true;
        }
    }

    public void slideToChangeBrightness(float f) {
        Activity activityScanForActivity = PlayerUtils.scanForActivity(getContext());
        if (activityScanForActivity == null) {
            return;
        }
        Window window = activityScanForActivity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int measuredHeight = getMeasuredHeight();
        if (this.mBrightness == -1.0f) {
            this.mBrightness = 0.5f;
        }
        float f2 = ((f * 2.0f) / measuredHeight) + this.mBrightness;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        int i = (int) (100.0f * f2);
        attributes.screenBrightness = f2;
        window.setAttributes(attributes);
        Iterator<Map.Entry<IControlComponent, Boolean>> it = this.mControlComponents.entrySet().iterator();
        while (it.hasNext()) {
            IControlComponent key = it.next().getKey();
            if (key instanceof IGestureComponent) {
                ((IGestureComponent) key).onBrightnessChange(i);
            }
        }
    }

    public void slideToChangePosition(float f) {
        int measuredWidth = getMeasuredWidth();
        int duration = (int) this.mControlWrapper.getDuration();
        int currentPosition = (int) this.mControlWrapper.getCurrentPosition();
        int i = (int) ((((-f) / measuredWidth) * 120000.0f) + currentPosition);
        if (i > duration) {
            i = duration;
        }
        if (i < 0) {
            i = 0;
        }
        Iterator<Map.Entry<IControlComponent, Boolean>> it = this.mControlComponents.entrySet().iterator();
        while (it.hasNext()) {
            IControlComponent key = it.next().getKey();
            if (key instanceof IGestureComponent) {
                ((IGestureComponent) key).onPositionChange(i, currentPosition, duration);
            }
        }
        this.mSeekPosition = i;
    }

    public void slideToChangeVolume(float f) {
        float streamMaxVolume = this.mAudioManager.getStreamMaxVolume(3);
        float measuredHeight = this.mStreamVolume + (((f * 2.0f) / getMeasuredHeight()) * streamMaxVolume);
        if (measuredHeight > streamMaxVolume) {
            measuredHeight = streamMaxVolume;
        }
        if (measuredHeight < 0.0f) {
            measuredHeight = 0.0f;
        }
        int i = (int) ((measuredHeight / streamMaxVolume) * 100.0f);
        this.mAudioManager.setStreamVolume(3, (int) measuredHeight, 0);
        Iterator<Map.Entry<IControlComponent, Boolean>> it = this.mControlComponents.entrySet().iterator();
        while (it.hasNext()) {
            IControlComponent key = it.next().getKey();
            if (key instanceof IGestureComponent) {
                ((IGestureComponent) key).onVolumeChange(i);
            }
        }
    }

    public GestureVideoController(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsGestureEnabled = true;
        this.mSeekPosition = -1;
        this.mCanChangePosition = true;
        this.mIsDoubleTapTogglePlayEnabled = true;
    }

    public GestureVideoController(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsGestureEnabled = true;
        this.mSeekPosition = -1;
        this.mCanChangePosition = true;
        this.mIsDoubleTapTogglePlayEnabled = true;
    }
}
