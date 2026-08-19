package O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Callable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f101O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ Object f102O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj, int i) {
        this.f101O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f102O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f101O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                synchronized (((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f102O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) {
                    try {
                        O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = (O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f102O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                        if (o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f122O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null) {
                            return null;
                        }
                        o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.O00000O00oOOo000000OOOo00OOOo0OooOO00OO0();
                        if (((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f102O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000()) {
                            ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f102O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
                            ((O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) this.f102O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).f124O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = 0;
                        }
                        return null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                ((androidx.media3.exoplayer.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) this.f102O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO).run();
                return null;
        }
    }
}
