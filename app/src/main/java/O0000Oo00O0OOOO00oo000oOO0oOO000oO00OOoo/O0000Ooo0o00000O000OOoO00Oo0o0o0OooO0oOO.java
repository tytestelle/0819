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
public final class O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final LivePlayActivity f1279O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO f1280O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final ArrayList f1281O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new ArrayList();

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public TextView f1282O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO(LivePlayActivity livePlayActivity) {
        this.f1279O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = livePlayActivity;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f1281O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
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
        O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o o0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o = (O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o) viewHolder;
        int layoutPosition = o0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.getLayoutPosition();
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) this.f1281O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.get(i);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextView textView = o0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.f1276O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        textView.setEllipsize(truncateAt);
        textView.setText(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f937O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        textView.setTextColor(layoutPosition == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00 ? this.f1279O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0() : LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
        boolean zO00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O();
        ImageView imageView = o0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.f1277O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (!zO00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O) {
            imageView.setVisibility(8);
        } else {
            O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, imageView, false);
            imageView.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o(this, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_seekbar_channel, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o o0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o = (O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o) viewHolder;
        super.onViewRecycled(o0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o);
        ImageView imageView = o0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.f1277O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (imageView != null) {
            com.bumptech.glide.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = com.bumptech.glide.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getClass();
            o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(new com.bumptech.glide.O00000OOoOOO00O00o0ooooooooO000ooooO0000(imageView));
        }
    }

    public void setOnItemClickListener(O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO o0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO) {
        this.f1280O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO;
    }
}
