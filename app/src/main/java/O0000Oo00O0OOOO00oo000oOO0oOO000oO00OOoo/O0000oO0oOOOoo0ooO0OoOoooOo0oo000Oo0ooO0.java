package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.bean.AddressItem;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.player.ku9py.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O0000oO0oOOOoo0ooO0OoOoooOo0oo000Oo0ooO0 extends RecyclerView.Adapter implements View.OnClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public LivePlayActivity f1310O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public ArrayList f1311O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public com.github.tvbox.osc.ui.dialog.O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo f1312O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f1311O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
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
        O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O o0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O = (O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O) viewHolder;
        int layoutPosition = o0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.getLayoutPosition();
        Integer numValueOf = Integer.valueOf(layoutPosition);
        TextView textView = o0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.f1306O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        textView.setTag(numValueOf);
        Integer numValueOf2 = Integer.valueOf(layoutPosition);
        ImageView imageView = o0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.f1307O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        imageView.setTag(numValueOf2);
        Integer numValueOf3 = Integer.valueOf(layoutPosition);
        ImageView imageView2 = o0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O.f1308O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        imageView2.setTag(numValueOf3);
        textView.setText(((AddressItem) this.f1311O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(layoutPosition)).getLiveUrlName());
        textView.setTextColor(-1);
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setOnClickListener(this);
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        AddressItem addressItem = (AddressItem) this.f1311O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.get(((Integer) view.getTag()).intValue());
        addressItem.setSelected(false);
        ArrayList arrayList = LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3279O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3195O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1249O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        switch (id) {
            case R.id.urlCopyButton /* 2131428154 */:
                try {
                    ((ClipboardManager) view.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", addressItem.getLiveUrl()));
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已复制");
                } catch (Exception e) {
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(e, new StringBuilder("复制失败，请重新复制或重新打开界面再复制，错误信息："), 1);
                }
                break;
            case R.id.urlDeButton /* 2131428155 */:
                if (!arrayList.contains(addressItem)) {
                    addressItem.setSelected(true);
                    LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3279O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                    O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3279O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3195O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    int iIndexOf = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.f1249O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.indexOf(addressItem);
                    if (iIndexOf != -1) {
                        o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.notifyItemChanged(iIndexOf);
                    }
                    LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3279O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3195O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(addressItem);
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已选中线路");
                } else {
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同项，请勿重复添加");
                }
                break;
            case R.id.urlName /* 2131428157 */:
                if (!arrayList.contains(addressItem)) {
                    LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3279O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已添加至订阅列表");
                } else {
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "列表已存在相同项，请勿重复添加");
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new O0000oO0O0oOoo0o0o000ooO0o0O0OooOOO0oO0O(this, O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_url_edit, viewGroup, false));
    }
}
