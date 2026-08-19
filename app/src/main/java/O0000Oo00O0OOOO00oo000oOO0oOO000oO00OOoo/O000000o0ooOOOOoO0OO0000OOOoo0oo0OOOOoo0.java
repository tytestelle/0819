package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.tvbox.osc.base.App;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.player.ku9py.R;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.fourthline.cling.model.ServiceReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 extends RecyclerView.Adapter implements View.OnClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public ArrayList f1101O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public LivePlayActivity f1102O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public com.github.tvbox.osc.ui.dialog.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f1103O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f1101O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
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
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = (O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo) viewHolder;
        int layoutPosition = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.getLayoutPosition();
        Integer numValueOf = Integer.valueOf(layoutPosition);
        TextView textView = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1099O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        textView.setTag(numValueOf);
        Integer numValueOf2 = Integer.valueOf(layoutPosition);
        ImageView imageView = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1100O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        imageView.setTag(numValueOf2);
        textView.setText((String) this.f1101O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.get(layoutPosition));
        textView.setTextColor(-1);
        textView.setOnClickListener(this);
        imageView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.github.tvbox.osc.ui.dialog.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        byte[] bArr;
        Integer num = (Integer) view.getTag();
        int iIntValue = num.intValue();
        int id = view.getId();
        ArrayList arrayList = this.f1101O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (id == R.id.urlName) {
            try {
                File file = new File(new File(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1329O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO + ServiceReference.DELIMITER + ((String) arrayList.get(iIntValue))), "hawk");
                int i = O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1592O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    bArr = new byte[bufferedInputStream.available()];
                    bufferedInputStream.read(bArr);
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    bArr = null;
                }
                if (bArr == null) {
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "数据恢复失败！");
                    return;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, "UTF-8"));
                Iterator<String> itKeys = jSONObject.keys();
                SharedPreferences sharedPreferences = App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getSharedPreferences("Hawk2", 0);
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String string = jSONObject.getString(next);
                    if (next.equals("cipher_key")) {
                        App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getSharedPreferences("crypto.KEY_256", 0).edit().putString(next, string).commit();
                    } else {
                        sharedPreferences.edit().putString(next, string).commit();
                    }
                }
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "恢复成功，请重启应用");
                return;
            } catch (Throwable th) {
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "数据恢复失败" + th.getMessage());
                th.printStackTrace();
                return;
            }
        }
        if (id == R.id.urlDeButton) {
            String str = (String) arrayList.get(iIntValue);
            if (this.f1103O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                this.f1103O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new com.github.tvbox.osc.ui.dialog.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(this.f1102O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, R.style.CustomDialogStyleDim);
            }
            this.f1103O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setContentView(R.layout.dialog_delete);
            this.f1103O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setCanceledOnTouchOutside(true);
            TextView textView = (TextView) this.f1103O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.findViewById(R.id.title);
            ((TextView) this.f1103O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.findViewById(R.id.mes)).setText("是否删除备份文件 " + str + " ?");
            TextView textView2 = (TextView) this.f1103O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.findViewById(R.id.ok);
            TextView textView3 = (TextView) this.f1103O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.findViewById(R.id.cancel);
            textView3.requestFocus();
            textView.setText("删除提示 !");
            textView2.setText("确定");
            textView3.setText("取消");
            this.f1103O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.show();
            textView2.setTag(num);
            textView3.setTag(num);
            textView2.setOnClickListener(this);
            textView3.setOnClickListener(this);
            return;
        }
        if (id != R.id.ok) {
            if (id != R.id.cancel || (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = this.f1103O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) == null) {
                return;
            }
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.dismiss();
            return;
        }
        if (iIntValue == arrayList.size()) {
            return;
        }
        try {
            O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(new File(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1329O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO + ServiceReference.DELIMITER + ((String) arrayList.get(iIntValue))));
            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "备份已删除！");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        arrayList.remove(iIntValue);
        notifyItemRemoved(iIntValue);
        notifyItemRangeChanged(iIntValue, arrayList.size());
        com.github.tvbox.osc.ui.dialog.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = this.f1103O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 != null) {
            o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2.dismiss();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(viewGroup, R.layout.item_backup, viewGroup, false);
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1099O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = (TextView) viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.findViewById(R.id.urlName);
        o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f1100O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = (ImageView) viewO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.findViewById(R.id.urlDeButton);
        return o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }
}
