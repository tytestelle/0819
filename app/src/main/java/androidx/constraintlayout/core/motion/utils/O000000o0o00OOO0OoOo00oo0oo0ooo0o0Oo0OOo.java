package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {
    public static int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str) {
        str.getClass();
        if (str.equals(TypedValues.MotionScene.S_DEFAULT_DURATION)) {
            return 600;
        }
        return !str.equals(TypedValues.MotionScene.S_LAYOUT_DURING_TRANSITION) ? -1 : 601;
    }

    public static int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i) {
        if (i != 600) {
            return i != 601 ? -1 : 1;
        }
        return 2;
    }
}
