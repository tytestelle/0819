package androidx.core.location;

import android.location.Location;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2158O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Consumer f2159O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Location f2160O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(Consumer consumer, Location location, int i) {
        this.f2158O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2159O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = consumer;
        this.f2160O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2158O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2159O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.accept(this.f2160O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                this.f2159O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.accept(this.f2160O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
