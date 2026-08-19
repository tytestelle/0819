package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.bean.Appoint;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public static boolean f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O f1149O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public ArrayList f1150O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public LivePlayActivity f1151O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public int f1152O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public int f1153O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO f1154O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    public static int O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return -1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int size = arrayList.size() - 1;
        int i = 0;
        long j = Long.MAX_VALUE;
        int i2 = -1;
        while (i <= size) {
            int i3 = (i + size) / 2;
            O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) arrayList.get(i3);
            if (jCurrentTimeMillis < o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f897O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
                size = i3 - 1;
            } else {
                if (jCurrentTimeMillis <= o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f898O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) {
                    return i3;
                }
                i = i3 + 1;
            }
            long jAbs = Math.abs(jCurrentTimeMillis - o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f898O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0);
            if (jAbs < j) {
                i2 = i3;
                j = jAbs;
            }
        }
        return i2 != -1 ? i2 : arrayList.size() - 1;
    }

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(TextView textView, int i) {
        int i2;
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
        Appoint appoint = new Appoint();
        o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
        Appoint appoint2 = (Appoint) Hawk.get("appointment", appoint);
        int largeGroupIndex = appoint2.getLargeGroupIndex();
        int groupIndex = appoint2.getGroupIndex();
        int itemIndex = appoint2.getItemIndex();
        O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
        String dateStr = appoint2.getDateStr();
        ArrayList arrayList = o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.f1158O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int i3 = -1;
        if (arrayList.isEmpty() || dateStr == null) {
            i2 = -1;
            break;
        }
        i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                i2 = -1;
                break;
            } else if (((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) arrayList.get(i2)).f953O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.equals(dateStr)) {
                break;
            } else {
                i2++;
            }
        }
        String timeStr = appoint2.getTimeStr();
        ArrayList arrayList2 = this.f1150O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (!arrayList2.isEmpty() && timeStr != null) {
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                if ((((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) arrayList2.get(i4)).f893O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + "-" + ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) arrayList2.get(i4)).f894O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0).equals(timeStr)) {
                    i3 = i4;
                    break;
                }
            }
        }
        long time = appoint2.getTime();
        if (largeGroupIndex == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo && groupIndex == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo && itemIndex == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 && com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 == i2 && i == i3 && time > System.currentTimeMillis() / 1000) {
            textView.setText("已预约");
        } else {
            textView.setText("预约");
        }
    }

    public final String O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i) {
        ArrayList arrayList = this.f1150O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        return !arrayList.isEmpty() ? new SimpleDateFormat("MM月dd日 EE", Locale.CHINESE).format(((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) arrayList.get(i)).f896O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) : new SimpleDateFormat("MM月dd日 EE", Locale.CHINESE).format(new Date());
    }

    public final String O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i) {
        ArrayList arrayList = this.f1150O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (arrayList.isEmpty()) {
            return "精彩节目";
        }
        return ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) arrayList.get(i)).f893O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + "-" + ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) arrayList.get(i)).f894O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 + " " + ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) arrayList.get(i)).f892O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(int i, boolean z) {
        int i2 = this.f1153O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        this.f1153O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = i;
        if (i2 != -1) {
            notifyItemChanged(i2);
        }
        int i3 = this.f1153O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        if (i3 != -1) {
            notifyItemChanged(i3);
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f1150O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        sb.append(((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) arrayList.get(this.f1153O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0)).f893O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        sb.append("-");
        sb.append(((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) arrayList.get(this.f1153O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0)).f894O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        sb.append(" ");
        sb.append(((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) arrayList.get(this.f1153O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0)).f892O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
        String string = sb.toString();
        if (z) {
            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "预约节目：" + string);
        } else {
            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "取消预约：" + string);
        }
    }

    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = false;
        int i = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3045O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo;
        if (i != -1) {
            notifyItemChanged(i);
        }
        com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3045O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo = -1;
    }

    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i) {
        if (i == -1) {
            return;
        }
        f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = true;
        int i2 = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3045O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo;
        com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3046O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;
        com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3045O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo = i;
        if (i != -1) {
            notifyItemChanged(i);
        }
        if (i2 != -1) {
            notifyItemChanged(i2);
        }
        int i3 = this.f1152O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (i3 != -1) {
            notifyItemChanged(i3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f1150O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(this, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_epglist, viewGroup, false));
    }

    public void setOnItemClickListener(O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O o00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O) {
        this.f1149O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        int i2;
        O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = (O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo) viewHolder;
        int layoutPosition = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.getLayoutPosition();
        ArrayList arrayList = this.f1150O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) arrayList.get(layoutPosition);
        String str = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f892O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        TextView textView = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.f1144O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        textView.setText(str);
        String str2 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f893O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + " - " + o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f894O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        TextView textView2 = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.f1145O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        textView2.setText(str2);
        textView.setTextColor(LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView2.setTextColor(LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
        com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
        int i3 = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
        int i4 = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.getClass();
        int size = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(i3, i4).size();
        boolean zIsEmpty = arrayList.isEmpty();
        TextView textView3 = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.f1146O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (zIsEmpty || this.f1152O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == -1 || com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo == -1 || com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo == -1 || (i2 = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000) == -1 || i2 >= size) {
            textView3.setVisibility(8);
        } else {
            O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f1154O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
            boolean z = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != null && o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
            int i5 = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;
            LivePlayActivity livePlayActivity = this.f1151O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (i5 == 6) {
                int i6 = this.f1152O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                if (i6 == layoutPosition) {
                    textView3.setVisibility(0);
                    textView3.setTextColor(livePlayActivity.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
                    textView3.setText("直播");
                    textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                } else if (i6 > layoutPosition) {
                    textView3.setTextColor(-1);
                    textView3.setText("回看");
                    if (z) {
                        textView3.setVisibility(0);
                    } else {
                        textView3.setVisibility(8);
                    }
                } else {
                    textView3.setVisibility(0);
                    textView3.setTextColor(-1);
                    O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(textView3, layoutPosition);
                }
            } else if (i5 < 6) {
                textView3.setTextColor(-1);
                textView3.setText("回看");
                if (z) {
                    textView3.setVisibility(0);
                } else {
                    textView3.setVisibility(8);
                }
            } else {
                textView3.setVisibility(0);
                textView3.setTextColor(-1);
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(textView3, layoutPosition);
            }
            boolean z2 = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3036O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo && com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo && com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00 == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 && layoutPosition == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3045O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo && com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3046O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo;
            if (f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                int i7 = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;
                String str3 = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f892O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (i7 < 6) {
                    if (z2) {
                        textView.setTextColor(livePlayActivity.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
                        textView2.setTextColor(livePlayActivity.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
                        textView3.setTextColor(livePlayActivity.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
                        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                        textView3.setText("回看中");
                        com.github.tvbox.osc.ui.dialog.O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.f3228O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.setText(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f893O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + " - " + o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f894O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                        com.github.tvbox.osc.ui.dialog.O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.f3229O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.setText(str3);
                    }
                } else if (i7 == 6) {
                    if (z2) {
                        textView.setTextColor(livePlayActivity.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
                        textView2.setTextColor(livePlayActivity.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
                        textView3.setTextColor(livePlayActivity.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
                        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                        textView3.setText("回看中");
                        com.github.tvbox.osc.ui.dialog.O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.f3228O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.setText(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f893O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + " - " + o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f894O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                        com.github.tvbox.osc.ui.dialog.O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.f3229O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000.setText(str3);
                    }
                    if (this.f1152O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == layoutPosition) {
                        textView.setTextColor(-1);
                        textView2.setTextColor(-1);
                        textView3.setTextColor(livePlayActivity.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
                        textView.setEllipsize(truncateAt);
                        textView3.setText("直播");
                    }
                }
            } else if (com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 == 6 && this.f1152O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == layoutPosition) {
                textView.setTextColor(livePlayActivity.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
                textView2.setTextColor(livePlayActivity.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
                textView3.setTextColor(livePlayActivity.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
                textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                textView3.setText("直播");
            }
        }
        if (com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo != 3) {
            o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.itemView.setBackground(LivePlayActivity.f2949O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO);
            return;
        }
        if (layoutPosition != com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3044O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0) {
            o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.itemView.setBackground(LivePlayActivity.f2949O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO);
            return;
        }
        textView.setTextColor(LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
        textView2.setTextColor(LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
        textView3.setTextColor(LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.itemView.setBackground(LivePlayActivity.f2948O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O);
    }
}
