package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.base.App;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.player.ku9py.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final LivePlayActivity f1267O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo f1268O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final ArrayList f1269O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new ArrayList();

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public TextView f1270O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO(LivePlayActivity livePlayActivity) {
        this.f1267O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = livePlayActivity;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f1269O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
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
        O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo o0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo = (O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo) viewHolder;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) this.f1269O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.get(i);
        if (O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000()) {
            o0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo.f1265O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.setVisibility(8);
        } else {
            o0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo.f1265O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.setVisibility(0);
        }
        TextView textView = o0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo.f1262O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        TextView textView2 = o0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo.f1263O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        textView2.setEllipsize(truncateAt);
        int i2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f936O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        o0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo.f1261O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText(sb.toString());
        o0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo.f1262O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f937O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f949O00000OOoOOO00O00o0ooooooooO000ooooO0000;
        textView2.setText(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f907O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + "（" + o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f928O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f904O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + "）");
        boolean zO00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O();
        ImageView imageView = o0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo.f1264O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (!zO00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O) {
            imageView.setVisibility(8);
        } else {
            O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, imageView, false);
            imageView.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo(this, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_search_channel, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo o0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo = (O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo) viewHolder;
        super.onViewRecycled(o0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo);
        ImageView imageView = o0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo.f1264O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (imageView != null) {
            com.bumptech.glide.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = com.bumptech.glide.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getClass();
            o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(new com.bumptech.glide.O00000OOoOOO00O00o0ooooooooO000ooooO0000(imageView));
        }
    }

    public void setOnItemClickListener(O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo o0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo) {
        this.f1268O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo;
    }
}
