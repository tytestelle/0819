package androidx.media3.exoplayer;

import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 implements com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2329O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f2330O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(Object obj, int i) {
        this.f2329O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2330O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // com.google.common.base.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final Object apply(Object obj) {
        switch (this.f2329O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return ExoPlayer.Builder.lambda$setAnalyticsCollector$21((AnalyticsCollector) this.f2330O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Clock) obj);
            case 1:
                return ExoPlayer.Builder.lambda$new$13((AnalyticsCollector) this.f2330O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, (Clock) obj);
            default:
                return ((StreamVolumeManager) this.f2330O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).lambda$release$12((StreamVolumeManager.StreamVolumeState) obj);
        }
    }
}
