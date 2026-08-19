package O0000oO0oOoo0Oo00o0oo00oo0Oo0ooOOo0o0oO0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final Integer f1671O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    static {
        Integer num;
        Integer num2 = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            num = obj instanceof Integer ? (Integer) obj : null;
        } catch (Throwable unused) {
        }
        if (num != null && num.intValue() > 0) {
            num2 = num;
        }
        f1671O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = num2;
    }
}
