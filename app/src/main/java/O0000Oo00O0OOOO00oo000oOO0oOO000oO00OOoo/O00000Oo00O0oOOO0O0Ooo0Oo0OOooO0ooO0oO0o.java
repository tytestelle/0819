package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.player.ku9py.R;

/* JADX INFO: loaded from: classes.dex */
public final class O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final TextView f1128O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 f1129O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0, View view) {
        super(view);
        this.f1129O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
        this.f1128O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (TextView) view.findViewById(R.id.tvChannelGroupName);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int layoutPosition = getLayoutPosition();
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = this.f1129O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1131O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o != null) {
            int i = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
            com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = (com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) ((O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o).f836O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(i, layoutPosition);
            O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;
            o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.getClass();
            int i2 = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
            com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = layoutPosition;
            if (i2 != -1) {
                o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.notifyItemChanged(i2, 0);
            }
            int i3 = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
            if (i3 != -1) {
                o00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.notifyItemChanged(i3, 0);
            }
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        }
    }
}
