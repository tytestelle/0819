package O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00;

import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import com.github.tvbox.osc.ui.dialog.O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import xyz.doikki.videoplayer.player.VideoView;
import xyz.doikki.videoplayer.util.PlayerUtils;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f1086O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ LivePlayActivity f1087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(LivePlayActivity livePlayActivity, int i) {
        this.f1086O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f1087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = livePlayActivity;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x02b8 A[LOOP:1: B:101:0x027d->B:113:0x02b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x02c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:142:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0074  */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        switch (this.f1086O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                LivePlayActivity livePlayActivity = this.f1087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (livePlayActivity.f2962O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getVisibility() == 8) {
                    livePlayActivity.f2962O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.setVisibility(0);
                    livePlayActivity.f2962O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.startAnimation(AnimationUtils.loadAnimation(livePlayActivity, R.anim.bottom_group_slide_in_bottom));
                    livePlayActivity.f2977O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.setVisibility(0);
                    livePlayActivity.f2976O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.setVisibility(livePlayActivity.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.getVisibility() == 0 ? 0 : 8);
                    livePlayActivity.f2974O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.setVisibility(0);
                }
                livePlayActivity.f2979O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.post(new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(livePlayActivity, 1));
                if (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o()) {
                    livePlayActivity.f2970O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.setText("00:00 - 23:59");
                    livePlayActivity.f2969O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.setText("精彩节目");
                    livePlayActivity.f2973O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.setText("00:00 - 23:59");
                    livePlayActivity.f2971O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.setText("精彩节目");
                    break;
                } else {
                    O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
                    if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 != null) {
                        O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(new O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(livePlayActivity, o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2, 2, 0));
                        break;
                    }
                }
                break;
            case 1:
                LivePlayActivity livePlayActivity2 = this.f1087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                livePlayActivity2.f2959O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setVisibility(8);
                livePlayActivity2.f2959O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setText("");
                ArrayList arrayList = O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f875O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 1;
                boolean z = false;
                for (int i7 = (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() || O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f876O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isEmpty()) ? 0 : 1; i7 < arrayList.size(); i7++) {
                    int i8 = 0;
                    while (i8 < ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) arrayList.get(i7)).f905O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.size()) {
                        LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.getClass();
                        int size = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(i7, i8).size();
                        int i9 = i6 + size;
                        int i10 = i9 - 1;
                        i5 += size;
                        int i11 = livePlayActivity2.f2958O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        if (i11 < i6 || i11 > i10) {
                            i8++;
                            i6 = i9;
                        } else {
                            i4 = (i11 - i6) + 1;
                            i2 = i7;
                            i3 = i8;
                            z = true;
                            if (z) {
                                int i12 = i4 - 1;
                                i = livePlayActivity2.f2958O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                                if (i > 0 || i > i5) {
                                    O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "无效的节目序号，请重新选择！");
                                } else if (O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i2, i3).size() > i12) {
                                    livePlayActivity2.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(i2, i3, i12, false);
                                }
                                livePlayActivity2.f2958O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = 0;
                            }
                        }
                        break;
                    }
                    if (z) {
                        int i13 = i4 - 1;
                        i = livePlayActivity2.f2958O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                        if (i > 0) {
                            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "无效的节目序号，请重新选择！");
                        } else {
                            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "无效的节目序号，请重新选择！");
                        }
                        livePlayActivity2.f2958O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = 0;
                    }
                    break;
                }
                int i14 = i4 - 1;
                i = livePlayActivity2.f2958O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                if (i > 0) {
                    O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "无效的节目序号，请重新选择！");
                } else {
                    O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "无效的节目序号，请重新选择！");
                }
                livePlayActivity2.f2958O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = 0;
                break;
            case 2:
                LivePlayActivity livePlayActivity3 = this.f1087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                livePlayActivity3.f2991O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.postDelayed(this, 1000L);
                if (((livePlayActivity3.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) & (true ^ O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.f3226O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0)) && !O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 && (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o) != null && o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                    O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO++;
                    break;
                }
                break;
            case 3:
                LivePlayActivity livePlayActivity4 = this.f1087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                VideoView videoView = livePlayActivity4.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                livePlayActivity4.f2991O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.postDelayed(this, (long) (1000.0f / (videoView == null ? 1.0f : videoView.getSpeed())));
                int iO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                VideoView videoView2 = livePlayActivity4.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if ((true ^ O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.f3226O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0) & (videoView2 != null)) {
                    int currentPosition = ((int) videoView2.getCurrentPosition()) / 1000;
                    if (livePlayActivity4.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.isPlaying()) {
                        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3049O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo++;
                        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3050O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o++;
                    }
                    if (O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                        if (O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3050O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o >= O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO - O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo) {
                            O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3050O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO - O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo;
                        }
                        if (iO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO == 0) {
                            LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3237O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.setText(O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3050O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o + O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo));
                            LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setProgress(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3050O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o);
                        } else {
                            LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3237O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.setText(PlayerUtils.stringForTimeVod(currentPosition * 1000));
                            LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setProgress(currentPosition);
                        }
                    } else {
                        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3 = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
                        if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3 == null || !o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO3.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                            LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3237O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.setText(PlayerUtils.stringForTimeVod(currentPosition * 1000));
                            LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setProgress(currentPosition);
                        } else {
                            long j = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3049O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo + O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo;
                            long j2 = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO;
                            if (j > j2) {
                                j = j2;
                            }
                            LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3237O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.setText(O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(j));
                            LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3238O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setText(O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO));
                            LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setProgress(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3049O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo);
                            if (LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.isShown()) {
                                TextView textView = O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.f3229O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
                                O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00;
                                long j3 = j * 1000;
                                o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.getClass();
                                Date date = new Date(j3);
                                O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO4 = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
                                LivePlayActivity livePlayActivity5 = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1151O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                                livePlayActivity5.getClass();
                                if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO4 != null) {
                                    O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(livePlayActivity5, 2, o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO4, date));
                                }
                                ArrayList arrayList2 = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f943O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                                String str = "精彩节目";
                                if (arrayList2 != null) {
                                    for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                                        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) arrayList2.get(i15);
                                        long j4 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f897O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                                        long j5 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f898O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                                        if (j3 >= j4 && j3 <= j5) {
                                            str = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f892O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                                        }
                                    }
                                }
                                textView.setText(str);
                                O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.f3228O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.setText(new SimpleDateFormat("MM月dd日 EE", Locale.CHINESE).format(new Date(j3)));
                            }
                        }
                    }
                }
                break;
            case 4:
                LivePlayActivity livePlayActivity6 = this.f1087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (livePlayActivity6.f2962O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.getVisibility() == 0) {
                    livePlayActivity6.f2962O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.setVisibility(8);
                    livePlayActivity6.f2962O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.startAnimation(AnimationUtils.loadAnimation(livePlayActivity6, R.anim.bottom_group_slide_out_bottom));
                    livePlayActivity6.f2977O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.setVisibility(8);
                    livePlayActivity6.f2976O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.setVisibility(8);
                    livePlayActivity6.f2974O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.setVisibility(livePlayActivity6.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.getVisibility() != 8 ? 0 : 8);
                }
                break;
            default:
                if (LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o != null) {
                    boolean z2 = O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
                    LivePlayActivity livePlayActivity7 = this.f1087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    if (z2 || "时移".equals(LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo)) {
                        livePlayActivity7.f2991O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.post(livePlayActivity7.f3007O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000);
                        O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "回放失败，恢复播放");
                    } else {
                        livePlayActivity7.f2961O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO++;
                        if (!((Boolean) Hawk.get("遍历多源", Boolean.valueOf(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().f1474O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0))).booleanValue()) {
                            O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO5 = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
                            if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO5.f940O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 + 1 != o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO5.f941O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
                                if (LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f941O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo != livePlayActivity7.f2961O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
                                    livePlayActivity7.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
                                }
                            }
                        } else if (LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f941O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo != livePlayActivity7.f2961O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) {
                            livePlayActivity7.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
                        }
                        Integer[] numArrO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = LivePlayActivity.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(1);
                        this.f1087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(numArrO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00[2].intValue(), numArrO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00[0].intValue(), numArrO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00[1].intValue(), false, false);
                    }
                    break;
                }
                break;
        }
    }
}
