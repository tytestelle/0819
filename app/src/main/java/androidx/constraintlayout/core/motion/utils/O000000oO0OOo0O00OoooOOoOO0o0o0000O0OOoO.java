package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    public static int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str) {
        str.getClass();
        switch (str) {
            case "transitionEasing":
                return 501;
            case "percentWidth":
                return 503;
            case "percentHeight":
                return 504;
            case "drawPath":
                return 502;
            case "sizePercent":
                return 505;
            case "percentX":
                return 506;
            case "percentY":
                return 507;
            default:
                return -1;
        }
    }

    public static int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i) {
        if (i == 100) {
            return 2;
        }
        if (i == 101) {
            return 8;
        }
        switch (i) {
            case 501:
            case 502:
                return 8;
            case 503:
            case 504:
            case 505:
            case 506:
            case 507:
                return 4;
            case 508:
                return 2;
            default:
                return -1;
        }
    }
}
