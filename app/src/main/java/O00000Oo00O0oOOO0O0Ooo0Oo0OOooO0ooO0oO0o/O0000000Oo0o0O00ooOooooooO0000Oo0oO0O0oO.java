package O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(9);
        super.run();
    }
}
