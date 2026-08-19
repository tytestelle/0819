package O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;

import com.google.common.util.concurrent.O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o implements ThreadFactory {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO f461O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final String f462O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f463O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final boolean f464O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final AtomicInteger f465O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, String str, boolean z) {
        O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.f466O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        this.f465O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new AtomicInteger();
        this.f461O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        this.f462O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = str;
        this.f463O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        this.f464O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0 = new O00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0(this, 1, runnable, false);
        this.f461O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.getClass();
        O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(o00000oo000ooOo0oO0ooOo000oo0Oo0o00000O0);
        o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.setName("glide-" + this.f462O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO + "-thread-" + this.f465O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.getAndIncrement());
        return o0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }
}
