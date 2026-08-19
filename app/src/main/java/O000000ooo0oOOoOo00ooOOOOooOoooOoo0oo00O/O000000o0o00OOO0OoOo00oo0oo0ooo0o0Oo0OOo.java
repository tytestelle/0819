package O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final String f107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final long[] f108O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final File[] f109O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final File[] f110O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public boolean f111O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o f112O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public final /* synthetic */ O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f113O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, String str) {
        this.f113O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;
        this.f107O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = str;
        int i = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f120O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;
        this.f108O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new long[i];
        this.f109O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = new File[i];
        this.f110O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f120O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000; i2++) {
            sb.append(i2);
            File[] fileArr = this.f109O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
            String string = sb.toString();
            File file = o000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.f114O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
            fileArr[i2] = new File(file, string);
            sb.append(".tmp");
            this.f110O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.f108O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
