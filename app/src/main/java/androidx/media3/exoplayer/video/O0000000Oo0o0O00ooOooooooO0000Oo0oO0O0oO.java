package androidx.media3.exoplayer.video;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO implements Executor {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2705O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i) {
        this.f2705O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2705O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                DefaultVideoSink.lambda$new$0(runnable);
                break;
            default:
                PlaybackVideoGraphWrapper.lambda$static$0(runnable);
                break;
        }
    }
}
