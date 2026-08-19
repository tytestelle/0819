package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4056O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = AtomicIntegerFieldUpdater.newUpdater(O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.class, "_handled");

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Throwable f4057O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    private volatile /* synthetic */ int _handled;

    public O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(Throwable th, boolean z) {
        this.f4057O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = th;
        this._handled = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f4057O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + ']';
    }
}
