package O0000OOOoo0OO0o0Oooo00ooOOOo0oO0oOoO0oOO;

import android.text.TextUtils;
import androidx.media3.common.text.Cue;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f983O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ String f984O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(String str, int i) {
        this.f983O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f984O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f983O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                String str = this.f984O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (!TextUtils.isEmpty(str)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Cue.Builder().setText(str).build());
                    LivePlayActivity.f2944O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.setCues(arrayList);
                    LivePlayActivity.f2944O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.setVisibility(0);
                } else {
                    LivePlayActivity.f2944O0000OoOo00O0OO0o00OO0ooOOo0ooo0O0ooooOo.setVisibility(8);
                }
                break;
            default:
                O0000Oo0OoOOOOO00oooOO00o00O0o0000oOo0o0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(this.f984O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, null);
                break;
        }
    }
}
