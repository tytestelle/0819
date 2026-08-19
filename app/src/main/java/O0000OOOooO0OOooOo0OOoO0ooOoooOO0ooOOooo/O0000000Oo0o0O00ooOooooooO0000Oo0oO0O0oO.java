package O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo;

import O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import android.app.Activity;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Iterator;
import java.util.Map;
import xyz.doikki.videoplayer.controller.BaseVideoController;
import xyz.doikki.videoplayer.controller.IControlComponent;
import xyz.doikki.videoplayer.controller.IGestureComponent;
import xyz.doikki.videoplayer.util.PlayerUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends BaseVideoController implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, View.OnTouchListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public GestureDetector f1017O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public AudioManager f1018O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public boolean f1019O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public int f1020O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public int f1021O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public boolean f1022O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public boolean f1023O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public boolean f1024O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public boolean f1025O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public boolean f1026O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public boolean f1027O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public boolean f1028O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public int f1029O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public final Handler f1030O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public boolean f1031O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public LinearLayout f1032O00000OOoOOO00O00o0ooooooooO000ooooO0000;

    /* JADX INFO: renamed from: O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, reason: collision with root package name */
    public LinearLayout f1033O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

    /* JADX INFO: renamed from: O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o, reason: collision with root package name */
    public ProgressBar f1034O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(LivePlayActivity livePlayActivity) {
        super(livePlayActivity);
        this.f1019O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = true;
        this.f1026O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = true;
        this.f1031O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = true;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, 2);
        Handler handler = new Handler(new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(this, 1));
        this.f1030O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = handler;
        handler.post(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
    }

    @Override // xyz.doikki.videoplayer.controller.BaseVideoController
    public void initView() {
        super.initView();
        this.f1018O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (AudioManager) getContext().getSystemService("audio");
        this.f1017O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new GestureDetector(getContext(), this);
        setOnTouchListener(this);
        this.f1032O00000OOoOOO00O00o0ooooooooO000ooooO0000 = (LinearLayout) findViewWithTag("dialog_volume");
        this.f1033O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = (LinearLayout) findViewWithTag("dialog_brightness");
        this.f1034O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = (ProgressBar) findViewWithTag("progressbar_volume");
    }

    public final boolean isInPlaybackState() {
        int i;
        return (this.mControlWrapper == null || (i = this.f1029O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) == -1 || i == 0 || i == 1 || i == 2 || i == 8 || i == 5) ? false : true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (!this.f1031O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 || isLocked() || !isInPlaybackState()) {
            return true;
        }
        togglePlay();
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (isInPlaybackState() && this.f1019O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o && !PlayerUtils.isEdge(getContext(), motionEvent)) {
            this.f1020O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = this.f1018O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getStreamVolume(3);
            Activity activityScanForActivity = PlayerUtils.scanForActivity(getContext());
            if (activityScanForActivity != null) {
                float f = activityScanForActivity.getWindow().getAttributes().screenBrightness;
            }
            this.f1022O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = true;
            this.f1023O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = false;
            this.f1024O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = false;
            this.f1025O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = false;
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (isInPlaybackState() && this.f1019O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o && this.f1028O000000oooOoo00ooo0O0000000o00O0Oooo0OOO && !isLocked() && !PlayerUtils.isEdge(getContext(), motionEvent)) {
            float x = motionEvent.getX() - motionEvent2.getX();
            float y = motionEvent.getY() - motionEvent2.getY();
            if (this.f1022O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
                boolean z = Math.abs(f) >= Math.abs(f2);
                this.f1023O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = z;
                if (!z) {
                    if (motionEvent2.getX() < PlayerUtils.getScreenWidth(getContext(), true) / 2) {
                        this.f1025O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = true;
                    } else {
                        this.f1024O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = true;
                    }
                }
                if (this.f1023O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                    this.f1023O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = this.f1026O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                }
                if (this.f1023O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 || this.f1024O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo || this.f1025O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                    Iterator<Map.Entry<IControlComponent, Boolean>> it = this.mControlComponents.entrySet().iterator();
                    while (it.hasNext()) {
                        IControlComponent key = it.next().getKey();
                        if (key instanceof IGestureComponent) {
                            ((IGestureComponent) key).onStartSlide();
                        }
                    }
                }
                this.f1022O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = false;
            }
            if (this.f1023O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                int measuredWidth = getMeasuredWidth();
                int duration = (int) this.mControlWrapper.getDuration();
                int currentPosition = (int) this.mControlWrapper.getCurrentPosition();
                int i = (int) ((((-x) / measuredWidth) * 120000.0f) + currentPosition);
                if (i > duration) {
                    i = duration;
                }
                int i2 = i >= 0 ? i : 0;
                Iterator<Map.Entry<IControlComponent, Boolean>> it2 = this.mControlComponents.entrySet().iterator();
                while (it2.hasNext()) {
                    IControlComponent key2 = it2.next().getKey();
                    if (key2 instanceof IGestureComponent) {
                        ((IGestureComponent) key2).onPositionChange(i2, currentPosition, duration);
                    }
                }
                this.f1021O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i2;
            } else if (!this.f1024O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo && this.f1025O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                float streamMaxVolume = this.f1018O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getStreamMaxVolume(3);
                float measuredHeight = this.f1020O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + (((y * 2.0f) / getMeasuredHeight()) * streamMaxVolume);
                if (measuredHeight > streamMaxVolume) {
                    measuredHeight = streamMaxVolume;
                }
                if (measuredHeight < 0.0f) {
                    measuredHeight = 0.0f;
                }
                int i3 = (int) ((measuredHeight / streamMaxVolume) * 100.0f);
                this.f1018O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setStreamVolume(3, (int) measuredHeight, 0);
                Iterator<Map.Entry<IControlComponent, Boolean>> it3 = this.mControlComponents.entrySet().iterator();
                while (it3.hasNext()) {
                    IControlComponent key3 = it3.next().getKey();
                    if (key3 instanceof IGestureComponent) {
                        ((IGestureComponent) key3).onVolumeChange(i3);
                    }
                }
                this.f1034O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.setProgress(i3);
                Message messageObtain = Message.obtain();
                messageObtain.what = TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM;
                messageObtain.obj = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(i3, "音量 ", "%");
                Handler handler = this.f1030O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
                handler.sendMessage(messageObtain);
                handler.removeMessages(TbsListener.ErrorCode.APK_PATH_ERROR);
                handler.sendEmptyMessageDelayed(TbsListener.ErrorCode.APK_PATH_ERROR, 600L);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!isInPlaybackState()) {
            return true;
        }
        this.mControlWrapper.toggleShowState();
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f1017O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f1017O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.onTouchEvent(motionEvent)) {
            int action = motionEvent.getAction();
            if (action == 1) {
                stopSlide();
                int i = this.f1021O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                if (i > 0) {
                    this.mControlWrapper.seekTo(i);
                    this.f1021O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = 0;
                }
            } else if (action == 3) {
                stopSlide();
                this.f1021O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = 0;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCanChangePosition(boolean z) {
        this.f1026O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = z;
    }

    public void setDoubleTapTogglePlayEnabled(boolean z) {
        this.f1031O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = z;
    }

    public void setEnableInNormal(boolean z) {
        this.f1027O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = z;
    }

    public void setGestureEnabled(boolean z) {
        this.f1019O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = z;
    }

    @Override // xyz.doikki.videoplayer.controller.BaseVideoController
    public void setPlayState(int i) {
        super.setPlayState(i);
        this.f1029O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = i;
    }

    @Override // xyz.doikki.videoplayer.controller.BaseVideoController
    public void setPlayerState(int i) {
        super.setPlayerState(i);
        if (i == 10) {
            this.f1028O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = this.f1027O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        } else if (i == 11) {
            this.f1028O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = true;
        }
    }

    public final void stopSlide() {
        Iterator<Map.Entry<IControlComponent, Boolean>> it = this.mControlComponents.entrySet().iterator();
        while (it.hasNext()) {
            IControlComponent key = it.next().getKey();
            if (key instanceof IGestureComponent) {
                ((IGestureComponent) key).onStopSlide();
            }
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
