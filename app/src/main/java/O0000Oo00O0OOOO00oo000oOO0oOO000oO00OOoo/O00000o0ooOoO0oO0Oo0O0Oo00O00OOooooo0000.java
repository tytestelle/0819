package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.base.App;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.tv.CustomView.MusicLoadingView;
import com.player.ku9py.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public ArrayList f1140O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O f1141O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public TextView f1142O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public int f1143O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f1140O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
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
    public final int getItemViewType(int i) {
        return O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000() ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        return new O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(this, i == 1 ? layoutInflaterFrom.inflate(R.layout.item_live_channel_hide_number, viewGroup, false) : layoutInflaterFrom.inflate(R.layout.item_live_channel, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = (O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) viewHolder;
        super.onViewRecycled(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0);
        ImageView imageView = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1135O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (imageView != null) {
            com.bumptech.glide.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = com.bumptech.glide.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
            o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getClass();
            o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0oO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(new com.bumptech.glide.O00000OOoOOO00O00o0ooooooooO000ooooO0000(imageView));
        }
    }

    public void setOnItemClickListener(O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O) {
        this.f1141O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        ExecutorService executorService;
        O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 = (O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) viewHolder;
        int layoutPosition = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.getLayoutPosition();
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) this.f1140O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(layoutPosition);
        TextView textView = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1133O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setEllipsize(truncateAt);
        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1133O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f937O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1132O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText(String.valueOf(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f936O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o));
        String str = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f944O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
        TextView textView2 = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (str == null || TextUtils.isEmpty(str)) {
            str = "精彩节目";
        }
        textView2.setText(str);
        int i2 = 0;
        o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1137O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.setVisibility(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f942O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 ? 0 : 8);
        O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = this.f1141O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O != null) {
            com.github.tvbox.osc.ui.dialog.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (com.github.tvbox.osc.ui.dialog.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O;
            boolean z = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3036O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo && com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo && layoutPosition == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00;
            boolean zO00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O();
            boolean zO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o();
            boolean z2 = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3035O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo == 1;
            boolean z3 = layoutPosition == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
            if (z) {
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1136O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, 0);
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1132O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 8);
                if (!o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1138O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                    o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1138O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = true;
                    MusicLoadingView musicLoadingView = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1136O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    if (!musicLoadingView.f3325O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                        musicLoadingView.f3325O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = true;
                        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(musicLoadingView, 4);
                        synchronized (O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.class) {
                            try {
                                ExecutorService executorService2 = O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1066O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                                if (executorService2 == null || executorService2.isShutdown()) {
                                    O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1066O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = Executors.newCachedThreadPool();
                                }
                                executorService = O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1066O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        executorService.execute(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                    }
                }
            } else {
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1136O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, 8);
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1132O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, 0);
                if (o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1138O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
                    o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1138O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = false;
                    MusicLoadingView musicLoadingView2 = o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1136O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    int i3 = musicLoadingView2.f3334O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;
                    musicLoadingView2.f3337O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = i3;
                    musicLoadingView2.f3338O00000OOoOOO00O00o0ooooooooO000ooooO0000 = false;
                    int i4 = musicLoadingView2.f3333O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
                    musicLoadingView2.f3339O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = (i3 + i4) / 2;
                    musicLoadingView2.f3340O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o = true;
                    musicLoadingView2.f3341O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = i4;
                    musicLoadingView2.f3342O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = true;
                    musicLoadingView2.f3325O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
                    musicLoadingView2.postInvalidate();
                }
            }
            if (z) {
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1133O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, LivePlayActivity.f2951O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo);
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, LivePlayActivity.f2951O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo);
            } else {
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1133O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, LivePlayActivity.f2950O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO);
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1132O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
            }
            if (z2) {
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1133O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
                if (z3) {
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1133O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.itemView, true);
                } else {
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, LivePlayActivity.f2950O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO);
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.itemView, false);
                }
            } else {
                if (z3) {
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1133O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, LivePlayActivity.f2951O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo);
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, LivePlayActivity.f2951O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo);
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1133O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                } else {
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1133O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
                    com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, LivePlayActivity.f2950O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO);
                }
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.itemView, false);
            }
            com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.getClass();
            if (zO00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) {
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, 8);
            } else {
                com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, 0);
                LivePlayActivity livePlayActivity = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                livePlayActivity.getClass();
                O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(new O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(livePlayActivity, o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, i2, 0));
            }
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
            com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1135O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, zO00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O ? 0 : 8);
            if (zO00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O) {
                O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, o00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0.f1135O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, false);
            }
        }
    }
}
