package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import com.github.tvbox.osc.bean.AddressItem;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.google.gson.JsonArray;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f1238O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo f1239O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ AddressItem f1240O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00(O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo, AddressItem addressItem, int i) {
        this.f1238O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f1239O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo;
        this.f1240O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = addressItem;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1238O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = this.f1239O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.getClass();
                File file = new File(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1323O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, this.f1240O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getItemId() + ".txt");
                if (file.exists()) {
                    file.delete();
                    o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo.f1246O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(0);
                }
                break;
            default:
                O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2 = this.f1239O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.getClass();
                JsonArray jsonArray = new JsonArray();
                AddressItem addressItem = this.f1240O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                LivePlayActivity livePlayActivity = o0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo2.f1246O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(addressItem, true, livePlayActivity, jsonArray);
                livePlayActivity.O0000O0o000O0OOOOo0OO00O00ooo00o0OO00oO0(0);
                break;
        }
    }
}
