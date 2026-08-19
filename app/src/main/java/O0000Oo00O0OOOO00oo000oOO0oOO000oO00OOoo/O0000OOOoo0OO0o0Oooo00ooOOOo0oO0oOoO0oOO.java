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
public final class O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO extends RecyclerView.Adapter implements View.OnClickListener, View.OnLongClickListener, View.OnFocusChangeListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public int f1215O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public LivePlayActivity f1216O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public com.github.tvbox.osc.ui.dialog.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo f1217O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public boolean f1218O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public ArrayList f1219O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public ArrayList f1220O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public AddressItem f1221O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public com.github.tvbox.osc.ui.dialog.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f1222O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) {
        ArrayList arrayList = this.f1220O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (i >= ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) arrayList.get(0)).f909O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.size()) {
            return;
        }
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) arrayList.get(0)).f909O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(i);
        int i2 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f935O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int i3 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f949O00000OOoOOO00O00o0ooooooooO000ooooO0000.f906O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        int i4 = o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f934O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (!O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O()) {
            i4++;
        }
        int i5 = i4;
        com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = i5;
        com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = i3;
        com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 = i2;
        this.f1216O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(i5, i3, i2, false, false);
        LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3080O0000O00oO00O00OoOoOOoOo000o0oOOOoooOO00.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
    }

    public final void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(ArrayList arrayList) {
        ArrayList arrayList2 = this.f1220O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f1220O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        if (arrayList == null || arrayList.isEmpty() || ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) arrayList.get(0)).f909O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo == null) {
            return 0;
        }
        return ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) arrayList.get(0)).f909O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 = (O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00) viewHolder;
        int layoutPosition = o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.getLayoutPosition();
        Integer numValueOf = Integer.valueOf(layoutPosition);
        TextView textView = o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.f1212O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        textView.setTag(numValueOf);
        Integer numValueOf2 = Integer.valueOf(layoutPosition);
        ImageView imageView = o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.f1214O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        imageView.setTag(numValueOf2);
        Integer numValueOf3 = Integer.valueOf(layoutPosition);
        ImageView imageView2 = o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.f1213O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        imageView2.setTag(numValueOf3);
        textView.setText(((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f1220O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.get(0)).f909O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(layoutPosition)).f937O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
        textView.setTextColor(-1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (this.f1215O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == layoutPosition) {
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            textView.setBackgroundResource(R.drawable.shape_recycleview_item_selected);
        } else {
            textView.setBackgroundResource(R.drawable.shape_recycleview_item_no_selected);
        }
        textView.setOnLongClickListener(this);
        textView.setOnClickListener(this);
        textView.setOnFocusChangeListener(this);
        imageView2.setOnClickListener(this);
        imageView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        Integer num = (Integer) view.getTag();
        int iIntValue = num.intValue();
        LivePlayActivity livePlayActivity = this.f1216O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        ArrayList arrayList = this.f1220O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        switch (id) {
            case R.id.cancel /* 2131427492 */:
                com.github.tvbox.osc.ui.dialog.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f1222O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) {
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.dismiss();
                }
                break;
            case R.id.ok /* 2131427906 */:
                this.f1219O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.remove(iIntValue);
                livePlayActivity.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(4);
                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f878O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                com.github.tvbox.osc.ui.dialog.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = this.f1222O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 != null) {
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.dismiss();
                }
                break;
            case R.id.urlCopyButton /* 2131428154 */:
                try {
                    ((ClipboardManager) view.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) arrayList.get(0)).f909O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(iIntValue)).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO()));
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已复制");
                } catch (Exception e) {
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(e, new StringBuilder("复制失败，请重新复制或重新打开界面再复制，错误信息："), 0);
                    return;
                }
                break;
            case R.id.urlDeButton /* 2131428155 */:
                String strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) ((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) arrayList.get(0)).f909O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.get(iIntValue)).O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO();
                if (this.f1222O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null) {
                    this.f1222O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new com.github.tvbox.osc.ui.dialog.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(livePlayActivity, R.style.CustomDialogStyleDim);
                }
                this.f1222O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setContentView(R.layout.dialog_delete);
                this.f1222O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setCanceledOnTouchOutside(true);
                TextView textView = (TextView) this.f1222O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.findViewById(R.id.title);
                ((TextView) this.f1222O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.findViewById(R.id.mes)).setText("是否删除 " + strO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + " ?");
                TextView textView2 = (TextView) this.f1222O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.findViewById(R.id.ok);
                TextView textView3 = (TextView) this.f1222O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.findViewById(R.id.cancel);
                textView3.requestFocus();
                textView.setText("删除提示 !");
                textView2.setText("确定");
                textView3.setText("取消");
                this.f1222O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.show();
                textView2.setTag(num);
                textView3.setTag(num);
                textView2.setOnClickListener(this);
                textView3.setOnClickListener(this);
                break;
            case R.id.urlName /* 2131428157 */:
                O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(iIntValue);
                com.github.tvbox.osc.ui.dialog.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = this.f1217O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo != null) {
                    o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.dismiss();
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_url_edit, viewGroup, false);
        O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00 = new O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00(viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.f1212O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (TextView) viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.findViewById(R.id.urlName);
        o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.f1213O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (ImageView) viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.findViewById(R.id.urlDeButton);
        o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.f1214O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (ImageView) viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.findViewById(R.id.urlCopyButton);
        ((ImageView) viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.findViewById(R.id.toTop)).setVisibility(8);
        return o0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int iIntValue = ((Integer) view.getTag()).intValue();
        if (!z) {
            iIntValue = -1;
        }
        LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3285O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f3115O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.post(new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this, iIntValue, 4));
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int id = view.getId();
        AddressItem addressItem = (AddressItem) this.f1219O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.get(((Integer) view.getTag()).intValue());
        this.f1221O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = addressItem;
        if (addressItem == null) {
            return true;
        }
        String liveUrlName = addressItem.getLiveUrlName();
        String liveUrl = this.f1221O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.getLiveUrl();
        if (id == R.id.urlName) {
            com.github.tvbox.osc.ui.dialog.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = this.f1217O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3173O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText(liveUrlName);
            o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f3174O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText(liveUrl);
            this.f1218O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = true;
        }
        return true;
    }
}
