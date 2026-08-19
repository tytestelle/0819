package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.player.ku9py.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final ArrayList f1126O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ArrayList();

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public O00000OOoOOO00O00o0ooooooooO000ooooO0000 f1127O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = f1126O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
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
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = (O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) viewHolder;
        int layoutPosition = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.getLayoutPosition();
        String str = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) f1126O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(layoutPosition)).f904O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        TextView textView = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f1124O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        textView.setText(str);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = this.f1127O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o00000OOoOOO00O00o0ooooooooO000ooooO0000 != null) {
            O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = (O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) o00000OOoOOO00O00o0ooooooooO000ooooO0000;
            boolean z = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo == 5;
            boolean z2 = layoutPosition == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
            com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = (com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            if (!z) {
                if (z2) {
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01, textView, LivePlayActivity.f2951O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo);
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01, textView);
                } else {
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01, textView, LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
                }
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.itemView, false);
                return;
            }
            textView.setTextColor(LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
            if (!z2) {
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.itemView, false);
            } else {
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01, textView);
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01, o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.itemView, true);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_live_channel_group, viewGroup, false));
        ViewGroup.LayoutParams layoutParams = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.itemView.getLayoutParams();
        layoutParams.height = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1432O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.itemView.setLayoutParams(layoutParams);
        return o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
    }

    public void setOnItemClickListener(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
        this.f1127O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o00000OOoOOO00O00o0ooooooooO000ooooO0000;
    }
}
