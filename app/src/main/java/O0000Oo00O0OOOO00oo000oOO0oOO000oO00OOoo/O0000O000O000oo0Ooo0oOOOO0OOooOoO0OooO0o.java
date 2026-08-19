package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.player.ku9py.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ArrayList f1158O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new ArrayList();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO f1159O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o() {
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f1158O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
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
        return new O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(this, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_epg_date_group, viewGroup, false));
    }

    public void setOnItemClickListener(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO) {
        this.f1159O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = (O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0) viewHolder;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) this.f1158O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.getLayoutPosition());
        String str = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f952O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        TextView textView = o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.f1155O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        textView.setText(str);
        String str2 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f953O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        TextView textView2 = o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.f1156O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        textView2.setText(str2);
        if (com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo != 2) {
            if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f951O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0) {
                textView.setTextColor(LivePlayActivity.f2951O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo);
                textView2.setTextColor(LivePlayActivity.f2951O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo);
            } else {
                textView.setTextColor(LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
                textView2.setTextColor(LivePlayActivity.f2950O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO);
            }
            o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.itemView.setBackground(LivePlayActivity.f2949O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO);
            return;
        }
        if (o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f951O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0) {
            textView.setTextColor(LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
            textView2.setTextColor(LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
            o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.itemView.setBackground(LivePlayActivity.f2948O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O);
        } else {
            textView.setTextColor(LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
            textView2.setTextColor(LivePlayActivity.f2950O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO);
            o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0.itemView.setBackground(LivePlayActivity.f2949O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO);
        }
    }
}
