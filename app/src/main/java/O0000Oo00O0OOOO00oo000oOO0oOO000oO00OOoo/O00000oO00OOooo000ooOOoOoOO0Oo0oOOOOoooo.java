package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.player.ku9py.R;

/* JADX INFO: loaded from: classes.dex */
public final class O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final TextView f1144O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final TextView f1145O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final TextView f1146O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O f1147O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O, View view) {
        super(view);
        this.f1147O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
        this.f1144O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (TextView) view.findViewById(R.id.tv_epg_name);
        this.f1145O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (TextView) view.findViewById(R.id.tv_epg_time);
        this.f1146O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (TextView) view.findViewById(R.id.shiyi);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1432O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        view.setLayoutParams(layoutParams);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((com.github.tvbox.osc.ui.dialog.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) this.f1147O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1149O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3043O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0, getLayoutPosition(), com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo, com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int layoutPosition = getLayoutPosition();
        O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O o00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O = this.f1147O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1149O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O == null) {
            return true;
        }
        com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = ((com.github.tvbox.osc.ui.dialog.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) o00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O).f3023O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(layoutPosition);
        o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000();
        return true;
    }
}
