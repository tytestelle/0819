package com.github.tvbox.osc.ui.dialog;

import android.content.SharedPreferences;
import android.view.View;
import com.github.tvbox.osc.base.App;
import com.github.tvbox.osc.ui.tv.CustomView.CustomRecyclerView;
import com.player.ku9py.R;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import org.fourthline.cling.model.ServiceReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public CustomRecyclerView f3018O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f3019O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public static ArrayList O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO() {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1329O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO + ServiceReference.DELIMITER);
            File[] fileArrListFiles = file.listFiles();
            Arrays.sort(fileArrListFiles, new O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(3));
            if (file.exists()) {
                for (File file2 : fileArrListFiles) {
                    if (arrayList.size() > 10) {
                        O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(file2);
                    } else if (file2.isDirectory()) {
                        arrayList.add(file2.getName());
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return arrayList;
    }

    public final void O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(ArrayList arrayList) {
        boolean zIsEmpty = arrayList.isEmpty();
        CustomRecyclerView customRecyclerView = this.f3018O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (zIsEmpty) {
            customRecyclerView.setVisibility(8);
        } else {
            customRecyclerView.setVisibility(0);
        }
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = this.f3019O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        ArrayList arrayList2 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1101O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.backup) {
            try {
                File file = new File(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1329O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO + ServiceReference.DELIMITER);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, new SimpleDateFormat("yyyy-MM-dd-HHmmss").format(new Date()));
                file2.mkdirs();
                SharedPreferences sharedPreferences = App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getSharedPreferences("Hawk2", 0);
                JSONObject jSONObject = new JSONObject();
                for (String str : sharedPreferences.getAll().keySet()) {
                    jSONObject.put(str, sharedPreferences.getString(str, ""));
                }
                SharedPreferences sharedPreferences2 = App.f2937O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getSharedPreferences("crypto.KEY_256", 0);
                for (String str2 : sharedPreferences2.getAll().keySet()) {
                    jSONObject.put(str2, sharedPreferences2.getString(str2, ""));
                }
                byte[] bytes = jSONObject.toString().getBytes("UTF-8");
                File file3 = new File(file2, "hawk");
                int i = O0000Oo0o000OO0O0oOo0O0oO00OOOO0OoOOoOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1592O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                try {
                    if (file3.exists()) {
                        file3.delete();
                    }
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3));
                    bufferedOutputStream.write(bytes);
                    bufferedOutputStream.close();
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(0, "备份成功！");
                } catch (IOException e) {
                    e.printStackTrace();
                    file2.delete();
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "备份数据失败！");
                }
            } catch (Throwable th) {
                th.printStackTrace();
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, "备份失败！");
            }
            O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO());
        }
    }
}
