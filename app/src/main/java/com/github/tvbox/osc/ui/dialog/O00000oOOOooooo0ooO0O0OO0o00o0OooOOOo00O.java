package com.github.tvbox.osc.ui.dialog;

import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.tv.CustomView.CustomRecyclerView;
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import com.warkiz.widget.IndicatorSeekBar;

/* JADX INFO: loaded from: classes.dex */
public final class O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, View.OnKeyListener {

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public static int f3118O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    /* JADX INFO: renamed from: O00000O00oOOo000000OOOo00OOOo0OooOO00OO0, reason: collision with root package name */
    public static boolean f3119O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;

    /* JADX INFO: renamed from: O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, reason: collision with root package name */
    public static int f3120O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

    /* JADX INFO: renamed from: O00000OOoOOO00O00o0ooooooooO000ooooO0000, reason: collision with root package name */
    public static int f3121O00000OOoOOO00O00o0ooooooooO000ooooO0000;

    /* JADX INFO: renamed from: O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, reason: collision with root package name */
    public static int f3122O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public LivePlayActivity f3123O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public IndicatorSeekBar f3124O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public IndicatorSeekBar f3125O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public IndicatorSeekBar f3126O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public TextView f3127O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public TextView f3128O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public TextView f3129O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public CustomRecyclerView f3130O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f3131O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public CustomRecyclerView f3132O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO f3133O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public TextView[] f3134O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    @Override // O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(IndicatorSeekBar indicatorSeekBar) {
        if (indicatorSeekBar.getId() == R.id.textSizeSeekBar || indicatorSeekBar.getId() == R.id.listWidthSeekBar) {
            return;
        }
        indicatorSeekBar.getId();
    }

    @Override // O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(IndicatorSeekBar indicatorSeekBar) {
        if (indicatorSeekBar.getId() == R.id.textSizeSeekBar) {
            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
            int progress = indicatorSeekBar.getProgress();
            o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0(progress);
            this.f3124O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setProgress(indicatorSeekBar.getProgress());
            this.f3127O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.setText(indicatorSeekBar.getProgress() + "");
            return;
        }
        if (indicatorSeekBar.getId() == R.id.listWidthSeekBar) {
            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
            int progress2 = indicatorSeekBar.getProgress();
            o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2.getClass();
            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(progress2);
            this.f3125O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setProgress(indicatorSeekBar.getProgress());
            this.f3128O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.setText(indicatorSeekBar.getProgress() + "");
            LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0();
            LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO();
            LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3278O00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
            return;
        }
        if (indicatorSeekBar.getId() == R.id.bottomWidthSeekBar) {
            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo3 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
            int progress3 = indicatorSeekBar.getProgress();
            o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo3.getClass();
            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(progress3);
            this.f3126O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setProgress(indicatorSeekBar.getProgress());
            this.f3129O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.setText(indicatorSeekBar.getProgress() + "");
            this.f3123O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO();
        }
    }

    @Override // O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0
    public final void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1653O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
            IndicatorSeekBar indicatorSeekBar = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f1651O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (indicatorSeekBar.getId() == R.id.textSizeSeekBar) {
                this.f3127O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.setText(indicatorSeekBar.getProgress() + "");
                return;
            }
            if (indicatorSeekBar.getId() == R.id.listWidthSeekBar) {
                this.f3128O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.setText(indicatorSeekBar.getProgress() + "");
                return;
            }
            if (indicatorSeekBar.getId() == R.id.bottomWidthSeekBar) {
                this.f3129O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.setText(indicatorSeekBar.getProgress() + "");
            }
        }
    }

    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(int i, boolean z) {
        if (z) {
            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
            Hawk.put("主题切换", Integer.valueOf(i));
        } else {
            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
            Hawk.put("背景色系", Integer.valueOf(i));
        }
        this.f3123O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O();
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3047O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO = true;
    }

    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i) {
        int i2 = 0;
        while (true) {
            TextView[] textViewArr = this.f3134O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
            if (i2 >= textViewArr.length) {
                return;
            }
            if (i2 == i) {
                textViewArr[i2].setTextColor(this.f3123O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
            } else {
                textViewArr[i2].setTextColor(-1);
            }
            i2++;
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        int i3;
        int action = keyEvent.getAction();
        IndicatorSeekBar indicatorSeekBar = this.f3126O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        IndicatorSeekBar indicatorSeekBar2 = this.f3125O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        IndicatorSeekBar indicatorSeekBar3 = this.f3124O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (action != 0) {
            if (keyEvent.getAction() != 1 || !f3119O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) {
                return false;
            }
            if (i != 21 && i != 22) {
                return false;
            }
            f3119O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = false;
            f3118O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = 0;
            int i4 = f3120O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
            if (i4 == 2) {
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                int progress = indicatorSeekBar3.getProgress();
                o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0(progress);
                return false;
            }
            if (i4 == 3) {
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                int progress2 = indicatorSeekBar2.getProgress();
                o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2.getClass();
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo(progress2);
                return false;
            }
            if (i4 != 4) {
                return false;
            }
            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo3 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
            int progress3 = indicatorSeekBar.getProgress();
            o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo3.getClass();
            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(progress3);
            return false;
        }
        if (i == 23 || i == 66) {
            int i5 = f3120O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
            if (i5 == 0) {
                O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(f3122O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, true);
                return false;
            }
            if (i5 != 1) {
                return false;
            }
            O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(f3121O00000OOoOOO00O00o0ooooooooO000ooooO0000, false);
            return false;
        }
        O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO = this.f3133O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f3131O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
        if (i == 19) {
            int i6 = f3120O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 - 1;
            f3120O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = i6;
            if (i6 < 0) {
                f3120O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = 0;
            }
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(f3120O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
            int i7 = f3120O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
            if (i7 == 0) {
                o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO.notifyItemChanged(f3122O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, 0);
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.notifyItemChanged(f3121O00000OOoOOO00O00o0ooooooooO000ooooO0000, 0);
                return false;
            }
            if (i7 != 1) {
                return false;
            }
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.notifyItemChanged(f3121O00000OOoOOO00O00o0ooooooooO000ooooO0000, 0);
            return false;
        }
        if (i == 20) {
            int i8 = f3120O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 + 1;
            f3120O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = i8;
            if (i8 > this.f3134O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.length - 1) {
                f3120O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = 4;
            }
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(f3120O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
            int i9 = f3120O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
            if (i9 == 1) {
                o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO.notifyItemChanged(f3122O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, 0);
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.notifyItemChanged(f3121O00000OOoOOO00O00o0ooooooooO000ooooO0000, 0);
                return false;
            }
            if (i9 != 2) {
                return false;
            }
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.notifyItemChanged(f3121O00000OOoOOO00O00o0ooooooooO000ooooO0000, 0);
            return false;
        }
        TextView textView = this.f3129O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        TextView textView2 = this.f3128O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        TextView textView3 = this.f3127O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        CustomRecyclerView customRecyclerView = this.f3130O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        CustomRecyclerView customRecyclerView2 = this.f3132O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
        if (i == 21) {
            f3119O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = true;
            f3118O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo--;
            int i10 = f3120O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
            if (i10 == 0) {
                int i11 = f3122O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
                if (i11 > 0) {
                    f3122O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = i11 - 1;
                    o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO.notifyItemChanged(i11, 0);
                    customRecyclerView2.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(f3122O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO);
                } else {
                    f3122O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO.getItemCount() - 1;
                    o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO.notifyItemChanged(0, 0);
                    customRecyclerView2.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(f3122O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO);
                }
                o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO.notifyItemChanged(f3122O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, 0);
                return false;
            }
            if (i10 == 1) {
                int i12 = f3121O00000OOoOOO00O00o0ooooooooO000ooooO0000;
                if (i12 > 0) {
                    f3121O00000OOoOOO00O00o0ooooooooO000ooooO0000 = i12 - 1;
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.notifyItemChanged(i12, 0);
                    customRecyclerView.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(f3121O00000OOoOOO00O00o0ooooooooO000ooooO0000);
                } else {
                    f3121O00000OOoOOO00O00o0ooooooooO000ooooO0000 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getItemCount() - 1;
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.notifyItemChanged(0, 0);
                    customRecyclerView.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(f3121O00000OOoOOO00O00o0ooooooooO000ooooO0000);
                }
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.notifyItemChanged(f3121O00000OOoOOO00O00o0ooooooooO000ooooO0000, 0);
                return false;
            }
            if (i10 == 2) {
                int progress4 = indicatorSeekBar3.getProgress() + f3118O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                i3 = progress4 >= -12 ? progress4 : -12;
                indicatorSeekBar3.setProgress(i3);
                textView3.setText(i3 + "");
                return false;
            }
            if (i10 == 3) {
                int progress5 = indicatorSeekBar2.getProgress() + f3118O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
                i3 = progress5 >= -12 ? progress5 : -12;
                indicatorSeekBar2.setProgress(i3);
                textView2.setText(i3 + "");
                return false;
            }
            if (i10 != 4) {
                return false;
            }
            int progress6 = indicatorSeekBar.getProgress() + f3118O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
            i3 = progress6 >= -12 ? progress6 : -12;
            indicatorSeekBar.setProgress(i3);
            textView.setText(i3 + "");
            return false;
        }
        if (i != 22) {
            return false;
        }
        f3119O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = true;
        f3118O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo++;
        int i13 = f3120O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
        if (i13 == 0) {
            int i14 = f3122O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
            if (i14 < o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO.getItemCount() - 1) {
                f3122O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO++;
                o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO.notifyItemChanged(i14, 0);
                customRecyclerView2.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(f3122O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO);
            } else {
                f3122O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = 0;
                o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO.notifyItemChanged(o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO.getItemCount() - 1, 0);
                customRecyclerView2.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(f3122O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO);
            }
            o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO.notifyItemChanged(f3122O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, 0);
            return false;
        }
        if (i13 == 1) {
            int i15 = f3121O00000OOoOOO00O00o0ooooooooO000ooooO0000;
            if (i15 < o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getItemCount() - 1) {
                f3121O00000OOoOOO00O00o0ooooooooO000ooooO0000++;
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.notifyItemChanged(i15, 0);
                customRecyclerView.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(f3121O00000OOoOOO00O00o0ooooooooO000ooooO0000);
            } else {
                f3121O00000OOoOOO00O00o0ooooooooO000ooooO0000 = 0;
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.notifyItemChanged(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getItemCount() - 1, 0);
                customRecyclerView.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(f3121O00000OOoOOO00O00o0ooooooooO000ooooO0000);
            }
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.notifyItemChanged(f3121O00000OOoOOO00O00o0ooooooooO000ooooO0000, 0);
            return false;
        }
        if (i13 == 2) {
            int progress7 = indicatorSeekBar3.getProgress() + f3118O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
            i2 = progress7 <= 12 ? progress7 : 12;
            indicatorSeekBar3.setProgress(i2);
            textView3.setText(i2 + "");
            return false;
        }
        if (i13 == 3) {
            int progress8 = indicatorSeekBar2.getProgress() + f3118O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
            i2 = progress8 <= 12 ? progress8 : 12;
            indicatorSeekBar2.setProgress(i2);
            textView2.setText(i2 + "");
            return false;
        }
        if (i13 != 4) {
            return false;
        }
        int progress9 = indicatorSeekBar.getProgress() + f3118O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;
        i2 = progress9 <= 12 ? progress9 : 12;
        indicatorSeekBar.setProgress(i2);
        textView.setText(i2 + "");
        return false;
    }
}
