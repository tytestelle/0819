package O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.RectF;
import android.os.Handler;
import android.widget.PopupWindow;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import com.chaquo.python.PyObject;
import com.github.tvbox.osc.base.App;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.activity.LoginActivity;
import com.github.tvbox.osc.ui.dialog.O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
import com.github.tvbox.osc.ui.tv.CustomView.MusicLoadingView;
import com.orhanobut.hawk.Hawk;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import xyz.doikki.videoplayer.player.VideoView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f68O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f69O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj, int i) {
        this.f68O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f69O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f68O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 this_run = (O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) this.f69O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this_run, "$this_run");
                com.github.tvbox.osc.ui.dialog.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = (com.github.tvbox.osc.ui.dialog.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) this_run;
                LivePlayActivity livePlayActivity = o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f3100O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                VideoView videoView = livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (videoView != null && videoView.getDuration() > 0) {
                    livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.pause();
                }
                o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.dismiss();
                return;
            case 1:
                O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00;
                ArrayList arrayList = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1150O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                arrayList.clear();
                arrayList.addAll((ArrayList) this.f69O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                if (com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 != -1) {
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
                    int i = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
                    int i2 = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.getClass();
                    ArrayList arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(i, i2);
                    int size = arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO.size();
                    int i3 = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;
                    if (size > i3) {
                        o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1154O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO.get(i3);
                    }
                }
                o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.notifyDataSetChanged();
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.getClass();
                int i4 = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;
                if (i4 == 6) {
                    if (!O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                        int i5 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.f1152O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.f3057O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Math.max(0, i5 - 4));
                        com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 = i5;
                        return;
                    } else if (com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3036O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo && com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo && com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00 == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 && com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3046O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo == i4) {
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.f3057O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Math.max(0, com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3045O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo - 4));
                        com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3045O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo;
                        return;
                    } else {
                        int i6 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.f1152O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.f3057O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Math.max(0, i6 - 4));
                        com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 = i6;
                        return;
                    }
                }
                if (i4 >= 6) {
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.f3057O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(0);
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 = -1;
                    return;
                }
                if (!O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.f3057O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(0);
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 = -1;
                    return;
                } else if (com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3036O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo && com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo && com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00 == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 && com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3046O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo == i4) {
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.f3057O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Math.max(0, com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3045O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo - 4));
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3045O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo;
                    return;
                } else {
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.f3057O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(0);
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0 = -1;
                    return;
                }
            case 2:
                Handler handler = ((LoginActivity) this.f69O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f3015O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                handler.removeMessages(22);
                handler.sendEmptyMessage(22);
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "启动时间过长，正在强制进入界面，请稍后！");
                return;
            case 3:
                ((O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo) this.f69O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f1246O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(0);
                return;
            case 4:
                break;
            case 5:
                O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) this.f69O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f1428O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null) {
                    ((PyObject) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f836O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).callAttr("stop", new Object[0]);
                    return;
                }
                return;
            case 6:
                ((O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0) this.f69O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f1538O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
                return;
            case 7:
                ((Carousel) this.f69O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$updateItems$0();
                return;
            case 8:
                ProcessLifecycleOwner.delayedPauseRunnable$lambda$0((ProcessLifecycleOwner) this.f69O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                return;
            case 9:
                ((DefaultAnalyticsCollector) this.f69O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).releaseInternal();
                return;
            case 10:
                ((AdsMediaSource) this.f69O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).maybeUpdateSourceInfo();
                return;
            case 11:
                ((com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) this.f69O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f3051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o();
                return;
            case 12:
                com.github.tvbox.osc.ui.dialog.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = (com.github.tvbox.osc.ui.dialog.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) this.f69O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                LivePlayActivity livePlayActivity2 = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3097O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                int i7 = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3096O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (i7 == 0) {
                    File file = new File(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1323O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    if (!file.exists()) {
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "下载列表为空");
                        return;
                    }
                    o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.dismiss();
                    O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(file);
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已清除下载的列表");
                    livePlayActivity2.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(0);
                    return;
                }
                if (i7 == 1) {
                    File file2 = new File(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1321O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    if (!file2.exists()) {
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "本地列表为空");
                        return;
                    }
                    o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.dismiss();
                    O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(file2);
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已清除本地列表");
                    livePlayActivity2.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(1);
                    return;
                }
                if (i7 == 2) {
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(livePlayActivity2);
                    ReentrantLock reentrantLock = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1376O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    reentrantLock.lock();
                    try {
                        SQLiteDatabase writableDatabase = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.delete("epg_data", null, null);
                            writableDatabase.execSQL("DELETE FROM sqlite_sequence WHERE name='epg_data'");
                            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1377O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.evictAll();
                        }
                        break;
                    } catch (Exception unused) {
                    } finally {
                        reentrantLock.unlock();
                    }
                    livePlayActivity2.getClass();
                    LivePlayActivity.f2945O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.clear();
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已清除EPG缓存");
                    o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.dismiss();
                    return;
                }
                if (i7 == 3) {
                    File file3 = new File(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1326O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
                    if (!file3.exists()) {
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "图标文件为空");
                        return;
                    }
                    o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.dismiss();
                    O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(file3);
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已清除图标文件");
                    return;
                }
                if (i7 == 4) {
                    ArrayList<File> arrayList2 = new ArrayList();
                    App app = App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    arrayList2.add(app.getExternalCacheDir());
                    arrayList2.add(app.getCacheDir());
                    o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.dismiss();
                    for (File file4 : arrayList2) {
                        if (file4.exists()) {
                            O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(file4);
                        }
                    }
                    O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    Hawk.deleteAll();
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已清除APP缓存");
                    livePlayActivity2.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O();
                    return;
                }
                return;
            case 13:
                O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = (O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00) this.f69O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.getClass();
                if (O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.f3204O00000OOoOOO00O00o0ooooooooO000ooooO0000.isEmpty()) {
                    o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.f3218O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = true;
                    Iterator it = O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f875O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) it.next()).f905O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.iterator();
                        while (it2.hasNext()) {
                            Iterator it3 = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) it2.next()).f909O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.iterator();
                            while (it3.hasNext()) {
                                O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) it3.next()).f937O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, "Z");
                            }
                        }
                    }
                    o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.f3218O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = false;
                    PopupWindow popupWindow = o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.f3214O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                    if (popupWindow == null || !popupWindow.isShowing()) {
                        return;
                    }
                    o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.f3219O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
                    return;
                }
                return;
            default:
                com.github.tvbox.osc.ui.dialog.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = (com.github.tvbox.osc.ui.dialog.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo) this.f69O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.getClass();
                O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2 = LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3279O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3195O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                LinkedHashSet linkedHashSet = new LinkedHashSet(o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.f1249O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                linkedHashSet.addAll(o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.f3295O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1311O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.f1246O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f2991O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.post(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, 10, linkedHashSet, o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2));
                return;
        }
        while (true) {
            MusicLoadingView musicLoadingView = (MusicLoadingView) this.f69O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (!musicLoadingView.f3325O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                return;
            }
            RectF rectF = musicLoadingView.f3324O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            rectF.left = 0.0f;
            rectF.right = musicLoadingView.f3329O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
            musicLoadingView.postInvalidate();
            try {
                Thread.sleep(1000 / musicLoadingView.f3330O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
