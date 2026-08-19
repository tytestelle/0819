package androidx.media3.common.util;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements ThreadFactory {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2304O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ String f2305O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(String str, int i) {
        this.f2304O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2305O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f2304O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return Util.lambda$newSingleThreadExecutor$3(this.f2305O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, runnable);
            default:
                return Util.lambda$newSingleThreadScheduledExecutor$4(this.f2305O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, runnable);
        }
    }
}
