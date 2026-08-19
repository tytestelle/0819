package O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00;

import java.io.IOException;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo implements O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00 {

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public static final O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo f1708O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final long f1709O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O00000OOoOOO00O00o0ooooooooO000ooooO0000 f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    static {
        Properties properties = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.f1967O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        f1708O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo.class.getName());
    }

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000) {
        this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OOoOOO00O00o0ooooooooO000ooooO0000;
        this.f1709O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = System.currentTimeMillis();
    }

    @Override // O0000oo0o0oooOO0O00oooOOoO0oOoOoOo000o00.O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00
    public void O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(long j) {
        O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = f1708O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000 = this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        try {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo("onIdleExpired {}ms {} {}", Long.valueOf(j), this, o00000OOoOOO00O00o0ooooooooO000ooooO0000);
            if (o00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO() || o00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0()) {
                o00000OOoOOO00O00o0ooooooooO000ooooO0000.close();
            } else {
                o00000OOoOOO00O00o0ooooooooO000ooooO0000.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO();
            }
        } catch (IOException e) {
            ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e);
            try {
                o00000OOoOOO00O00o0ooooooooO000ooooO0000.close();
            } catch (IOException e2) {
                ((O000O000OOooOO00OoOooooOOo0o00O00ooO0oo0.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0) o000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo).O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O(e2);
            }
        }
    }

    public String toString() {
        return String.format("%s@%x", getClass().getSimpleName(), Integer.valueOf(hashCode()));
    }

    public O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo(O00000OOoOOO00O00o0ooooooooO000ooooO0000 o00000OOoOOO00O00o0ooooooooO000ooooO0000, long j) {
        this.f1710O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000OOoOOO00O00o0ooooooooO000ooooO0000;
        this.f1709O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = j;
    }
}
