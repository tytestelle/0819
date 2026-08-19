package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.ui.tv.CustomView.MarqueeTextView;
import com.player.ku9py.R;

/* JADX INFO: loaded from: classes.dex */
public final class O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final MarqueeTextView f1287O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final MarqueeTextView f1288O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final ImageView f1289O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO f1290O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0000o000O000oo00Oo0O0OOooOoOOo0OoOoooOo(O0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO, View view) {
        super(view);
        this.f1290O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o0000o00O0o0O0o0o00o0ooOo0O0Oo0O0OOoO0OO;
        this.f1287O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (MarqueeTextView) view.findViewById(R.id.viewColor);
        this.f1288O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (MarqueeTextView) view.findViewById(R.id.backgroundLayer);
        ImageView imageView = (ImageView) view.findViewById(R.id.badgeContainer);
        this.f1289O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = imageView;
        imageView.setImageResource(R.drawable.shape_subscript_drawable);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((com.github.tvbox.osc.ui.dialog.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O) this.f1290O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1292O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f3117O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(getLayoutPosition(), true);
    }
}
