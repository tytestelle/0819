package O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo;

import O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
import O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
import O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
import O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import androidx.media3.common.C;
import androidx.media3.exoplayer.Renderer;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import com.github.tvbox.osc.ui.dialog.O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
import com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import java.util.regex.Pattern;
import xyz.doikki.videoplayer.util.PlayerUtils;

/* JADX INFO: loaded from: classes.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o, reason: collision with root package name */
    public int f1035O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

    /* JADX INFO: renamed from: O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, reason: collision with root package name */
    public int f1036O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;

    /* JADX INFO: renamed from: O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, reason: collision with root package name */
    public int f1037O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;

    /* JADX INFO: renamed from: O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, reason: collision with root package name */
    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f1038O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

    /* JADX INFO: renamed from: O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, reason: collision with root package name */
    public boolean f1039O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;

    @Override // xyz.doikki.videoplayer.controller.BaseVideoController
    public int getLayoutId() {
        return R.layout.player_live_control_view;
    }

    @Override // O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, xyz.doikki.videoplayer.controller.BaseVideoController
    public final void initView() {
        super.initView();
    }

    @Override // O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f1039O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = false;
        super.onDown(motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = motionEvent2.getX() - motionEvent.getX();
        float y = motionEvent2.getY() - motionEvent.getY();
        double degrees = Math.toDegrees(Math.atan2(Math.abs(y), Math.abs(x)));
        float fAbs = Math.abs(x);
        float f3 = this.f1035O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
        int i = this.f1036O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
        if (fAbs > f3 && Math.abs(f) > i && degrees <= 45.0d) {
            if (x > 0.0f) {
                ((O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1038O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(1);
            } else {
                ((O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1038O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(0);
            }
            return true;
        }
        if (Math.abs(y) <= f3 || Math.abs(f2) <= i || degrees <= 45.0d) {
            return false;
        }
        if (y > 0.0f) {
            if (motionEvent2.getX() > this.f1037O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) {
                ((O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1038O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(3);
            }
        } else if (motionEvent2.getX() > this.f1037O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) {
            ((O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1038O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(2);
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.f1039O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = true;
        LivePlayActivity livePlayActivity = (LivePlayActivity) ((O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1038O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).f1050O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (livePlayActivity.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO()) {
            int screenWidth = PlayerUtils.getScreenWidth(livePlayActivity.f2939O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, true) / 5;
            if (motionEvent.getX() <= 0.0f || motionEvent.getX() >= screenWidth * 2) {
                if (motionEvent.getX() > screenWidth * 3) {
                    LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(-1);
                    return;
                }
                return;
            }
            O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo;
            if (o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f3278O00000OOoOOO00O00o0ooooooooO000ooooO0000 == null) {
                o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f3278O00000OOoOOO00O00o0ooooooooO000ooooO0000 = new O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00(livePlayActivity);
            }
            LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3278O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3278O00000OOoOOO00O00o0ooooooooO000ooooO0000;
            o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.getClass();
            O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00, 13));
            if (livePlayActivity.f2962O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getVisibility() == 0 && livePlayActivity.f2985O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0) {
                livePlayActivity.f2991O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.post(livePlayActivity.f3005O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo);
            }
        }
    }

    @Override // xyz.doikki.videoplayer.controller.BaseVideoController
    public final void onPlayStateChanged(int i) {
        super.onPlayStateChanged(i);
        LivePlayActivity livePlayActivity = (LivePlayActivity) ((O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1038O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).f1050O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    int iO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                    int duration = ((int) livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getDuration()) / 1000;
                    if (O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                        if (iO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO == 0) {
                            LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setMin(0.0f);
                            LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setMax(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO - O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo);
                            LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3238O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setText(O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO));
                            return;
                        } else {
                            if (duration > 0) {
                                LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setMin(0.0f);
                                LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setMax(duration);
                                LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3238O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setText(PlayerUtils.stringForTimeVod(duration * 1000));
                                return;
                            }
                            return;
                        }
                    }
                    O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
                    if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != null && o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                        LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setMin(0.0f);
                        LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setMax(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO - O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo);
                        LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3238O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setText(O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO));
                        return;
                    } else {
                        if (duration > 0) {
                            LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setMin(0.0f);
                            LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setMax(duration);
                            LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3238O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setText(PlayerUtils.stringForTimeVod(duration * 1000));
                            return;
                        }
                        return;
                    }
                }
                if (i != 3) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                                return;
                            }
                        }
                    }
                }
                if (((Boolean) Hawk.get("音频屏保", Boolean.valueOf(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1486O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo))).booleanValue() && livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.isAudio()) {
                    livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.addTv_Radio();
                } else {
                    livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.removeTv_Radio();
                }
                LivePlayActivity.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(livePlayActivity);
                livePlayActivity.f2978O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.setVisibility(8);
                ObjectAnimator objectAnimator = livePlayActivity.f2994O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                livePlayActivity.f2994O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo = null;
                livePlayActivity.f2979O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.clearAnimation();
                livePlayActivity.f2979O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.setTranslationX(0.0f);
                livePlayActivity.f2980O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.setVisibility(0);
                O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = livePlayActivity.f2991O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;
                O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = livePlayActivity.f3005O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.removeCallbacks(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.postDelayed(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, 5000L);
                livePlayActivity.f2985O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = true;
                livePlayActivity.f2961O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = 0;
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.removeCallbacks(livePlayActivity.f3006O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo);
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.removeCallbacks(livePlayActivity.f3007O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000);
                LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.getClass();
                O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                Float fValueOf = Float.valueOf(1.0f);
                o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
                livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setSpeed(((Float) Hawk.get("GET_VIDEO_SPEED", fValueOf)).floatValue());
                return;
            }
            String str = LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo;
            livePlayActivity.getClass();
            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
            if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 != null) {
                boolean zO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                while (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.f940O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 > o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.f939O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.size() - 1) {
                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.f940O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000--;
                }
                boolean zMatches = Pattern.compile("^((http|https)://)?(\\[[0-9a-fA-F:]+])(:[0-9]+)?(/.*)?$").matcher((String) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.f939O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.get(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.f940O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000)).matches();
                if (zO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                    livePlayActivity.f2983O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.setText("可时移");
                    livePlayActivity.f2983O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.setVisibility(0);
                } else {
                    livePlayActivity.f2983O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.setVisibility(8);
                }
                if (O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f185O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == 101) {
                    livePlayActivity.f2984O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.setText("浏览模式");
                    livePlayActivity.f2984O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.setVisibility(0);
                } else if (zMatches) {
                    livePlayActivity.f2984O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.setText("IPV6");
                    livePlayActivity.f2984O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.setVisibility(0);
                } else {
                    livePlayActivity.f2984O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.setText("IPV4");
                    livePlayActivity.f2984O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o.setVisibility(0);
                }
            }
            boolean zIsShowing = LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3236O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.isShowing();
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = livePlayActivity.f2991O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;
            if (!zIsShowing && !"时移".equals(LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo)) {
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.post(livePlayActivity.f2993O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00);
                livePlayActivity.f2978O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.setVisibility(0);
                livePlayActivity.f2980O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.setVisibility(8);
                o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.removeCallbacks(livePlayActivity.f3005O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo);
            }
            livePlayActivity.f2985O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = false;
            livePlayActivity.f2981O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.setVisibility(8);
            livePlayActivity.f2982O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.setVisibility(8);
            livePlayActivity.f2966O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.setVisibility(8);
            O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2 = livePlayActivity.f3006O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.removeCallbacks(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2);
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.removeCallbacks(livePlayActivity.f3007O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000);
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001.postDelayed(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo2, (((long) O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo()) * 5000) + 5000);
            return;
        }
        boolean z = O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        if ((z && i == 5) || (z && O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3050O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o >= O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO - O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo)) {
            int i2 = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3045O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo + 1;
            if (i2 == LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.getItemCount()) {
                livePlayActivity.f2991O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.post(livePlayActivity.f3007O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000);
                O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "当天回放已播放至最后，恢复播放");
                return;
            } else {
                LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3046O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo, i2, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3036O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00);
                O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "回放结束，准备播放下一段");
                return;
            }
        }
        if (i != -1) {
            if (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000O00oOOo000000OOOo00OOOo0OooOO00OO0() != 0 || LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o == null || (!O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 && !"时移".equals(LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo))) {
                livePlayActivity.f2991O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.post(livePlayActivity.f3006O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo);
                return;
            }
            String strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o, ((long) LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.getProgress()) + O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo, false);
            O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3049O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo = LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.getProgress();
            livePlayActivity.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
            return;
        }
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002 = livePlayActivity.f2991O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo3 = livePlayActivity.f3006O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002.removeCallbacks(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo3);
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo003 = livePlayActivity.f2991O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;
        O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = livePlayActivity.f3007O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;
        o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo003.removeCallbacks(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        if (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() == 0) {
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo003.postDelayed(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo3, (((long) O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo()) * 5000) + 5000);
            return;
        }
        if (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() == 1) {
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo003.postDelayed(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 1000L);
            return;
        }
        if (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() == 2) {
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo003.postDelayed(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        } else if (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() == 3) {
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo003.postDelayed(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 5000L);
        } else if (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O() == 4) {
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo003.postDelayed(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.f1039O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000) {
            this.f1039O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = false;
            return true;
        }
        LivePlayActivity livePlayActivity = (LivePlayActivity) ((O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) this.f1038O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).f1050O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (livePlayActivity.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO()) {
            int screenWidth = PlayerUtils.getScreenWidth(livePlayActivity.f2939O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, true) / 5;
            if (motionEvent.getX() > 0.0f && motionEvent.getX() < screenWidth * 2) {
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo = -1;
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3036O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00);
                LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
            } else if (motionEvent.getX() > screenWidth * 2 && motionEvent.getX() < screenWidth * 3) {
                int visibility = livePlayActivity.f2962O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getVisibility();
                O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = livePlayActivity.f3005O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
                O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = livePlayActivity.f2991O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO;
                if (visibility == 8) {
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.post(livePlayActivity.f2993O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00);
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.removeCallbacks(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.postDelayed(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, 5000L);
                } else if (livePlayActivity.f2962O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getVisibility() == 0 && livePlayActivity.f2985O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0) {
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.post(o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
                }
                LivePlayActivity.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(livePlayActivity);
            } else if (motionEvent.getX() > screenWidth * 3) {
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo = -1;
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3036O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00);
                LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
            }
        } else {
            LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
            LivePlayActivity.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
        }
        return true;
    }

    public void setFiveScreen(int i) {
        this.f1037O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = i;
    }

    public void setListener(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        this.f1038O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }
}
