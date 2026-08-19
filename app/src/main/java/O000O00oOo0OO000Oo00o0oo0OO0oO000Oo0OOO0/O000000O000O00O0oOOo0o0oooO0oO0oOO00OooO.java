package O000O00oOo0OO000Oo00o0oo0OO0oO000Oo0OOO0;

import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ int[] f2055O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    static {
        int[] iArr = new int[ThreadMode.values().length];
        f2055O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = iArr;
        try {
            iArr[ThreadMode.POSTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f2055O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[ThreadMode.MAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f2055O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f2055O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[ThreadMode.BACKGROUND.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f2055O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[ThreadMode.ASYNC.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
