package O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0 implements O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0, O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo {

    /* JADX INFO: renamed from: O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO, reason: collision with root package name */
    public final /* synthetic */ int f477O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO;

    /* JADX INFO: renamed from: O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, reason: collision with root package name */
    public final Context f478O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;

    public /* synthetic */ O000000o0ooOOOOoO0OO0000OOOoo0oo0OOOOoo0(Context context, int i) {
        this.f477O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO = i;
        this.f478O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO = context;
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public Class O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO() {
        return Drawable.class;
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public Object O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Resources resources, int i, Resources.Theme theme) {
        Context context = this.f478O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO;
        return com.bumptech.glide.O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o.O000000oOo0oOOOOoO0ooooo0oOOoO00Oo0Oo000(context, context, i, theme);
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O000000oOoo00OOooOoOOoO000Oo0OoO0o0OOooo
    public /* bridge */ /* synthetic */ void O000000OoooOoo0Ooo0OO00o00oOOo0O0ooooO0o(Object obj) {
    }

    @Override // O00000OoOOoO0oOo0o0o0OoOOooOOo0o0O00000o.O00000o00OOOOo0o00Oo00OooOoooOO0OOOoOoo0
    public final O00000OoOOoOoOOoo0oOoOoOOO0OooOoO0oOo0o0 O00000O00oOOo000000OOOo00OOOo0OooOO00OO0(O00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO) {
        switch (this.f477O0000000Oo0o0O00ooOooooooO0000Oo0oO0O0oO) {
            case 0:
                return new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f478O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, this);
            case 1:
                return new O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(this.f478O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, o00000oo0O0Oo0OO0oOoOoOOOOoOOoo0oOoOOOoO.O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO(Integer.class, InputStream.class));
            default:
                return new O00000OOoOOO00O00o0ooooooooO000ooooO0000(this.f478O000000O000O00O0oOOo0o0oooO0oO0oOO00OooO, 1);
        }
    }
}
