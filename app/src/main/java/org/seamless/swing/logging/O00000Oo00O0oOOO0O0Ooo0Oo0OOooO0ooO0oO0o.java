package org.seamless.swing.logging;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final Level f4506O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Long f4507O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = Long.valueOf(new Date().getTime());

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final String f4508O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = Thread.currentThread().getName();

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final String f4509O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public final String f4510O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    public O00000Oo00O0oOOO0O0Ooo0Oo0OOooO0ooO0oO0o(Level level, String str, String str2) {
        this.f4506O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = level;
        this.f4509O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = str;
        this.f4510O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = str2;
    }

    public final Long O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return this.f4507O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    public final Level O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO() {
        return this.f4506O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
    }

    public final String O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        return this.f4510O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }

    public final String O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        return this.f4509O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
    }

    public final String O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0() {
        return this.f4508O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
    }

    public final String toString() {
        return this.f4506O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO + " - " + new SimpleDateFormat("HH:mm:ss:SSS").format(new Date(this.f4507O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.longValue())) + " - " + this.f4508O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o + " : " + this.f4509O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo + " : " + this.f4510O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
    }
}
