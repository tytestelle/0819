package kotlinx.coroutines;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo {
    public static final O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo ATOMIC;
    public static final O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo DEFAULT;
    public static final O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo LAZY;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo[] f4066O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    public static final O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo UNDISPATCHED;

    static {
        O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo = new O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("DEFAULT", 0);
        DEFAULT = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo;
        O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2 = new O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("LAZY", 1);
        LAZY = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2;
        O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3 = new O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("ATOMIC", 2);
        ATOMIC = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3;
        O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo4 = new O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo("UNDISPATCHED", 3);
        UNDISPATCHED = o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo4;
        f4066O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo[]{o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo, o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo2, o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo3, o00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo4};
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    public static O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo valueOf(String str) {
        return (O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo) Enum.valueOf(O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo.class, str);
    }

    public static O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo[] values() {
        return (O00000oO00OOooo000ooOOoOoOO0Oo0oOOOOoooo[]) f4066O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.clone();
    }

    public final <T> void invoke(Function1<? super kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, ? extends Object> function1, kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 completion) {
        int i = O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f4065O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[ordinal()];
        O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO = O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (i == 1) {
            try {
                kotlinx.coroutines.internal.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(function1, completion)), O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(o000000oooOoo00ooo0O0000000o00O0Oooo0OOO), null);
                return;
            } catch (Throwable th) {
                completion.resumeWith(O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(th)));
                throw th;
            }
        }
        if (i == 2) {
            kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(function1, "<this>");
            kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(completion, "completion");
            com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO(function1, completion)).resumeWith(O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(o000000oooOoo00ooo0O0000000o00O0Oooo0OOO));
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
            }
            return;
        }
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(completion, "completion");
        try {
            kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo context = completion.getContext();
            Object objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = kotlinx.coroutines.internal.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(context, null);
            try {
                kotlin.jvm.internal.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(1, function1);
                Object objInvoke = function1.invoke(completion);
                kotlinx.coroutines.internal.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(context, objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                if (objInvoke != kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.COROUTINE_SUSPENDED) {
                    completion.resumeWith(O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(objInvoke));
                }
            } catch (Throwable th2) {
                kotlinx.coroutines.internal.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(context, objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                throw th2;
            }
        } catch (Throwable th3) {
            completion.resumeWith(O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(th3)));
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R, T> void invoke(Function2<? super R, ? super kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, ? extends Object> function2, R r, kotlin.coroutines.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 completion) {
        int i = O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000.f4065O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO[ordinal()];
        if (i == 1) {
            O0000O0o00oO0oO0OOo0oOOOO0oOO0ooo00o000o.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0(function2, r, completion);
            return;
        }
        if (i == 2) {
            kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(function2, "<this>");
            kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(completion, "completion");
            com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(com.bumptech.glide.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(function2, r, completion)).resumeWith(O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO.f1665O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO));
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo();
            }
            return;
        }
        kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(completion, "completion");
        try {
            kotlin.coroutines.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo context = completion.getContext();
            Object objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = kotlinx.coroutines.internal.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(context, null);
            try {
                kotlin.jvm.internal.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(2, function2);
                Object objInvoke = function2.invoke(r, completion);
                kotlinx.coroutines.internal.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(context, objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                if (objInvoke != kotlin.coroutines.intrinsics.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.COROUTINE_SUSPENDED) {
                    completion.resumeWith(O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(objInvoke));
                }
            } catch (Throwable th) {
                kotlinx.coroutines.internal.O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(context, objO000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                throw th;
            }
        } catch (Throwable th2) {
            completion.resumeWith(O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.m1constructorimpl(O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(th2)));
        }
    }
}
