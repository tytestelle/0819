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
public final class O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo extends RecyclerView.Adapter implements View.OnClickListener, View.OnLongClickListener, View.OnFocusChangeListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public int f1245O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public LivePlayActivity f1246O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public com.github.tvbox.osc.ui.dialog.O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo f1247O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public boolean f1248O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public ArrayList f1249O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo f1250O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public AddressItem f1251O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public com.github.tvbox.osc.ui.dialog.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f1252O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    public final synchronized void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(AddressItem addressItem) {
        O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().execute(new O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00(this, addressItem, 0));
    }

    public final synchronized void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(AddressItem addressItem) {
        O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(new O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00(this, addressItem, 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f1249O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
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
        O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 = (O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00) viewHolder;
        int layoutPosition = o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.getLayoutPosition();
        Integer numValueOf = Integer.valueOf(layoutPosition);
        TextView textView = o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.f1241O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        textView.setTag(numValueOf);
        Integer numValueOf2 = Integer.valueOf(layoutPosition);
        ImageView imageView = o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.f1243O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        imageView.setTag(numValueOf2);
        Integer numValueOf3 = Integer.valueOf(layoutPosition);
        ImageView imageView2 = o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.f1242O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        imageView2.setTag(numValueOf3);
        Integer numValueOf4 = Integer.valueOf(layoutPosition);
        ImageView imageView3 = o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.f1244O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        imageView3.setTag(numValueOf4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        ArrayList arrayList = this.f1249O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        String liveUrlName = ((AddressItem) arrayList.get(layoutPosition)).getLiveUrlName();
        textView.setText(liveUrlName);
        if (((AddressItem) arrayList.get(layoutPosition)).isSelected()) {
            textView.setText("√ " + liveUrlName);
            textView.setTextColor(this.f1246O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        } else {
            textView.setText(liveUrlName);
            textView.setTextColor(-1);
        }
        if (this.f1245O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == layoutPosition) {
            textView.setTextColor(-1);
            textView.setBackgroundResource(R.drawable.shape_recycleview_item_selected);
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
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
        switch (id) {
            case R.id.cancel /* 2131427492 */:
                com.github.tvbox.osc.ui.dialog.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f1252O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) {
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.dismiss();
                    return;
                }
                return;
            case R.id.ok /* 2131427906 */:
                if (iIntValue == this.f1249O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.size()) {
                    return;
                }
                AddressItem addressItem = (AddressItem) this.f1249O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.get(iIntValue);
                if (addressItem.isSelected()) {
                    O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(addressItem);
                }
                this.f1249O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.remove(iIntValue);
                notifyItemRemoved(iIntValue);
                notifyItemRangeChanged(iIntValue, this.f1249O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.size());
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                ArrayList arrayList = this.f1249O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o(arrayList);
                com.github.tvbox.osc.ui.dialog.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = this.f1252O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
                if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 != null) {
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.dismiss();
                    return;
                }
                return;
            case R.id.toTop /* 2131428083 */:
                if (iIntValue < this.f1249O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.size() && iIntValue > 0) {
                    ArrayList arrayList2 = this.f1249O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    arrayList2.add(0, (AddressItem) arrayList2.remove(iIntValue));
                    notifyItemRangeChanged(0, iIntValue + 1);
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                    ArrayList arrayList3 = this.f1249O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                    o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2.getClass();
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o(arrayList3);
                    this.f1248O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
                    synchronized (this) {
                        O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().execute(new O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this, 3));
                    }
                    return;
                }
                return;
            case R.id.urlCopyButton /* 2131428154 */:
                try {
                    ((ClipboardManager) view.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", ((AddressItem) this.f1249O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.get(iIntValue)).getLiveUrl()));
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已复制");
                    return;
                } catch (Exception e) {
                    O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(e, new StringBuilder("复制失败，请重新复制或重新打开界面再复制，错误信息："), 1);
                    return;
                }
            case R.id.urlDeButton /* 2131428155 */:
                String liveUrl = ((AddressItem) this.f1249O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.get(iIntValue)).getLiveUrl();
                if (this.f1252O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == null) {
                    this.f1252O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = new com.github.tvbox.osc.ui.dialog.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f1246O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, R.style.CustomDialogStyleDim);
                }
                this.f1252O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setContentView(R.layout.dialog_delete);
                this.f1252O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setCanceledOnTouchOutside(true);
                TextView textView = (TextView) this.f1252O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.findViewById(R.id.title);
                ((TextView) this.f1252O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.findViewById(R.id.mes)).setText("是否删除 " + liveUrl + " ?");
                TextView textView2 = (TextView) this.f1252O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.findViewById(R.id.ok);
                TextView textView3 = (TextView) this.f1252O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.findViewById(R.id.cancel);
                textView3.requestFocus();
                textView.setText("删除提示 !");
                textView2.setText("确定");
                textView3.setText("取消");
                this.f1252O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.show();
                textView2.setTag(num);
                textView3.setTag(num);
                textView2.setOnClickListener(this);
                textView3.setOnClickListener(this);
                return;
            case R.id.urlName /* 2131428157 */:
                O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = ((com.github.tvbox.osc.ui.dialog.O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo) ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) this.f1250O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO).f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f3195O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (iIntValue != -1) {
                    o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.notifyItemChanged(iIntValue);
                } else {
                    o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.getClass();
                }
                AddressItem addressItem2 = (AddressItem) this.f1249O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.get(iIntValue);
                boolean zIsSelected = addressItem2.isSelected();
                addressItem2.setSelected(!zIsSelected);
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo3 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                ArrayList arrayList4 = this.f1249O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
                o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo3.getClass();
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O0oOo0OOOoOoO0oOOOoO000OOOOOooo0O0o(arrayList4);
                if (zIsSelected) {
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "取消选中 " + addressItem2.getLiveUrlName());
                    O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(addressItem2);
                    return;
                }
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "已选中 " + addressItem2.getLiveUrlName());
                if (TextUtils.isEmpty(addressItem2.getRequestUrl())) {
                    return;
                }
                O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(addressItem2);
                return;
            default:
                return;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_url_edit, viewGroup, false);
        O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00 = new O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00(viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.f1241O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (TextView) viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.findViewById(R.id.urlName);
        o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.f1242O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (ImageView) viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.findViewById(R.id.urlDeButton);
        o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.f1243O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (ImageView) viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.findViewById(R.id.urlCopyButton);
        o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00.f1244O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (ImageView) viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.findViewById(R.id.toTop);
        return o0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int iIntValue = ((Integer) view.getTag()).intValue();
        if (!z) {
            iIntValue = -1;
        }
        LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3279O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3197O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.post(new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this, iIntValue, 6));
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int id = view.getId();
        AddressItem addressItem = (AddressItem) this.f1249O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.get(((Integer) view.getTag()).intValue());
        this.f1251O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = addressItem;
        String liveUrlName = addressItem.getLiveUrlName();
        String liveUrl = this.f1251O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.getLiveUrl();
        if (id == R.id.urlName) {
            com.github.tvbox.osc.ui.dialog.O0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo = this.f1247O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.f3193O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText(liveUrlName);
            o0000O0ooOo0oo0o0OO0ooO00O0OooOoo000ooOo.f3194O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText(liveUrl);
            this.f1248O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = true;
        }
        return true;
    }

    public void setOnSelectListener(O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo) {
        this.f1250O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = o0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;
    }
}
