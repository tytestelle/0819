package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.player.ku9py.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final ArrayList f1209O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new ArrayList();

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public LivePlayActivity f1210O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000 f1211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i, boolean z, boolean z2) {
        int i2;
        ArrayList arrayList = f1209O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (z2) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) it.next();
                if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                    i2 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f959O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    break;
                }
            }
            if (i2 != -1) {
                ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) arrayList.get(i2)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
                notifyItemChanged(i2);
            }
        }
        if (i == -1 || getItemCount() <= i) {
            return;
        }
        ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) arrayList.get(i)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = z;
        notifyItemChanged(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = f1209O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
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
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = (O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00) viewHolder;
        int layoutPosition = o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.getLayoutPosition();
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) f1209O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.get(layoutPosition);
        String str = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f960O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        TextView textView = o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.f1208O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        textView.setText(str);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        boolean z = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        LivePlayActivity livePlayActivity = this.f1210O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (z) {
            textView.setTextColor(livePlayActivity.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
            textView.setText("› " + o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f960O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + " ‹");
        } else {
            textView.setTextColor(-1);
            textView.setText(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f960O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
        textView.getPaint().setFlags(0);
        textView.getPaint().setAntiAlias(true);
        if (com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f3262O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 != 2) {
            if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                textView.setTextColor(livePlayActivity.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
                textView.setText("› " + o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f960O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + " ‹");
            } else {
                textView.setTextColor(-1);
                textView.setText(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f960O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            }
            o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.itemView.setBackgroundResource(R.color.transparent);
        } else if (layoutPosition == com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f3261O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0) {
            textView.setTextColor(-1);
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.itemView.setBackgroundResource(R.drawable.shape_channel_group_recycleview_item_selected);
        } else {
            o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.itemView.setBackgroundResource(R.color.transparent);
        }
        o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.itemView.setOnClickListener(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, layoutPosition, 2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_live_setting, viewGroup, false);
        O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = new O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00(viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.f1208O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (TextView) viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.findViewById(R.id.tvSettingItemName);
        ViewGroup.LayoutParams layoutParams = viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getLayoutParams();
        layoutParams.height = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1432O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setLayoutParams(layoutParams);
        return o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00;
    }

    public void setOnItemClickListener(O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000 o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000) {
        this.f1211O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000;
    }
}
