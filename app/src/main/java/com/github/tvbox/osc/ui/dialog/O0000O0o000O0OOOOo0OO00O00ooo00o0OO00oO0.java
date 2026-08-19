package com.github.tvbox.osc.ui.dialog;

import android.widget.EditText;
import com.github.tvbox.osc.bean.AddressItem;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.tv.CustomView.CustomRecyclerView;
import com.orhanobut.hawk.Hawk;
import java.util.ArrayList;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes.dex */
public final class O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0 extends O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public EditText f3164O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public EditText f3165O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo f3166O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public ArrayList f3167O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public CustomRecyclerView f3168O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public LivePlayActivity f3169O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo f3170O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    public final void O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(AddressItem addressItem) {
        ArrayList arrayList = this.f3167O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        arrayList.add(addressItem);
        int iIndexOf = arrayList.indexOf(addressItem);
        O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo = this.f3166O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.notifyItemInserted(iIndexOf);
        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.notifyItemChanged(arrayList.indexOf(addressItem));
        o0000O0oO0OooOo0oooooooOO0Oo0oo0oOooOOOo.f1194O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = false;
        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
        Hawk.put("live_json_list", arrayList);
        this.f3168O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.scrollToPosition(arrayList.indexOf(addressItem));
    }

    @O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(threadMode = ThreadMode.MAIN)
    public void refresh(O0000OOOOoooOO0oo0o0OO00OooOoO0OOoOO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        int i = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f973O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        String str = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f974O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        if (i == 1) {
            this.f3164O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setText(str);
        }
        if (o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f973O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == 2) {
            this.f3165O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.setText(str);
        }
    }
}
