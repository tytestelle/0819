package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.bean.AddressItem;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.player.ku9py.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O0000o00oO0oOo0OoOo0O0OO00Ooo00Oo0O0oO0O extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public ArrayList f1295O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f1296O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public LivePlayActivity f1297O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo f1298O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f1295O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
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
        O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO o0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO = (O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO) viewHolder;
        AddressItem addressItem = (AddressItem) this.f1295O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(i);
        o0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO.f1294O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText(addressItem.getLiveUrlName());
        int iO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00();
        TextView textView = o0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO.f1294O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (iO00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 == i) {
            textView.setText("√ " + addressItem.getLiveUrlName());
            textView.setTextColor(this.f1297O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
        } else {
            textView.setText(addressItem.getLiveUrlName());
            textView.setTextColor(-1);
        }
        if (this.f1296O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == i) {
            textView.setTextColor(-1);
            o0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO.itemView.setBackgroundResource(R.drawable.shape_recycleview_item_selected);
        } else {
            o0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO.itemView.setBackgroundResource(R.drawable.shape_recycleview_item_no_selected);
        }
        o0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO.itemView.setOnClickListener(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, i, 3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new O0000o00O0oO0OooOo0ooo00o0O00o0oo0oOoOOO(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_track, viewGroup, false));
    }

    public void setOnSelectListener(O0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo o0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo) {
        this.f1298O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o0000o00o000O0ooo0oOooO00o0ooO000Oo0ooOo;
    }
}
