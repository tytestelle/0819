package com.quickjs;

import java.io.Closeable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class O00000OOoOOO00O00o0ooooooooO000ooooO0000 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f3837O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Closeable f3838O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O00000OOoOOO00O00o0ooooooooO000ooooO0000(Closeable closeable, int i) {
        this.f3837O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f3838O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = closeable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3837O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo((O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO) this.f3838O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                break;
            default:
                QuickJS quickJS = (QuickJS) this.f3838O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                if (!quickJS.f3851O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                    Map map = QuickJS.f3850O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                    int size = map.size();
                    O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO[] o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oOArr = new O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO[size];
                    map.values().toArray(o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oOArr);
                    for (int i = 0; i < size; i++) {
                        O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO = o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oOArr[i];
                        if (o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.f3839O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO == quickJS) {
                            o00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO.close();
                        }
                    }
                    quickJS.f3853O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o._releaseRuntime(quickJS.f3852O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                    quickJS.f3851O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = true;
                    break;
                }
                break;
        }
    }
}
