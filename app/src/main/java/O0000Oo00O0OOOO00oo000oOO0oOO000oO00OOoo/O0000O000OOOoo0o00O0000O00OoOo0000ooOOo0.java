package O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo;

import android.text.TextUtils;
import android.util.Log;
import com.github.tvbox.osc.bean.AddressItem;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f1160O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ AddressItem f1161O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0(AddressItem addressItem, int i) {
        this.f1160O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f1161O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = addressItem;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AddressItem addressItem = this.f1161O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        switch (this.f1160O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                break;
            case 1:
                HashMap map = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1378O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                String liveUrl = addressItem.getLiveUrl();
                String strO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(addressItem);
                if (TextUtils.isEmpty(strO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) || strO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.trim().startsWith("<?xml")) {
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(1, addressItem.getLiveUrlName() + " 获取数据为空");
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strO000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
                        boolean zHas = jSONObject.has("storeHouse");
                        HashMap map2 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1378O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        if (zHas) {
                            ArrayList arrayList = (ArrayList) map2.get(liveUrl);
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1379O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = arrayList;
                            if (arrayList == null || arrayList.isEmpty()) {
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1379O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ArrayList();
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(jSONObject.getJSONArray("storeHouse"), O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1379O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                                map2.put(liveUrl, O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1379O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                            }
                        } else if (jSONObject.has("urls")) {
                            ArrayList arrayList2 = (ArrayList) map2.get(liveUrl);
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1379O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = arrayList2;
                            if (arrayList2 == null || arrayList2.isEmpty()) {
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1379O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ArrayList();
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(jSONObject.getJSONArray("urls"), O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1379O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                                map2.put(liveUrl, O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1379O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                            }
                        } else if (jSONObject.has("lives")) {
                            ArrayList arrayList3 = (ArrayList) map2.get(liveUrl);
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1379O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = arrayList3;
                            if (arrayList3 == null || arrayList3.isEmpty()) {
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1379O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ArrayList();
                                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(jSONObject.getJSONArray("lives"), O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1379O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                                map2.put(liveUrl, O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f1379O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                            }
                        }
                    } catch (Exception e) {
                        Log.e("tvbox json error", "error：" + e.getMessage());
                        return;
                    }
                }
                break;
            default:
                O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem);
                break;
        }
    }
}
