package org.eclipse.jetty.http;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO implements Enumeration {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 f4283O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f4283O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO != null;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = this.f4283O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        if (o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 == null) {
            throw new NoSuchElementException();
        }
        this.f4283O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f4289O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        return O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o000000ooO00OO0OoOO0OO0o00000oo000oo0oO0.f4288O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
    }
}
