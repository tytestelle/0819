package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2509O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f2510O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ AudioSink.AudioTrackConfig f2511O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(AudioRendererEventListener.EventDispatcher eventDispatcher, AudioSink.AudioTrackConfig audioTrackConfig, int i) {
        this.f2509O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2510O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventDispatcher;
        this.f2511O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = audioTrackConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2509O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2510O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$audioTrackInitialized$10(this.f2511O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                this.f2510O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$audioTrackReleased$11(this.f2511O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
