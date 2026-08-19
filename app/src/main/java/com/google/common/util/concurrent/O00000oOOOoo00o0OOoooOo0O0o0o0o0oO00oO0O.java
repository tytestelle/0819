package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O implements Executor {
    public static final O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O INSTANCE;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O[] f3755O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    static {
        O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O o00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O = new O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O("INSTANCE", 0);
        INSTANCE = o00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O;
        f3755O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O[]{o00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O};
    }

    public static O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O valueOf(String str) {
        return (O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O) Enum.valueOf(O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.class, str);
    }

    public static O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O[] values() {
        return (O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O[]) f3755O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.clone();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
