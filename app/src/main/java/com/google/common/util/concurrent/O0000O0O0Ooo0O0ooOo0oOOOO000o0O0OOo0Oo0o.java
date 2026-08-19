package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Object f3763O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new Object();

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final String f3764O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public volatile Logger f3765O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o(Class cls) {
        this.f3764O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = cls.getName();
    }

    public final Logger O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        Logger logger = this.f3765O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f3763O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            try {
                Logger logger2 = this.f3765O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f3764O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                this.f3765O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
