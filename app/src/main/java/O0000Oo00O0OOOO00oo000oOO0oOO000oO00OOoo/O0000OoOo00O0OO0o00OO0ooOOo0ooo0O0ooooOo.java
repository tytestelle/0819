package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.player.ku9py.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo extends RecyclerView.Adapter implements View.OnClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final LivePlayActivity f1272O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final ArrayList f1273O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO f1274O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public int f1275O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo(LivePlayActivity livePlayActivity, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.f1273O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = arrayList2;
        this.f1275O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = -1;
        this.f1272O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = livePlayActivity;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f1273O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
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
        O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo o0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo = (O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo) viewHolder;
        o0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.itemView.setTag(Integer.valueOf(i));
        o0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f1271O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText((String) this.f1273O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(i));
        o0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iIntValue = ((Integer) view.getTag()).intValue();
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 = (O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000) this.f1274O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        com.github.tvbox.osc.ui.dialog.O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = (com.github.tvbox.osc.ui.dialog.O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00) o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1517O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.getClass();
        O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo o0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo = (O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo) o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1518O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        int i = o0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.f1275O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        o0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.f1275O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = iIntValue;
        if (i != -1) {
            o0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.notifyItemChanged(i);
        }
        int i2 = o0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.f1275O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (i2 != -1) {
            o0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.notifyItemChanged(i2);
        }
        o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.f3208O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.append((CharSequence) ((ArrayList) o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1519O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).get(iIntValue));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(this.f1272O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).inflate(R.layout.item_search_keyboard, viewGroup, false);
        O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo o0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo = new O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo(viewInflate);
        o0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f1271O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (TextView) viewInflate.findViewById(R.id.keyName);
        return o0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo;
    }

    public void setOnSelectListener(O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO o0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO) {
        this.f1274O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO;
    }
}
