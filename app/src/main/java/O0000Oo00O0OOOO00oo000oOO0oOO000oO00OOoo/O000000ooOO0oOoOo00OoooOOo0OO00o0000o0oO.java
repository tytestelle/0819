package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.view.View;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.orhanobut.hawk.Hawk;
import is.xyz.mpv.MPVLib;
import java.util.ArrayList;
import java.util.HashMap;
import xyz.doikki.videoplayer.player.AbstractPlayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements View.OnClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f1109O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ int f1110O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.Adapter f1111O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(RecyclerView.Adapter adapter, int i, int i2) {
        this.f1109O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i2;
        this.f1111O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = adapter;
        this.f1110O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1109O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = (O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O) this.f1111O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1317O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                int i = this.f1110O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO != null) {
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i);
                }
                o000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i);
                break;
            case 1:
                com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = ((com.github.tvbox.osc.ui.dialog.O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00) ((O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo) this.f1111O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f1207O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f3256O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.getClass();
                com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(view);
                o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(this.f1110O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 2:
                com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo2 = ((com.github.tvbox.osc.ui.dialog.O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0) this.f1111O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f1211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f3256O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo2.getClass();
                com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(view);
                o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo2.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(this.f1110O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            case 3:
                O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo o0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo = ((O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O) this.f1111O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f1298O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                if (o0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo != null) {
                    com.github.tvbox.osc.ui.dialog.O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 = ((com.github.tvbox.osc.ui.dialog.O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00) o0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo).f3289O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O = o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.f3292O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.getClass();
                    int iO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();
                    if (iO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 != -1) {
                        o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.notifyItemChanged(iO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00);
                    }
                    int i2 = this.f1110O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    if (i2 != -1) {
                        o0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O.notifyItemChanged(i2);
                    }
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    Hawk.put("XML时区", Integer.valueOf(i2));
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "偏移时间已更改，EPG加载时生效");
                    o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.dismiss();
                }
                break;
            case 4:
                O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0 o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0 = (O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0) ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) ((O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0) this.f1111O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f1303O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                int i3 = this.f1110O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (i3 != -1) {
                    o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.notifyItemChanged(i3);
                }
                HashMap map = O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.f1301O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                Integer num = (Integer) map.get("videoSelected");
                Integer num2 = (Integer) map.get("audioSelected");
                Integer num3 = (Integer) map.get("subSelected");
                ArrayList arrayList = o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.f1305O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) arrayList.get(i3)).f970O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                AbstractPlayer mediaPlayer = o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.f1302O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getMediaPlayer();
                int i4 = O0000o0O0OOoooOOOo0oOoOOO0oOO0O0oO0o000o.f1299O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.ordinal()];
                if (i4 == 1) {
                    o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i3, mediaPlayer);
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) arrayList.get(i3)).f972O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = true;
                    if (num != null && num.intValue() != -1) {
                        if (num.intValue() != i3) {
                            ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) arrayList.get(num.intValue())).f972O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = false;
                        }
                        o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.notifyItemChanged(num.intValue());
                    }
                    map.put("videoSelected", Integer.valueOf(i3));
                    break;
                } else if (i4 == 2) {
                    o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i3, mediaPlayer);
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) arrayList.get(i3)).f972O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = true;
                    if (num2 != null && num2.intValue() != -1) {
                        if (num2.intValue() != i3) {
                            ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) arrayList.get(num2.intValue())).f972O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = false;
                        }
                        o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.notifyItemChanged(num2.intValue());
                    }
                    map.put("audioSelected", Integer.valueOf(i3));
                    break;
                } else if (i4 == 3) {
                    boolean z = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) arrayList.get(i3)).f972O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
                    boolean z2 = !z;
                    if (mediaPlayer instanceof O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                        O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) mediaPlayer;
                        int i5 = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) arrayList.get(i3)).f969O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                        if (z) {
                            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i5);
                            LivePlayActivity.f2944O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.setVisibility(8);
                        } else {
                            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setTrack(i5);
                        }
                    } else if (mediaPlayer instanceof O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                        ((O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) mediaPlayer).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) arrayList.get(i3), z2, true);
                    } else if (mediaPlayer instanceof O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                        int i6 = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) arrayList.get(i3)).f969O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                        ((O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) mediaPlayer).getClass();
                        if (z) {
                            MPVLib.setPropertyInt(CmcdConfiguration.KEY_SESSION_ID, -1);
                        } else {
                            MPVLib.setPropertyInt(CmcdConfiguration.KEY_SESSION_ID, i6);
                        }
                    }
                    ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) arrayList.get(i3)).f972O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = z2;
                    if (num3 != null && num3.intValue() != -1) {
                        if (num3.intValue() != i3) {
                            ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) arrayList.get(num3.intValue())).f972O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = false;
                        }
                        o0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.notifyItemChanged(num3.intValue());
                    }
                    map.put("subSelected", Integer.valueOf(i3));
                    break;
                }
                break;
            default:
                O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = (O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) this.f1111O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.f1317O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                int i7 = this.f1110O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 != null) {
                    o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(i7);
                }
                o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(i7);
                break;
        }
    }
}
