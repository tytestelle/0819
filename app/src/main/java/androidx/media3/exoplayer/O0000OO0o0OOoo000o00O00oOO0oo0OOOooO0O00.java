package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O0000OO0o0OOoo000o00O00oOO0oo0OOOooO0O00 {
    public static long O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Renderer renderer, long j, long j2) {
        if (renderer.getState() == 1 && (renderer.isReady() || renderer.isEnded())) {
            return 1000000L;
        }
        return Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
    }

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Renderer renderer) {
    }

    public static void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Renderer renderer) {
    }

    public static void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(Renderer renderer, float f, float f2) {
    }
}
