package kotlin.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 {
    public static void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(int i, Object obj) {
        int arity;
        if (obj != null) {
            if (obj instanceof O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
                if (obj instanceof FunctionBase) {
                    arity = ((FunctionBase) obj).getArity();
                } else if (obj instanceof Function0) {
                    arity = 0;
                } else if (obj instanceof Function1) {
                    arity = 1;
                } else if (obj instanceof Function2) {
                    arity = 2;
                } else if (obj instanceof Function3) {
                    arity = 3;
                } else if (obj instanceof Function4) {
                    arity = 4;
                } else if (obj instanceof Function5) {
                    arity = 5;
                } else if (obj instanceof Function6) {
                    arity = 6;
                } else if (obj instanceof Function7) {
                    arity = 7;
                } else if (obj instanceof Function8) {
                    arity = 8;
                } else if (obj instanceof Function9) {
                    arity = 9;
                } else if (obj instanceof Function10) {
                    arity = 10;
                } else if (obj instanceof Function11) {
                    arity = 11;
                } else if (obj instanceof Function12) {
                    arity = 12;
                } else if (obj instanceof Function13) {
                    arity = 13;
                } else if (obj instanceof Function14) {
                    arity = 14;
                } else if (obj instanceof Function15) {
                    arity = 15;
                } else if (obj instanceof Function16) {
                    arity = 16;
                } else if (obj instanceof Function17) {
                    arity = 17;
                } else if (obj instanceof Function18) {
                    arity = 18;
                } else if (obj instanceof Function19) {
                    arity = 19;
                } else if (obj instanceof Function20) {
                    arity = 20;
                } else if (obj instanceof Function21) {
                    arity = 21;
                } else {
                    arity = obj instanceof Function22 ? 22 : -1;
                }
                if (arity == i) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(obj.getClass().getName(), " cannot be cast to ", O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(i, "kotlin.jvm.functions.Function")));
            O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(classCastException, O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0.class.getName());
            throw classCastException;
        }
    }
}
