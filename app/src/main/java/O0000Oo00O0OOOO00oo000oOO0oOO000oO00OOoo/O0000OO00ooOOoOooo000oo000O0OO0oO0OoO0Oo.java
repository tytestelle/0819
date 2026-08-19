package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.player.ku9py.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final ArrayList f1205O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new ArrayList();

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public LivePlayActivity f1206O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 f1207O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i, boolean z, boolean z2) {
        int i2;
        ArrayList arrayList = f1205O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (z2) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) it.next();
                if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                    i2 = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f959O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    break;
                }
            }
            if (i2 != -1) {
                ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) arrayList.get(i2)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = false;
                notifyItemChanged(i2);
            }
        }
        if (i == -1 || getItemCount() <= i) {
            return;
        }
        ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) arrayList.get(i)).f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = z;
        notifyItemChanged(i);
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i) {
        int i2 = com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;
        com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o = i;
        if (i2 != -1) {
            notifyItemChanged(i2);
        }
        int i3 = com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o;
        if (i3 != -1) {
            notifyItemChanged(i3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = f1205O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0096  */
    /* JADX WARN: Code duplicated, block: B:18:0x009a  */
    /* JADX WARN: Code duplicated, block: B:19:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:20:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f4  */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x00c5, please report this as an issue */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo = (O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo) viewHolder;
        int layoutPosition = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.getLayoutPosition();
        ArrayList arrayList = f1205O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) arrayList.get(layoutPosition);
        boolean zIsEmpty = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) arrayList.get(layoutPosition)).f962O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.isEmpty();
        String str = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f960O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        TextView textView = o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.f1204O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        textView.setText(str);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        boolean z = o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        LivePlayActivity livePlayActivity = this.f1206O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (z) {
            if (com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO == 2) {
                textView.setTextColor(livePlayActivity.getResources().getColor(R.color.color_FFFFFF_50));
                i2 = 16;
            } else {
                textView.setTextColor(livePlayActivity.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
                textView.setText("› " + o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f960O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + " ‹");
            }
            textView.getPaint().setFlags(i2);
            textView.getPaint().setAntiAlias(true);
            if (com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f3262O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 == 0) {
                if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                    if (com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO == 2) {
                        textView.setTextColor(livePlayActivity.getResources().getColor(R.color.color_FFFFFF_50));
                    } else {
                        textView.setTextColor(livePlayActivity.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
                        textView.setText("› " + o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f960O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + " ‹");
                    }
                } else if (zIsEmpty && layoutPosition == com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o) {
                    textView.setTextColor(livePlayActivity.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
                    textView.setText(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f960O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                } else {
                    textView.setTextColor(-1);
                    textView.setText(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f960O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                }
                o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.itemView.setBackgroundResource(R.color.transparent);
            } else if (layoutPosition == com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o) {
                textView.setTextColor(-1);
                textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.itemView.setBackgroundResource(R.drawable.shape_channel_group_recycleview_item_selected);
            } else {
                o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.itemView.setBackgroundResource(R.color.transparent);
            }
            o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.itemView.setOnClickListener(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, layoutPosition, 1));
        }
        if (zIsEmpty || layoutPosition != com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o) {
            textView.setTextColor(-1);
            textView.setText(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f960O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        } else {
            textView.setTextColor(livePlayActivity.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
            textView.setText(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f960O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
        i2 = 0;
        textView.getPaint().setFlags(i2);
        textView.getPaint().setAntiAlias(true);
        if (com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f3262O0000O00o00ooooOOoOo0oOo00o0o0o00oO0o000 == 0) {
            if (o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f961O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
                if (com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO == 2) {
                    textView.setTextColor(livePlayActivity.getResources().getColor(R.color.color_FFFFFF_50));
                } else {
                    textView.setTextColor(livePlayActivity.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
                    textView.setText("› " + o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f960O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + " ‹");
                }
            } else if (zIsEmpty) {
                textView.setTextColor(-1);
                textView.setText(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f960O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            } else {
                textView.setTextColor(-1);
                textView.setText(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f960O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
            }
            o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.itemView.setBackgroundResource(R.color.transparent);
        } else if (layoutPosition == com.github.tvbox.osc.ui.dialog.O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f3260O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o) {
            textView.setTextColor(-1);
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.itemView.setBackgroundResource(R.drawable.shape_channel_group_recycleview_item_selected);
        } else {
            o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.itemView.setBackgroundResource(R.color.transparent);
        }
        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.itemView.setOnClickListener(new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(this, layoutPosition, 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_live_setting, viewGroup, false);
        O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo = new O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo(viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.f1204O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (TextView) viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.findViewById(R.id.tvSettingItemName);
        ViewGroup.LayoutParams layoutParams = viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getLayoutParams();
        layoutParams.height = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.f1432O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setLayoutParams(layoutParams);
        return o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo;
    }

    public void setOnItemClickListener(O0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00 o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00) {
        this.f1207O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000OO00o0o0O0oOo0ooo00oOo0oO00OO00Oo00;
    }
}
