package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.player.ku9py.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final ArrayList f1201O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new ArrayList();

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public LivePlayActivity f1202O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 f1203O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = f1201O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
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
        O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = (O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0) viewHolder;
        int layoutPosition = o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.getLayoutPosition();
        String str = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0) f1201O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.get(layoutPosition)).f957O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        TextView textView = o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.f1200O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        textView.setText(str);
        if (com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f3262O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 != 1) {
            if (layoutPosition == com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO) {
                textView.setTextColor(this.f1202O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
                textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            } else {
                textView.setTextColor(-1);
            }
            o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.itemView.setBackgroundResource(R.color.transparent);
        } else if (layoutPosition == com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO) {
            textView.setTextColor(-1);
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.itemView.setBackgroundResource(R.drawable.shape_channel_group_recycleview_item_selected);
        } else {
            textView.setTextColor(-1);
            o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.itemView.setBackgroundResource(R.color.transparent);
        }
        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.itemView.setOnClickListener(new O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o(this, layoutPosition));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_live_setting_group, viewGroup, false);
        O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = new O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0(viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.f1200O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (TextView) viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.findViewById(R.id.tvSettingGroupName);
        ViewGroup.LayoutParams layoutParams = viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getLayoutParams();
        layoutParams.height = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1432O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setLayoutParams(layoutParams);
        return o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0;
    }

    public void setOnItemClickListener(O0000O0oOoo000OooOOOO00oOoooOO00oOooooo0 o0000O0oOoo000OooOOOO00oOoooOO00oOooooo0) {
        this.f1203O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000O0oOoo000OooOOOO00oOoooOO00oOooooo0;
    }
}
