package com.google.common.base;

import java.util.Collections;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public final class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO extends O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o {
    static final O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO INSTANCE = new O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return INSTANCE;
    }

    public static <T> O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o withType() {
        return INSTANCE;
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    public Set<Object> asSet() {
        return Collections.emptySet();
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    public boolean equals(@CheckForNull Object obj) {
        return obj == this;
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    public Object get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    public boolean isPresent() {
        return false;
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    public Object or(Object obj) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj, "use Optional.orNull() instead of Optional.or(null)");
        return obj;
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    @CheckForNull
    public Object orNull() {
        return null;
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    public String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    public <V> O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o transform(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.getClass();
        return O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.absent();
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    public Object or(O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) {
        Object obj = o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.get();
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj, "use Optional.orNull() instead of a Supplier that returns null");
        return obj;
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    public O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o or(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) {
        o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.getClass();
        return o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o;
    }
}
