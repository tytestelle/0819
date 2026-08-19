package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.bean.AddressItem;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 extends RecyclerView.Adapter implements View.OnClickListener, View.OnLongClickListener, View.OnFocusChangeListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public int f1178O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public LivePlayActivity f1179O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public com.github.tvbox.osc.ui.dialog.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o f1180O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public boolean f1181O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public ArrayList f1182O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o f1183O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public AddressItem f1184O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public boolean f1185O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public com.github.tvbox.osc.ui.dialog.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f1186O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f1182O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
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
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = (O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000) viewHolder;
        int layoutPosition = o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.getLayoutPosition();
        Integer numValueOf = Integer.valueOf(layoutPosition);
        TextView textView = o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f1174O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        textView.setTag(numValueOf);
        Integer numValueOf2 = Integer.valueOf(layoutPosition);
        ImageView imageView = o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f1176O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        imageView.setTag(numValueOf2);
        Integer numValueOf3 = Integer.valueOf(layoutPosition);
        ImageView imageView2 = o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f1175O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        imageView2.setTag(numValueOf3);
        Integer numValueOf4 = Integer.valueOf(layoutPosition);
        ImageView imageView3 = o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f1177O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        imageView3.setTag(numValueOf4);
        ArrayList arrayList = this.f1182O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        String liveUrlName = ((AddressItem) arrayList.get(layoutPosition)).getLiveUrlName();
        textView.setText(liveUrlName);
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
        if (arrayList.indexOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()) == layoutPosition) {
            textView.setText("√ " + liveUrlName);
            textView.setTextColor(this.f1179O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
        } else {
            textView.setText(liveUrlName);
            textView.setTextColor(-1);
        }
        if (this.f1178O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == layoutPosition) {
            textView.setTextColor(-1);
            textView.setBackgroundResource(R.drawable.shape_recycleview_item_selected);
        } else {
            textView.setBackgroundResource(R.drawable.shape_recycleview_item_no_selected);
        }
        textView.setOnLongClickListener(this);
        textView.setOnClickListener(this);
        textView.setOnFocusChangeListener(this);
        imageView2.setOnClickListener(this);
        imageView.setOnClickListener(this);
        imageView3.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        Integer num = (Integer) view.getTag();
        int iIntValue = num.intValue();
        LivePlayActivity livePlayActivity = this.f1179O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        ArrayList arrayList = this.f1182O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        switch (id) {
            case R.id.cancel /* 2131427492 */:
                com.github.tvbox.osc.ui.dialog.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f1186O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) {
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.dismiss();
                }
                break;
            case R.id.ok /* 2131427906 */:
                if (iIntValue != arrayList.size()) {
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    if (arrayList.indexOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO()) == iIntValue) {
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                        Hawk.delete("HEADERS地址");
                        com.github.tvbox.osc.ui.dialog.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(null, livePlayActivity);
                    }
                    arrayList.remove(iIntValue);
                    notifyItemRemoved(iIntValue);
                    notifyItemRangeChanged(iIntValue, arrayList.size());
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    Hawk.put("live_headers_list", arrayList);
                    com.github.tvbox.osc.ui.dialog.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = this.f1186O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;
                    if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 != null) {
                        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.dismiss();
                    }
                    break;
                }
                break;
            case R.id.toTop /* 2131428083 */:
                if (iIntValue < arrayList.size() && iIntValue > 0) {
                    arrayList.add(0, (AddressItem) arrayList.remove(iIntValue));
                    notifyItemRangeChanged(0, iIntValue + 1);
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    Hawk.put("live_headers_list", arrayList);
                    this.f1181O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                }
                break;
            case R.id.urlCopyButton /* 2131428154 */:
                try {
                    ((ClipboardManager) view.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", ((AddressItem) arrayList.get(iIntValue)).getLiveUrl()));
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已复制");
                } catch (Exception e) {
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(e, new StringBuilder("复制失败，请重新复制或重新打开界面再复制，错误信息："), 1);
                    return;
                }
                break;
            case R.id.urlDeButton /* 2131428155 */:
                String liveUrl = ((AddressItem) arrayList.get(iIntValue)).getLiveUrl();
                if (this.f1186O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null) {
                    this.f1186O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = new com.github.tvbox.osc.ui.dialog.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(livePlayActivity, R.style.CustomDialogStyleDim);
                }
                this.f1186O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setContentView(R.layout.dialog_delete);
                this.f1186O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setCanceledOnTouchOutside(true);
                TextView textView = (TextView) this.f1186O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.findViewById(R.id.title);
                ((TextView) this.f1186O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.findViewById(R.id.mes)).setText("是否删除 " + liveUrl + " ?");
                TextView textView2 = (TextView) this.f1186O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.findViewById(R.id.ok);
                TextView textView3 = (TextView) this.f1186O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.findViewById(R.id.cancel);
                textView3.requestFocus();
                textView.setText("删除提示 !");
                textView2.setText("确定");
                textView3.setText("取消");
                this.f1186O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.show();
                textView2.setTag(num);
                textView3.setTag(num);
                textView2.setOnClickListener(this);
                textView3.setOnClickListener(this);
                break;
            case R.id.urlName /* 2131428157 */:
                O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 = ((com.github.tvbox.osc.ui.dialog.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o) ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) this.f1183O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO).f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f3155O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.getClass();
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                int iIndexOf = o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.f1182O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.indexOf(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO());
                if (iIndexOf != -1) {
                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.notifyItemChanged(iIndexOf);
                }
                if (iIntValue != -1) {
                    o0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0.notifyItemChanged(iIntValue);
                }
                AddressItem addressItem = (AddressItem) arrayList.get(iIntValue);
                String liveUrl2 = addressItem.getLiveUrl();
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                Hawk.put("HEADERS地址", addressItem);
                com.github.tvbox.osc.ui.dialog.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(liveUrl2, livePlayActivity);
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "Headers配置已切换");
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_url_edit, viewGroup, false);
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000 = new O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f1174O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (TextView) viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.findViewById(R.id.urlName);
        o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f1175O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (ImageView) viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.findViewById(R.id.urlDeButton);
        o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f1176O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (ImageView) viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.findViewById(R.id.urlCopyButton);
        o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f1177O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (ImageView) viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.findViewById(R.id.toTop);
        return o0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int iIntValue = ((Integer) view.getTag()).intValue();
        if (!z) {
            iIntValue = -1;
        }
        LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3284O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.f3157O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.post(new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this, iIntValue, 2));
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int id = view.getId();
        AddressItem addressItem = (AddressItem) this.f1182O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.get(((Integer) view.getTag()).intValue());
        this.f1184O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = addressItem;
        String liveUrlName = addressItem.getLiveUrlName();
        String liveUrl = this.f1184O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.getLiveUrl();
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
        String liveUrl2 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO().getLiveUrl();
        this.f1185O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = liveUrl2 != null && liveUrl2.equals(liveUrl);
        if (id == R.id.urlName) {
            com.github.tvbox.osc.ui.dialog.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o = this.f1180O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f3153O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText(liveUrlName);
            o0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.f3154O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText(liveUrl);
            this.f1181O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = true;
        }
        return true;
    }

    public void setOnSelectListener(O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o) {
        this.f1183O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o;
    }
}
