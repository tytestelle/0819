package O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00;

import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import com.orhanobut.hawk.Hawk;
import java.util.HashMap;
import xyz.doikki.videoplayer.player.ProgressManager;

/* JADX INFO: loaded from: classes.dex */
public final class O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 extends ProgressManager {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ LivePlayActivity f1088O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(LivePlayActivity livePlayActivity) {
        this.f1088O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = livePlayActivity;
    }

    @Override // xyz.doikki.videoplayer.player.ProgressManager
    public final long getSavedProgress(String str) {
        if (!O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0()) {
            return 0L;
        }
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
        HashMap map = new HashMap();
        o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
        Long l = (Long) ((HashMap) Hawk.get("VODPosition", map)).get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Override // xyz.doikki.videoplayer.player.ProgressManager
    public final void saveProgress(String str, long j) {
        if (!O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0() || O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 || this.f1088O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getDuration() <= 0) {
            return;
        }
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo = O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo();
        HashMap map = new HashMap();
        o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000oO00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
        HashMap map2 = (HashMap) Hawk.get("VODPosition", map);
        map2.put(str, Long.valueOf(j));
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().getClass();
        Hawk.put("VODPosition", map2);
    }
}
