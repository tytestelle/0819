package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class O000Oo0O0Ooo0OOoO0O0o000OO00o00oOo0OOooo implements Iterator {
    public static final O000Oo0O0Ooo0OOoO0O0o000OO00o00oOo0OOooo INSTANCE;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public static final /* synthetic */ O000Oo0O0Ooo0OOoO0O0o000OO00o00oOo0OOooo[] f3564O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    static {
        O000Oo0O0Ooo0OOoO0O0o000OO00o00oOo0OOooo o000Oo0O0Ooo0OOoO0O0o000OO00o00oOo0OOooo = new O000Oo0O0Ooo0OOoO0O0o000OO00o00oOo0OOooo("INSTANCE", 0);
        INSTANCE = o000Oo0O0Ooo0OOoO0O0o000OO00o00oOo0OOooo;
        f3564O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = new O000Oo0O0Ooo0OOoO0O0o000OO00o00oOo0OOooo[]{o000Oo0O0Ooo0OOoO0O0o000OO00o00oOo0OOooo};
    }

    public static O000Oo0O0Ooo0OOoO0O0o000OO00o00oOo0OOooo valueOf(String str) {
        return (O000Oo0O0Ooo0OOoO0O0o000OO00o00oOo0OOooo) Enum.valueOf(O000Oo0O0Ooo0OOoO0O0o000OO00o00oOo0OOooo.class, str);
    }

    public static O000Oo0O0Ooo0OOoO0O0o000OO00o00oOo0OOooo[] values() {
        return (O000Oo0O0Ooo0OOoO0O0o000OO00o00oOo0OOooo[]) f3564O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.clone();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        O0000OOoOoo0oO0oooO0oo0Oo00o00oOOo0O0OOo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(false);
    }
}
