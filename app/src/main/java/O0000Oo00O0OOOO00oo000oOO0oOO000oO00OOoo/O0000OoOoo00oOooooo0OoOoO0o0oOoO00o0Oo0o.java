package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.base.App;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.tv.CustomView.CustomRecyclerView;
import com.player.ku9py.R;

/* JADX INFO: loaded from: classes.dex */
public final class O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o extends RecyclerView.ViewHolder implements View.OnFocusChangeListener, View.OnClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final TextView f1276O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final ImageView f1277O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO f1278O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o(O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO o0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO, View view) {
        super(view);
        this.f1278O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO;
        this.f1276O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (TextView) view.findViewById(R.id.tvChannelName);
        this.f1277O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (ImageView) view.findViewById(R.id.tv_channel_logo);
        if (o0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO.f1282O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
            o0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO.f1282O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new TextView(App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
        o0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO.f1282O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.setTextSize(0, O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1430O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1432O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        view.setLayoutParams(layoutParams);
        view.setOnFocusChangeListener(this);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int layoutPosition = getLayoutPosition();
        O0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO o0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO = this.f1278O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        O0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO o0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO = o0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO.f1280O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO != null) {
            ((com.github.tvbox.osc.ui.dialog.O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000) ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) o0000Ooo0Oo0ooOOOO0OoooOO000OoOOO0oOO0oO).f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f3223O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.dismiss();
        }
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) o0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO.f1281O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.get(layoutPosition);
        int i = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f935O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int i2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f949O00000OOoOOO00O00o0ooooooooO000ooooO0000.f906O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int i3 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f934O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (!O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O()) {
            i3++;
        }
        int i4 = i3;
        com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = i4;
        com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = i2;
        com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 = i;
        o0000Ooo0o00000O000OOoO00Oo0o0o0OooO0oOO.f1279O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(i4, i2, i, false, false);
        LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int layoutPosition = getLayoutPosition();
        CustomRecyclerView customRecyclerView = LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3253O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f3221O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        TextView textView = this.f1276O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (!z) {
            textView.setTextColor(layoutPosition == com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00 ? this.f1278O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1279O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0() : LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
            this.itemView.setBackground(LivePlayActivity.f2949O0000OooO00Ooo00ooOoOO0O000o0oOo0o0o0OoO);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            return;
        }
        textView.setTextColor(LivePlayActivity.f2952O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo);
        this.itemView.setBackground(LivePlayActivity.f2948O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O);
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        if (customRecyclerView.getScrollState() == 0 && !customRecyclerView.isComputingLayout()) {
            customRecyclerView.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(layoutPosition);
        }
    }
}
