package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    public static int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str) {
        str.getClass();
        switch (str) {
            case "easing":
                return TypedValues.CycleType.TYPE_EASING;
            case "rotationX":
                return 308;
            case "rotationY":
                return 309;
            case "rotationZ":
                return 310;
            case "translationX":
                return 304;
            case "translationY":
                return 305;
            case "translationZ":
                return 306;
            case "progress":
                return 315;
            case "pivotX":
                return 313;
            case "pivotY":
                return 314;
            case "scaleX":
                return 311;
            case "scaleY":
                return 312;
            case "alpha":
                return 403;
            case "curveFit":
                return 401;
            case "pathRotate":
                return 416;
            case "visibility":
                return 402;
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
        if (i == 416) {
            return 4;
        }
        if (i == 420 || i == 421) {
            return 8;
        }
        switch (i) {
            case 304:
            case 305:
            case 306:
            case 307:
            case 308:
            case 309:
            case 310:
            case 311:
            case 312:
            case 313:
            case 314:
            case 315:
                return 4;
            default:
                switch (i) {
                    case 401:
                    case 402:
                        return 2;
                    case 403:
                        return 4;
                    default:
                        switch (i) {
                            case TypedValues.CycleType.TYPE_WAVE_PERIOD /* 423 */:
                            case TypedValues.CycleType.TYPE_WAVE_OFFSET /* 424 */:
                            case TypedValues.CycleType.TYPE_WAVE_PHASE /* 425 */:
                                return 4;
                            default:
                                return -1;
                        }
                }
        }
    }
}
