package O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0;

import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import com.github.tvbox.osc.bean.ShortcutsMenuItem;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.orhanobut.hawk.Hawk;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f963O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(int i) {
        this.f963O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f963O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                ShortcutsMenuItem.lambda$static$0();
                break;
            case 1:
                ShortcutsMenuItem.lambda$static$4();
                break;
            case 2:
                ShortcutsMenuItem.lambda$static$5();
                break;
            case 3:
                ShortcutsMenuItem.lambda$static$6();
                break;
            case 4:
                ShortcutsMenuItem.lambda$static$7();
                break;
            case 5:
                ShortcutsMenuItem.lambda$static$8();
                break;
            case 6:
                ShortcutsMenuItem.lambda$static$9();
                break;
            case 7:
                ShortcutsMenuItem.lambda$static$10();
                break;
            case 8:
                ShortcutsMenuItem.lambda$static$11();
                break;
            case 9:
                ShortcutsMenuItem.lambda$static$12();
                break;
            case 10:
                ShortcutsMenuItem.lambda$static$13();
                break;
            case 11:
                ShortcutsMenuItem.lambda$static$14();
                break;
            case 12:
                ShortcutsMenuItem.lambda$static$15();
                break;
            case 13:
                ShortcutsMenuItem.lambda$static$1();
                break;
            case 14:
                ShortcutsMenuItem.lambda$static$2();
                break;
            case 15:
                ShortcutsMenuItem.lambda$static$3();
                break;
            case 16:
                LivePlayActivity.f2944O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.setVisibility(8);
                break;
            default:
                try {
                    O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
                    O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1385O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new JSONObject((String) Hawk.get("cacheData", "{}"));
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Iterator<String> itKeys = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1385O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        long j = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1385O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.getJSONObject(next).getLong("time");
                        if (j != 0 && j < jCurrentTimeMillis) {
                            O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1385O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.remove(next);
                        }
                    }
                    O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
                    String string = O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f1385O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.toString();
                    o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
                    Hawk.put("cacheData", string);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
