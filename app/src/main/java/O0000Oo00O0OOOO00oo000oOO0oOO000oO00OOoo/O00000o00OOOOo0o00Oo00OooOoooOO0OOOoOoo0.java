package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.ui.tv.CustomView.MusicLoadingView;
import com.player.ku9py.R;

/* JADX INFO: loaded from: classes.dex */
public final class O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0 extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final TextView f1132O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final TextView f1133O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final TextView f1134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final ImageView f1135O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final MusicLoadingView f1136O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final ImageView f1137O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public boolean f1138O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public final /* synthetic */ O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 f1139O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000, View view) {
        super(view);
        this.f1139O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.LoadingViewGroup);
        this.f1132O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (TextView) view.findViewById(R.id.tvChannelNum);
        this.f1133O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (TextView) view.findViewById(R.id.tvChannelName);
        this.f1134O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (TextView) view.findViewById(R.id.tvChannelNowEpg);
        this.f1135O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (ImageView) view.findViewById(R.id.tv_channel_logo);
        this.f1136O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (MusicLoadingView) view.findViewById(R.id.music_LoadingView);
        this.f1137O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (ImageView) view.findViewById(R.id.favor_logo);
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.width = (int) o00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f1142O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getPaint().measureText("1234");
        linearLayout.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.height = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1432O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        view.setLayoutParams(layoutParams2);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int layoutPosition = getLayoutPosition();
        O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = this.f1139O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1141O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O != null) {
            com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(((com.github.tvbox.osc.ui.dialog.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, layoutPosition);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int layoutPosition = getLayoutPosition();
        O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O = this.f1139O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1141O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O == null) {
            return true;
        }
        ((com.github.tvbox.osc.ui.dialog.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) o00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O).f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(layoutPosition);
        return true;
    }
}
