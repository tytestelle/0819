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
import com.orhanobut.hawk.Hawk;
import com.player.ku9py.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo extends RecyclerView.Adapter implements View.OnClickListener, View.OnLongClickListener, View.OnFocusChangeListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public int f1227O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public int f1228O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public LivePlayActivity f1229O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public com.github.tvbox.osc.ui.dialog.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 f1230O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public boolean f1231O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public ArrayList f1232O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo f1233O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public AddressItem f1234O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public boolean f1235O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public Map f1236O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public com.github.tvbox.osc.ui.dialog.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f1237O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f1232O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
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
        O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo = (O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo) viewHolder;
        int layoutPosition = o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.getLayoutPosition();
        Integer numValueOf = Integer.valueOf(layoutPosition);
        TextView textView = o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.f1223O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        textView.setTag(numValueOf);
        Integer numValueOf2 = Integer.valueOf(layoutPosition);
        ImageView imageView = o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.f1225O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        imageView.setTag(numValueOf2);
        Integer numValueOf3 = Integer.valueOf(layoutPosition);
        ImageView imageView2 = o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.f1224O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        imageView2.setTag(numValueOf3);
        Integer numValueOf4 = Integer.valueOf(layoutPosition);
        ImageView imageView3 = o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.f1226O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        imageView3.setTag(numValueOf4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        ArrayList arrayList = this.f1232O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        String liveUrlName = ((AddressItem) arrayList.get(layoutPosition)).getLiveUrlName();
        textView.setText(liveUrlName);
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
        HashMap map = new HashMap();
        o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
        String str = (String) ((Map) Hawk.get("all_headers_hashmap", map)).get("User-Agent");
        if (str == null || !str.equals(((AddressItem) arrayList.get(layoutPosition)).getLiveUrl())) {
            textView.setText(liveUrlName);
            textView.setTextColor(-1);
        } else {
            textView.setText("√ " + liveUrlName);
            textView.setTextColor(this.f1229O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0());
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
            Integer numValueOf5 = Integer.valueOf(layoutPosition);
            o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2.getClass();
            Hawk.put("UaSelected", numValueOf5);
        }
        if (this.f1228O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO == layoutPosition) {
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
        LivePlayActivity livePlayActivity = this.f1229O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        ArrayList arrayList = this.f1232O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        switch (id) {
            case R.id.cancel /* 2131427492 */:
                com.github.tvbox.osc.ui.dialog.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f1237O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
                if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o != null) {
                    o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.dismiss();
                }
                break;
            case R.id.ok /* 2131427906 */:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                HashMap map = new HashMap();
                o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
                Map map2 = (Map) Hawk.get("all_headers_hashmap", map);
                this.f1236O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = map2;
                String str = (String) map2.get("User-Agent");
                if (iIntValue != arrayList.size()) {
                    String liveUrl = ((AddressItem) arrayList.get(iIntValue)).getLiveUrl();
                    if (liveUrl != null && liveUrl.equals(str)) {
                        this.f1236O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.remove("User-Agent");
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                        Map map3 = this.f1236O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                        o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2.getClass();
                        Hawk.put("all_headers_hashmap", map3);
                        livePlayActivity.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O();
                    }
                    arrayList.remove(iIntValue);
                    notifyItemRemoved(iIntValue);
                    notifyItemRangeChanged(iIntValue, arrayList.size());
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    Hawk.put("live_ua_list", arrayList);
                    com.github.tvbox.osc.ui.dialog.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = this.f1237O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
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
                    Hawk.put("live_ua_list", arrayList);
                    this.f1231O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = false;
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
                String liveUrl2 = ((AddressItem) arrayList.get(iIntValue)).getLiveUrl();
                if (this.f1237O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O == null) {
                    this.f1237O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = new com.github.tvbox.osc.ui.dialog.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(livePlayActivity, R.style.CustomDialogStyleDim);
                }
                this.f1237O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.setContentView(R.layout.dialog_delete);
                this.f1237O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.setCanceledOnTouchOutside(true);
                TextView textView = (TextView) this.f1237O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.findViewById(R.id.title);
                ((TextView) this.f1237O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.findViewById(R.id.mes)).setText("是否删除 " + liveUrl2 + " ?");
                TextView textView2 = (TextView) this.f1237O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.findViewById(R.id.ok);
                TextView textView3 = (TextView) this.f1237O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.findViewById(R.id.cancel);
                textView3.requestFocus();
                textView.setText("删除提示 !");
                textView2.setText("确定");
                textView3.setText("取消");
                this.f1237O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.show();
                textView2.setTag(num);
                textView3.setTag(num);
                textView2.setOnClickListener(this);
                textView3.setOnClickListener(this);
                break;
            case R.id.urlName /* 2131428157 */:
                O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = ((com.github.tvbox.osc.ui.dialog.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0) ((O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0) this.f1233O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000).f1512O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f3183O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.getClass();
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                int iIntValue2 = ((Integer) Hawk.get("UaSelected", -1)).intValue();
                if (iIntValue2 != -1) {
                    o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.notifyItemChanged(iIntValue2);
                }
                int i = o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f1227O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f1227O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = iIntValue;
                if (i != -1) {
                    o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.notifyItemChanged(i);
                }
                int i2 = o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.f1227O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (i2 != -1) {
                    o0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.notifyItemChanged(i2);
                }
                String liveUrl3 = ((AddressItem) arrayList.get(iIntValue)).getLiveUrl();
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                Map map4 = (Map) Hawk.get("all_headers_hashmap", null);
                this.f1236O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = map4;
                if (map4 == null) {
                    this.f1236O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = new HashMap();
                }
                this.f1236O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.put("User-Agent", liveUrl3);
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo3 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                Map map5 = this.f1236O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
                o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo3.getClass();
                Hawk.put("all_headers_hashmap", map5);
                livePlayActivity.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O();
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "UA配置已切换");
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                Hawk.put("UaSelected", num);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_url_edit, viewGroup, false);
        O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo = new O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo(viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.f1223O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (TextView) viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.findViewById(R.id.urlName);
        o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.f1224O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (ImageView) viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.findViewById(R.id.urlDeButton);
        o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.f1225O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = (ImageView) viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.findViewById(R.id.urlCopyButton);
        o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.f1226O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (ImageView) viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.findViewById(R.id.toTop);
        return o0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int iIntValue = ((Integer) view.getTag()).intValue();
        if (!z) {
            iIntValue = -1;
        }
        LivePlayActivity.O0000OoOO0oO0o00OOOOoo0OooOo0ooOOoo0O0oo.f3282O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.f3185O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.post(new O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(this, iIntValue, 5));
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int id = view.getId();
        AddressItem addressItem = (AddressItem) this.f1232O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.get(((Integer) view.getTag()).intValue());
        this.f1234O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = addressItem;
        String liveUrlName = addressItem.getLiveUrlName();
        String liveUrl = this.f1234O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.getLiveUrl();
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
        HashMap map = new HashMap();
        o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
        this.f1235O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = liveUrl != null && liveUrl.equals((String) ((Map) Hawk.get("all_headers_hashmap", map)).get("User-Agent"));
        if (id == R.id.urlName) {
            com.github.tvbox.osc.ui.dialog.O0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0 = this.f1230O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
            o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.f3181O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText(liveUrlName);
            o0000O0oOoO0oOoO0oO0oOo0000OO00oO00Oo0O0.f3182O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText(liveUrl);
            this.f1231O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = true;
        }
        return true;
    }

    public void setOnSelectListener(O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo o0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo) {
        this.f1233O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
    }
}
