package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O0000OO0oooooo0oo0Oo0OOOoOO0o0OooooO0000 {
    public static int O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(int i) {
        return O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, 0, 0, 0);
    }

    public static int O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(int i, int i2, int i3) {
        return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, i2, i3, 0, 128, 0);
    }

    public static int O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(int i, int i2, int i3, int i4) {
        return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, i2, i3, 0, 128, i4);
    }

    public static int O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(int i, int i2, int i3, int i4, int i5) {
        return O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(i, i2, i3, i4, i5, 0);
    }

    public static int O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(int i, int i2, int i3, int i4, int i5, int i6) {
        return i | i2 | i3 | i4 | i5 | i6;
    }

    public static int O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(int i) {
        return i & 24;
    }

    public static int O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(int i) {
        return i & RendererCapabilities.AUDIO_OFFLOAD_SUPPORT_MASK;
    }

    public static int O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(int i) {
        return i & 384;
    }

    public static int O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(int i) {
        return i & 7;
    }

    public static int O000000oooOoo00ooo0O0000000o00O0Oooo0OOO(int i) {
        return i & 64;
    }

    public static int O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo(int i) {
        return i & 32;
    }

    public static boolean O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(int i, boolean z) {
        int iO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O = O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(i);
        return iO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O == 4 || (z && iO000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O == 3);
    }

    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(RendererCapabilities rendererCapabilities) {
    }

    public static void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(RendererCapabilities rendererCapabilities, RendererCapabilities.Listener listener) {
    }
}
