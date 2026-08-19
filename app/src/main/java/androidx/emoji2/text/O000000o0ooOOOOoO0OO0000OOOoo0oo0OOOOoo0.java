package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements Runnable {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f2217O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ FontRequestEmojiCompatConfig.FontRequestMetadataLoader f2218O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader, int i) {
        this.f2217O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f2218O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = fontRequestMetadataLoader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2217O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                this.f2218O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.createMetadata();
                break;
            default:
                this.f2218O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.loadInternal();
                break;
        }
    }
}
