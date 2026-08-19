package O0000OOoo0ooo0OO00000o00OO0ooOoOoOOoo0oo;

import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o;
import O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000;
import O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O00000OOoOOO00O00o0ooooooooO000ooooO0000;
import O0000Oo00O0OOOO00oo000oOO0oOO000oO00OOoo.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O;
import O0000Oo0O0OoO0OOo00OOooOooO000OOOo00o000.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
import O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import com.bumptech.glide.load.data.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
import com.github.tvbox.osc.base.App;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import java.util.ArrayDeque;
import java.util.ArrayList;
import xyz.doikki.videoplayer.util.PlayerUtils;

/* JADX INFO: loaded from: classes.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o, O0000OOOooO0OOooOo0OOoO0ooOoooOO0ooOOooo.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O0000o000OO0OoOo0o00oO0OOo0O00o000000OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO f1047O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public static App f1048O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f1049O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public Object f1050O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj, int i) {
        this.f1049O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f1050O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    public static O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        if (f1047O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
            synchronized (O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.class) {
                try {
                    if (f1047O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o == null) {
                        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(0);
                        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1050O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
                        f1047O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f1047O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO
    public com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(AssetManager assetManager, String str) {
        return new O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(assetManager, str, 0);
    }

    public void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i) {
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
        O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2;
        LivePlayActivity livePlayActivity = (LivePlayActivity) this.f1050O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        int duration = ((int) livePlayActivity.f2954O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.getDuration()) / 1000;
        if (i == 0) {
            if (O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 || ((o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o) != null && o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() && O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o())) {
                LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
                LivePlayActivity.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
                return;
            }
            if (duration <= 0 || "时移".equals(LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo)) {
                livePlayActivity.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000();
                if (LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3236O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.isShowing()) {
                    LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3236O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.dismiss();
                    return;
                }
                return;
            }
            LivePlayActivity.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
            LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setMin(0.0f);
            LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setMax(duration);
            LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3238O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setText(PlayerUtils.stringForTimeVod(duration * 1000));
            LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
            LivePlayActivity.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
            return;
        }
        if (i != 1) {
            if (i == 2) {
                if (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0()) {
                    livePlayActivity.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo();
                    return;
                } else {
                    livePlayActivity.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0();
                    return;
                }
            }
            if (i != 3) {
                return;
            }
            if (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0()) {
                livePlayActivity.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0();
                return;
            } else {
                livePlayActivity.O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo();
                return;
            }
        }
        if (O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.f1148O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 || ((o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 = LivePlayActivity.f2942O0000OoO00ooooo0ooO0o0o00000OO0O0OOOO0OO.f3081O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o) != null && o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() && O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo().O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o())) {
            LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
            LivePlayActivity.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
            return;
        }
        if (duration <= 0 || "时移".equals(LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo)) {
            livePlayActivity.O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O();
            if (LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3236O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.isShowing()) {
                LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3236O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.dismiss();
                return;
            }
            return;
        }
        LivePlayActivity.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
        LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setMin(0.0f);
        LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3239O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.setMax(duration);
        LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.f3238O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.setText(PlayerUtils.stringForTimeVod(duration * 1000));
        LivePlayActivity.f2943O0000OoOOOoo0O0oo0OO0oo00oo0OOoo0OOoo0OO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
        LivePlayActivity.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
    }

    public synchronized void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) {
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f157O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = null;
        o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f158O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
        ((ArrayDeque) this.f1050O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).offer(o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o
    public com.bumptech.glide.load.data.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Uri uri) {
        return new com.bumptech.glide.load.data.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((ContentResolver) this.f1050O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, uri, 0);
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO) {
        switch (this.f1049O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 2:
                return new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO((AssetManager) this.f1050O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this);
            case 3:
                return new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO((Resources) this.f1050O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Uri.class, AssetFileDescriptor.class));
            case 4:
                return new O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000(this);
            default:
                return new O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO((O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) this.f1050O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
        }
    }

    public O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) {
        this.f1049O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        switch (i) {
            case 5:
                this.f1050O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(4);
                break;
            case 6:
                char[] cArr = O00000OOoOOO00O00o0ooooooooO000ooooO0000.f826O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
                this.f1050O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ArrayDeque(0);
                break;
            case 7:
                this.f1050O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new ArrayList();
                break;
        }
    }
}
