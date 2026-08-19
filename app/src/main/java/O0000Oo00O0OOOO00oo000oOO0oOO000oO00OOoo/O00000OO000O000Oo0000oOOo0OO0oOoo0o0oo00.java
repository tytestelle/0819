package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.player.ku9py.R;

/* JADX INFO: loaded from: classes.dex */
public final class O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final TextView f1124O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO f1125O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO, View view) {
        super(view);
        this.f1125O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
        this.f1124O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (TextView) view.findViewById(R.id.tvChannelGroupName);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int layoutPosition = getLayoutPosition();
        O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = this.f1125O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1127O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o00000OOoOOO00O00o0ooooooooO000ooooO0000 != null) {
            com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = (com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00) ((O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) o00000OOoOOO00O00o0ooooooooO000ooooO0000).f2087O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
            com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00, layoutPosition);
            O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.getClass();
            int i = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
            com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = layoutPosition;
            if (i != -1) {
                o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.notifyItemChanged(i, 0);
            }
            int i2 = com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
            if (i2 != -1) {
                o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.notifyItemChanged(i2, 0);
            }
            o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        }
    }
}
