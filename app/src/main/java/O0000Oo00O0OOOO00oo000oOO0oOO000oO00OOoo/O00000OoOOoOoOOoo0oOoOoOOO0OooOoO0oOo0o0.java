package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.player.ku9py.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public ArrayList f1130O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o f1131O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(ArrayList arrayList) {
        ArrayList arrayList2 = this.f1130O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        notifyDataSetChanged();
        if (arrayList.size() == 1 && O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() != 2) {
            LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3064O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setVisibility(8);
        } else {
            if (com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3032O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0) {
                return;
            }
            LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3064O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f1130O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
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
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = (O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) viewHolder;
        int layoutPosition = o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.getLayoutPosition();
        String str = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1130O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(layoutPosition)).f907O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        TextView textView = o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1128O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        textView.setText(str);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = this.f1131O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o != null) {
            O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
            boolean z = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo == 0;
            boolean z2 = layoutPosition == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
            com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = (com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f836O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (!z) {
                if (z2) {
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, textView, LivePlayActivity.f2951O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo);
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, textView);
                } else {
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, textView, LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
                }
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.itemView, false);
                return;
            }
            textView.setTextColor(LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
            if (!z2) {
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.itemView, false);
            } else {
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, textView);
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.itemView, true);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = new O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(this, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_live_channel_group, viewGroup, false));
        ViewGroup.LayoutParams layoutParams = o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.itemView.getLayoutParams();
        layoutParams.height = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1432O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.itemView.setLayoutParams(layoutParams);
        return o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
    }

    public void setOnItemClickListener(O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) {
        this.f1131O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
    }
}
