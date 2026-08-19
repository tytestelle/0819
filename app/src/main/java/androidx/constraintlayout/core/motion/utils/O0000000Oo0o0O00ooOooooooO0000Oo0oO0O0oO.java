package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    public static int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str) {
        str.getClass();
        switch (str) {
            case "easing":
                return TypedValues.AttributesType.TYPE_EASING;
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
            case "target":
                return 101;
            case "elevation":
                return 307;
            case "alpha":
                return 303;
            case "frame":
                return 100;
            case "curveFit":
                return 301;
            case "pathRotate":
                return TypedValues.AttributesType.TYPE_PATH_ROTATE;
            case "pivotTarget":
                return 318;
            case "visibility":
                return 302;
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
            case 301:
            case 302:
                return 2;
            case 303:
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
            case TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                return 4;
            case TypedValues.AttributesType.TYPE_EASING /* 317 */:
            case 318:
                return 8;
            default:
                return -1;
        }
    }
}
