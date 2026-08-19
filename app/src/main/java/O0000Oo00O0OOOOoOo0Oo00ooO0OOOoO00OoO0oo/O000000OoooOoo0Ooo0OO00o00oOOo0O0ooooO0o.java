package O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;

import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.player.ku9py.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final LivePlayActivity f1314O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final ArrayList f1315O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public int f1316O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = -1;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f1317O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(LivePlayActivity livePlayActivity, ArrayList arrayList) {
        this.f1315O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = arrayList;
        this.f1314O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = livePlayActivity;
        setHasStableIds(true);
    }

    public abstract int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, int i) {
        String str = (String) this.f1315O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(i);
        if (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() == i) {
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1313O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText("√ " + str);
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1313O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setTextColor(this.f1314O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
        } else {
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1313O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText(str);
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1313O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setTextColor(-1);
        }
        if (this.f1316O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == i) {
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1313O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setTextColor(-1);
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.itemView.setBackgroundResource(R.drawable.shape_recycleview_item_selected);
        } else {
            o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.itemView.setBackgroundResource(R.drawable.shape_recycleview_item_no_selected);
        }
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.itemView.setOnClickListener(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, i, 5));
    }

    public abstract void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f1315O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
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
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_track, viewGroup, false));
    }

    public void setOnSelectListener(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
        this.f1317O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }
}
