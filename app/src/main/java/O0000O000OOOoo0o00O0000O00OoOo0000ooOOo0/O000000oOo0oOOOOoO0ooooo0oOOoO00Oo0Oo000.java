package O0000O000OOOoo0o00O0000O00OoOo0000ooOOo0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 {
    public static final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 CLEARED;
    public static final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 COMPLETE;
    public static final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 FAILED;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000[] f740O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    public static final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 PENDING;
    public static final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 RUNNING;
    public static final O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 WAITING_FOR_SIZE;

    static {
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000("PENDING", 0);
        PENDING = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001 = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.RUNNING, 1);
        RUNNING = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002 = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000("WAITING_FOR_SIZE", 2);
        WAITING_FOR_SIZE = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo003 = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000("COMPLETE", 3);
        COMPLETE = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo003;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo004 = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(org.eclipse.jetty.util.component.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.FAILED, 4);
        FAILED = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo004;
        O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo005 = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000("CLEARED", 5);
        CLEARED = o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo005;
        f740O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000[]{o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo001, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo002, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo003, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo004, o000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo005};
    }

    public static O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 valueOf(String str) {
        return (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) Enum.valueOf(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.class, str);
    }

    public static O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000[] values() {
        return (O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000[]) f740O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.clone();
    }
}
