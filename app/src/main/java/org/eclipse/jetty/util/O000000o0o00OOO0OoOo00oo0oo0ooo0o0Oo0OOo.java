package org.eclipse.jetty.util;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public String f4450O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public String f4451O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public SimpleDateFormat f4452O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public String f4453O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public SimpleDateFormat f4454O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public String f4455O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public String f4456O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public String f4457O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    /* JADX INFO: renamed from: O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0, reason: collision with root package name */
    public long f4458O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0;

    /* JADX INFO: renamed from: O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO, reason: collision with root package name */
    public long f4459O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;

    /* JADX INFO: renamed from: O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O, reason: collision with root package name */
    public int f4460O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

    /* JADX INFO: renamed from: O000000oooOoo00ooo0O0000000o00O0Oooo0OOO, reason: collision with root package name */
    public String f4461O000000oooOoo00ooo0O0000000o00O0Oooo0OOO;

    /* JADX INFO: renamed from: O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo, reason: collision with root package name */
    public Locale f4462O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo;

    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        if (this.f4451O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.indexOf("ss.SSS") >= 0) {
            throw new IllegalStateException("ms not supported");
        }
        int iIndexOf = this.f4451O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.indexOf("ss");
        this.f4453O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O0000O000O000oo0Ooo0oOOOO0OOooOoO0OooO0o(this.f4451O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.substring(0, iIndexOf), "'ss'", this.f4451O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.substring(iIndexOf + 2));
    }

    public final synchronized void O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(TimeZone timeZone) {
        try {
            O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(timeZone);
            if (this.f4462O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo != null) {
                this.f4452O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new SimpleDateFormat(this.f4451O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this.f4462O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
                this.f4454O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new SimpleDateFormat(this.f4453O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, this.f4462O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo);
            } else {
                this.f4452O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new SimpleDateFormat(this.f4451O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
                this.f4454O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = new SimpleDateFormat(this.f4453O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo);
            }
            this.f4452O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.setTimeZone(timeZone);
            this.f4454O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.setTimeZone(timeZone);
            this.f4459O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = -1L;
            this.f4458O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0 = -1L;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(TimeZone timeZone) {
        try {
            int iIndexOf = this.f4450O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.indexOf("ZZZ");
            if (iIndexOf >= 0) {
                String strSubstring = this.f4450O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.substring(0, iIndexOf);
                String strSubstring2 = this.f4450O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.substring(iIndexOf + 3);
                int rawOffset = timeZone.getRawOffset();
                StringBuilder sb = new StringBuilder(this.f4450O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.length() + 10);
                sb.append(strSubstring);
                sb.append("'");
                if (rawOffset >= 0) {
                    sb.append('+');
                } else {
                    rawOffset = -rawOffset;
                    sb.append('-');
                }
                int i = rawOffset / 60000;
                int i2 = i / 60;
                int i3 = i % 60;
                if (i2 < 10) {
                    sb.append('0');
                }
                sb.append(i2);
                if (i3 < 10) {
                    sb.append('0');
                }
                sb.append(i3);
                sb.append('\'');
                sb.append(strSubstring2);
                this.f4451O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = sb.toString();
            } else {
                this.f4451O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = this.f4450O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            }
            O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO();
        } catch (Throwable th) {
            throw th;
        }
    }
}
