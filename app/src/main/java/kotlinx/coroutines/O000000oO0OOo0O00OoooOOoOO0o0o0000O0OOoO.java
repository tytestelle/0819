package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO extends O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4048O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = AtomicIntegerFieldUpdater.newUpdater(O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.class, "_resumed");
    private volatile /* synthetic */ int _resumed;

    public O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, Throwable th, boolean z) {
        super(th, z);
        this._resumed = 0;
    }
}
