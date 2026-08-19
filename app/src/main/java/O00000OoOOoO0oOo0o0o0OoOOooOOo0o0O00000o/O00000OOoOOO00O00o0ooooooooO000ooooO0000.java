package O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class O00000OOoOOO00O00o0ooooooooO000ooooO0000 implements O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f503O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Context f504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public O00000OOoOOO00O00o0ooooooooO000ooooO0000(Context context, int i) {
        this.f503O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        switch (i) {
            case 1:
                this.f504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = context.getApplicationContext();
                break;
            case 2:
                this.f504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = context.getApplicationContext();
                break;
            default:
                this.f504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = context;
                break;
        }
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final boolean O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(Object obj) {
        switch (this.f503O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return O0000OOoooO00oooOoOO0OoO0O0000o0O0OOoO00.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO.O00000OOoOOoOOOo00oo0000O00ooo0oO00O00oO(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0
    public final O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Object obj, int i, int i2, O00000O000oo0oO0OOOoooo00ooOOOO0o0Ooo0Oo.O000000oooOoo00ooo0O0000000o00O0Oooo0OOO o000000oooOoo00ooo0O0000000o00O0Oooo0OOO) {
        Long l;
        switch (this.f503O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                Uri uri = (Uri) obj;
                return new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(uri), new O00000OO000O000Oo0000oOOo0OO0oOoo0o0oo00(this.f504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, uri, 0));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(uri2);
                Context context = this.f504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                return new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(context, uri2, new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) o000000oooOoo00ooo0O0000000o00O0Oooo0OOO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(O00000o0oO0O0o0Oo0Oo0O0Oo0o0O0oOooOoOO0O.O0000O0OOoo00o0Oo0ooOOo0o0oOooooOOO00000.f635O000000o0o00OOO0OoOo00oo0oo0ooo0o0Oo0OOo)) == null || l.longValue() != -1) {
                    return null;
                }
                O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2 = new O0000O0O0Ooo0O0ooOo0oOOOO000o0O0OOo0Oo0o.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(uri3);
                Context context2 = this.f504O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
                return new O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o(o000000O000O00O0oOOo0o0oooO0oO0oOO00OooO2, O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(context2, uri3, new O00000O00oOOo000000OOOo00OOOo0OooOO00OO0.O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO(context2.getContentResolver(), 1)));
        }
    }
}
