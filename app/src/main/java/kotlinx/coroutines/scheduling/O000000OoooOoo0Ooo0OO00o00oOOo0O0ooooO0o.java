package kotlinx.coroutines.scheduling;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o {
    public static final O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o BLOCKING;
    public static final O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o CPU_ACQUIRED;
    public static final O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o DORMANT;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[] f4155O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    public static final O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o PARKING;
    public static final O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o TERMINATED;

    static {
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("CPU_ACQUIRED", 0);
        CPU_ACQUIRED = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2 = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("BLOCKING", 1);
        BLOCKING = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2;
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3 = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("PARKING", 2);
        PARKING = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3;
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o4 = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("DORMANT", 3);
        DORMANT = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o4;
        O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o5 = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o("TERMINATED", 4);
        TERMINATED = o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o5;
        f4155O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[]{o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o2, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o3, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o4, o000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o5};
    }

    public static O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o valueOf(String str) {
        return (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o) Enum.valueOf(O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.class, str);
    }

    public static O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[] values() {
        return (O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o[]) f4155O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.clone();
    }
}
