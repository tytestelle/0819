package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o f4007O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    static {
        O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = null;
        try {
            o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = (O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o == null) {
            o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o = new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o();
        }
        f4007O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;
    }
}
