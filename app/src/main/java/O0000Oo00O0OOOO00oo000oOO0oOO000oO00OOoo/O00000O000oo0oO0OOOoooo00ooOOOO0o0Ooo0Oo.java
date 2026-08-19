package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.player.ku9py.R;

/* JADX INFO: loaded from: classes.dex */
public final class O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final TextView f1116O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final ImageView f1117O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final ImageView f1118O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(View view) {
        super(view);
        this.f1116O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (TextView) view.findViewById(R.id.urlName);
        this.f1117O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (ImageView) view.findViewById(R.id.urlDeButton);
        this.f1118O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (ImageView) view.findViewById(R.id.urlCopyButton);
        ((ImageView) view.findViewById(R.id.toTop)).setVisibility(8);
    }
}
