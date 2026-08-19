package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    public static int O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(String str) {
        str.getClass();
        switch (str) {
            case "dimension":
                return TypedValues.Custom.TYPE_DIMENSION;
            case "string":
                return TypedValues.Custom.TYPE_STRING;
            case "refrence":
                return TypedValues.Custom.TYPE_REFERENCE;
            case "boolean":
                return TypedValues.Custom.TYPE_BOOLEAN;
            case "color":
                return 902;
            case "float":
                return 901;
            case "integer":
                return 900;
            default:
                return -1;
        }
    }
}
