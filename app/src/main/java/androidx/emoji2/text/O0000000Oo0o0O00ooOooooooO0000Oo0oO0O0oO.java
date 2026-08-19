package androidx.emoji2.text;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Executor {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ Handler f2212O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f2212O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.post(runnable);
    }
}
