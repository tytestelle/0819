package com.google.common.base;

import java.io.Serializable;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o implements Serializable {
    private static final long serialVersionUID = 0;

    public static <T> O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o absent() {
        return O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.withType();
    }

    public static <T> O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o fromNullable(@CheckForNull T t) {
        return t == null ? absent() : new O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(t);
    }

    public static <T> O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o of(T t) {
        t.getClass();
        return new O00000o0ooOoO0oO0Oo0O0Oo00O00OOooooo0000(t);
    }

    public static <T> Iterable<T> presentInstances(Iterable<? extends O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o> iterable) {
        iterable.getClass();
        return new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00.O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O(iterable, 1);
    }

    public abstract Set<Object> asSet();

    public abstract boolean equals(@CheckForNull Object obj);

    public abstract Object get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o or(O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o o00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o);

    public abstract Object or(O00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O o00000oOOOooooo0ooO0O0OO0o00o0OooOOOo00O);

    public abstract Object or(Object obj);

    @CheckForNull
    public abstract Object orNull();

    public abstract String toString();

    public abstract <V> O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o transform(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo o00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
}
