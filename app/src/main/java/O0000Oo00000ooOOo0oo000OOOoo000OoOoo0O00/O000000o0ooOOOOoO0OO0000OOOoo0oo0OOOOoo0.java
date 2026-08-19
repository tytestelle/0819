package O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.profileinstaller.DeviceProfileWriter;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f1077O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ int f1078O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1079O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final /* synthetic */ Object f1080O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public /* synthetic */ O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Object obj, int i, Object obj2, int i2) {
        this.f1077O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i2;
        this.f1079O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj;
        this.f1078O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
        this.f1080O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f1079O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        Object obj2 = this.f1080O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        int i = this.f1078O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        switch (this.f1077O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                String str = LivePlayActivity.f2941O0000OoO000Oo0ooO00Ooo0O00OOoO0oO0O0Oooo;
                ((LivePlayActivity) obj).O00000O00oOOo000000OOOo00OOOo0OooOO00OO0((O0000OOO0oooO0OOo0oo00Ooo0ooOooo00ooooO0.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) obj2, i, null);
                break;
            case 1:
                ListenerSet.lambda$queueEvent$0((CopyOnWriteArraySet) obj, i, (ListenerSet.Event) obj2);
                break;
            case 2:
                ((DrmSessionEventListener.EventDispatcher) obj).lambda$drmSessionAcquired$0((DrmSessionEventListener) obj2, i);
                break;
            default:
                ((DeviceProfileWriter) obj).lambda$result$0(i, obj2);
                break;
        }
    }

    public /* synthetic */ O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Object obj, Object obj2, int i, int i2) {
        this.f1077O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i2;
        this.f1079O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj;
        this.f1080O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = obj2;
        this.f1078O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = i;
    }
}
