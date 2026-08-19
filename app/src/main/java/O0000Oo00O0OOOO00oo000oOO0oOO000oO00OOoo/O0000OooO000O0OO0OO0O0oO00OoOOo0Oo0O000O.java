package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.player.ku9py.R;

/* JADX INFO: loaded from: classes.dex */
public final class O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final ImageView f1283O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO f1284O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0000OooO000O0OO0OO0O0oO00OoOOo0Oo0O000O(O0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO, View view) {
        super(view);
        this.f1284O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000OooOO0O0ooo00Ooo0O00O0o0000o00O0oOO;
        this.f1283O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (ImageView) view.findViewById(R.id.menuIcon);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1432O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        view.setLayoutParams(layoutParams);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((com.github.tvbox.osc.ui.dialog.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1284O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f1286O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).f3021O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0(getLayoutPosition());
    }
}
