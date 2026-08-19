package O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo;

import O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import java.util.ResourceBundle;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO extends O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 f1662O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public boolean f1663O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    static {
        ResourceBundle.getBundle("javax.servlet.http.LocalStrings");
    }

    @Override // O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        return this.f1662O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
    }

    @Override // O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final void O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(String str, String str2) {
        super.O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(str, str2);
        if ("content-length".equalsIgnoreCase(str)) {
            this.f1663O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = true;
        }
    }

    @Override // O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo.O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, O0000o0oO000o0OO00oOoOOO0OOOO0ooOO000oOO.O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo
    public final void O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(int i) {
        super.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo(i);
        this.f1663O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = true;
    }

    @Override // O0000o0oO00ooo0OO000oOooo0OOOo000O0000Oo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o
    public final void O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(String str, String str2) {
        this.f1659O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O000000ooO00OO0OoOO0OO0o00000oo000oo0oO0(RtspHeaders.ALLOW, str2);
    }
}
