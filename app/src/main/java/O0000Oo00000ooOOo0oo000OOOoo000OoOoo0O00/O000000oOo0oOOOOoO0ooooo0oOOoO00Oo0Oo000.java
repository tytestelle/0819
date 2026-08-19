package O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00;

import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import com.github.tvbox.osc.bean.Appoint;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.dialog.O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo;
import com.github.tvbox.osc.ui.dialog.O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;
import com.orhanobut.hawk.Hawk;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 extends Handler {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f1084O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f1085O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Object obj, int i) {
        this.f1084O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f1085O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Uri uriForFile;
        Object obj = this.f1085O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        switch (this.f1084O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                int i = message.what;
                LivePlayActivity livePlayActivity = (LivePlayActivity) obj;
                if (i == 21) {
                    livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.start();
                    break;
                } else if (i == 48) {
                    int i2 = message.arg1;
                    ArrayList arrayList = (ArrayList) message.obj;
                    if (i2 != -1 && i2 < arrayList.size()) {
                        String str = LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo;
                        livePlayActivity.getClass();
                        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) arrayList.get(i2);
                        String str2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f893O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                        String str3 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f894O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                        livePlayActivity.f2970O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.setText(str2 + " - " + str3);
                        livePlayActivity.f2969O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.setText(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f892O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                        if (i2 != arrayList.size() - 1) {
                            TextView textView = livePlayActivity.f2973O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
                            StringBuilder sb = new StringBuilder();
                            int i3 = i2 + 1;
                            sb.append(((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) arrayList.get(i3)).f893O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                            sb.append(" - ");
                            sb.append(((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) arrayList.get(i3)).f894O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                            textView.setText(sb.toString());
                            livePlayActivity.f2971O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.setText(((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) arrayList.get(i3)).f892O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                        } else {
                            livePlayActivity.f2973O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.setText("00:00 - 23:59");
                            livePlayActivity.f2971O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.setText("精彩节目");
                        }
                        if (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO()) {
                            livePlayActivity.f2988O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.setText(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f895O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO);
                            livePlayActivity.f2988O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.setVisibility(0);
                        } else {
                            livePlayActivity.f2988O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o.setVisibility(8);
                        }
                        long j = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f897O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                        long j2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f898O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j3 = j2 - jCurrentTimeMillis;
                        long j4 = j2 - j;
                        if (j4 != 0) {
                            livePlayActivity.f2980O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.setProgress((int) (((jCurrentTimeMillis - j) * 100) / j4));
                            long j5 = j3 / 60000;
                            if (j5 > 60) {
                                TextView textView2 = livePlayActivity.f2972O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
                                Long lValueOf = Long.valueOf(j5 / 60);
                                long j6 = j5 % 60;
                                textView2.setText("距结束：".concat(String.format("%d小时%s", lValueOf, j6 > 0 ? String.format("%d分钟", Long.valueOf(j6)) : "")));
                            } else {
                                livePlayActivity.f2972O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.setText("距结束：".concat(String.format("%d分钟", Long.valueOf(j5))));
                            }
                        }
                    } else {
                        livePlayActivity.f2970O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.setText("00:00 - 23:59");
                        livePlayActivity.f2969O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.setText("精彩节目");
                        livePlayActivity.f2973O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.setText("00:00 - 23:59");
                        livePlayActivity.f2971O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.setText("精彩节目");
                    }
                    break;
                } else if (i == 26248) {
                    O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                    Appoint appoint = new Appoint();
                    o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
                    Appoint appoint2 = (Appoint) Hawk.get("appointment", appoint);
                    if (appoint2 != null) {
                        int largeGroupIndex = appoint2.getLargeGroupIndex();
                        int groupIndex = appoint2.getGroupIndex();
                        int itemIndex = appoint2.getItemIndex();
                        if (groupIndex != -1 && itemIndex != -1) {
                            ((LivePlayActivity) obj).O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(largeGroupIndex, groupIndex, itemIndex, false, false);
                            LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                            O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "正在播放预约频道");
                            break;
                        }
                    }
                }
                break;
            case 1:
                O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo = (O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo) obj;
                if (o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.isShowing() && message.what == 0) {
                    o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
                    o0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.f3203O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.sendEmptyMessageDelayed(0, 1000L);
                    break;
                }
                break;
            default:
                int i4 = message.what;
                O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 = (O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0) obj;
                if (i4 == 1) {
                    o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3307O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.setProgress(o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3306O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                    o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3315O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.setText("已完成\t" + o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3307O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getProgress() + "%");
                    break;
                } else if (i4 == 2) {
                    o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.getClass();
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.addFlags(268435456);
                    File file = new File(O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3301O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO);
                    int i5 = Build.VERSION.SDK_INT;
                    LivePlayActivity livePlayActivity2 = o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.f3303O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    if (i5 >= 24) {
                        intent.setFlags(1);
                        uriForFile = FileProvider.getUriForFile(livePlayActivity2, livePlayActivity2.getPackageName() + ".fileprovider", file);
                        intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
                    } else {
                        uriForFile = Uri.parse("file://" + file);
                    }
                    intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
                    livePlayActivity2.startActivity(intent);
                    o0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.dismiss();
                    System.exit(0);
                    break;
                }
                break;
        }
    }
}
