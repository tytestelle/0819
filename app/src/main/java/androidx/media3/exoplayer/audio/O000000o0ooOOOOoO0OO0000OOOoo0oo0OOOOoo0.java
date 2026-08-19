package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2512O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f2513O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final /* synthetic */ Exception f2514O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    public /* synthetic */ O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(AudioRendererEventListener.EventDispatcher eventDispatcher, Exception exc, int i) {
        this.f2512O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2513O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = eventDispatcher;
        this.f2514O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2512O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2513O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$audioCodecError$9(this.f2514O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
            default:
                this.f2513O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.lambda$audioSinkError$8(this.f2514O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o);
                break;
        }
    }
}
