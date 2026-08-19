package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.ui.tv.CustomView.CustomRecyclerView;
import com.player.ku9py.R;

/* JADX INFO: loaded from: classes.dex */
public final class O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O extends RecyclerView.ViewHolder implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final TextView f1306O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final ImageView f1307O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final ImageView f1308O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ O0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0 f1309O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O(O0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0 o0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0, View view) {
        super(view);
        this.f1309O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = o0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0;
        this.f1306O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (TextView) view.findViewById(R.id.urlName);
        ImageView imageView = (ImageView) view.findViewById(R.id.urlDeButton);
        this.f1308O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = imageView;
        this.f1307O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (ImageView) view.findViewById(R.id.urlCopyButton);
        imageView.setImageResource(R.drawable.icon_subscribe);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i = (int) (o0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0.f1310O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2986O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.density * 6.0f);
        imageView.setPadding(i, i, i, i);
        ((ImageView) view.findViewById(R.id.toTop)).setVisibility(8);
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            CustomRecyclerView customRecyclerView = this.f1309O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1312O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f3297O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            if (customRecyclerView.getScrollState() == 0 && !customRecyclerView.isComputingLayout()) {
                customRecyclerView.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(getLayoutPosition());
            }
            TextView textView = this.f1306O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            if (view == textView) {
                textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            }
        }
    }
}
