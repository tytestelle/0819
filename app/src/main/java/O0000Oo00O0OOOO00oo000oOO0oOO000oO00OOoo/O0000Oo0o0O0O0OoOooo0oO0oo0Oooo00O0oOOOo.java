package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.base.App;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.tv.CustomView.CustomRecyclerView;
import com.player.ku9py.R;

/* JADX INFO: loaded from: classes.dex */
public final class O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo extends RecyclerView.ViewHolder implements View.OnFocusChangeListener, View.OnClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final TextView f1261O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final TextView f1262O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final TextView f1263O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final ImageView f1264O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final LinearLayout f1265O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public final /* synthetic */ O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO f1266O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0000Oo0o0O0O0OoOooo0oO0oo0Oooo00O0oOOOo(O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO o0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO, View view) {
        super(view);
        this.f1266O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.LoadingViewGroup);
        this.f1265O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = linearLayout;
        this.f1261O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (TextView) view.findViewById(R.id.tvChannelNum);
        this.f1262O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (TextView) view.findViewById(R.id.tvChannelName);
        this.f1263O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (TextView) view.findViewById(R.id.tvChannelNowEpg);
        this.f1264O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (ImageView) view.findViewById(R.id.tv_channel_logo);
        if (o0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f1270O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
            o0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f1270O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new TextView(App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
        o0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f1270O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setTextSize(0, O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1430O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.width = (int) o0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f1270O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.getPaint().measureText("1234");
        linearLayout.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.height = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1432O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        view.setLayoutParams(layoutParams2);
        view.setOnFocusChangeListener(this);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int layoutPosition = getLayoutPosition();
        O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO o0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO = this.f1266O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo o0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo = o0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f1268O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo != null) {
            com.github.tvbox.osc.ui.dialog.O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 = (com.github.tvbox.osc.ui.dialog.O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00) ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) o0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo).f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.f3216O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.post(o0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.f3217O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
        }
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) o0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f1269O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.get(layoutPosition);
        int i = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f935O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int i2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f949O00000OOoOOO00O00o0ooooooooO000ooooO0000.f906O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int i3 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f934O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (!O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O()) {
            i3++;
        }
        int i4 = i3;
        LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.getClass();
        if (com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(i4, i2)) {
            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "频道组已加密，请解密后播放！");
            return;
        }
        com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = i4;
        com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = i2;
        com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 = i;
        o0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f1267O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(i4, i2, i, false, false);
        LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int layoutPosition = getLayoutPosition();
        CustomRecyclerView customRecyclerView = LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3278O00000OOoOOO00O00o0ooooooooO000ooooO0000.f3207O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        TextView textView = this.f1263O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        TextView textView2 = this.f1262O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (!z) {
            textView2.setTextColor(LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
            textView.setTextColor(LivePlayActivity.f2950O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO);
            this.itemView.setBackground(LivePlayActivity.f2949O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView2.setEllipsize(truncateAt);
            textView.setEllipsize(truncateAt);
            return;
        }
        textView2.setTextColor(LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
        textView.setTextColor(LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
        this.itemView.setBackground(LivePlayActivity.f2948O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt2);
        textView.setEllipsize(truncateAt2);
        if (customRecyclerView.getScrollState() == 0 && !customRecyclerView.isComputingLayout()) {
            customRecyclerView.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(layoutPosition);
        }
    }
}
