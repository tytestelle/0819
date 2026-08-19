package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    public static int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str) {
        str.getClass();
        switch (str) {
            case "transitionFlags":
                return TypedValues.TransitionType.TYPE_TRANSITION_FLAGS;
            case "duration":
                return 700;
            case "motionInterpolator":
                return TypedValues.TransitionType.TYPE_INTERPOLATOR;
            case "autoTransition":
                return 704;
            case "to":
                return 702;
            case "from":
                return 701;
            case "pathMotionArc":
                return 509;
            case "staggered":
                return TypedValues.TransitionType.TYPE_STAGGERED;
            default:
                return -1;
        }
    }

    public static int O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(int i) {
        if (i == 509) {
            return 2;
        }
        switch (i) {
            case 700:
                return 2;
            case 701:
            case 702:
                return 8;
            default:
                switch (i) {
                    case TypedValues.TransitionType.TYPE_INTERPOLATOR /* 705 */:
                    case TypedValues.TransitionType.TYPE_TRANSITION_FLAGS /* 707 */:
                        return 8;
                    case TypedValues.TransitionType.TYPE_STAGGERED /* 706 */:
                        return 4;
                    default:
                        return -1;
                }
        }
    }
}
