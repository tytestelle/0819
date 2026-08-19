package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 extends RecyclerView.Adapter implements View.OnClickListener, View.OnFocusChangeListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public int f1119O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public com.github.tvbox.osc.ui.dialog.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo f1120O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public boolean f1121O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public ArrayList f1122O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f1123O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f1122O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
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
        O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = (O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) viewHolder;
        int layoutPosition = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getLayoutPosition();
        Integer numValueOf = Integer.valueOf(layoutPosition);
        TextView textView = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f1116O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        textView.setTag(numValueOf);
        Integer numValueOf2 = Integer.valueOf(layoutPosition);
        ImageView imageView = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f1118O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        imageView.setTag(numValueOf2);
        Integer numValueOf3 = Integer.valueOf(layoutPosition);
        ImageView imageView2 = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.f1117O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        imageView2.setTag(numValueOf3);
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1122O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(layoutPosition);
        textView.setText(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f907O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + "（" + o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f928O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f904O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + "）");
        textView.setTextColor(-1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (this.f1119O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == layoutPosition) {
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            textView.setBackgroundResource(R.drawable.shape_recycleview_item_selected);
        } else {
            textView.setBackgroundResource(R.drawable.shape_recycleview_item_no_selected);
        }
        textView.setOnClickListener(this);
        textView.setOnFocusChangeListener(this);
        imageView2.setOnClickListener(this);
        imageView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1122O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(((Integer) view.getTag()).intValue());
        this.f1123O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 == null) {
        }
        switch (id) {
            case R.id.urlCopyButton /* 2131428154 */:
                try {
                    ((ClipboardManager) view.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO()));
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已复制");
                } catch (Exception e) {
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(e, new StringBuilder("复制失败，请重新复制或重新打开界面再复制，错误信息："), 1);
                    return;
                }
                break;
            case R.id.urlDeButton /* 2131428155 */:
                o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f911O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = null;
                String strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1 = this.f1123O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                String[] strArrSplit = strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.split("#");
                o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oOO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.getClass();
                O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo1, strArrSplit);
                String str = "GROUP_CONFIG/" + this.f1123O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f927O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O + "-" + this.f1123O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f928O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f904O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + "-" + this.f1123O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f907O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                Hawk.put(str, null);
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已清除分组 " + this.f1123O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f907O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + " 配置");
                break;
            case R.id.urlName /* 2131428157 */:
                String str2 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f907O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                String strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                com.github.tvbox.osc.ui.dialog.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = this.f1120O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.f3112O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText(str2);
                o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.f3113O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText(strO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2);
                this.f1121O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = true;
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_url_edit, viewGroup, false));
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int iIntValue = ((Integer) view.getTag()).intValue();
        if (!z) {
            iIntValue = -1;
        }
        LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3285O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f3115O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.post(new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this, iIntValue, 0));
    }
}
