package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.player.ku9py.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final TextView f1155O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final TextView f1156O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o f1157O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o, View view) {
        super(view);
        this.f1157O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;
        this.f1155O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (TextView) view.findViewById(R.id.tvEpgWeek);
        this.f1156O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (TextView) view.findViewById(R.id.tvEpgMonthDay);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1432O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        view.setLayoutParams(layoutParams);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int layoutPosition = getLayoutPosition();
        com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = ((com.github.tvbox.osc.ui.dialog.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1157O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1159O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f3021O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3079O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000;
        o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.getClass();
        int i = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;
        com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0 = layoutPosition;
        if (i != -1) {
            o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.notifyItemChanged(i, 0);
        }
        int i2 = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0;
        if (i2 != -1) {
            o0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.notifyItemChanged(i2, 0);
        }
        ArrayList arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo, com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo);
        if (!arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO.isEmpty() && com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 != -1) {
            int size = arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO.size();
            int i3 = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000;
            if (size > i3) {
                O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) arrayListO000000oooOoo00ooo0O0000000o00O0Oooo0OOO.get(i3);
                LivePlayActivity livePlayActivity = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                livePlayActivity.getClass();
                if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != null) {
                    O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(new O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(livePlayActivity, o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, 1, 0));
                }
            }
        }
        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
    }
}
