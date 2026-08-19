package com.google.common.base;

import java.util.Collections;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public final class O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000 extends O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o {
    private static final long serialVersionUID = 0;
    private final Object reference;

    public O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(Object obj) {
        this.reference = obj;
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    public Set<Object> asSet() {
        return Collections.singleton(this.reference);
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    public boolean equals(@CheckForNull Object obj) {
        if (obj instanceof O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000) {
            return this.reference.equals(((O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000) obj).reference);
        }
        return false;
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    public Object get() {
        return this.reference;
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    public boolean isPresent() {
        return true;
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    public Object or(Object obj) {
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.reference;
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    public Object orNull() {
        return this.reference;
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    public String toString() {
        return "Optional.of(" + this.reference + ")";
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    public <V> O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o transform(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo) {
        Object objApply = o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.apply(this.reference);
        org.eclipse.jetty.util.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(objApply, "the Function passed to Optional.transform() must not return null.");
        return new O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(objApply);
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    public O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o or(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o) {
        o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o.getClass();
        return this;
    }

    @Override // com.google.common.base.O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o
    public Object or(O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O) {
        o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O.getClass();
        return this.reference;
    }
}
