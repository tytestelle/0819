package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo implements com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2501O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    public /* synthetic */ O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo(int i) {
        this.f2501O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
    }

    @Override // com.google.common.base.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O
    public final Object get() {
        switch (this.f2501O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return DefaultPlaybackSessionManager.generateDefaultSessionId();
            default:
                throw new IllegalStateException();
        }
    }
}
