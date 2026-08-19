package kotlinx.coroutines.scheduling;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ int[] f4146O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    static {
        int[] iArr = new int[O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.values().length];
        iArr[O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.PARKING.ordinal()] = 1;
        iArr[O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.BLOCKING.ordinal()] = 2;
        iArr[O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.CPU_ACQUIRED.ordinal()] = 3;
        iArr[O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.DORMANT.ordinal()] = 4;
        iArr[O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.TERMINATED.ordinal()] = 5;
        f4146O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = iArr;
    }
}
