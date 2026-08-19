package O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00;

import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import com.orhanobut.hawk.Hawk;
import com.tencent.smtt.sdk.TbsDownloadConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f1073O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ LivePlayActivity f1074O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ String f1075O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i, LivePlayActivity livePlayActivity, String str) {
        this.f1073O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f1074O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = livePlayActivity;
        this.f1075O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f1075O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        LivePlayActivity livePlayActivity = this.f1074O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        switch (this.f1073O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                String str2 = LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo;
                livePlayActivity.getClass();
                LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.getClass();
                O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                Float fValueOf = Float.valueOf(1.0f);
                o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
                Hawk.put("GET_VIDEO_SPEED", fValueOf);
                livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setSpeed(1.0f);
                LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo = "直播";
                livePlayActivity.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(str);
                O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
                long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - TbsDownloadConfig.DEFAULT_RETRY_INTERVAL_SEC;
                long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
                int iO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO();
                int currentPosition = ((int) livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getCurrentPosition()) / 1000;
                if (O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                    if (iO000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO == 0) {
                        LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setMin(0.0f);
                        LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setMax(O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO - O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo);
                    } else {
                        livePlayActivity.f2965O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setVisibility(8);
                        LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setProgress(currentPosition);
                    }
                    livePlayActivity.f2965O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setVisibility(0);
                } else if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == null || !o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()) {
                    livePlayActivity.f2965O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setVisibility(8);
                    LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setProgress(currentPosition);
                } else {
                    LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setMin(0.0f);
                    long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                    LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setMax(j);
                    livePlayActivity.f2965O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setVisibility(0);
                    O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3049O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo = j;
                    O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3048O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO = jCurrentTimeMillis2;
                    O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo = jCurrentTimeMillis;
                }
                livePlayActivity.f2965O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setText(LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo);
                livePlayActivity.f2965O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setVisibility(8);
                break;
            default:
                String str3 = LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo;
                livePlayActivity.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o(str);
                livePlayActivity.O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000();
                break;
        }
    }
}
