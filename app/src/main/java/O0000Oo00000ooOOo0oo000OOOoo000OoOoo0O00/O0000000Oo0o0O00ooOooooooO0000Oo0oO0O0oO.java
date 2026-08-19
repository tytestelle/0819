package O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00;

import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o;
import android.animation.ObjectAnimator;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.github.tvbox.osc.bean.AddressItem;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.github.tvbox.osc.ui.dialog.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;
import com.google.gson.JsonArray;
import com.orhanobut.hawk.Hawk;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f1070O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ LivePlayActivity f1071O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(LivePlayActivity livePlayActivity, int i) {
        this.f1070O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f1071O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = livePlayActivity;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    @Override // java.lang.Runnable
    public final void run() {
        File[] fileArrListFiles;
        boolean z;
        boolean z2;
        LivePlayActivity livePlayActivity = this.f1071O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        switch (this.f1070O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                String str = LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo;
                livePlayActivity.getClass();
                JsonArray jsonArray = new JsonArray();
                O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                ArrayList<AddressItem> arrayList = (ArrayList) Hawk.get("live_url_list", new ArrayList());
                HashSet hashSet = new HashSet();
                for (AddressItem addressItem : arrayList) {
                    if (!TextUtils.isEmpty(addressItem.getRequestUrl()) && addressItem.isSelected()) {
                        O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(addressItem, false, livePlayActivity, jsonArray);
                        StringBuilder sb = new StringBuilder();
                        sb.append(addressItem.getItemId());
                        String str2 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1321O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        sb.append(".txt");
                        hashSet.add(sb.toString());
                    }
                }
                O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(jsonArray, 0);
                O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo();
                if (O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f875O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.isEmpty()) {
                    return;
                }
                livePlayActivity.runOnUiThread(new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(livePlayActivity, 3));
                File file = new File(O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1323O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.isFile()) {
                            String name = file2.getName();
                            String str3 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1321O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                            if (name.endsWith(".txt") && !hashSet.contains(file2.getName())) {
                                file2.delete();
                            }
                        }
                    }
                    return;
                }
                return;
            case 1:
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(livePlayActivity.f2979O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0, "translationX", -livePlayActivity.f2979O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.getWidth(), ((ViewGroup) livePlayActivity.f2979O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0.getParent()).getWidth());
                livePlayActivity.f2994O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(1100L);
                livePlayActivity.f2994O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.setRepeatCount(-1);
                livePlayActivity.f2994O0000OO00ooOOoOooo000oo000O0OO0oO0OoO0Oo.start();
                return;
            case 2:
                livePlayActivity.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O();
                return;
            case 3:
                livePlayActivity.getClass();
                ArrayList arrayList2 = O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f875O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                if (arrayList2.isEmpty()) {
                    return;
                }
                O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
                o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.getClass();
                ArrayList arrayList3 = O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f1126O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
                o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.notifyDataSetChanged();
                int i = !O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() ? 1 : 0;
                LivePlayActivity.f2945O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.clear();
                O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                Integer numValueOf = Integer.valueOf(i);
                o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
                int iIntValue = ((Integer) Hawk.get("last_large_live_group_index", numValueOf)).intValue();
                O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                int iIntValue2 = ((Integer) Hawk.get("last_live_group_index", 0)).intValue();
                O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                int iIntValue3 = ((Integer) Hawk.get("last_live_channel_index", 0)).intValue();
                while (iIntValue > arrayList2.size() - 1) {
                    iIntValue--;
                }
                if (iIntValue < 0) {
                    iIntValue = 0;
                }
                ArrayList arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(iIntValue);
                LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3077O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
                while (iIntValue2 > arrayListO000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.size() - 1) {
                    iIntValue2--;
                }
                if (iIntValue2 < 0) {
                    iIntValue2 = 0;
                }
                if (iIntValue == 0 && !O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O() && O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().f876O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.isEmpty() && arrayList2.size() > 1) {
                    iIntValue = 1;
                }
                while (iIntValue3 > O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO().O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(iIntValue, iIntValue2).size() - 1) {
                    iIntValue3--;
                }
                if (iIntValue3 < 0) {
                    iIntValue3 = 0;
                }
                livePlayActivity.O0000O0OoooOO0Oo0oO0oo0O00Oo0oooOOoOOO0o();
                livePlayActivity.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000();
                LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.getClass();
                boolean zO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(iIntValue, iIntValue2);
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.getClass();
                o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000OOoOOO00O00o0ooooooooO000ooooO0000(zO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(iIntValue, iIntValue2));
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01 = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO;
                if (zO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.getClass();
                } else {
                    o00000OO000O000Oo0000oOOo0OO0oOoo0o0oo01.f3051O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(iIntValue, iIntValue2, iIntValue3, false);
                }
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3036O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo = iIntValue;
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo = iIntValue2;
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00 = iIntValue3;
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3040O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3036O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo;
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3041O0000Oo00O0OOOOoOo0Oo00ooO0OOOoO00OoO0oo = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3037O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;
                O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3042O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000 = O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.f3038O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00;
                return;
            default:
                O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                Date date = (Date) Hawk.get("epg_delete_time", null);
                if (date == null) {
                    z = false;
                } else {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(date.getTime());
                    if (calendar.get(5) == Calendar.getInstance().get(5)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                int i2 = Calendar.getInstance().get(11);
                int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                if (!z && i2 >= iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(livePlayActivity);
                    String str4 = O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.f1564O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.format(new Date());
                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getClass();
                    if (!TextUtils.isEmpty(str4)) {
                        ReentrantLock reentrantLock = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1376O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                        reentrantLock.lock();
                        try {
                            SQLiteDatabase writableDatabase = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getWritableDatabase();
                            if (writableDatabase != null) {
                                Cursor cursorRawQuery = writableDatabase.rawQuery("SELECT channel_key FROM epg_data WHERE date = ?", new String[]{str4});
                                while (cursorRawQuery.moveToNext()) {
                                    o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f1377O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.remove(cursorRawQuery.getString(0));
                                }
                                cursorRawQuery.close();
                                writableDatabase.delete("epg_data", "date = ?", new String[]{str4});
                            }
                            reentrantLock.unlock();
                        } catch (Throwable th) {
                            reentrantLock.unlock();
                            throw th;
                        }
                    }
                    livePlayActivity.getClass();
                    LivePlayActivity.f2945O0000OoOoo00oOooooo0OoOoO0o0oOoO00o0Oo0o.clear();
                    O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2 = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                    Date date2 = new Date();
                    o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo2.getClass();
                    Hawk.put("epg_delete_time", date2);
                    break;
                }
                if (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() == 0) {
                    O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O00000OOoOOO00O00o0ooooooooO000ooooO0000(2, "EPG缓存已关闭，已跳过XML EPG缓存到本地");
                    return;
                }
                O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                Date date3 = (Date) Hawk.get("epg_update_time", null);
                if (date3 == null) {
                    z2 = false;
                } else {
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(date3.getTime());
                    if (calendar2.get(5) == Calendar.getInstance().get(5)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                int iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2 = O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
                int i3 = Calendar.getInstance().get(11);
                O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo3 = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                Boolean bool = Boolean.FALSE;
                o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo3.getClass();
                boolean zBooleanValue = ((Boolean) Hawk.get("need_update_epg", bool)).booleanValue();
                if (!z2) {
                    O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo4 = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                    Date date4 = new Date();
                    o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo4.getClass();
                    Hawk.put("epg_update_time", date4);
                    O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo5 = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                    Boolean boolValueOf = Boolean.valueOf(i3 < iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2);
                    o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo5.getClass();
                    Hawk.put("need_update_epg", boolValueOf);
                } else {
                    if (!zBooleanValue || i3 < iO0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO2) {
                        return;
                    }
                    O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    Hawk.put("need_update_epg", bool);
                }
                O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                ArrayList<AddressItem> arrayList4 = (ArrayList) Hawk.get("live_epg_list", new ArrayList());
                if (arrayList4.isEmpty()) {
                    return;
                }
                for (AddressItem addressItem2 : arrayList4) {
                    String requestUrl = addressItem2.getRequestUrl();
                    if (!TextUtils.isEmpty(requestUrl)) {
                        if (TextUtils.isEmpty(addressItem2.getFormat())) {
                            addressItem2.setFormat((requestUrl.contains(".xml") || requestUrl.endsWith(".gz")) ? "XML" : "DIYP");
                        }
                        if ("XML".equals(addressItem2.getFormat()) && addressItem2.isSelected()) {
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(addressItem2);
                        }
                    }
                }
                return;
        }
    }
}
