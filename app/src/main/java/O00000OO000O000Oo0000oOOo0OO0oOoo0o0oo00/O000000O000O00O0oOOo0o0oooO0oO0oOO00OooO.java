package O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(runnable, 0), "glide-active-resources");
    }
}
