package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o {
    public static String O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(FunctionBase functionBase) {
        String string = functionBase.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
