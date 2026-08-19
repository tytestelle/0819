package O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo implements Serializable {
    public static final O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO Companion = new O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO();
    private final Object value;

    public /* synthetic */ O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(Object obj) {
        this.value = obj;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo m0boximpl(Object obj) {
        return new O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) && kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj, ((O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) obj2).m9unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3equalsimpl0(Object obj, Object obj2) {
        return kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(obj, obj2);
    }

    /* JADX INFO: renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m4exceptionOrNullimpl(Object obj) {
        if (obj instanceof O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            return ((O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) obj).exception;
        }
        return null;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m5hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m6isFailureimpl(Object obj) {
        return obj instanceof O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
    }

    /* JADX INFO: renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m7isSuccessimpl(Object obj) {
        return !(obj instanceof O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m8toStringimpl(Object obj) {
        if (obj instanceof O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) {
            return ((O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m2equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5hashCodeimpl(this.value);
    }

    public String toString() {
        return m8toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m9unboximpl() {
        return this.value;
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m1constructorimpl(Object obj) {
        return obj;
    }
}
