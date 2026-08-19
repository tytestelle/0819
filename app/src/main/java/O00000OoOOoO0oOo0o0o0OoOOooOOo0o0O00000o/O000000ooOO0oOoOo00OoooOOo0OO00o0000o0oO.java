package O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO implements O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo {

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 f486O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final URL f487O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final String f488O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public String f489O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0;

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public URL f490O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public volatile byte[] f491O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000;

    /* JADX INFO: renamed from: O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo, reason: collision with root package name */
    public int f492O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;

    public O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(URL url) {
        O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f493O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(url, "Argument must not be null");
        this.f487O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = url;
        this.f488O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o00000O00oOOo000000OOOo00OOOo0OooOO00OO0, "Argument must not be null");
        this.f486O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final void O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(MessageDigest messageDigest) {
        if (this.f491O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 == null) {
            this.f491O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o().getBytes(O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.f184O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO);
        }
        messageDigest.update(this.f491O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000);
    }

    public final String O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o() {
        String str = this.f488O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
        if (str != null) {
            return str;
        }
        URL url = this.f487O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(url, "Argument must not be null");
        return url.toString();
    }

    public final URL O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo() {
        if (this.f490O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO == null) {
            if (TextUtils.isEmpty(this.f489O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0)) {
                String string = this.f488O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f487O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
                    O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f489O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f490O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = new URL(this.f489O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0);
        }
        return this.f490O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO;
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final boolean equals(Object obj) {
        if (!(obj instanceof O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO)) {
            return false;
        }
        O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO = (O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO) obj;
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o().equals(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o()) && this.f486O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.equals(o000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO.f486O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO);
    }

    @Override // O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public final int hashCode() {
        if (this.f492O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo == 0) {
            int iHashCode = O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o().hashCode();
            this.f492O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = iHashCode;
            this.f492O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo = this.f486O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.f497O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.hashCode() + (iHashCode * 31);
        }
        return this.f492O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo;
    }

    public final String toString() {
        return O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o();
    }

    public O000000ooOO0oOoOo00OoooOOo0OO00o0000o0oO(String str) {
        O00000O00oOOo000000OOOo00OOOo0OooOO00OO0 o00000O00oOOo000000OOOo00OOOo0OooOO00OO0 = O000000ooo0oOOoOo00ooOOOOooOoooOoo0oo00O.f493O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;
        this.f487O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = null;
        if (!TextUtils.isEmpty(str)) {
            this.f488O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = str;
            O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(o00000O00oOOo000000OOOo00OOOo0OooOO00OO0, "Argument must not be null");
            this.f486O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = o00000O00oOOo000000OOOo00OOOo0OooOO00OO0;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
