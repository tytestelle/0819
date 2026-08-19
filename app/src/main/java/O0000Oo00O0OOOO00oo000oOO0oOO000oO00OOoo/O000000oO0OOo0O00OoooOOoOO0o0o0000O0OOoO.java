package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.player.ku9py.R;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final TextView f1104O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final ImageView f1105O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final TextView f1106O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(View view) {
        super(view);
        this.f1104O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (TextView) view.findViewById(R.id.tvChannelName);
        this.f1105O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (ImageView) view.findViewById(R.id.tv_channel_logo);
        this.f1106O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (TextView) view.findViewById(R.id.tvChannelNowEpg);
    }
}
