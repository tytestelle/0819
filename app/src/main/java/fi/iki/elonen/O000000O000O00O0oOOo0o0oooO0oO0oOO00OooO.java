package fi.iki.elonen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO {

    /* JADX INFO: renamed from: O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0, reason: collision with root package name */
    public static final Pattern f3938O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);

    /* JADX INFO: renamed from: O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO, reason: collision with root package name */
    public static final Pattern f3939O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    /* JADX INFO: renamed from: O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000, reason: collision with root package name */
    public static final Pattern f3940O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000 = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final String f3941O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final String f3942O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    /* JADX INFO: renamed from: O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o, reason: collision with root package name */
    public final String f3943O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;

    /* JADX INFO: renamed from: O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo, reason: collision with root package name */
    public final String f3944O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo;

    public O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(String str) {
        this.f3941O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = str;
        if (str != null) {
            Matcher matcher = f3938O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0.matcher(str);
            this.f3942O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f3939O000000oO0OOo0O00OoooOOoOO0o0o0000O0OOoO.matcher(str);
            this.f3943O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = matcher2.find() ? matcher2.group(2) : null;
        } else {
            this.f3942O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = "";
            this.f3943O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o = "UTF-8";
        }
        if (!"multipart/form-data".equalsIgnoreCase(this.f3942O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO)) {
            this.f3944O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = null;
        } else {
            Matcher matcher3 = f3940O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000.matcher(str);
            this.f3944O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo = matcher3.find() ? matcher3.group(2) : null;
        }
    }

    public final String O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        String str = this.f3943O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o;
        return str == null ? "US-ASCII" : str;
    }
}
