package com.github.tvbox.osc.ui.dialog;

import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.exoplayer.Renderer;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.tv.CustomView.CustomRecyclerView;
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import com.warkiz.widget.IndicatorSeekBar;
import java.util.ArrayList;
import xyz.doikki.videoplayer.util.PlayerUtils;

/* JADX INFO: loaded from: classes.dex */
public final class O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 implements O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, View.OnKeyListener, View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0, reason: collision with root package name */
    public static boolean f3226O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = false;
    public static String O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = "";

    /* JADX INFO: renamed from: O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o, reason: collision with root package name */
    public static String f3227O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = "";

    /* JADX INFO: renamed from: O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0, reason: collision with root package name */
    public static TextView f3228O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 = null;

    /* JADX INFO: renamed from: O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000, reason: collision with root package name */
    public static TextView f3229O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = null;

    /* JADX INFO: renamed from: O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00, reason: collision with root package name */
    public static long f3230O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 = 10;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final LivePlayActivity f3231O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final LinearLayout f3232O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final LinearLayout f3233O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final LinearLayout f3234O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final LinearLayout f3235O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final PopupWindow f3236O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final TextView f3237O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public final TextView f3238O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public final IndicatorSeekBar f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public final TextView f3240O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public final TextView f3241O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public final TextView f3242O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public final TextView f3243O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public final TextView f3244O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public final TextView f3245O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public final TextView f3246O00000OOoOOO00O00o0ooooooooO000ooooO0000;

    /* JADX INFO: renamed from: O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, reason: collision with root package name */
    public final ImageView f3247O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

    /* JADX INFO: renamed from: O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o, reason: collision with root package name */
    public final ImageView f3248O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;

    /* JADX INFO: renamed from: O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o, reason: collision with root package name */
    public final ImageView f3249O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

    /* JADX INFO: renamed from: O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, reason: collision with root package name */
    public O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f3252O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;

    /* JADX INFO: renamed from: O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, reason: collision with root package name */
    public O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000 f3253O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
    public int O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O;

    /* JADX INFO: renamed from: O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, reason: collision with root package name */
    public long f3255O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;

    /* JADX INFO: renamed from: O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, reason: collision with root package name */
    public final Handler f3250O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = new Handler();

    /* JADX INFO: renamed from: O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, reason: collision with root package name */
    public float f3251O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = 1.0f;

    /* JADX INFO: renamed from: O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo, reason: collision with root package name */
    public final O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f3254O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this, 16);

    public O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0(LivePlayActivity livePlayActivity) {
        this.f3231O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = livePlayActivity;
        View viewInflate = LayoutInflater.from(livePlayActivity).inflate(R.layout.dialog_seek_bar, (ViewGroup) null, false);
        this.f3232O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (LinearLayout) viewInflate.findViewById(R.id.video_start_layout);
        this.f3233O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (LinearLayout) viewInflate.findViewById(R.id.seekbar_layout);
        this.f3234O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (LinearLayout) viewInflate.findViewById(R.id.seekBack_Layout);
        this.f3237O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (TextView) viewInflate.findViewById(R.id.curr_time);
        this.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = (IndicatorSeekBar) viewInflate.findViewById(R.id.seekBar);
        this.f3238O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (TextView) viewInflate.findViewById(R.id.total_time);
        this.f3235O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (LinearLayout) viewInflate.findViewById(R.id.seekBackTimeLayout);
        this.f3240O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = (TextView) viewInflate.findViewById(R.id.seekbar_channel_name);
        this.f3241O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = (TextView) viewInflate.findViewById(R.id.seekbar_channel_number);
        f3228O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 = (TextView) viewInflate.findViewById(R.id.seekBarProgram_time);
        f3229O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 = (TextView) viewInflate.findViewById(R.id.seekBarProgram_name);
        this.f3242O000000oooOoo00ooo0O0000000o00O0Oooo0OOO = (TextView) viewInflate.findViewById(R.id.playerSetting);
        this.f3243O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = (TextView) viewInflate.findViewById(R.id.scaleSetting);
        this.f3244O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = (TextView) viewInflate.findViewById(R.id.speedSetting);
        this.f3245O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = (TextView) viewInflate.findViewById(R.id.videoSetting);
        this.f3246O00000OOoOOO00O00o0ooooooooO000ooooO0000 = (TextView) viewInflate.findViewById(R.id.showListGroup);
        this.f3247O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = (ImageView) viewInflate.findViewById(R.id.seekBar_play_pause);
        this.f3248O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = (ImageView) viewInflate.findViewById(R.id.seekBar_play_left);
        this.f3249O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = (ImageView) viewInflate.findViewById(R.id.seekBar_play_right);
        PopupWindow popupWindow = new PopupWindow(livePlayActivity);
        this.f3236O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.f3236O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.setHeight(-2);
        this.f3236O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.setWidth(-1);
        this.f3236O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.setBackgroundDrawable(new ColorDrawable(0));
        this.f3232O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setOnClickListener(this);
        this.f3244O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setOnClickListener(this);
        this.f3244O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setOnLongClickListener(this);
        this.f3245O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.setOnClickListener(this);
        this.f3246O00000OOoOOO00O00o0ooooooooO000ooooO0000.setOnClickListener(this);
        this.f3242O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.setOnClickListener(this);
        this.f3243O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.setOnClickListener(this);
        this.f3247O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.setOnClickListener(this);
        this.f3248O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.setOnClickListener(this);
        this.f3249O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.setOnClickListener(this);
        this.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setOnSeekChangeListener(this);
        this.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setOnKeyListener(this);
    }

    @Override // O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(IndicatorSeekBar indicatorSeekBar) {
        f3226O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = true;
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
    }

    @Override // O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(IndicatorSeekBar indicatorSeekBar) {
        f3226O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = false;
        int iO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
        boolean z = O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        LivePlayActivity livePlayActivity = this.f3231O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (z) {
            LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo = "回看";
            if (iO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO == 0) {
                String strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = ((long) indicatorSeekBar.getProgress()) >= O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO - O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo ? O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this.f3252O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO, true) : O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this.f3252O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, ((long) indicatorSeekBar.getProgress()) + O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo, true);
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3050O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o = indicatorSeekBar.getProgress();
                livePlayActivity.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
            } else {
                livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.seekTo(((long) indicatorSeekBar.getProgress()) * 1000);
            }
        } else {
            O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f3252O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
            if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == null || !o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.seekTo(((long) indicatorSeekBar.getProgress()) * 1000);
                LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo = "直播";
            } else {
                LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo = "时移";
                String strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this.f3252O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, ((long) indicatorSeekBar.getProgress()) + O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo, false);
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3049O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo = indicatorSeekBar.getProgress();
                livePlayActivity.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(strO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01);
            }
        }
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
    }

    public final void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        int progress;
        long j;
        if (f3226O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0) {
            long j2 = f3230O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00;
            f3230O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 = 2 + j2;
            int iO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
            if (!O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f3252O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
                if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == null || !o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                    progress = this.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.getProgress();
                    j = progress;
                } else {
                    j = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3049O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo;
                }
            } else if (iO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO == 0) {
                j = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3050O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o;
            } else {
                progress = this.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.getProgress();
                j = progress;
            }
            long max = (long) this.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.getMax();
            long min = (long) this.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.getMin();
            long j3 = this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O == 22 ? j + j2 : j - j2;
            this.f3255O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = j3;
            long jMax = Math.max(min, Math.min(j3, max));
            this.f3255O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = jMax;
            if (O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                TextView textView = this.f3237O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                if (textView != null) {
                    if (iO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO == 0) {
                        textView.setText(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(jMax + O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo));
                        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3050O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o = this.f3255O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
                    } else {
                        textView.setText(PlayerUtils.stringForTimeVod((int) (jMax * 1000)));
                    }
                }
            } else {
                O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = this.f3252O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
                if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 == null || !o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                    TextView textView2 = this.f3237O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                    if (textView2 != null) {
                        textView2.setText(PlayerUtils.stringForTimeVod((int) (this.f3255O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O * 1000)));
                    }
                } else {
                    TextView textView3 = this.f3237O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                    if (textView3 != null) {
                        textView3.setText(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this.f3255O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O + O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo));
                    }
                    O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3049O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo = this.f3255O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
                }
            }
            this.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setProgress(this.f3255O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O);
        }
    }

    @Override // O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1653O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            int iO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
            boolean z = O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            IndicatorSeekBar indicatorSeekBar = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1651O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (!z) {
                O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = this.f3252O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
                if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 == null || !o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                    TextView textView = this.f3237O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                    if (textView != null) {
                        textView.setText(PlayerUtils.stringForTimeVod(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1652O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO * 1000));
                    }
                } else {
                    TextView textView2 = this.f3237O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                    if (textView2 != null) {
                        textView2.setText(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(((long) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1652O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) + O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo));
                    }
                    indicatorSeekBar.setMin(0.0f);
                    indicatorSeekBar.setMax(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO - O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo);
                }
            } else if (iO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO == 0) {
                TextView textView3 = this.f3237O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                if (textView3 != null) {
                    textView3.setText(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(((long) o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1652O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) + O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo));
                }
                indicatorSeekBar.setMin(0.0f);
                indicatorSeekBar.setMax(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO - O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo);
            } else {
                TextView textView4 = this.f3237O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                if (textView4 != null) {
                    textView4.setText(PlayerUtils.stringForTimeVod(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1652O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO * 1000));
                }
            }
            O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
        }
    }

    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        Handler handler = this.f3250O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = this.f3254O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
        handler.removeCallbacks(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        handler.postDelayed(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
    }

    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        this.f3252O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
        this.f3236O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.setFocusable(true);
        this.f3236O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.setOutsideTouchable(true);
        this.f3236O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.setClippingEnabled(false);
        LivePlayActivity livePlayActivity = this.f3231O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (livePlayActivity.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO()) {
            int dimensionPixelSize = livePlayActivity.getResources().getDimensionPixelSize(R.dimen.seekbar_dialog_padding_landscape);
            this.f3232O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getLayoutParams().height = -1;
            this.f3233O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
            this.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
            this.f3234O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
        } else {
            int dimensionPixelSize2 = livePlayActivity.getResources().getDimensionPixelSize(R.dimen.seekbar_dialog_padding);
            this.f3232O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getLayoutParams().height = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1431O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            this.f3233O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setPaddingRelative(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
            this.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setPaddingRelative(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
            this.f3234O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setPaddingRelative(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
        }
        this.f3236O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.update();
        this.f3236O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.setAnimationStyle(android.R.style.Animation.Dialog);
        this.f3236O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.showAtLocation(livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, 81, 0, 0);
        this.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.requestFocus();
        if (this.f3252O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O == null) {
            return;
        }
        this.f3242O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.setText(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000());
        this.f3243O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.setText(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00());
        this.f3251O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getSpeed();
        this.f3244O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setText(this.f3251O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 + "倍速");
        this.f3240O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.setText(this.f3252O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.f937O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        this.f3241O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.setText("" + this.f3252O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.f936O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        boolean zO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = livePlayActivity.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
        this.f3242O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.setVisibility(!zO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO ? 0 : 8);
        this.f3243O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.setVisibility(zO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO ? 8 : 0);
        f3229O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.setTextColor(livePlayActivity.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
        if (O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 && zO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) {
            f3228O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.setText(f3227O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o);
            f3229O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.setText(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO);
            this.f3235O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.setVisibility(0);
        } else if (this.f3252O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() && zO00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) {
            this.f3235O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.setVisibility(0);
        } else {
            this.f3235O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.setVisibility(4);
        }
        this.f3247O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.setImageResource(livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.isPlaying() ? R.drawable.icon_play_pause : R.drawable.icon_play_start);
    }

    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000() {
        f3230O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00 = 10L;
        f3226O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = false;
        int iO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
        boolean z = O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        LivePlayActivity livePlayActivity = this.f3231O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (z) {
            LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo = "回看";
            if (iO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO == 0) {
                long j = this.f3255O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
                long j2 = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO;
                long j3 = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo;
                livePlayActivity.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(j >= j2 - j3 ? O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this.f3252O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO, true) : O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this.f3252O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, j + j3, true));
            } else {
                livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.seekTo(this.f3255O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O * 1000);
                this.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setProgress(this.f3255O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O);
            }
        } else {
            O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f3252O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
            if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == null || !o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.seekTo(this.f3255O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O * 1000);
                this.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setProgress(this.f3255O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O);
                LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo = "直播";
            } else {
                LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo = "时移";
                livePlayActivity.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this.f3252O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O, this.f3255O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O + O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo, false));
            }
        }
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
        int i;
        int i2;
        if (view == this.f3232O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            if (this.f3236O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.isShowing()) {
                this.f3236O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.dismiss();
                return;
            }
            return;
        }
        ImageView imageView = this.f3247O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
        LivePlayActivity livePlayActivity = this.f3231O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (view == imageView) {
            if (livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.isPlaying()) {
                this.f3247O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.setImageResource(R.drawable.icon_play_start);
                livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.pause();
                return;
            } else {
                this.f3247O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.setImageResource(R.drawable.icon_play_pause);
                livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.start();
                return;
            }
        }
        if (view == this.f3248O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) {
            f3226O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = true;
            this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O = 21;
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
            return;
        }
        if (view == this.f3249O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) {
            f3226O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = true;
            this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O = 22;
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
            return;
        }
        if (view == this.f3244O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) {
            float f = this.f3251O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
            if (f < 1.0f) {
                this.f3251O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = f + O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1506O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo;
            } else if (f < O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1509O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo) {
                this.f3251O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 += O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1507O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO;
            } else if (this.f3251O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 < O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1505O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo) {
                this.f3251O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 += O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1508O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO;
            } else {
                this.f3251O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1504O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO;
            }
            livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setSpeed(this.f3251O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0);
            this.f3244O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setText(this.f3251O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 + "倍速");
            LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.getClass();
            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
            Float fValueOf = Float.valueOf(this.f3251O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0);
            o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
            Hawk.put("GET_VIDEO_SPEED", fValueOf);
            O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
            return;
        }
        if (view == this.f3245O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
            livePlayActivity.setRequestedOrientation(livePlayActivity.getResources().getConfiguration().orientation != 2 ? 6 : 7);
            return;
        }
        if (view != this.f3246O00000OOoOOO00O00o0ooooooooO000ooooO0000) {
            if (view == this.f3242O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
                O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo2 = LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo;
                if (o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo2 == null) {
                    return;
                }
                o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo2.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo((O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f185O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + 1) % 7);
                this.f3242O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.setText(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000());
                return;
            }
            if (view != this.f3243O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo || (o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo) == null) {
                return;
            }
            o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0((O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f186O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o + 1) % 7);
            this.f3243O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.setText(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00());
            return;
        }
        if (this.f3253O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 == null) {
            O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000 o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000 = new O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000();
            o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.f3220O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = livePlayActivity;
            View viewInflate = LayoutInflater.from(livePlayActivity).inflate(R.layout.dialog_seekbar_channel, (ViewGroup) null, false);
            CustomRecyclerView customRecyclerView = (CustomRecyclerView) viewInflate.findViewById(R.id.seekbar_channel_gridView);
            o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.f3221O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = customRecyclerView;
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.mChannelLayout);
            o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.f3225O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = linearLayout;
            linearLayout.setBackground(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1352O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O);
            PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -1);
            o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.f3223O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = popupWindow;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.f3223O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setFocusable(true);
            o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.f3223O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setOutsideTouchable(true);
            o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.f3223O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setClippingEnabled(false);
            if (!o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.f3223O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.isShowing()) {
                o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.f3223O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setAnimationStyle(R.style.Set_Group_PopupAnimation);
            }
            O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO o0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO = new O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO(livePlayActivity);
            o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.f3222O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO;
            customRecyclerView.setAdapter(o0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO);
            o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000.f3222O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setOnItemClickListener(new O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000, 19));
            this.f3253O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000;
        }
        O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO o0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO2 = this.f3253O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f3222O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        ArrayList arrayListO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3036O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo);
        ArrayList arrayList = o0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO2.f1281O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        arrayList.clear();
        arrayList.addAll(arrayListO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        o0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO2.notifyDataSetChanged();
        O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000 o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0001 = this.f3253O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
        LivePlayActivity livePlayActivity2 = o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0001.f3220O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (livePlayActivity2.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO()) {
            i2 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1433O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
            i = 9;
        } else {
            Point point = new Point();
            livePlayActivity2.getWindowManager().getDefaultDisplay().getSize(point);
            int i3 = point.y;
            int i4 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1432O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            int i5 = i3 / i4;
            int i6 = i4 * i5;
            i = i5;
            i2 = i6;
        }
        int iMax = Math.max(0, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00 - (i / 2));
        CustomRecyclerView customRecyclerView2 = o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0001.f3221O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        customRecyclerView2.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(iMax);
        ViewGroup.LayoutParams layoutParams = customRecyclerView2.getLayoutParams();
        layoutParams.height = i2;
        customRecyclerView2.setLayoutParams(layoutParams);
        if (o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0001.f3224O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
            o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0001.f3224O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new TextView(livePlayActivity2);
        }
        o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0001.f3224O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.setTextSize(0, O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1430O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000());
        LinearLayout linearLayout2 = o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0001.f3225O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
        if (O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O()) {
            layoutParams2.width = (int) o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0001.f3224O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getPaint().measureText("频道节目列表的宽度测量图标");
        } else {
            layoutParams2.width = (int) o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0001.f3224O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getPaint().measureText("频道节目列表的宽度测");
        }
        linearLayout2.setLayoutParams(layoutParams2);
        if (O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0() != 2) {
            livePlayActivity2.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(true, o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0001.f3223O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.getContentView());
        }
        o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0001.f3223O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.update();
        o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0001.f3223O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.showAtLocation(livePlayActivity2.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, 8388629, 0, 0);
        customRecyclerView2.setSelection(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00);
        this.f3236O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.dismiss();
        PopupWindow popupWindow2 = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3073O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
        if (popupWindow2 == null || !popupWindow2.isShowing()) {
            return;
        }
        LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3073O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.dismiss();
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (view == this.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
            if (keyEvent.getAction() == 0) {
                if (i == 21 || i == 22) {
                    f3226O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = true;
                    this.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O = i;
                    O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
                } else if (i == 23 || i == 66) {
                    LivePlayActivity livePlayActivity = this.f3231O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.isPlaying()) {
                        this.f3247O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.setImageResource(R.drawable.icon_play_start);
                        livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.pause();
                        this.f3250O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.removeCallbacks(this.f3254O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo);
                    } else {
                        this.f3247O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.setImageResource(R.drawable.icon_play_pause);
                        livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.start();
                    }
                } else if (i == 20) {
                    this.f3244O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.requestFocus();
                }
            } else if (keyEvent.getAction() == 1 && f3226O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 && (i == 21 || i == 22)) {
                O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
            }
        } else if (view == this.f3244O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) {
            if (keyEvent.getAction() == 0) {
                if (i == 19) {
                    this.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.requestFocus();
                } else if (i == 22) {
                    this.f3245O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.requestFocus();
                } else if (i == 21 && this.f3243O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getVisibility() == 0) {
                    this.f3243O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.requestFocus();
                }
            }
        } else if (view == this.f3245O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) {
            if (keyEvent.getAction() == 0) {
                if (i == 19) {
                    this.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.requestFocus();
                } else if (i == 21) {
                    this.f3244O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.requestFocus();
                } else if (i == 22) {
                    this.f3246O00000OOoOOO00O00o0ooooooooO000ooooO0000.requestFocus();
                }
            }
        } else if (view == this.f3246O00000OOoOOO00O00o0ooooooooO000ooooO0000) {
            if (keyEvent.getAction() == 0) {
                if (i == 19) {
                    this.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.requestFocus();
                } else if (i == 21) {
                    this.f3245O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.requestFocus();
                }
            }
        } else if (view == this.f3242O000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
            if (keyEvent.getAction() == 0) {
                if (i == 19) {
                    this.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.requestFocus();
                } else if (i == 22 && this.f3243O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getVisibility() == 0) {
                    this.f3243O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.requestFocus();
                }
            }
        } else if (view == this.f3243O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo && keyEvent.getAction() == 0) {
            if (i == 19) {
                this.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.requestFocus();
            } else if (i == 21) {
                if (this.f3242O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.getVisibility() == 0) {
                    this.f3242O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.requestFocus();
                }
            } else if (i == 22) {
                this.f3244O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.requestFocus();
            }
        }
        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0();
        return true;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (view.getId() != R.id.speedSetting) {
            return true;
        }
        this.f3251O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = 1.0f;
        this.f3231O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setSpeed(1.0f);
        this.f3244O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setText(this.f3251O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 + "倍速");
        LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.getClass();
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
        Float fValueOf = Float.valueOf(this.f3251O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0);
        o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
        Hawk.put("GET_VIDEO_SPEED", fValueOf);
        return true;
    }
}
