package org.eclipse.jetty.servlet;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 implements O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f4402O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final /* synthetic */ O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo f4403O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo) {
        this.f4403O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
        this.f4402O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
    }

    public final O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Class cls) throws O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 {
        O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this.f4403O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        try {
            O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = (O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO) cls.newInstance();
            int size = o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.size() - 1;
            if (size < 0) {
                return o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
            }
            if (o000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O00000oOOOoo00o0OOoooOo0O0o0o0o0oO00oO0O.get(size) == null) {
                throw null;
            }
            throw new ClassCastException();
        } catch (IllegalAccessException e) {
            throw new O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(e);
        } catch (InstantiationException e2) {
            throw new O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(e2);
        }
    }

    public final synchronized Enumeration O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        HashSet hashSet;
        try {
            hashSet = new HashSet();
            com.bumptech.glide.O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = this.f4402O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1951O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;
            if (o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO != null) {
                Enumeration enumeration = Collections.enumeration(o000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.f2837O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.keySet());
                while (enumeration.hasMoreElements()) {
                    hashSet.add(enumeration.nextElement());
                }
            }
            Enumeration enumeration2 = Collections.enumeration(this.f4402O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.f1950O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f2837O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.keySet());
            while (enumeration2.hasMoreElements()) {
                hashSet.add(enumeration2.nextElement());
            }
        } catch (Throwable th) {
            throw th;
        }
        return Collections.enumeration(hashSet);
    }

    public final String toString() {
        return "ServletContext@" + this.f4402O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.toString();
    }
}
