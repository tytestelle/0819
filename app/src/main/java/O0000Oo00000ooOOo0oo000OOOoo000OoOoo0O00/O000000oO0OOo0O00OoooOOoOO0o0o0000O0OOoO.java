package O0000Oo00000ooOOo0oo000OOOoo000OoOoo0O00;

import android.net.TrafficStats;
import com.github.tvbox.osc.ui.activity.LivePlayActivity;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f1081O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public long f1082O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1083O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(Object obj, long j, int i) {
        this.f1081O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f1083O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = obj;
        this.f1082O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = true;
        boolean z2 = true;
        switch (this.f1081O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                long totalRxBytes = TrafficStats.getTotalRxBytes();
                long j = totalRxBytes - this.f1082O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                this.f1082O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = totalRxBytes;
                double d = j;
                String strConcat = d < 1024.0d ? "0.00MB/s" : String.format(Locale.CHINESE, "%.2f", Double.valueOf((d / 1024.0d) / 1024.0d)).concat("MB/s");
                LivePlayActivity livePlayActivity = (LivePlayActivity) this.f1083O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                livePlayActivity.O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.setText(strConcat);
                livePlayActivity.f2991O0000O0oo0o0oo0O0000O0oOo0o0O00OO0o0O0OO.postDelayed(this, 1000L);
                return;
            case 1:
                O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) this.f1083O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                try {
                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(this.f1082O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    return;
                } finally {
                    o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O(true);
                }
            default:
                for (O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2 : ((O0000ooOo00o00OO0000o0oO00o0o00ooOo0oO0o.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) this.f1083O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o).f1786O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.keySet()) {
                    long j2 = this.f1082O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                    if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.f1770O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo && o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.f1746O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO > 0) {
                        long j3 = j2 - o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.f1769O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000;
                        if (j3 > o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.f1746O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) {
                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.f1770O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = false;
                            o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2.f1758O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.dispatch(new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO2, j3, z2 ? 1 : 0));
                        }
                    }
                }
                return;
        }
    }

    public String toString() {
        switch (this.f1081O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 2:
                return "Idle-" + super.toString();
            default:
                return super.toString();
        }
    }

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(LivePlayActivity livePlayActivity) {
        this.f1081O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = 0;
        this.f1083O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = livePlayActivity;
        this.f1082O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = TrafficStats.getTotalRxBytes();
    }
}
