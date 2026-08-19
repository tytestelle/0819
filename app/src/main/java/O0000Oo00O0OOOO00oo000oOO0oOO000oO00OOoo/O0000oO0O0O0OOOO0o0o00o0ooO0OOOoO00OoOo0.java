package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.player.ku9py.R;
import is.xyz.mpv.MPVLib;
import java.util.ArrayList;
import java.util.HashMap;
import xyz.doikki.videoplayer.player.AbstractPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static final HashMap f1301O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new HashMap();

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public LivePlayActivity f1302O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo f1303O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public int f1304O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public ArrayList f1305O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i, AbstractPlayer abstractPlayer) {
        boolean z = abstractPlayer instanceof O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        ArrayList arrayList = this.f1305O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (z) {
            abstractPlayer.pause();
            long currentPosition = abstractPlayer.getCurrentPosition();
            ((O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) abstractPlayer).setTrack(((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) arrayList.get(i)).f969O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
            new Handler().postDelayed(new O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(abstractPlayer, currentPosition, 1), 800L);
            return;
        }
        if (abstractPlayer instanceof O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            ((O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) abstractPlayer).O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) arrayList.get(i), true, false);
            return;
        }
        if (abstractPlayer instanceof O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) arrayList.get(i);
            O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = (O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) abstractPlayer;
            int i2 = o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f969O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            String str = o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f970O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.VIDEO ? "video" : "audio";
            o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.getClass();
            if (str.equals("audio")) {
                MPVLib.setPropertyInt("aid", i2);
            } else if (str.equals("video")) {
                MPVLib.setPropertyInt("vid", i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f1305O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO o0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO = (O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO) viewHolder;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0) this.f1305O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(i);
        String str = o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f971O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        String strO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO("√ ", str);
        if (o00000O00oOOo000000OOOo00OOOo0OooOO00OO0.f972O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
            o0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.f1300O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText(strO00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO);
            o0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.f1300O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setTextColor(this.f1302O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
        } else {
            o0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.f1300O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText(str);
            o0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.f1300O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setTextColor(-1);
        }
        if (this.f1304O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == i) {
            o0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.f1300O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setTextColor(-1);
            o0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.itemView.setBackgroundResource(R.drawable.shape_recycleview_item_selected);
        } else {
            o0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.itemView.setBackgroundResource(R.drawable.shape_recycleview_item_no_selected);
        }
        o0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.itemView.setOnClickListener(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, i, 4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(this.f1302O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO).inflate(R.layout.item_track, viewGroup, false);
        O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO o0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO = new O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO(viewInflate);
        o0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.f1300O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (TextView) viewInflate.findViewById(R.id.tvTrack);
        return o0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO;
    }

    public void setOnTrackItemClickListener(O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo o0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo) {
        this.f1303O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo;
    }
}
