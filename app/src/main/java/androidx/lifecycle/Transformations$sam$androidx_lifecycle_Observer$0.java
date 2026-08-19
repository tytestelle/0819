package androidx.lifecycle;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public final class Transformations$sam$androidx_lifecycle_Observer$0 implements Observer, kotlin.jvm.internal.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO {
    private final /* synthetic */ Function1 function;

    public Transformations$sam$androidx_lifecycle_Observer$0(Function1 function) {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO)) {
            return O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(getFunctionDelegate(), ((kotlin.jvm.internal.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO
    public final O0000oO0O0O0OOOO0o0o00o0ooO0OOOoO00OoOo0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
