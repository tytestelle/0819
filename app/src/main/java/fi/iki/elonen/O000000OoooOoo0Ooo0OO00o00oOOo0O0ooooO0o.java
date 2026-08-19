package fi.iki.elonen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public long f3945O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final List f3946O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = Collections.synchronizedList(new ArrayList());

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
        this.f3945O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO++;
        Thread thread = new Thread(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f3945O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + ")");
        this.f3946O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.add(o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        thread.start();
    }
}
